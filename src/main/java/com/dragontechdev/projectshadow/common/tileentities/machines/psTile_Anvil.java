package com.dragontechdev.projectshadow.common.tileentities.machines;

import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class psTile_Anvil extends TileEntity implements ITickableTileEntity{

	public psTile_Anvil(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public psTile_Anvil() {
		this(TileEntityTypeInit.ANVIL_TILE_ENTITY_TYPE.get());
	}

	@Override
	public void tick() {
		//this.level.setBlockAndUpdate(getBlockPos(), Blocks.AIR.defaultBlockState());
	}
}
