package com.dragontechdev.projectshadow.client.screens;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.containers.psContainer_Anvil;
import com.dragontechdev.projectshadow.common.containers.psContainer_Grindstone;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class psScreen_Grindstone extends ContainerScreen<psContainer_Grindstone> {
	
	private static final ResourceLocation GRINDSTONE_GUI = new ResourceLocation(ProjectShadow.MOD_ID, "textures/gui/display_case.png");

	public psScreen_Grindstone(psContainer_Grindstone screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);

		this.guiLeft = 0;
		this.guiTop = 0;
		this.xSize = 175;
		this.ySize = 201;
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(matrixStack);
		super.render(matrixStack, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int x, int y) {
		this.font.func_243248_b(matrixStack, this.playerInventory.getDisplayName(), (float) this.playerInventoryTitleX, (float) this.playerInventoryTitleX, 4210752);
		super.drawGuiContainerForegroundLayer(matrixStack, x, y);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1f, 1f, 1f, 1f);
		this.minecraft.textureManager.bindTexture(GRINDSTONE_GUI);
		int x = (this.width - this.xSize) /2;
		int y = (this.height - this.ySize) /2;
		this.blit(matrixStack, x, y, 0, 0, this.xSize, this.ySize);
	}
	
}
