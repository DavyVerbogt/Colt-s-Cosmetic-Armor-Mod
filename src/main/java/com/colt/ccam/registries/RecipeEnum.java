package com.colt.ccam.registries;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

import java.util.function.Supplier;

import com.colt.ccam.ColtCosmeticArmorMod;

public enum RecipeEnum {
;
    public static IRecipeSerializer<?> serializer;
    public Supplier<IRecipeSerializer<?>> supplier;
    public IRecipeType<? extends IRecipe<? extends IInventory>> type;

    RecipeEnum(Supplier<IRecipeSerializer<?>> supplier, IRecipeType<? extends IRecipe<? extends IInventory>> type) {
        this.supplier = supplier;
        this.type = type;
    }

    public static IRecipeSerializer<?> getSerializer(RecipeEnum recipeRegistry) {
        return recipeRegistry.supplier.get();
    }

    public static void register(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        for (RecipeEnum recipe : RecipeEnum.values()) {
            recipe.serializer = recipe.supplier.get();
            ResourceLocation location = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, recipe.name().toLowerCase());
            event.getRegistry().register(recipe.serializer.setRegistryName(location));
        }
    }
}
