package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class TopTopTopHatModel extends HumanoidModel {

	public TopTopTopHatModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition  = meshdefinition.getRoot();
		PartDefinition head = partdefinition.getChild("head");

		PartDefinition TophatAll = head.addOrReplaceChild("TophatAll", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -6.75F, 4.0F, -0.2618F, 0.0F, 0.2618F));
		PartDefinition TopHat = TophatAll.addOrReplaceChild("TopHat", CubeListBuilder.create().texOffs(52, 56).addBox(-2.0F, -6.25F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(-3.0F, -1.25F, -4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TopHat2 = TophatAll.addOrReplaceChild("TopHat2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition Bottem_r1 = TopHat2.addOrReplaceChild("Bottem_r1", CubeListBuilder.create().texOffs(44, 56).addBox(-2.5052F, -1.3118F, -2.187F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
				.texOffs(52, 56).addBox(-1.5052F, -5.3118F, -1.187F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.5F, -0.1176F, -0.5681F, -0.2618F, 0.0F, 0.2618F));
		PartDefinition TopHat3 = TophatAll.addOrReplaceChild("TopHat3", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 0.0F));
		PartDefinition Bottem_r2 = TopHat3.addOrReplaceChild("Bottem_r2", CubeListBuilder.create().texOffs(44, 56).addBox(-2.7333F, -0.5269F, -3.6744F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.8F))
				.texOffs(52, 56).addBox(-1.7333F, -3.9269F, -2.6744F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(1.0F, -0.3176F, 2.7319F, -0.4363F, 0.0F, -0.4363F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}