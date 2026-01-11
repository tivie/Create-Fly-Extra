package pt.tivie.create_fly_extra.block.hull;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.TrainHullBlock;

public class ZincTrainHullBlock extends TrainHullBlock {
    public static final MapCodec<ZincTrainHullBlock> CODEC = createCodec(ZincTrainHullBlock::new);

    public ZincTrainHullBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends TrainHullBlock> getCodec() {
        return CODEC;
    }
}
