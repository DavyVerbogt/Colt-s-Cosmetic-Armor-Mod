package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class TulipArmorModel extends HumanoidModel {

	public TulipArmorModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition Tulip = head.addOrReplaceChild("Tulip", CubeListBuilder.create(), PartPose.offset(-3.0F, -5.0F, 2.0F));

		PartDefinition Tulip1 = Tulip.addOrReplaceChild("Tulip1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.1309F, -0.0873F));

		PartDefinition Stem_r1 = Tulip1.addOrReplaceChild("Stem_r1", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -5.0F, -3.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition BulpBottem_r1 = Tulip1.addOrReplaceChild("BulpBottem_r1", CubeListBuilder.create().texOffs(30, 59).addBox(-1.5F, -0.4F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 54).addBox(-1.5F, -1.6F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4059F, -5.0F, -2.4897F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tulip2 = Tulip.addOrReplaceChild("Tulip2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Stem_r2 = Tulip2.addOrReplaceChild("Stem_r2", CubeListBuilder.create().texOffs(8, 54).addBox(0.0F, -5.0F, -2.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition BulpBottem_r2 = Tulip2.addOrReplaceChild("BulpBottem_r2", CubeListBuilder.create().texOffs(18, 58).addBox(-2.0F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(18, 53).addBox(-2.0F, -2.6F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 2.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Tulip3 = Tulip.addOrReplaceChild("Tulip3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -1.7453F, -0.5236F));

		PartDefinition BulpBottem_r3 = Tulip3.addOrReplaceChild("BulpBottem_r3", CubeListBuilder.create().texOffs(44, 59).addBox(-2.0F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(44, 54).addBox(-2.0F, -2.6F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 2.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Stem_r3 = Tulip3.addOrReplaceChild("Stem_r3", CubeListBuilder.create().texOffs(8, 54).addBox(0.0F, -5.0F, -2.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}