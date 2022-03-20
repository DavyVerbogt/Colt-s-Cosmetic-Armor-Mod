package com.colt.ccam.client.render;

import com.colt.ccam.client.render.model.*;
import com.colt.ccam.intergration.curio.render.model.*;
import com.colt.ccam.registries.ccamItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class CustomArmorRenderProperties implements IItemRenderProperties {

    private static boolean init;

    public static ArrowArmorModel ARROW;
    public static BasicArmorModel BASIC;
    public static ColtArmorModel COLT;
    public static ConstructionArmorModel CONSTRUCTION_HELMET;
    public static CowArmorModel COW;
    public static CowBoyHatArmorModel COWBOY_HAT;
    public static FlowerCrownArmorModel FLOWER_CROWN;
    public static FurCoatArmorModel FURCOAT;
    public static GladiatorArmorModel GLADIATOR;
    public static LongSmalTophatArmorModel LONG_SMALL_TOPHAT;
    public static LongTopHatArmorModel LONG_TOPHAT;
    public static MajimaContructionHatArmorModel MAJIMA_CONSTRUCTION_HAT;
    public static MonocleArmorModel MONOCLE;
    public static NachoSombraroArmorModel NACHO_SOMBRARO;
    public static SamuraiArmorModel SAMURAI;
    public static ShotCowBoyHatArmorModel SHOT_COWBOY_HAT;
    public static SmallTopHatArmorModel SMALL_TOPHAT;
    public static SombreroArmorModel SOMBRARO;
    public static TopHatModel TOPHAT;
    public static TopTopTopHatModel TOP_TOP_TOPHAT;
    public static TrafficConeArmorModel TRAFFIC_CONE;
    public static TulipArmorModel TULIP;
    public static WitchHatArmorModel WITCH_HAT;
    public static WolfArmorModel WOLF;
    public static FourthOfJullyModel FOURTHTHEJULLY;
    // Curio
    public static CatEarCurioModel CAT_EARS;
    public static CatTailCurio CAT_TAIL;
    public static DogEarsCurio DOG_EARS;
    public static DogTailCurio DOG_TAIL;
    public static RabitEarsCurio BUN_EARS;
    public static RabbitTailCurio BUN_TAIL;
    public static HaloCurioModel HALO;
    public static PonchoCurioModel PONCHO;
    public static PonchoSideCurioModel PONCHO_SIDE;
    public static SpurCurioModel SPURS;
    public static BasicCurioModel BASIC_CURIO;
    public static SunglassCurioModel SUNGLASSES;

    public static void initializeModels() {

        init = true;
        ARROW = new ArrowArmorModel(bakeLayer(CCAMModelLayers.ARROW));
        COLT = new ColtArmorModel(bakeLayer(CCAMModelLayers.COLT));
        CONSTRUCTION_HELMET = new ConstructionArmorModel(bakeLayer(CCAMModelLayers.CONSTRUCTION_HELMET));
        COW = new CowArmorModel(bakeLayer(CCAMModelLayers.COW));
        COWBOY_HAT = new CowBoyHatArmorModel(bakeLayer(CCAMModelLayers.COWBOY_HAT));
        FLOWER_CROWN = new FlowerCrownArmorModel(bakeLayer(CCAMModelLayers.FLOWER_CROWN));
        FURCOAT = new FurCoatArmorModel(bakeLayer(CCAMModelLayers.FURCOAT));
        GLADIATOR = new GladiatorArmorModel(bakeLayer(CCAMModelLayers.GLADIATOR));
        LONG_SMALL_TOPHAT = new LongSmalTophatArmorModel(bakeLayer(CCAMModelLayers.LONG_SMALL_TOPHAT));
        LONG_TOPHAT = new LongTopHatArmorModel(bakeLayer(CCAMModelLayers.LONG_TOPHAT));
        MAJIMA_CONSTRUCTION_HAT = new MajimaContructionHatArmorModel(
                bakeLayer(CCAMModelLayers.MAJIMA_CONSTRUCTION_HAT));
        MONOCLE = new MonocleArmorModel(bakeLayer(CCAMModelLayers.MONOCLE));
        NACHO_SOMBRARO = new NachoSombraroArmorModel(bakeLayer(CCAMModelLayers.NACHO_SOMBRARO));
        SAMURAI = new SamuraiArmorModel(bakeLayer(CCAMModelLayers.SAMURAI));
        SHOT_COWBOY_HAT = new ShotCowBoyHatArmorModel(bakeLayer(CCAMModelLayers.SHOT_COWBOY_HAT));
        SMALL_TOPHAT = new SmallTopHatArmorModel(bakeLayer(CCAMModelLayers.SMALL_TOPHAT));
        SOMBRARO = new SombreroArmorModel(bakeLayer(CCAMModelLayers.SOMBRARO));
        TOPHAT = new TopHatModel(bakeLayer(CCAMModelLayers.TOPHAT));
        TOP_TOP_TOPHAT = new TopTopTopHatModel(bakeLayer(CCAMModelLayers.TOP_TOP_TOPHAT));
        TRAFFIC_CONE = new TrafficConeArmorModel(bakeLayer(CCAMModelLayers.TRAFFIC_CONE));
        TULIP = new TulipArmorModel(bakeLayer(CCAMModelLayers.TULIP));
        WITCH_HAT = new WitchHatArmorModel(bakeLayer(CCAMModelLayers.WITCH_HAT));
        WOLF = new WolfArmorModel(bakeLayer(CCAMModelLayers.WOLF));
        FOURTHTHEJULLY = new FourthOfJullyModel(bakeLayer(CCAMModelLayers.FOURTHTHEJULLY));
    }

    @OnlyIn(Dist.CLIENT)
    public static void CurioRenderReader(final FMLClientSetupEvent event) {
        CuriosRendererRegistry.register(ccamItems.CAT_EARS.get(), () -> new CurioRender("catears_curio",
                CAT_EARS = new CatEarCurioModel(bakeLayer(CCAMModelLayers.CAT_EARS))));
        CuriosRendererRegistry.register(ccamItems.CAT_TAIL.get(), () -> new CurioRender("cattail_curio",
                CAT_TAIL = new CatTailCurio(bakeLayer(CCAMModelLayers.CAT_TAIL))));
        CuriosRendererRegistry.register(ccamItems.DOG_EARS.get(), () -> new CurioRender("dogears_curio",
                DOG_EARS = new DogEarsCurio(bakeLayer(CCAMModelLayers.DOG_EARS))));
        CuriosRendererRegistry.register(ccamItems.DOG_TAIL.get(), () -> new CurioRender("dogtail_curio",
                DOG_TAIL = new DogTailCurio(bakeLayer(CCAMModelLayers.DOG_TAIL))));
        CuriosRendererRegistry.register(ccamItems.RABBIT_EARS.get(), () -> new CurioRender("bunnyears_curio",
                BUN_EARS = new RabitEarsCurio(bakeLayer(CCAMModelLayers.BUN_EARS))));
        CuriosRendererRegistry.register(ccamItems.RABBIT_Tail.get(), () -> new CurioRender("bunnytail_curio",
                BUN_TAIL = new RabbitTailCurio(bakeLayer(CCAMModelLayers.BUN_TAIL))));
        CuriosRendererRegistry.register(ccamItems.BASIC_CURIO.get(), () -> new DyableCurioRenderer("basic_curio",
                BASIC_CURIO = new BasicCurioModel(bakeLayer(CCAMModelLayers.BASIC_CURIO)), 0x5b3a29));
        CuriosRendererRegistry.register(ccamItems.SPURS.get(),
                () -> new CurioRender("spur_curio", SPURS = new SpurCurioModel(bakeLayer(CCAMModelLayers.SPURS))));
        CuriosRendererRegistry.register(ccamItems.HALO.get(),
                () -> new CurioRender("halo_curio", HALO = new HaloCurioModel(bakeLayer(CCAMModelLayers.HALO))));
        CuriosRendererRegistry.register(ccamItems.PONCHO.get(), () -> new CurioRender("poncho_curio",
                PONCHO = new PonchoCurioModel(bakeLayer(CCAMModelLayers.PONCHO))));
        CuriosRendererRegistry.register(ccamItems.PONCHO_SIDE.get(), () -> new CurioRender("ponchoside_curio",
                PONCHO_SIDE = new PonchoSideCurioModel(bakeLayer(CCAMModelLayers.PONCHO_SIDE))));
        CuriosRendererRegistry.register(ccamItems.SUNGLASSES.get(), () -> new CurioRender("sunglasses_curio",
                SUNGLASSES = new SunglassCurioModel(bakeLayer(CCAMModelLayers.SUNGLASS_CURIO))));
    }

    public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot,
            HumanoidModel<?> _default) {
        if (!init) {
            initializeModels();
        }
        if (itemStack.getItem() == ccamItems.ARROW.get()) {
            return ARROW;
        }
        if (itemStack.getItem() == ccamItems.COLT_HELMET.get()) {
            return COLT;
        }
        if (itemStack.getItem() == ccamItems.COLT_CHESATPLATE.get()) {
            return COLT;
        }
        if (itemStack.getItem() == ccamItems.COLT_LEGGINGS.get()) {
            return COLT;
        }
        if (itemStack.getItem() == ccamItems.CONSTRUCTION_HELMET.get()) {
            return CONSTRUCTION_HELMET;
        }
        if (itemStack.getItem() == ccamItems.COW_HELMET.get()) {
            return COW;
        }
        if (itemStack.getItem() == ccamItems.COW_CHESTPLATE.get()) {
            return COW;
        }
        if (itemStack.getItem() == ccamItems.COW_LEGGINGS.get()) {
            return COW;
        }
        if (itemStack.getItem() == ccamItems.COWBOY_HAT.get()) {
            return COWBOY_HAT;
        }
        if (itemStack.getItem() == ccamItems.FLOWER_CROWN.get()) {
            return FLOWER_CROWN;
        }
        if (itemStack.getItem() == ccamItems.FUR_COAT.get()) {
            return FURCOAT;
        }
        if (itemStack.getItem() == ccamItems.GLADIATOR_HELMET.get()) {
            return GLADIATOR;
        }
        if (itemStack.getItem() == ccamItems.GLADIATOR_CHESTPLATE.get()) {
            return GLADIATOR;
        }
        if (itemStack.getItem() == ccamItems.GLADIATOR_LEGGINGS.get()) {
            return GLADIATOR;
        }
        if (itemStack.getItem() == ccamItems.GLADIATOR_BOOTS.get()) {
            return GLADIATOR;
        }
        if (itemStack.getItem() == ccamItems.LONG_SMALL_TOPHAT.get()) {
            return LONG_SMALL_TOPHAT;
        }
        if (itemStack.getItem() == ccamItems.LONG_TOPHAT.get()) {
            return LONG_TOPHAT;
        }
        if (itemStack.getItem() == ccamItems.MAJIMA_CONSTRUCTION_HAT.get()) {
            return MAJIMA_CONSTRUCTION_HAT;
        }
        if (itemStack.getItem() == ccamItems.MONOCLE.get()) {
            return MONOCLE;
        }
        if (itemStack.getItem() == ccamItems.NACHO_SOMBRARO.get()) {
            return NACHO_SOMBRARO;
        }
        if (itemStack.getItem() == ccamItems.SAMURAI_HELMET.get()) {
            return SAMURAI;
        }
        if (itemStack.getItem() == ccamItems.SAMURAI_CHESTPLATE.get()) {
            return SAMURAI;
        }
        if (itemStack.getItem() == ccamItems.SAMURAI_LEGGINGS.get()) {
            return SAMURAI;
        }
        if (itemStack.getItem() == ccamItems.SAMURAI_BOOTS.get()) {
            return SAMURAI;
        }
        if (itemStack.getItem() == ccamItems.SHOT_COWBOY_HAT.get()) {
            return SHOT_COWBOY_HAT;
        }
        if (itemStack.getItem() == ccamItems.SMALL_TOPHAT.get()) {
            return SMALL_TOPHAT;
        }
        if (itemStack.getItem() == ccamItems.SOMBRARO.get()) {
            return SOMBRARO;
        }
        if (itemStack.getItem() == ccamItems.TOPHAT.get()) {
            return TOPHAT.withAnimations(entityLiving);
        }
        if (itemStack.getItem() == ccamItems.TOP_TOP_TOP_HAT.get()) {
            return TOP_TOP_TOPHAT;
        }
        if (itemStack.getItem() == ccamItems.TRAFFIC_CONE.get()) {
            return TRAFFIC_CONE;
        }
        if (itemStack.getItem() == ccamItems.TULIP.get()) {
            return TULIP;
        }
        if (itemStack.getItem() == ccamItems.WITCH_HAT.get()) {
            return WITCH_HAT;
        }
        if (itemStack.getItem() == ccamItems.WOLF_HELMET.get()) {
            return WOLF;
        }
        if (itemStack.getItem() == ccamItems.WOLF_CHESTPLATE.get()) {
            return WOLF;
        }
        if (itemStack.getItem() == ccamItems.WOLF_LEGGINGS.get()) {
            return WOLF;
        }
        if (itemStack.getItem() == ccamItems.WOLF_BOOTS.get()) {
            return WOLF;
        }
        if (itemStack.getItem() == ccamItems.FOURTHOFJULLY.get()) {
            return FOURTHTHEJULLY;
        }
        return _default;
    }

    public static ModelPart bakeLayer(ModelLayerLocation layerLocation) {
        return Minecraft.getInstance().getEntityModels().bakeLayer(layerLocation);
    }
}
