package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TopHatModel extends BipedModel<LivingEntity> {

	public TopHatModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer TopHat = new ModelRenderer(this);
		TopHat.setRotationPoint(0.0F, -6.5F, 0.0F);
		bipedHead.addChild(TopHat);
		setRotationAngle(TopHat, -0.1309F, 0.0F, 0.0F);
		TopHat.setTextureOffset(32, 48).addBox(-4.0F, -9.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
		TopHat.setTextureOffset(32, 54).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 1.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}