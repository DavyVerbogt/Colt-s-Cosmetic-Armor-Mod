package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TrafficConeArmorModel extends BipedModel<LivingEntity> {

	public TrafficConeArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer trafficCone = new ModelRenderer(this);
		trafficCone.setRotationPoint(0.0F, 1.0F, 0.0F);
		bipedHead.addChild(trafficCone);
		trafficCone.setTextureOffset(20, 53).addBox(-6.0F, -8.0F, -5.0F, 12.0F, 1.0F, 10.0F, 0.0F, false);
		trafficCone.setTextureOffset(31, 51).addBox(-5.0F, -8.0F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		trafficCone.setTextureOffset(31, 49).addBox(-5.0F, -8.0F, 5.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		trafficCone.setTextureOffset(26, 39).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		trafficCone.setTextureOffset(7, 43).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		trafficCone.setTextureOffset(42, 41).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		trafficCone.setTextureOffset(54, 59).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}