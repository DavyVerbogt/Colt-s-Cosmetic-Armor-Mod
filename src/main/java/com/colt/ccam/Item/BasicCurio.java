
package com.colt.ccam.Item;

import java.util.List;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.curio.CurioItem;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.type.capability.ICurio;


public class BasicCurio extends CurioItem implements DyeableLeatherItem {

    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, "textures/models/curio/basic_curio.png");
    
    public int getColor(ItemStack stack) {
        CompoundTag lvt_2_1_ = stack.getTagElement("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0XF1F6FC;
    }

    @Override
    protected ResourceLocation getTexture() {
        return TEXTURE;
    }
}
