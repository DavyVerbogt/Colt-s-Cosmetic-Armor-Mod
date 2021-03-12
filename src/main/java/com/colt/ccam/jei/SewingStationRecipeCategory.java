package com.colt.ccam.jei;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.sewingstation.SewingRecipe;

import mezz.jei.api.constants.ModIds;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class SewingStationRecipeCategory implements IRecipeCategory<SewingRecipe> {

	public static final ResourceLocation UID = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "sewing_station");

    private static final int inputSlot = 0;
    private static final int outputSlot = 1;

    public static final int width = 82;
    public static final int height = 34;

    private final IDrawable background;
    private final IDrawable icon;
    private final String localizedName;

    public SewingStationRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation(ModIds.JEI_ID, "textures/gui/gui_vanilla.png");
        background = guiHelper.createDrawable(location, 0, 220, width, height);
        icon = guiHelper.createDrawableIngredient(new ItemStack(ccamBlocks.SEWING_STATION.get()));
        localizedName = "container.druidcraft.woodcutter";
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends SewingRecipe> getRecipeClass() {
        return SewingRecipe.class;
    }

    @Override
    public String getTitle() {
        return I18n.format(localizedName);
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setIngredients(SewingRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, SewingRecipe recipe, IIngredients ingredients) {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
        guiItemStacks.init(inputSlot, true, 0, 8);
        guiItemStacks.init(outputSlot, false, 60, 8);

        guiItemStacks.set(ingredients);
    }

}