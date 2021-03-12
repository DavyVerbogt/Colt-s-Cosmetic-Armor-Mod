package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.versions.forge.ForgeVersion;

public class ccamTags {


	public static class Items {
		
		public static final ITag.INamedTag<Item> HELMET_PART = forge("ingots/helmet");
		
		@SuppressWarnings("unused")
		private static ITag.INamedTag<Item> tag(String id) {
			return ItemTags.makeWrapperTag(ColtCosmeticArmorMod.MOD_ID + ":" + id);
		}
		
		private static ITag.INamedTag<Item> forge(String id) {
			return ItemTags.makeWrapperTag(ForgeVersion.MOD_ID + ":" + id);
		}
	}
}
