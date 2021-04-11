package com.dragontechdev.projectshadow.common.blocks.machines;

import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class psBlock_Anvil extends Block {

	public psBlock_Anvil() {
		super(AbstractBlock.Properties.create(
				Material.IRON, 
				MaterialColor.GRAY)
				.hardnessAndResistance(15F)
				.sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.setRequiresTool()
				);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.ANVIL_TILE_ENTITY_TYPE.get().create();
	}
	
	
	
	
	
//	public static final DirectionProperty DIRECTION = DirectionProperty.create("direction", Direction.Plane.HORIZONTAL);
//	public static final BooleanProperty INVISIBLE = BooleanProperty.create("invisible");
//	protected static final VoxelShape BODY = Block.box(1, 0, 1, 15, 15, 15);
//	
//	public psBlock_Anvil(Properties prop) {
//		//super(prop);
//		super(AbstractBlock.Properties.of(Material.METAL)
//				//.hardnessAndResistance(2.0F, 5.0F)
//				.harvestTool(ToolType.PICKAXE)
//				.harvestLevel(1)
//				.noCollission() //.notSolid() ??
//				//.setOpaque(psBlock_Anvil::isntSolid)
//				//.setBlocksVision(psBlock_Anvil::isntSolid)
//		);
//	}
//	
//	private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos)
//	{
//		return false;
//	}
//	
//	@Override
//	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
//	{
//		return BODY;
//	}
//	
//	@Override
//	public boolean hasTileEntity(BlockState state)
//	{
//		return true;
//	}
//	
//	@Override
//	public TileEntity createTileEntity(BlockState state, IBlockReader world)
//	{
//		return new psTile_Anvil();
//	}
//	
//	//@Override
//	public BlockRenderType getRenderType(BlockState state)
//	{
//		return BlockRenderType.MODEL;
//	}
//	
//	//@Override
////	public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult)
////	{
////		if (world.isClientSide)
////			return ActionResultType.SUCCESS;
////
////		TileEntity tile = world.getBlockEntity(pos);
////		if (tile instanceof psTileEntity_Anvil)
////		{
////			// TODO No Connected Objects to look for
//////			if (((psTileEntity_Anvil) tile).isSlave())
//////			{
//////				NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) world.getTileEntity(((psTileEntity_Anvil) tile).getConnectedPos()), ((psTileEntity_Anvil) tile).getConnectedPos());
//////			} else
//////			{
////				NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tile, pos);
//////			}
////
////			return ActionResultType.SUCCESS;
////		}
////
//////			player.openGui(BloodMagic.instance, Constants.Gui.SOUL_FORGE_GUI, world, pos.getX(), pos.getY(), pos.getZ());
////
////		return ActionResultType.FAIL;
////	}
//
////	@Override
////	public BlockState getStateForPlacement(BlockItemUseContext context)
////	{
////		//return this.getDefaultState().with(DIRECTION, context.getPlacementHorizontalFacing());
////		return this.defaultBlockState().with(DIRECTION, context.getHorizontalDirection());
////	}
//
////	@Override
////	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
////	{
////		builder.add(DIRECTION, INVISIBLE);
////	}
//
////	@Override
////	public void onNeighborChange(BlockState state, IWorldReader world, BlockPos pos, BlockPos neighbor)
////	{
////		psTileEntity_Anvil tile = (psTileEntity_Anvil) world.getBlockEntity(pos);
////		if (tile != null)
////		{
////			BlockPos connectedPos = tile.getConnectedPos();
////			TileEntity connectedTile = world.getBlockEntity(connectedPos);
////			if (!(connectedTile instanceof psTileEntity_Anvil
////					&& ((psTileEntity_Anvil) connectedTile).getConnectedPos().equals(pos)))
////			{
////				this.onPlayerDestroy(tile.getLevel(), pos, state);
////				this.removedByPlayer(state, tile.getLevel(), pos, null, true, this.getFluidState(state));
////			}
////		}
////	}
//
////	@Override
////	public void onPlayerDestroy(IWorld world, BlockPos blockPos, BlockState blockState)
////	{
////		psTileEntity_Anvil forge = (psTileEntity_Anvil) world.getBlockEntity(blockPos);
////
////		if (forge != null)
////		{
////			forge..dropItems();
////		}
////
////		super.onPlayerDestroy(world, blockPos, blockState);
////	}
////
////	@Override
////	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
////	{
////		if (!state.is(newState.getBlock()))
////		{
////			TileEntity tileentity = worldIn.getBlockEntity(pos);
////			if (tileentity instanceof psTileEntity_Anvil && !((psTileEntity_Anvil) tileentity).isSlave())
////			{
////				((psTileEntity_Anvil) tileentity).dropItems();
////				worldIn.updateComparatorOutputLevel(pos, this);
////			}
////
////			super.onReplaced(state, worldIn, pos, newState, isMoving);
////		}
////	}
//
//	@Override
//	public Item asItem()
//	{
//		return ItemInit.PSBLOCK_ANVIL.get();
//	}


}
