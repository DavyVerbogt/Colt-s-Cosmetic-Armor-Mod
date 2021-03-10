package com.colt.ccam.client;

import com.colt.ccam.ISidedReference;
import com.colt.ccam.client.render.entity.model.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;

public class ClientRefrence implements ISidedReference {

    private final WitchHatArmorModel witchArmorModel = new WitchHatArmorModel(1.0f);
    private final WitchHatArmorModel witchArmorLeggings = new WitchHatArmorModel(0.5f);
    private final ColtArmorModel coltArmorModel = new ColtArmorModel(1.0f);
    private final ColtArmorModel coltArmorLeggings = new ColtArmorModel(0.5f);
    private final TulipArmorModel tulipArmorModel = new TulipArmorModel(1.0f);
    private final TulipArmorModel tulipArmorLeggings = new TulipArmorModel(0.5f);
    private final FlowerCrownArmorModel flowerCorwnArmorModel = new FlowerCrownArmorModel(1.0f);
    private final FlowerCrownArmorModel flowerCorwnArmorLeggings = new FlowerCrownArmorModel(0.5f);
    private final CowBoyHatArmorModel cowBoyHatArmorModel = new CowBoyHatArmorModel(1.0f);
    private final CowBoyHatArmorModel cowBoyHatArmorLeggings = new CowBoyHatArmorModel(0.5f);
    private final TraficConeArmorModel traficConeArmorModel = new TraficConeArmorModel(1.0f);
    private final TraficConeArmorModel traficConeArmorLeggings = new TraficConeArmorModel(0.5f);
    private final TopHatModel topHatArmorModel = new TopHatModel(1.0f);
    private final TopHatModel topHatArmorLeggings = new TopHatModel(0.5f);


    @Override
    public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
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
        return (A) (armorSlot == EquipmentSlotType.LEGS ? tulipArmorLeggings : tulipArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getFlowerCrownArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? flowerCorwnArmorLeggings: flowerCorwnArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getCowBoyArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? cowBoyHatArmorLeggings: cowBoyHatArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTraficConeArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? traficConeArmorLeggings: traficConeArmorModel);
    }
    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? topHatArmorLeggings: topHatArmorModel);
    }
}
