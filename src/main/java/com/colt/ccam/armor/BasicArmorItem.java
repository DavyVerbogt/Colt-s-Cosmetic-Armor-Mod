package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;

import com.colt.ccam.itemgroup.ccamItemGroup;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.nbt.CompoundTag;

public class BasicArmorItem extends ArmorItem implements DyeableLeatherItem {

    public BasicArmorItem(ArmorMaterial materialIn, EquipmentSlot slot) {
        super(materialIn, slot, new Item.Properties().tab(ccamItemGroup.CCAM_TAB));
    }

    public int getColor(ItemStack stack) {
        CompoundTag lvt_2_1_ = stack.getTagElement("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0XF1F6FC;
    }
}