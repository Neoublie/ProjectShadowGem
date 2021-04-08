package com.dragontechdev.projectshadow.common.items.tools;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import com.dragontechdev.projectshadow.common.items.psItem;

import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class psItem_Weapon_SteelSword extends SwordItem {
	
	public psItem_Weapon_SteelSword(Properties prop) {
		//super(tier, maxDamage, attackDamage, prop);
		super(ItemTier.DIAMOND, 20, -1.3F, prop);
		// TODO Auto-generated constructor stub
		
		//public static final Item DIAMOND_SWORD = registerItem("diamond_sword", new SwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
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
}
