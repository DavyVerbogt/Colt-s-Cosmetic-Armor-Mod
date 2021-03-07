package com.colt.ccam.client;

import com.colt.ccam.ISidedReference;
import com.colt.ccam.client.render.entity.model.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;

public class ClientRefrence implements ISidedReference {

    private final TestArmorModel testArmorModel = new TestArmorModel(1.0f);
    private final TestArmorModel testArmorLeggings = new TestArmorModel(0.5f); 
    private final WitchHatArmorModel witchArmorModel = new WitchHatArmorModel(1.0f);
    private final WitchHatArmorModel witchArmorLeggings = new WitchHatArmorModel(0.5f);
    private final ColtArmorModel coltArmorModel = new ColtArmorModel(1.0f);
    private final ColtArmorModel coltArmorLeggings = new ColtArmorModel(0.5f);
    private final TulipArmorModel tulipArmorModel = new TulipArmorModel(1.0f);
    private final TulipArmorModel tulipArmorLeggings = new TulipArmorModel(0.5f);
    

    @Override
    public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTestArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? testArmorLeggings : testArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getWitchArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? witchArmorLeggings : witchArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getColtArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? coltArmorLeggings : coltArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTulipArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? tulipArmorLeggings: tulipArmorModel);
    }
}
