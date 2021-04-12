package com.dragontechdev.projectshadow.common.materials;

import java.util.function.Supplier;

import com.dragontechdev.projectshadow.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum psCustomToolMaterial implements IItemTier {
	
	//=================================================================
	// TODO WORK ON BALANCED VALUES and decide what materials are valid
	//=================================================================
	PSITEM_TOOL_BRASS(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_BRASS.get())),
	PSITEM_TOOL_BRONZE(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_BRONZE.get())),
	PSITEM_TOOL_CONSTANTAN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_CONSTANTAN.get())),
	PSITEM_TOOL_COPPER(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_COPPER.get())),
	PSITEM_TOOL_ELECTRUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_ELECTRUM.get())),
	PSITEM_TOOL_HEMATITE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_HEMATITE.get())),
	PSITEM_TOOL_LEAD(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_LEAD.get())),
	PSITEM_TOOL_MITHRIL(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_MITHRIL.get())),
	PSITEM_TOOL_NICKEL(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_NICKEL.get())),
	PSITEM_TOOL_PLATINUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_PLATINUM.get())),
	//PSITEM_TOOL_RESTONE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_REDSTONE.get())),
	PSITEM_TOOL_REFINED_NETHERITE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_REFINED_NETHERITE.get())),
	PSITEM_TOOL_SILVER(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_SILVER.get())),
	PSITEM_TOOL_STEEL(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_STEEL.get())),
	PSITEM_TOOL_TIN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TIN.get())),
	PSITEM_TOOL_TITANIUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TITANIUM.get())),
	PSITEM_TOOL_TUNGSTEN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TUNGSTEN.get())),
	//PSITEM_TOOL_URANIUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_URANIUM.get())),
	PSITEM_TOOL_ZINC(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_ZINC.get()));

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	psCustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getEnchantability() {
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial;
	}
	
}
