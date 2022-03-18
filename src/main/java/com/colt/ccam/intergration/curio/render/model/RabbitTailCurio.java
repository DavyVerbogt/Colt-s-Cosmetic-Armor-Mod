package com.colt.ccam.intergration.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class RabbitTailCurio  extends HumanoidModel {

	public RabbitTailCurio(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createCurioModel(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.getChild("body");
		body.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 10.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}