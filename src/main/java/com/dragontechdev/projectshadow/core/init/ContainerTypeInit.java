package com.dragontechdev.projectshadow.core.init;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.containers.psContainer_DisplayCase;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeInit {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = DeferredRegister.create(ForgeRegistries.CONTAINERS, ProjectShadow.MOD_ID);
	
	public static final RegistryObject<ContainerType<psContainer_DisplayCase>> DISPLAY_CASE_CONTAINER_TYPE = CONTAINER_TYPE
			.register("display_case", () -> IForgeContainerType.create(psContainer_DisplayCase::new));
}
