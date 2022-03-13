package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class SmallTopHatArmorModel extends HumanoidModel {

	public SmallTopHatArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition TopHat = head.addOrReplaceChild("TopHat", CubeListBuilder.create().texOffs(52, 56).addBox(-2.0F, -6.25F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(-3.0F, -1.25F, -4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -31.75F, 4.0F, -0.2618F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}