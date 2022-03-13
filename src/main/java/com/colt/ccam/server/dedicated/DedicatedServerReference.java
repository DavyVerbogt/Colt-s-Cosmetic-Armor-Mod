package com.colt.ccam.server.dedicated;

import com.colt.ccam.ISidedReference;
import net.minecraftforge.eventbus.api.IEventBus;

public class DedicatedServerReference implements ISidedReference {
@Override
	public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {}

    @Override
    public Object getArmorRenderProperties() {
        return null ;
    }
}
