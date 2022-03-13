package com.colt.ccam.itemgroup;

import com.colt.ccam.registries.ccamItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;



public class ccamItemGroup extends  CreativeModeTab {

    
    public static final ccamItemGroup CCAM_TAB = new ccamItemGroup(TABS.length, "ccamTab");

    
        public ccamItemGroup(int index, String label) {
            super(index, label);
    }

    @Override
        public ItemStack makeIcon() {
            return new ItemStack(ccamItems.TOP_TOP_TOP_HAT.get());
        }
    
}
