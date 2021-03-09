package com.colt.ccam.client.render.color;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ColtCosmeticArmorMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ModColorHandeler {
	@SubscribeEvent

	public static void onItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, colorIn) -> colorIn < 1 ? -1 : ((IDyeableArmorItem)stack.getItem()).getColor(stack), ccamItems.FLOWER_CROWN.get(), ccamItems.WITCH_HAT.get());
    }
}
