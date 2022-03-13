package com.colt.ccam.client;

import com.colt.ccam.ISidedReference;
import com.colt.ccam.client.render.CustomArmorRenderProperties;

import net.minecraftforge.eventbus.api.IEventBus;

public class ClientRefrence implements ISidedReference {
@Override
    public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
    }

    @Override
    public Object getArmorRenderProperties() {
        return new CustomArmorRenderProperties();
    }
}
