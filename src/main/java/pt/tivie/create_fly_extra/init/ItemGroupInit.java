package pt.tivie.create_fly_extra.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import pt.tivie.create_fly_extra.Create_fly_extra;

public class ItemGroupInit {
    public static final RegistryKey<ItemGroup> CREATE_FLY_EXTRA_GROUP_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, Create_fly_extra.id("create_fly_extra_group"));
    public static final ItemGroup CREATE_FLY_EXTRA_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlockInit.IRON_PILOT))
            .displayName(Text.translatable("itemGroup.create_fly_extra.group"))
            .entries((displayContext, entries) -> {
                entries.add(BlockInit.IRON_PILOT);
                entries.add(BlockInit.ANDESITE_PILOT);
                entries.add(BlockInit.BRASS_PILOT);
                entries.add(BlockInit.COPPER_PILOT);
                entries.add(BlockInit.POLISHED_ANDESITE_PILOT);
                entries.add(BlockInit.POLISHED_ASURINE_PILOT);
                entries.add(BlockInit.POLISHED_CALCITE_PILOT);
                entries.add(BlockInit.POLISHED_CRIMSITE_PILOT);
                entries.add(BlockInit.POLISHED_DEEPSLATE_PILOT);
                entries.add(BlockInit.POLISHED_DIORITE_PILOT);
                entries.add(BlockInit.POLISHED_DRIPSTONE_PILOT);
                entries.add(BlockInit.POLISHED_GRANITE_PILOT);
                entries.add(BlockInit.POLISHED_LIMESTONE_PILOT);
                entries.add(BlockInit.POLISHED_OCHRUM_PILOT);
                entries.add(BlockInit.POLISHED_SCORCHIA_PILOT);
                entries.add(BlockInit.POLISHED_SCORIA_PILOT);
                entries.add(BlockInit.POLISHED_TUFF_PILOT);
                entries.add(BlockInit.POLISHED_VERIDIUM_PILOT);
            })
            .build();

    public static void load() {
        Registry.register(Registries.ITEM_GROUP, CREATE_FLY_EXTRA_GROUP_KEY, CREATE_FLY_EXTRA_GROUP);
    }
}
