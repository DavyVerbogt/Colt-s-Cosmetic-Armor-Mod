package com.colt.ccam.intergration.jei;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.recipe.SewingRecipe;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamData;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;
import java.util.Collection;

@JeiPlugin
public class ccamJEI implements IModPlugin {
    private static final ResourceLocation UID = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "jei");
    public static final ResourceLocation JEI_UI = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/gui/jei.png");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IModPlugin.super.registerCategories(registration);
        registration.addRecipeCategories(new ccamJEICatagory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        IModPlugin.super.registerRecipes(registration);
        Collection<SewingRecipe> recipes = Minecraft.getInstance().level.getRecipeManager().getAllRecipesFor(ccamData.Sewing_Recipe);
        registration.addRecipes(Arrays.asList(recipes.toArray()), ccamData.Sewing_Recipe_Loc);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        IModPlugin.super.registerRecipeCatalysts(registration);
        registration.addRecipeCatalyst(new ItemStack(ccamBlocks.Sewing_Table.get()), ccamData.Sewing_Recipe_Loc);
    }
}
