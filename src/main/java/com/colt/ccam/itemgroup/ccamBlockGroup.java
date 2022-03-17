package com.colt.ccam.itemgroup;

import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ccamBlockGroup extends CreativeModeTab {

    public static final ccamBlockGroup CCAM_BLOCK_TAB = new ccamBlockGroup(TABS.length, "ccamTabBlock");


    public ccamBlockGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ccamBlocks.Sewing_Table.get());
    }

}