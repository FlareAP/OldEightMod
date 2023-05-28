package com.flare.old_eight;

import com.flare.old_eight.block.ModBlocks;
import com.flare.old_eight.item.ModItemGroups;
import com.flare.old_eight.item.ModItems;
import com.flare.old_eight.sound.ModSoundEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OldEight implements ModInitializer {
    public static final String MOD_ID = "old_eight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroup();
        ModSoundEvents.registerSoundEvent();
        ModItems.registerItem();
        ModBlocks.registerBlock();
    }
}
