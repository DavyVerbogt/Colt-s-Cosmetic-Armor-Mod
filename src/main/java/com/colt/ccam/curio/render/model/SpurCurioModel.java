package com.colt.ccam.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class SpurCurioModel extends HumanoidModel {

    public SpurCurioModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createCurioModel(CubeDeformation deformation) {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition right_leg = partdefinition.getChild("right_leg");
        PartDefinition left_leg = partdefinition.getChild("left_leg");

        right_leg.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

        PartDefinition Star2 = right_leg.addOrReplaceChild("Star2", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.4F, 0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.064F, 8.8F, 5.6769F, -0.4363F, 0.0F, 0.0F));

        PartDefinition Star3_r1 = Star2.addOrReplaceChild("Star3_r1", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.9F, -0.7F, -0.7854F, 0.0F, 0.0F));

        PartDefinition LSpur = right_leg.addOrReplaceChild("LSpur", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-1.0085F, -4.5F, -2.3546F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 10.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition BackBit4 = LSpur.addOrReplaceChild("BackBit4", CubeListBuilder.create().texOffs(0, 61).addBox(-1.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = BackBit4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition cube_r2 = BackBit4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r3 = BackBit4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r4 = BackBit4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition cube_r5 = BackBit4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -3.1416F, -0.6981F, 3.1416F));

        PartDefinition cube_r6 = BackBit4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r7 = BackBit4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -3.1416F, 0.6981F, 3.1416F));

        PartDefinition cube_r8 = BackBit4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -3.1416F, 1.3963F, 3.1416F));

        PartDefinition cube_r9 = BackBit4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -3.1416F, -1.3963F, 3.1416F));

        PartDefinition octagon_r1 = BackBit4.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-0.164F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.136F, -1.5F, 3.5769F, -0.6981F, 0.1745F, 0.0F));

        PartDefinition octagon_r2 = BackBit4.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 61).addBox(-0.164F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.136F, -1.5F, 3.5769F, 0.6981F, 0.1745F, 0.0F));

        PartDefinition octagon_r3 = BackBit4.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(0, 61).addBox(-0.4F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.036F, -0.3F, 2.2769F, -0.6545F, 0.0F, 0.0F));

        PartDefinition octagon_r4 = BackBit4.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6915F, 0.2F, 1.4454F, 0.0F, 1.1781F, 0.0F));

        PartDefinition RSpur = right_leg.addOrReplaceChild("RSpur", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 10.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition BackBit3 = RSpur.addOrReplaceChild("BackBit3", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r10 = BackBit3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r11 = BackBit3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition cube_r12 = BackBit3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r13 = BackBit3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.7925F, 0.0F));

        PartDefinition cube_r14 = BackBit3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

        PartDefinition cube_r15 = BackBit3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r16 = BackBit3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r17 = BackBit3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition octagon_r5 = BackBit3.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.536F, -2.2F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.036F, -0.3F, 2.2769F, 0.0F, -0.1745F, 0.0F));

        PartDefinition octagon_r6 = BackBit3.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.036F, -0.3F, 2.2769F, -0.6545F, 0.0F, 0.0F));

        PartDefinition octagon_r7 = BackBit3.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6915F, 0.2F, 1.4454F, 0.0F, -1.1781F, 0.0F));

        left_leg.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition Star = left_leg.addOrReplaceChild("Star", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.4F, 0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.064F, 8.8F, 5.6769F, -0.4363F, 0.0F, 0.0F));

        PartDefinition Star2_r1 = Star.addOrReplaceChild("Star2_r1", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.9F, -0.7F, -0.7854F, 0.0F, 0.0F));

        PartDefinition LSpur1 = left_leg.addOrReplaceChild("LSpur1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 10.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition BackBit2 = LSpur1.addOrReplaceChild("BackBit2", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r18 = BackBit2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

        PartDefinition cube_r19 = BackBit2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r20 = BackBit2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.7925F, 0.0F));

        PartDefinition cube_r21 = BackBit2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

        PartDefinition cube_r22 = BackBit2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r23 = BackBit2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r24 = BackBit2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

        PartDefinition cube_r25 = BackBit2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition octagon_r8 = BackBit2.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.536F, -2.2F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.036F, -0.3F, 2.2769F, 0.0F, -0.1745F, 0.0F));

        PartDefinition octagon_r9 = BackBit2.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.036F, -0.3F, 2.2769F, -0.6545F, 0.0F, 0.0F));

        PartDefinition octagon_r10 = BackBit2.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6915F, 0.2F, 1.4454F, 0.0F, -1.1781F, 0.0F));

        PartDefinition RSpur2 = left_leg.addOrReplaceChild("RSpur2", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-1.0085F, -4.5F, -2.3546F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 10.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition BackBit = RSpur2.addOrReplaceChild("BackBit", CubeListBuilder.create().texOffs(0, 61).addBox(-1.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r26 = BackBit.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 1.4399F, 3.1416F));

        PartDefinition cube_r27 = BackBit.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.7418F, 3.1416F));

        PartDefinition cube_r28 = BackBit.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F))
                .texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0436F, 3.1416F));

        PartDefinition cube_r29 = BackBit.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.6545F, 3.1416F));

        PartDefinition cube_r30 = BackBit.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition cube_r31 = BackBit.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0036F, 0.0F));

        PartDefinition cube_r32 = BackBit.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0908F, 0.0F));

        PartDefinition cube_r33 = BackBit.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

        PartDefinition cube_r34 = BackBit.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.3526F, 3.1416F));

        PartDefinition octagon_r11 = BackBit.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(0, 61).addBox(-0.164F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.136F, -1.5F, 3.5769F, -0.6981F, 0.1745F, 0.0F));

        PartDefinition octagon_r12 = BackBit.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(0, 61).addBox(-0.164F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.136F, -1.5F, 3.5769F, 0.6981F, 0.1745F, 0.0F));

        PartDefinition octagon_r13 = BackBit.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(0, 61).addBox(-0.4F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.036F, -0.3F, 2.2769F, -0.6545F, 0.0F, 0.0F));

        PartDefinition octagon_r14 = BackBit.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6915F, 0.2F, 1.4454F, 0.0F, 1.1781F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}