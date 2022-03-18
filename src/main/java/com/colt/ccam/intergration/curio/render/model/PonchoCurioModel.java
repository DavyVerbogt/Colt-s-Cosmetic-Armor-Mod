package com.colt.ccam.intergration.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class PonchoCurioModel extends HumanoidModel {

    public PonchoCurioModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createCurioModel(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.getChild("body");
        body.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Poncho = body.addOrReplaceChild("Poncho", CubeListBuilder.create().texOffs(20, 43).addBox(1.5F, -0.5F, -3.0F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.5F, 0.1F, 0.0F));

        PartDefinition Right_r1 = Poncho.addOrReplaceChild("Right_r1", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-1.5F, 0.8F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition Left_r1 = Poncho.addOrReplaceChild("Left_r1", CubeListBuilder.create().texOffs(18, 50).addBox(-1.5F, 0.8F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition BackPoncho_r1 = Poncho.addOrReplaceChild("BackPoncho_r1", CubeListBuilder.create().texOffs(36, 50).addBox(-3.2F, -10.9F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4343F, 7.1414F, 3.0F, 0.0F, 3.1416F, 0.7854F));

        PartDefinition FrontPoncho_r1 = Poncho.addOrReplaceChild("FrontPoncho_r1", CubeListBuilder.create().texOffs(36, 50).addBox(-3.2F, -10.9F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4343F, 7.1414F, -3.0F, 0.0F, 3.1416F, 0.7854F));

        PartDefinition HangingBits = Poncho.addOrReplaceChild("HangingBits", CubeListBuilder.create().texOffs(34, 63).addBox(-2.7F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).mirror().addBox(-5.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).mirror().addBox(-7.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).mirror().addBox(-9.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).addBox(1.8F, 8.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(4.3F, 6.3F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(6.55F, 4.05F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(8.8F, 1.8F, -3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(-2.7F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).mirror().addBox(-5.3F, 6.3F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).mirror().addBox(-7.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).mirror().addBox(-9.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).addBox(1.8F, 8.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(4.3F, 6.3F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(6.55F, 4.05F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(8.8F, 1.8F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).mirror().addBox(-9.9F, 1.8F, 0.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).mirror().addBox(-9.9F, 1.8F, -1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(34, 63).addBox(9.9F, 1.8F, 0.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(9.9F, 1.8F, -1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.5F, -0.1F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
