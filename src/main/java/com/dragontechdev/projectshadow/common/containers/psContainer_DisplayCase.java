package com.dragontechdev.projectshadow.common.containers;

import java.util.Objects;

import com.dragontechdev.projectshadow.common.tileentities.psTile_DisplayCase;
import com.dragontechdev.projectshadow.core.init.BlockInit;
import com.dragontechdev.projectshadow.core.init.ContainerTypeInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

public class psContainer_DisplayCase extends Container{

	public final psTile_DisplayCase te;
	private final IWorldPosCallable canInteractWithCallable;

	public psContainer_DisplayCase(final int windowId, final PlayerInventory playerInv, final psTile_DisplayCase te) {
		super(ContainerTypeInit.DISPLAY_CASE_CONTAINER_TYPE.get(), windowId);
		this.te = te;
		this.canInteractWithCallable = IWorldPosCallable.of(te.getWorld(), te.getPos());
		
		// Tile Entity
		this.addSlot(new Slot((IInventory) te, 0, 80, 35));
		
		// Main Player Inventory
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col <9; col++) {
				this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 166 - (4 - row) * 18 - 10));
			}
			
		}
	}
	
	public psContainer_DisplayCase(final int windowId, final PlayerInventory playerInv, final PacketBuffer data) {
		this(windowId, playerInv, getTileEntity(playerInv, data));
	}
	
	public static psTile_DisplayCase getTileEntity(final PlayerInventory playerInv, final PacketBuffer data)
	{
		Objects.requireNonNull(playerInv, "Player inventory cannot be null");
		Objects.requireNonNull(data, "Packet buffer cannot be null");
		final TileEntity te = playerInv.player.world.getTileEntity(data.readBlockPos());
		if (te instanceof psTile_DisplayCase ) {
			return (psTile_DisplayCase) te;
		}
		throw new IllegalStateException("Tile entity is not correct");		
	}
	
	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return isWithinUsableDistance(canInteractWithCallable, playerIn, BlockInit.DISPLAY_CASE.get());
	}
	
	@Override
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);
		if (slot != null && slot.getHasStack()) {
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			if (index < psTile_DisplayCase.slots && !this.mergeItemStack(stack1, psTile_DisplayCase.slots, this.inventorySlots.size(), true)) {
				return ItemStack.EMPTY;
			}
			
			if (!this.mergeItemStack(stack1, psTile_DisplayCase.slots, this.inventorySlots.size(), false)) {
				
			}
			
			if (stack1.isEmpty()) {
				slot.putStack(ItemStack.EMPTY);
			} else {
				slot.onSlotChanged();
			}
			
		}
		return stack;
		
	}
	

}
