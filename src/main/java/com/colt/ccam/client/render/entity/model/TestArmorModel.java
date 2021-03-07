package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TestArmorModel extends BipedModel<LivingEntity> {

	
		public TestArmorModel(float modelSize) {
			super(modelSize, 0.0F, 64, 64);
	
			ModelRenderer Tits = new ModelRenderer(this);
			Tits.setRotationPoint(0.0F, 0.0F, 0.0F);
			bipedBody.addChild(Tits);
			
	
			ModelRenderer Tits_r1 = new ModelRenderer(this);
			Tits_r1.setRotationPoint(3.0F, 3.0F, -3.0F);
			Tits.addChild(Tits_r1);
			setRotationAngle(Tits_r1, -0.5236F, 0.0F, 0.0F);
			Tits_r1.setTextureOffset(4, 12).addBox(-7.0F, -2.0F, 0.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		}
	
		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
}