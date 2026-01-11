package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedScorchiaPilotBlock extends PilotBlock {
    public static final MapCodec<PolishedScorchiaPilotBlock> CODEC = createCodec(PolishedScorchiaPilotBlock::new);

    public PolishedScorchiaPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
