package com.colt.ccam.intergration.jei;

import com.colt.ccam.recipe.SewingRecipe;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamData;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ccamJEICatagory  implements IRecipeCategory<SewingRecipe> {
    private final IDrawable background;
    private final IDrawable icon;

    private final int Input_Slot = 0;
    private final int Output_Slot = 1;

    public ccamJEICatagory(IGuiHelper guiHelper) {
        background = guiHelper.createDrawable(ccamJEI.JEI_UI, 0, 0, 82, 34);
        icon = guiHelper.createDrawableIngredient(new ItemStack(ccamBlocks.Sewing_Table.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return ccamData.Sewing_Recipe_Loc;
    }

    @Override
    public Class<? extends SewingRecipe> getRecipeClass() {
        return SewingRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("sewing.sewing_machine");
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
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, SewingRecipe recipe, IIngredients ingredients) {
        IGuiItemStackGroup stackGroup = recipeLayout.getItemStacks();
        stackGroup.init(Input_Slot, true, 0, 8);
        stackGroup.init(Output_Slot, false, 60, 8);
        stackGroup.set(ingredients);
    }
}
