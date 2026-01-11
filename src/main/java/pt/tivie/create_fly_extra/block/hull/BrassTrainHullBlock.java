package pt.tivie.create_fly_extra.block.hull;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.TrainHullBlock;

public class BrassTrainHullBlock extends TrainHullBlock {
    public static final MapCodec<BrassTrainHullBlock> CODEC = createCodec(BrassTrainHullBlock::new);

    public BrassTrainHullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends TrainHullBlock> getCodec() {
        return CODEC;
    }
}
