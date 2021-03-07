package com.colt.ccam;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;

import com.colt.ccam.client.ClientRefrence;
import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.server.dedicated.DedicatedServerReference;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ColtCosmeticArmorMod.MOD_ID)
public class ColtCosmeticArmorMod {
    
    public static final String MOD_ID = "ccam";
    public static final ISidedReference SIDED_SYSTEM = DistExecutor.safeRunForDist(() -> ClientRefrence::new, () -> DedicatedServerReference::new);
	

    public ColtCosmeticArmorMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(),
        forgeEventBus = MinecraftForge.EVENT_BUS;
		
		SIDED_SYSTEM.setup(modEventBus, forgeEventBus);
        addRegistries(modEventBus);
    }

	private void addRegistries(final IEventBus modEventBus) {
        ccamItems.ITEMS.register(modEventBus);
	}
    
}
