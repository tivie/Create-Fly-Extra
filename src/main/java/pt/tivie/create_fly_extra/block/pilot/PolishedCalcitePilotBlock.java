package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedCalcitePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedCalcitePilotBlock> CODEC = createCodec(PolishedCalcitePilotBlock::new);

    public PolishedCalcitePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
