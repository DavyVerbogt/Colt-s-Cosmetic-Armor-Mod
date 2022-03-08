package com.colt.ccam;

import java.util.ArrayList;
import java.util.List;

import com.colt.ccam.client.ClientRefrence;
import com.colt.ccam.data.ConfigData;
import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.server.dedicated.DedicatedServerReference;

import net.minecraft.inventory.container.PlayerContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

import net.minecraftforge.fml.config.ModConfig;

@Mod(ColtCosmeticArmorMod.MOD_ID)
public class ColtCosmeticArmorMod {

    public static final String MOD_ID = "ccam";
    public static final ISidedReference SIDED_SYSTEM = DistExecutor.safeRunForDist(() -> ClientRefrence::new,
            () -> DedicatedServerReference::new);

    public ColtCosmeticArmorMod() {
       //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigData.SERVER_SPEC);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(),
                forgeEventBus = MinecraftForge.EVENT_BUS;
        SIDED_SYSTEM.setup(modEventBus, forgeEventBus);

        addRegistries(modEventBus);
    }

    private void addRegistries(final IEventBus modEventBus) {
        ccamItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::enqueueIMC);
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
        final ResourceLocation TailSlot = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/item/tail_slot.png");
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("feet").priority(220).icon(PlayerContainer.EMPTY_ARMOR_SLOT_BOOTS).build());
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("tail").priority(90).icon(TailSlot).build());
    }
    /*
     * public void modConfig(ModConfig.ModConfigEvent event) { ModConfig config =
     * event.getConfig(); if (config.getSpec() == ConfigData.SERVER_SPEC)
     * .refreshServer(); }
     */
}