package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SombreroArmorModel extends BipedModel<LivingEntity> {

	public SombreroArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 128);

		ModelRenderer Sombraro = new ModelRenderer(this);
		Sombraro.setRotationPoint(-2.0F, 0.6F, 0.0F);
		bipedHead.addChild(Sombraro);
		setRotationAngle(Sombraro, -0.3054F, 0.0F, 0.3054F);
		Sombraro.setTextureOffset(0, 87).addBox(-5.0F, -8.0F, -9.0F, 10.0F, 1.0F, 18.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 106).addBox(-9.0F, -8.0F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 106).addBox(5.0F, -8.0F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-7.0F, -8.0F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(5.0F, -8.0F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-7.0F, -8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(5.0F, -8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(8.0F, -9.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-9.0F, -9.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 71).addBox(-5.0F, -9.0F, -9.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 71).addBox(-5.0F, -9.0F, 8.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(-7.0F, -9.0F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(-8.0F, -9.0F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(5.0F, -9.0F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(7.0F, -9.0F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(-7.0F, -9.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(-8.0F, -9.0F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(5.0F, -9.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(7.0F, -9.0F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(20, 71).addBox(-3.0F, -10.0F, -4.0F, 6.0F, 2.0F, 8.0F, 0.1F, false);
		Sombraro.setTextureOffset(12, 75).addBox(-4.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.1F, false);
		Sombraro.setTextureOffset(0, 87).addBox(3.0F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.1F, false);
		Sombraro.setTextureOffset(0, 68).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 68).addBox(-2.0F, -11.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 78).addBox(-3.0F, -11.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 78).addBox(2.0F, -11.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 66).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}