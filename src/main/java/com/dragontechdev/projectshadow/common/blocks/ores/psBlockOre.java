package com.dragontechdev.projectshadow.common.blocks.ores;

import com.dragontechdev.projectshadow.common.blocks.psBlock;

import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class psBlockOre extends psBlock{

	public psBlockOre(Properties prop) {
		super(prop);
		prop.harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE);
	}

}
