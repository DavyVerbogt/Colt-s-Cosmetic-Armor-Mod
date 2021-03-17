package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class GladiatorArmorModel extends BipedModel<LivingEntity> {

    public GladiatorArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 128);

		ModelRenderer JacketRightLeg = new ModelRenderer(this);
		JacketRightLeg.setRotationPoint(0.0F, 4.0F, 0.0F);
		bipedRightLeg.addChild(JacketRightLeg);
		JacketRightLeg.setTextureOffset(0, 64).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);

		ModelRenderer LegFlapsRight = new ModelRenderer(this);
		LegFlapsRight.setRotationPoint(0.2F, 0.0F, 0.0F);
		bipedRightLeg.addChild(LegFlapsRight);
	
		ModelRenderer FlapLeft_r1 = new ModelRenderer(this);
		FlapLeft_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LegFlapsRight.addChild(FlapLeft_r1);
		setRotationAngle(FlapLeft_r1, -0.0873F, -0.0436F, 0.0F);
		FlapLeft_r1.setTextureOffset(0, 80).addBox(-2.0F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		FlapLeft_r1.setTextureOffset(0, 80).addBox(0.6F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		FlapLeft_r1.setTextureOffset(0, 80).addBox(-0.7F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, false);

		ModelRenderer BootRight = new ModelRenderer(this);
		BootRight.setRotationPoint(0.0F, 12.0F, 0.0F);
		bipedRightLeg.addChild(BootRight);
		BootRight.setTextureOffset(24, 80).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		BootRight.setTextureOffset(8, 85).addBox(-2.0F, -4.7F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		BootRight.setTextureOffset(2, 87).addBox(-0.5F, -6.0F, -2.6F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer BotGuardBottem_r1 = new ModelRenderer(this);
		BotGuardBottem_r1.setRotationPoint(0.0F, 0.0F, -0.3F);
		BootRight.addChild(BotGuardBottem_r1);
		setRotationAngle(BotGuardBottem_r1, -0.3054F, 0.0F, 0.0F);
		BotGuardBottem_r1.setTextureOffset(0, 86).addBox(-2.0F, -1.3F, -2.7F, 4.0F, 1.0F, 0.0F, 0.2F, false);

		ModelRenderer BootGaurdRight_r1 = new ModelRenderer(this);
		BootGaurdRight_r1.setRotationPoint(0.0F, 0.0F, -0.3F);
		BootRight.addChild(BootGaurdRight_r1);
		setRotationAngle(BootGaurdRight_r1, 0.0F, -0.1309F, 0.0F);
		BootGaurdRight_r1.setTextureOffset(0, 87).addBox(0.0F, -6.0F, -2.3F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer BootGaurdLeft_r1 = new ModelRenderer(this);
		BootGaurdLeft_r1.setRotationPoint(0.0F, 0.0F, -0.3F);
		BootRight.addChild(BootGaurdLeft_r1);
		setRotationAngle(BootGaurdLeft_r1, 0.0F, 0.1309F, 0.0F);
		BootGaurdLeft_r1.setTextureOffset(0, 87).addBox(-2.0F, -6.0F, -2.3F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer JacketLeftLeg = new ModelRenderer(this);
		JacketLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(JacketLeftLeg);
		JacketLeftLeg.setTextureOffset(16, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);

		ModelRenderer LegFlapsLeft = new ModelRenderer(this);
		LegFlapsLeft.setRotationPoint(-0.2F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(LegFlapsLeft);

		ModelRenderer FlapLeft_r2 = new ModelRenderer(this);
		FlapLeft_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		LegFlapsLeft.addChild(FlapLeft_r2);
		setRotationAngle(FlapLeft_r2, -0.0873F, 0.0436F, 0.0F);
		FlapLeft_r2.setTextureOffset(0, 80).addBox(-1.6F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, true);
		FlapLeft_r2.setTextureOffset(0, 80).addBox(1.0F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, true);
		FlapLeft_r2.setTextureOffset(0, 80).addBox(-0.3F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, 0.0F, true);

		ModelRenderer BootLeft = new ModelRenderer(this);
		BootLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(BootLeft);
		BootLeft.setTextureOffset(24, 80).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer Jacket = new ModelRenderer(this);
		Jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(Jacket);
		Jacket.setTextureOffset(40, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.2F, false);

		ModelRenderer Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, -0.5F, 0.0F);
		bipedBody.addChild(Belt);
		Belt.setTextureOffset(41, 74).addBox(-2.0F, 10.4F, -2.6F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(0, 80).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 11.0F, 0.0F);
		Belt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(32, 70).addBox(0.4F, 1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.2F, true);
		cube_r1.setTextureOffset(32, 70).addBox(-0.2F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.2F, true);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 11.0F, 0.0F);
		Belt.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.setTextureOffset(32, 70).addBox(-0.4F, 1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.2F, false);
		cube_r2.setTextureOffset(32, 70).addBox(0.2F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.2F, false);

		ModelRenderer JacketRightArm = new ModelRenderer(this);
		JacketRightArm.setRotationPoint(0.0F, -0.0F, 0.0F);
		bipedRightArm.addChild(JacketRightArm);
		JacketRightArm.setTextureOffset(48, 64).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);

		ModelRenderer Arm_Part = new ModelRenderer(this);
		Arm_Part.setRotationPoint(-3.0F, -0.3F, 0.0F);
		bipedRightArm.addChild(Arm_Part);
		setRotationAngle(Arm_Part, 0.0F, 0.0F, 0.3927F);
		Arm_Part.setTextureOffset(32, 70).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.3F, false);
		Arm_Part.setTextureOffset(32, 70).addBox(1.0F, 1.7F, -2.0F, 0.0F, 2.0F, 4.0F, 0.3F, false);
		Arm_Part.setTextureOffset(32, 70).addBox(1.8F, 3.3F, -2.0F, 0.0F, 2.0F, 4.0F, 0.3F, false);
		Arm_Part.setTextureOffset(32, 70).addBox(2.6F, 5.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.3F, false);

		ModelRenderer LeatherStrapBottem_r1 = new ModelRenderer(this);
		LeatherStrapBottem_r1.setRotationPoint(4.0F, 0.0F, 0.0F);
		Arm_Part.addChild(LeatherStrapBottem_r1);
		setRotationAngle(LeatherStrapBottem_r1, 0.0F, 0.0F, -0.3927F);
		LeatherStrapBottem_r1.setTextureOffset(25, 59).addBox(-3.5F, 2.3F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		LeatherStrapBottem_r1.setTextureOffset(25, 59).addBox(-3.5F, -0.7F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer LeatherStrapIronGaurds_r1 = new ModelRenderer(this);
		LeatherStrapIronGaurds_r1.setRotationPoint(-0.0F, -0.0F, 0.0F);
		Arm_Part.addChild(LeatherStrapIronGaurds_r1);
		setRotationAngle(LeatherStrapIronGaurds_r1, 0.0F, 0.0F, -0.3927F);
		LeatherStrapIronGaurds_r1.setTextureOffset(18, 54).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		ModelRenderer Shoulder_Piece = new ModelRenderer(this);
		Shoulder_Piece.setRotationPoint(-0F, -0.5F, 0.0F);
		bipedRightArm.addChild(Shoulder_Piece);
		Shoulder_Piece.setTextureOffset(4, 57).addBox(-1.0F, -5.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		ModelRenderer ShoulderLeft_r1 = new ModelRenderer(this);
		ShoulderLeft_r1.setRotationPoint(-0F, -3.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderLeft_r1);
		setRotationAngle(ShoulderLeft_r1, 0.0F, -0.3054F, -2.0944F);
		ShoulderLeft_r1.setTextureOffset(0, 57).addBox(-0.7F, -5.0F, 0.9F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		ModelRenderer ShoulderIn2_r1 = new ModelRenderer(this);
		ShoulderIn2_r1.setRotationPoint(-0F, -3.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderIn2_r1);
		setRotationAngle(ShoulderIn2_r1, 0.0F, 0.0F, -1.789F);
		ShoulderIn2_r1.setTextureOffset(8, 57).addBox(-3.3F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		ShoulderIn2_r1.setTextureOffset(8, 57).addBox(-2.3F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		ModelRenderer ShoulderMiddle_r1 = new ModelRenderer(this);
		ShoulderMiddle_r1.setRotationPoint(-0F, -3.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderMiddle_r1);
		setRotationAngle(ShoulderMiddle_r1, 0.0F, 0.0F, -2.0944F);
		ShoulderMiddle_r1.setTextureOffset(5, 57).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		ModelRenderer ShoulderBackRight_r1 = new ModelRenderer(this);
		ShoulderBackRight_r1.setRotationPoint(-0F, -0.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderBackRight_r1);
		setRotationAngle(ShoulderBackRight_r1, 0.3054F, 0.0F, 0.0F);
		ShoulderBackRight_r1.setTextureOffset(6, 58).addBox(-1.0F, -5.2F, -1.9F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		ModelRenderer ShoulderBackLeft_r1 = new ModelRenderer(this);
		ShoulderBackLeft_r1.setRotationPoint(-0F, -0.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderBackLeft_r1);
		setRotationAngle(ShoulderBackLeft_r1, -0.3054F, 0.0F, 0.0F);
		ShoulderBackLeft_r1.setTextureOffset(6, 58).addBox(-1.0F, -5.2F, -0.1F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		ModelRenderer ShoulderRight_r1 = new ModelRenderer(this);
		ShoulderRight_r1.setRotationPoint(-0F, -3.5F, 0.0F);
		Shoulder_Piece.addChild(ShoulderRight_r1);
		setRotationAngle(ShoulderRight_r1, 0.0F, 0.3054F, -2.0944F);
		ShoulderRight_r1.setTextureOffset(0, 57).addBox(-0.7F, -5.0F, -2.9F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		ModelRenderer JacketLeftArm = new ModelRenderer(this);
		JacketLeftArm.setRotationPoint(-1.2F, -1.0F, 0.0F);
		bipedLeftArm.addChild(JacketLeftArm);
		JacketLeftArm.setTextureOffset(0, 41).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);
		
		ModelRenderer Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(0.0F, -0.0F, 0.0F);
		bipedHead.addChild(Helmet);
		Helmet.setTextureOffset(0, 93).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
		Helmet.setTextureOffset(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, 0.0F, false);

		ModelRenderer FeathersRight_r1 = new ModelRenderer(this);
		FeathersRight_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helmet.addChild(FeathersRight_r1);
		setRotationAngle(FeathersRight_r1, -0.1745F, 0.0F, 0.0436F);
		FeathersRight_r1.setTextureOffset(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, 0.0F, false);

		ModelRenderer FeathersLeft_r1 = new ModelRenderer(this);
		FeathersLeft_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helmet.addChild(FeathersLeft_r1);
		setRotationAngle(FeathersLeft_r1, -0.0873F, 0.0F, -0.0436F);
		FeathersLeft_r1.setTextureOffset(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, 0.0F, false);

		ModelRenderer HelmetFeatherGaurdMidRight_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdMidRight_r1.setRotationPoint(-0.4F, 0.0F, 0.4F);
		Helmet.addChild(HelmetFeatherGaurdMidRight_r1);
		setRotationAngle(HelmetFeatherGaurdMidRight_r1, -0.829F, 0.0873F, 0.0873F);
		HelmetFeatherGaurdMidRight_r1.setTextureOffset(29, 123).addBox(-0.3F, -9.4F, -5.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		ModelRenderer HelmetFeatherGaurdBackRight_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdBackRight_r1.setRotationPoint(-0.6F, -1.1F, -1.4F);
		Helmet.addChild(HelmetFeatherGaurdBackRight_r1);
		setRotationAngle(HelmetFeatherGaurdBackRight_r1, -1.7453F, 0.0873F, 0.0F);
		HelmetFeatherGaurdBackRight_r1.setTextureOffset(16, 120).addBox(0.4F, -5.7F, -8.2F, 1.0F, 2.0F, 5.0F, 0.0F, true);

		ModelRenderer HelmetFeatherGaurdFrontRight_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdFrontRight_r1.setRotationPoint(-0.4F, 1.1F, 1.1F);
		Helmet.addChild(HelmetFeatherGaurdFrontRight_r1);
		setRotationAngle(HelmetFeatherGaurdFrontRight_r1, 0.1309F, 0.0F, 0.0873F);
		HelmetFeatherGaurdFrontRight_r1.setTextureOffset(0, 118).addBox(-0.1F, -11.0F, -3.0F, 1.0F, 3.0F, 7.0F, 0.0F, true);

		ModelRenderer HelmetFeatherGaurdMidLeft_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdMidLeft_r1.setRotationPoint(0.7F, 0.0F, 0.4F);
		Helmet.addChild(HelmetFeatherGaurdMidLeft_r1);
		setRotationAngle(HelmetFeatherGaurdMidLeft_r1, -0.829F, -0.0873F, -0.0873F);
		HelmetFeatherGaurdMidLeft_r1.setTextureOffset(29, 123).addBox(-0.7F, -9.4F, -5.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		ModelRenderer HelmetFeatherGaurdBackLeft_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdBackLeft_r1.setRotationPoint(0.5F, -1.1F, -1.4F);
		Helmet.addChild(HelmetFeatherGaurdBackLeft_r1);
		setRotationAngle(HelmetFeatherGaurdBackLeft_r1, -1.7453F, -0.0873F, 0.0F);
		HelmetFeatherGaurdBackLeft_r1.setTextureOffset(16, 120).addBox(-1.0F, -5.7F, -8.2F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		ModelRenderer HelmetFeatherGaurdFrontLeft_r1 = new ModelRenderer(this);
		HelmetFeatherGaurdFrontLeft_r1.setRotationPoint(0.7F, 1.1F, 1.1F);
		Helmet.addChild(HelmetFeatherGaurdFrontLeft_r1);
		setRotationAngle(HelmetFeatherGaurdFrontLeft_r1, 0.1309F, 0.0F, -0.0873F);
		HelmetFeatherGaurdFrontLeft_r1.setTextureOffset(0, 118).addBox(-0.9F, -11.0F, -3.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		ModelRenderer FrontGaurd_r1 = new ModelRenderer(this);
		FrontGaurd_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helmet.addChild(FrontGaurd_r1);
		setRotationAngle(FrontGaurd_r1, -0.3491F, 0.0F, 0.0F);
		FrontGaurd_r1.setTextureOffset(0, 109).addBox(-4.0F, -6.3F, -6.8F, 8.0F, 2.0F, 2.0F, 0.0F, false);
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
