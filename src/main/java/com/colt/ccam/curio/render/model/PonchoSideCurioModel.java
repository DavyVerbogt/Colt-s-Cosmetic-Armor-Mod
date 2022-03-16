package com.colt.ccam.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class PonchoSideCurioModel extends HumanoidModel {

    public PonchoSideCurioModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createCurioModel(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.getChild("body");
        body.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Poncho = body.addOrReplaceChild("Poncho", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(1.5F, -0.8F, -3.0F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-9.5F, 0.1F, 0.0F));

        PartDefinition BackPoncho_r1 = Poncho.addOrReplaceChild("BackPoncho_r1", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-12.2F, -10.3F, -6.0F, 14.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(36, 48).mirror().addBox(-12.2F, -10.3F, 0.0F, 14.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.5657F, 7.1414F, -3.0F, 0.0F, -3.1416F, -1.0472F));

        PartDefinition Right_r1 = Poncho.addOrReplaceChild("Right_r1", CubeListBuilder.create().texOffs(45, 41).addBox(-1.9F, 0.2F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition Left_r1 = Poncho.addOrReplaceChild("Left_r1", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-2.6F, 0.9F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition HangingBits = Poncho.addOrReplaceChild("HangingBits", CubeListBuilder.create().texOffs(38, 45).addBox(4.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).mirror().addBox(4.95F, 8.55F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).addBox(6.3F, 6.05F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).addBox(7.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).addBox(8.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).mirror().addBox(0.7F, 9.55F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-2.8F, 7.55F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-5.8F, 5.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-8.8F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 44).addBox(10.3F, 0.8F, 0.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 44).addBox(10.3F, 0.8F, -1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 44).mirror().addBox(-10.2F, 2.7F, 0.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 44).mirror().addBox(-10.2F, 2.7F, -1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-8.8F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-5.8F, 5.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(-2.8F, 7.55F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(0.7F, 9.55F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).mirror().addBox(4.95F, 8.55F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 45).addBox(6.3F, 6.05F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).addBox(7.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).addBox(8.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(9.5F, -0.1F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
