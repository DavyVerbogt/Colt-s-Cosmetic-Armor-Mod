package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class BasicCurioModel extends BipedModel<LivingEntity> {
    public BasicCurioModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);
        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        

        ModelRenderer Belt = new ModelRenderer(this);
        Belt.setRotationPoint(0.0F, -1.0F, 0.0F);
        bipedBody.addChild(Belt);
        Belt.setTextureOffset(0, 59).addBox(-4.0F, 11.7F, -2.0F, 8.0F, 1.0F, 4.0F, 0.3F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
