package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TulipArmorModel extends BipedModel<LivingEntity> {

	public TulipArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Tulip = new ModelRenderer(this);
		Tulip.setRotationPoint(-4.5F, -5.0F, 0.0F);
		bipedHead.addChild(Tulip);

		ModelRenderer Tulip1 = new ModelRenderer(this);
		Tulip1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip.addChild(Tulip1);
		setRotationAngle(Tulip1, 0.1309F, 0.1309F, -0.0873F);

		ModelRenderer Stem_r1 = new ModelRenderer(this);
		Stem_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip1.addChild(Stem_r1);
		setRotationAngle(Stem_r1, 0.0F, 0.3491F, 0.0F);
		Stem_r1.setTextureOffset(0, 55).addBox(0.0F, -5.0F, -3.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		ModelRenderer BulpBottem_r1 = new ModelRenderer(this);
		BulpBottem_r1.setRotationPoint(-0.4059F, -5.0F, -2.4897F);
		Tulip1.addChild(BulpBottem_r1);
		setRotationAngle(BulpBottem_r1, 0.0F, 0.0873F, 0.0F);
		BulpBottem_r1.setTextureOffset(30, 59).addBox(-1.5F, -0.4F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);
		BulpBottem_r1.setTextureOffset(31, 54).addBox(-1.5F, -1.6F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);

		ModelRenderer Tulip2 = new ModelRenderer(this);
		Tulip2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip.addChild(Tulip2);
		setRotationAngle(Tulip2, -0.0873F, 0.0F, 0.0F);

		ModelRenderer Stem_r2 = new ModelRenderer(this);
		Stem_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip2.addChild(Stem_r2);
		setRotationAngle(Stem_r2, 0.0F, -0.48F, 0.0F);
		Stem_r2.setTextureOffset(8, 54).addBox(0.0F, -5.0F, -2.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		ModelRenderer BulpBottem_r2 = new ModelRenderer(this);
		BulpBottem_r2.setRotationPoint(-1.0F, -4.0F, 2.5F);
		Tulip2.addChild(BulpBottem_r2);
		setRotationAngle(BulpBottem_r2, 0.0F, -0.2182F, 0.0F);
		BulpBottem_r2.setTextureOffset(18, 58).addBox(-2.0F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);
		BulpBottem_r2.setTextureOffset(18, 53).addBox(-2.0F, -2.6F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);

		ModelRenderer Tulip3 = new ModelRenderer(this);
		Tulip3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip.addChild(Tulip3);
		setRotationAngle(Tulip3, -0.2618F, -1.7453F, -0.5236F);

		ModelRenderer BulpBottem_r3 = new ModelRenderer(this);
		BulpBottem_r3.setRotationPoint(-1.0F, -4.0F, 2.5F);
		Tulip3.addChild(BulpBottem_r3);
		setRotationAngle(BulpBottem_r3, 0.0F, -0.2182F, 0.0F);
		BulpBottem_r3.setTextureOffset(44, 59).addBox(-2.0F, -1.4F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);
		BulpBottem_r3.setTextureOffset(44, 54).addBox(-2.0F, -2.6F, -1.5F, 3.0F, 2.0F, 3.0F, -0.4F, false);

		ModelRenderer Stem_r3 = new ModelRenderer(this);
		Stem_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tulip3.addChild(Stem_r3);
		setRotationAngle(Stem_r3, 0.0F, -0.48F, 0.0F);
		Stem_r3.setTextureOffset(8, 54).addBox(0.0F, -5.0F, -2.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}