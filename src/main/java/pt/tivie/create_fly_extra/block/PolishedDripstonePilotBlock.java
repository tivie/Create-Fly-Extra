package pt.tivie.create_fly_extra.block;

import com.mojang.serialization.MapCodec;

public class PolishedDripstonePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedDripstonePilotBlock> CODEC = createCodec(PolishedDripstonePilotBlock::new);

    public PolishedDripstonePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
