
package com.colt.ccam.Item;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.render.entity.model.curio.BasicCurioModel;
import com.colt.ccam.curio.CurioItem;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class BasicCurio extends CurioItem{

    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/models/curio/basic_curio.png");

    @Override
    @OnlyIn(Dist.CLIENT)
    protected BipedModel<LivingEntity> createModel() {
        return new BasicCurioModel(1f);
    }

    @Override
    protected ResourceLocation getTexture() {
        return TEXTURE;
    }
}
