package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class HaloModel extends BipedModel<LivingEntity> {

	public HaloModel(float size) {
		super(size, 0f, 64, 64);

		ModelRenderer Halo = new ModelRenderer(this);
		Halo.setRotationPoint(0.0F, -10F, 0.0F);
		bipedHead.addChild(Halo);
		Halo.setTextureOffset(1, 55).addBox(-3.0F, -0.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		Halo.setTextureOffset(1, 55).addBox(3.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, true);
		Halo.setTextureOffset(1, 55).addBox(-4.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, true);
		Halo.setTextureOffset(1, 55).addBox(-3.0F, -0.5F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}