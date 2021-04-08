package com.colt.ccam.curio;


import com.colt.ccam.registries.ccamItems;
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
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
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

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class CurioArmorItem extends ArmorItem implements ICurioItem {

    public CurioArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    private Object model;

    protected boolean isEquippedBy(@Nullable LivingEntity entity) {
        return entity != null && CuriosApi.getCuriosHelper().findEquippedCurio(this, entity).isPresent();
    }

    protected <T extends Event> void addListener(EventPriority priority, Class<T> eventClass, Consumer<T> listener, Function<T, LivingEntity> livingEntitySupplier) {
        MinecraftForge.EVENT_BUS.addListener(priority, true, eventClass, event -> {
            if (isEquippedBy(livingEntitySupplier.apply(event))) {
                listener.accept(event);
            }
        });
    }

    protected <T extends Event> void addListener(Class<T> eventClass, Consumer<T> listener, Function<T, LivingEntity> livingEntitySupplier) {
        addListener(EventPriority.NORMAL, eventClass, listener, livingEntitySupplier);
    }

    protected <T extends LivingEvent> void addListener(EventPriority priority, Class<T> eventClass, Consumer<T> listener) {
        addListener(priority, eventClass, listener, LivingEvent::getEntityLiving);
    }

    protected <T extends LivingEvent> void addListener(Class<T> eventClass, Consumer<T> listener) {
        addListener(EventPriority.NORMAL, eventClass, listener);
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return true;
    }

    @Override
    public boolean canRender(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        return true;
    }

    @Override
    public void render(String identifier, int index, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, LivingEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, ItemStack stack) {
        BipedModel<LivingEntity> model = getModel();
        //model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        //model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
        ICurio.RenderHelper.followBodyRotations(entity, model);
        IVertexBuilder vertexBuilder = ItemRenderer.getBuffer(renderTypeBuffer, model.getRenderType(getTexture()),
        false, stack.hasEffect());
        model.render(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    @OnlyIn(Dist.CLIENT)
    protected final BipedModel<LivingEntity> getModel() {
        if (model == null) {
            model = createModel();
        }
        return (BipedModel<LivingEntity>) model;
    }

    @OnlyIn(Dist.CLIENT)
    protected abstract BipedModel<LivingEntity> createModel();

    protected abstract ResourceLocation getTexture();
}