package com.dragontechdev.projectshadow.core.init;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.tileentities.psTile_DisplayCase;
import com.dragontechdev.projectshadow.common.tileentities.machines.psTile_Anvil;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {

	// Setup Tile Entity Register
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ProjectShadow.MOD_ID);
	
	
	public static final RegistryObject<TileEntityType<psTile_Anvil>> ANVIL_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("psanvil", () -> TileEntityType.Builder.create(psTile_Anvil::new, BlockInit.MACHINE_ANVIL.get()).build(null));
	
	public static final RegistryObject<TileEntityType<psTile_DisplayCase>> DISPLAY_CASE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("display_case", () -> TileEntityType.Builder.create(psTile_DisplayCase::new, BlockInit.DISPLAY_CASE.get()).build(null));
}
