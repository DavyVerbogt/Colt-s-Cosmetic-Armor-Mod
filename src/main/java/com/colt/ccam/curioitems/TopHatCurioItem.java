package com.colt.ccam.curioitems;

import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.render.entity.model.TopHatModel;
import com.colt.ccam.curio.CurioArmorItem;
import com.colt.ccam.curio.CurioItem;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.type.capability.ICurio;

public class TopHatCurioItem extends CurioArmorItem implements IDyeableArmorItem {

    private static final ResourceLocation TEXTURE_OVERLAY = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
            "textures/models/armor/tophat_curio.png");

    public TopHatCurioItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
            EquipmentSlotType armorSlot, A _default) {
        return ColtCosmeticArmorMod.SIDED_SYSTEM.getTopHatArmorModel(armorSlot);
    }

    public int getColor(ItemStack stack) {
        CompoundNBT lvt_2_1_ = stack.getChildTag("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0X9B2D2A;
    }

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
    @OnlyIn(Dist.CLIENT)
    protected BipedModel<LivingEntity> createModel() {
        return new TopHatModel(1f);
    }

    @Override
    protected ResourceLocation getTexture() {
        return TEXTURE_OVERLAY;
    }
}