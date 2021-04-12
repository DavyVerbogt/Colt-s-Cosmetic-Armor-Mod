package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RabbitTailCurio extends BipedModel<LivingEntity> {

    public RabbitTailCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, -0.5F);
		bipedBody.addChild(Tail);
		Tail.setTextureOffset(0, 62).addBox(-0.5F, -14.0F, 2.5F, 1.0F, 1.0F, 1.0F, 1.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}