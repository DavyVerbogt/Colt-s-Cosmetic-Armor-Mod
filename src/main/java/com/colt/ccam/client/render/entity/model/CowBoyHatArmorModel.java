package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CowBoyHatArmorModel extends BipedModel<LivingEntity>{

    public CowBoyHatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer CowboyHat = new ModelRenderer(this);
		CowboyHat.setRotationPoint(0.0F, -6.0F, 0.0F);
		bipedHead.addChild(CowboyHat);
		CowboyHat.setTextureOffset(0, 51).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		CowboyHat.setTextureOffset(34, 42).addBox(1.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		CowboyHat.setTextureOffset(42, 33).addBox(-4.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		CowboyHat.setTextureOffset(20, 51).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
		CowboyHat.setTextureOffset(12, 35).addBox(5.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		CowboyHat.setTextureOffset(0, 38).addBox(-6.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
