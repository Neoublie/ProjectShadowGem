package com.dragontechdev.projectshadow.core.init;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.items.gems.psItem_Base_Gem;
import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_BrassKnuckles;
//import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_MithrilSword;
//import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_SilverSword;
import com.dragontechdev.projectshadow.common.materials.psCustomArmorMaterial;
import com.dragontechdev.projectshadow.common.materials.psCustomToolMaterial;
import com.dragontechdev.projectshadow.core.enums.psEnum_Effects;
import com.dragontechdev.projectshadow.core.enums.psEnum_Gem_Quality;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
		
	// DeferredRegistry Object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectShadow.MOD_ID);

	// Ingots
	public static final RegistryObject<Item> PSITEM_INGOT_COPPER = ITEMS.register("psitem_ingot_copper", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_HEMATITE = ITEMS.register("psitem_ingot_hematite", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_LEAD = ITEMS.register("psitem_ingot_lead", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_MITHRIL = ITEMS.register("psitem_ingot_mithril", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_NICKEL = ITEMS.register("psitem_ingot_nickel", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_PLATINUM = ITEMS.register("psitem_ingot_platinum", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_SILVER = ITEMS.register("psitem_ingot_silver", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TIN = ITEMS.register("psitem_ingot_tin", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TITANIUM = ITEMS.register("psitem_ingot_titanium", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_TUNGSTEN = ITEMS.register("psitem_ingot_tungsten", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_URANIUM = ITEMS.register("psitem_ingot_uranium", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_ZINC = ITEMS.register("psitem_ingot_zinc", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Alloy Ingots
	public static final RegistryObject<Item> PSITEM_INGOT_BRASS = ITEMS.register("psitem_ingot_brass", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_BRONZE = ITEMS.register("psitem_ingot_bronze", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_CONSTANTAN = ITEMS.register("psitem_ingot_constantan", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_ELECTRUM = ITEMS.register("psitem_ingot_electrum", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_REDSTONE = ITEMS.register("psitem_ingot_redstone", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_REFINED_NETHERITE = ITEMS.register("psitem_ingot_refined_netherite", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_INGOT_STEEL = ITEMS.register("psitem_ingot_steel", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Armor
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHELMET = ITEMS.register("psitem_armor_divinghelmet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHARNESS = ITEMS.register("psitem_armor_divingharness", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGFLIPPERS = ITEMS.register("psitem_armor_divingflippers", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	public static final RegistryObject<Item> PSITEM_MITHRIL_HELMET = ITEMS.register("psitem_armor_mithril_helmet", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_CHESTPLATE = ITEMS.register("psitem_armor_mithril_chestplate", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_LEGGINGS = ITEMS.register("psitem_armor_mithril_leggings",  () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_BOOTS = ITEMS.register("psitem_armor_mithril_boots", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.FEET, new Item.Properties().group(ProjectShadow.psMainTAB)));

	// Amulets
	public static final RegistryObject<Item> PSITEM_SILVER_AMULET = ITEMS.register("psitem_silver_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_AMULET = ITEMS.register("psitem_gold_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_AMULET = ITEMS.register("psitem_mithril_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_AMULET = ITEMS.register("psitem_platinum_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_AMULET = ITEMS.register("psitem_titanium_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_AMULET = ITEMS.register("psitem_reinforced_netherite_amulet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Rings
	public static final RegistryObject<Item> PSITEM_SILVER_RING = ITEMS.register("psitem_silver_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_RING = ITEMS.register("psitem_gold_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_RING = ITEMS.register("psitem_mithril_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_RING = ITEMS.register("psitem_platinum_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_RING = ITEMS.register("psitem_titanium_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_RING = ITEMS.register("psitem_reinforced_netherite_ring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Earrings
	public static final RegistryObject<Item> PSITEM_SILVER_EARRING = ITEMS.register("psitem_silver_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_EARRING = ITEMS.register("psitem_gold_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_EARRING = ITEMS.register("psitem_mithril_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_EARRING = ITEMS.register("psitem_platinum_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_EARRING = ITEMS.register("psitem_titanium_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_EARRING = ITEMS.register("psitem_reinforced_netherite_earring", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));	

	// Buckles
	public static final RegistryObject<Item> PSITEM_SILVER_BUCKLE = ITEMS.register("psitem_silver_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_BUCKLE = ITEMS.register("psitem_gold_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_BUCKLE = ITEMS.register("psitem_mithril_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_BUCKLE = ITEMS.register("psitem_platinum_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_BUCKLE = ITEMS.register("psitem_titanium_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_BUCKLE = ITEMS.register("psitem_reinforced_netherite_buckle", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Bracelets
	public static final RegistryObject<Item> PSITEM_SILVER_BRACELET = ITEMS.register("psitem_silver_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_BRACELET = ITEMS.register("psitem_gold_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_BRACELET = ITEMS.register("psitem_mithril_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_BRACELET = ITEMS.register("psitem_platinum_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_BRACELET = ITEMS.register("psitem_titanium_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_BRACELET = ITEMS.register("psitem_reinforced_netherite_bracelet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Anklets
	public static final RegistryObject<Item> PSITEM_SILVER_ANKLET = ITEMS.register("psitem_silver_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_GOLD_ANKLET = ITEMS.register("psitem_gold_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_MITHRIL_ANKLET = ITEMS.register("psitem_mithril_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_PLATINUM_ANKLET = ITEMS.register("psitem_platinum_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TITANIUM_ANKLET = ITEMS.register("psitem_titanium_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_REINFORED_NETHERITE_ANKLET = ITEMS.register("psitem_reinforced_netherite_anklet", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// MISC
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGTANK = ITEMS.register("psitem_armor_divingtank", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Tools
	public static final RegistryObject<Item> PSITEM_TOOL_COPPER_AXE = ITEMS.register("psitem_tool_copper_axe", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_TOOL_COPPER_PICKAXE = ITEMS.register("psitem_tool_copper_pickaxe", () -> new Item(new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	//Weapons
	public static final RegistryObject<psItem_Weapon_BrassKnuckles> PSITEM_WEAPON_BRASS_KNUCKLES = ITEMS.register("psitem_weapon_brass_knuckles", () -> new psItem_Weapon_BrassKnuckles(new Item.Properties().group(ProjectShadow.psMainTAB)));
	//public static final RegistryObject<psItem_Weapon_SilverSword> PSITEM_WEAPON_SILVER_SWORD = ITEMS.register("psitem_weapon_silver_sword", () -> new psItem_Weapon_SilverSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	//public static final RegistryObject<psItem_Weapon_MithrilSword> PSITEM_WEAPON_MITHRIL_SWORD = ITEMS.register("psitem_weapon_mithril_sword", () -> new psItem_Weapon_MithrilSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	//Converted to use Material
	public static final RegistryObject<Item> PSITEM_WEAPON_SILVER_SWORD = ITEMS.register("psitem_weapon_silver_sword", () -> new SwordItem(psCustomToolMaterial.SILVER, 5, -1f, new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<Item> PSITEM_WEAPON_MITHRIL_SWORD = ITEMS.register("psitem_weapon_mithril_sword", () -> new SwordItem(psCustomToolMaterial.MITHRIL, 5, -1f, new Item.Properties().group(ProjectShadow.psMainTAB)));

	// Block Items
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_COPPER = ITEMS.register("psblock_ore_copper", () -> new BlockItem(BlockInit.ORE_COPPER.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_HEMATITE = ITEMS.register("psblock_ore_hematite", () -> new BlockItem(BlockInit.ORE_HEMATITE.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));//ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_LEAD = ITEMS.register("psblock_ore_lead", () -> new BlockItem(BlockInit.ORE_LEAD.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_MITHRIL = ITEMS.register("psblock_ore_mithril", () -> new BlockItem(BlockInit.ORE_MITHRIL.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_NICKEL = ITEMS.register("psblock_ore_nickel", () -> new BlockItem(BlockInit.ORE_NICKEL.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_PLATINUM = ITEMS.register("psblock_ore_platinum", () -> new BlockItem(BlockInit.ORE_PLATINUM.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_SILVER = ITEMS.register("psblock_ore_silver", () -> new BlockItem(BlockInit.ORE_SILVER.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TIN = ITEMS.register("psblock_ore_tin", () -> new BlockItem(BlockInit.ORE_TIN.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TITANIUM = ITEMS.register("psblock_ore_titanium", () -> new BlockItem(BlockInit.ORE_TITANIUM.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_TUNGSTEN = ITEMS.register("psblock_ore_tungsten", () -> new BlockItem(BlockInit.ORE_TUNGSTEN.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_URANIUM = ITEMS.register("psblock_ore_uranium", () -> new BlockItem(BlockInit.ORE_URANIUM.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_ZINC = ITEMS.register("psblock_ore_zinc", () -> new BlockItem(BlockInit.ORE_ZINC.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_DISPLAY_CASE = ITEMS.register("psblock_display_case", () -> new BlockItem(BlockInit.DISPLAY_CASE.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ANVIL = ITEMS.register("psblock_anvil", () -> new BlockItem(BlockInit.MACHINE_ANVIL.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_GRINDSTONE = ITEMS.register("psblock_grindstone", () -> new BlockItem(BlockInit.MACHINE_GRINDSTONE.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_JEWELLERSTABLE = ITEMS.register("psblock_jewellerstable", () -> new BlockItem(BlockInit.MACHINE_JEWELLERSTABLE.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_SMELTERY = ITEMS.register("psblock_smeltery", () -> new BlockItem(BlockInit.MACHINE_SMELTERY.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_ALLOY_BRICK = ITEMS.register("psblock_alloy_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_ALLOY_BRICK.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_BRICK = ITEMS.register("psblock_blastfurnace_brick", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_BRICK.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	public static final RegistryObject<BlockItem> PSBLOCK_BLASTFURNACE_HEARTH = ITEMS.register("psblock_blastfurnace_hearth", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_HEARTH.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	public static final RegistryObject<BlockItem> PSBLOCK_AIR_COMPRESSOR = ITEMS.register("psblock_air_compressor", () -> new BlockItem(BlockInit.MULTIBLOCK_BLASTFURNACE_HEARTH.get(), new Item.Properties().group(ProjectShadow.psMainTAB)));
	
	// Chipped Gems
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_CHIPED = ITEMS.register("psitem_gem_amber_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.FLAME_RESIST));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_FLAWED = ITEMS.register("psitem_gem_amber_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.FLAME_RESIST));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_NORMAL = ITEMS.register("psitem_gem_amber_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.FLAME_RESIST));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_FLAWLESS = ITEMS.register("psitem_gem_amber_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.FLAME_RESIST));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_PERFECT = ITEMS.register("psitem_gem_amber_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.FLAME_RESIST));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMETHYST_CHIPPED = ITEMS.register("psitem_gem_amethyst_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.BRAWLER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMETHYST_FLAWED = ITEMS.register("psitem_gem_amethyst_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.BRAWLER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMETHYST_NORMAL = ITEMS.register("psitem_gem_amethyst_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.BRAWLER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMETHYST_FLAWLESS = ITEMS.register("psitem_gem_amethyst_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.BRAWLER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMETHYST_PERFECT = ITEMS.register("psitem_gem_amethyst_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.BRAWLER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AQUAMARINE_CHIPED = ITEMS.register("psitem_gem_aquamarine_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.CLOUD_WALKING));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AQUAMARINE_FLAWED = ITEMS.register("psitem_gem_aquamarine_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.CLOUD_WALKING));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AQUAMARINE_NORMAL = ITEMS.register("psitem_gem_aquamarine_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.CLOUD_WALKING));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AQUAMARINE_FLAWLESS = ITEMS.register("psitem_gem_aquamarine_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.CLOUD_WALKING));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AQUAMARINE_PERFECT = ITEMS.register("psitem_gem_aquamarine_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.CLOUD_WALKING));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_JADE_CHIPED = ITEMS.register("psitem_gem_jade_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_JADE_FLAWED = ITEMS.register("psitem_gem_jade_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_JADE_NORMAL = ITEMS.register("psitem_gem_jade_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_JADE_FLAWLESS = ITEMS.register("psitem_gem_jade_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_JADE_PERFECT = ITEMS.register("psitem_gem_jade_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));

	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_MOONSTONE_CHIPED = ITEMS.register("psitem_gem_moonstone_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_MOONSTONE_FLAWED = ITEMS.register("psitem_gem_moonstone_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_MOONSTONE_NORMAL = ITEMS.register("psitem_gem_moonstone_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_MOONSTONE_FLAWLESS = ITEMS.register("psitem_gem_moonstone_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_MOONSTONE_PERFECT = ITEMS.register("psitem_gem_moonstone_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ONYX_CHIPED = ITEMS.register("psitem_gem_onyx_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ONYX_FLAWED = ITEMS.register("psitem_gem_onyx_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ONYX_NORMAL = ITEMS.register("psitem_gem_onyx_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ONYX_FLAWLESS = ITEMS.register("psitem_gem_onyx_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ONYX_PERFECT = ITEMS.register("psitem_gem_onyx_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));

	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_OPALSTONE_CHIPED = ITEMS.register("psitem_gem_opalstone_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_OPALSTONE_FLAWED = ITEMS.register("psitem_gem_opalstone_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_OPALSTONE_NORMAL = ITEMS.register("psitem_gem_opalstone_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_OPALSTONE_FLAWLESS = ITEMS.register("psitem_gem_opalstone_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_OPALSTONE_PERFECT = ITEMS.register("psitem_gem_opalstone_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PAINITE_CHIPED = ITEMS.register("psitem_gem_painite_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PAINITE_FLAWED = ITEMS.register("psitem_gem_painite_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PAINITE_NORMAL = ITEMS.register("psitem_gem_painite_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PAINITE_FLAWLESS = ITEMS.register("psitem_gem_painite_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PAINITE_PERFECT = ITEMS.register("psitem_gem_painite_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PINKQUARTZ_CHIPED = ITEMS.register("psitem_gem_pinkquartz_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PINKQUARTZ_FLAWED = ITEMS.register("psitem_gem_pinkquartz_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PINKQUARTZ_NORMAL = ITEMS.register("psitem_gem_pinkquartz_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PINKQUARTZ_FLAWLESS = ITEMS.register("psitem_gem_pinkquartz_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_PINKQUARTZ_PERFECT = ITEMS.register("psitem_gem_pinkquartz_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_RUBY_CHIPED = ITEMS.register("psitem_gem_ruby_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_RUBY_FLAWED = ITEMS.register("psitem_gem_ruby_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_RUBY_NORMAL = ITEMS.register("psitem_gem_ruby_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_RUBY_FLAWLESS = ITEMS.register("psitem_gem_ruby_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_RUBY_PERFECT = ITEMS.register("psitem_gem_ruby_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));

	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SAPPHIRE_CHIPED = ITEMS.register("psitem_gem_sapphire_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SAPPHIRE_FLAWED = ITEMS.register("psitem_gem_sapphire_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SAPPHIRE_NORMAL = ITEMS.register("psitem_gem_sapphire_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SAPPHIRE_FLAWLESS = ITEMS.register("psitem_gem_sapphire_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SAPPHIRE_PERFECT = ITEMS.register("psitem_gem_sapphire_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SUNSTONE_CHIPED = ITEMS.register("psitem_gem_sunstone_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SUNSTONE_FLAWED = ITEMS.register("psitem_gem_sunstone_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SUNSTONE_NORMAL = ITEMS.register("psitem_gem_sunstone_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SUNSTONE_FLAWLESS = ITEMS.register("psitem_gem_sunstone_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_SUNSTONE_PERFECT = ITEMS.register("psitem_gem_sunstone_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TOPAZ_CHIPED = ITEMS.register("psitem_gem_topaz_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TOPAZ_FLAWED = ITEMS.register("psitem_gem_topaz_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TOPAZ_NORMAL = ITEMS.register("psitem_gem_topaz_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TOPAZ_FLAWLESS = ITEMS.register("psitem_gem_topaz_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TOPAZ_PERFECT = ITEMS.register("psitem_gem_topaz_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
	
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TURQUOISE_CHIPED = ITEMS.register("psitem_gem_turquoise_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TURQUOISE_FLAWED = ITEMS.register("psitem_gem_turquoise_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TURQUOISE_NORMAL = ITEMS.register("psitem_gem_turquoise_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TURQUOISE_FLAWLESS = ITEMS.register("psitem_gem_turquoise_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_TURQUOISE_PERFECT = ITEMS.register("psitem_gem_turquoise_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));

	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ZIRCON_CHIPED = ITEMS.register("psitem_gem_zircon_chipped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.CHIPPED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ZIRCON_FLAWED = ITEMS.register("psitem_gem_zircon_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWED, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ZIRCON_NORMAL = ITEMS.register("psitem_gem_zircon_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.NORMAL, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ZIRCON_FLAWLESS = ITEMS.register("psitem_gem_zircon_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.FLAWLESS, psEnum_Effects.LOOT_FINDER));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_ZIRCON_PERFECT = ITEMS.register("psitem_gem_zircon_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psGemsTAB), psEnum_Gem_Quality.PERFECT, psEnum_Effects.LOOT_FINDER));
}
