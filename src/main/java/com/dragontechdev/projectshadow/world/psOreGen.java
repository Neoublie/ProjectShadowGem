package com.dragontechdev.projectshadow.world;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.core.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

//@Mod.EventBusSubscriber(modid = ProjectShadow.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class psOreGen {
	
//	public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
//            "end_stone", new BlockMatcher(Blocks.END_STONE));
//
//    @SubscribeEvent
//    public static void generateOres(FMLLoadCompleteEvent event) {
//        for (Biome biome : ForgeRegistries.BIOMES) {
//
//            //Nether Generation
//            if (biome.getBiomeCategory() == Biome.Category.NETHER) {
//                genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.ORE_RUBY.get().getDefaultState(), 4);
//            //End Generation
//            } else if (biome.getBiomeCategory() == Biome.Category.THEEND) {
//                genOre(biome, 18, 3, 5, 80, END_STONE, BlockInit.ORE_RUBY.get().getDefaultState(), 12);
//            //World Generation
//            } else {
//                genOre(biome, 15, 8, 5, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ORE_RUBY.get().getDefaultState(), 6);
//            }
//        }
//    }
//
//    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
//        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
//        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
//        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
//        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
//    }
	

}
