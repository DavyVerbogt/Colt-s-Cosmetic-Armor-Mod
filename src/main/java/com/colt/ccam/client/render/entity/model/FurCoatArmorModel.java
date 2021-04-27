package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class FurCoatArmorModel extends BipedModel<LivingEntity> {

    public FurCoatArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

        ModelRenderer Jacket = new ModelRenderer(this);
        Jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(Jacket);
        Jacket.setTextureOffset(40, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.2F, false);

        ModelRenderer FurNeckThing = new ModelRenderer(this);
		FurNeckThing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Jacket.addChild(FurNeckThing);
		FurNeckThing.setTextureOffset(19, 48).addBox(-5.0F, -2.0F, 4.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
		FurNeckThing.setTextureOffset(17, 48).addBox(-5.0F, 0.0F, 1.9F, 10.0F, 0.0F, 3.0F, 0.1F, false);
		FurNeckThing.setTextureOffset(24, 57).addBox(3.8F, -1.0F, -2.0F, 2.0F, 1.0F, 6.0F, 0.0F, true);
		FurNeckThing.setTextureOffset(24, 57).addBox(3.8F, -1.0F, -2.6F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		FurNeckThing.setTextureOffset(24, 57).addBox(-5.8F, -1.0F, -2.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		FurNeckThing.setTextureOffset(24, 57).addBox(-5.8F, -1.0F, -2.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		FurNeckThing.setTextureOffset(19, 44).addBox(-5.8F, -0.9F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		FurNeckThing.setTextureOffset(19, 44).addBox(4.8F, -0.9F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-5.3F, -0.5F, 4.5F);
        FurNeckThing.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.6981F, 0.0F);
        cube_r1.setTextureOffset(60, 47).addBox(0.3F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, 0.3F, true);

        ModelRenderer cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(5.3F, -0.5F, 4.5F);
        FurNeckThing.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        cube_r2.setTextureOffset(60, 47).addBox(-1.3F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, 0.3F, false);

        ModelRenderer cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-5.0F, -1.0F, -2.0F);
        FurNeckThing.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.1047F, 0.0F, -0.3927F);
        cube_r3.setTextureOffset(24, 57).addBox(-1.0F, 0.4F, -0.6F, 2.0F, 6.0F, 1.0F, 0.0F, false);

        ModelRenderer cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(5.0F, -1.0F, -2.0F);
        FurNeckThing.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.1047F, 0.0F, 0.3927F);
        cube_r4.setTextureOffset(24, 57).addBox(-1.0F, 0.4F, -0.6F, 2.0F, 6.0F, 1.0F, 0.0F, true);

        ModelRenderer FurFlufs = new ModelRenderer(this);
        FurFlufs.setRotationPoint(0.0F, 0.0F, 0.0F);
        Jacket.addChild(FurFlufs);
        FurFlufs.setTextureOffset(35, 60).addBox(-1.8F, -2.4F, 3.9F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(-3.8F, -2.4F, 4.1F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(1.2F, -2.4F, 4.2F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.2F, -2.4F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(1.8F, -0.9F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.7F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(-1.6F, -0.6F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(-3.0F, -0.6F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(0.2F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(-3.8F, -1.7F, 4.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(-4.8F, -2.3F, 4.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.6F, -2.4F, 3.9F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.8F, -1.5F, 1.7F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.4F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.4F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.2F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.3F, -0.4F, 2.6F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.3F, -0.4F, 2.6F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.0F, -1.5F, -2.2F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.0F, -1.5F, -2.2F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.0F, -1.2F, -3.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.0F, -1.2F, -3.0F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.0F, -0.1F, -2.9F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.2F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.2F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.7F, -1.6F, 2.8F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.7F, -1.6F, 2.8F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.2F, -2.0F, 2.8F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.2F, -2.0F, 2.8F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.5F, -1.6F, 4.3F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.5F, -1.6F, 4.3F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.1F, -0.9F, 3.7F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.1F, -0.9F, 3.7F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.2F, -1.4F, 2.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.2F, -1.4F, 2.0F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-6.3F, -0.5F, 2.4F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(5.3F, -0.5F, 2.4F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-4.1F, 0.9F, -2.7F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.1F, 0.9F, -2.7F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-5.0F, 0.9F, -2.8F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(4.0F, 0.9F, -2.8F, 1.0F, 1.0F, 1.0F, -0.2F, true);
        FurFlufs.setTextureOffset(35, 60).addBox(-4.9F, -1.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        FurFlufs.setTextureOffset(35, 60).addBox(3.9F, -1.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        ModelRenderer RightLegJacket = new ModelRenderer(this);
        RightLegJacket.setRotationPoint(1.2F, -1.0F, 0.0F);
        bipedRightArm.addChild(RightLegJacket);
        RightLegJacket.setTextureOffset(0, 48).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);

        ModelRenderer LeftLegJacket = new ModelRenderer(this);
        LeftLegJacket.setRotationPoint(-1.2F, -1.0F, 0.0F);
        bipedLeftArm.addChild(LeftLegJacket);
        LeftLegJacket.setTextureOffset(0, 48).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}