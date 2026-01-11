package pt.tivie.create_fly_extra.block.hull;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.TrainHullBlock;

public class IndustrialIronTrainHullBlock extends TrainHullBlock {
    public static final MapCodec<IndustrialIronTrainHullBlock> CODEC = createCodec(IndustrialIronTrainHullBlock::new);

    public IndustrialIronTrainHullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends TrainHullBlock> getCodec() {
        return CODEC;
    }
}
