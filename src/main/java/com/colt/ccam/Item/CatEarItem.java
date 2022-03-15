package com.colt.ccam.Item;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.curio.CurioItem;

import net.minecraft.resources.ResourceLocation;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class CatEarItem extends CurioItem
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/models/curio/catears_curio.png");

    protected ResourceLocation getTexture() {
        return TEXTURE;
    }
}
