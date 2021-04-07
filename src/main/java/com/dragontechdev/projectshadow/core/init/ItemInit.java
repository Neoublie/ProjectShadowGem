package com.dragontechdev.projectshadow.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.dragontechdev.projectshadow.ProjectShadow;

public class ItemInit {

	// Tools
//	public static final Item copperHammer = new Item(defaultBuilder());
			
	// Ingots
//	public static final Item hematiteIngot = new Item(defaultBuilder());
//	public static final Item leadIngot = new Item(defaultBuilder());
//	public static final Item mithrilIngot = new Item(defaultBuilder());
//	public static final Item nickelIngot = new Item(defaultBuilder());
//	public static final Item platinumIngot = new Item(defaultBuilder());
//	public static final Item silverIngot = new Item(defaultBuilder());
//	public static final Item tinIngot = new Item(defaultBuilder());
//	public static final Item titaniumIngot = new Item(defaultBuilder());
//	public static final Item tungstenIngot = new Item(defaultBuilder());
//	public static final Item uraniumIngot = new Item(defaultBuilder());
//	public static final Item zincIngot = new Item(defaultBuilder());
	
	// Alloy Ingots
//	public static final Item bronzeIngot = new Item(defaultBuilder());
//	public static final Item steelIngot = new Item(defaultBuilder());

	
	// Misc Gems
//	public static final Item pearlGem = new Item(defaultBuilder());
	
	// Weapons
	
	// Armor
	
	// Amulets
	
	// Rings
	
	// Earrings
	
	// Buckles
	
	// Bracelets
	
	// Ancklets
	
	// MISC
//	public static final Item HerodricCube = new Item(defaultBuilder());
	
	
	
	
	// DeferredRegistry Object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectShadow.MOD_ID);
	
	// Items
	public static final RegistryObject<Item> PSITEM_COPPERAXE = ITEMS.register("psitem_copperaxe", () -> new Item(new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	
	// Block Items
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_HEMATITE = ITEMS.register("psblock_ore_hematite", () -> new BlockItem(BlockInit.ORE_HEMATITE.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));//ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_LEAD = ITEMS.register("psblock_ore_lead", () -> new BlockItem(BlockInit.ORE_LEAD.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_MITHRIL = ITEMS.register("psblock_ore_mithril", () -> new BlockItem(BlockInit.ORE_MITHRIL.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_NICKEL = ITEMS.register("psblock_ore_nickel", () -> new BlockItem(BlockInit.ORE_NICKEL.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_PLATINUM = ITEMS.register("psblock_ore_platinum", () -> new BlockItem(BlockInit.ORE_PLATINUM.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_SILVER = ITEMS.register("psblock_ore_silver", () -> new BlockItem(BlockInit.ORE_SILVER.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TIN = ITEMS.register("psblock_ore_tin", () -> new BlockItem(BlockInit.ORE_TIN.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TITANIUM = ITEMS.register("psblock_ore_titanium", () -> new BlockItem(BlockInit.ORE_TITANIUM.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TUNGSTEN = ITEMS.register("psblock_ore_tungsten", () -> new BlockItem(BlockInit.ORE_TUNGSTEN.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_URANIUM = ITEMS.register("psblock_ore_uranium", () -> new BlockItem(BlockInit.ORE_URANIUM.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_ZINC = ITEMS.register("psblock_ore_zinc", () -> new BlockItem(BlockInit.ORE_ZINC.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ANVIL = ITEMS.register("psblock_anvil", () -> new BlockItem(BlockInit.MACHINE_ANVIL.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_GRINDSTONE = ITEMS.register("psblock_grindstone", () -> new BlockItem(BlockInit.MACHINE_GRINDSTONE.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_JEWELLERSTABLE = ITEMS.register("psblock_jewellerstable", () -> new BlockItem(BlockInit.MACHINE_JEWELLERSTABLE.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_SMELTERY = ITEMS.register("psblock_smeltery", () -> new BlockItem(BlockInit.MACHINE_SMELTERY.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ALLOY_BRICK = ITEMS.register("psblock_alloy_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_ALLOY_BRICK.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_BRICK = ITEMS.register("psblock_blastfurnace_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_BRICK.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_HEARTH = ITEMS.register("psblock_blastfurnace_hearth", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_HEARTH.get(), new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	
	// Chipped Gems
//	public static final Item amberChippedGem = new Item(defaultBuilder());
//	public static final Item amethystChippedGem = new Item(defaultBuilder());
//	public static final Item aquamarineChippedGem = new Item(defaultBuilder());
//	public static final Item jadeChippedGem = new Item(defaultBuilder());
//	public static final Item moonstoneChippedGem = new Item(defaultBuilder());
//	public static final Item onyxChippedGem = new Item(defaultBuilder());
//	public static final Item opalstoneChippedGem = new Item(defaultBuilder());
//	public static final Item painiteChippedGem = new Item(defaultBuilder());
//	public static final Item pinkquartzChippedGem = new Item(defaultBuilder());
//	public static final Item rubyChippedGem = new Item(defaultBuilder());
//	public static final Item sapphireChippedGem = new Item(defaultBuilder());
//	public static final Item sunstoneChippedGem = new Item(defaultBuilder());
//	public static final Item topazChippedGem = new Item(defaultBuilder());
//	public static final Item turquoiseChippedGem = new Item(defaultBuilder());
//	public static final Item zirconChippedGem = new Item(defaultBuilder());

	// Flawed Gems
//	public static final Item amberFlawedGem = new Item(defaultBuilder());
//	public static final Item amethystFlawedGem = new Item(defaultBuilder());
//	public static final Item aquamarineFlawedGem = new Item(defaultBuilder());
//	public static final Item jadeFlawedGem = new Item(defaultBuilder());
//	public static final Item moonstoneFlawedGem = new Item(defaultBuilder());
//	public static final Item onyxFlawedGem = new Item(defaultBuilder());
//	public static final Item opalstoneFlawedGem = new Item(defaultBuilder());
//	public static final Item painiteFlawedGem = new Item(defaultBuilder());
//	public static final Item pinkquartzFlawedGem = new Item(defaultBuilder());
//	public static final Item rubyFlawedGem = new Item(defaultBuilder());
//	public static final Item sapphireFlawedGem = new Item(defaultBuilder());
//	public static final Item sunstoneFlawedGem = new Item(defaultBuilder());
//	public static final Item topazFlawedGem = new Item(defaultBuilder());
//	public static final Item turquoiseFlawedGem = new Item(defaultBuilder());
//	public static final Item zirconFlawedGem = new Item(defaultBuilder());
	
	// Normal Gems
//	public static final Item amberNormalGem = new Item(defaultBuilder());
//	public static final Item amethystNormalGem = new Item(defaultBuilder());
//	public static final Item aquamarineNormalGem = new Item(defaultBuilder());
//	public static final Item jadeNormalGem = new Item(defaultBuilder());
//	public static final Item moonstoneNormalGem = new Item(defaultBuilder());
//	public static final Item onyxNormalGem = new Item(defaultBuilder());
//	public static final Item opalstoneNormalGem = new Item(defaultBuilder());
//	public static final Item painiteNormalGem = new Item(defaultBuilder());
//	public static final Item pinkquartzNormalGem = new Item(defaultBuilder());
//	public static final Item rubyNormalGem = new Item(defaultBuilder());
//	public static final Item sapphireNormalGem = new Item(defaultBuilder());
//	public static final Item sunstoneNormalGem = new Item(defaultBuilder());
//	public static final Item topazNormalGem = new Item(defaultBuilder());
//	public static final Item turquoiseNormalGem = new Item(defaultBuilder());
//	public static final Item zirconNormalGem = new Item(defaultBuilder());
	
	// Flawless Gems
//	public static final Item amberFlawlessGem = new Item(defaultBuilder());
//	public static final Item amethystFlawlessGem = new Item(defaultBuilder());
//	public static final Item aquamarineFlawlessGem = new Item(defaultBuilder());
//	public static final Item jadeFlawlessGem = new Item(defaultBuilder());
//	public static final Item moonstoneFlawlessGem = new Item(defaultBuilder());
//	public static final Item onyxFlawlessGem = new Item(defaultBuilder());
//	public static final Item opalstoneFlawlessGem = new Item(defaultBuilder());
//	public static final Item painiteFlawlessGem = new Item(defaultBuilder());
//	public static final Item pinkquartzFlawlessGem = new Item(defaultBuilder());
//	public static final Item rubyFlawlessGem = new Item(defaultBuilder());
//	public static final Item sapphireFlawlessGem = new Item(defaultBuilder());
//	public static final Item sunstoneFlawlessGem = new Item(defaultBuilder());
//	public static final Item topazFlawlessGem = new Item(defaultBuilder());
//	public static final Item turquoiseFlawlessGem = new Item(defaultBuilder());
//	public static final Item zirconFlawlessGem = new Item(defaultBuilder());
	
	// Perfect Gems
//	public static final Item amberPerfectGem = new Item(defaultBuilder());
//	public static final Item amethystPerfectGem = new Item(defaultBuilder());
//	public static final Item aquamarinePerfectGem = new Item(defaultBuilder());
//	public static final Item jadePerfectGem = new Item(defaultBuilder());
//	public static final Item moonstonePerfectGem = new Item(defaultBuilder());
//	public static final Item onyxPerfectGem = new Item(defaultBuilder());
//	public static final Item opalstonePerfectGem = new Item(defaultBuilder());
//	public static final Item painitePerfectGem = new Item(defaultBuilder());
//	public static final Item pinkquartzPerfectGem = new Item(defaultBuilder());
//	public static final Item rubyPerfectGem = new Item(defaultBuilder());
//	public static final Item sapphirePerfectGem = new Item(defaultBuilder());
//	public static final Item sunstonePerfectGem = new Item(defaultBuilder());
//	public static final Item topazPerfectGem = new Item(defaultBuilder());
//	public static final Item turquoisePerfectGem = new Item(defaultBuilder());
//	public static final Item zirconPerfectGem = new Item(defaultBuilder());
	
}
