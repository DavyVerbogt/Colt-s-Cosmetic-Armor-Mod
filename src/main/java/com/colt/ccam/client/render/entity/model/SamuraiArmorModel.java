package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SamuraiArmorModel  extends BipedModel<LivingEntity>{
    
    
	public SamuraiArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 128);


		ModelRenderer RightLegArmor = new ModelRenderer(this);
		RightLegArmor.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(RightLegArmor);
		RightLegArmor.setTextureOffset(38, 122).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, true);

		ModelRenderer Front3 = new ModelRenderer(this);
		Front3.setRotationPoint(-0.5F, 2.5F, -2.2F);
		RightLegArmor.addChild(Front3);
		

		ModelRenderer FrontFlabL03_r1 = new ModelRenderer(this);
		FrontFlabL03_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Front3.addChild(FrontFlabL03_r1);
		setRotationAngle(FrontFlabL03_r1, -0.2182F, 0.0F, 0.0F);
		FrontFlabL03_r1.setTextureOffset(54, 119).addBox(-1.5F, 2.5F, 0.4F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		FrontFlabL03_r1.setTextureOffset(54, 123).addBox(-1.5F, -0.5F, -0.4F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		FrontFlabL03_r1.setTextureOffset(54, 123).addBox(-1.5F, -2.5F, -1.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer Flaps = new ModelRenderer(this);
		Flaps.setRotationPoint(5.5F, 2.5F, -0.1F);
		RightLegArmor.addChild(Flaps);
		

		ModelRenderer SideFlabR03_r1 = new ModelRenderer(this);
		SideFlabR03_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps.addChild(SideFlabR03_r1);
		setRotationAngle(SideFlabR03_r1, 0.0F, 0.0F, -0.2182F);
		SideFlabR03_r1.setTextureOffset(36, 94).addBox(-1.2F, 0.5F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		ModelRenderer SideFlabR02_r1 = new ModelRenderer(this);
		SideFlabR02_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps.addChild(SideFlabR02_r1);
		setRotationAngle(SideFlabR02_r1, 0.0F, 0.0F, -0.3054F);
		SideFlabR02_r1.setTextureOffset(36, 94).addBox(-0.6F, -1.5F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		ModelRenderer SideFlabL01_r1 = new ModelRenderer(this);
		SideFlabL01_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps.addChild(SideFlabL01_r1);
		setRotationAngle(SideFlabL01_r1, 0.0F, 0.0F, -0.4363F);
		SideFlabL01_r1.setTextureOffset(24, 95).addBox(-0.1F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		ModelRenderer Back2 = new ModelRenderer(this);
		Back2.setRotationPoint(3.5F, 2.5F, 2.2F);
		RightLegArmor.addChild(Back2);
		

		ModelRenderer BackFlabL03_r1 = new ModelRenderer(this);
		BackFlabL03_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back2.addChild(BackFlabL03_r1);
		setRotationAngle(BackFlabL03_r1, 0.2182F, 0.0F, 0.0F);
		BackFlabL03_r1.setTextureOffset(54, 119).addBox(-5.5F, 2.5F, -1.4F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		BackFlabL03_r1.setTextureOffset(54, 123).addBox(-5.5F, -0.5F, -0.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		BackFlabL03_r1.setTextureOffset(54, 123).addBox(-5.5F, -2.5F, 0.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		

		ModelRenderer LeftLegArmor = new ModelRenderer(this);
		LeftLegArmor.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(LeftLegArmor);
		LeftLegArmor.setTextureOffset(38, 122).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, false);

		ModelRenderer Front2 = new ModelRenderer(this);
		Front2.setRotationPoint(3.5F, 2.5F, -2.2F);
		LeftLegArmor.addChild(Front2);
		

		ModelRenderer FrontFlabR03_r1 = new ModelRenderer(this);
		FrontFlabR03_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Front2.addChild(FrontFlabR03_r1);
		setRotationAngle(FrontFlabR03_r1, -0.2182F, 0.0F, 0.0F);
		FrontFlabR03_r1.setTextureOffset(54, 119).addBox(-5.5F, 2.5F, 0.4F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		FrontFlabR03_r1.setTextureOffset(54, 123).addBox(-5.5F, -0.5F, -0.4F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		FrontFlabR03_r1.setTextureOffset(54, 123).addBox(-5.5F, -2.5F, -1.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		ModelRenderer Flaps2 = new ModelRenderer(this);
		Flaps2.setRotationPoint(-5.5F, 2.5F, -0.1F);
		LeftLegArmor.addChild(Flaps2);
		

		ModelRenderer SideFlabR03_r2 = new ModelRenderer(this);
		SideFlabR03_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps2.addChild(SideFlabR03_r2);
		setRotationAngle(SideFlabR03_r2, 0.0F, 0.0F, 0.2182F);
		SideFlabR03_r2.setTextureOffset(36, 94).addBox(0.2F, 0.5F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, true);

		ModelRenderer SideFlabR02_r2 = new ModelRenderer(this);
		SideFlabR02_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps2.addChild(SideFlabR02_r2);
		setRotationAngle(SideFlabR02_r2, 0.0F, 0.0F, 0.3054F);
		SideFlabR02_r2.setTextureOffset(36, 94).addBox(-0.4F, -1.5F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, true);

		ModelRenderer SideFlabR01_r1 = new ModelRenderer(this);
		SideFlabR01_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Flaps2.addChild(SideFlabR01_r1);
		setRotationAngle(SideFlabR01_r1, 0.0F, 0.0F, 0.4363F);
		SideFlabR01_r1.setTextureOffset(24, 95).addBox(-0.9F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, true);

		ModelRenderer Back = new ModelRenderer(this);
		Back.setRotationPoint(3.5F, 2.5F, 2.2F);
		LeftLegArmor.addChild(Back);
		

		ModelRenderer BackFlabR03_r1 = new ModelRenderer(this);
		BackFlabR03_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(BackFlabR03_r1);
		setRotationAngle(BackFlabR03_r1, 0.2182F, 0.0F, 0.0F);
		BackFlabR03_r1.setTextureOffset(54, 119).addBox(-5.5F, 2.5F, -1.4F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		BackFlabR03_r1.setTextureOffset(54, 123).addBox(-5.5F, -0.5F, -0.6F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		BackFlabR03_r1.setTextureOffset(54, 123).addBox(-5.5F, -2.5F, 0.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		

		ModelRenderer Front = new ModelRenderer(this);
		Front.setRotationPoint(-2.5F, 3.0F, -2.3F);
		bipedBody.addChild(Front);
		Front.setTextureOffset(37, 104).addBox(-1.5F, 0.0F, -0.2F, 8.0F, 9.0F, 5.0F, 0.2F, false);
		Front.setTextureOffset(48, 90).addBox(1.0F, -2.3F, -0.2F, 3.0F, 2.0F, 5.0F, 0.2F, false);

		ModelRenderer SideL_r1 = new ModelRenderer(this);
		SideL_r1.setRotationPoint(5.0F, -1.0F, 0.3F);
		Front.addChild(SideL_r1);
		setRotationAngle(SideL_r1, 0.0F, 0.0F, 0.4363F);
		SideL_r1.setTextureOffset(48, 97).addBox(-1.6F, -0.7F, -0.5F, 3.0F, 2.0F, 5.0F, 0.2F, false);

		ModelRenderer SideR_r1 = new ModelRenderer(this);
		SideR_r1.setRotationPoint(0.0F, -1.0F, 0.3F);
		Front.addChild(SideR_r1);
		setRotationAngle(SideR_r1, 0.0F, 0.0F, -0.4363F);
		SideR_r1.setTextureOffset(48, 97).addBox(-1.4F, -0.7F, -0.5F, 3.0F, 2.0F, 5.0F, 0.2F, true);


		ModelRenderer ArmArmorR = new ModelRenderer(this);
		ArmArmorR.setRotationPoint(-3.5F, 0.8853F, 0.0F);
		bipedRightArm.addChild(ArmArmorR);
		ArmArmorR.setTextureOffset(0, 90).addBox(0.4561F, -2.7F, -2.0F, 1.0F, 2.0F, 4.0F, 0.2F, false);
		ArmArmorR.setTextureOffset(18, 104).addBox(0.378F, -1.8853F, -2.0F, 4.0F, 9.0F, 4.0F, 0.2F, true);

		ModelRenderer SideFlabR02_r3 = new ModelRenderer(this);
		SideFlabR02_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		ArmArmorR.addChild(SideFlabR02_r3);
		setRotationAngle(SideFlabR02_r3, 0.0F, 0.0F, 0.4363F);
		SideFlabR02_r3.setTextureOffset(0, 96).addBox(0.1F, -0.9F, -2.0F, 1.0F, 4.0F, 4.0F, 0.2F, true);
		SideFlabR02_r3.setTextureOffset(6, 92).addBox(-0.9F, -2.9F, -2.0F, 1.0F, 4.0F, 4.0F, 0.2F, true);

		ModelRenderer SholderPiceR = new ModelRenderer(this);
		SholderPiceR.setRotationPoint(0.8159F, -3.2738F, 1.5F);
		ArmArmorR.addChild(SholderPiceR);
		SholderPiceR.setTextureOffset(0, 85).addBox(1.2841F, 0.0738F, -3.5F, 2.0F, 1.0F, 4.0F, 0.2F, true);

		ModelRenderer SideB_r1 = new ModelRenderer(this);
		SideB_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SholderPiceR.addChild(SideB_r1);
		setRotationAngle(SideB_r1, 0.0F, -0.3054F, 0.4363F);
		SideB_r1.setTextureOffset(8, 84).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, 0.2F, true);

		ModelRenderer SideF_r1 = new ModelRenderer(this);
		SideF_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
		SholderPiceR.addChild(SideF_r1);
		setRotationAngle(SideF_r1, 0.0F, 0.3054F, 0.4363F);
		SideF_r1.setTextureOffset(8, 84).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 0.2F, true);

		ModelRenderer Middel_r1 = new ModelRenderer(this);
		Middel_r1.setRotationPoint(0.2841F, 0.5738F, -1.5F);
		SholderPiceR.addChild(Middel_r1);
		setRotationAngle(Middel_r1, 0.0F, 0.0F, 0.4363F);
		Middel_r1.setTextureOffset(8, 86).addBox(-2.0F, -0.9F, -1.0F, 3.0F, 1.0F, 2.0F, 0.2F, true);
		

		ModelRenderer ArmArmorL = new ModelRenderer(this);
		ArmArmorL.setRotationPoint(3.5F, 0.8853F, 0.0F);
		bipedLeftArm.addChild(ArmArmorL);
		ArmArmorL.setTextureOffset(0, 90).addBox(-1.4F, -2.6F, -2.0F, 1.0F, 2.0F, 4.0F, 0.2F, false);
		ArmArmorL.setTextureOffset(18, 104).addBox(-4.378F, -1.8853F, -2.0F, 4.0F, 9.0F, 4.0F, 0.2F, false);

		ModelRenderer SideFlabL02_r1 = new ModelRenderer(this);
		SideFlabL02_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ArmArmorL.addChild(SideFlabL02_r1);
		setRotationAngle(SideFlabL02_r1, 0.0F, 0.0F, -0.4363F);
		SideFlabL02_r1.setTextureOffset(0, 96).addBox(-1.1F, -0.9F, -2.0F, 1.0F, 4.0F, 4.0F, 0.2F, false);
		SideFlabL02_r1.setTextureOffset(6, 92).addBox(-0.1F, -2.9F, -2.0F, 1.0F, 4.0F, 4.0F, 0.2F, false);

		ModelRenderer SholderPiceL = new ModelRenderer(this);
		SholderPiceL.setRotationPoint(-0.8159F, -3.2738F, 1.5F);
		ArmArmorL.addChild(SholderPiceL);
		SholderPiceL.setTextureOffset(0, 85).addBox(-3.2841F, 0.0738F, -3.5F, 2.0F, 1.0F, 4.0F, 0.2F, false);

		ModelRenderer SideB_r2 = new ModelRenderer(this);
		SideB_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SholderPiceL.addChild(SideB_r2);
		setRotationAngle(SideB_r2, 0.0F, 0.3054F, -0.4363F);
		SideB_r2.setTextureOffset(8, 84).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, 0.2F, false);

		ModelRenderer SideF_r2 = new ModelRenderer(this);
		SideF_r2.setRotationPoint(0.0F, 0.0F, -3.0F);
		SholderPiceL.addChild(SideF_r2);
		setRotationAngle(SideF_r2, 0.0F, -0.3054F, -0.4363F);
		SideF_r2.setTextureOffset(8, 84).addBox(-1.5F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, 0.2F, false);

		ModelRenderer Middel_r2 = new ModelRenderer(this);
		Middel_r2.setRotationPoint(-0.2841F, 0.5738F, -1.5F);
		SholderPiceL.addChild(Middel_r2);
		setRotationAngle(Middel_r2, 0.0F, 0.0F, -0.4363F);
		Middel_r2.setTextureOffset(8, 86).addBox(-1.0F, -0.9F, -1.0F, 3.0F, 1.0F, 2.0F, 0.2F, false);

		

		ModelRenderer Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(0.0F, -1.0F, 0.0F);
		bipedHead.addChild(Helmet);
		Helmet.setTextureOffset(0, 117).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.2F, false);

		ModelRenderer BackFlab_r1 = new ModelRenderer(this);
		BackFlab_r1.setRotationPoint(0.2F, -4.3F, 3.5F);
		Helmet.addChild(BackFlab_r1);
		setRotationAngle(BackFlab_r1, 0.3927F, 0.0F, 0.0F);
		BackFlab_r1.setTextureOffset(24, 119).addBox(-4.2F, -1.5F, 0.1F, 8.0F, 5.0F, 1.0F, 0.2F, false);

		ModelRenderer FrontFlabR_r1 = new ModelRenderer(this);
		FrontFlabR_r1.setRotationPoint(-4.5F, -3.5F, 0.0F);
		Helmet.addChild(FrontFlabR_r1);
		setRotationAngle(FrontFlabR_r1, 0.0F, 0.0F, 0.48F);
		FrontFlabR_r1.setTextureOffset(0, 121).addBox(-2.1F, -1.6F, -4.5F, 3.0F, 3.0F, 1.0F, 0.2F, true);
		FrontFlabR_r1.setTextureOffset(0, 104).addBox(-0.8F, -2.7F, -4.0F, 1.0F, 5.0F, 8.0F, 0.2F, true);

		ModelRenderer FrontFlabL_r1 = new ModelRenderer(this);
		FrontFlabL_r1.setRotationPoint(4.5F, -3.5F, 0.0F);
		Helmet.addChild(FrontFlabL_r1);
		setRotationAngle(FrontFlabL_r1, 0.0F, 0.0F, -0.48F);
		FrontFlabL_r1.setTextureOffset(0, 121).addBox(-0.9F, -1.7F, -4.5F, 3.0F, 3.0F, 1.0F, 0.2F, false);
		FrontFlabL_r1.setTextureOffset(0, 104).addBox(-0.7F, -2.7F, -4.0F, 1.0F, 5.0F, 8.0F, 0.2F, false);

		ModelRenderer HornR = new ModelRenderer(this);
		HornR.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helmet.addChild(HornR);
		HornR.setTextureOffset(50, 118).addBox(1.0F, -9.0F, -4.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HornR.setTextureOffset(43, 118).addBox(2.0F, -10.0F, -4.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HornR.setTextureOffset(50, 122).addBox(3.0F, -12.0F, -4.6F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		HornR.setTextureOffset(46, 120).addBox(2.0F, -13.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer HornR2 = new ModelRenderer(this);
		HornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helmet.addChild(HornR2);
		HornR2.setTextureOffset(50, 118).addBox(-2.0F, -9.0F, -4.6F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		HornR2.setTextureOffset(43, 118).addBox(-3.0F, -10.0F, -4.6F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		HornR2.setTextureOffset(50, 122).addBox(-4.0F, -12.0F, -4.6F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		HornR2.setTextureOffset(46, 120).addBox(-3.0F, -13.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);
    

    }
            public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}