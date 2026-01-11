package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

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
