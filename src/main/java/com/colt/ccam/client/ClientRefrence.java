package com.colt.ccam.client;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.ISidedReference;
import com.colt.ccam.client.render.entity.model.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.PlayerContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class ClientRefrence implements ISidedReference {

    private final WitchHatArmorModel witchArmorModel = new WitchHatArmorModel(1.0f);
    private final WitchHatArmorModel witchArmorLeggings = new WitchHatArmorModel(0.5f);
    private final ColtArmorModel coltArmorModel = new ColtArmorModel(1.0f);
    private final ColtArmorModel coltArmorLeggings = new ColtArmorModel(0.5f);
    private final TulipArmorModel tulipArmorModel = new TulipArmorModel(1.0f);
    private final TulipArmorModel tulipArmorLeggings = new TulipArmorModel(0.5f);
    private final FlowerCrownArmorModel flowerCorwnArmorModel = new FlowerCrownArmorModel(1.0f);
    private final FlowerCrownArmorModel flowerCorwnArmorLeggings = new FlowerCrownArmorModel(0.5f);
    private final CowBoyHatArmorModel cowBoyHatArmorModel = new CowBoyHatArmorModel(1.0f);
    private final CowBoyHatArmorModel cowBoyHatArmorLeggings = new CowBoyHatArmorModel(0.5f);
    private final TrafficConeArmorModel trafficConeArmorModel = new TrafficConeArmorModel(1.0f);
    private final TrafficConeArmorModel trafficConeArmorLeggings = new TrafficConeArmorModel(0.5f);
    private final TopHatModel topHatArmorModel = new TopHatModel(1.0f);
    private final TopHatModel topHatArmorLeggings = new TopHatModel(0.5f);
    private final SmallTopHatArmorModel smallTopHatArmorModel = new SmallTopHatArmorModel(1.0f);
    private final SmallTopHatArmorModel smallTopHatArmorLeggings = new SmallTopHatArmorModel(0.5f);
    private final MonocleArmorModel monocleArmorModel = new MonocleArmorModel(1.0f);
    private final MonocleArmorModel monocleArmorLeggings = new MonocleArmorModel(0.5f);
    private final GladiatorArmorModel gladiatorArmorModel = new GladiatorArmorModel(1.0f);
    private final GladiatorArmorModel gladiatorArmorLeggings = new GladiatorArmorModel(0.5f);
    private final ConstructionArmorModel constructionArmorModel = new ConstructionArmorModel(1.0f);
    private final ConstructionArmorModel constructionArmorLeggings = new ConstructionArmorModel(0.5f);
    private final ArrowArmorModel arrowArmorModel = new ArrowArmorModel(1.0f);
    private final ArrowArmorModel arrowArmorLeggings = new ArrowArmorModel(0.5f);
    private final LongSmalTophatArmorModel longSmallTopHatArmorModel = new LongSmalTophatArmorModel(1.0f);
    private final LongSmalTophatArmorModel longSmallTopHatArmorLeggings = new LongSmalTophatArmorModel(0.5f);
    private final WolfArmorModel wolfArmorModel = new WolfArmorModel(1.0f);
    private final WolfArmorModel wolfArmorLeggings = new WolfArmorModel(0.5f);
    private final TopTopTopHatModel topTopTopHatArmorModel = new TopTopTopHatModel(1.0f);
    private final TopTopTopHatModel topTopTopHatArmorLeggings = new TopTopTopHatModel(0.5f);
    private final LongTopHatArmorModel longTopHatArmorModel = new LongTopHatArmorModel(1.0f);
    private final LongTopHatArmorModel longTopHatArmorLeggings = new LongTopHatArmorModel(0.5f);
    private final MajimaContructionHatArmorModel majimaContructionHatArmorModel = new MajimaContructionHatArmorModel(
            1.0f);
    private final MajimaContructionHatArmorModel majimaContructionHatArmorLeggings = new MajimaContructionHatArmorModel(
            0.5f);
    private final NachoSombraroArmorModel nachoSombraroArmorModel = new NachoSombraroArmorModel(1.0f);
    private final NachoSombraroArmorModel nachoSombraroArmorLeggings = new NachoSombraroArmorModel(0.5f);
    private final SombreroArmorModel sombraroArmorModel = new SombreroArmorModel(1.0f);
    private final SombreroArmorModel sombraroArmorLeggings = new SombreroArmorModel(0.5f);
    private final BasicArmorModel basicArmorModel = new BasicArmorModel(1.0f);
    private final BasicArmorModel basicArmorLeggings = new BasicArmorModel(0.5f);
    private final FurCoatArmorModel furCoatArmorModel = new FurCoatArmorModel(1.0f);
    private final FurCoatArmorModel furCoatArmorLeggings = new FurCoatArmorModel(0.5f);
    private final SamuraiArmorModel samuraiArmorModel = new SamuraiArmorModel(1.0f);
    private final SamuraiArmorModel samuraiArmorLeggings = new SamuraiArmorModel(0.5f);
    private final CowArmorModel cowArmorModel = new CowArmorModel(1.0f);
    private final CowArmorModel cowArmorLeggings = new CowArmorModel(0.5f);
    private final ShotCowBoyHatArmorModel ShotCowBoyHatArmorModel = new ShotCowBoyHatArmorModel(1.0f);
    private final ShotCowBoyHatArmorModel ShotCowBoyHatArmorLeggings = new ShotCowBoyHatArmorModel(0.5f);
    private final StrawHayArmorModel StrawHatArmorModel = new StrawHayArmorModel(1.0f);
    private final StrawHayArmorModel StrawHatArmorLeggings = new StrawHayArmorModel(0.5f);

    @Override
    public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getWitchArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? witchArmorLeggings : witchArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getColtArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? coltArmorLeggings : coltArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTulipArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? tulipArmorLeggings : tulipArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getFlowerCrownArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? flowerCorwnArmorLeggings : flowerCorwnArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getCowBoyArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? cowBoyHatArmorLeggings : cowBoyHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A gettrafficConeArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? trafficConeArmorLeggings : trafficConeArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? topHatArmorLeggings : topHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getSmallTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? smallTopHatArmorLeggings : smallTopHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getMonocleArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? monocleArmorLeggings : monocleArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getGladiatorArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? gladiatorArmorLeggings : gladiatorArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getConstructionArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? constructionArmorLeggings : constructionArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getArrowArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? arrowArmorLeggings : arrowArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getLongSmallTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? longSmallTopHatArmorLeggings : longSmallTopHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getWolfArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? wolfArmorLeggings : wolfArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getTopTopTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? topTopTopHatArmorLeggings : topTopTopHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getLongTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? longTopHatArmorLeggings : longTopHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getMajimaContructionHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? majimaContructionHatArmorLeggings
                : majimaContructionHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getNachoSombraroArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? nachoSombraroArmorLeggings : nachoSombraroArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getSombraroArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? sombraroArmorLeggings : sombraroArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getBasicArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? basicArmorLeggings : basicArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getFurCoatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? furCoatArmorLeggings : furCoatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getSamuraiArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? samuraiArmorLeggings : samuraiArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getCowArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? cowArmorLeggings : cowArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getShotCowBoyHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? ShotCowBoyHatArmorLeggings : ShotCowBoyHatArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getStrawHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? StrawHatArmorLeggings : StrawHatArmorModel);
    }

}