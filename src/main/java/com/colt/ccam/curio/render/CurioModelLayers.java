package com.colt.ccam.curio.render;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.curio.render.model.CatEarCurioModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;

import java.util.function.Supplier;

public class CurioModelLayers {
    public static final ModelLayerLocation CAT_EARS = createLayerLocation("catears_curio");

    private static Supplier<LayerDefinition> layer(MeshDefinition mesh, int textureWidth, int textureHeight) {
        return () -> LayerDefinition.create(mesh, textureWidth, textureHeight);
    }

    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
        //event.registerLayerDefinition(CAT_EARS, () -> CatEarCurioModel.createCatEars(new CubeDeformation(0.5f)));
    }

    public static ModelLayerLocation createLayerLocation(String name) {
        return new ModelLayerLocation(new ResourceLocation(ColtCosmeticArmorMod.MOD_ID, name), name);
    }
}
