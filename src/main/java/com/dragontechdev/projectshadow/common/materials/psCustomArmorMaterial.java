package com.dragontechdev.projectshadow.common.materials;

import java.util.function.Supplier;

import com.dragontechdev.projectshadow.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum psCustomArmorMaterial implements IArmorMaterial {

	//=================================================================
	// TODO WORK ON BALANCED VALUES
	//=================================================================
	BRONZE("bronze", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_BRONZE.get())),
	CONSTANTAN("constantan", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_CONSTANTAN.get())),
	ELECTRUM("electrum", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_ELECTRUM.get())),
	HEMATITE("hematite", 6, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_HEMATITE.get())),
	MITHRIL("mithril", 10, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_MITHRIL.get())),
	PLATNINUM("platinum", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_PLATINUM.get())),
	REFINED_NETHERITE("refined_netherite", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_REFINED_NETHERITE.get())),
	SILVER("silver", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_MITHRIL.get())),
	STEEL("steel", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_STEEL.get())),
	TITANIUM("titanium", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TITANIUM.get()));
	// Might not be useful armor material
	//TUNSTEN("tungsten", 9, new int[] {4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.fromItems(ItemInit.PSITEM_INGOT_TUNGSTEN.get()));
	
	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;
		
	psCustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability,
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}	
	
	@Override
	public int getDurability(EquipmentSlotType slot) {
		return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
