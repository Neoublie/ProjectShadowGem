package com.dragontechdev.projectshadow.common.items.gems;

import java.util.List;

import com.dragontechdev.projectshadow.common.items.psItem;
import com.dragontechdev.projectshadow.core.enums.psEnum_Effects;
import com.dragontechdev.projectshadow.core.enums.psEnum_Gem_Quality;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class psItem_Base_Gem extends psItem {

	public psEnum_Gem_Quality quality = null;
	public psEnum_Effects effect = null;
	
	public psItem_Base_Gem(Properties prop, psEnum_Gem_Quality quality, psEnum_Effects effect) {
		super(prop);
		this.quality = quality;
		this.effect = effect;
	}
	
	public psEnum_Gem_Quality getQuality() { return quality; }
	
	public psEnum_Effects getEffect() { return effect; }
	
	public int getEffectPercentage(psEnum_Gem_Quality quality)
	{
		int base = 10; 
		switch (quality) {
		case CHIPPED :
			return base;
		case FLAWED :
			return base +10;
		case NORMAL :
			return base +15;
		case FLAWLESS :
			return base +20;
		case PERFECT :
			return base +30;
		default:
			return base;
		}
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		if (getQuality() == psEnum_Gem_Quality.FLAWLESS) { return true; };
		if (getQuality() == psEnum_Gem_Quality.PERFECT) { return true; };
		return false;
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack itemstack, World world, List<ITextComponent> textcomponent, ITooltipFlag tooltipflag) {
		// TODO Auto-generated method stub
		super.addInformation(itemstack, world, textcomponent, tooltipflag);
		
		//textcomponent.add(new TranslationTextComponent("tooltip:psitem_weapon_steelsword_tooltip"));
		textcomponent.add(new StringTextComponent("Hold "+ "\u00A7e" + "Shift" + "\u00A77" + " for more information"));

		if(Screen.hasShiftDown()) {
			textcomponent.add(new StringTextComponent("Effect:" + "\u00A74" + getEffect() + " " + getEffectPercentage(this.quality) +"%"));
		}
	}
	
}
