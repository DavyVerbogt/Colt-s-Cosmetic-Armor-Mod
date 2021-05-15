package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CowArmorModel extends BipedModel<LivingEntity>{
    
    
    public CowArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);
		

		ModelRenderer Pants = new ModelRenderer(this);
		Pants.setRotationPoint(4.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(Pants);
		

		ModelRenderer KneePad2 = new ModelRenderer(this);
		KneePad2.setRotationPoint(-0.0238F, -6.5442F, -2.2F);
		Pants.addChild(KneePad2);
		KneePad2.setTextureOffset(48, 36).addBox(-6.0F, 11.5F, 0.3F, 4.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer Knee_r1 = new ModelRenderer(this);
		Knee_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		KneePad2.addChild(Knee_r1);
		setRotationAngle(Knee_r1, -0.1309F, 0.0F, 0.0F);
		Knee_r1.setTextureOffset(56, 32).addBox(-5.5F, 10.5F, 1.3F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		ModelRenderer Skirt = new ModelRenderer(this);
		Skirt.setRotationPoint(-4.0F, -1.0F, 2.0F);
		Pants.addChild(Skirt);
		

		ModelRenderer Back_r1 = new ModelRenderer(this);
		Back_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Skirt.addChild(Back_r1);
		setRotationAngle(Back_r1, 0.1745F, 0.0F, 0.0F);
		Back_r1.setTextureOffset(50, 28).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, true);

		ModelRenderer Side_r1 = new ModelRenderer(this);
		Side_r1.setRotationPoint(-2.0F, 0.0F, -2.0F);
		Skirt.addChild(Side_r1);
		setRotationAngle(Side_r1, 0.0F, 0.0F, 0.1745F);
		Side_r1.setTextureOffset(44, 32).addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, true);

		ModelRenderer Frond_r1 = new ModelRenderer(this);
		Frond_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
		Skirt.addChild(Frond_r1);
		setRotationAngle(Frond_r1, -0.1745F, 0.0F, 0.0F);
        Frond_r1.setTextureOffset(58, 28).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, true);
        

		ModelRenderer Pants2 = new ModelRenderer(this);
		Pants2.setRotationPoint(-4.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(Pants2);
		

		ModelRenderer kneePad = new ModelRenderer(this);
		kneePad.setRotationPoint(0.0238F, -6.5442F, -2.2F);
		Pants2.addChild(kneePad);
		kneePad.setTextureOffset(48, 36).addBox(2.0F, 11.5F, 0.3F, 4.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer Knee_r2 = new ModelRenderer(this);
		Knee_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		kneePad.addChild(Knee_r2);
		setRotationAngle(Knee_r2, -0.1309F, 0.0F, 0.0F);
		Knee_r2.setTextureOffset(56, 32).addBox(2.5F, 10.5F, 1.3F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer Skirt2 = new ModelRenderer(this);
		Skirt2.setRotationPoint(4.0F, -1.0F, -2.0F);
		Pants2.addChild(Skirt2);
		

		ModelRenderer Front_r1 = new ModelRenderer(this);
		Front_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Skirt2.addChild(Front_r1);
		setRotationAngle(Front_r1, -0.1745F, 0.0F, 0.0F);
		Front_r1.setTextureOffset(58, 28).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		ModelRenderer Side_r2 = new ModelRenderer(this);
		Side_r2.setRotationPoint(2.0F, 0.0F, 2.0F);
		Skirt2.addChild(Side_r2);
		setRotationAngle(Side_r2, 0.0F, 0.0F, -0.1745F);
		Side_r2.setTextureOffset(44, 32).addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		ModelRenderer Back_r2 = new ModelRenderer(this);
		Back_r2.setRotationPoint(0.0F, 0.0F, 4.0F);
		Skirt2.addChild(Back_r2);
		setRotationAngle(Back_r2, 0.1745F, 0.0F, 0.0F);
		Back_r2.setTextureOffset(50, 28).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		ModelRenderer Armor = new ModelRenderer(this);
		Armor.setRotationPoint(-1.0623F, 3.0878F, -2.5F);
		bipedBody.addChild(Armor);
		

		ModelRenderer FrontArmor = new ModelRenderer(this);
		FrontArmor.setRotationPoint(4.1828F, -1.2569F, 2.7F);
		Armor.addChild(FrontArmor);
		FrontArmor.setTextureOffset(0, 42).addBox(0.4557F, 2.125F, -3.3F, 1.0F, 3.0F, 6.0F, -0.4F, false);
		FrontArmor.setTextureOffset(0, 42).addBox(-7.6443F, 5.125F, -3.2F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		FrontArmor.setTextureOffset(25, 54).addBox(-7.6828F, 5.1569F, -3.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer ShoulderStrap_r1 = new ModelRenderer(this);
		ShoulderStrap_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FrontArmor.addChild(ShoulderStrap_r1);
		setRotationAngle(ShoulderStrap_r1, 0.0F, 0.0F, 0.3491F);
		ShoulderStrap_r1.setTextureOffset(0, 42).addBox(-1.0F, -2.2F, -2.5F, 2.0F, 4.0F, 1.0F, 0.1F, false);

		ModelRenderer TopButten_r1 = new ModelRenderer(this);
		TopButten_r1.setRotationPoint(-4.1828F, 1.2569F, -2.7F);
		FrontArmor.addChild(TopButten_r1);
		setRotationAngle(TopButten_r1, 0.0F, 0.0F, 0.6981F);
		TopButten_r1.setTextureOffset(25, 54).addBox(-4.8F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer TopStrap_r1 = new ModelRenderer(this);
		TopStrap_r1.setRotationPoint(-5.1443F, 1.625F, -2.7F);
		FrontArmor.addChild(TopStrap_r1);
		setRotationAngle(TopStrap_r1, 0.0F, 0.0F, 0.6981F);
		TopStrap_r1.setTextureOffset(0, 42).addBox(-4.0F, -1.4F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer MiddelPlate_r1 = new ModelRenderer(this);
		MiddelPlate_r1.setRotationPoint(-1.1443F, 3.625F, -2.4F);
		FrontArmor.addChild(MiddelPlate_r1);
		setRotationAngle(MiddelPlate_r1, -0.1309F, 0.0F, 0.0F);
		MiddelPlate_r1.setTextureOffset(0, 42).addBox(-2.5F, -1.5F, -0.7F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer LowerPlate_r1 = new ModelRenderer(this);
		LowerPlate_r1.setRotationPoint(-1.6563F, 5.1789F, -2.5F);
		FrontArmor.addChild(LowerPlate_r1);
		setRotationAngle(LowerPlate_r1, -0.0873F, 0.0F, 0.4363F);
		LowerPlate_r1.setTextureOffset(0, 42).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.1F, false);

		ModelRenderer TopPlate_r1 = new ModelRenderer(this);
		TopPlate_r1.setRotationPoint(-1.7F, 1.8F, -2.5F);
		FrontArmor.addChild(TopPlate_r1);
		setRotationAngle(TopPlate_r1, -0.1309F, 0.0F, -0.4363F);
		TopPlate_r1.setTextureOffset(0, 42).addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.1F, false);

		ModelRenderer Belt = new ModelRenderer(this);
		Belt.setRotationPoint(3.5385F, 4.118F, 0.0F);
		Armor.addChild(Belt);
		Belt.setTextureOffset(0, 40).addBox(-6.4762F, 3.7942F, 0.5F, 8.0F, 1.0F, 4.0F, 0.1F, false);

		ModelRenderer Crotsh_r1 = new ModelRenderer(this);
		Crotsh_r1.setRotationPoint(-2.4762F, 4.7942F, 1.0F);
		Belt.addChild(Crotsh_r1);
		setRotationAngle(Crotsh_r1, 0.0F, 0.0F, 0.829F);
		Crotsh_r1.setTextureOffset(0, 37).addBox(-1.0F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, 0.1F, false);

		ModelRenderer BackLeather = new ModelRenderer(this);
		BackLeather.setRotationPoint(1.0623F, 4.9122F, 0.5F);
		Armor.addChild(BackLeather);
		BackLeather.setTextureOffset(37, 45).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 8.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-1.0F, 0.0F, 4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(2.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-4.0F, 1.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-1.0F, 2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-5.0F, 1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-5.0F, 0.0F, 4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		BackLeather.setTextureOffset(36, 55).addBox(-2.0F, 1.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		

		ModelRenderer ArmArmorR = new ModelRenderer(this);
		ArmArmorR.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(ArmArmorR);
		

		ModelRenderer LeatherR = new ModelRenderer(this);
		LeatherR.setRotationPoint(-2.5F, 1.0F, 2.5F);
		ArmArmorR.addChild(LeatherR);
		LeatherR.setTextureOffset(36, 55).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		LeatherR.setTextureOffset(36, 55).addBox(-2.5F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		LeatherR.setTextureOffset(44, 45).addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		LeatherR.setTextureOffset(36, 55).addBox(-2.5F, -2.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeatherR.setTextureOffset(36, 55).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeatherR.setTextureOffset(36, 55).addBox(-1.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeatherR.setTextureOffset(36, 55).addBox(0.5F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer ElbowPad = new ModelRenderer(this);
		ElbowPad.setRotationPoint(1.9762F, -7.5442F, -2.2F);
		ArmArmorR.addChild(ElbowPad);
		ElbowPad.setTextureOffset(0, 40).addBox(-6.0F, 11.5F, 0.1F, 4.0F, 1.0F, 4.0F, 0.2F, true);

		ModelRenderer Pad_r1 = new ModelRenderer(this);
		Pad_r1.setRotationPoint(0.0F, 0.0F, 4.4F);
		ElbowPad.addChild(Pad_r1);
		setRotationAngle(Pad_r1, 0.1309F, 0.0F, 0.0F);
		Pad_r1.setTextureOffset(6, 44).addBox(-5.5F, 10.5F, -2.3F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		ModelRenderer ArmArmorL = new ModelRenderer(this);
		ArmArmorL.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(ArmArmorL);
		

		ModelRenderer ElbowPad2 = new ModelRenderer(this);
		ElbowPad2.setRotationPoint(-1.9762F, -7.5442F, -2.2F);
		ArmArmorL.addChild(ElbowPad2);
		ElbowPad2.setTextureOffset(0, 40).addBox(2.0F, 11.5F, 0.1F, 4.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer Pad_r2 = new ModelRenderer(this);
		Pad_r2.setRotationPoint(0.0F, 0.0F, 4.4F);
		ElbowPad2.addChild(Pad_r2);
		setRotationAngle(Pad_r2, 0.1309F, 0.0F, 0.0F);
		Pad_r2.setTextureOffset(6, 44).addBox(2.5F, 10.5F, -2.3F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.5F, 1.0F, 2.5F);
		ArmArmorL.addChild(bone6);
		bone6.setTextureOffset(36, 55).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);
		bone6.setTextureOffset(36, 55).addBox(1.5F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		bone6.setTextureOffset(33, 45).addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
		bone6.setTextureOffset(36, 55).addBox(1.5F, -2.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		bone6.setTextureOffset(36, 55).addBox(1.5F, -2.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone6.setTextureOffset(36, 55).addBox(0.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone6.setTextureOffset(36, 55).addBox(-1.5F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		

		ModelRenderer Cow = new ModelRenderer(this);
		Cow.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(Cow);
		

		ModelRenderer CowHead = new ModelRenderer(this);
		CowHead.setRotationPoint(0.0F, -24.0F, 0.0F);
		Cow.addChild(CowHead);
		CowHead.setTextureOffset(0, 52).addBox(4.0F, -17.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CowHead.setTextureOffset(4, 52).addBox(-5.0F, -17.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CowHead.setTextureOffset(1, 49).addBox(-4.0F, -16.0F, -2.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);

		ModelRenderer Leather = new ModelRenderer(this);
		Leather.setRotationPoint(0.0F, -24.0F, 0.0F);
		Cow.addChild(Leather);
		Leather.setTextureOffset(36, 56).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(4.0F, -9.0F, 0.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(-5.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(-5.0F, -9.0F, 2.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(3.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(-1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(-4.0F, -1.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(1.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Leather.setTextureOffset(36, 55).addBox(0.0F, -1.0F, 4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

	}

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}