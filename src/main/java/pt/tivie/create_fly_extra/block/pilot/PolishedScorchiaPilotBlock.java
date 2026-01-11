package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

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
