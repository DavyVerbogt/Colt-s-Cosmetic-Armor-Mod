package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class SombreroArmorModel extends HumanoidModel {

	public SombreroArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition Sombraro = head.addOrReplaceChild("Sombraro", CubeListBuilder.create().texOffs(0, 87).addBox(-5.0F, -8.0F, -9.0F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 106).addBox(-9.0F, -8.0F, -5.0F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 106).addBox(5.0F, -8.0F, -5.0F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-7.0F, -8.0F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(5.0F, -8.0F, 5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-7.0F, -8.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(5.0F, -8.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(8.0F, -9.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(-9.0F, -9.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-5.0F, -9.0F, -9.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-5.0F, -9.0F, 8.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(-7.0F, -9.0F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(-8.0F, -9.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(5.0F, -9.0F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(7.0F, -9.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(-7.0F, -9.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(-8.0F, -9.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(5.0F, -9.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(7.0F, -9.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 71).addBox(-3.0F, -10.0F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.1F))
				.texOffs(12, 75).addBox(-4.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.1F))
				.texOffs(0, 87).addBox(3.0F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.1F))
				.texOffs(0, 68).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-2.0F, -11.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(-3.0F, -11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(2.0F, -11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, 66).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}
}