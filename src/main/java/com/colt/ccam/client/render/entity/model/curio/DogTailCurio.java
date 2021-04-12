package com.colt.ccam.client.render.entity.model.curio;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class DogTailCurio extends BipedModel<LivingEntity> {

    public DogTailCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		ModelRenderer LowerTailTip_r1 = new ModelRenderer(this);
		LowerTailTip_r1.setRotationPoint(0.0F, 16.5F, 4.0F);
		bipedBody.addChild(LowerTailTip_r1);
		setRotationAngle(LowerTailTip_r1, -0.3927F, 0.0F, 0.0F);
		LowerTailTip_r1.setTextureOffset(20, 62).addBox(-0.5F, -0.5F, 6.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		LowerTailTip_r1.setTextureOffset(14, 61).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 1.0F, 2.0F, 1.0F, false);

		ModelRenderer MiddelTail_r1 = new ModelRenderer(this);
		MiddelTail_r1.setRotationPoint(0.0F, 16.5F, 4.0F);
		bipedBody.addChild(MiddelTail_r1);
		setRotationAngle(MiddelTail_r1, -0.6545F, 0.0F, 0.0F);
		MiddelTail_r1.setTextureOffset(8, 61).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, 1.5F, false);

		ModelRenderer TopTail2_r1 = new ModelRenderer(this);
		TopTail2_r1.setRotationPoint(0.0F, 7.5F, 2.5F);
		bipedBody.addChild(TopTail2_r1);
		setRotationAngle(TopTail2_r1, 0.4363F, 0.0F, 0.0F);
		TopTail2_r1.setTextureOffset(4, 60).addBox(-0.5F, 4.5F, -2.5F, 1.0F, 3.0F, 1.0F, 1.0F, false);
		TopTail2_r1.setTextureOffset(0, 60).addBox(-0.5F, 1.5F, -2.5F, 1.0F, 3.0F, 1.0F, 0.5F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}