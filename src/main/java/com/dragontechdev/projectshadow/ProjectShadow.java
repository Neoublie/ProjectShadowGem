package com.dragontechdev.projectshadow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragontechdev.projectshadow.core.init.BlockInit;
import com.dragontechdev.projectshadow.core.init.ContainerTypeInit;
import com.dragontechdev.projectshadow.core.init.FeatureInit;
import com.dragontechdev.projectshadow.core.init.ItemInit;
import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
    	
    	// Load Block Registry
    	BlockInit.BASICBLOCKS.register(EventBus);
    	BlockInit.BLOCKS.register(EventBus);
    	
    	// Load Item Registry
    	ItemInit.ITEMS.register(EventBus);
    	
    	TileEntityTypeInit.TILE_ENTITY_TYPE.register(EventBus);
    	ContainerTypeInit.CONTAINER_TYPE.register(EventBus);
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
    
    
 	public static final ItemGroup psMainTAB = new ItemGroup("projectshadowtab")
 	{
 		@Override
 		public ItemStack createIcon()
 		{
 			return new ItemStack(ItemInit.PSITEM_TOOL_COPPER_PICKAXE.get());
 		}
 	};
    
 	public static final ItemGroup psGemsTAB = new ItemGroup("projectshadowtab")
 	{
 		@Override
 		public ItemStack createIcon()
 		{
 			return new ItemStack(ItemInit.PSITEM_GEM_AMBER_CHIPED.get());
 		}
 	};
}
