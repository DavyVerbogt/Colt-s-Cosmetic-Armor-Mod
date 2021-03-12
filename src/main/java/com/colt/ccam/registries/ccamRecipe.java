package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.sewingstation.SewingRecipeSerializer;

//import com.colt.ccam.sewingstation.SewingRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ccamRecipe {
    @SubscribeEvent
    public static void onRecipeRegistry(final RegistryEvent.Register<IRecipeSerializer<?>> RecipeRegistryEvent)
    {

        RecipeEnum.register(RecipeRegistryEvent);
        RecipeRegistryEvent.getRegistry().register(SewingRecipeSerializer.sewing.setRegistryName(location("sewing")));
    }
    
    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, name);
    }
}
