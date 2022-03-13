package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class CowBoyHatArmorModel extends HumanoidModel {

	public CowBoyHatArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition CowboyHat = head.addOrReplaceChild("CowboyHat", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(34, 42).addBox(1.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(42, 33).addBox(-4.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 51).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -32.0F, 0.0F));

		PartDefinition FlabRight_r1 = CowboyHat.addOrReplaceChild("FlabRight_r1", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition FlabLeft_r1 = CowboyHat.addOrReplaceChild("FlabLeft_r1", CubeListBuilder.create().texOffs(12, 35).addBox(0.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 64);

	}
}