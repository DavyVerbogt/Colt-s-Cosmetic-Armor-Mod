package com.colt.ccam.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class RabitEarsCurio  extends HumanoidModel {

	public RabitEarsCurio(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createCurioModel(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");
		head.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BunnyEars = head.addOrReplaceChild("BunnyEars", CubeListBuilder.create().texOffs(0, 54).addBox(-1.7F, -3.55F, -0.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(8, 57).addBox(4.3F, -1.55F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(-2.8f, -12F, -1.5F));

		PartDefinition Rotated_r1 = BunnyEars.addOrReplaceChild("Rotated_r1", CubeListBuilder.create().texOffs(8, 54).addBox(-1.5F, -0.45F, -1.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.8F, -1.05F, -1.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition TopR_r1 = BunnyEars.addOrReplaceChild("TopR_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-3.8399F, 0.7343F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0399F, -2.6843F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition EarFlopL = BunnyEars.addOrReplaceChild("EarFlopL", CubeListBuilder.create().texOffs(16, 61).addBox(-2.384F, -1.3206F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.1F, -0.05F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition TopL_r1 = EarFlopL.addOrReplaceChild("TopL_r1", CubeListBuilder.create().texOffs(16, 58).addBox(-3.2447F, 2.2969F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0399F, -0.0843F, -1.7F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}