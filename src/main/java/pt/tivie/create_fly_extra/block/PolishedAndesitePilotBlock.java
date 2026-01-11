package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedAndesitePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedAndesitePilotBlock> CODEC = createCodec(PolishedAndesitePilotBlock::new);

    public PolishedAndesitePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
