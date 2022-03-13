package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class NachoSombraroArmorModel extends HumanoidModel {

	public NachoSombraroArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition Sombraro = head.addOrReplaceChild("Sombraro", CubeListBuilder.create().texOffs(0, 87).addBox(-5.6F, 0.6F, -9.0F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 106).addBox(-9.6F, 0.6F, -5.0F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 106).addBox(4.4F, 0.6F, -5.0F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-7.6F, 0.6F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(4.4F, 0.6F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-7.6F, 0.6F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(4.4F, 0.6F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(7.4F, -0.4F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-9.6F, -0.4F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-5.6F, -0.4F, -9.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-5.6F, -0.4F, 8.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(-7.6F, -0.4F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(-8.6F, -0.4F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(4.4F, -0.4F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(6.4F, -0.4F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(-7.6F, -0.4F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(-8.6F, -0.4F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(4.4F, -0.4F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(6.4F, -0.4F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-2.6F, -3.4F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-2.6F, -3.4F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(-3.6F, -3.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(1.4F, -3.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, 66).addBox(-2.6F, -4.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -31.2F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition MiddelSideL_r1 = Sombraro.addOrReplaceChild("MiddelSideL_r1", CubeListBuilder.create().texOffs(0, 87).addBox(3.6F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.5F))
				.texOffs(12, 75).addBox(-4.1F, -2.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.5F))
				.texOffs(20, 71).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Nacho = head.addOrReplaceChild("Nacho", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -31.2F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Fourteen_r1 = Nacho.addOrReplaceChild("Fourteen_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -0.5F, -1.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition FourteenN_r1 = Nacho.addOrReplaceChild("FourteenN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -0.5F, -1.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Thirteen_r1 = Nacho.addOrReplaceChild("Thirteen_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.5F, -6.6F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition ThirteenN_r1 = Nacho.addOrReplaceChild("ThirteenN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.5F, -6.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Twelve_r1 = Nacho.addOrReplaceChild("Twelve_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.5F, -7.1F, -0.7854F, 0.0F, 0.0F));

		PartDefinition TwelveN_r1 = Nacho.addOrReplaceChild("TwelveN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.5F, -7.1F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition Eleven_r1 = Nacho.addOrReplaceChild("Eleven_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7F, -0.5F, -1.8F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition ElevenN_r1 = Nacho.addOrReplaceChild("ElevenN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7F, -0.5F, -1.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Ten_r1 = Nacho.addOrReplaceChild("Ten_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -0.5F, 5.9F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition TenN_r1 = Nacho.addOrReplaceChild("TenN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -0.5F, 5.9F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Nein_r1 = Nacho.addOrReplaceChild("Nein_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.5F, 5.2F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition NeinN_r1 = Nacho.addOrReplaceChild("NeinN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.5F, 5.2F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Eight_r1 = Nacho.addOrReplaceChild("Eight_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 6.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition EightN_r1 = Nacho.addOrReplaceChild("EightN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 6.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Seven_r1 = Nacho.addOrReplaceChild("Seven_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -5.7F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition SevenN_r1 = Nacho.addOrReplaceChild("SevenN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -5.7F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Six_r1 = Nacho.addOrReplaceChild("Six_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.5F, 5.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition SixN_r1 = Nacho.addOrReplaceChild("SixN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.5F, 5.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Five_r1 = Nacho.addOrReplaceChild("Five_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.5F, 1.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition FiveN_r1 = Nacho.addOrReplaceChild("FiveN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.5F, 1.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Four_r1 = Nacho.addOrReplaceChild("Four_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.5F, -4.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition FourN_r1 = Nacho.addOrReplaceChild("FourN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(-10.7F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.5F, -4.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Three_r1 = Nacho.addOrReplaceChild("Three_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, -0.5F, 4.2F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition ThreeN_r1 = Nacho.addOrReplaceChild("ThreeN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, -0.5F, 4.2F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Two_r1 = Nacho.addOrReplaceChild("Two_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, -0.5F, -4.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition One_r1 = Nacho.addOrReplaceChild("One_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.2F, -0.6F, -0.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -0.5F, 0.5F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition OneN_r1 = Nacho.addOrReplaceChild("OneN_r1", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -0.5F, 0.5F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}
}