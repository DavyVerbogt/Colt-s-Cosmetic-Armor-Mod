package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class MajimaContructionHatArmorModel extends BipedModel<LivingEntity> {

	public MajimaContructionHatArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer MajimaConstructionHat = new ModelRenderer(this);
		MajimaConstructionHat.setRotationPoint(0.0F, 0F, 0.0F);
		bipedHead.addChild(MajimaConstructionHat);
		MajimaConstructionHat.setTextureOffset(28, 53).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(46, 44).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(46, 44).addBox(4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(0, 55).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(6, 51).addBox(-3.0F, -11.0F, 3.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(6, 51).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(18, 52).addBox(-4.0F, -11.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		MajimaConstructionHat.setTextureOffset(18, 52).addBox(3.0F, -11.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		ModelRenderer Logo_r1 = new ModelRenderer(this);
		Logo_r1.setRotationPoint(0.0F, -9.5F, -4.5F);
		MajimaConstructionHat.addChild(Logo_r1);
		setRotationAngle(Logo_r1, 0.0F, 0.0F, 0.7854F);
		Logo_r1.setTextureOffset(12, 55).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}