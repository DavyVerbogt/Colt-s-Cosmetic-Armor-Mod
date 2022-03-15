package com.colt.ccam.curio.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

import java.util.function.Function;

public class CatEarCurioModel extends HumanoidModel<LivingEntity> {

	public CatEarCurioModel(ModelPart root) {
        super(root);
    }

        public static LayerDefinition createCatEars (CubeDeformation deformation){
        MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.getChild("head");

        head.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

        PartDefinition EarL = head.addOrReplaceChild("EarL", CubeListBuilder.create().texOffs(10, 51).addBox(3.0F, -9.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 53).addBox(4.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 55).addBox(5.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 59).addBox(6.0F, -11.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 57).addBox(5.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 57).addBox(5.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 61).addBox(3.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

        PartDefinition EarR = head.addOrReplaceChild("EarR", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -9.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-3.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-4.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-5.0F, -11.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 57).addBox(-4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 57).addBox(-4.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 61).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
    }

