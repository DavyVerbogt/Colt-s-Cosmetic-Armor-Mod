package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class TopHatArmorItem extends ArmorItem {

    public TopHatArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }
    @Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		return ColtCosmeticArmorMod.SIDED_SYSTEM.getTopHatArmorModel(armorSlot);
	}
}
