package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.render.entity.model.TopHatModel;
import com.colt.ccam.curio.CurioArmorItem;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TopHatArmorItem extends CurioArmorItem implements IDyeableArmorItem {

    private static final ResourceLocation TEXTURE_OVERLAY = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
            "textures/models/armor/tophat_layer_1_overlay.png");
    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
            "textures/models/armor/tophat_layer_1.png");

    public TopHatArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
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
    @OnlyIn(Dist.CLIENT)
    protected BipedModel<LivingEntity> createModel() {
        return new TopHatModel(1f);
    }

    @Override
    protected ResourceLocation getTexture() {
        return TEXTURE_OVERLAY;
    }
}
