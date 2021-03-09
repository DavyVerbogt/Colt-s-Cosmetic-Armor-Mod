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

public class WitchHatArmorItem extends ArmorItem implements IDyeableArmorItem {

    public WitchHatArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }
    @Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		return ColtCosmeticArmorMod.SIDED_SYSTEM.getWitchArmorModel(armorSlot);
	}
    @Override
    public int getColor(ItemStack p_2008861) {
        CompoundNBT lvt_21 = p_2008861.getChildTag("display");
        return lvt_21 != null && lvt_21.contains("color", 99) ? lvt_21.getInt("color") : 0XFFFFFF;
    }
}
