package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class PolishedDioritePilotBlock extends PilotBlock {
    public static final MapCodec<PolishedDioritePilotBlock> CODEC = createCodec(PolishedDioritePilotBlock::new);

    public PolishedDioritePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
