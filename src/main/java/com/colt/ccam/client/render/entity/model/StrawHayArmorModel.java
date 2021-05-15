package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StrawHayArmorModel extends BipedModel<LivingEntity> {

	public StrawHayArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64); 

		ModelRenderer Hat = new ModelRenderer(this);
		Hat.setRotationPoint(0.0F, 26.0F, 0.0F);
		bipedHead.addChild(Hat);
		Hat.setTextureOffset(0, 48).addBox(-8.0F, -31.9F, -8.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);

		ModelRenderer Top = new ModelRenderer(this);
		Top.setRotationPoint(0.0F, -1.0F, 0.0F);
		Hat.addChild(Top);
		Top.setTextureOffset(2, 53).addBox(4.0F, -33.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.1F, false);
		Top.setTextureOffset(2, 53).addBox(-5.0F, -33.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.1F, false);
		Top.setTextureOffset(2, 61).addBox(-3.0F, -33.0F, 4.0F, 6.0F, 2.0F, 1.0F, 0.1F, false);
		Top.setTextureOffset(2, 61).addBox(-3.0F, -33.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.1F, false);
		Top.setTextureOffset(0, 37).addBox(-4.0F, -34.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.1F, false);
		Top.setTextureOffset(24, 38).addBox(-3.0F, -35.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.1F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}