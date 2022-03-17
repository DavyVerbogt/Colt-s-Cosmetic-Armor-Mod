package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FourthOfJullyModel extends HumanoidModel {

    public FourthOfJullyModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");

        head.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition FourthJuly = head.addOrReplaceChild("4thJuly", CubeListBuilder.create().texOffs(0, 92).addBox(-4.5F, -4.0F, -4.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 81).addBox(-5.0F, -12.75F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition Right_r1 = FourthJuly.addOrReplaceChild("Right_r1", CubeListBuilder.create().texOffs(30, 101).addBox(-1.2F, -9.5F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -2.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition Left_r1 = FourthJuly.addOrReplaceChild("Left_r1", CubeListBuilder.create().texOffs(0, 104).addBox(0.2F, -9.5F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition Back_r1 = FourthJuly.addOrReplaceChild("Back_r1", CubeListBuilder.create().texOffs(36, 68).addBox(-3.0F, -9.5F, 0.2F, 6.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 3.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition Front_r1 = FourthJuly.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(14, 104).addBox(-3.0F, -9.5F, -1.2F, 6.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition BackRightSide_r1 = FourthJuly.addOrReplaceChild("BackRightSide_r1", CubeListBuilder.create().texOffs(44, 101).addBox(-1.1F, -10.5F, -0.9F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.5F, 3.0F, -0.0873F, 0.0F, -0.0873F));

        PartDefinition BackLeftSide_r1 = FourthJuly.addOrReplaceChild("BackLeftSide_r1", CubeListBuilder.create().texOffs(46, 79).addBox(-0.9F, -10.5F, -0.9F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.5F, 3.0F, -0.0873F, 0.0F, 0.0873F));

        PartDefinition LeftSide_r1 = FourthJuly.addOrReplaceChild("LeftSide_r1", CubeListBuilder.create().texOffs(44, 114).addBox(-0.9F, -10.5F, -1.1F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.5F, -3.0F, 0.0873F, 0.0F, 0.0873F));

        PartDefinition RightSide_r1 = FourthJuly.addOrReplaceChild("RightSide_r1", CubeListBuilder.create().texOffs(14, 115).addBox(-1.1F, -10.5F, -1.1F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.5F, -3.0F, 0.0873F, 0.0F, -0.0873F));


        return LayerDefinition.create(meshdefinition, 64, 128);
    }
}
