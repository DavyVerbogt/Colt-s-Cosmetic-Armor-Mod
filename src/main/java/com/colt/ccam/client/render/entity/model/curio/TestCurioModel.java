package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TestCurioModel extends BipedModel<LivingEntity> {

    public TestCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);
		
		ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedHead.addChild(bone);
		
		ModelRenderer octagonSmall = new ModelRenderer(this);
		octagonSmall.setRotationPoint(10.0F, -4.0F, 8.0F);
		bone.addChild(octagonSmall);
		octagonSmall.setTextureOffset(0, 61).addBox(-27.0F, -0.2071F, -0.5F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagonSmall.setTextureOffset(0, 61).addBox(-27.0F, -0.2071F, 0.1F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagonSmall.setTextureOffset(0, 61).addBox(-27.0F, 0.1F, -0.2071F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagonSmall.setTextureOffset(0, 61).addBox(-27.0F, -0.5F, -0.2071F, 28.0F, 0.0F, 0.0F, 0.0F, false);

		ModelRenderer octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
		octagonSmall.addChild(octagon_r1);
		setRotationAngle(octagon_r1, -0.7854F, 0.0F, 0.0F);
		octagon_r1.setTextureOffset(0, 61).addBox(-22.0F, -0.5F, -0.2071F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 61).addBox(-22.0F, 0.1F, -0.2071F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 61).addBox(-22.0F, -0.2071F, 0.1F, 28.0F, 0.0F, 0.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 61).addBox(-22.0F, -0.2071F, -0.5F, 28.0F, 0.0F, 0.0F, 0.0F, false);

		ModelRenderer Test = new ModelRenderer(this);
		Test.setRotationPoint(-4.6111F, -10.1F, 1.7889F);
		bone.addChild(Test);
		Test.setTextureOffset(9, 61).addBox(1.6111F, -2.9F, -3.7889F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(1.6111F, -2.9F, 3.2111F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(9.6111F, -2.9F, -1.7889F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(14.6111F, 5.7F, 5.7111F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(0.6111F, 1.1F, -12.7889F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(-12.3889F, 5.6F, 5.8111F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(-9.3889F, -2.9F, 1.2111F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(4.6111F, -2.9F, -0.7889F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Test.setTextureOffset(9, 61).addBox(-15.3889F, -2.9F, -1.7889F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ModelRenderer octagonBig = new ModelRenderer(this);
		octagonBig.setRotationPoint(-4.0F, -8.0F, -10.0F);
		bone.addChild(octagonBig);
		octagonBig.setTextureOffset(22, 59).addBox(-0.5F, -2.0711F, -5.0F, 3.0F, 4.0F, 0.0F, 0.1F, false);
		octagonBig.setTextureOffset(22, 59).addBox(-0.5F, -2.0711F, 4.6F, 3.0F, 4.0F, 0.0F, 0.1F, false);
		octagonBig.setTextureOffset(22, 59).addBox(-0.5F, 4.6F, -2.0711F, 3.0F, 0.0F, 4.0F, 0.1F, false);
		octagonBig.setTextureOffset(22, 59).addBox(-0.5F, -5.0F, -2.0711F, 3.0F, 0.0F, 4.0F, 0.1F, false);

		ModelRenderer octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		octagonBig.addChild(octagon_r2);
		setRotationAngle(octagon_r2, -0.7854F, 0.0F, 0.0F);
		octagon_r2.setTextureOffset(22, 59).addBox(-2.5F, -5.0F, -2.0711F, 3.0F, 0.0F, 4.0F, 0.1F, false);
		octagon_r2.setTextureOffset(22, 59).addBox(-2.5F, 4.6F, -2.0711F, 3.0F, 0.0F, 4.0F, 0.1F, false);
		octagon_r2.setTextureOffset(22, 59).addBox(-2.5F, -2.0711F, 4.6F, 3.0F, 4.0F, 0.0F, 0.1F, false);
		octagon_r2.setTextureOffset(22, 59).addBox(-2.5F, -2.0711F, -5.0F, 3.0F, 4.0F, 0.0F, 0.1F, false);
    }

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}  