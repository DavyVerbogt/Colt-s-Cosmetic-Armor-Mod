package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class WitchHatArmorModel extends BipedModel<LivingEntity>{


	public WitchHatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer WitchHat = new ModelRenderer(this);
		WitchHat.setRotationPoint(0.0F, -10.1163F, 1.4443F);
		bipedHead.addChild(WitchHat);
		setRotationAngle(WitchHat, -0.1309F, 0.0F, 0.0F);
		WitchHat.setTextureOffset(0, 52).addBox(-5.0F, 3.1163F, -5.4443F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		ModelRenderer Layer5_r1 = new ModelRenderer(this);
		Layer5_r1.setRotationPoint(0.0F, -4.4793F, 0.8094F);
		WitchHat.addChild(Layer5_r1);
		setRotationAngle(Layer5_r1, -0.2618F, 0.0F, 0.0F);
		Layer5_r1.setTextureOffset(2, 57).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		ModelRenderer Layer4_r1 = new ModelRenderer(this);
		Layer4_r1.setRotationPoint(0.0F, -1.9766F, 0.0535F);
		WitchHat.addChild(Layer4_r1);
		setRotationAngle(Layer4_r1, -0.2618F, 0.0F, 0.0F);
		Layer4_r1.setTextureOffset(46, 52).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		ModelRenderer Layer3_r1 = new ModelRenderer(this);
		Layer3_r1.setRotationPoint(0.0F, -0.2021F, -0.2074F);
		WitchHat.addChild(Layer3_r1);
		setRotationAngle(Layer3_r1, -0.1745F, 0.0F, 0.0F);
		Layer3_r1.setTextureOffset(10, 43).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		ModelRenderer Layer2_r1 = new ModelRenderer(this);
		Layer2_r1.setRotationPoint(0.0F, 2.5417F, -0.2112F);
		WitchHat.addChild(Layer2_r1);
		setRotationAngle(Layer2_r1, -0.0873F, 0.0F, 0.0F);
		Layer2_r1.setTextureOffset(30, 51).addBox(-4.0F, -1.5F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
