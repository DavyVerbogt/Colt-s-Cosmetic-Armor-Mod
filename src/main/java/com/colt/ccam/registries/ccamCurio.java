package com.colt.ccam.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

import com.colt.ccam.itemgroup.ccamItemGroup;
import com.colt.ccam.itemgroup.ccamItemGroupCurio;

public class ccamCurio extends Item {

    public ccamCurio(Properties properties) {
        super(properties.stacksTo(1).tab(ccamItemGroupCurio.CCAM_TAB_CURIO));
    }

    public ccamCurio() {
        this(new Properties());
    }
}