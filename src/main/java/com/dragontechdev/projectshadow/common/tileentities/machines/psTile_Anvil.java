package com.dragontechdev.projectshadow.common.tileentities.machines;

import com.dragontechdev.projectshadow.ProjectShadow;
import com.dragontechdev.projectshadow.common.containers.psContainer_Anvil;
import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class psTile_Anvil extends LockableLootTileEntity {
	
	public static int slots = 1;
	protected NonNullList<ItemStack> items = NonNullList.withSize(slots, ItemStack.EMPTY);

	public psTile_Anvil(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public psTile_Anvil() {
		this(TileEntityTypeInit.ANVIL_TILE_ENTITY_TYPE.get());
	}

	@Override
	public int getSizeInventory() {
		return slots;
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.items;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> itemsIn) {
		this.items = itemsIn;
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container." + ProjectShadow.MOD_ID + ".psblock_anvil");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return new psContainer_Anvil(id, player, this);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT compound) {
		super.write(compound);
		if(!this.checkLootAndWrite(compound)) {
			ItemStackHelper.saveAllItems(compound, this.items);
		}
		
		return compound;
	}
	
	@Override
	public void read(BlockState state, CompoundNBT nbt) {
		super.read(state, nbt);
		this.items = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
		if (!this.checkLootAndRead(nbt)) {
			ItemStackHelper.loadAllItems(nbt, this.items);
		}
	}

}
