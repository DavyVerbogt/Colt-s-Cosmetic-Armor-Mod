package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MajimaContructionHatArmorModel extends HumanoidModel {

	public MajimaContructionHatArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition MajimaConstructionHat = head.addOrReplaceChild("MajimaConstructionHat", CubeListBuilder.create().texOffs(28, 53).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(46, 44).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(46, 44).addBox(4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(-3.0F, -11.0F, 3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 52).addBox(-4.0F, -11.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(18, 52).addBox(3.0F, -11.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Logo_r1 = MajimaConstructionHat.addOrReplaceChild("Logo_r1", CubeListBuilder.create().texOffs(12, 55).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -9.5F, -4.5F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}