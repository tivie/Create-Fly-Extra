package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedAsurinePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedAsurinePilotBlock> CODEC = createCodec(PolishedAsurinePilotBlock::new);

    public PolishedAsurinePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
