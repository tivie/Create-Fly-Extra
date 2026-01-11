package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedLimestonePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedLimestonePilotBlock> CODEC = createCodec(PolishedLimestonePilotBlock::new);

    public PolishedLimestonePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
