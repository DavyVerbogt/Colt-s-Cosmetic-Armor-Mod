package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class WolfArmorModel extends BipedModel<LivingEntity> {

    public WolfArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 128);

		ModelRenderer FluffArmourR = new ModelRenderer(this);
		FluffArmourR.setRotationPoint(-4.9688F, 9.9688F, 0.1563F);
		bipedRightLeg.addChild(FluffArmourR);
		FluffArmourR.setTextureOffset(37, 34).addBox(2.9688F, -2.4688F, -1.9562F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		FluffArmourR.setTextureOffset(24, 41).addBox(2.9688F, -1.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(58, 46).addBox(2.9688F, -0.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 49).addBox(6.9688F, -0.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(48, 59).addBox(6.9688F, -0.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 57).addBox(6.9688F, -1.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(32, 41).addBox(6.9688F, -1.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(38, 39).addBox(2.9688F, -1.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 52).addBox(3.9688F, -0.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 52).addBox(4.9688F, -4.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(24, 41).addBox(2.9688F, -3.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(58, 46).addBox(3.9688F, -4.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 49).addBox(6.9688F, -4.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(32, 41).addBox(6.9688F, -3.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(48, 59).addBox(6.9688F, -4.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(42, 57).addBox(6.9688F, -4.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		FluffArmourR.setTextureOffset(38, 39).addBox(2.9688F, -3.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer RPents = new ModelRenderer(this);
		RPents.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(RPents);
		RPents.setTextureOffset(16, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.5F, false);

		ModelRenderer JacketLeftLeg = new ModelRenderer(this);
		JacketLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(JacketLeftLeg);
		

		ModelRenderer FluffArmourL = new ModelRenderer(this);
		FluffArmourL.setRotationPoint(-0.9688F, 8.9688F, 0.1563F);
		bipedLeftLeg.addChild(FluffArmourL);
		setRotationAngle(FluffArmourL, 0.0F, 3.1416F, 0.0F);
		FluffArmourL.setTextureOffset(37, 34).addBox(-3.0313F, -2.4688F, -1.9562F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		FluffArmourL.setTextureOffset(24, 41).addBox(-3.0313F, -1.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(58, 46).addBox(-3.0313F, -0.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 49).addBox(0.9688F, -0.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(48, 59).addBox(0.9688F, -0.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 57).addBox(0.9688F, -1.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(32, 41).addBox(0.9688F, -1.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(38, 39).addBox(-3.0313F, -1.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 52).addBox(-3.0313F, -0.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 52).addBox(-1.0313F, -4.9688F, 1.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(24, 41).addBox(-3.0313F, -3.9688F, -3.1563F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(58, 46).addBox(-2.0313F, -4.9688F, -3.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 49).addBox(0.9688F, -4.9688F, -2.1563F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(32, 41).addBox(0.9688F, -3.9688F, -2.1563F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(48, 59).addBox(0.9688F, -4.9688F, 0.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(42, 57).addBox(0.9688F, -4.9688F, 1.8438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		FluffArmourL.setTextureOffset(38, 39).addBox(-3.0313F, -3.9688F, 1.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer LPents = new ModelRenderer(this);
		LPents.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(LPents);
		LPents.setTextureOffset(0, 86).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.5F, false);

		ModelRenderer Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(Chest);
		Chest.setTextureOffset(0, 64).addBox(-4.0F, 2.5F, -2.0F, 8.0F, 5.0F, 4.0F, 0.5F, false);
		Chest.setTextureOffset(0, 78).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 2.0F, 6.0F, 0.0F, false);

		ModelRenderer knife = new ModelRenderer(this);
		knife.setRotationPoint(0.0F, 11.5F, 0.0F);
		Chest.addChild(knife);
		knife.setTextureOffset(20, 65).addBox(-4.0F, -1.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		knife.setTextureOffset(26, 64).addBox(-3.5F, 0.0F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		knife.setTextureOffset(20, 73).addBox(-3.5F, -0.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		knife.setTextureOffset(20, 65).addBox(-3.5F, -2.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer FrontMiddel_r1 = new ModelRenderer(this);
		FrontMiddel_r1.setRotationPoint(-3.0F, 2.0F, -4.0F);
		knife.addChild(FrontMiddel_r1);
		setRotationAngle(FrontMiddel_r1, 0.0F, 0.0F, 0.7854F);
		FrontMiddel_r1.setTextureOffset(26, 64).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer SholderPieceR = new ModelRenderer(this);
		SholderPieceR.setRotationPoint(1.2F, -1.0F, -0.0F);
		bipedRightArm.addChild(SholderPieceR);
		SholderPieceR.setTextureOffset(42, 42).addBox(-5.0F, -2.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(24, 41).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(58, 46).addBox(-5.0F, 2.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(42, 49).addBox(-3.0F, 2.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(32, 41).addBox(-5.0F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(48, 59).addBox(-5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(42, 57).addBox(-5.0F, -1.0F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(38, 40).addBox(-4.0F, -1.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceR.setTextureOffset(42, 52).addBox(-1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer JacketLeftArm = new ModelRenderer(this);
		JacketLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(JacketLeftArm);
		

        ModelRenderer SholderPieceL = new ModelRenderer(this);
		SholderPieceL.setRotationPoint(-1.2F, -1.0F, -0.0F);
		JacketLeftArm.addChild(SholderPieceL);
		SholderPieceL.setTextureOffset(58, 46).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(24, 41).addBox(0.0F, 1.0F, -3.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(37, 34).addBox(0.0F, 2.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		SholderPieceL.setTextureOffset(44, 41).addBox(0.0F, 4.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(37, 34).addBox(0.0F, 7.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		SholderPieceL.setTextureOffset(24, 41).addBox(0.0F, 8.0F, -3.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(58, 46).addBox(0.0F, 10.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(32, 41).addBox(4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(48, 59).addBox(4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 49).addBox(4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 57).addBox(4.0F, 0.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 40).addBox(4.0F, 4.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 40).addBox(4.0F, 4.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 49).addBox(4.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(48, 59).addBox(4.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(32, 41).addBox(4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 52).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(38, 39).addBox(0.0F, 1.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(37, 41).addBox(0.0F, 4.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 52).addBox(0.0F, 10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(38, 39).addBox(0.0F, 8.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		SholderPieceL.setTextureOffset(42, 57).addBox(4.0F, 8.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer Bones = new ModelRenderer(this);
		Bones.setRotationPoint(8.0F, 0.0F, 0.0F);
		JacketLeftArm.addChild(Bones);
		Bones.setTextureOffset(60, 38).addBox(-5.0F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(33, 37).addBox(-4.0F, 4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Bones.setTextureOffset(33, 35).addBox(-4.5F, 2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(33, 35).addBox(-4.5F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(33, 39).addBox(-4.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer WolfHead = new ModelRenderer(this);
		WolfHead.setRotationPoint(0.0F, -0.0F, 0.0F);
		bipedHead.addChild(WolfHead);
		WolfHead.setTextureOffset(0, 54).addBox(-3.0F, -12.0F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		WolfHead.setTextureOffset(10, 51).addBox(1.0F, -14.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		WolfHead.setTextureOffset(10, 51).addBox(-3.0F, -14.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		WolfHead.setTextureOffset(20, 59).addBox(-1.5F, -9.0F, -5.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		ModelRenderer TheethR_r1 = new ModelRenderer(this);
		TheethR_r1.setRotationPoint(-1.0F, -7.0F, -4.5F);
		WolfHead.addChild(TheethR_r1);
		setRotationAngle(TheethR_r1, 0.0F, 0.0F, 0.8727F);
		TheethR_r1.setTextureOffset(35, 61).addBox(-0.3F, -0.8F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		ModelRenderer TheethL_r1 = new ModelRenderer(this);
		TheethL_r1.setRotationPoint(1.0F, -7.0F, -4.5F);
		WolfHead.addChild(TheethL_r1);
		setRotationAngle(TheethL_r1, 0.0F, 0.0F, 0.8727F);
		TheethL_r1.setTextureOffset(35, 61).addBox(-0.7F, -0.3F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		ModelRenderer WolfHide = new ModelRenderer(this);
		WolfHide.setRotationPoint(0.0F, -0.0F, 0.0F);
		bipedHead.addChild(WolfHide);
		WolfHide.setTextureOffset(16, 53).addBox(-5.0F, -9.0F, 0.0F, 10.0F, 1.0F, 4.0F, 0.0F, false);
		WolfHide.setTextureOffset(0, 42).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 8.0F, 1.0F, 0.0F, false);
		WolfHide.setTextureOffset(28, 47).addBox(4.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		WolfHide.setTextureOffset(28, 47).addBox(-5.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		WolfHide.setTextureOffset(22, 43).addBox(4.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		WolfHide.setTextureOffset(22, 43).addBox(-5.0F, -8.0F, 2.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		WolfHide.setTextureOffset(50, 59).addBox(-2.5F, -10.0F, 2.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		WolfHide.setTextureOffset(48, 62).addBox(-3.5F, -9.0F, 4.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		WolfHide.setTextureOffset(46, 56).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		WolfHide.setTextureOffset(46, 56).addBox(4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		WolfHide.setTextureOffset(46, 56).addBox(-3.0F, 2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		WolfHide.setTextureOffset(46, 56).addBox(0.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer WolfTail = new ModelRenderer(this);
		WolfTail.setRotationPoint(0.0F, -0.0F, 0.0F);
		bipedHead.addChild(WolfTail);
		WolfTail.setTextureOffset(54, 51).addBox(1.0F, -2.0F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		WolfTail.setTextureOffset(58, 50).addBox(-1.0F, -2.0F, 6.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		WolfTail.setTextureOffset(44, 54).addBox(-1.0F, -3.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		WolfTail.setTextureOffset(50, 52).addBox(-2.0F, -2.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		WolfTail.setTextureOffset(58, 49).addBox(-1.0F, 0.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		WolfTail.setTextureOffset(46, 49).addBox(-0.5F, 1.0F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}