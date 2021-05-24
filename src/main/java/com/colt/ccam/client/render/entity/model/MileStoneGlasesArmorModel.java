package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class MileStoneGlasesArmorModel extends BipedModel<LivingEntity> {

	public MileStoneGlasesArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

        ModelRenderer MileStone = new ModelRenderer(this);
		MileStone.setRotationPoint(0.0F, -3.0F, -5.0F);
		bipedHead.addChild(MileStone);
		MileStone.setTextureOffset(0, 63).addBox(-4.6F, -2.7F, 0.6F, 13.0F, 1.0F, 0.0F, 0.0F, false);
		MileStone.setTextureOffset(1, 57).addBox(-1.0F, -2.8F, -0.4F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(1, 57).addBox(6.1F, -2.0F, 0.3F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		MileStone.setTextureOffset(1, 57).addBox(6.9F, -2.6F, 0.3F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		MileStone.setTextureOffset(1, 57).addBox(8.5F, -2.0F, 0.3F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		MileStone.setTextureOffset(1, 57).addBox(4.5F, -2.6F, 0.3F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		MileStone.setTextureOffset(1, 57).addBox(0.1F, -2.8F, -0.4F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(1, 57).addBox(3.0F, -2.8F, -0.4F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(1, 57).addBox(-3.9F, -2.8F, -0.4F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(2, 59).addBox(-5.5F, -2.8F, -0.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(0, 62).addBox(-6.0F, 0.2F, -0.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		MileStone.setTextureOffset(6, 56).addBox(-4.5F, -2.7F, 0.6F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		MileStone.setTextureOffset(6, 56).addBox(3.5F, -2.7F, 0.6F, 1.0F, 2.0F, 5.0F, 0.0F, true);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0F, -2.3F, 0.2F);
		MileStone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
		cube_r1.setTextureOffset(0, 62).addBox(-1.2F, -0.66F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.2875F, -1.3F, -0.15F);
		MileStone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.setTextureOffset(1, 57).addBox(-1.5F, 4.1875F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(1, 57).addBox(1.5F, 4.1875F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(1, 57).addBox(1.5F, 0.1875F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(1, 57).addBox(-1.3F, -2.8125F, 0.45F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		cube_r2.setTextureOffset(1, 57).addBox(0.3F, -2.2125F, 0.45F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		cube_r2.setTextureOffset(1, 57).addBox(0.3F, -4.6125F, 0.45F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		cube_r2.setTextureOffset(1, 57).addBox(-1.3F, -5.2125F, 0.45F, 0.0F, 1.0F, 0.0F, 0.3F, false);
		cube_r2.setTextureOffset(1, 57).addBox(-1.5F, 0.1875F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}