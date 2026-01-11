package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedDeepslatePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedDeepslatePilotBlock> CODEC = createCodec(PolishedDeepslatePilotBlock::new);

    public PolishedDeepslatePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
