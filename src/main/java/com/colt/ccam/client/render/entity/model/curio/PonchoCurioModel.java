package com.colt.ccam.client.render.entity.model.curio;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class PonchoCurioModel extends BipedModel<LivingEntity> {

    public PonchoCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Poncho = new ModelRenderer(this);
		Poncho.setRotationPoint(-9.5F, 0.1F, 0.0F);
		bipedBody.addChild(Poncho);
		Poncho.setTextureOffset(20, 43).addBox(1.5F, -0.5F, -3.0F, 16.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer Right_r1 = new ModelRenderer(this);
		Right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Poncho.addChild(Right_r1);
		setRotationAngle(Right_r1, 0.0F, 0.0F, -0.7854F);
		Right_r1.setTextureOffset(18, 50).addBox(-1.5F, 0.8F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, true);

		ModelRenderer Left_r1 = new ModelRenderer(this);
		Left_r1.setRotationPoint(19.0F, 0.0F, 0.0F);
		Poncho.addChild(Left_r1);
		setRotationAngle(Left_r1, 0.0F, 0.0F, 0.7854F);
		Left_r1.setTextureOffset(18, 50).addBox(-1.5F, 0.8F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

		ModelRenderer BackPoncho_r1 = new ModelRenderer(this);
		BackPoncho_r1.setRotationPoint(9.4343F, 7.1414F, 3.0F);
		Poncho.addChild(BackPoncho_r1);
		setRotationAngle(BackPoncho_r1, 0.0F, 3.1416F, 0.7854F);
		BackPoncho_r1.setTextureOffset(36, 50).addBox(-3.2F, -10.9F, 0.0F, 14.0F, 14.0F, 0.0F, 0.0F, false);

		ModelRenderer FrontPoncho_r1 = new ModelRenderer(this);
		FrontPoncho_r1.setRotationPoint(9.4343F, 7.1414F, -3.0F);
		Poncho.addChild(FrontPoncho_r1);
		setRotationAngle(FrontPoncho_r1, 0.0F, 3.1416F, 0.7854F);
		FrontPoncho_r1.setTextureOffset(36, 50).addBox(-3.2F, -10.9F, 0.0F, 14.0F, 14.0F, 0.0F, 0.0F, false);

		ModelRenderer HangingBits = new ModelRenderer(this);
		HangingBits.setRotationPoint(9.5F, 0.1F, 0.0F);
		Poncho.addChild(HangingBits);
		HangingBits.setTextureOffset(34, 62).addBox(-2.7F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(-5.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(-7.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(-9.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(1.8F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(4.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(6.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(8.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(-2.7F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(-5.3F, 6.3F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(-7.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(-9.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(1.8F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(4.3F, 6.3F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(6.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(8.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(-9.9F, 1.8F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(-9.9F, 1.8F, -1.6F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		HangingBits.setTextureOffset(34, 62).addBox(9.9F, 1.8F, 0.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		HangingBits.setTextureOffset(34, 62).addBox(9.9F, 1.8F, -1.6F, 0.0F, 2.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}