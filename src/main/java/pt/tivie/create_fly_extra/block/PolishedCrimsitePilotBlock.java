package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedCrimsitePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedCrimsitePilotBlock> CODEC = createCodec(PolishedCrimsitePilotBlock::new);

    public PolishedCrimsitePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
