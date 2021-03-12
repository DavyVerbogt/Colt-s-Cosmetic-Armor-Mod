package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.sewingstation.AbstractSingleItemRecipe;
import com.colt.ccam.sewingstation.SewingRecipe;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamRecipe {

    public static class Type {
		public static final IRecipeType<SewingRecipe> SEWING = IRecipeType.register(ColtCosmeticArmorMod.MOD_ID + ":sewing");
	}
	
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPES = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ColtCosmeticArmorMod.MOD_ID);
	
	public static final RegistryObject<AbstractSingleItemRecipe.Serializer<SewingRecipe>> SEWING = RECIPES.register("sewing", () -> new AbstractSingleItemRecipe.Serializer<>(SewingRecipe::new));

}
