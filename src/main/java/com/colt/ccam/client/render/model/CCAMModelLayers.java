package com.colt.ccam.client.render.model;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.intergration.curio.render.model.*;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;

@OnlyIn(Dist.CLIENT)
public class CCAMModelLayers {

    public static final ModelLayerLocation
ARROW = createLocation("arrow", "main"),
COLT = createLocation("colt", "main"),
CONSTRUCTION_HELMET = createLocation("constructionhelmet", "main"),
COW = createLocation("cow", "main"),
COWBOY_HAT = createLocation("cowboyhat", "main"),
FLOWER_CROWN = createLocation("flowercrown", "main"),
FURCOAT = createLocation("furcoat", "main"),
GLADIATOR = createLocation("gladiator", "main"),
LONG_SMALL_TOPHAT = createLocation("longsmalltophat", "main"),
LONG_TOPHAT = createLocation("longtophat", "main"),
MAJIMA_CONSTRUCTION_HAT = createLocation("majimaconstructionhat", "main"),
MONOCLE = createLocation("monocle", "main"),
NACHO_SOMBRARO = createLocation("nachosombraro", "main"),
SAMURAI = createLocation("samurai", "main"),
SHOT_COWBOY_HAT = createLocation("shotcowboyhat", "main"),
SMALL_TOPHAT = createLocation("smalltophat", "main"),
SOMBRARO = createLocation("sombraro", "main"),
TOPHAT = createLocation("tophat", "main"),
TOP_TOP_TOPHAT = createLocation("toptoptophat", "main"),
 TRAFFIC_CONE = createLocation("trafficcone", "main"),
TULIP = createLocation("tulip", "main"),
 WITCH_HAT = createLocation("witchhat", "main"),
 WOLF = createLocation("wolf", "main"),
            FOURTHTHEJULLY = createLocation("fourththejully", "main"),
    //Curio
    CAT_EARS = createLocation("catears","main"),
    CAT_TAIL = createLocation("cattail","main"),
    DOG_EARS = createLocation("dogears","main"),
    DOG_TAIL = createLocation("dogtail","main"),
    BUN_EARS = createLocation("bunears","main"),
    BUN_TAIL = createLocation("buntail","main"),
    PONCHO = createLocation("poncho","main"),
    PONCHO_SIDE = createLocation("ponchoside","main"),
    HALO = createLocation("halo","main"),
    SPURS = createLocation("spurs","main"),
    BASIC_CURIO = createLocation("basiccurio","main"),
            SUNGLASS_CURIO = createLocation("sunglass","main");

    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ARROW, () -> ArrowArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(COLT, () -> ColtArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(CONSTRUCTION_HELMET, () -> ConstructionArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(COW, () -> CowArmorModel.createArmorLayer(new CubeDeformation(1f)));
        event.registerLayerDefinition(COWBOY_HAT, () -> CowBoyHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(FLOWER_CROWN, () -> FlowerCrownArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(FURCOAT, () -> FurCoatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(GLADIATOR, () -> GladiatorArmorModel.createArmorLayer(new CubeDeformation(1f)));
        event.registerLayerDefinition(LONG_SMALL_TOPHAT, () -> LongSmalTophatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(LONG_TOPHAT, () -> LongTopHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(MAJIMA_CONSTRUCTION_HAT, () -> MajimaContructionHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(MONOCLE, () -> MonocleArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(NACHO_SOMBRARO, () -> NachoSombraroArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(SAMURAI, () -> SamuraiArmorModel.createArmorLayer(new CubeDeformation(1f)));
        event.registerLayerDefinition(SHOT_COWBOY_HAT, () -> ShotCowBoyHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(SMALL_TOPHAT, () -> SmallTopHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(SOMBRARO, () -> SombreroArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(TOPHAT, () -> TopHatModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(TOP_TOP_TOPHAT, () -> TopTopTopHatModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(TRAFFIC_CONE, () -> TrafficConeArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(TULIP, () -> TulipArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(WITCH_HAT, () -> WitchHatArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(WOLF, () -> WolfArmorModel.createArmorLayer(new CubeDeformation(1f)));
        event.registerLayerDefinition(FOURTHTHEJULLY, () -> FourthOfJullyModel.createArmorLayer(new CubeDeformation(1f)));
//Curio
        event.registerLayerDefinition(CAT_EARS, () -> CatEarCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(CAT_TAIL, () -> CatTailCurio.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(DOG_EARS, () -> DogEarsCurio.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(DOG_TAIL, () -> DogTailCurio.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(BUN_EARS, () -> RabitEarsCurio.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(BUN_TAIL, () -> RabbitTailCurio.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(HALO, () -> HaloCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(PONCHO, () -> PonchoCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(PONCHO_SIDE, () -> PonchoSideCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(SPURS, () -> SpurCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(BASIC_CURIO, () -> BasicCurioModel.createCurioModel(new CubeDeformation(1f)));
        event.registerLayerDefinition(SUNGLASS_CURIO, () -> SunglassCurioModel.createCurioModel(new CubeDeformation(1f)));
    }

    private static ModelLayerLocation createLocation(String model, String layer) {
        return new ModelLayerLocation(new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, model), layer);
    }
}
