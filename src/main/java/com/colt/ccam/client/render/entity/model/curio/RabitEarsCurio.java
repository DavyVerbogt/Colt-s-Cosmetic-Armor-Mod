package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RabitEarsCurio extends BipedModel<LivingEntity> {

    public RabitEarsCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer BunnyEars = new ModelRenderer(this);
		BunnyEars.setRotationPoint(-2.8F, -10.45F, -1.5F);
		bipedHead.addChild(BunnyEars);
		BunnyEars.setTextureOffset(0, 54).addBox(-1.7F, -3.55F, -0.5F, 3.0F, 9.0F, 1.0F, -0.1F, false);
		BunnyEars.setTextureOffset(8, 57).addBox(4.3F, -1.55F, -0.5F, 3.0F, 7.0F, 1.0F, -0.1F, false);

		ModelRenderer Rotated_r1 = new ModelRenderer(this);
		Rotated_r1.setRotationPoint(5.8F, -1.05F, -1.2F);
		BunnyEars.addChild(Rotated_r1);
		setRotationAngle(Rotated_r1, 0.3491F, 0.0F, 0.0F);
		Rotated_r1.setTextureOffset(8, 54).addBox(-1.5F, -0.45F, -1.1F, 3.0F, 1.0F, 3.0F, -0.1F, false);

		ModelRenderer TopR_r1 = new ModelRenderer(this);
		TopR_r1.setRotationPoint(3.0399F, -2.6843F, 0.0F);
		BunnyEars.addChild(TopR_r1);
		setRotationAngle(TopR_r1, 0.0F, 0.0F, 0.7854F);
		TopR_r1.setTextureOffset(0, 51).addBox(-3.8399F, 0.7343F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		ModelRenderer EarFlopL = new ModelRenderer(this);
		EarFlopL.setRotationPoint(7.1F, -0.05F, 0.0F);
		BunnyEars.addChild(EarFlopL);
		setRotationAngle(EarFlopL, 0.0F, 0.0F, -0.3491F);
		EarFlopL.setTextureOffset(16, 61).addBox(-2.384F, -1.3206F, -2.2F, 3.0F, 2.0F, 1.0F, -0.1F, false);

		ModelRenderer TopL_r1 = new ModelRenderer(this);
		TopL_r1.setRotationPoint(3.0399F, -0.0843F, -1.7F);
		EarFlopL.addChild(TopL_r1);
		setRotationAngle(TopL_r1, 0.0F, 0.0F, 0.7854F);
		TopL_r1.setTextureOffset(16, 58).addBox(-3.2447F, 2.2969F, -0.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
} 