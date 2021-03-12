package com.colt.ccam.jei;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.sewingstation.SewingRecipe;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class ModPlugin implements IModPlugin {

    private static final ResourceLocation UID = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "main");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        registry.addRecipeCategories(
                new SewingStationRecipeCategory(registry.getJeiHelpers().getGuiHelper())
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(SewingRecipe.SEWING_LIST, SewingStationRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ccamBlocks.SEWING_STATION.get()), SewingStationRecipeCategory.UID);
    }

}