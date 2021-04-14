
package com.colt.ccam.Item;

import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.render.entity.model.curio.BasicCurioModel;
import com.colt.ccam.curio.CurioItem;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.type.capability.ICurio;


public class BasicCurio extends CurioItem implements IDyeableArmorItem{

    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/models/curio/basic_curio.png");



    @Override
    public void render(String identifier, int index, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer,
            int light, LivingEntity entity, float limbSwing, float limbSwingAmount, float partialTicks,
            float ageInTicks, float netHeadYaw, float headPitch, ItemStack stack) {
        BipedModel<LivingEntity> model = getModel();
        ICurio.RenderHelper.followBodyRotations(entity, model);
        IVertexBuilder vertexBuilder = ItemRenderer.getBuffer(renderTypeBuffer, model.getRenderType(getTexture()),
                false, stack.hasEffect());

        List<Float> colors = CurioItem.getColors(stack);
        model.render(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, colors.get(0), colors.get(1),
                colors.get(2), 1.0F);
    }

    @Override
    public int getColor(ItemStack stack) {
        CompoundNBT lvt_2_1_ = stack.getChildTag("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0X631D1B;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    protected BipedModel<LivingEntity> createModel() {
        return new BasicCurioModel(1f);
    }

    @Override
    protected ResourceLocation getTexture() {
        return TEXTURE;
    }
}
