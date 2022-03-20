package com.colt.ccam.intergration.curio.render.model;

import java.util.ArrayList;
import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class DyableCurioRenderer extends CurioRender {

    private int color = 0xffffff;

    public int getColor() {
        return this.color;
    }

    public DyableCurioRenderer(String texturePath, HumanoidModel<LivingEntity> model) {
        super(new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
                String.format("textures/models/curio/%s.png", texturePath)), model);
    }

    public DyableCurioRenderer(String texturePath, HumanoidModel<LivingEntity> model, int color) {
        super(new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
                String.format("textures/models/curio/%s.png", texturePath)), model);

        this.color = (color != 0) ? color : 0xffffff;
    }

    public List<Float> colors(ItemStack stack) {
        List<Float> colors = new ArrayList<Float>();
        CompoundTag lvt_2_1_ = stack.getTagElement("display");
        int color = lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : this.color;
        colors.add(((color >> 16) & 0xff) / 255.0f); // red
        colors.add(((color >> 8) & 0xff) / 255.0f); // green
        colors.add(((color) & 0xff) / 255.0f); // blue
        colors.add(((color >> 24) & 0xff) / 255.0f); // alpha
        return colors;
    }

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(
            ItemStack stack,
            SlotContext slotContext,
            PoseStack poseStack,
            RenderLayerParent<T, M> renderLayerParent,
            MultiBufferSource multiBufferSource,
            int light,
            float limbSwing,
            float limbSwingAmount,
            float partialTicks,
            float ageInTicks,
            float netHeadYaw,
            float headPitch) {
        HumanoidModel<LivingEntity> model = getModel();

        model.setupAnim(slotContext.entity(), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        model.prepareMobModel(slotContext.entity(), limbSwing, limbSwingAmount, partialTicks);
        ICurioRenderer.followBodyRotations(slotContext.entity(), model);
        render(poseStack, multiBufferSource, light, stack.hasFoil(), colors(stack)/* colors */);
    }

    protected void render(PoseStack matrixStack, MultiBufferSource buffer, int light, boolean hasFoil,
            List<Float> colors) {
        HumanoidModel<LivingEntity> model = getModel();
        RenderType renderType = model.renderType(getTexture());
        VertexConsumer vertexBuilder = ItemRenderer.getFoilBuffer(buffer, renderType, false, hasFoil);

        model.renderToBuffer(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, colors.get(0), colors.get(1),
                colors.get(2), 1);
    }

}
