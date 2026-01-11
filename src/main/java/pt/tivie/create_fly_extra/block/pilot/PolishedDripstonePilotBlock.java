package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

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
