package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class BasicArmorItem extends ArmorItem implements IDyeableArmorItem {

    public BasicArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }
    
    @Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
			EquipmentSlotType armorSlot, A _default) {
		return ColtCosmeticArmorMod.SIDED_SYSTEM.getBasicArmorModel(armorSlot);
	}

    public int getColor(ItemStack stack) {
        CompoundNBT lvt_2_1_ = stack.getChildTag("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0XF1F6FC;
    }
    
}
