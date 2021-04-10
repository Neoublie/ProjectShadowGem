package com.dragontechdev.projectshadow.common.tileentities;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class psTileInventory extends psTileBase implements IInventory {
	
	protected int[] syncedSlots = new int[0];
	protected NonNullList<ItemStack> inventory;
	LazyOptional<IItemHandler> handlerDown;
	LazyOptional<IItemHandler> handlerUp;
	LazyOptional<IItemHandler> handlerNorth;
	LazyOptional<IItemHandler> handlerSouth;
	LazyOptional<IItemHandler> handlerWest;
	LazyOptional<IItemHandler> handlerEast;
	private int size;
	
	// IInventory
	private String name;
	
	public psTileInventory(TileEntityType<?> type, int size, String name)
	{
		super(type);
		this.inventory = NonNullList.withSize(size, ItemStack.EMPTY);
		this.size = size;
		this.name = name;
		initializeItemHandlers();
	}
	
	protected boolean isSyncedSlot(int slot)
	{
		for (int s : this.syncedSlots)
		{
			if (s == slot)
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public void deserialize(CompoundNBT tagCompound)
	{
		super.deserialize(tagCompound);

		this.inventory = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);

		ItemStackHelper.loadAllItems(tagCompound, this.inventory);

	}

	@Override
	public CompoundNBT serialize(CompoundNBT tagCompound)
	{
		super.serialize(tagCompound);

		ItemStackHelper.saveAllItems(tagCompound, this.inventory);

		return tagCompound;
	}

	public void dropItems()
	{
		InventoryHelper.dropContents(getLevel(), getBlockPos(), this);
	}

	@Override
	public int getContainerSize()
	{
		return size;
	}

	@Override
	public ItemStack getItem(int index)
	{
		return inventory.get(index);
	}

	@Override
	public ItemStack removeItem(int index, int count)
	{
		if (!getItem(index).isEmpty())
		{
			if (!getLevel().isClientSide())
				getLevel().sendBlockUpdated(getBlockPos(), getLevel().getBlockState(getBlockPos()), getLevel().getBlockState(getBlockPos()), 3);

			if (getItem(index).getCount() <= count)
			{
				ItemStack itemStack = inventory.get(index);
				inventory.set(index, ItemStack.EMPTY);
				setChanged();
				return itemStack;
			}

			ItemStack itemStack = inventory.get(index).split(count);
			setChanged();
			return itemStack;
		}

		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack removeItemNoUpdate(int slot)
	{
		if (!inventory.get(slot).isEmpty())
		{
			ItemStack itemStack = inventory.get(slot);
			setItem(slot, ItemStack.EMPTY);
			return itemStack;
		}
		return ItemStack.EMPTY;
	}

	@Override
	public void setItem(int slot, ItemStack stack)
	{
		inventory.set(slot, stack);
		if (!stack.isEmpty() && stack.getCount() > getMaxStackSize())
			stack.setCount(getMaxStackSize());
		setChanged();
		if (!getLevel().isClientSide())
			getLevel().sendBlockUpdated(getBlockPos(), getLevel().getBlockState(getBlockPos()), getLevel().getBlockState(getBlockPos()), 3);
	}

	@Override
	public int getMaxStackSize()
	{
		return 64;
	}

	@Override
	public void startOpen(PlayerEntity player)
	{

	}

	@Override
	public void stopOpen(PlayerEntity player)
	{

	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack)
	{
		return true;
	}

	@Override
	public void clearContent()
	{
		this.inventory = NonNullList.withSize(size, ItemStack.EMPTY);
	}

	@Override
	public boolean isEmpty()
	{
		for (ItemStack stack : inventory) if (!stack.isEmpty())
			return false;

		return true;
	}

	@Override
	public boolean stillValid(PlayerEntity player)
	{
		return true;
	}

	protected void initializeItemHandlers()
	{
		if (this instanceof ISidedInventory)
		{
			handlerDown = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.DOWN));
			handlerUp = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.UP));
			handlerNorth = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.NORTH));
			handlerSouth = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.SOUTH));
			handlerWest = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.WEST));
			handlerEast = LazyOptional.of(() -> new SidedInvWrapper((ISidedInventory) this, Direction.EAST));
		} else
		{
			handlerDown = LazyOptional.of(() -> new InvWrapper(this));
			handlerUp = handlerDown;
			handlerNorth = handlerDown;
			handlerSouth = handlerDown;
			handlerWest = handlerDown;
			handlerEast = handlerDown;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction facing)
	{
		if (facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			switch (facing)
			{
			case DOWN:
				return handlerDown.cast();
			case EAST:
				return handlerEast.cast();
			case NORTH:
				return handlerNorth.cast();
			case SOUTH:
				return handlerSouth.cast();
			case UP:
				return handlerUp.cast();
			case WEST:
				return handlerWest.cast();
			}
		} else if (facing == null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return handlerDown.cast();
		}

		return super.getCapability(capability, facing);
	}

}

