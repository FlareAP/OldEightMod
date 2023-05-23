package com.flare.old_eight;

import com.flare.old_eight.block.ModBlocks;
import com.flare.old_eight.item.ModItems;
import com.flare.old_eight.sound.ModSoundEvents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Old_eight implements ModInitializer {
    public static final String MOD_ID = "old_eight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItem();
        ModSoundEvents.registerSoundEvent();
        ModBlocks.registerBlock();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content ->
            content.addAfter(Items.ROTTEN_FLESH, ModItems.LAOBA)
        );
    }
}
