package com.colt.ccam.sewingstation;

import java.util.ArrayList;
import java.util.List;

import com.colt.ccam.registries.ccamBlocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SingleItemRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class SewingRecipe extends SingleItemRecipe {

	public static final List<SewingRecipe> SEWING_LIST = new ArrayList<>();

    public SewingRecipe(ResourceLocation location, String p_i50021_2_, Ingredient ingredient, ItemStack itemStack) {
        super(IModdedRecipeType.sewing, SewingRecipeSerializer.sewing, location, p_i50021_2_, ingredient, itemStack);
        SEWING_LIST.add(this);
    }
	
	@Override
	public boolean matches(IInventory inv, World world) {
		return this.ingredient.test(inv.getStackInSlot(0));
	}

	@Override
	public ItemStack getIcon() {
		return new ItemStack(ccamBlocks.SEWING_STATION.get());
	}
}