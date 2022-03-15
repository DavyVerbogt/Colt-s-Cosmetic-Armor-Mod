package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class WolfArmorModel extends HumanoidModel {

	public WolfArmorModel(ModelPart root) {
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

		PartDefinition FluffArmourR = right_leg.addOrReplaceChild("FluffArmourR", CubeListBuilder.create().texOffs(37, 34).addBox(2.9688F, -2.4688F, -1.9562F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(24, 41).addBox(2.9688F, -1.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(2.9688F, -0.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(6.9688F, -0.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(6.9688F, -0.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(6.9688F, -1.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(6.9688F, -1.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(2.9688F, -1.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(3.9688F, -0.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(4.9688F, -4.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 41).addBox(2.9688F, -3.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(3.9688F, -4.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(6.9688F, -4.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(6.9688F, -3.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(6.9688F, -4.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(6.9688F, -4.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(2.9688F, -3.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.9688F, 9.9688F, 0.1563F));
		PartDefinition RPents = right_leg.addOrReplaceChild("RPents", CubeListBuilder.create().texOffs(16, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition JacketLeftLeg = left_leg.addOrReplaceChild("JacketLeftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition FluffArmourL = left_leg.addOrReplaceChild("FluffArmourL", CubeListBuilder.create().texOffs(37, 34).addBox(-3.0313F, -2.4688F, -1.9562F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(24, 41).addBox(-3.0313F, -1.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(-3.0313F, -0.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(0.9688F, -0.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(0.9688F, -0.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(0.9688F, -1.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(0.9688F, -1.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(-3.0313F, -1.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(-3.0313F, -0.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(-1.0313F, -4.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 41).addBox(-3.0313F, -3.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(-2.0313F, -4.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(0.9688F, -4.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(0.9688F, -3.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(0.9688F, -4.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(0.9688F, -4.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(-3.0313F, -3.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9688F, 8.9688F, 0.1563F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LPents = left_leg.addOrReplaceChild("LPents", CubeListBuilder.create().texOffs(0, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chest = body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 64).addBox(-4.0F, 2.5F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(0, 78).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition knife = Chest.addOrReplaceChild("knife", CubeListBuilder.create().texOffs(20, 65).addBox(-4.0F, -1.5F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 64).addBox(-3.5F, 0.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 73).addBox(-3.5F, -0.5F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(20, 65).addBox(-3.5F, -2.5F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.5F, 0.0F));
		PartDefinition FrontMiddel_r1 = knife.addOrReplaceChild("FrontMiddel_r1", CubeListBuilder.create().texOffs(26, 64).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, -4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition SholderPieceR = right_arm.addOrReplaceChild("SholderPieceR", CubeListBuilder.create().texOffs(42, 42).addBox(-5.0F, -2.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(24, 41).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(-5.0F, 2.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(-3.0F, 2.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(-5.0F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(-5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(-5.0F, -1.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 40).addBox(-4.0F, -1.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(-1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition JacketLeftArm = left_arm.addOrReplaceChild("JacketLeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition SholderPieceL = JacketLeftArm.addOrReplaceChild("SholderPieceL", CubeListBuilder.create().texOffs(58, 46).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 41).addBox(0.0F, 1.0F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 34).addBox(0.0F, 2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(44, 41).addBox(0.0F, 4.0F, -3.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 34).addBox(0.0F, 7.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(24, 41).addBox(0.0F, 8.0F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 46).addBox(0.0F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(4.0F, 0.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 40).addBox(4.0F, 4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 40).addBox(4.0F, 4.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 49).addBox(4.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 59).addBox(4.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 41).addBox(4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(0.0F, 1.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 41).addBox(0.0F, 4.0F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 52).addBox(0.0F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 39).addBox(0.0F, 8.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 57).addBox(4.0F, 8.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 0.0F));

		PartDefinition Bones = JacketLeftArm.addOrReplaceChild("Bones", CubeListBuilder.create().texOffs(60, 38).addBox(-5.0F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 37).mirror().addBox(-4.0F, 4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 35).addBox(-4.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 35).addBox(-4.5F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 39).addBox(-4.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 0.0F, 0.0F));

		PartDefinition WolfHead = head.addOrReplaceChild("WolfHead", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -12.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(10, 51).addBox(1.0F, -14.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 51).addBox(-3.0F, -14.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 59).addBox(-1.5F, -9.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));
		PartDefinition TheethR_r1 = WolfHead.addOrReplaceChild("TheethR_r1", CubeListBuilder.create().texOffs(35, 61).addBox(-0.3F, -0.8F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.0F, -4.5F, 0.0F, 0.0F, 0.8727F));
		PartDefinition TheethL_r1 = WolfHead.addOrReplaceChild("TheethL_r1", CubeListBuilder.create().texOffs(35, 61).addBox(-0.7F, -0.3F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -7.0F, -4.5F, 0.0F, 0.0F, 0.8727F));
		PartDefinition WolfHide = head.addOrReplaceChild("WolfHide", CubeListBuilder.create().texOffs(16, 53).addBox(-5.0F, -9.0F, 0.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 47).addBox(4.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 47).addBox(-5.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 43).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 43).addBox(-5.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 59).addBox(-2.5F, -10.0F, 2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 62).addBox(-3.5F, -9.0F, 4.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 56).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 56).addBox(4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 56).addBox(-3.0F, 2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 56).addBox(0.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));
		PartDefinition WolfTail = head.addOrReplaceChild("WolfTail", CubeListBuilder.create().texOffs(54, 51).addBox(1.0F, -2.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 50).addBox(-1.0F, -2.0F, 6.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 54).addBox(-1.0F, -3.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 52).addBox(-2.0F, -2.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 49).addBox(-1.0F, 0.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 49).addBox(-0.5F, 1.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}
	}