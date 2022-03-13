package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FlowerCrownArmorModel extends HumanoidModel {

	public FlowerCrownArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition FlowerCrown = head.addOrReplaceChild("FlowerCrown", CubeListBuilder.create().texOffs(0, 43).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Rose = FlowerCrown.addOrReplaceChild("Rose", CubeListBuilder.create().texOffs(60, 47).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 54).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 49).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 56).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 52).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -31.0F, 1.0F, 0.0F, 0.0F, 1.3526F));

		PartDefinition BottemLeaf_r1 = Rose.addOrReplaceChild("BottemLeaf_r1", CubeListBuilder.create().texOffs(50, 47).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, -0.0436F));

		PartDefinition LeftLeaf_r1 = Rose.addOrReplaceChild("LeftLeaf_r1", CubeListBuilder.create().texOffs(50, 50).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition TopLeaf_r1 = Rose.addOrReplaceChild("TopLeaf_r1", CubeListBuilder.create().texOffs(50, 55).addBox(-2.0F, -1.0F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition RightLeaf_r1 = Rose.addOrReplaceChild("RightLeaf_r1", CubeListBuilder.create().texOffs(50, 58).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}