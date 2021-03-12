package com.colt.ccam.sewingstation;

import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamRecipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

public class SewingRecipe extends AbstractSingleItemRecipe {

	public SewingRecipe(ResourceLocation id, String group, Ingredient ingredient, int time, ItemStack result) {
		super(ccamRecipe.Type.SEWING, ccamRecipe.SEWING.get(), id, group, ingredient, time, result);
	}

	@Override
	public ItemStack getIcon() {
		return new ItemStack(ccamBlocks.SEWING_STATION.get());
	}
}