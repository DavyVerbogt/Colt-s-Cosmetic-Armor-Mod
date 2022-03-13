package com.colt.ccam.client.render.color;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.world.item.DyeableLeatherItem;
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
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.BASIC_HELMET.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.BASIC_CHESTPLATE.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.BASIC_LEGGINGS.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack), ccamItems.BASIC_BOOTS.get()
        );


        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.FLOWER_CROWN.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.GLADIATOR_HELMET.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.LONG_SMALL_TOPHAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.LONG_TOPHAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.SMALL_TOPHAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.TOPHAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.LONG_TOPHAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.TOP_TOP_TOP_HAT.get()
        );
        event.getItemColors().register(
                (stack, colorIn) -> colorIn < 1 ? -1 : ((DyeableLeatherItem) stack.getItem()).getColor(stack),
                ccamItems.WITCH_HAT.get()
        );


    }
}
