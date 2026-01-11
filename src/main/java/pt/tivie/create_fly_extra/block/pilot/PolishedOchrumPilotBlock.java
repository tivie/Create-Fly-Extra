package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedOchrumPilotBlock extends PilotBlock {
    public static final MapCodec<PolishedOchrumPilotBlock> CODEC = createCodec(PolishedOchrumPilotBlock::new);

    public PolishedOchrumPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
