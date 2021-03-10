package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class WitchHatArmorModel extends BipedModel<LivingEntity>{


	public WitchHatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer WitchHat = new ModelRenderer(this);
		WitchHat.setRotationPoint(0.0F, -7.0F, 0.0F);
		bipedHead.addChild(WitchHat);
		setRotationAngle(WitchHat, -0.0436F, 0.0F, 0.0F);
		

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		WitchHat.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(56, 55).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		WitchHat.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(48, 56).addBox(-2.0F, -9.0F, -3.3F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		WitchHat.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(19, 38).addBox(-3.0F, -6.0F, -3.8F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		WitchHat.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(3, 40).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.2F, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		WitchHat.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 52).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
