package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class ArrowArmorModel extends HumanoidModel{

	public ArrowArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition  = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition Arrow = head.addOrReplaceChild("Arrow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7143F, -7.0F, -0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition FeatherFlat2_r1 = Arrow.addOrReplaceChild("FeatherFlat2_r1", CubeListBuilder.create().texOffs(37, 54).addBox(-1.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2857F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Tip2_r1 = Arrow.addOrReplaceChild("Tip2_r1", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 54).mirror().addBox(9.5F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 56).mirror().addBox(1.5F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2143F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Tip1_r1 = Arrow.addOrReplaceChild("Tip1_r1", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 54).mirror().addBox(9.5F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 56).mirror().addBox(1.5F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2143F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}