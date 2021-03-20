package com.colt.ccam.armor;

import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class LongSmallTophatArmormItem extends ArmorItem implements IDyeableArmorItem {

    public LongSmallTophatArmormItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
            EquipmentSlotType armorSlot, A _default) {
        return ColtCosmeticArmorMod.SIDED_SYSTEM.getLongSmallTopHatArmorModel(armorSlot);
    }

    public int getColor(ItemStack stack) {
        CompoundNBT lvt_2_1_ = stack.getChildTag("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0X9B2D2A;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("This length is realy unesesery."));
    }
}
