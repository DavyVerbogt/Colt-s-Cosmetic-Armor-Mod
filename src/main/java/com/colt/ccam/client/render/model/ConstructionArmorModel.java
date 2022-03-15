package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ConstructionArmorModel extends HumanoidModel {

	public ConstructionArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(28, 53).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(44, 55).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(44, 55).addBox(4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(-3.0F, -10.0F, 3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 53).addBox(-4.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 53).addBox(3.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(60, 47).addBox(-2.0F, -8.5F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 47).addBox(1.0F, -8.5F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 55).addBox(-2.0F, -11.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 55).addBox(1.0F, -11.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 54).addBox(-1.0F, -12.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 47).addBox(-2.0F, -12.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(52, 47).addBox(1.0F, -12.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}