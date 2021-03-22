package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class NachoSombraroArmorModel extends BipedModel<LivingEntity> {

	public NachoSombraroArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 128);

		ModelRenderer Sombraro = new ModelRenderer(this);
		Sombraro.setRotationPoint(0.6F, -7F, 0.0F);
		bipedHead.addChild(Sombraro);
		setRotationAngle(Sombraro, -0.3054F, 0.0F, 0.0F);
		Sombraro.setTextureOffset(0, 87).addBox(-5.6F, 0.6F, -9.0F, 10.0F, 1.0F, 18.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 106).addBox(-9.6F, 0.6F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 106).addBox(4.4F, 0.6F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-7.6F, 0.6F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(4.4F, 0.6F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-7.6F, 0.6F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(4.4F, 0.6F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(7.4F, -0.4F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 73).addBox(-9.6F, -0.4F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 71).addBox(-5.6F, -0.4F, -9.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 71).addBox(-5.6F, -0.4F, 8.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(-7.6F, -0.4F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(-8.6F, -0.4F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(4.4F, -0.4F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(6.4F, -0.4F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(-7.6F, -0.4F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(-8.6F, -0.4F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 84).addBox(4.4F, -0.4F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 84).addBox(6.4F, -0.4F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 68).addBox(-2.6F, -3.4F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 68).addBox(-2.6F, -3.4F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 78).addBox(-3.6F, -3.4F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Sombraro.setTextureOffset(0, 78).addBox(1.4F, -3.4F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Sombraro.setTextureOffset(6, 66).addBox(-2.6F, -4.4F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		ModelRenderer MiddelSideL_r1 = new ModelRenderer(this);
		MiddelSideL_r1.setRotationPoint(-0.6F, 0.1F, 0.0F);
		Sombraro.addChild(MiddelSideL_r1);
		setRotationAngle(MiddelSideL_r1, 0.0F, -1.5708F, 0.0F);
		MiddelSideL_r1.setTextureOffset(0, 87).addBox(3.6F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.5F, false);
		MiddelSideL_r1.setTextureOffset(12, 75).addBox(-4.1F, -2.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.5F, false);
		MiddelSideL_r1.setTextureOffset(20, 71).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 8.0F, 0.5F, false);

		ModelRenderer Nacho = new ModelRenderer(this);
		Nacho.setRotationPoint(0.6F, -7F, 0.0F);
		bipedHead.addChild(Nacho);
		setRotationAngle(Nacho, -0.3054F, 0.0F, 0.0F);

		ModelRenderer Fourteen_r1 = new ModelRenderer(this);
		Fourteen_r1.setRotationPoint(5.0F, -0.5F, -1.5F);
		Nacho.addChild(Fourteen_r1);
		setRotationAngle(Fourteen_r1, -0.7854F, -1.5708F, 0.0F);
		Fourteen_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer FourteenN_r1 = new ModelRenderer(this);
		FourteenN_r1.setRotationPoint(5.0F, -0.5F, -1.5F);
		Nacho.addChild(FourteenN_r1);
		setRotationAngle(FourteenN_r1, -0.7854F, 0.0F, 0.0F);
		FourteenN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Thirteen_r1 = new ModelRenderer(this);
		Thirteen_r1.setRotationPoint(3.0F, -0.5F, -6.6F);
		Nacho.addChild(Thirteen_r1);
		setRotationAngle(Thirteen_r1, -0.7854F, -1.5708F, 0.0F);
		Thirteen_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer ThirteenN_r1 = new ModelRenderer(this);
		ThirteenN_r1.setRotationPoint(3.0F, -0.5F, -6.6F);
		Nacho.addChild(ThirteenN_r1);
		setRotationAngle(ThirteenN_r1, -0.7854F, 0.0F, 0.0F);
		ThirteenN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Twelve_r1 = new ModelRenderer(this);
		Twelve_r1.setRotationPoint(-3.0F, -0.5F, -7.1F);
		Nacho.addChild(Twelve_r1);
		setRotationAngle(Twelve_r1, -0.7854F, 0.0F, 0.0F);
		Twelve_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer TwelveN_r1 = new ModelRenderer(this);
		TwelveN_r1.setRotationPoint(-3.0F, -0.5F, -7.1F);
		Nacho.addChild(TwelveN_r1);
		setRotationAngle(TwelveN_r1, -0.7854F, -1.5708F, 0.0F);
		TwelveN_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Eleven_r1 = new ModelRenderer(this);
		Eleven_r1.setRotationPoint(-6.7F, -0.5F, -1.8F);
		Nacho.addChild(Eleven_r1);
		setRotationAngle(Eleven_r1, -0.7854F, -1.5708F, 0.0F);
		Eleven_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer ElevenN_r1 = new ModelRenderer(this);
		ElevenN_r1.setRotationPoint(-6.7F, -0.5F, -1.8F);
		Nacho.addChild(ElevenN_r1);
		setRotationAngle(ElevenN_r1, -0.7854F, 0.0F, 0.0F);
		ElevenN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Ten_r1 = new ModelRenderer(this);
		Ten_r1.setRotationPoint(-3.2F, -0.5F, 5.9F);
		Nacho.addChild(Ten_r1);
		setRotationAngle(Ten_r1, -0.7854F, -1.5708F, 0.0F);
		Ten_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer TenN_r1 = new ModelRenderer(this);
		TenN_r1.setRotationPoint(-3.2F, -0.5F, 5.9F);
		Nacho.addChild(TenN_r1);
		setRotationAngle(TenN_r1, -0.7854F, 0.0F, 0.0F);
		TenN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Nein_r1 = new ModelRenderer(this);
		Nein_r1.setRotationPoint(1.1F, -0.5F, 5.2F);
		Nacho.addChild(Nein_r1);
		setRotationAngle(Nein_r1, -0.7854F, -1.5708F, 0.0F);
		Nein_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer NeinN_r1 = new ModelRenderer(this);
		NeinN_r1.setRotationPoint(1.1F, -0.5F, 5.2F);
		Nacho.addChild(NeinN_r1);
		setRotationAngle(NeinN_r1, -0.7854F, 0.0F, 0.0F);
		NeinN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Eight_r1 = new ModelRenderer(this);
		Eight_r1.setRotationPoint(0.0F, -0.5F, 6.5F);
		Nacho.addChild(Eight_r1);
		setRotationAngle(Eight_r1, -0.7854F, -1.5708F, 0.0F);
		Eight_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer EightN_r1 = new ModelRenderer(this);
		EightN_r1.setRotationPoint(0.0F, -0.5F, 6.5F);
		Nacho.addChild(EightN_r1);
		setRotationAngle(EightN_r1, -0.7854F, 0.0F, 0.0F);
		EightN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Seven_r1 = new ModelRenderer(this);
		Seven_r1.setRotationPoint(0.0F, -0.5F, -5.7F);
		Nacho.addChild(Seven_r1);
		setRotationAngle(Seven_r1, -0.7854F, -1.5708F, 0.0F);
		Seven_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer SevenN_r1 = new ModelRenderer(this);
		SevenN_r1.setRotationPoint(0.0F, -0.5F, -5.7F);
		Nacho.addChild(SevenN_r1);
		setRotationAngle(SevenN_r1, -0.7854F, 0.0F, 0.0F);
		SevenN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Six_r1 = new ModelRenderer(this);
		Six_r1.setRotationPoint(3.5F, -0.5F, 5.5F);
		Nacho.addChild(Six_r1);
		setRotationAngle(Six_r1, -0.7854F, -1.5708F, 0.0F);
		Six_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer SixN_r1 = new ModelRenderer(this);
		SixN_r1.setRotationPoint(3.5F, -0.5F, 5.5F);
		Nacho.addChild(SixN_r1);
		setRotationAngle(SixN_r1, -0.7854F, 0.0F, 0.0F);
		SixN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Five_r1 = new ModelRenderer(this);
		Five_r1.setRotationPoint(5.8F, -0.5F, 1.5F);
		Nacho.addChild(Five_r1);
		setRotationAngle(Five_r1, -0.7854F, -1.5708F, 0.0F);
		Five_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer FiveN_r1 = new ModelRenderer(this);
		FiveN_r1.setRotationPoint(5.8F, -0.5F, 1.5F);
		Nacho.addChild(FiveN_r1);
		setRotationAngle(FiveN_r1, -0.7854F, 0.0F, 0.0F);
		FiveN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Four_r1 = new ModelRenderer(this);
		Four_r1.setRotationPoint(6.0F, -0.5F, -4.5F);
		Nacho.addChild(Four_r1);
		setRotationAngle(Four_r1, -0.7854F, -1.5708F, 0.0F);
		Four_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer FourN_r1 = new ModelRenderer(this);
		FourN_r1.setRotationPoint(6.0F, -0.5F, -4.5F);
		Nacho.addChild(FourN_r1);
		setRotationAngle(FourN_r1, -0.7854F, 0.0F, 0.0F);
		FourN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		FourN_r1.setTextureOffset(0, 101).addBox(-10.7F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Three_r1 = new ModelRenderer(this);
		Three_r1.setRotationPoint(-4.4F, -0.5F, 4.2F);
		Nacho.addChild(Three_r1);
		setRotationAngle(Three_r1, -0.7854F, -1.5708F, 0.0F);
		Three_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer ThreeN_r1 = new ModelRenderer(this);
		ThreeN_r1.setRotationPoint(-4.4F, -0.5F, 4.2F);
		Nacho.addChild(ThreeN_r1);
		setRotationAngle(ThreeN_r1, -0.7854F, 0.0F, 0.0F);
		ThreeN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer Two_r1 = new ModelRenderer(this);
		Two_r1.setRotationPoint(-4.7F, -0.5F, -4.5F);
		Nacho.addChild(Two_r1);
		setRotationAngle(Two_r1, -0.7854F, -1.5708F, 0.0F);
		Two_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer One_r1 = new ModelRenderer(this);
		One_r1.setRotationPoint(-6.0F, -0.5F, 0.5F);
		Nacho.addChild(One_r1);
		setRotationAngle(One_r1, -0.7854F, -1.5708F, 0.0F);
		One_r1.setTextureOffset(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		ModelRenderer OneN_r1 = new ModelRenderer(this);
		OneN_r1.setRotationPoint(-6.0F, -0.5F, 0.5F);
		Nacho.addChild(OneN_r1);
		setRotationAngle(OneN_r1, -0.7854F, 0.0F, 0.0F);
		OneN_r1.setTextureOffset(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}