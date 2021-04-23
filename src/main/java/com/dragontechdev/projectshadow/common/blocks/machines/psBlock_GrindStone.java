package com.dragontechdev.projectshadow.common.blocks.machines;

import java.util.stream.Stream;

import com.dragontechdev.projectshadow.common.blocks.psBlock;
import com.dragontechdev.projectshadow.common.tileentities.machines.psTile_Grindstone;
import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class psBlock_GrindStone extends psBlock {
	
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(4, 5, 7, 5, 8, 10),
			Block.makeCuboidShape(4, 1, 5, 5, 5, 12),
			Block.makeCuboidShape(4, 0, 4, 5, 1, 13),
			Block.makeCuboidShape(11, 5, 7, 12, 8, 10),
			Block.makeCuboidShape(10, 6, 8, 11, 7, 9),
			Block.makeCuboidShape(5, 6, 8, 6, 7, 9),
			Block.makeCuboidShape(11, 1, 5, 12, 5, 12),
			Block.makeCuboidShape(11, 0, 4, 12, 1, 13),
			Block.makeCuboidShape(6, 2, 4, 10, 11, 13)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(6.5, 5, 11.5, 9.5, 8, 12.5),
			Block.makeCuboidShape(4.5, 1, 11.5, 11.5, 5, 12.5),
			Block.makeCuboidShape(3.5, 0, 11.5, 12.5, 1, 12.5),
			Block.makeCuboidShape(6.5, 5, 4.5, 9.5, 8, 5.5),
			Block.makeCuboidShape(7.5, 6, 5.5, 8.5, 7, 6.5),
			Block.makeCuboidShape(7.5, 6, 10.5, 8.5, 7, 11.5),
			Block.makeCuboidShape(4.5, 1, 4.5, 11.5, 5, 5.5),
			Block.makeCuboidShape(3.5, 0, 4.5, 12.5, 1, 5.5),
			Block.makeCuboidShape(3.5, 2, 6.5, 12.5, 11, 10.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
			
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(11, 5, 7, 12, 8, 10),
			Block.makeCuboidShape(11, 1, 5, 12, 5, 12),
			Block.makeCuboidShape(11, 0, 4, 12, 1, 13),
			Block.makeCuboidShape(4, 5, 7, 5, 8, 10),
			Block.makeCuboidShape(5, 6, 8, 6, 7, 9),
			Block.makeCuboidShape(10, 6, 8, 11, 7, 9),
			Block.makeCuboidShape(4, 1, 5, 5, 5, 12),
			Block.makeCuboidShape(4, 0, 4, 5, 1, 13),
			Block.makeCuboidShape(6, 2, 4, 10, 11, 13)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(6.5, 5, 4.5, 9.5, 8, 5.5),
			Block.makeCuboidShape(4.5, 1, 4.5, 11.5, 5, 5.5),
			Block.makeCuboidShape(3.5, 0, 4.5, 12.5, 1, 5.5),
			Block.makeCuboidShape(6.5, 5, 11.5, 9.5, 8, 12.5),
			Block.makeCuboidShape(7.5, 6, 10.5, 8.5, 7, 11.5),
			Block.makeCuboidShape(7.5, 6, 5.5, 8.5, 7, 6.5),
			Block.makeCuboidShape(4.5, 1, 11.5, 11.5, 5, 12.5),
			Block.makeCuboidShape(3.5, 0, 11.5, 12.5, 1, 12.5),
			Block.makeCuboidShape(3.5, 2, 6.5, 12.5, 11, 10.5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
		
	public psBlock_GrindStone(Properties prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch(state.get(FACING)) {
		case EAST:
			return SHAPE_E;
		case SOUTH:
			return SHAPE_S;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}


	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}
	
	@Override
	public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
		return state.with(FACING, direction.rotate(state.get(FACING)));
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(FACING);
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.ANVIL_TILE_ENTITY_TYPE.get().create();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isRemote()) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof psTile_Grindstone) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (psTile_Grindstone) te, pos);
			}
		}
		return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}

}
