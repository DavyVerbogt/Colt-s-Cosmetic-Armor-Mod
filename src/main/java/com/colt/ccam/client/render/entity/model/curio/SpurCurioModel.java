package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SpurCurioModel extends BipedModel<LivingEntity> {

    public SpurCurioModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);
    
		ModelRenderer Star2 = new ModelRenderer(this);
		Star2.setRotationPoint(-0.064F, 8.8F, 5.6769F);
		bipedRightLeg.addChild(Star2);
		setRotationAngle(Star2, -0.4363F, 0.0F, 0.0F);
		Star2.setTextureOffset(0, 61).addBox(-0.4F, 0.4F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Star3_r1 = new ModelRenderer(this);
		Star3_r1.setRotationPoint(0.1F, 0.9F, -0.7F);
		Star2.addChild(Star3_r1);
		setRotationAngle(Star3_r1, -0.7854F, 0.0F, 0.0F);
		Star3_r1.setTextureOffset(0, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LSpur = new ModelRenderer(this);
		LSpur.setRotationPoint(-2.0F, 10.0F, 0.0F);
		bipedRightLeg.addChild(LSpur);
		setRotationAngle(LSpur, 0.0F, 0.0F, 1.5708F);
		LSpur.setTextureOffset(7, 57).addBox(-1.0085F, -4.5F, -2.3546F, 2.0F, 5.0F, 2.0F, -0.2F, true);

		ModelRenderer BackBit4 = new ModelRenderer(this);
		BackBit4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LSpur.addChild(BackBit4);
		BackBit4.setTextureOffset(0, 61).addBox(-1.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, -0.3F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
		cube_r1.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.0472F, 0.0F);
		cube_r2.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.0472F, 0.0F);
		cube_r3.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.3491F, 0.0F);
		cube_r4.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, -0.6981F, 3.1416F);
		cube_r5.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
		cube_r6.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r6.setTextureOffset(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r6.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.6981F, 3.1416F);
		cube_r7.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r8);
		setRotationAngle(cube_r8, -3.1416F, 1.3963F, 3.1416F);
		cube_r8.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -0.1F, 0.0F);
		BackBit4.addChild(cube_r9);
		setRotationAngle(cube_r9, -3.1416F, -1.3963F, 3.1416F);
		cube_r9.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(-1.136F, -1.5F, 3.5769F);
		BackBit4.addChild(octagon_r1);
		setRotationAngle(octagon_r1, -0.6981F, 0.1745F, 0.0F);
		octagon_r1.setTextureOffset(0, 61).addBox(-0.164F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, -0.3F, false);

		ModelRenderer octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(-1.136F, -1.5F, 3.5769F);
		BackBit4.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.6981F, 0.1745F, 0.0F);
		octagon_r2.setTextureOffset(0, 61).addBox(-0.164F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, -0.3F, false);

		ModelRenderer octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(-1.036F, -0.3F, 2.2769F);
		BackBit4.addChild(octagon_r3);
		setRotationAngle(octagon_r3, -0.6545F, 0.0F, 0.0F);
		octagon_r3.setTextureOffset(0, 61).addBox(-0.4F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, -0.3F, false);

		ModelRenderer octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(-0.6915F, 0.2F, 1.4454F);
		BackBit4.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, 1.1781F, 0.0F);
		octagon_r4.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

		ModelRenderer RSpur = new ModelRenderer(this);
		RSpur.setRotationPoint(2.0F, 10.0F, 0.0F);
		bipedRightLeg.addChild(RSpur);
		setRotationAngle(RSpur, 0.0F, 0.0F, -1.5708F);
		

		ModelRenderer BackBit3 = new ModelRenderer(this);
		BackBit3.setRotationPoint(0.0F, 0.0F, 0.0F);
		RSpur.addChild(BackBit3);
		BackBit3.setTextureOffset(0, 61).addBox(0.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, -0.3F, true);
		BackBit3.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -2.0944F, 0.0F);
		cube_r10.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 1.3963F, 0.0F);
		cube_r11.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 2.0944F, 0.0F);
		cube_r12.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 2.7925F, 0.0F);
		cube_r13.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r13.setTextureOffset(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r13.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -2.7925F, 0.0F);
		cube_r14.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.6981F, 0.0F);
		cube_r15.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.6981F, 0.0F);
		cube_r16.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -1.3963F, 0.0F);
		cube_r17.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(1.036F, -0.3F, 2.2769F);
		BackBit3.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, -0.1745F, 0.0F);
		octagon_r5.setTextureOffset(0, 61).addBox(-0.536F, -2.2F, 0.2F, 1.0F, 1.0F, 2.0F, -0.3F, true);

		ModelRenderer octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(1.036F, -0.3F, 2.2769F);
		BackBit3.addChild(octagon_r6);
		setRotationAngle(octagon_r6, -0.6545F, 0.0F, 0.0F);
		octagon_r6.setTextureOffset(0, 61).addBox(-0.6F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, -0.3F, true);

		ModelRenderer octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(0.6915F, 0.2F, 1.4454F);
		BackBit3.addChild(octagon_r7);
		setRotationAngle(octagon_r7, 0.0F, -1.1781F, 0.0F);
		octagon_r7.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

		ModelRenderer Star = new ModelRenderer(this);
		Star.setRotationPoint(-0.064F, 8.8F, 5.6769F);
		bipedLeftLeg.addChild(Star);
		setRotationAngle(Star, -0.4363F, 0.0F, 0.0F);
		Star.setTextureOffset(0, 61).addBox(-0.4F, 0.4F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer Star2_r1 = new ModelRenderer(this);
		Star2_r1.setRotationPoint(0.1F, 0.9F, -0.7F);
		Star.addChild(Star2_r1);
		setRotationAngle(Star2_r1, -0.7854F, 0.0F, 0.0F);
		Star2_r1.setTextureOffset(0, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		ModelRenderer LSpur1 = new ModelRenderer(this);
		LSpur1.setRotationPoint(2.0F, 10.0F, 0.0F);
		bipedLeftLeg.addChild(LSpur1);
		setRotationAngle(LSpur1, 0.0F, 0.0F, -1.5708F);

		ModelRenderer BackBit2 = new ModelRenderer(this);
		BackBit2.setRotationPoint(0.0F, 0.0F, 0.0F);
		LSpur1.addChild(BackBit2);
		BackBit2.setTextureOffset(0, 61).addBox(0.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, -0.3F, true);
		BackBit2.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 1.3963F, 0.0F);
		cube_r18.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 2.0944F, 0.0F);
		cube_r19.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 2.7925F, 0.0F);
		cube_r20.setTextureOffset(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r20.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -2.7925F, 0.0F);
		cube_r21.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.6981F, 0.0F);
		cube_r22.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.6981F, 0.0F);
		cube_r23.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -1.3963F, 0.0F);
		cube_r24.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -2.0944F, 0.0F);
		cube_r25.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(1.036F, -0.3F, 2.2769F);
		BackBit2.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.0F, -0.1745F, 0.0F);
		octagon_r8.setTextureOffset(0, 61).addBox(-0.536F, -2.2F, 0.2F, 1.0F, 1.0F, 2.0F, -0.3F, true);

		ModelRenderer octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(1.036F, -0.3F, 2.2769F);
		BackBit2.addChild(octagon_r9);
		setRotationAngle(octagon_r9, -0.6545F, 0.0F, 0.0F);
		octagon_r9.setTextureOffset(0, 61).addBox(-0.6F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, -0.3F, true);

		ModelRenderer octagon_r10 = new ModelRenderer(this);
		octagon_r10.setRotationPoint(0.6915F, 0.2F, 1.4454F);
		BackBit2.addChild(octagon_r10);
		setRotationAngle(octagon_r10, 0.0F, -1.1781F, 0.0F);
		octagon_r10.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, true);

		ModelRenderer RSpur2 = new ModelRenderer(this);
		RSpur2.setRotationPoint(-2.0F, 10.0F, 0.0F);
		bipedLeftLeg.addChild(RSpur2);
		setRotationAngle(RSpur2, 0.0F, 0.0F, 1.5708F);
		RSpur2.setTextureOffset(7, 57).addBox(-1.0085F, -4.5F, -2.3546F, 2.0F, 5.0F, 2.0F, -0.2F, true);

		ModelRenderer BackBit = new ModelRenderer(this);
		BackBit.setRotationPoint(0.0F, 0.0F, 0.0F);
		RSpur2.addChild(BackBit);
		BackBit.setTextureOffset(0, 61).addBox(-1.436F, -2.3F, 2.1769F, 1.0F, 2.0F, 1.0F, -0.3F, false);

		ModelRenderer cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r26);
		setRotationAngle(cube_r26, -3.1416F, 1.4399F, 3.1416F);
		cube_r26.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r27);
		setRotationAngle(cube_r27, -3.1416F, 0.7418F, 3.1416F);
		cube_r27.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r28);
		setRotationAngle(cube_r28, -3.1416F, 0.0436F, 3.1416F);
		cube_r28.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r28.setTextureOffset(0, 61).addBox(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);
		cube_r28.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r29);
		setRotationAngle(cube_r29, -3.1416F, -0.6545F, 3.1416F);
		cube_r29.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -0.3927F, 0.0F);
		cube_r30.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 1.0036F, 0.0F);
		cube_r31.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, -1.0908F, 0.0F);
		cube_r32.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.3054F, 0.0F);
		cube_r33.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		BackBit.addChild(cube_r34);
		setRotationAngle(cube_r34, -3.1416F, -1.3526F, 3.1416F);
		cube_r34.setTextureOffset(0, 61).addBox(0.7F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, false);

		ModelRenderer octagon_r11 = new ModelRenderer(this);
		octagon_r11.setRotationPoint(-1.136F, -1.5F, 3.5769F);
		BackBit.addChild(octagon_r11);
		setRotationAngle(octagon_r11, -0.6981F, 0.1745F, 0.0F);
		octagon_r11.setTextureOffset(0, 61).addBox(-0.164F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, -0.3F, false);

		ModelRenderer octagon_r12 = new ModelRenderer(this);
		octagon_r12.setRotationPoint(-1.136F, -1.5F, 3.5769F);
		BackBit.addChild(octagon_r12);
		setRotationAngle(octagon_r12, 0.6981F, 0.1745F, 0.0F);
		octagon_r12.setTextureOffset(0, 61).addBox(-0.164F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, -0.3F, false);

		ModelRenderer octagon_r13 = new ModelRenderer(this);
		octagon_r13.setRotationPoint(-1.036F, -0.3F, 2.2769F);
		BackBit.addChild(octagon_r13);
		setRotationAngle(octagon_r13, -0.6545F, 0.0F, 0.0F);
		octagon_r13.setTextureOffset(0, 61).addBox(-0.4F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, -0.3F, false);

		ModelRenderer octagon_r14 = new ModelRenderer(this);
		octagon_r14.setRotationPoint(-0.6915F, 0.2F, 1.4454F);
		BackBit.addChild(octagon_r14);
		setRotationAngle(octagon_r14, 0.0F, 1.1781F, 0.0F);
		octagon_r14.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}