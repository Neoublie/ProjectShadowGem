package com.dragontechdev.projectshadow.common.blocks.machines;

import com.dragontechdev.projectshadow.common.blocks.psBlock;

import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;

public class psBlock_GrindStone extends psBlock {

	public static final DirectionProperty DIRECTION = DirectionProperty.create("direction", Direction.Plane.HORIZONTAL);
	
	public psBlock_GrindStone(Properties prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}

}
