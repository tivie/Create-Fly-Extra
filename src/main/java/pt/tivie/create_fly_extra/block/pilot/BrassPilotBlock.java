package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

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
