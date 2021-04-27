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
        default <A> A gettrafficConeArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getSmallTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getMonocleArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getGladiatorArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getConstructionArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getArrowArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getLongSmallTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getWolfArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getTopTopTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getLongTopHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getMajimaContructionHatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getNachoSombraroArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getSombraroArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getBasicArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
        default <A> A getFurCoatArmorModel(EquipmentSlotType armorSlot) {
            return null;
        }
}
