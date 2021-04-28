package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.Item.*;
import com.colt.ccam.armor.*;
import com.colt.ccam.itemgroup.ccamItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        ColtCosmeticArmorMod.MOD_ID);
        // ArmorItems
        public static final RegistryObject<BasicArmorItem> BASIC_HELMET = ITEMS.register("basic_helmet",
                        () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<BasicArmorItem> BASIC_CHESTPLATE = ITEMS.register("basic_chestplate",
                        () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.CHEST,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<BasicArmorItem> BASIC_LEGGINGS = ITEMS.register("basic_leggings",
                        () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.LEGS,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<BasicArmorItem> BASIC_BOOTS = ITEMS.register("basic_boots",
                        () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlotType.FEET,
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
        public static final RegistryObject<GladiatorArmorItem> GLADIATOR_CHESTPLATE = ITEMS
                        .register("gladiator_chestplate", () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR,
                                        EquipmentSlotType.CHEST, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<GladiatorArmorItem> GLADIATOR_LEGGINGS = ITEMS.register("gladiator_leggings",
                        () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.LEGS,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<GladiatorArmorItem> GLADIATOR_BOOTS = ITEMS.register("gladiator_boots",
                        () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlotType.FEET,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<ConstructionArmorItem> CONSTRUCTION_HELMET = ITEMS
                        .register("construction_helmet", () -> new ConstructionArmorItem(ModArmorMaterial.CONSTRUCTION,
                                        EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<ArrowArmorItem> ARROW_THROUGH_HEAD = ITEMS.register("arrow_through_head",
                        () -> new ArrowArmorItem(ModArmorMaterial.ARROW, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<LongSmallTophatArmormItem> LONG_SMALL_TOP_HAT = ITEMS.register(
                        "long_small_top_hat", () -> new LongSmallTophatArmormItem(ModArmorMaterial.LONGSMALLTOPHAT,
                                        EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<WolfArmorItem> WOLF_HELMET = ITEMS.register("wolf_helmet",
                        () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<WolfArmorItem> WOLF_CHESTPLATE = ITEMS.register("wolf_chestplate",
                        () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlotType.CHEST,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<WolfArmorItem> WOLF_LEGGINGS = ITEMS.register("wolf_leggings",
                        () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlotType.LEGS,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
        public static final RegistryObject<WolfArmorItem> WOLF_BOOTS = ITEMS.register("wolf_boots",
                        () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlotType.FEET,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<TopTopTopArmorItem> TOP_TOP_TOP_HAT = ITEMS.register("top_top_top_hat",
                        () -> new TopTopTopArmorItem(ModArmorMaterial.TOPTOPTOPHAT, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<LongTopHatArmorItem> LONGTOPHAT_HELMET = ITEMS.register("long_top_hat",
                        () -> new LongTopHatArmorItem(ModArmorMaterial.LONGTOPHAT, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<MajimaContructionHatArmorItem> JAPANECECONSTRUCTION_HELMET = ITEMS
                        .register("japaneseconstruction_helmet",
                                        () -> new MajimaContructionHatArmorItem(ModArmorMaterial.MAJIMACONSTRUCTIONHAT,
                                                        EquipmentSlotType.HEAD,
                                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<NachoSombraroArmorItem> NACHOSOMBReRO_HELMET = ITEMS
                        .register("nacho_sombrero", () -> new NachoSombraroArmorItem(ModArmorMaterial.NACHOSOMBRARO,
                                        EquipmentSlotType.HEAD, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<SombreroArmorItem> SOMBRERO_HELMET = ITEMS.register("sombrero",
                        () -> new SombreroArmorItem(ModArmorMaterial.SOMBRARO, EquipmentSlotType.HEAD,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        public static final RegistryObject<FurCoatArmorItem> FUR_COAT = ITEMS.register("fur_coat",
                        () -> new FurCoatArmorItem(ModArmorMaterial.FURCOAT, EquipmentSlotType.CHEST,
                                        new Item.Properties().group(ccamItemGroup.CCAM_TAB)));

        // Curio Items
        public static final RegistryObject<Item> CAT_EARS = ITEMS.register("cat_ears", CatEarItem::new),
                        DOG_EARS = ITEMS.register("dog_ears", DogEarItem::new),
                        RABBIT_EARS = ITEMS.register("rabbit_ears", RabbitEarItem::new),
                        CAT_TAIL = ITEMS.register("cat_tail", CatTailItem::new),
                        DOG_TAIL = ITEMS.register("dog_tail", DogTailItem::new),
                        RABBIT_Tail = ITEMS.register("rabbit_tail", RabbitTail::new),
                        BASIC_CURIO = ITEMS.register("basic_curio", BasicCurio::new),
                        HALO = ITEMS.register("halo", HaloItem::new),
                        TEST_CURIO = ITEMS.register("test_curio", TestCurio::new);

}