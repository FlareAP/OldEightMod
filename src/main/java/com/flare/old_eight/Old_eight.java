package com.flare.old_eight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.flare.old_eight.sound.ModSoundEvents;
import com.flare.old_eight.item.ModItems;

public class Old_eight implements ModInitializer {
    public static final String MOD_ID = "old_eight";

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "laoba"), ModItems.LAOBA);
        Registry.register(Registries.SOUND_EVENT, ModSoundEvents.OLIGEI, ModSoundEvents.OLD_EIGHT_OLIGEI);
        Registry.register(Registries.SOUND_EVENT, ModSoundEvents.YUE, ModSoundEvents.OLD_EIGHT_YUE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content ->
            content.addAfter(Items.ROTTEN_FLESH, ModItems.LAOBA)
        );
    }
}
