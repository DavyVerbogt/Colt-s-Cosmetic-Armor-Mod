package com.colt.ccam.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class CatTailCurio extends HumanoidModel {

	public CatTailCurio(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createCurioModel(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.getChild("body");

		body.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerTail_r1 = body.addOrReplaceChild("LowerTail_r1", CubeListBuilder.create().texOffs(4, 57).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5F, 4.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition TopTail_r1 = body.addOrReplaceChild("TopTail_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 1.5F, -2.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, 2.5F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}