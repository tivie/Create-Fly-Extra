package pt.tivie.create_fly_extra.block.pilot;

import com.mojang.serialization.MapCodec;
import pt.tivie.create_fly_extra.block.PilotBlock;

public class AndesitePilotBlock extends PilotBlock {
    public static final MapCodec<AndesitePilotBlock> CODEC = createCodec(AndesitePilotBlock::new);

    public AndesitePilotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends PilotBlock> getCodec() {
        return CODEC;
    }
}
