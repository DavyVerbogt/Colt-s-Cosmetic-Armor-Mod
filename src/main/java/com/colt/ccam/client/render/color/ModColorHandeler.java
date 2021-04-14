package com.colt.ccam.client.render.color;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.item.IDyeableArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ColtCosmeticArmorMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ModColorHandeler {
    @SubscribeEvent

    public static void onItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((IDyeableArmorItem) stack.getItem()).getColor(stack),
                ccamItems.FLOWER_CROWN.get(), ccamItems.WITCH_HAT.get(), ccamItems.SMALL_TOP_HAT.get(),
                ccamItems.TOP_HAT.get(), ccamItems.TOP_TOP_TOP_HAT.get(), ccamItems.GLADIATOR_HELMET.get(),
                ccamItems.BASIC_HELMET.get(), ccamItems.BASIC_CHESTPLATE.get(), ccamItems.BASIC_LEGGINGS.get(),
                ccamItems.BASIC_BOOTS.get(), ccamItems.LONGTOPHAT_HELMET.get(), ccamItems.LONG_SMALL_TOP_HAT.get()
                );
    }
}
