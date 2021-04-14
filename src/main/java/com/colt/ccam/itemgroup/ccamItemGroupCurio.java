package com.colt.ccam.itemgroup;

import com.colt.ccam.registries.ccamItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ccamItemGroupCurio extends ItemGroup {

    
    public static final ccamItemGroupCurio CCAM_TAB_CURIO = new ccamItemGroupCurio(ItemGroup.GROUPS.length, "ccamTabCurio");

    
        public ccamItemGroupCurio(int index, String label) {
            super(index, label);
    }

    @Override
        public ItemStack createIcon() {
            return new ItemStack(ccamItems.CAT_EARS.get());
        }
    
}