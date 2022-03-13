package com.colt.ccam.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class CowArmorModel extends HumanoidModel{


	public CowArmorModel(ModelPart root) {
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

		PartDefinition Pants = right_leg.addOrReplaceChild("Pants", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition KneePad2 = Pants.addOrReplaceChild("KneePad2", CubeListBuilder.create().texOffs(48, 36).addBox(-6.0F, 11.5F, 0.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-0.0238F, -6.5442F, -2.2F));
		PartDefinition Knee_r1 = KneePad2.addOrReplaceChild("Knee_r1", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-5.5F, 10.5F, 1.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Skirt = Pants.addOrReplaceChild("Skirt", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, 2.0F));
		PartDefinition Back_r1 = Skirt.addOrReplaceChild("Back_r1", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Side_r1 = Skirt.addOrReplaceChild("Side_r1", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Frond_r1 = Skirt.addOrReplaceChild("Frond_r1", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Pants2 = left_leg.addOrReplaceChild("Pants2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition kneePad = Pants2.addOrReplaceChild("kneePad", CubeListBuilder.create().texOffs(48, 36).addBox(2.0F, 11.5F, 0.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0238F, -6.5442F, -2.2F));
		PartDefinition Knee_r2 = kneePad.addOrReplaceChild("Knee_r2", CubeListBuilder.create().texOffs(56, 32).addBox(2.5F, 10.5F, 1.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Skirt2 = Pants2.addOrReplaceChild("Skirt2", CubeListBuilder.create(), PartPose.offset(4.0F, -1.0F, -2.0F));
		PartDefinition Front_r1 = Skirt2.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(58, 28).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Side_r2 = Skirt2.addOrReplaceChild("Side_r2", CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Back_r2 = Skirt2.addOrReplaceChild("Back_r2", CubeListBuilder.create().texOffs(50, 28).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Armor = body.addOrReplaceChild("Armor", CubeListBuilder.create(), PartPose.offset(-1.0623F, 3.0878F, -2.5F));
		PartDefinition FrontArmor = Armor.addOrReplaceChild("FrontArmor", CubeListBuilder.create().texOffs(0, 42).addBox(0.4557F, 2.125F, -3.3F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 42).addBox(-7.6443F, 5.125F, -3.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 54).addBox(-7.6828F, 5.1569F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.1828F, -1.2569F, 2.7F));
		PartDefinition ShoulderStrap_r1 = FrontArmor.addOrReplaceChild("ShoulderStrap_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -2.2F, -2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition TopButten_r1 = FrontArmor.addOrReplaceChild("TopButten_r1", CubeListBuilder.create().texOffs(25, 54).addBox(-4.8F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1828F, 1.2569F, -2.7F, 0.0F, 0.0F, 0.6981F));
		PartDefinition TopStrap_r1 = FrontArmor.addOrReplaceChild("TopStrap_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, -1.4F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1443F, 1.625F, -2.7F, 0.0F, 0.0F, 0.6981F));
		PartDefinition MiddelPlate_r1 = FrontArmor.addOrReplaceChild("MiddelPlate_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-2.5F, -1.5F, -0.7F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1443F, 3.625F, -2.4F, -0.1309F, 0.0F, 0.0F));
		PartDefinition LowerPlate_r1 = FrontArmor.addOrReplaceChild("LowerPlate_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.6563F, 5.1789F, -2.5F, -0.0873F, 0.0F, 0.4363F));
		PartDefinition TopPlate_r1 = FrontArmor.addOrReplaceChild("TopPlate_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.7F, 1.8F, -2.5F, -0.1309F, 0.0F, -0.4363F));
		PartDefinition Belt = Armor.addOrReplaceChild("Belt", CubeListBuilder.create().texOffs(0, 40).addBox(-6.4762F, 3.7942F, 0.5F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(3.5385F, 4.118F, 0.0F));
		PartDefinition Crotsh_r1 = Belt.addOrReplaceChild("Crotsh_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.4762F, 4.7942F, 1.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition BackLeather = Armor.addOrReplaceChild("BackLeather", CubeListBuilder.create().texOffs(37, 45).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-1.0F, 0.0F, 4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(2.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-4.0F, 1.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-1.0F, 2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-5.0F, 1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-5.0F, 0.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-2.0F, 1.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0623F, 4.9122F, 0.5F));

		PartDefinition ArmArmorR = right_arm.addOrReplaceChild("ArmArmorR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeatherR = ArmArmorR.addOrReplaceChild("LeatherR", CubeListBuilder.create().texOffs(36, 55).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-2.5F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 45).addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-2.5F, -2.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-1.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(0.5F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 1.0F, 2.5F));
		PartDefinition ElbowPad = ArmArmorR.addOrReplaceChild("ElbowPad", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-6.0F, 11.5F, 0.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(1.9762F, -7.5442F, -2.2F));
		PartDefinition Pad_r1 = ElbowPad.addOrReplaceChild("Pad_r1", CubeListBuilder.create().texOffs(6, 44).mirror().addBox(-5.5F, 10.5F, -2.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 4.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition ArmArmorL = left_arm.addOrReplaceChild("ArmArmorL", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ElbowPad2 = ArmArmorL.addOrReplaceChild("ElbowPad2", CubeListBuilder.create().texOffs(0, 40).addBox(2.0F, 11.5F, 0.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.9762F, -7.5442F, -2.2F));
		PartDefinition Pad_r2 = ElbowPad2.addOrReplaceChild("Pad_r2", CubeListBuilder.create().texOffs(6, 44).addBox(2.5F, 10.5F, -2.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.4F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone6 = ArmArmorL.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(1.5F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 45).mirror().addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(1.5F, -2.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(1.5F, -2.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(0.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(-1.5F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.5F, 1.0F, 2.5F));

		PartDefinition Cow = head.addOrReplaceChild("Cow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition CowHead = Cow.addOrReplaceChild("CowHead", CubeListBuilder.create().texOffs(0, 52).addBox(4.0F, -17.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 52).addBox(-5.0F, -17.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 49).addBox(-4.0F, -16.0F, -2.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition Leather = Cow.addOrReplaceChild("Leather", CubeListBuilder.create().texOffs(36, 56).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(4.0F, -9.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-5.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-5.0F, -9.0F, 2.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(3.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(-4.0F, -1.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(1.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 55).addBox(0.0F, -1.0F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);

	}
}