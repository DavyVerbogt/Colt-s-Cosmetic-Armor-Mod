package com.colt.ccam.intergration.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class SunglassCurioModel  extends HumanoidModel {

    public SunglassCurioModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createCurioModel(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");

        head.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 57).addBox(-4.0F, -29.0F, -4.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition GassL = head.addOrReplaceChild("GassL", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-2.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(3.5F, -3.5F, -4.0F));

        PartDefinition White_r1 = GassL.addOrReplaceChild("White_r1", CubeListBuilder.create().texOffs(49, 62).addBox(1.2F, 1.8F, -0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

        PartDefinition L_r1 = GassL.addOrReplaceChild("L_r1", CubeListBuilder.create().texOffs(62, 63).addBox(-0.7F, -1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

        PartDefinition R_r1 = GassL.addOrReplaceChild("R_r1", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-2.7F, 1.8F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

        PartDefinition GlassR = head.addOrReplaceChild("GlassR", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-3.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offset(0.5F, -3.5F, -4.0F));

        PartDefinition White_r2 = GlassR.addOrReplaceChild("White_r2", CubeListBuilder.create().texOffs(49, 62).addBox(-1.3F, -1.3F, -0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F))
                .texOffs(62, 63).addBox(-0.7F, -1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

        PartDefinition R_r2 = GlassR.addOrReplaceChild("R_r2", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-2.7F, 1.8F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
