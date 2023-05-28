package com.flare.old_eight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.flare.old_eight.OldEight.MOD_ID;

public class ModWorldGenerator extends FabricDynamicRegistryProvider {

    public ModWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return MOD_ID;
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        // pass
    }
}
