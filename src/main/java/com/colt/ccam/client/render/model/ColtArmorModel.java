package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ColtArmorModel extends HumanoidModel {

    public ColtArmorModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");
        PartDefinition body = partdefinition.getChild("body");
        PartDefinition right_arm = partdefinition.getChild("right_arm");
        PartDefinition left_arm = partdefinition.getChild("left_arm");
        PartDefinition right_leg = partdefinition.getChild("right_leg");
        PartDefinition left_leg = partdefinition.getChild("left_leg");

        PartDefinition JacketRightLeg = left_leg.addOrReplaceChild("JacketRightLeg", CubeListBuilder.create().texOffs(1, 41).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(.0F, 0.0F, 0.0F));

        PartDefinition JacketLeftLeg = right_leg.addOrReplaceChild("JacketLeftLeg", CubeListBuilder.create().texOffs(1, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-.0F, 0.0F, 0.0F));

        PartDefinition BackThing = body.addOrReplaceChild("BackThing", CubeListBuilder.create().texOffs(8, 56).addBox(-2.0F, 3.0F, 1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(2, 54).addBox(0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(2, 54).addBox(0.0F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition CopperWaterTank = BackThing.addOrReplaceChild("CopperWaterTank", CubeListBuilder.create().texOffs(2, 54).addBox(-2.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 56).addBox(-1.0F, 3.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 56).addBox(-3.0F, 3.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(2, 54).addBox(-2.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition CopperHeaterTank = BackThing.addOrReplaceChild("CopperHeaterTank", CubeListBuilder.create().texOffs(2, 54).addBox(1.0F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 59).addBox(1.0F, 5.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Jacket = body.addOrReplaceChild("Jacket", CubeListBuilder.create().texOffs(17, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition JacketRightArm = right_arm.addOrReplaceChild("JacketRightArm", CubeListBuilder.create().texOffs(41, 41).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(1F, -1F, 0F));

        PartDefinition JacketLeftArm = left_arm.addOrReplaceChild("JacketLeftArm", CubeListBuilder.create().texOffs(41, 41).mirror().addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(-1F, -1F, -0F));

        PartDefinition Goggels = head.addOrReplaceChild("Goggels", CubeListBuilder.create().texOffs(40, 33).addBox(-8.0F, -2.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 34).addBox(-3.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 34).addBox(-7.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 34).addBox(-7.0F, 0.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 34).addBox(-3.0F, 0.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 25).addBox(-8.0F, -3.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.75F, 0.0F, -0.1309F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}