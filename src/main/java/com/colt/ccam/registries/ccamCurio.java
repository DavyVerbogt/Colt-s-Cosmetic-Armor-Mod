package com.colt.ccam.registries;

import net.minecraft.world.item.Item;

import com.colt.ccam.itemgroup.ccamItemGroup;

public class ccamCurio extends Item {

    public ccamCurio(Properties properties) {
        super(properties.stacksTo(1).tab(ccamItemGroup.CCAM_TAB));
    }

    public ccamCurio() {
        this(new Properties());
    }
}