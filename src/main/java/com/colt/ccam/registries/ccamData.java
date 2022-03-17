package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.block.container.SewingTableContainer;
import com.colt.ccam.client.gui.SewingTableScreen;
import com.colt.ccam.recipe.SewingRecipe;
import com.colt.ccam.recipe.coltSingleItem;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ccamData {
    public static final ResourceLocation Sewing_Recipe_Loc = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "sewing");
    public static RecipeType<SewingRecipe> Sewing_Recipe;

    @SubscribeEvent
    public static void registerRecipeType(RegistryEvent.Register<Block> event) {
        Sewing_Recipe = RecipeType.register(Sewing_Recipe_Loc.toString());
    }

    public static class RecipeSerializers {
        public static final DeferredRegister<RecipeSerializer<?>> Registry = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ColtCosmeticArmorMod.MOD_ID);
        public static final RegistryObject<RecipeSerializer<SewingRecipe>> Furniture_Recipe_Serializer = Registry.register(
                "sewing",
                () -> new coltSingleItem.Serializer<SewingRecipe>(SewingRecipe::new) {}
        );
    }

    public static class Containers {
        public static final DeferredRegister<MenuType<?>> Registry = DeferredRegister.create(ForgeRegistries.CONTAINERS, ColtCosmeticArmorMod.MOD_ID);
        public static final RegistryObject<MenuType<SewingTableContainer>> Sewing_Table = Registry.register(
                "sewing_table",
                () -> new MenuType<>(SewingTableContainer::new)
        );
    }
    public static void LoadRecepies(IEventBus bus) {
        Containers.Registry.register(bus);
        RecipeSerializers.Registry.register(bus);
    }

    public static void SewingTableScreen() {
        MenuScreens.register(Containers.Sewing_Table.get(), SewingTableScreen::new);
    }

}
