package pt.tivie.create_fly_extra.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import pt.tivie.create_fly_extra.Create_fly_extra;
import pt.tivie.create_fly_extra.block.*;
import pt.tivie.create_fly_extra.block.hull.*;
import pt.tivie.create_fly_extra.block.pilot.*;

public class BlockInit {

    public static final Block IRON_PILOT = registerBlockWithItem("pilot/iron_pilot",
            new IronPilotBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/iron_pilot"))))
    );

    public static final Block ANDESITE_PILOT = registerBlockWithItem("pilot/andesite_pilot",
            new AndesitePilotBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/andesite_pilot"))))
    );

    public static final Block BRASS_PILOT = registerBlockWithItem("pilot/brass_pilot",
            new BrassPilotBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK) // Using Gold as Brass surrogate if Create isn't present
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/brass_pilot"))))
    );

    public static final Block COPPER_PILOT = registerBlockWithItem("pilot/copper_pilot",
            new CopperPilotBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/copper_pilot"))))
    );

    public static final Block POLISHED_ANDESITE_PILOT = registerBlockWithItem("pilot/polished_andesite_pilot",
            new PolishedAndesitePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_andesite_pilot"))))
    );

    public static final Block POLISHED_ASURINE_PILOT = registerBlockWithItem("pilot/polished_asurine_pilot",
            new PolishedAsurinePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_asurine_pilot"))))
    );

    public static final Block POLISHED_CALCITE_PILOT = registerBlockWithItem("pilot/polished_calcite_pilot",
            new PolishedCalcitePilotBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_calcite_pilot"))))
    );

    public static final Block POLISHED_CRIMSITE_PILOT = registerBlockWithItem("pilot/polished_crimsite_pilot",
            new PolishedCrimsitePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_crimsite_pilot"))))
    );

    public static final Block POLISHED_DEEPSLATE_PILOT = registerBlockWithItem("pilot/polished_deepslate_pilot",
            new PolishedDeepslatePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_deepslate_pilot"))))
    );

    public static final Block POLISHED_DIORITE_PILOT = registerBlockWithItem("pilot/polished_diorite_pilot",
            new PolishedDioritePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_diorite_pilot"))))
    );

    public static final Block POLISHED_DRIPSTONE_PILOT = registerBlockWithItem("pilot/polished_dripstone_pilot",
            new PolishedDripstonePilotBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_dripstone_pilot"))))
    );

    public static final Block POLISHED_GRANITE_PILOT = registerBlockWithItem("pilot/polished_granite_pilot",
            new PolishedGranitePilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_granite_pilot"))))
    );

    public static final Block POLISHED_LIMESTONE_PILOT = registerBlockWithItem("pilot/polished_limestone_pilot",
            new PolishedLimestonePilotBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_limestone_pilot"))))
    );

    public static final Block POLISHED_OCHRUM_PILOT = registerBlockWithItem("pilot/polished_ochrum_pilot",
            new PolishedOchrumPilotBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_ochrum_pilot"))))
    );

    public static final Block POLISHED_SCORCHIA_PILOT = registerBlockWithItem("pilot/polished_scorchia_pilot",
            new PolishedScorchiaPilotBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_scorchia_pilot"))))
    );

    public static final Block POLISHED_SCORIA_PILOT = registerBlockWithItem("pilot/polished_scoria_pilot",
            new PolishedScoriaPilotBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_scoria_pilot"))))
    );

    public static final Block POLISHED_TUFF_PILOT = registerBlockWithItem("pilot/polished_tuff_pilot",
            new PolishedTuffPilotBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_tuff_pilot"))))
    );

    public static final Block POLISHED_VERIDIUM_PILOT = registerBlockWithItem("pilot/polished_veridium_pilot",
            new PolishedVeridiumPilotBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("pilot/polished_veridium_pilot"))))
    );

    public static final Block HEADLIGHT = registerBlockWithItem("headlight",
            new HeadlightBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .nonOpaque()
                    .luminance((state) -> 15)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("headlight"))))
    );

    public static final Block ANDESITE_TRAIN_HULL = registerBlockWithItem("hull/andesite_train_hull",
            new AndesiteTrainHullBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/andesite_train_hull"))))
    );

    public static final Block BRASS_TRAIN_HULL = registerBlockWithItem("hull/brass_train_hull",
            new BrassTrainHullBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/brass_train_hull"))))
    );

    public static final Block COPPER_TRAIN_HULL = registerBlockWithItem("hull/copper_train_hull",
            new CopperTrainHullBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/copper_train_hull"))))
    );

    public static final Block INDUSTRIAL_IRON_TRAIN_HULL = registerBlockWithItem("hull/industrial_iron_train_hull",
            new IndustrialIronTrainHullBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/industrial_iron_train_hull"))))
    );

    public static final Block IRON_TRAIN_HULL = registerBlockWithItem("hull/iron_train_hull",
            new IronTrainHullBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/iron_train_hull"))))
    );

    public static final Block ZINC_TRAIN_HULL = registerBlockWithItem("hull/zinc_train_hull",
            new ZincTrainHullBlock(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Create_fly_extra.id("hull/zinc_train_hull"))))
    );


    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(Registries.BLOCK, Create_fly_extra.id(name), block);
    }

    public static <T extends Block> T registerBlockWithItem(String name, T block) {
        T registeredBlock = registerBlock(name, block);
        ItemInit.registerBlockItem(name, (s) -> new BlockItem(registeredBlock, s));
        return registeredBlock;
    }

    public static <T extends Block> T registerBlockWithItem(String name, T block, Item.Settings settings) {
        T registeredBlock = registerBlock(name, block);
        ItemInit.registerBlockItem(name, (s) -> new BlockItem(registeredBlock, s), settings);
        return registeredBlock;
    }

    public static void load() {}
}
