package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class MonocleArmorModel extends HumanoidModel {

	public MonocleArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition Monical = head.addOrReplaceChild("Monical", CubeListBuilder.create().texOffs(58, 60).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 62).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 58).addBox(1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 61).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 61).addBox(-2.0F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 59).addBox(-3.0F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 61).addBox(-4.0F, 2.0F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 59).addBox(-4.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 61).addBox(-3.0F, 1.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 58).addBox(-3.0F, 0.0F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -4.0F, -4.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
	}