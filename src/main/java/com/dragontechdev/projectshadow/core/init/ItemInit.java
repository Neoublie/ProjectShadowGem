package com.dragontechdev.projectshadow.core.init;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.items.gems.psItem_Base_Gem;
import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_BrassKnuckles;
import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_MithrilSword;
import com.dragontechdev.projectshadow.common.items.weapons.psItem_Weapon_SilverSword;
import com.dragontechdev.projectshadow.common.materials.psCustomArmorMaterial;
import com.dragontechdev.projectshadow.common.materials.psCustomToolMaterial;
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
	public static final RegistryObject<Item> PSITEM_INGOT_COPPER = ITEMS.register("psitem_ingot_copper", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
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
	
	// Armor
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHELMET = ITEMS.register("psitem_armor_divinghelmet", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGHARNESS = ITEMS.register("psitem_armor_divingharness", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_ARMOR_DIVINGFLIPPERS = ITEMS.register("psitem_armor_divingflippers", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("psitem_armor_mithril_helmet", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("psitem_armor_mithril_chestplate", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("psitem_armor_mithril_leggings",  () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("psitem_armor_mithril_boots", () -> new ArmorItem(psCustomArmorMaterial.MITHRIL, EquipmentSlotType.FEET, new Item.Properties().group(ProjectShadow.psCreativeTAB)));

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
	//public static final RegistryObject<psItem_Weapon_SilverSword> PSITEM_WEAPON_SILVER_SWORD = ITEMS.register("psitem_weapon_silver_sword", () -> new psItem_Weapon_SilverSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	//public static final RegistryObject<psItem_Weapon_MithrilSword> PSITEM_WEAPON_MITHRIL_SWORD = ITEMS.register("psitem_weapon_mithril_sword", () -> new psItem_Weapon_MithrilSword(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	
	//Converted to use Material
	public static final RegistryObject<Item> PSITEM_WEAPON_SILVER_SWORD = ITEMS.register("psitem_weapon_silver_sword", () -> new SwordItem(psCustomToolMaterial.SILVER, 5, -1f, new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	public static final RegistryObject<Item> PSITEM_WEAPON_MITHRIL_SWORD = ITEMS.register("psitem_weapon_mithril_sword", () -> new SwordItem(psCustomToolMaterial.MITHRIL, 5, -1f, new Item.Properties().group(ProjectShadow.psCreativeTAB)));
	

	
	// Block Items
	public static final RegistryObject<BlockItem> PSBLOCK_ORE_COPPER = ITEMS.register("psblock_ore_copper", () -> new BlockItem(BlockInit.ORE_COPPER.get(), new Item.Properties().group(ProjectShadow.psCreativeTAB)));
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
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_CHIPED = ITEMS.register("psitem_gem_amber_chiped", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psCreativeTAB), psEnum_Gem_Quality.CHIPPED));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_FLAWED = ITEMS.register("psitem_gem_amber_flawed", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psCreativeTAB), psEnum_Gem_Quality.FLAWED));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_NORMAL = ITEMS.register("psitem_gem_amber_normal", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psCreativeTAB), psEnum_Gem_Quality.NORMAL));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_FLAWLESS = ITEMS.register("psitem_gem_amber_flawless", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psCreativeTAB), psEnum_Gem_Quality.FLAWLESS));
	public static final RegistryObject<psItem_Base_Gem> PSITEM_GEM_AMBER_PERFECT = ITEMS.register("psitem_gem_amber_perfect", () -> new psItem_Base_Gem(new Item.Properties().group(ProjectShadow.psCreativeTAB), psEnum_Gem_Quality.PERFECT));
	
	public static final RegistryObject<Item> PSITEM_GEM_AMETHYST = ITEMS.register("psitem_gem_amethyst_chipped", () -> new Item(new Item.Properties().group(ProjectShadow.psCreativeTAB)));
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
		
	// Normal Gems
	
	// Flawless Gems
	
	// Perfect Gems
	
}
