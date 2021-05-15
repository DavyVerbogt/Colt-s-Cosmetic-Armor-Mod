package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SunGlassesCurioModel extends BipedModel<LivingEntity> {

    public SunGlassesCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);
        
        ModelRenderer GassL = new ModelRenderer(this);
		GassL.setRotationPoint(3.5F, -3.5F, -4.0F);
		bipedHead.addChild(GassL);
		GassL.setTextureOffset(62, 63).addBox(-2.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, true);

		ModelRenderer White_r1 = new ModelRenderer(this);
		White_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
		GassL.addChild(White_r1);
		setRotationAngle(White_r1, 0.0F, 0.0F, -0.9163F);
		White_r1.setTextureOffset(49, 62).addBox(1.2F, 1.8F, -0.2F, 2.0F, 1.0F, 0.0F, -0.3F, false);

		ModelRenderer L_r1 = new ModelRenderer(this);
		L_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		GassL.addChild(L_r1);
		setRotationAngle(L_r1, 0.0F, 0.0F, -0.9163F);
		L_r1.setTextureOffset(62, 63).addBox(-0.7F, -1.4F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, false);

		ModelRenderer R_r1 = new ModelRenderer(this);
		R_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		GassL.addChild(R_r1);
		setRotationAngle(R_r1, 0.0F, 0.0F, 0.9163F);
		R_r1.setTextureOffset(62, 63).addBox(-2.7F, 1.8F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, true);

		ModelRenderer GlassR = new ModelRenderer(this);
		GlassR.setRotationPoint(0.5F, -3.5F, -4.0F);
		bipedHead.addChild(GlassR);
		GlassR.setTextureOffset(62, 63).addBox(-3.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, true);

		ModelRenderer White_r2 = new ModelRenderer(this);
		White_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		GlassR.addChild(White_r2);
		setRotationAngle(White_r2, 0.0F, 0.0F, -0.9163F);
		White_r2.setTextureOffset(49, 62).addBox(-1.3F, -1.3F, -0.2F, 2.0F, 1.0F, 0.0F, -0.3F, false);
		White_r2.setTextureOffset(62, 63).addBox(-0.7F, -1.4F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, false);

		ModelRenderer R_r2 = new ModelRenderer(this);
		R_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		GlassR.addChild(R_r2);
		setRotationAngle(R_r2, 0.0F, 0.0F, 0.9163F);
		R_r2.setTextureOffset(62, 63).addBox(-2.7F, 1.8F, 0.0F, 1.0F, 1.0F, 0.0F, 0.3F, true);

		ModelRenderer GlassesArms = new ModelRenderer(this);
		GlassesArms.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(GlassesArms);
		GlassesArms.setTextureOffset(0, 57).addBox(-4.0F, -29.0F, -4.0F, 8.0F, 2.0F, 5.0F, 0.3F, false);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
