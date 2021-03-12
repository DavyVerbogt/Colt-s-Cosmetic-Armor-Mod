package com.colt.ccam.sewingstation;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SingleItemRecipe;

public class SewingRecipeSerializer {
    public static final IRecipeSerializer<SewingRecipe> sewing = new SingleItemRecipe.Serializer<SewingRecipe>(SewingRecipe::new) {};
}
