package com.dragontechdev.projectshadow.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

public class psHorizontalBlock extends psBlock {
	
	public static final DirectionProperty DIRECTION = DirectionProperty.create("direction", Direction.Plane.HORIZONTAL);
	public static final BooleanProperty INVISIBLE = BooleanProperty.create("invisible");
	protected static final VoxelShape BODY = Block.box(1, 0, 1, 15, 15, 15);
	

	public psHorizontalBlock(Properties prop) {
		super(prop);
	}

}
