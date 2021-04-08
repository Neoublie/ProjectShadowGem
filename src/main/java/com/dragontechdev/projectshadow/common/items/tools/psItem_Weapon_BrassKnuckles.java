package com.dragontechdev.projectshadow.common.items.tools;

import java.util.List;

import com.dragontechdev.projectshadow.common.items.psItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class psItem_Weapon_BrassKnuckles extends psItem {

	public psItem_Weapon_BrassKnuckles(Properties prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, World world, List<ITextComponent> textcomponent,
			ITooltipFlag tooltipflag) {
		// TODO Auto-generated method stub
		super.appendHoverText(itemstack, world, textcomponent, tooltipflag);
		
		//textcomponent.add(new TranslationTextComponent("tooltip:psitem_weapon_steelsword_tooltip"));
		textcomponent.add(new StringTextComponent("Hold "+ "\u00A7e" + "Shift" + "\u00A77" + " for more information"));

		if(Screen.hasShiftDown()) {
			textcomponent.add(new StringTextComponent("Damage:" + "\u00A74" + "12dps"));
			textcomponent.add(new StringTextComponent("1 empty socket"));
		}
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		// TODO Auto-generated method stub
		player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 200, 5));
		return super.onLeftClickEntity(stack, player, entity);
		
	}	
}
