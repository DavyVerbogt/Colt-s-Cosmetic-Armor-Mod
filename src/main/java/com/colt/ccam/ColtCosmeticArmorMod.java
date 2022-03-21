package com.colt.ccam;

import java.util.ArrayList;
import java.util.List;

import com.colt.ccam.client.ClientRefrence;
import com.colt.ccam.client.event.CreativeFilter;
import com.colt.ccam.client.render.CustomArmorRenderProperties;
import com.colt.ccam.client.render.model.CCAMModelLayers;
import com.colt.ccam.registries.ccamBlocks;
import com.colt.ccam.registries.ccamData;
import com.colt.ccam.registries.ccamItems;

import com.colt.ccam.server.dedicated.DedicatedServerReference;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

@Mod(ColtCosmeticArmorMod.MOD_ID)
public class ColtCosmeticArmorMod {

    public static final String MOD_ID = "ccam";
    public static final ISidedReference SIDED_SYSTEM = DistExecutor.safeRunForDist(() -> ClientRefrence::new,
            () -> DedicatedServerReference::new);

    public ColtCosmeticArmorMod() {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigData.SERVER_SPEC);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(),
                forgeEventBus = MinecraftForge.EVENT_BUS;
        ccamData.LoadRecepies(modEventBus);
        SIDED_SYSTEM.setup(modEventBus, forgeEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        addRegistries(modEventBus);
    }

    private void addRegistries(final IEventBus modEventBus) {
        ccamItems.ITEMS.register(modEventBus);
        ccamBlocks.BLOCK.register(modEventBus);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::setupEntityModelLayers);
        modEventBus.addListener(this::CurioRenderReader);
        modEventBus.addListener(this::SewingScreenLoader);
        MinecraftForge.EVENT_BUS.register(new CreativeFilter());
    }

    private void CurioRenderReader(final FMLClientSetupEvent event)
    {
        CustomArmorRenderProperties.CurioRenderReader(event);
    }

    private void setupEntityModelLayers(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        CCAMModelLayers.register(event);
    }

    private void SewingScreenLoader(final FMLClientSetupEvent event)
    {
        ccamData.SewingTableScreen();
    }

    @SubscribeEvent
    public void enqueueIMC(final InterModEnqueueEvent event) {

        SlotTypePreset[] slots = { SlotTypePreset.HEAD, SlotTypePreset.NECKLACE, SlotTypePreset.BACK,
                SlotTypePreset.BODY, SlotTypePreset.HANDS, SlotTypePreset.RING, SlotTypePreset.CHARM,
                SlotTypePreset.BELT };
        List<SlotTypeMessage.Builder> builders = new ArrayList<>();
        for (SlotTypePreset slot : slots) {
            SlotTypeMessage.Builder builder = slot.getMessageBuilder();
            if (slot == SlotTypePreset.RING) {
                builder.size(2);
            }
            builder.cosmetic();
            builders.add(builder);
        }
        for (SlotTypeMessage.Builder builder : builders) {
            SlotTypeMessage message = builder.build();
            InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> message);
        }
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("feet").priority(220).icon(InventoryMenu.EMPTY_ARMOR_SLOT_BOOTS).build());
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("tail").priority(90).icon(new ResourceLocation("curios:slot/tail_slot")).build());

    }

    /*
     * public void modConfig(ModConfig.ModConfigEvent event) { ModConfig config =
     * event.getConfig(); if (config.getSpec() == ConfigData.SERVER_SPEC)
     * .refreshServer(); }
     */
}
