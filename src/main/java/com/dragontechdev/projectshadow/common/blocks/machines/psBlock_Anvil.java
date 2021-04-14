package com.dragontechdev.projectshadow.common.blocks.machines;

import java.util.stream.Stream;

import com.dragontechdev.projectshadow.common.tileentities.machines.psTile_Anvil;
import com.dragontechdev.projectshadow.core.init.TileEntityTypeInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
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
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class psBlock_Anvil extends Block {
	
public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	
	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(4, 0, 4, 12, 1, 14),
			Block.makeCuboidShape(5, 1, 6, 11, 2, 12),
			Block.makeCuboidShape(6, 2, 7, 10, 4, 11),
			Block.makeCuboidShape(6, 4, 5, 10, 6, 13),
			Block.makeCuboidShape(5, 6, 3, 11, 8, 14),
			Block.makeCuboidShape(6, 8, 2, 10, 9, 7),
			Block.makeCuboidShape(7, 8, 1, 9, 9, 2),
			Block.makeCuboidShape(6, 7, 14, 10, 8, 15)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
			
	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(2, 0, 4, 12, 1, 12),
			Block.makeCuboidShape(4, 1, 5, 10, 2, 11),
			Block.makeCuboidShape(5, 2, 6, 9, 4, 10),
			Block.makeCuboidShape(3, 4, 6, 11, 6, 10),
			Block.makeCuboidShape(2, 6, 5, 13, 8, 11),
			Block.makeCuboidShape(9, 8, 6, 14, 9, 10),
			Block.makeCuboidShape(14, 8, 7, 15, 9, 9),
			Block.makeCuboidShape(1, 7, 6, 2, 8, 10)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(4, 0, 2, 12, 1, 12),
			Block.makeCuboidShape(5, 1, 4, 11, 2, 10),
			Block.makeCuboidShape(6, 2, 5, 10, 4, 9),
			Block.makeCuboidShape(6, 4, 3, 10, 6, 11),
			Block.makeCuboidShape(5, 6, 2, 11, 8, 13),
			Block.makeCuboidShape(6, 8, 9, 10, 9, 14),
			Block.makeCuboidShape(7, 8, 14, 9, 9, 15),
			Block.makeCuboidShape(6, 7, 1, 10, 8, 2)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(4, 0, 4, 14, 1, 12),
			Block.makeCuboidShape(6, 1, 5, 12, 2, 11),
			Block.makeCuboidShape(7, 2, 6, 11, 4, 10),
			Block.makeCuboidShape(5, 4, 6, 13, 6, 10),
			Block.makeCuboidShape(3, 6, 5, 14, 8, 11),
			Block.makeCuboidShape(2, 8, 6, 7, 9, 10),
			Block.makeCuboidShape(1, 8, 7, 2, 9, 9),
			Block.makeCuboidShape(14, 7, 6, 15, 8, 10)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
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
			
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
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
			if (te instanceof psTile_Anvil) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (psTile_Anvil) te, pos);
			}
		}
		return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}
	
}
