package com.dragontechdev.projectshadow.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.items.tools.psItem_Weapon_BrassKnuckles;
import com.dragontechdev.projectshadow.common.items.tools.psItem_Weapon_MithrilSword;
import com.dragontechdev.projectshadow.common.items.tools.psItem_Weapon_SilverSword;

public class ItemInit {
		
	// DeferredRegistry Object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectShadow.MOD_ID);
		
	// Armor
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHELMET = ITEMS.register("psitem_armor_divinghelmet", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHARNESS = ITEMS.register("psitem_armor_divingharness", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGFLIPPERS = ITEMS.register("psitem_armor_divingflippers", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));

	// Amulets
	
	// Rings
	
	// Earrings
	
	// Buckles
	
	// Bracelets
	
	// Anklets
	
	// MISC
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGTANK = ITEMS.register("psitem_armor_divingtank", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	// Tools
	public static final RegistryObject<Item> PSITEM_TOOL_COPPERAXE = ITEMS.register("psitem_tool_copperaxe", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	//Weapons
	//public static final RegistryObject<Item> PSITEM_WEAPON_BRASS_KNUCKLES = ITEMS.register("psitem_weapon_brass_knuckles", () -> new Item(new Item.Properties().tab(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<psItem_Weapon_BrassKnuckles> PSITEM_WEAPON_BRASS_KNUCKLES = ITEMS.register("psitem_weapon_brass_knuckles", () -> new psItem_Weapon_BrassKnuckles(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<psItem_Weapon_SilverSword> PSITEM_WEAPON_SILVER_SWORD = ITEMS.register("psitem_weapon_silver_sword", () -> new psItem_Weapon_SilverSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<psItem_Weapon_MithrilSword> PSITEM_WEAPON_MITHRIL_SWORD = ITEMS.register("psitem_weapon_mithril_sword", () -> new psItem_Weapon_MithrilSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	
	
	// Ingots
	public static final RegistryObject<Item> PSITEM_INGOT_HEMATITE = ITEMS.register("psitem_ingot_hematite", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_LEAD = ITEMS.register("psitem_ingot_lead", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_MITHRIL = ITEMS.register("psitem_ingot_mithril", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_NICKEL = ITEMS.register("psitem_ingot_nickel", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_PLATINUM = ITEMS.register("psitem_ingot_platinum", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_SILVER = ITEMS.register("psitem_ingot_silver", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TIN = ITEMS.register("psitem_ingot_tin", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TITANIUM = ITEMS.register("psitem_ingot_titanium", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TUNGSTEN = ITEMS.register("psitem_ingot_tungsten", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_URANIUM = ITEMS.register("psitem_ingot_uranium", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_ZINC = ITEMS.register("psitem_ingot_zinc", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	// Alloy Ingots
	public static final RegistryObject<Item> PSITEM_INGOT_BRASS = ITEMS.register("psitem_ingot_brass", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_BRONZE = ITEMS.register("psitem_ingot_bronze", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_CONSTANTAN = ITEMS.register("psitem_ingot_constantan", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_ELECTRUM = ITEMS.register("psitem_ingot_electrum", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_REDSTONE = ITEMS.register("psitem_ingot_redstone", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_REFINED_NETHERITE = ITEMS.register("psitem_ingot_refined_netherite", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_STEEL = ITEMS.register("psitem_ingot_steel", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	// Block Items
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_HEMATITE = ITEMS.register("psblock_ore_hematite", () -> new BlockItem(BlockInit.ORE_HEMATITE.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));//ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_LEAD = ITEMS.register("psblock_ore_lead", () -> new BlockItem(BlockInit.ORE_LEAD.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_MITHRIL = ITEMS.register("psblock_ore_mithril", () -> new BlockItem(BlockInit.ORE_MITHRIL.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_NICKEL = ITEMS.register("psblock_ore_nickel", () -> new BlockItem(BlockInit.ORE_NICKEL.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_PLATINUM = ITEMS.register("psblock_ore_platinum", () -> new BlockItem(BlockInit.ORE_PLATINUM.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_SILVER = ITEMS.register("psblock_ore_silver", () -> new BlockItem(BlockInit.ORE_SILVER.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TIN = ITEMS.register("psblock_ore_tin", () -> new BlockItem(BlockInit.ORE_TIN.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TITANIUM = ITEMS.register("psblock_ore_titanium", () -> new BlockItem(BlockInit.ORE_TITANIUM.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TUNGSTEN = ITEMS.register("psblock_ore_tungsten", () -> new BlockItem(BlockInit.ORE_TUNGSTEN.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_URANIUM = ITEMS.register("psblock_ore_uranium", () -> new BlockItem(BlockInit.ORE_URANIUM.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_ZINC = ITEMS.register("psblock_ore_zinc", () -> new BlockItem(BlockInit.ORE_ZINC.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_DISPLAY_CASE = ITEMS.register("psblock_display_case", () -> new BlockItem(BlockInit.DISPLAY_CASE.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ANVIL = ITEMS.register("psblock_anvil", () -> new BlockItem(BlockInit.MACHINE_ANVIL.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_GRINDSTONE = ITEMS.register("psblock_grindstone", () -> new BlockItem(BlockInit.MACHINE_GRINDSTONE.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_JEWELLERSTABLE = ITEMS.register("psblock_jewellerstable", () -> new BlockItem(BlockInit.MACHINE_JEWELLERSTABLE.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_SMELTERY = ITEMS.register("psblock_smeltery", () -> new BlockItem(BlockInit.MACHINE_SMELTERY.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ALLOY_BRICK = ITEMS.register("psblock_alloy_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_ALLOY_BRICK.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_BRICK = ITEMS.register("psblock_blastfurnace_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_BRICK.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_HEARTH = ITEMS.register("psblock_blastfurnace_hearth", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_HEARTH.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_AIR_COMPRESSOR = ITEMS.register("psblock_air_compressor", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_HEARTH.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
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
