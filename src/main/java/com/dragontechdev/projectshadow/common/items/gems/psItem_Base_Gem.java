package com.dragontechdev.projectshadow.common.items.gems;

import com.dragontechdev.projectshadow.common.items.psItem;
import com.dragontechdev.projectshadow.core.enums.psEnum_Gem_Quality;

import net.minecraft.item.ItemStack;

public class psItem_Base_Gem extends psItem {

	public psEnum_Gem_Quality quality = null;
	
	
	public psItem_Base_Gem(Properties prop, psEnum_Gem_Quality quality) {
		super(prop);
		this.quality = quality;
		
	}
	
	public psEnum_Gem_Quality getQuality()
	{
		return quality;
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {

		if (getQuality() == psEnum_Gem_Quality.FLAWLESS) {
			return true;
		};
		
		if (getQuality() == psEnum_Gem_Quality.PERFECT) {
			return true;
		};
	
		return false;
		//return super.hasEffect(stack);
	}
}
