package com.colt.ccam.client.render.color;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ColtCosmeticArmorMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ModColorHandeler {
	@SubscribeEvent
	public static void registerItemColourHandlers(final ColorHandlerEvent.Item event) {
		final BlockColors blockColors = event.getBlockColors();
		final ItemColors itemColors = event.getItemColors();

		final IItemColor itemColourHandler = (stack, tintIndex) -> {
			return itemColors.getColor(stack, tintIndex);
		};
        //itemColors.register(itemColourHandler, ccamItems.FLOWER_CROWN.get());
		//itemColors.register(itemColourHandler, ccamItems.WITCH_HAT.get());
    }
}
