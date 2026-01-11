package pt.tivie.create_fly_extra.block.hull;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.TrainHullBlock;

public class IronTrainHullBlock extends TrainHullBlock {
    public static final MapCodec<IronTrainHullBlock> CODEC = createCodec(IronTrainHullBlock::new);

    public IronTrainHullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends TrainHullBlock> getCodec() {
        return CODEC;
    }
}
