package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class BrassPilotBlock extends PilotBlock {
    public static final MapCodec<BrassPilotBlock> CODEC = createCodec(BrassPilotBlock::new);

    public BrassPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
