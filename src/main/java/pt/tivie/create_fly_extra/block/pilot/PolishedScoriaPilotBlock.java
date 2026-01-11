package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

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
