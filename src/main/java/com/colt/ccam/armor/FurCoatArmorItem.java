package com.colt.ccam.armor;

import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;

import com.colt.ccam.itemgroup.ccamItemGroup;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.nbt.CompoundTag;


public class FurCoatArmorItem extends ArmorItem {
	
	public FurCoatArmorItem(ArmorMaterial materialIn, EquipmentSlot slot ) {
		super(materialIn, slot,  new Item.Properties().tab(ccamItemGroup.CCAM_TAB));
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
		consumer.accept((net.minecraftforge.client.IItemRenderProperties) ColtCosmeticArmorMod.SIDED_SYSTEM.getArmorRenderProperties());
	}
}