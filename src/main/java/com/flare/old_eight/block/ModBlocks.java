package com.flare.old_eight.block;

import com.flare.old_eight.Old_eight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.Old_eight.MOD_ID;

public class ModBlocks {
    public static final Block LAOBA_BLOCK = register("laoba_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).hardness(0.5f)));

    private static Block register(String id, Block block) {
        registerItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, id), block);
    }
    private static Item registerItem(String id, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlock() {
        Old_eight.LOGGER.info("Registering mod blocks for" + MOD_ID);
    }
}
