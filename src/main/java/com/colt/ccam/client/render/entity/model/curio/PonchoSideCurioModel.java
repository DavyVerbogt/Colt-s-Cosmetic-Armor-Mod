package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class PonchoSideCurioModel extends BipedModel<LivingEntity> {

    public PonchoSideCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Poncho = new ModelRenderer(this);
		Poncho.setRotationPoint(-9.5F, 0.1F, 0.0F);
		bipedBody.addChild(Poncho);
		Poncho.setTextureOffset(0, 41).addBox(1.5F, -0.8F, -3.0F, 16.0F, 1.0F, 6.0F, 0.0F, true);

		ModelRenderer BackPoncho_r1 = new ModelRenderer(this);
		BackPoncho_r1.setRotationPoint(9.5657F, 7.1414F, -3.0F);
		Poncho.addChild(BackPoncho_r1);
		setRotationAngle(BackPoncho_r1, 0.0F, -3.1416F, -1.0472F);
		BackPoncho_r1.setTextureOffset(36, 48).addBox(-12.2F, -10.3F, -6.0F, 14.0F, 16.0F, 0.0F, 0.0F, true);
		BackPoncho_r1.setTextureOffset(36, 48).addBox(-12.2F, -10.3F, 0.0F, 14.0F, 16.0F, 0.0F, 0.0F, true);

		ModelRenderer Right_r1 = new ModelRenderer(this);
		Right_r1.setRotationPoint(19.0F, 0.0F, 0.0F);
		Poncho.addChild(Right_r1);
		setRotationAngle(Right_r1, 0.0F, 0.0F, 0.5236F);
		Right_r1.setTextureOffset(45, 41).addBox(-1.9F, 0.2F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer Left_r1 = new ModelRenderer(this);
		Left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Poncho.addChild(Left_r1);
		setRotationAngle(Left_r1, 0.0F, 0.0F, -0.9599F);
		Left_r1.setTextureOffset(44, 41).addBox(-2.6F, 0.9F, -3.0F, 4.0F, 1.0F, 6.0F, 0.01F, true);

		ModelRenderer HangingBits = new ModelRenderer(this);
		HangingBits.setRotationPoint(9.5F, -0.1F, 0.0F);
		Poncho.addChild(HangingBits);
		HangingBits.setTextureOffset(38, 45).addBox(4.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(4.95F, 8.55F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(6.3F, 6.05F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(7.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(8.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(0.7F, 9.55F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-2.8F, 7.55F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-5.8F, 5.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-8.8F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 44).addBox(10.3F, 0.8F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 44).addBox(10.3F, 0.8F, -1.6F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 44).addBox(-10.2F, 2.7F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 44).addBox(-10.2F, 2.7F, -1.6F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-8.8F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-5.8F, 5.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(-2.8F, 7.55F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(0.7F, 9.55F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(4.95F, 8.55F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(38, 45).addBox(6.3F, 6.05F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(7.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(38, 45).addBox(8.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}