package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class IronPilotBlock extends PilotBlock {
    public static final MapCodec<IronPilotBlock> CODEC = createCodec(IronPilotBlock::new);

    public IronPilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
