package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class MonocleArmorModel extends BipedModel<LivingEntity> {

	public MonocleArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Monical = new ModelRenderer(this);
		Monical.setRotationPoint(-2.0F, -3.0F, -4.5F);
		bipedHead.addChild(Monical);
		Monical.setTextureOffset(58, 60).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(58, 62).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(54, 58).addBox(1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(54, 61).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(50, 61).addBox(-2.0F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(50, 59).addBox(-3.0F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(44, 61).addBox(-4.0F, 2.0F, 0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Monical.setTextureOffset(46, 59).addBox(-4.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Monical.setTextureOffset(38, 61).addBox(-3.0F, 1.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Monical.setTextureOffset(37, 58).addBox(-3.0F, 0.0F, 2.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}