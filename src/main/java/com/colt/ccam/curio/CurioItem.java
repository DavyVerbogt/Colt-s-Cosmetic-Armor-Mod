package com.colt.ccam.curio;


import com.colt.ccam.registries.ccamCurio;
import com.colt.ccam.registries.ccamItems;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import net.minecraft.nbt.CompoundTag;
import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class CurioItem extends ccamCurio implements ICurioItem {

    public static List<Float> getColors(ItemStack stack) {
        List<Float> colors = new ArrayList<Float>();
        CompoundTag lvt_2_1_ = stack.getTagElement("display");
        int color = lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0X9B2D2A;
        colors.add(((color >> 16) & 0xff) / 255.0f); // red
        colors.add(((color >> 8) & 0xff) / 255.0f); // green
        colors.add(((color) & 0xff) / 255.0f); // blue
        colors.add(((color >> 24) & 0xff) / 255.0f); // alpha
        return colors;
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return true;
    }

    protected abstract ResourceLocation getTexture();
}