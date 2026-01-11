package pt.tivie.create_fly_extra.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.BlockRenderLayer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import pt.tivie.create_fly_extra.init.BlockInit;

public class Create_fly_extraClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(BlockInit.HEADLIGHT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.IRON_TRAIN_HULL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.INDUSTRIAL_IRON_TRAIN_HULL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.ZINC_TRAIN_HULL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.BRASS_TRAIN_HULL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.COPPER_TRAIN_HULL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlockInit.ANDESITE_TRAIN_HULL, BlockRenderLayer.CUTOUT);
    }
}
