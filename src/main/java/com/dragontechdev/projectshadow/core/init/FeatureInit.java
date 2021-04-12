package com.dragontechdev.projectshadow.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

	public static void addOres(final BiomeLoadingEvent event) {
		//Example Specific Block RuleTest
		//addOre(event, new BlockMatchRuleTest(BlockInit.ORE_HEMATITE.get()), BlockInit.ORE_HEMATITE.get().getDefaultState(), 4, 30, 60, 10);
		
		//Example Block by TAG RuleTest
		//addOre(event, new TagMatchRuleTest(BlockTags.LEAVES), BlockInit.ORE_HEMATITE.get().getDefaultState(), 4, 30, 60, 10);
		
		
		// ADD METAL ORES (vein size, minimum, max, number of nodes)
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_HEMATITE.get().getDefaultState(), 4, 30, 60, 15);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_LEAD.get().getDefaultState(), 6, 20, 40, 15);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_MITHRIL.get().getDefaultState(), 2, 0, 20, 8);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_NICKEL.get().getDefaultState(), 6, 0, 20, 15);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_PLATINUM.get().getDefaultState(), 2, 14, 32, 8);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_SILVER.get().getDefaultState(), 6, 20, 40, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_TIN.get().getDefaultState(), 8, 40, 65, 20);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_TITANIUM.get().getDefaultState(), 3, 0, 35, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_TUNGSTEN.get().getDefaultState(), 2, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_URANIUM.get().getDefaultState(), 1, 0, 20, 30);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_ZINC.get().getDefaultState(), 6, 25, 65, 10);
		
		// ADD GEM ORES
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_AMBER.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_AMETHYST.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_AQUAMARINE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_JADE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_MOONSTONE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_ONYX.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_OPALSTONE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_PAINITE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_PINKQUARTZ.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_RUBY.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_SAPPHIRE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_SUNSTONE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_TOPAZ.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_TURQUOISE.get().getDefaultState(), 1, 0, 60, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORE_ZIRCON.get().getDefaultState(), 1, 0, 60, 10);
	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest test, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
		event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(test, state, veinSize))
				.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().func_242731_b(amount));
	}
}
