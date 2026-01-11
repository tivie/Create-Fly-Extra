package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallMountedBlock;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HeadlightBlock extends WallMountedBlock {





    public static final MapCodec<HeadlightBlock> CODEC = createCodec(HeadlightBlock::new);

    @Override
    public MapCodec<? extends HeadlightBlock> getCodec() {
        return CODEC;
    }

    private static final VoxelShape FLOOR_SHAPE = Block.createCuboidShape(4, 0, 4.5, 12, 3.25, 12.5);
    private static final VoxelShape CEILING_SHAPE = Block.createCuboidShape(4, 12.75, 4.5, 12, 16, 12.5);
    private static final VoxelShape WALL_NORTH_SHAPE = Block.createCuboidShape(4, 4, 12.75, 12, 12, 16.25);
    private static final VoxelShape WALL_SOUTH_SHAPE = Block.createCuboidShape(4, 4, -0.25, 12, 12, 3.25);
    private static final VoxelShape WALL_EAST_SHAPE = Block.createCuboidShape(-0.25, 4, 4, 3.25, 12, 12);
    private static final VoxelShape WALL_WEST_SHAPE = Block.createCuboidShape(12.75, 4, 4, 16.25, 12, 12);

    public HeadlightBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(FACE, BlockFace.WALL));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        BlockFace face = state.get(FACE);

        if (face == BlockFace.FLOOR) return FLOOR_SHAPE;
        if (face == BlockFace.CEILING) return CEILING_SHAPE;

        Direction facing = state.get(FACING);
        return switch (facing) {
            case NORTH -> WALL_NORTH_SHAPE;
            case SOUTH -> WALL_SOUTH_SHAPE;
            case WEST  -> WALL_WEST_SHAPE;
            case EAST  -> WALL_EAST_SHAPE;
            default    -> WALL_NORTH_SHAPE;
        };
    }


    //@Override
    //public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    //    Direction direction = state.get(FACING);
    //    switch (state.get(FACE)) {
    //        case FLOOR:
    //            return FLOOR_SHAPE;
    //        case CEILING:
    //            return CEILING_SHAPE;
    //        case WALL:
    //        default:
    //            return switch (direction) {
    //                case NORTH -> WALL_NORTH_SHAPE;
    //                case SOUTH -> WALL_SOUTH_SHAPE;
    //                case EAST -> WALL_EAST_SHAPE;
    //                case WEST -> WALL_WEST_SHAPE;
    //                default -> WALL_NORTH_SHAPE;
    //            };
    //    }
    //}
}
