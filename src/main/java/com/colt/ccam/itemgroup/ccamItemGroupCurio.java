package com.colt.ccam.itemgroup;

import com.colt.ccam.registries.ccamItems;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ccamItemGroupCurio extends CreativeModeTab {

    
    public static final ccamItemGroupCurio CCAM_TAB_CURIO = new ccamItemGroupCurio(TABS.length, "ccamTabCurio");


        public ccamItemGroupCurio(int index, String label) {
            super(index, label);
    }

    @Override
        public ItemStack makeIcon() {
            return new ItemStack(ccamItems.TOP_TOP_TOP_HAT.get());
        }
    
}