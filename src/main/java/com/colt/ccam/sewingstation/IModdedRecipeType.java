package com.colt.ccam.sewingstation;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Optional;

public interface IModdedRecipeType<T extends IRecipe<?>> {
    
    IRecipeType<SewingRecipe> sewing = register("sewing");

    static <T extends IRecipe<?>> IRecipeType<T> register(final String key) {
        return Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, key), new IRecipeType<T>() {
            public String toString() {
                return key;
            }
        });
    }

    default <C extends IInventory> Optional<T> matches(IRecipe<C> recipe, World worldIn, C inv) {
        return recipe.matches(inv, worldIn) ? Optional.of((T)recipe) : Optional.empty();
    }
}
