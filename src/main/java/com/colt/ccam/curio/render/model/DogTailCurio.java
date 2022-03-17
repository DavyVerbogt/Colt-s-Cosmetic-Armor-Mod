package com.colt.ccam.curio.render.model;
import com.colt.ccam.client.render.model.TopHatModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class DogTailCurio  extends HumanoidModel{
	public ModelPart tail;

	public DogTailCurio(ModelPart root) {
		super(root);
		this.tail = root.getChild("body").getChild("tail");
	}
	public static LayerDefinition createCurioModel(CubeDeformation deformation) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(deformation, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.getChild("body");
		body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerTail_r1 = body.addOrReplaceChild("LowerTail_r1", CubeListBuilder.create().texOffs(14, 61).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.0F))
				.texOffs(20, 62).addBox(-0.5F, -0.5F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0F, 15.5F, 4.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition MiddelTail_r1 = body.addOrReplaceChild("MiddelTail_r1", CubeListBuilder.create().texOffs(8, 61).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(1.5F)), PartPose.offsetAndRotation(0.0F, 15.5F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition TopTail2_r1 = body.addOrReplaceChild("TopTail2_r1", CubeListBuilder.create().texOffs(4, 60).addBox(-0.5F, 4.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(1.0F))
				.texOffs(0, 60).addBox(-0.5F, 1.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 6.5F, 2.5F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public DogTailCurio withAnimations(LivingEntity entity){
		float partialTick = Minecraft.getInstance().getFrameTime();
		float limbSwingAmount = entity.animationSpeedOld + (entity.animationSpeed - entity.animationSpeedOld) * partialTick;
		float limbSwing = entity.animationPosition + partialTick;
		tail.xRot = 0F + limbSwingAmount * (float) Math.toRadians(80) + Mth.cos(limbSwing * 0.3F) * 0.2F * limbSwingAmount;
		return  this;
	}
}