package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

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
