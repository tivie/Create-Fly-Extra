package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedScoriaPilotBlock extends PilotBlock {
    public static final MapCodec<PolishedScoriaPilotBlock> CODEC = createCodec(PolishedScoriaPilotBlock::new);

    public PolishedScoriaPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
