package com.colt.ccam.util;

import com.colt.ccam.ColtCosmeticArmorMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BLOCKS = ItemTags.create(ResourceLocation.tryParse("ccam:blocks"));
        public static final TagKey<Item> HELEMTS = ItemTags.create(ResourceLocation.tryParse("ccam:helmets"));
        public static final TagKey<Item> CHESTPLATES = ItemTags.create(ResourceLocation.tryParse("ccam:chestplates"));
        public static final TagKey<Item> LEGGINGS = ItemTags.create(ResourceLocation.tryParse("ccam:leggings"));
        public static final TagKey<Item> BOOTS = ItemTags.create(ResourceLocation.tryParse("ccam:boots"));
        public static final TagKey<Item> CURIO = ItemTags.create(ResourceLocation.tryParse("ccam:curios"));
    }
}