package com.colt.ccam.registries;

import com.colt.ccam.ColtCosmeticArmorMod;

import com.colt.ccam.Item.*;
import com.colt.ccam.armor.ModArmorMaterial;
import com.colt.ccam.armor.*;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ccamItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ColtCosmeticArmorMod.MOD_ID);
    // ArmorItems

    public static final RegistryObject<ArrowArmorItem> ARROW = ITEMS.register("arrow_through_head",
            () -> new ArrowArmorItem(ModArmorMaterial.ARROW, EquipmentSlot.HEAD));

    public static final RegistryObject<BasicArmorItem> BASIC_HELMET = ITEMS.register("basic_helmet",
            () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlot.HEAD));
    public static final RegistryObject<BasicArmorItem> BASIC_CHESTPLATE = ITEMS.register("basic_chestplate",
            () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlot.CHEST));
    public static final RegistryObject<BasicArmorItem> BASIC_LEGGINGS = ITEMS.register("basic_leggings",
            () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlot.LEGS));
    public static final RegistryObject<BasicArmorItem> BASIC_BOOTS = ITEMS.register("basic_boots",
            () -> new BasicArmorItem(ModArmorMaterial.BASIC, EquipmentSlot.FEET));

    public static final RegistryObject<ColtArmorItem> COLT_HELMET = ITEMS.register("colt_helmet",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlot.HEAD));
    public static final RegistryObject<ColtArmorItem> COLT_CHESATPLATE = ITEMS.register("colt_chestplate",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlot.CHEST));
    public static final RegistryObject<ColtArmorItem> COLT_LEGGINGS = ITEMS.register("colt_leggings",
            () -> new ColtArmorItem(ModArmorMaterial.COLT, EquipmentSlot.LEGS));

    public static final RegistryObject<ConstructionArmorItem> CONSTRUCTION_HELMET = ITEMS.register("construction_helmet",
            () -> new ConstructionArmorItem(ModArmorMaterial.CONSTRUCTION, EquipmentSlot.HEAD));

    public static final RegistryObject<CowArmoritem> COW_HELMET = ITEMS.register("cow_helmet",
            () -> new CowArmoritem(ModArmorMaterial.COW, EquipmentSlot.HEAD));
    public static final RegistryObject<CowArmoritem> COW_CHESTPLATE = ITEMS.register("cow_chestplate",
            () -> new CowArmoritem(ModArmorMaterial.COW, EquipmentSlot.CHEST));
    public static final RegistryObject<CowArmoritem> COW_LEGGINGS = ITEMS.register("cow_leggings",
            () -> new CowArmoritem(ModArmorMaterial.COW, EquipmentSlot.LEGS));

    public static final RegistryObject<CowBoyArmorItem> COWBOY_HAT = ITEMS.register("cowboy_hat",
            () -> new CowBoyArmorItem(ModArmorMaterial.COWBOYHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<FlowerCrownArmorItem> FLOWER_CROWN = ITEMS.register("flower_crown",
            () -> new FlowerCrownArmorItem(ModArmorMaterial.FLOWERCROWN, EquipmentSlot.HEAD));

    public static final RegistryObject<FurCoatArmorItem> FUR_COAT = ITEMS.register("fur_coat",
            () -> new FurCoatArmorItem(ModArmorMaterial.FURCOAT, EquipmentSlot.CHEST));

    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_HELMET = ITEMS.register("gladiator_helmet",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlot.HEAD));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_CHESTPLATE = ITEMS.register("gladiator_chestplate",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlot.CHEST));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_LEGGINGS = ITEMS.register("gladiator_leggings",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlot.LEGS));
    public static final RegistryObject<GladiatorArmorItem> GLADIATOR_BOOTS = ITEMS.register("gladiator_boots",
            () -> new GladiatorArmorItem(ModArmorMaterial.GLADIATOR, EquipmentSlot.FEET));

    public static final RegistryObject<LongSmallTophatArmormItem> LONG_SMALL_TOPHAT = ITEMS.register("long_small_top_hat",
            () -> new LongSmallTophatArmormItem(ModArmorMaterial.LONGSMALLTOPHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<LongTopHatArmorItem> LONG_TOPHAT = ITEMS.register("long_top_hat",
            () -> new LongTopHatArmorItem(ModArmorMaterial.LONGTOPHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<MajimaContructionHatArmorItem> MAJIMA_CONSTRUCTION_HAT = ITEMS.register("japaneseconstruction_helmet",
            () -> new MajimaContructionHatArmorItem(ModArmorMaterial.MAJIMACONSTRUCTIONHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<MonocleArmorItem> MONOCLE = ITEMS.register("monocle",
            () -> new MonocleArmorItem(ModArmorMaterial.MONOCLE, EquipmentSlot.HEAD));

    public static final RegistryObject<NachoSombraroArmorItem> NACHO_SOMBRARO = ITEMS.register("nacho_sombrero",
            () -> new NachoSombraroArmorItem(ModArmorMaterial.NACHOSOMBRARO, EquipmentSlot.HEAD));

    public static final RegistryObject<SamuraiArmoritem> SAMURAI_HELMET = ITEMS.register("samurai_helmet",
            () -> new SamuraiArmoritem(ModArmorMaterial.SAMURAI, EquipmentSlot.HEAD));
    public static final RegistryObject<SamuraiArmoritem> SAMURAI_CHESTPLATE = ITEMS.register("samurai_chestplate",
            () -> new SamuraiArmoritem(ModArmorMaterial.SAMURAI, EquipmentSlot.CHEST));
    public static final RegistryObject<SamuraiArmoritem> SAMURAI_LEGGINGS = ITEMS.register("samurai_leggings",
            () -> new SamuraiArmoritem(ModArmorMaterial.SAMURAI, EquipmentSlot.LEGS));
    public static final RegistryObject<SamuraiArmoritem> SAMURAI_BOOTS = ITEMS.register("samurai_boots",
            () -> new SamuraiArmoritem(ModArmorMaterial.SAMURAI, EquipmentSlot.FEET));

    public static final RegistryObject<ShotCowBoyHatArmoritem> SHOT_COWBOY_HAT = ITEMS.register("shot_cowboy_hat",
            () -> new ShotCowBoyHatArmoritem(ModArmorMaterial.SHOTCOWBOYHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<SmallTopHatArmorItem> SMALL_TOPHAT = ITEMS.register("small_top_hat",
            () -> new SmallTopHatArmorItem(ModArmorMaterial.SMALLTOPHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<SombreroArmorItem> SOMBRARO = ITEMS.register("sombrero",
            () -> new SombreroArmorItem(ModArmorMaterial.SOMBRARO, EquipmentSlot.HEAD));

    public static final RegistryObject<TopHatArmorItem> TOPHAT = ITEMS.register("top_hat",
            () -> new TopHatArmorItem(ModArmorMaterial.TOPHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<TopTopTopArmorItem> TOP_TOP_TOP_HAT = ITEMS.register("top_top_top_hat",
            () -> new TopTopTopArmorItem(ModArmorMaterial.TOPTOPTOPHAT, EquipmentSlot.HEAD));

    public static final RegistryObject<TrafficConeArmorItem> TRAFFIC_CONE = ITEMS.register("traffic_cone",
            () -> new TrafficConeArmorItem(ModArmorMaterial.TRAFFICCONE, EquipmentSlot.HEAD));

    public static final RegistryObject<TulipArmorItem> TULIP = ITEMS.register("tulip_hat",
            () -> new TulipArmorItem(ModArmorMaterial.TULIP, EquipmentSlot.HEAD));

    public static final RegistryObject<WitchHatArmorItem> WITCH_HAT = ITEMS.register("witch_hat",
            () -> new WitchHatArmorItem(ModArmorMaterial.WITCH, EquipmentSlot.HEAD));

    public static final RegistryObject<WolfArmorItem> WOLF_HELMET = ITEMS.register("wolf_helmet",
            () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlot.HEAD));
    public static final RegistryObject<WolfArmorItem> WOLF_CHESTPLATE = ITEMS.register("wolf_chestplate",
            () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlot.CHEST));
    public static final RegistryObject<WolfArmorItem> WOLF_LEGGINGS = ITEMS.register("wolf_leggings",
            () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlot.LEGS));
    public static final RegistryObject<WolfArmorItem> WOLF_BOOTS = ITEMS.register("wolf_boots",
            () -> new WolfArmorItem(ModArmorMaterial.WOLFHIDE, EquipmentSlot.FEET));

    // Curio Items
 public static final RegistryObject<Item> CAT_EARS = ITEMS.register("cat_ears", CatEarItem::new);
                               /*DOG_EARS = ITEMS.register("dog_ears", DogEarItem::new),
                        RABBIT_EARS = ITEMS.register("rabbit_ears", RabbitEarItem::new),
                        CAT_TAIL = ITEMS.register("cat_tail", CatTailItem::new),
                        DOG_TAIL = ITEMS.register("dog_tail", DogTailItem::new),
                        RABBIT_Tail = ITEMS.register("rabbit_tail", RabbitTail::new),
                        BASIC_CURIO = ITEMS.register("basic_curio", BasicCurio::new),
                        PONCHO = ITEMS.register("poncho", PonchoItem::new),
                        HALO = ITEMS.register("halo", HaloItem::new),
                        PONCHO_SIDE = ITEMS.register("poncho_side", PonchoSideItem::new),
                        SPURS = ITEMS.register("spur", SpurItem::new);
                        //TEST_CURIO = ITEMS.register("test_curio", TestCurio::new);
*/
}