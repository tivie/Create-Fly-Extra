package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedTuffPilotBlock extends PilotBlock {
    public static final MapCodec<PolishedTuffPilotBlock> CODEC = createCodec(PolishedTuffPilotBlock::new);

    public PolishedTuffPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
