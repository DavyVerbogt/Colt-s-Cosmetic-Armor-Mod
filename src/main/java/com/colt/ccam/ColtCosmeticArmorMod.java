package com.colt.ccam;

import com.colt.ccam.client.ClientRefrence;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamContainer;
import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.server.dedicated.DedicatedServerReference;
import com.colt.ccam.sewingstation.SewingStationContainer;
import com.colt.ccam.sewingstation.SewingStationScreen;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ColtCosmeticArmorMod.MOD_ID)
public class ColtCosmeticArmorMod {

    public static final String MOD_ID = "ccam";
    public static final ISidedReference SIDED_SYSTEM = DistExecutor.safeRunForDist(() -> ClientRefrence::new,
            () -> DedicatedServerReference::new);
    public static ContainerType<SewingStationContainer> SewingStationContainer;

    public ColtCosmeticArmorMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(),
                forgeEventBus = MinecraftForge.EVENT_BUS;

        SIDED_SYSTEM.setup(modEventBus, forgeEventBus);
        addRegistries(modEventBus);
        //modEventBus.addListener(this::onInitializeClient);

    }

    private void addRegistries(final IEventBus modEventBus) {
        ccamItems.ITEMS.register(modEventBus);
        ccamBlocks.BLOCKS.register(modEventBus);
        ccamContainer.CONTAINERS.register(modEventBus);
        modEventBus.addListener(this::onInitializeClient);
    }

    private void onInitializeClient(FMLClientSetupEvent e) {
        ScreenManager.registerFactory(SewingStationContainer, SewingStationScreen::new);

        RenderTypeLookup.setRenderLayer(ccamBlocks.SEWING_STATION.get(), RenderType.getCutout());

    }
}
