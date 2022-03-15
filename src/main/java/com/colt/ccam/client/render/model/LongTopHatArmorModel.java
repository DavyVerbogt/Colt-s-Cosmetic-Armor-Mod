package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class LongTopHatArmorModel  extends HumanoidModel {

    public LongTopHatArmorModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");

        PartDefinition TopHat = head.addOrReplaceChild("TopHat", CubeListBuilder.create().texOffs(32, 32).addBox(-4.0F, -25.5F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(32, 54).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 0.0F, -0.1309F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}