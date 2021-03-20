package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class LongTopHatArmorModel extends BipedModel<LivingEntity> {

    public LongTopHatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

        ModelRenderer LongTopHat = new ModelRenderer(this);
        LongTopHat.setRotationPoint(0.0F, -7F, 0.0F);
        bipedHead.addChild(LongTopHat);
        setRotationAngle(LongTopHat, -0.1309F, 0.0F , 0.0F);
        LongTopHat.setTextureOffset(32, 32).addBox(-4.0F, -25.5F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);
        LongTopHat.setTextureOffset(32, 54).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 1.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
