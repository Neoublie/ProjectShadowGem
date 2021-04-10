package com.dragontechdev.projectshadow.core.init;

import com.dragontechdev.projectshadow.common.blocks.machines.psBlock_Anvil;
import com.dragontechdev.projectshadow.common.blocks.machines.psBlock_GrindStone;
import com.dragontechdev.projectshadow.common.blocks.machines.psBlock_JewellersTable;
import com.dragontechdev.projectshadow.common.blocks.machines.psBlock_Smeltery;
import com.dragontechdev.projectshadow.common.blocks.multiblocks.psBlock_AlloyBrick;
import com.dragontechdev.projectshadow.common.blocks.multiblocks.psBlock_BlastFurnaceBrick;
import com.dragontechdev.projectshadow.common.blocks.multiblocks.psBlock_BlastFurnaceHearth;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Amber;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Amethyst;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Aquamarine;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Jade;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Moonstone;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Onyx;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_OpalStone;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Painite;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_PinkQuartz;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Ruby;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Sapphire;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Sunstone;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Topaz;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Turquoise;
import com.dragontechdev.projectshadow.common.blocks.ores.gems.psBlock_Ore_Zircon;
import com.dragontechdev.projectshadow.common.blocks.ores.metals.*;
import com.dragontechdev.projectshadow.common.containers.psContainer_Anvil;
import com.dragontechdev.projectshadow.ProjectShadow;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectShadow.MOD_ID);
	public static final DeferredRegister<Block> BASICBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectShadow.MOD_ID);
	
	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ProjectShadow.MOD_ID);
		
	//ORES
	public static final RegistryObject<Block> ORE_HEMATITE = BASICBLOCKS.register("psblock_ore_hematite", () -> new psBlock_Ore_Hematite(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_LEAD = BASICBLOCKS.register("psblock_ore_lead", () -> new psBlock_Ore_Lead(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_MITHRIL = BASICBLOCKS.register("psblock_ore_mithril", () -> new psBlock_Ore_Mithril(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_NICKEL = BASICBLOCKS.register("psblock_ore_nickel", () -> new psBlock_Ore_Nickel(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_PLATINUM = BASICBLOCKS.register("psblock_ore_platinum", () -> new psBlock_Ore_Platinum(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_SILVER = BASICBLOCKS.register("psblock_ore_silver", () -> new psBlock_Ore_Silver(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_TIN = BASICBLOCKS.register("psblock_ore_tin", () -> new psBlock_Ore_Tin(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_TITANIUM = BASICBLOCKS.register("psblock_ore_titanium", () -> new psBlock_Ore_Titanium(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_TUNGSTEN = BASICBLOCKS.register("psblock_ore_tungsten", () -> new psBlock_Ore_Tungsten(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_URANIUM = BASICBLOCKS.register("psblock_ore_uranium", () -> new psBlock_Ore_Uranium(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_ZINC = BASICBLOCKS.register("psblock_ore_zinc", () -> new psBlock_Ore_Zinc(Properties.of(Material.STONE)));	
		
	//GEM ORES
	public static final RegistryObject<Block> ORE_AMBER = BASICBLOCKS.register("psblock_ore_amber", () -> new psBlock_Ore_Amber(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_AMETHYST = BASICBLOCKS.register("psblock_ore_amethyst", () -> new psBlock_Ore_Amethyst(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_AQUAMARINE = BASICBLOCKS.register("psblock_ore_aquamarine", () -> new psBlock_Ore_Aquamarine(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_JADE = BASICBLOCKS.register("psblock_ore_jade", () -> new psBlock_Ore_Jade(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_MOONSTONE = BASICBLOCKS.register("psblock_ore_moonstone", () -> new psBlock_Ore_Moonstone(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_ONYX = BASICBLOCKS.register("psblock_ore_onyx", () -> new psBlock_Ore_Onyx(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_OPALSTONE = BASICBLOCKS.register("psblock_ore_opalstone", () -> new psBlock_Ore_OpalStone(Properties.of(Material.STONE)));	
	public static final RegistryObject<Block> ORE_PAINITE = BASICBLOCKS.register("psblock_ore_painite", () -> new psBlock_Ore_Painite(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_PINKQUARTZ = BASICBLOCKS.register("psblock_ore_pinkquartz", () -> new psBlock_Ore_PinkQuartz(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_RUBY = BASICBLOCKS.register("psblock_ore_ruby", () -> new psBlock_Ore_Ruby(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_SAPPHIRE = BASICBLOCKS.register("psblock_ore_sapphire", () -> new psBlock_Ore_Sapphire(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_SUNSTONE = BASICBLOCKS.register("psblock_ore_sunstone", () -> new psBlock_Ore_Sunstone(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_TOPAZ = BASICBLOCKS.register("psblock_ore_topaz", () -> new psBlock_Ore_Topaz(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_TURQUOISE = BASICBLOCKS.register("psblock_ore_tuquoise", () -> new psBlock_Ore_Turquoise(Properties.of(Material.STONE)));
	public static final RegistryObject<Block> ORE_ZIRCON = BASICBLOCKS.register("psblock_ore_zircon", () -> new psBlock_Ore_Zircon(Properties.of(Material.STONE)));
	
	// Machines
	//public static final RegistryObject<Block> MACHINE_ANVIL = BLOCKS.register("psblock_anvil", () -> new psBlock_Anvil(Properties.of(Material.METAL)));
	public static final RegistryObject<Block> MACHINE_ANVIL = BLOCKS.register("psblock_anvil", () -> new psBlock_Anvil(Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.METAL)));
	public static final RegistryObject<Block> MACHINE_GRINDSTONE = BLOCKS.register("psblock_grindstone", () -> new psBlock_GrindStone(Properties.of(Material.METAL)));
	public static final RegistryObject<Block> MACHINE_JEWELLERSTABLE = BLOCKS.register("psblock_jewellerstable", () -> new psBlock_JewellersTable(Properties.of(Material.METAL)));
	public static final RegistryObject<Block> MACHINE_SMELTERY = BLOCKS.register("psblock_smeltery", () -> new psBlock_Smeltery(Properties.of(Material.METAL)));
	
	public static final RegistryObject<ContainerType<psContainer_Anvil>> JEWELLERS_ANVIL_CONTAINER = CONTAINERS.register("jewellers_anvil_container", () -> IForgeContainerType.create(psContainer_Anvil::new));
	
	// Multiblock Components
	public static final RegistryObject<Block> MULTIBLOCK_ALLOY_BRICK = BLOCKS.register("psblock_alloy_brick", () -> new psBlock_AlloyBrick(Properties.of(Material.METAL)));
	public static final RegistryObject<Block> MULTIBLOCK_BLASTFURNACE_BRICK = BLOCKS.register("psblock_blastfurnace_brick", () -> new psBlock_BlastFurnaceBrick(Properties.of(Material.METAL)));
	public static final RegistryObject<Block> MULTIBLOCK_BLASTFURNACE_HEARTH = BLOCKS.register("psblock_blastfurnace_hearth", () -> new psBlock_BlastFurnaceHearth(Properties.of(Material.METAL)));
	
	
}
