package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class SamuraiArmorModel extends HumanoidModel {

	public SamuraiArmorModel(ModelPart root) {
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

		PartDefinition Front3 = right_leg.addOrReplaceChild("Front3", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.5F, -2.2F));
		PartDefinition FrontFlabL03_r1 = Front3.addOrReplaceChild("FrontFlabL03_r1", CubeListBuilder.create().texOffs(54, 119).addBox(-1.5F, 2.5F, 0.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-1.5F, -0.5F, -0.4F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-1.5F, -2.5F, -1.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Flaps = right_leg.addOrReplaceChild("Flaps", CubeListBuilder.create(), PartPose.offset(2.5F, 2.5F, -0.1F));
		PartDefinition SideFlabR03_r1 = Flaps.addOrReplaceChild("SideFlabR03_r1", CubeListBuilder.create().texOffs(36, 94).addBox(-1.2F, 0.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition SideFlabR02_r1 = Flaps.addOrReplaceChild("SideFlabR02_r1", CubeListBuilder.create().texOffs(36, 94).addBox(-0.6F, -1.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition SideFlabL01_r1 = Flaps.addOrReplaceChild("SideFlabL01_r1", CubeListBuilder.create().texOffs(24, 95).addBox(-0.1F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition Back2 = right_leg.addOrReplaceChild("Back2", CubeListBuilder.create(), PartPose.offset(3.5F, 2.5F, 2.2F));
		PartDefinition BackFlabL03_r1 = Back2.addOrReplaceChild("BackFlabL03_r1", CubeListBuilder.create().texOffs(54, 119).addBox(-5.5F, 2.5F, -1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -0.5F, -0.6F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -2.5F, 0.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Front2 = left_leg.addOrReplaceChild("Front2", CubeListBuilder.create(), PartPose.offset(3.5F, 2.5F, -2.2F));
		PartDefinition FrontFlabR03_r1 = Front2.addOrReplaceChild("FrontFlabR03_r1", CubeListBuilder.create().texOffs(54, 119).addBox(-5.5F, 2.5F, 0.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -0.5F, -0.4F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -2.5F, -1.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Flaps2 = left_leg.addOrReplaceChild("Flaps2", CubeListBuilder.create(), PartPose.offset(-2.5F, 2.5F, -0.1F));
		PartDefinition SideFlabR03_r2 = Flaps2.addOrReplaceChild("SideFlabR03_r2", CubeListBuilder.create().texOffs(36, 94).mirror().addBox(0.2F, 0.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition SideFlabR02_r2 = Flaps2.addOrReplaceChild("SideFlabR02_r2", CubeListBuilder.create().texOffs(36, 94).mirror().addBox(-0.4F, -1.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition SideFlabR01_r1 = Flaps2.addOrReplaceChild("SideFlabR01_r1", CubeListBuilder.create().texOffs(24, 95).mirror().addBox(-0.9F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition Back = left_leg.addOrReplaceChild("Back", CubeListBuilder.create(), PartPose.offset(3.5F, 2.5F, 2.2F));
		PartDefinition BackFlabR03_r1 = Back.addOrReplaceChild("BackFlabR03_r1", CubeListBuilder.create().texOffs(54, 119).addBox(-5.5F, 2.5F, -1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -0.5F, -0.6F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(-5.5F, -2.5F, 0.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Front = body.addOrReplaceChild("Front", CubeListBuilder.create().texOffs(37, 104).addBox(-1.5F, 0.0F, -0.2F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.2F))
				.texOffs(48, 90).addBox(1.0F, -2.3F, -0.2F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.5F, 3.0F, -2.3F));
		PartDefinition SideL_r1 = Front.addOrReplaceChild("SideL_r1", CubeListBuilder.create().texOffs(48, 97).addBox(-1.6F, -0.7F, -0.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(5.0F, -1.0F, 0.3F, 0.0F, 0.0F, 0.4363F));
		PartDefinition SideR_r1 = Front.addOrReplaceChild("SideR_r1", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(-1.4F, -0.7F, -0.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 0.3F, 0.0F, 0.0F, -0.4363F));

		PartDefinition ArmArmorR = right_arm.addOrReplaceChild("ArmArmorR", CubeListBuilder.create().texOffs(0, 90).addBox(0.4561F, -2.7F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F))
				.texOffs(18, 104).mirror().addBox(0.378F, -1.8853F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-4.378F, 1.8853F, 0.0F));
		PartDefinition SideFlabR02_r3 = ArmArmorR.addOrReplaceChild("SideFlabR02_r3", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(0.1F, -0.9F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(6, 92).mirror().addBox(-0.9F, -2.9F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition SholderPiceR = right_arm.addOrReplaceChild("SholderPiceR", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(1.2841F, 0.0738F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-3.5622F, -1.3885F, 1.5F));
		PartDefinition SideB_r1 = SholderPiceR.addOrReplaceChild("SideB_r1", CubeListBuilder.create().texOffs(8, 84).mirror().addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.4363F));
		PartDefinition SideF_r1 = SholderPiceR.addOrReplaceChild("SideF_r1", CubeListBuilder.create().texOffs(8, 84).mirror().addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.3054F, 0.4363F));
		PartDefinition Middel_r1 = SholderPiceR.addOrReplaceChild("Middel_r1", CubeListBuilder.create().texOffs(8, 86).mirror().addBox(-2.0F, -0.9F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.2841F, 0.5738F, -1.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition SholderPiceL = left_arm.addOrReplaceChild("SholderPiceL", CubeListBuilder.create().texOffs(0, 85).addBox(-3.2841F, 0.0738F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(3.5622F, -1.3885F, 1.5F));
		PartDefinition SideB_r2 = SholderPiceL.addOrReplaceChild("SideB_r2", CubeListBuilder.create().texOffs(8, 84).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, -0.4363F));
		PartDefinition SideF_r2 = SholderPiceL.addOrReplaceChild("SideF_r2", CubeListBuilder.create().texOffs(8, 84).addBox(-1.5F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.3054F, -0.4363F));
		PartDefinition Middel_r2 = SholderPiceL.addOrReplaceChild("Middel_r2", CubeListBuilder.create().texOffs(8, 86).addBox(-1.0F, -0.9F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2841F, 0.5738F, -1.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition ArmArmorL = left_arm.addOrReplaceChild("ArmArmorL", CubeListBuilder.create().texOffs(0, 90).addBox(-1.4F, -2.6F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F))
				.texOffs(18, 104).addBox(-4.378F, -1.8853F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(4.378F, 1.8853F, 0.0F));
		PartDefinition SideFlabL02_r1 = ArmArmorL.addOrReplaceChild("SideFlabL02_r1", CubeListBuilder.create().texOffs(0, 96).addBox(-1.1F, -0.9F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.2F))
				.texOffs(6, 92).addBox(-0.1F, -2.9F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Helmet = head.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 117).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition BackFlab_r1 = Helmet.addOrReplaceChild("BackFlab_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-4.2F, -1.5F, 0.1F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2F, -4.3F, 3.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition FrontFlabR_r1 = Helmet.addOrReplaceChild("FrontFlabR_r1", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-2.1F, -1.6F, -4.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(0, 104).mirror().addBox(-0.8F, -2.7F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition FrontFlabL_r1 = Helmet.addOrReplaceChild("FrontFlabL_r1", CubeListBuilder.create().texOffs(0, 121).addBox(-0.9F, -1.7F, -4.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 104).addBox(-0.7F, -2.7F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.5F, -3.5F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition HornR = head.addOrReplaceChild("HornR", CubeListBuilder.create().texOffs(50, 118).addBox(1.0F, -9.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 118).addBox(2.0F, -10.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 122).addBox(3.0F, -12.0F, -4.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 120).addBox(2.0F, -13.0F, -4.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition HornR2 = head.addOrReplaceChild("HornR2", CubeListBuilder.create().texOffs(50, 118).mirror().addBox(-2.0F, -9.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 118).mirror().addBox(-3.0F, -10.0F, -4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 122).mirror().addBox(-4.0F, -12.0F, -4.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 120).mirror().addBox(-3.0F, -13.0F, -4.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}
}