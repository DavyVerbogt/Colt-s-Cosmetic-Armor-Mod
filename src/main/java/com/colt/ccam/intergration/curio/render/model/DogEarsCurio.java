package com.colt.ccam.intergration.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class DogEarsCurio  extends HumanoidModel {

	public DogEarsCurio(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createCurioModel(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");
		head.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition DogEarsL = head.addOrReplaceChild("DogEarsL", CubeListBuilder.create().texOffs(8, 59).addBox(4.5F, 1.45F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(-3.3F, -12F, -1.5F));

		PartDefinition Rotated_r1 = DogEarsL.addOrReplaceChild("Rotated_r1", CubeListBuilder.create().texOffs(12, 53).addBox(-1.5F, -0.45F, -0.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.0F, 1.95F, -2.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition EarL_r1 = DogEarsL.addOrReplaceChild("EarL_r1", CubeListBuilder.create().texOffs(7, 57).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.0F, 1.65F, -0.2F, -0.7854F, 0.0F, 0.0F));

		PartDefinition EarFlopL3 = DogEarsL.addOrReplaceChild("EarFlopL3", CubeListBuilder.create().texOffs(12, 50).addBox(-3.2222F, 1.5669F, -3.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.1F, -0.05F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition TopL_r1 = EarFlopL3.addOrReplaceChild("TopL_r1", CubeListBuilder.create().texOffs(12, 47).addBox(-1.7956F, 4.9313F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0399F, -0.0843F, -1.7F, 0.0F, 0.0F, 0.7854F));

		PartDefinition DogEarsR = head.addOrReplaceChild("DogEarsR", CubeListBuilder.create().texOffs(0, 59).addBox(4.1F, 1.45F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(-8.3F, -12F, -1.5F));

		PartDefinition Rotated_r2 = DogEarsR.addOrReplaceChild("Rotated_r2", CubeListBuilder.create().texOffs(0, 53).addBox(-1.5F, -0.45F, -0.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.6F, 1.95F, -2.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition EarL_r2 = DogEarsR.addOrReplaceChild("EarL_r2", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.6F, 1.65F, -0.2F, -0.7854F, 0.0F, 0.0F));

		PartDefinition EarFlopL4 = DogEarsR.addOrReplaceChild("EarFlopL4", CubeListBuilder.create().texOffs(0, 50).addBox(-3.598F, 1.5669F, -3.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.2F, 1.35F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition TopL_r2 = EarFlopL4.addOrReplaceChild("TopL_r2", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0614F, 5.1971F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0399F, -0.0843F, -1.7F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}