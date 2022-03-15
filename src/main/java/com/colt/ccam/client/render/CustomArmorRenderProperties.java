package com.colt.ccam.client.render;

import com.colt.ccam.client.render.model.*;
import com.colt.ccam.curio.render.CurioModelLayers;
import com.colt.ccam.curio.render.model.CatEarCurioModel;
import com.colt.ccam.registries.ccamItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;

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
    public static CatEarCurioModel CAT_EARS;

    public static void initializeModels() {

        init=true;
        ARROW = new ArrowArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.ARROW));
        BASIC = new BasicArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.BASIC));
        COLT = new ColtArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.COLT));
        CONSTRUCTION_HELMET = new ConstructionArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.CONSTRUCTION_HELMET));
        COW = new CowArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.COW));
        COWBOY_HAT = new CowBoyHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.COWBOY_HAT));
        FLOWER_CROWN = new FlowerCrownArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.FLOWER_CROWN));
        FURCOAT = new FurCoatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.FURCOAT));
        GLADIATOR = new GladiatorArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.GLADIATOR));
        LONG_SMALL_TOPHAT = new LongSmalTophatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.LONG_SMALL_TOPHAT));
        LONG_TOPHAT = new LongTopHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.LONG_TOPHAT));
        MAJIMA_CONSTRUCTION_HAT = new MajimaContructionHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.MAJIMA_CONSTRUCTION_HAT));
        MONOCLE = new MonocleArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.MONOCLE));
        NACHO_SOMBRARO = new NachoSombraroArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.NACHO_SOMBRARO));
        SAMURAI = new SamuraiArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.SAMURAI));
        SHOT_COWBOY_HAT = new ShotCowBoyHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.SHOT_COWBOY_HAT));
        SMALL_TOPHAT = new SmallTopHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.SMALL_TOPHAT));
        SOMBRARO = new SombreroArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.SOMBRARO));
        TOPHAT = new TopHatModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.TOPHAT));
        TOP_TOP_TOPHAT = new TopTopTopHatModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.TOP_TOP_TOPHAT));
        TRAFFIC_CONE = new TrafficConeArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.TRAFFIC_CONE));
        TULIP = new TulipArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.TULIP));
        WITCH_HAT = new WitchHatArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.WITCH_HAT));
        WOLF = new WolfArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(CCAMModelLayers.WOLF));
    }

    public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
        if (!init) {
            initializeModels();
        }
        if(itemStack.getItem() == ccamItems.ARROW.get())
        {
            return ARROW;
        }
        if(itemStack.getItem() == ccamItems.BASIC_HELMET.get())
        {
            return BASIC;
        }
        if(itemStack.getItem() == ccamItems.BASIC_CHESTPLATE.get())
        {
            return BASIC;
        }
        if(itemStack.getItem() == ccamItems.BASIC_BOOTS.get())
        {
            return BASIC;
        }
        if(itemStack.getItem() == ccamItems.BASIC_BOOTS.get())
        {
            return BASIC;
        }
        if(itemStack.getItem() == ccamItems.COLT_HELMET.get())
        {
            return COLT;
        }
        if(itemStack.getItem() == ccamItems.COLT_CHESATPLATE.get())
        {
            return COLT;
        }
        if(itemStack.getItem() == ccamItems.COLT_LEGGINGS.get())
        {
            return COLT;
        }
        if(itemStack.getItem() == ccamItems.CONSTRUCTION_HELMET.get())
        {
            return CONSTRUCTION_HELMET;
        }
        if(itemStack.getItem() == ccamItems.COW_HELMET.get())
        {
            return COW;
        }
        if(itemStack.getItem() == ccamItems.COW_CHESTPLATE.get())
        {
            return COW;
        }
        if(itemStack.getItem() == ccamItems.COW_LEGGINGS.get())
        {
            return COW;
        }
        if(itemStack.getItem() == ccamItems.COWBOY_HAT.get())
        {
            return COWBOY_HAT;
        }
        if(itemStack.getItem() == ccamItems.FLOWER_CROWN.get())
        {
            return FLOWER_CROWN;
        }
        if(itemStack.getItem() == ccamItems.FUR_COAT.get())
        {
            return FURCOAT;
        }
        if(itemStack.getItem() == ccamItems.GLADIATOR_HELMET.get())
        {
            return GLADIATOR;
        }
        if(itemStack.getItem() == ccamItems.GLADIATOR_CHESTPLATE.get())
        {
            return GLADIATOR;
        }
        if(itemStack.getItem() == ccamItems.GLADIATOR_LEGGINGS.get())
        {
            return GLADIATOR;
        }
        if(itemStack.getItem() == ccamItems.GLADIATOR_BOOTS.get())
        {
            return GLADIATOR;
        }
        if(itemStack.getItem() == ccamItems.LONG_SMALL_TOPHAT.get())
        {
            return LONG_SMALL_TOPHAT;
        }
        if(itemStack.getItem() == ccamItems.LONG_TOPHAT.get())
        {
            return LONG_TOPHAT;
        }
        if(itemStack.getItem() == ccamItems.MAJIMA_CONSTRUCTION_HAT.get())
        {
            return MAJIMA_CONSTRUCTION_HAT;
        }
        if(itemStack.getItem() == ccamItems.MONOCLE.get())
        {
            return MONOCLE;
        }
        if(itemStack.getItem() == ccamItems.NACHO_SOMBRARO.get())
        {
            return NACHO_SOMBRARO;
        }
        if(itemStack.getItem() == ccamItems.SAMURAI_HELMET.get())
        {
            return SAMURAI;
        }
        if(itemStack.getItem() == ccamItems.SAMURAI_CHESTPLATE.get())
        {
            return SAMURAI;
        }
        if(itemStack.getItem() == ccamItems.SAMURAI_LEGGINGS.get())
        {
            return SAMURAI;
        }
        if(itemStack.getItem() == ccamItems.SAMURAI_BOOTS.get())
        {
            return SAMURAI;
        }
        if(itemStack.getItem() == ccamItems.SHOT_COWBOY_HAT.get())
        {
            return SHOT_COWBOY_HAT;
        }
        if(itemStack.getItem() == ccamItems.SMALL_TOPHAT.get())
        {
            return SMALL_TOPHAT;
        }
        if(itemStack.getItem() == ccamItems.SOMBRARO.get())
        {
            return SOMBRARO;
        }
        if(itemStack.getItem() == ccamItems.TOPHAT.get())
        {
            return TOPHAT;
        }
        if(itemStack.getItem() == ccamItems.TOP_TOP_TOP_HAT.get())
        {
            return TOP_TOP_TOPHAT;
        }
        if(itemStack.getItem() == ccamItems.TRAFFIC_CONE.get())
        {
            return TRAFFIC_CONE;
        }
        if(itemStack.getItem() == ccamItems.TULIP.get())
        {
            return TULIP;
        }
        if(itemStack.getItem() == ccamItems.WITCH_HAT.get())
        {
            return WITCH_HAT;
        }
        if(itemStack.getItem() == ccamItems.WOLF_HELMET.get())
        {
            return WOLF;
        }
        if(itemStack.getItem() == ccamItems.WOLF_CHESTPLATE.get())
        {
            return WOLF;
        }
        if(itemStack.getItem() == ccamItems.WOLF_LEGGINGS.get())
        {
            return WOLF;
        }
        if(itemStack.getItem() == ccamItems.WOLF_BOOTS.get())
        {
            return WOLF;
        }
        return _default;
    }
}
