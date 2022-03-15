package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class TrafficConeArmorModel extends HumanoidModel {

	public TrafficConeArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition TraficCone = head.addOrReplaceChild("TraficCone", CubeListBuilder.create().texOffs(20, 53).addBox(-6.0F, -8.0F, -5.0F, 12.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(31, 51).addBox(-5.0F, -8.0F, -6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 49).addBox(-5.0F, -8.0F, 5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 39).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(7, 43).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(42, 41).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 59).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}