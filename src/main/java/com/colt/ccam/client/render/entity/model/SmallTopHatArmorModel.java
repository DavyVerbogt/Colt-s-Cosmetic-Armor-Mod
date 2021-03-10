package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SmallTopHatArmorModel extends BipedModel<LivingEntity> {

    public SmallTopHatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer TopHat = new ModelRenderer(this);
		TopHat.setRotationPoint(4.0F, -7F, 4.0F);
		bipedHead.addChild(TopHat);
		setRotationAngle(TopHat, -0.2618F, 0.0F, 0.2618F);
		TopHat.setTextureOffset(52, 56).addBox(-2.0F, -6.25F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		TopHat.setTextureOffset(44, 56).addBox(-3.0F, -1.25F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
