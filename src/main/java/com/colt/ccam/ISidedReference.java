package com.colt.ccam;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;

public interface  ISidedReference {

        void setup(IEventBus modEventBus, IEventBus forgeEventBus); 

        default <A> A getWitchArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getColtArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getTulipArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getFlowerCrownArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getCowBoyArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getTraficConeArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
}
