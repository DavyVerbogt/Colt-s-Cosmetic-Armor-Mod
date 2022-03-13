package com.colt.ccam;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.eventbus.api.IEventBus;

public interface  ISidedReference {

        void setup(IEventBus modEventBus, IEventBus forgeEventBus);

    default Object getArmorRenderProperties() {
        return null;
    }
}
