package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FurCoatArmorModel extends HumanoidModel {

    public FurCoatArmorModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.getChild("body");

        PartDefinition Jacket = body.addOrReplaceChild("Jacket", CubeListBuilder.create().texOffs(40, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition FurNeckThing = Jacket.addOrReplaceChild("FurNeckThing", CubeListBuilder.create().texOffs(19, 48).addBox(-5.0F, -2.0F, 4.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 57).mirror().addBox(3.8F, -1.0F, -2.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(24, 57).mirror().addBox(3.8F, -1.0F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(24, 57).addBox(-5.8F, -1.0F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 57).addBox(-5.8F, -1.0F, -2.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = FurNeckThing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(0.3F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(-5.3F, -0.5F, 4.5F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r2 = FurNeckThing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 47).addBox(-1.3F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(5.3F, -0.5F, 4.5F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r3 = FurNeckThing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, 0.4F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.0F, -2.0F, 0.1047F, 0.0F, -0.3927F));

        PartDefinition cube_r4 = FurNeckThing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-1.0F, 0.4F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -1.0F, -2.0F, 0.1047F, 0.0F, 0.3927F));

        PartDefinition FurFlufs = Jacket.addOrReplaceChild("FurFlufs", CubeListBuilder.create().texOffs(35, 60).addBox(-1.8F, -2.4F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(-3.8F, -2.4F, 4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(1.2F, -2.4F, 4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(3.2F, -2.4F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(1.8F, -0.9F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(3.7F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(-1.6F, -0.6F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(-3.0F, -0.6F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(0.2F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(-3.8F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(-4.8F, -2.3F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).addBox(3.6F, -2.4F, 3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(3.8F, -1.5F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.4F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.4F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.2F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.3F, -0.4F, 2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.3F, -0.4F, 2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.0F, -1.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.0F, -1.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.0F, -1.2F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.0F, -1.2F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.2F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.2F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.7F, -1.6F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.7F, -1.6F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.2F, -2.0F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.2F, -2.0F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.5F, -1.6F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.5F, -1.6F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.1F, -0.9F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.1F, -0.9F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.2F, -1.4F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.2F, -1.4F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-6.3F, -0.5F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(5.3F, -0.5F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-4.1F, 0.9F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(3.1F, 0.9F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-5.0F, 0.9F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(4.0F, 0.9F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
                .texOffs(35, 60).addBox(-4.9F, -1.4F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(35, 60).mirror().addBox(3.9F, -1.4F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 1.0F, 0.0F));

        PartDefinition RightLegJacket = bipedRightArm.addOrReplaceChild("RightLegJacket", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create(), PartPose.offset(4.0F, 1.0F, 0.0F));

        PartDefinition LeftLegJacket = bipedLeftArm.addOrReplaceChild("LeftLegJacket", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}