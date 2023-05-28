package com.flare.old_eight;

import com.flare.old_eight.data.ModBlockLootTableGenerator;
import com.flare.old_eight.data.ModModelProvider;
import com.flare.old_eight.data.ModRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OldEightDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
    }
}
