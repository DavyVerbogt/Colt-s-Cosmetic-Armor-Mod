package com.colt.ccam.registries;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

import com.colt.ccam.itemgroup.ccamItemGroup;

public class ccamCurio extends Item {

    public ccamCurio(Properties properties) {
        super(properties.maxStackSize(1).group(ccamItemGroup.CCAM_TAB));
    }

    public ccamCurio() {
        this(new Properties());
    }
}