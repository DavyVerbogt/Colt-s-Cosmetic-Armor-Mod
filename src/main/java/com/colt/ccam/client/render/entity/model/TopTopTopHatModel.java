package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TopTopTopHatModel extends BipedModel<LivingEntity> {

    public TopTopTopHatModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer TophatAll = new ModelRenderer(this);
		TophatAll.setRotationPoint(4.0F, -7.0F, 4.0F);
		bipedHead.addChild(TophatAll);
		setRotationAngle(TophatAll, -0.2618F, 0.0F, 0.2618F);
		

		ModelRenderer TopHat = new ModelRenderer(this);
		TopHat.setRotationPoint(0.0F, 0.0F, 0.0F);
		TophatAll.addChild(TopHat);
		TopHat.setTextureOffset(52, 56).addBox(-2.0F, -6.25F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		TopHat.setTextureOffset(44, 56).addBox(-3.0F, -1.25F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		ModelRenderer TopHat2 = new ModelRenderer(this);
		TopHat2.setRotationPoint(0.0F, -6.0F, 0.0F);
		TophatAll.addChild(TopHat2);
		

		ModelRenderer Bottem_r1 = new ModelRenderer(this);
		Bottem_r1.setRotationPoint(0.5F, -0.1176F, -0.5681F);
		TopHat2.addChild(Bottem_r1);
		setRotationAngle(Bottem_r1, -0.2618F, 0.0F, 0.2618F);
		Bottem_r1.setTextureOffset(44, 56).addBox(-2.5052F, -1.3118F, -2.187F, 5.0F, 2.0F, 5.0F, -0.5F, false);
		Bottem_r1.setTextureOffset(52, 56).addBox(-1.5052F, -5.3118F, -1.187F, 3.0F, 5.0F, 3.0F, -0.5F, false);

		ModelRenderer TopHat3 = new ModelRenderer(this);
		TopHat3.setRotationPoint(0.0F, -10.0F, 0.0F);
		TophatAll.addChild(TopHat3);
		

		ModelRenderer Bottem_r2 = new ModelRenderer(this);
		Bottem_r2.setRotationPoint(1.0F, -0.3176F, 2.7319F);
		TopHat3.addChild(Bottem_r2);
		setRotationAngle(Bottem_r2, -0.4363F, 0.0F, -0.4363F);
		Bottem_r2.setTextureOffset(44, 56).addBox(-2.7333F, -0.5269F, -3.6744F, 5.0F, 2.0F, 5.0F, -0.8F, false);
		Bottem_r2.setTextureOffset(52, 56).addBox(-1.7333F, -3.9269F, -2.6744F, 3.0F, 5.0F, 3.0F, -0.8F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
