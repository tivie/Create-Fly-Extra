package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedGranitePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedGranitePilotBlock> CODEC = createCodec(PolishedGranitePilotBlock::new);

    public PolishedGranitePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
