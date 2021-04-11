package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class DogEarsCurio extends BipedModel<LivingEntity> {

    public DogEarsCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);


		ModelRenderer DogEarsL = new ModelRenderer(this);
		DogEarsL.setRotationPoint(-2.8F, -10.45F, -1.5F);
		bipedHead.addChild(DogEarsL);
		DogEarsL.setTextureOffset(8, 59).addBox(4.5F, 1.45F, -0.5F, 3.0F, 4.0F, 1.0F, -0.1F, false);

		ModelRenderer Rotated_r1 = new ModelRenderer(this);
		Rotated_r1.setRotationPoint(6.0F, 1.95F, -2.2F);
		DogEarsL.addChild(Rotated_r1);
		setRotationAngle(Rotated_r1, 0.3491F, 0.0F, 0.0F);
		Rotated_r1.setTextureOffset(12, 53).addBox(-1.5F, -0.45F, -0.8F, 3.0F, 1.0F, 3.0F, -0.1F, false);

		ModelRenderer EarL_r1 = new ModelRenderer(this);
		EarL_r1.setRotationPoint(6.0F, 1.65F, -0.2F);
		DogEarsL.addChild(EarL_r1);
		setRotationAngle(EarL_r1, -0.7854F, 0.0F, 0.0F);
		EarL_r1.setTextureOffset(7, 57).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, -0.1F, false);

		ModelRenderer EarFlopL3 = new ModelRenderer(this);
		EarFlopL3.setRotationPoint(7.1F, -0.05F, 0.0F);
		DogEarsL.addChild(EarFlopL3);
		setRotationAngle(EarFlopL3, 0.0F, 0.0F, -0.3491F);
		EarFlopL3.setTextureOffset(12, 50).addBox(-3.2222F, 1.5669F, -3.2F, 3.0F, 2.0F, 1.0F, -0.1F, false);

		ModelRenderer TopL_r1 = new ModelRenderer(this);
		TopL_r1.setRotationPoint(3.0399F, -0.0843F, -1.7F);
		EarFlopL3.addChild(TopL_r1);
		setRotationAngle(TopL_r1, 0.0F, 0.0F, 0.7854F);
		TopL_r1.setTextureOffset(12, 47).addBox(-1.7956F, 4.9313F, -1.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);

		ModelRenderer DogEarsR = new ModelRenderer(this);
		DogEarsR.setRotationPoint(-8.8F, -10.45F, -1.5F);
		bipedHead.addChild(DogEarsR);
		DogEarsR.setTextureOffset(0, 59).addBox(4.1F, 1.45F, -0.5F, 3.0F, 4.0F, 1.0F, -0.1F, false);

		ModelRenderer Rotated_r2 = new ModelRenderer(this);
		Rotated_r2.setRotationPoint(5.6F, 1.95F, -2.2F);
		DogEarsR.addChild(Rotated_r2);
		setRotationAngle(Rotated_r2, 0.3491F, 0.0F, 0.0F);
		Rotated_r2.setTextureOffset(0, 53).addBox(-1.5F, -0.45F, -0.8F, 3.0F, 1.0F, 3.0F, -0.1F, false);

		ModelRenderer EarL_r2 = new ModelRenderer(this);
		EarL_r2.setRotationPoint(5.6F, 1.65F, -0.2F);
		DogEarsR.addChild(EarL_r2);
		setRotationAngle(EarL_r2, -0.7854F, 0.0F, 0.0F);
		EarL_r2.setTextureOffset(0, 57).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, -0.1F, false);

		ModelRenderer EarFlopL4 = new ModelRenderer(this);
		EarFlopL4.setRotationPoint(8.2F, 1.35F, 0.0F);
		DogEarsR.addChild(EarFlopL4);
		setRotationAngle(EarFlopL4, 0.0F, 0.0F, 0.3491F);
		EarFlopL4.setTextureOffset(0, 50).addBox(-3.598F, 1.5669F, -3.2F, 3.0F, 2.0F, 1.0F, -0.1F, false);

        ModelRenderer TopL_r2 = new ModelRenderer(this);
		TopL_r2.setRotationPoint(3.0399F, -0.0843F, -1.7F);
		EarFlopL4.addChild(TopL_r2);
		setRotationAngle(TopL_r2, 0.0F, 0.0F, 0.7854F);
		TopL_r2.setTextureOffset(0, 47).addBox(-2.0614F, 5.1971F, -1.5F, 2.0F, 2.0F, 1.0F, -0.1F, false);
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}