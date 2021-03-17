package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.armor.*;
import com.colt.ccam.itemgroup.ccamItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ColtCosmeticArmorMod.MOD_ID);

    public static final RegistryObject<ArmorItem> BASIC_HELMET = ITEMS.register("basic_helmet",
            () -> new ArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ArmorItem> BASIC_CHESTPLATE = ITEMS.register("basic_chestplate",
            () -> new ArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ArmorItem> BASIC_LEGGINGS = ITEMS.register("basic_leggings",
            () -> new ArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ArmorItem> BASIC_BOOTS = ITEMS.register("basic_boots",
            () -> new ArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.FEET,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<WitchHatArmorItem> WITCH_HAT = ITEMS.register("witch_hat",
            () -> new WitchHatArmorItem(ModArmorMaterial.WITCH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<ColtArmorItem> COLT_HELMET = ITEMS.register("colt_helmet",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ColtArmorItem> COLT_CHESTPLATE = ITEMS.register("colt_chestplate",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<ColtArmorItem> COLT_LEGGINGS = ITEMS.register("colt_leggings",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<TulipArmorItem> TULIP_HAT = ITEMS.register("tulip_hat",
            () -> new TulipArmorItem(ModArmorMaterial.TULIP, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<FlowerCrownArmorItem> FLOWER_CROWN = ITEMS.register("flower_crown",
            () -> new FlowerCrownArmorItem(ModArmorMaterial.FLOWERCROWN, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<CowBoyArmorItem> COWBOY_HAT = ITEMS.register("cowboy_hat",
            () -> new CowBoyArmorItem(ModArmorMaterial.COWBOYHAT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<TrafficConeArmorItem> traffic_CONE = ITEMS.register("traffic_cone",
            () -> new TrafficConeArmorItem(ModArmorMaterial.TRAFFICCONE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<TopHatArmorItem> TOP_HAT = ITEMS.register("top_hat",
            () -> new TopHatArmorItem(ModArmorMaterial.TOPHAT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<SmallTopHatArmorItem> SMALL_TOP_HAT = ITEMS.register("small_top_hat",
            () -> new SmallTopHatArmorItem(ModArmorMaterial.SMALLTOPHAT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<MonocleArmorItem> MONOCLE = ITEMS.register("monocle",
            () -> new MonocleArmorItem(ModArmorMaterial.MONOCLE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_HELMET = ITEMS.register("gladiator_helmet",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_CHESTPLATE = ITEMS.register("gladiator_chestplate",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_LEGGINGS = ITEMS.register("gladiator_leggings",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_BOOTS = ITEMS.register("gladiator_boots",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.FEET,
                    new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

}
