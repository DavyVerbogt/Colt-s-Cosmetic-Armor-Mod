package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.sewingstation.SewingStationContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamContainer {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ColtCosmeticArmorMod.MOD_ID);

	public static ContainerType<SewingStationContainer> sewingStationContainer;
    
	public static final RegistryObject<ContainerType<SewingStationContainer>> SEWING_STATION = CONTAINERS.register("sewing_station", () -> new ContainerType<>(SewingStationContainer::new));
}
