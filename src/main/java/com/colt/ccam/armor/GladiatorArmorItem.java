package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;

import com.colt.ccam.itemgroup.ccamItemGroup;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.nbt.CompoundTag;


public class GladiatorArmorItem extends ArmorItem implements DyeableLeatherItem {
	
	public GladiatorArmorItem(ArmorMaterial materialIn, EquipmentSlot slot ) {
		super(materialIn, slot,  new Item.Properties().tab(ccamItemGroup.CCAM_TAB));
	}

	@Override
	public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
		consumer.accept((net.minecraftforge.client.IItemRenderProperties) ColtCosmeticArmorMod.SIDED_SYSTEM.getArmorRenderProperties());
	}

	public int getColor(ItemStack stack) {
		CompoundTag lvt_2_1_ = stack.getTagElement("display");
		return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0XFf0000;
	}
} 
