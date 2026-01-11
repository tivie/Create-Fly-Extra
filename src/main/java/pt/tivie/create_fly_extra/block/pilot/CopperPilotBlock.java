package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class CopperPilotBlock extends PilotBlock {
    public static final MapCodec<CopperPilotBlock> CODEC = createCodec(CopperPilotBlock::new);

    public CopperPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
