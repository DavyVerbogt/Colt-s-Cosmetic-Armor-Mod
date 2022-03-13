package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class WitchHatArmorModel extends HumanoidModel {

	public WitchHatArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition WitchHat = head.addOrReplaceChild("WitchHat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = WitchHat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 55).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = WitchHat.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 56).addBox(-2.0F, -9.0F, -3.3F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r3 = WitchHat.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 38).addBox(-3.0F, -6.0F, -3.8F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = WitchHat.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 40).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = WitchHat.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 52).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}