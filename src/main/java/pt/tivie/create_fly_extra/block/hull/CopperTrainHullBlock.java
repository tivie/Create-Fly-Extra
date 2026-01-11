package pt.tivie.create_fly_extra.block.hull;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.TrainHullBlock;

public class CopperTrainHullBlock extends TrainHullBlock {
    public static final MapCodec<CopperTrainHullBlock> CODEC = createCodec(CopperTrainHullBlock::new);

    public CopperTrainHullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends TrainHullBlock> getCodec() {
        return CODEC;
    }
}
