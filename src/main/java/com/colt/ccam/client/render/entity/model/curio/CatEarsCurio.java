package com.colt.ccam.client.render.entity.model.curio;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CatEarsCurio extends BipedModel<LivingEntity> {

//Dit is de code die je mee krijgt uit blockbench
//je moet alles wat ik uit koment met die * we doen

    /*    public class custom_model extends EntityModel<Entity> {
        private final ModelRenderer bipedHead;
        private final ModelRenderer EarL;
        private final ModelRenderer EarR;
    
        public custom_model() {
            textureWidth = 64;
            textureHeight = 64;
    */


    //Replase dit met dit hier onder
    public CatEarsCurio(float modelSize) {
		super(modelSize, 0.0F, 64, 64);


//         bipedHead = new ModelRenderer(this);
//         bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
            
    // Plaats voor die bovenste dingen ModelRenderer
    ModelRenderer EarL = new ModelRenderer(this);
            EarL.setRotationPoint(-1.0F, -0.0F, 0.0F);
            bipedHead.addChild(EarL);
            EarL.setTextureOffset(10, 51).addBox(3.0F, -9.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(10, 53).addBox(4.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(10, 55).addBox(5.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(10, 59).addBox(6.0F, -11.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(10, 57).addBox(5.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(14, 57).addBox(5.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            EarL.setTextureOffset(14, 61).addBox(3.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
    
            ModelRenderer EarR = new ModelRenderer(this);
            EarR.setRotationPoint(-1.0F, -0.0F, 0.0F);
            bipedHead.addChild(EarR);
            EarR.setTextureOffset(0, 51).addBox(-2.0F, -9.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(0, 53).addBox(-3.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(0, 55).addBox(-4.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(0, 59).addBox(-5.0F, -11.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(0, 57).addBox(-4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(4, 57).addBox(-4.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            EarR.setTextureOffset(4, 61).addBox(-3.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        }
    //dit wat ik nu uit comment kan ook weg

    /*    @Override
        public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
            //previously the render function, render code was moved to a method below
        }
    
        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            bipedHead.render(matrixStack, buffer, packedLight, packedOverlay);
        }
    */
        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }