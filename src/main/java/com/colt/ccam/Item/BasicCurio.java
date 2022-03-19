
package com.colt.ccam.Item;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.intergration.curio.CurioItem;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;


public class BasicCurio extends CurioItem implements DyeableLeatherItem {

    public int getColor(ItemStack stack) {
        CompoundTag lvt_2_1_ = stack.getTagElement("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0X553917;
    }
    @Override
    public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
        consumer.accept((net.minecraftforge.client.IItemRenderProperties) ColtCosmeticArmorMod.SIDED_SYSTEM.getArmorRenderProperties());
    }
}
