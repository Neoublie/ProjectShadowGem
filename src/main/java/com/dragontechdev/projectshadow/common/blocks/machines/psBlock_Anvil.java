package com.dragontechdev.projectshadow.common.blocks.machines;

import com.dragontechdev.projectshadow.common.blocks.psHorizontalBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class psBlock_Anvil extends psHorizontalBlock {

	//public static final DirectionProperty DIRECTION = DirectionProperty.create("direction", Direction.Plane.HORIZONTAL);
	
	public psBlock_Anvil(Properties prop) {
		//super(prop);
		super(AbstractBlock.Properties.of(Material.METAL)
				//.hardnessAndResistance(2.0F, 5.0F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.noCollission() //.notSolid() ??
				//.setOpaque(psBlock_Anvil::isntSolid)
				//.setBlocksVision(psBlock_Anvil::isntSolid)
		);
	}
	
	private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos)
	{
		return false;
	}

}
