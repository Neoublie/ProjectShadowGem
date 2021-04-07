package com.dragontechdev.projectshadow;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragontechdev.projectshadow.core.init.BlockInit;
import com.dragontechdev.projectshadow.core.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ProjectShadow.MOD_ID)
public class ProjectShadow
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "projectshadow";
    public static final String NAME = "Project Shadow: A Tail of Treasure and Thievery";

    public ProjectShadow() {
    	
    	IEventBus EventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	EventBus.addListener(this::setup);
    	
    	// Load Item Registry
    	ItemInit.ITEMS.register(EventBus);
    	
    	// Load Block Registry
    	BlockInit.BASICBLOCKS.register(EventBus);
    	BlockInit.BLOCKS.register(EventBus);
    	
    	
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
    
 // Custom ItemGroup TAB
 	public static final ItemGroup psCreativeTAB = new ItemGroup("projectshadowtab")
 	{
 		@Override
 		public ItemStack makeIcon()
 		{
 			return new ItemStack(Blocks.ACACIA_BUTTON.getBlock());
 			//return new ItemStack(BlockInit.BASICBLOCKS.ORE_JADE.getBlock());
 		}
 	};
 	
 	
}
