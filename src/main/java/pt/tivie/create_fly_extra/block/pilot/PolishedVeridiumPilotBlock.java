package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedVeridiumPilotBlock extends PilotBlock {
    public static final MapCodec<PolishedVeridiumPilotBlock> CODEC = createCodec(PolishedVeridiumPilotBlock::new);

    public PolishedVeridiumPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
