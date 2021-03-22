package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ColtArmorModel extends BipedModel<LivingEntity> {

	public ColtArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer JacketRightLeg = new ModelRenderer(this);
		JacketRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(JacketRightLeg);
		JacketRightLeg.setTextureOffset(1, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.2F, false);

		ModelRenderer JacketLeftLeg = new ModelRenderer(this);
		JacketLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(JacketLeftLeg);
		JacketLeftLeg.setTextureOffset(1, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.2F, true);

		ModelRenderer BackThing = new ModelRenderer(this);
		BackThing.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(BackThing);
		BackThing.setTextureOffset(8, 56).addBox(-2.0F, 3.0F, 1.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		BackThing.setTextureOffset(2, 54).addBox(0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BackThing.setTextureOffset(2, 54).addBox(0.0F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer CopperWaterTank = new ModelRenderer(this);
		CopperWaterTank.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackThing.addChild(CopperWaterTank);
		CopperWaterTank.setTextureOffset(2, 54).addBox(-2.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		CopperWaterTank.setTextureOffset(0, 56).addBox(-1.0F, 3.0F, 2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		CopperWaterTank.setTextureOffset(4, 56).addBox(-3.0F, 3.0F, 2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		CopperWaterTank.setTextureOffset(2, 54).addBox(-2.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer CopperHeaterTank = new ModelRenderer(this);
		CopperHeaterTank.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackThing.addChild(CopperHeaterTank);
		CopperHeaterTank.setTextureOffset(2, 54).addBox(1.0F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		CopperHeaterTank.setTextureOffset(12, 59).addBox(1.0F, 5.0F, 2.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer Jacket = new ModelRenderer(this);
		Jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(Jacket);
		Jacket.setTextureOffset(17, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.2F, false);

		ModelRenderer JacketRightArm = new ModelRenderer(this);
		JacketRightArm.setRotationPoint(1.2F, -1.0F, -0.0F);
		bipedRightArm.addChild(JacketRightArm);
		JacketRightArm.setTextureOffset(41, 41).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);

		ModelRenderer JacketLeftArm = new ModelRenderer(this);
		JacketLeftArm.setRotationPoint(-1.2F, -1.0F, 0.0F);
		bipedLeftArm.addChild(JacketLeftArm);
		JacketLeftArm.setTextureOffset(41, 41).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);

		ModelRenderer Goggels = new ModelRenderer(this);
		Goggels.setRotationPoint(4.0F, -5.0F, 0.0F);
		bipedHead.addChild(Goggels);
		setRotationAngle(Goggels, -0.1309F, 0.0F, 0.0F);
		Goggels.setTextureOffset(40, 33).addBox(-8.0F, -2.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Goggels.setTextureOffset(50, 34).addBox(-3.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Goggels.setTextureOffset(50, 34).addBox(-7.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Goggels.setTextureOffset(50, 34).addBox(-7.0F, 0.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Goggels.setTextureOffset(50, 34).addBox(-3.0F, 0.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Goggels.setTextureOffset(1, 25).addBox(-8.0F, -3.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}