package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ShotCowBoyHatArmorModel extends HumanoidModel {

    public ShotCowBoyHatArmorModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createArmorLayer(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");

            PartDefinition CowboyHat = head.addOrReplaceChild("CowboyHat", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(34, 42).addBox(1.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(42, 33).addBox(-4.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(20, 51).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -32.0F, 0.0F));

            PartDefinition FlabRight_r1 = CowboyHat.addOrReplaceChild("FlabRight_r1", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

            PartDefinition FlabLeft_r1 = CowboyHat.addOrReplaceChild("FlabLeft_r1", CubeListBuilder.create().texOffs(12, 35).addBox(0.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

            PartDefinition Hole = partdefinition.addOrReplaceChild("Hole", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition Top = Hole.addOrReplaceChild("Top", CubeListBuilder.create().texOffs(4, 44).addBox(0.0F, -36.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 46).addBox(-3.0F, -37.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 46).addBox(2.0F, -37.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Bottem = Hole.addOrReplaceChild("Bottem", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -32.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 46).addBox(2.0F, -32.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 46).addBox(-4.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 46).addBox(4.0F, -32.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 42).addBox(2.0F, -32.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Left = Hole.addOrReplaceChild("Left", CubeListBuilder.create().texOffs(4, 40).addBox(3.0F, -36.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 40).addBox(3.0F, -34.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Front = Hole.addOrReplaceChild("Front", CubeListBuilder.create().texOffs(4, 42).addBox(-3.0F, -36.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(4, 42).addBox(0.0F, -34.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 40).addBox(3.0F, -36.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition RightSide = Hole.addOrReplaceChild("RightSide", CubeListBuilder.create(), PartPose.offset(-5.3428F, -31.4026F, 0.5F));

            PartDefinition cube_r1 = RightSide.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 43).addBox(-0.5572F, -2.4974F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(16, 41).addBox(-0.5572F, -1.4974F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(12, 41).addBox(-0.5572F, -0.4974F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

            PartDefinition Right = Hole.addOrReplaceChild("Right", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-4.0F, -37.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                    .texOffs(0, 46).mirror().addBox(-4.0F, -36.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                    .texOffs(0, 46).mirror().addBox(-4.0F, -34.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition LeftSide = Hole.addOrReplaceChild("LeftSide", CubeListBuilder.create(), PartPose.offset(5.543F, -32.4252F, 2.5F));

            PartDefinition cube_r2 = LeftSide.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

            PartDefinition cube_r3 = LeftSide.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1736F, -0.9848F, -6.0F, 0.0F, 0.0F, 0.1745F));

            PartDefinition Back = Hole.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(12, 43).addBox(0.0F, -34.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(12, 43).addBox(2.0F, -36.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(12, 43).addBox(-3.0F, -35.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 64, 64);
        }
    }