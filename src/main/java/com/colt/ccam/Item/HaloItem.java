package com.colt.ccam.Item;

import com.colt.ccam.ColtCosmeticArmorMod;

import com.colt.ccam.curio.CurioItem;



public class HaloItem extends CurioItem{

    @Override
    public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
        consumer.accept((net.minecraftforge.client.IItemRenderProperties) ColtCosmeticArmorMod.SIDED_SYSTEM.getArmorRenderProperties());
    }
}