package com.colt.ccam.client.render.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ShotCowBoyHatArmorModel  extends BipedModel<LivingEntity>{
    
    
	public ShotCowBoyHatArmorModel (float modelSize) {
        super(modelSize, 0.0F, 64, 64);

    
    
        ModelRenderer CowboyHat = new ModelRenderer(this);
            CowboyHat.setRotationPoint(0.0F, -6.0F, 0.0F);
            bipedHead.addChild(CowboyHat);
            CowboyHat.setTextureOffset(0, 51).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
            CowboyHat.setTextureOffset(34, 42).addBox(1.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
            CowboyHat.setTextureOffset(42, 33).addBox(-4.0F, -5.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
            CowboyHat.setTextureOffset(20, 51).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
    
            ModelRenderer FlabRight_r1 = new ModelRenderer(this);
            FlabRight_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
            CowboyHat.addChild(FlabRight_r1);
            setRotationAngle(FlabRight_r1, 0.0F, 0.0F, -0.1745F);
            FlabRight_r1.setTextureOffset(0, 38).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
    
            ModelRenderer FlabLeft_r1 = new ModelRenderer(this);
            FlabLeft_r1.setRotationPoint(5.0F, 0.0F, 0.0F);
            CowboyHat.addChild(FlabLeft_r1);
            setRotationAngle(FlabLeft_r1, 0.0F, 0.0F, 0.1745F);
            FlabLeft_r1.setTextureOffset(12, 35).addBox(0.0F, -2.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
    
            ModelRenderer Hole = new ModelRenderer(this);
            Hole.setRotationPoint(0.0F, 32.0F, 0.0F);
            CowboyHat.addChild(Hole);
            
    
            ModelRenderer  Top = new ModelRenderer(this);
            Top.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Top);
            Top.setTextureOffset(4, 44).addBox(0.0F, -36.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Top.setTextureOffset(4, 46).addBox(-3.0F, -37.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Top.setTextureOffset(4, 46).addBox(2.0F, -37.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer Bottem = new ModelRenderer(this);
            Bottem.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Bottem);
            Bottem.setTextureOffset(0, 44).addBox(-2.0F, -32.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Bottem.setTextureOffset(4, 46).addBox(2.0F, -32.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Bottem.setTextureOffset(4, 46).addBox(-4.0F, -32.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Bottem.setTextureOffset(4, 46).addBox(4.0F, -32.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Bottem.setTextureOffset(0, 42).addBox(2.0F, -32.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer Left = new ModelRenderer(this);
            Left.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Left);
            Left.setTextureOffset(4, 40).addBox(3.0F, -36.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Left.setTextureOffset(4, 40).addBox(3.0F, -34.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer Front = new ModelRenderer(this);
            Front.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Front);
            Front.setTextureOffset(4, 42).addBox(-3.0F, -36.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Front.setTextureOffset(4, 42).addBox(0.0F, -34.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Front.setTextureOffset(0, 40).addBox(3.0F, -36.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer RightSide = new ModelRenderer(this);
            RightSide.setRotationPoint(-5.3428F, -31.4026F, 0.5F);
            Hole.addChild(RightSide);
            
    
            ModelRenderer cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            RightSide.addChild(cube_r1);
            setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
            cube_r1.setTextureOffset(16, 43).addBox(-0.5572F, -2.4974F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(16, 41).addBox(-0.5572F, -1.4974F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(12, 41).addBox(-0.5572F, -0.4974F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer Right = new ModelRenderer(this);
            Right.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Right);
            Right.setTextureOffset(0, 46).addBox(-4.0F, -37.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
            Right.setTextureOffset(0, 46).addBox(-4.0F, -36.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
            Right.setTextureOffset(0, 46).addBox(-4.0F, -34.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
    
            ModelRenderer LeftSide = new ModelRenderer(this);
            LeftSide.setRotationPoint(5.543F, -32.4252F, 2.5F);
            Hole.addChild(LeftSide);
            
    
            ModelRenderer cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
            LeftSide.addChild(cube_r2);
            setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
            cube_r2.setTextureOffset(16, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(0.1736F, -0.9848F, -6.0F);
            LeftSide.addChild(cube_r3);
            setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
            cube_r3.setTextureOffset(16, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    
            ModelRenderer Back = new ModelRenderer(this);
            Back.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hole.addChild(Back);
            Back.setTextureOffset(12, 43).addBox(0.0F, -34.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Back.setTextureOffset(12, 43).addBox(2.0F, -36.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Back.setTextureOffset(12, 43).addBox(-3.0F, -35.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
     }
            public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}