package com.colt.ccam.armor;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.client.render.entity.model.BasicArmorModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurio.RenderHelper;
import top.theillusivec4.curios.common.capability.CurioItemCapability;

public class BasicArmorItem extends ArmorItem implements IDyeableArmorItem {

    private static final ResourceLocation TEXTURE = new ResourceLocation(ColtCosmeticArmorMod.MOD_ID,
            "textures/models/armor/basic_layer_1.png");

    public BasicArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
            EquipmentSlotType armorSlot, A _default) {
        return ColtCosmeticArmorMod.SIDED_SYSTEM.getBasicArmorModel(armorSlot);
    }

    public int getColor(ItemStack stack) {
        CompoundNBT lvt_2_1_ = stack.getChildTag("display");
        return lvt_2_1_ != null && lvt_2_1_.contains("color", 99) ? lvt_2_1_.getInt("color") : 0XF1F6FC;
    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT unused) {
        return CurioItemCapability.createProvider(new ICurio() {
            private Object model;

            @Override
            public void curioTick(String identifier, int index, LivingEntity livingEntity) {
                if (!livingEntity.getEntityWorld().isRemote && livingEntity.ticksExisted % 20 == 0) {
                    livingEntity.addPotionEffect(new EffectInstance(Effects.GLOWING, 300, -1, true, true));
                }
            }

            @Override
            public boolean canRender(String identifier, int index, LivingEntity livingEntity) {
                return true;
            }

            @Override
            public void render(String identifier, int index, MatrixStack matrixStack,
                    IRenderTypeBuffer renderTypeBuffer, int light, LivingEntity livingEntity, float limbSwing,
                    float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

                if (!(this.model instanceof BasicArmorModel)) {
                    model = new BasicArmorModel(1f);
                }
                BasicArmorModel renderer = (BasicArmorModel) this.model;
                ICurio.RenderHelper.followHeadRotations(livingEntity, renderer.bipedHeadwear);
                IVertexBuilder vertexBuilder = ItemRenderer.getBuffer(renderTypeBuffer, renderer.getRenderType(TEXTURE),
                        false, stack.hasEffect());
                renderer.render(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            @Override
            public boolean hasEffect(@Nonnull ItemStack stack) {
                return true;
            }
        });
    }
}
