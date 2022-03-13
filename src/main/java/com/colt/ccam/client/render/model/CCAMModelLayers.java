package com.colt.ccam.client.render.model;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;

@OnlyIn(Dist.CLIENT)
public class CCAMModelLayers {

    public static final ModelLayerLocation ARROW = createLocation("arrow", "main");
    public static final ModelLayerLocation BASIC = createLocation("basic", "main");
    public static final ModelLayerLocation COLT = createLocation("colt", "main");
    public static final ModelLayerLocation CONSTRUCTION_HELMET = createLocation("constructionhelmet", "main");
    public static final ModelLayerLocation COW = createLocation("cow", "main");
    public static final ModelLayerLocation COWBOY_HAT = createLocation("cowboyhat", "main");
    public static final ModelLayerLocation FLOWER_CROWN = createLocation("flowercrown", "main");
    public static final ModelLayerLocation FURCOAT = createLocation("furcoat", "main");
    public static final ModelLayerLocation GLADIATOR = createLocation("gladiator", "main");
    public static final ModelLayerLocation LONG_SMALL_TOPHAT = createLocation("longsmalltophat", "main");
    public static final ModelLayerLocation LONG_TOPHAT = createLocation("longtophat", "main");
    public static final ModelLayerLocation MAJIMA_CONSTRUCTION_HAT = createLocation("majimaconstructionhat", "main");
    public static final ModelLayerLocation MONOCLE = createLocation("monocle", "main");
    public static final ModelLayerLocation NACHO_SOMBRARO = createLocation("nachosombraro", "main");
    public static final ModelLayerLocation SAMURAI = createLocation("samurai", "main");
    public static final ModelLayerLocation SHOT_COWBOY_HAT = createLocation("shotcowboyhat", "main");
    public static final ModelLayerLocation SMALL_TOPHAT = createLocation("smalltophat", "main");
    public static final ModelLayerLocation SOMBRARO = createLocation("sombraro", "main");
    public static final ModelLayerLocation TOPHAT = createLocation("tophat", "main");
    public static final ModelLayerLocation TOP_TOP_TOPHAT = createLocation("toptoptophat", "main");
    public static final ModelLayerLocation TRAFFIC_CONE = createLocation("trafficcone", "main");
    public static final ModelLayerLocation TULIP = createLocation("tulip", "main");
    public static final ModelLayerLocation WITCH_HAT = createLocation("witchhat", "main");
    public static final ModelLayerLocation WOLF = createLocation("wolf", "main");



    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ARROW, () -> ArrowArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(BASIC, () -> BasicArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(COLT, () -> ColtArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(CONSTRUCTION_HELMET, () -> ConstructionArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
        event.registerLayerDefinition(COW, () -> CowArmorModel.createArmorLayer(new CubeDeformation(1f)));
        event.registerLayerDefinition(COWBOY_HAT, () -> CowArmorModel.createArmorLayer(new CubeDeformation(0.5f)));
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
    }

    private static ModelLayerLocation createLocation(String model, String layer) {
        return new ModelLayerLocation(new ResourceLocation("ccam", model), layer);
    }
}
