package com.flare.old_eight.block;

import com.flare.old_eight.OldEight;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static com.flare.old_eight.OldEight.MOD_ID;

public class ModBlocks {
    public static final Block LAOBA_BLOCK = register("laoba_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.3f).sounds(BlockSoundGroup.SLIME)));
    public static final Block LAOBA_ORE = register("laoba_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool(), UniformIntProvider.create(0, 2)));

//    public static final Block DEEPSLATE_LAOBA_ORE = register("deepslate_laoba_ore",
//            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(LAOBA_ORE).mapColor(MapColor.DEEPSLATE_GRAY)
//                    .strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(0, 2)));

    private static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, id), block);
    }

    public static void registerBlock() {
        OldEight.LOGGER.info("Registering mod blocks for" + MOD_ID);
    }
}
