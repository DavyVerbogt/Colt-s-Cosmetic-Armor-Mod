package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GladiatorArmorModel extends HumanoidModel {

	public GladiatorArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.getChild("head");
		PartDefinition body = partdefinition.getChild("body");
		PartDefinition right_arm = partdefinition.getChild("right_arm");
		PartDefinition left_arm = partdefinition.getChild("left_arm");
		PartDefinition right_leg = partdefinition.getChild("right_leg");
		PartDefinition left_leg = partdefinition.getChild("left_leg");

	PartDefinition JacketRightLeg = right_leg.addOrReplaceChild("JacketRightLeg", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-2.0F, -4.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 4.0F, 0.0F));
	PartDefinition LegFlapsRight = right_leg.addOrReplaceChild("LegFlapsRight", CubeListBuilder.create(), PartPose.offset(0.2F, 0.0F, 0.0F));
	PartDefinition FlapLeft_r1 = LegFlapsRight.addOrReplaceChild("FlapLeft_r1", CubeListBuilder.create().texOffs(0, 80).addBox(-2.0F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
			.texOffs(0, 80).addBox(0.6F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
			.texOffs(0, 80).addBox(-0.7F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, -0.0436F, 0.0F));
	PartDefinition BootRight = right_leg.addOrReplaceChild("BootRight", CubeListBuilder.create().texOffs(24, 80).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F))
			.texOffs(8, 85).addBox(-2.0F, -4.7F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F))
			.texOffs(2, 87).addBox(-0.5F, -6.0F, -2.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));
	PartDefinition BootGaurdRight_r1 = BootRight.addOrReplaceChild("BootGaurdRight_r1", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -6.0F, -2.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, -0.1309F, 0.0F));
	PartDefinition BootGaurdLeft_r1 = BootRight.addOrReplaceChild("BootGaurdLeft_r1", CubeListBuilder.create().texOffs(0, 87).addBox(-2.0F, -6.0F, -2.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, 0.1309F, 0.0F));

	PartDefinition JacketLeftLeg = left_leg.addOrReplaceChild("JacketLeftLeg", CubeListBuilder.create().texOffs(16, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
	PartDefinition LegFlapsLeft = left_leg.addOrReplaceChild("LegFlapsLeft", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.0F, 0.0F));
	PartDefinition FlapLeft_r2 = LegFlapsLeft.addOrReplaceChild("FlapLeft_r2", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-1.6F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
			.texOffs(0, 80).mirror().addBox(1.0F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
			.texOffs(0, 80).mirror().addBox(-0.3F, -1.0F, -2.3F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0436F, 0.0F));
	PartDefinition BootLeft = left_leg.addOrReplaceChild("BootLeft", CubeListBuilder.create().texOffs(24, 80).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

	PartDefinition Jacket = body.addOrReplaceChild("Jacket", CubeListBuilder.create().texOffs(40, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
	PartDefinition Belt = body.addOrReplaceChild("Belt", CubeListBuilder.create().texOffs(41, 74).addBox(-2.0F, 10.4F, -2.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(0, 80).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -0.5F, 0.0F));
	PartDefinition IronGaurdRight_2_r1 = Belt.addOrReplaceChild("IronGaurdRight_2_r1", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(0.4F, 1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
			.texOffs(32, 70).mirror().addBox(-0.2F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.48F));
	PartDefinition IronGaurdLeft_2_r1 = Belt.addOrReplaceChild("IronGaurdLeft_2_r1", CubeListBuilder.create().texOffs(32, 70).addBox(-0.4F, 1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.2F))
			.texOffs(32, 70).addBox(0.2F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.48F));

	PartDefinition Arm_Part = right_arm.addOrReplaceChild("Arm_Part", CubeListBuilder.create().texOffs(32, 70).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.3F))
			.texOffs(32, 70).addBox(1.0F, 1.7F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.3F))
			.texOffs(32, 70).addBox(1.8F, 3.3F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.3F))
			.texOffs(32, 70).addBox(2.6F, 5.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
	PartDefinition LeatherStrapBottem_r1 = Arm_Part.addOrReplaceChild("LeatherStrapBottem_r1", CubeListBuilder.create().texOffs(25, 59).addBox(-3.5F, 2.3F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F))
			.texOffs(25, 59).addBox(-3.5F, -0.7F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.5F, 0.3F, 0.0F, 0.0F, 0.0F, -0.3927F));
	PartDefinition LeatherStrapIronGaurds_r1 = Arm_Part.addOrReplaceChild("LeatherStrapIronGaurds_r1", CubeListBuilder.create().texOffs(18, 54).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
	PartDefinition Shoulder_Piece = right_arm.addOrReplaceChild("Shoulder_Piece", CubeListBuilder.create().texOffs(10, 57).addBox(-1.0F, -5.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1F, -1F, -0F));
	PartDefinition ShoulderLeft_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderLeft_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-0.7F, -5.0F, 0.9F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, -0.3054F, -2.0944F));
	PartDefinition ShoulderIn2_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderIn2_r1", CubeListBuilder.create().texOffs(8, 57).addBox(-3.3F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
			.texOffs(8, 57).addBox(-2.3F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.789F));
	PartDefinition ShoulderMiddle_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderMiddle_r1", CubeListBuilder.create().texOffs(5, 57).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, 0.0F, -2.0944F));
	PartDefinition ShoulderBackRight_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderBackRight_r1", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, -5.2F, -1.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
	PartDefinition ShoulderBackLeft_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderBackLeft_r1", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, -5.2F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
	PartDefinition ShoulderRight_r1 = Shoulder_Piece.addOrReplaceChild("ShoulderRight_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-0.7F, -5.0F, -2.9F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, 0.3054F, -2.0944F));

	PartDefinition JacketLeftArm = left_arm.addOrReplaceChild("JacketLeftArm", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-1F, -1F, -0F));

	PartDefinition Helmet = head.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 93).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F))
			.texOffs(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));
	PartDefinition FeathersRight_r1 = Helmet.addOrReplaceChild("FeathersRight_r1", CubeListBuilder.create().texOffs(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0436F));
	PartDefinition FeathersLeft_r1 = Helmet.addOrReplaceChild("FeathersLeft_r1", CubeListBuilder.create().texOffs(44, 109).addBox(0.2F, -12.7F, -4.1F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.0436F));
	PartDefinition HelmetFeatherGaurdMidRight_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdMidRight_r1", CubeListBuilder.create().texOffs(29, 123).mirror().addBox(-0.3F, -9.4F, -5.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.4F, -0.829F, 0.0873F, 0.0873F));
	PartDefinition HelmetFeatherGaurdBackRight_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdBackRight_r1", CubeListBuilder.create().texOffs(16, 120).mirror().addBox(0.4F, -5.7F, -8.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.1F, -1.4F, -1.7453F, 0.0873F, 0.0F));
	PartDefinition HelmetFeatherGaurdFrontRight_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdFrontRight_r1", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.1F, -11.0F, -3.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1F, 1.1F, 0.1309F, 0.0F, 0.0873F));
	PartDefinition HelmetFeatherGaurdMidLeft_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdMidLeft_r1", CubeListBuilder.create().texOffs(29, 123).addBox(-0.7F, -9.4F, -5.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0F, 0.4F, -0.829F, -0.0873F, -0.0873F));
	PartDefinition HelmetFeatherGaurdBackLeft_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdBackLeft_r1", CubeListBuilder.create().texOffs(16, 120).addBox(-1.0F, -5.7F, -8.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.4F, -1.7453F, -0.0873F, 0.0F));
	PartDefinition HelmetFeatherGaurdFrontLeft_r1 = Helmet.addOrReplaceChild("HelmetFeatherGaurdFrontLeft_r1", CubeListBuilder.create().texOffs(0, 118).addBox(-0.9F, -11.0F, -3.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.1F, 1.1F, 0.1309F, 0.0F, -0.0873F));
	PartDefinition FrontGaurd_r1 = Helmet.addOrReplaceChild("FrontGaurd_r1", CubeListBuilder.create().texOffs(0, 109).addBox(-4.0F, -6.3F, -6.8F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition,64,128);
}
}