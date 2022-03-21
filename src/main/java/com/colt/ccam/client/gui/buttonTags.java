package com.colt.ccam.client.gui;

import com.colt.ccam.client.event.CreativeFilter;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Matrix4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

//Credits for this function goes to MrCrayfish as i used his furniture mod as a reference
//i didnt want to clutter the creative menu with to many tabs but also wanted to keep everything organized

public class buttonTags extends Button {
    private static final ResourceLocation TABS = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");

    private CreativeFilter.TagFilter category;
    private ItemStack stack;
    private boolean toggled;

    public buttonTags(int x, int y, CreativeFilter.TagFilter category, OnPress onPress)
    {
        super(x, y, 32, 28, TextComponent.EMPTY, onPress);
        this.category = category;
        this.stack = category.getIcon();
        this.toggled = category.isEnabled();
    }

    public CreativeFilter.TagFilter getCategory()
    {
        return this.category;
    }

    @Override
    public void onPress()
    {
        this.toggled = !this.toggled;
        this.category.setEnabled(this.toggled);
        super.onPress();
    }

    @Override
    public void renderButton(PoseStack poseStack, int mouseX, int mouseY, float partialTicks)
    {
        Minecraft minecraft = Minecraft.getInstance();
        RenderSystem.setShader(GameRenderer::getPositionColorTexShader);
        RenderSystem.setShaderTexture(0, TABS);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, this.alpha);

        int width = this.toggled ? 32 : 28;
        int textureX = 28;
        int textureY = this.toggled ? 32 : 0;
        this.drawRotatedTexture(poseStack.last().pose(), this.x, this.y, textureX, textureY, width, 28);

        ItemRenderer renderer = minecraft.getItemRenderer();
        renderer.blitOffset = 100.0F;
        renderer.renderAndDecorateItem(this.stack, x + 8, y + 6);
        renderer.renderGuiItemDecorations(minecraft.font, this.stack, x + 8, y + 6);
        renderer.blitOffset = 0.0F;
    }

    private void drawRotatedTexture(Matrix4f matrix4f, int x, int y, int textureX, int textureY, int width, int height)
    {
        float scaleX = 0.00390625F;
        float scaleY = 0.00390625F;
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        BufferBuilder buffer = Tesselator.getInstance().getBuilder();
        buffer.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
        buffer.vertex(matrix4f, x, y + height, 0.0F).uv(((float) (textureX + height) * scaleX), ((float) (textureY) * scaleY)).endVertex();
        buffer.vertex(matrix4f, x + width, y + height, 0.0F).uv(((float) (textureX + height) * scaleX), ((float) (textureY + width) * scaleY)).endVertex();
        buffer.vertex(matrix4f, x + width, y, 0.0F).uv(((float) (textureX) * scaleX), ((float) (textureY + width) * scaleY)).endVertex();
        buffer.vertex(matrix4f, x, y, 0.0F).uv(((float) (textureX) * scaleX), ((float) (textureY) * scaleY)).endVertex();
        buffer.end();
        BufferUploader.end(buffer);
    }

    public void updateState()
    {
        this.toggled = this.category.isEnabled();
    }
}