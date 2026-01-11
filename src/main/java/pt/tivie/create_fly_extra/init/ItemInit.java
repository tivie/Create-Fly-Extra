package pt.tivie.create_fly_extra.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import pt.tivie.create_fly_extra.Create_fly_extra;

import java.util.function.Function;

public class ItemInit {

    public static <T extends Item> T registerItem(String name, Function<Item.Settings, T> itemFactory, Item.Settings settings) {
        Identifier id = Create_fly_extra.id(name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        T item = itemFactory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static <T extends Item> T registerBlockItem(String name, Function<Item.Settings, T> itemFactory) {
        Identifier id = Create_fly_extra.id(name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings()
                // If your item is based on a block
                .useBlockPrefixedTranslationKey()
                .registryKey(key);
        T item = itemFactory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static <T extends Item> T registerBlockItem(String name, Function<Item.Settings, T> itemFactory, Item.Settings settings) {
        return registerItem(name, itemFactory, settings);
    }

    public static void load() {};
}
