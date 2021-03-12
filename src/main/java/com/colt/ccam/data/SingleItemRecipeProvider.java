package com.colt.ccam.data;

import java.util.function.Consumer;

import javax.annotation.Nullable;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.registries.ccamTags;

import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class SingleItemRecipeProvider extends RecipeProvider implements IConditionBuilder {

	public SingleItemRecipeProvider(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
       addSewingRecipe(consumer, ccamTags.Items.HELMET_PART, ccamItems.COLT_HELMET.get(), "");
	}

	protected static void addSmeltingRecipes(Consumer<IFinishedRecipe> consumer, INamedTag<Item> ore, Item result, float experience, int time) {
		String name = result.getRegistryName().getPath();
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ore), result, experience, time).addCriterion("has_ore", hasItem(ore)).build(consumer, new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, name + "_from_smelting"));
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromTag(ore), result, experience, time / 2).addCriterion("has_ore", hasItem(ore)).build(consumer, new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, name + "_from_blasting"));
	}
	
	protected static void addSewingRecipe(Consumer<IFinishedRecipe> consumer, INamedTag<Item> tag, Item result, String group) {
		SingleItemRecipeBuilder.sewingRecipe(Ingredient.fromTag(tag), result).setGroup(group).addCriterion("has_dirty_object", hasItem(tag)).build(consumer, new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, result.getRegistryName().getPath() + "_from_sewing"));
	}
}
