package pt.tivie.create_fly_extra;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pt.tivie.create_fly_extra.init.BlockInit;
import pt.tivie.create_fly_extra.init.ItemGroupInit;
import pt.tivie.create_fly_extra.init.ItemInit;

public class Create_fly_extra implements ModInitializer {

    public static final String MOD_ID = "create_fly_extra";
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        LOGGER.info("Loading...");

        ItemGroupInit.load();
        ItemInit.load();
        BlockInit.load();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
