package com.colt.ccam.recipe;

import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;

public class SewingRecipe extends coltSingleItem {
    public SewingRecipe(ResourceLocation rl, String s, Ingredient ing, ItemStack stack) {
        super(ccamData.Sewing_Recipe, ccamData.RecipeSerializers.Furniture_Recipe_Serializer.get(), rl, s, ing, stack);
    }

    @Override
    public boolean matches(Container inv, Level l) {
        return this.ingredient.test(inv.getItem(0));
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ccamBlocks.Sewing_Table.get());
    }
}