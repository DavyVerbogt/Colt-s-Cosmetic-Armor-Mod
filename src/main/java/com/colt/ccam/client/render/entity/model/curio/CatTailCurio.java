package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CatTailCurio extends BipedModel<LivingEntity> {

    public CatTailCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer LowerTail_r1 = new ModelRenderer(this);
		LowerTail_r1.setRotationPoint(0.0F, 15.5F, 4.0F);
		bipedBody.addChild(LowerTail_r1);
		setRotationAngle(LowerTail_r1, -0.3927F, 0.0F, 0.0F);
		LowerTail_r1.setTextureOffset(4, 57).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer TopTail_r1 = new ModelRenderer(this);
		TopTail_r1.setRotationPoint(0.0F, 6.5F, 2.5F);
		bipedBody.addChild(TopTail_r1);
		setRotationAngle(TopTail_r1, 0.4363F, 0.0F, 0.0F);
		TopTail_r1.setTextureOffset(0, 55).addBox(-0.5F, 1.5F, -2.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}