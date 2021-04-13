package com.dragontechdev.projectshadow.common.materials;

import java.util.function.Supplier;

import com.dragontechdev.projectshadow.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum psCustomToolMaterial implements IItemTier {
	
	//=================================================================
	// TODO WORK ON BALANCED VALUES and decide what materials are valid
	//=================================================================
	BRASS(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_BRASS.get())),
	BRONZE(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_BRONZE.get())),
	CONSTANTAN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_CONSTANTAN.get())),
	COPPER(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_COPPER.get())),
	ELECTRUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_ELECTRUM.get())),
	HEMATITE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_HEMATITE.get())),
	LEAD(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_LEAD.get())),
	MITHRIL(4,4000,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_MITHRIL.get())),
	NICKEL(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_NICKEL.get())),
	PLATINUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_PLATINUM.get())),
	//RESTONE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_REDSTONE.get())),
	REFINED_NETHERITE(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_REFINED_NETHERITE.get())),
	SILVER(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_SILVER.get())),
	STEEL(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_STEEL.get())),
	TIN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TIN.get())),
	TITANIUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TITANIUM.get())),
	TUNGSTEN(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TUNGSTEN.get())),
	//URANIUM(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_URANIUM.get())),
	ZINC(4,40,15F,2F,17, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_ZINC.get()));

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
