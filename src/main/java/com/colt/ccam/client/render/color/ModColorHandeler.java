package com.colt.ccam.client.render.color;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ColtCosmeticArmorMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ModColorHandeler {
	@SubscribeEvent
	public static void registerItemColourHandlers(final ColorHandlerEvent.Item event) {
		final ItemColors itemColors = event.getItemColors();

		final IItemColor itemColourHandler = (stack, tintIndex) -> {
			CompoundNBT color = stack.getChildTag("display");
			return color != null && color.contains("color", 99) ? color.getInt("color") : 0XADC3D7;
		};
        itemColors.register(itemColourHandler, ccamItems.FLOWER_CROWN.get(), ccamItems.WITCH_HAT.get());
    }
}
