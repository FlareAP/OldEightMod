package com.flare.old_eight.data;

import com.flare.old_eight.block.ModBlocks;
import com.flare.old_eight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator (FabricDataOutput fabricDataOutput){
        super(fabricDataOutput);
    }

    @Override
    public void generate(){
        addDrop(ModBlocks.LAOBA_BLOCK);
        addDrop(ModBlocks.LAOBA_ORE, oreDrops(ModBlocks.LAOBA_ORE, ModItems.LAOBA)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))));
    }
}
