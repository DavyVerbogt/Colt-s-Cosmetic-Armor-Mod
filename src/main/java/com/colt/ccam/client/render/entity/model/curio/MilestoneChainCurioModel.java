package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class MilestoneChainCurioModel extends BipedModel<LivingEntity> {

    public MilestoneChainCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Milestone = new ModelRenderer(this);
		Milestone.setRotationPoint(0.0F, -3.0F, -5.0F);
		bipedBody.addChild(Milestone);
		Milestone.setTextureOffset(2, 57).addBox(-2.1F, 4.5F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(2.7F, 4.5F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(-1.3F, 3.9F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(3.5F, 3.9F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(0.3F, 4.5F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(5.1F, 4.5F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(-3.7F, 3.9F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 57).addBox(1.1F, 3.9F, 3.0F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		Milestone.setTextureOffset(2, 59).addBox(-4.5F, 3.3F, 2.4F, 0.0F, 3.0F, 0.0F, 0.3F, false);
		Milestone.setTextureOffset(0, 62).addBox(-5.0F, 6.3F, 2.4F, 1.0F, 0.0F, 0.0F, 0.3F, false);
		Milestone.setTextureOffset(40, 58).addBox(-4.0F, 3.0F, 2.9F, 8.0F, 2.0F, 4.0F, 0.2F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0F, 2.8F, 2.9F);
		Milestone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
		cube_r1.setTextureOffset(0, 62).addBox(-0.2F, 0.54F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.1125F, 5.2F, 3.25F);
		Milestone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.setTextureOffset(2, 57).addBox(-1.3F, -2.8125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r2.setTextureOffset(2, 57).addBox(0.3F, -2.2125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r2.setTextureOffset(2, 57).addBox(0.3F, -4.6125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r2.setTextureOffset(2, 57).addBox(-1.3F, -5.2125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.9125F, 5.2F, 3.25F);
		Milestone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.setTextureOffset(2, 57).addBox(-1.3F, -2.8125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r3.setTextureOffset(2, 57).addBox(0.3F, -2.2125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r3.setTextureOffset(2, 57).addBox(0.3F, -4.6125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
		cube_r3.setTextureOffset(2, 57).addBox(-1.3F, -5.2125F, -0.25F, 0.0F, 1.0F, -1.0F, 0.3F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}