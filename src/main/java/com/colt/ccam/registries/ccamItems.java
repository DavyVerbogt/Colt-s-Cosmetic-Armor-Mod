package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.armor.*;
import com.colt.ccam.itemgroup.ccamItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ColtCosmeticArmorMod.MOD_ID);

    public static final RegistryObject<TestArmorItem> TEST_HELMET = ITEMS.register("test_helmet",
    () -> new TestArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<TestArmorItem> TEST_CHESTPLATE = ITEMS.register("test_chestplate",
    () -> new TestArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.CHEST, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<TestArmorItem> TEST_LEGGINGS = ITEMS.register("test_leggings",
    () -> new TestArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.LEGS, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<TestArmorItem> TEST_BOOTS = ITEMS.register("test_boots",
    () -> new TestArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.FEET, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<WitchHatArmorItem> WITCH_HAT = ITEMS.register("witch_hat",
    () -> new WitchHatArmorItem(ModArmorMaterial.WITCH, EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<ColtArmorItem> COLT_HELMET = ITEMS.register("colt_helmet",
    () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ColtArmorItem> COLT_CHESTPLATE = ITEMS.register("colt_chestplate",
    () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.CHEST, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ColtArmorItem> COLT_LEGGINGS = ITEMS.register("colt_leggings",
    () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.LEGS, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<TulipArmorItem> TULIP_HAT = ITEMS.register("tulip_hat",
    () -> new TulipArmorItem(ModArmorMaterial.TULIP, EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    
    public static final RegistryObject<FlowerCrownArmorItem> FLOWER_CROWN = ITEMS.register("flower_crown",
    () -> new FlowerCrownArmorItem(ModArmorMaterial.FLOWERCROWN, EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
}
