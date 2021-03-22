package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ArrowArmorModel extends BipedModel<LivingEntity> {

	public ArrowArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer Arrow = new ModelRenderer(this);
		Arrow.setRotationPoint(1.7143F, -5.0F, -0.5F);
		bipedHead.addChild(Arrow);
		setRotationAngle(Arrow, 0.0F, 0.0F, -0.1745F);

		ModelRenderer FeatherFlat2_r1 = new ModelRenderer(this);
		FeatherFlat2_r1.setRotationPoint(6.2857F, 0.0F, 0.0F);
		Arrow.addChild(FeatherFlat2_r1);
		setRotationAngle(FeatherFlat2_r1, -0.7854F, 0.0F, 0.0F);
		FeatherFlat2_r1.setTextureOffset(37, 54).addBox(-1.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		ModelRenderer Tip2_r1 = new ModelRenderer(this);
		Tip2_r1.setRotationPoint(-7.2143F, 0.0F, 0.0F);
		Arrow.addChild(Tip2_r1);
		setRotationAngle(Tip2_r1, -0.7854F, 0.0F, 0.0F);
		Tip2_r1.setTextureOffset(52, 55).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, true);
		Tip2_r1.setTextureOffset(37, 54).addBox(9.5F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, true);
		Tip2_r1.setTextureOffset(29, 56).addBox(1.5F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, 0.0F, true);

		ModelRenderer Tip1_r1 = new ModelRenderer(this);
		Tip1_r1.setRotationPoint(-7.2143F, 0.0F, 0.0F);
		Arrow.addChild(Tip1_r1);
		setRotationAngle(Tip1_r1, 0.7854F, 0.0F, 0.0F);
		Tip1_r1.setTextureOffset(52, 55).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, true);
		Tip1_r1.setTextureOffset(37, 54).addBox(9.5F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, true);
		Tip1_r1.setTextureOffset(29, 56).addBox(1.5F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, 0.0F, true);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}