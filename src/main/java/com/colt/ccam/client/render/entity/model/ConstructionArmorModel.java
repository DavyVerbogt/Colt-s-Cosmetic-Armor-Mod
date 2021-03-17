package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ConstructionArmorModel extends BipedModel<LivingEntity> {

    public ConstructionArmorModel(float modelSize) {
        super(modelSize, 0.0F, 64, 64);

		ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(bone);
		bone.setTextureOffset(28, 53).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(44, 55).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(44, 55).addBox(4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 54).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(6, 51).addBox(-3.0F, -10.0F, 3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(19, 53).addBox(-4.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(19, 53).addBox(3.0F, -10.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(60, 47).addBox(-2.0F, -8.5F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(60, 47).addBox(1.0F, -8.5F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(21, 55).addBox(-2.0F, -11.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(21, 55).addBox(1.0F, -11.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(27, 54).addBox(-1.0F, -12.0F, -5.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(52, 47).addBox(-2.0F, -12.0F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(52, 47).addBox(1.0F, -12.0F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
