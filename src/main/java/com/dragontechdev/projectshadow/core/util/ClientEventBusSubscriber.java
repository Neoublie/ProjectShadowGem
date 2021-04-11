package com.dragontechdev.projectshadow.core.util;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.client.screens.DisplayCaseScreen;
import com.dragontechdev.projectshadow.core.init.ContainerTypeInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ProjectShadow.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContainerTypeInit.DISPLAY_CASE_CONTAINER_TYPE.get(), DisplayCaseScreen::new);
		
	}
}