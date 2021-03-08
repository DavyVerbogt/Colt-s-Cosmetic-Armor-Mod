package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class FlowerCrownArmorModel extends BipedModel<LivingEntity>{

    public FlowerCrownArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);
        
		ModelRenderer FlowerCrown = new ModelRenderer(this);
		FlowerCrown.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(FlowerCrown);
		FlowerCrown.setTextureOffset(0, 43).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		ModelRenderer Rose = new ModelRenderer(this);
		Rose.setRotationPoint(5.4F, -5.5F, 0.0F);
		FlowerCrown.addChild(Rose);
		setRotationAngle(Rose, 0.0F, 0.0F, 1.3526F);
		Rose.setTextureOffset(60, 47).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rose.setTextureOffset(58, 54).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Rose.setTextureOffset(58, 49).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Rose.setTextureOffset(58, 56).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Rose.setTextureOffset(58, 52).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer BottemLeaf_r1 = new ModelRenderer(this);
		BottemLeaf_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rose.addChild(BottemLeaf_r1);
		setRotationAngle(BottemLeaf_r1, 0.4363F, 0.0F, -0.0436F);
		BottemLeaf_r1.setTextureOffset(50, 47).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer LeftLeaf_r1 = new ModelRenderer(this);
		LeftLeaf_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rose.addChild(LeftLeaf_r1);
		setRotationAngle(LeftLeaf_r1, 0.0F, 0.0F, -0.4363F);
		LeftLeaf_r1.setTextureOffset(50, 50).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		ModelRenderer TopLeaf_r1 = new ModelRenderer(this);
		TopLeaf_r1.setRotationPoint(1.0F, 0.0F, 1.0F);
		Rose.addChild(TopLeaf_r1);
		setRotationAngle(TopLeaf_r1, -0.4363F, 0.0F, 0.0F);
		TopLeaf_r1.setTextureOffset(50, 55).addBox(-2.0F, -1.0F, 1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer RightLeaf_r1 = new ModelRenderer(this);
		RightLeaf_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		Rose.addChild(RightLeaf_r1);
		setRotationAngle(RightLeaf_r1, 0.0F, 0.0F, 0.4363F);
		RightLeaf_r1.setTextureOffset(50, 58).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}

