package com.colt.ccam.itemgroup;

import com.colt.ccam.registries.ccamItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ccamItemGroup extends ItemGroup {

    
    public static final ccamItemGroup CCAM_TAB = new ccamItemGroup(ItemGroup.GROUPS.length, "ccamTab");

    
        public ccamItemGroup(int index, String label) {
            super(index, label);
    }

    @Override
        public ItemStack createIcon() {
            return new ItemStack(ccamItems.COLT_HELMET.get());
        }
    
}
