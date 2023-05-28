package com.flare.old_eight.item;

import com.flare.old_eight.OldEight;
import com.flare.old_eight.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.OldEight.MOD_ID;

public class ModItems {
    public static final Item LAOBA = register("laoba", new LaobaItem(new FabricItemSettings().food(ModFoodComponents.LAOBA)));
    public static final Item LAOBA_BLOCK = registerBlockItem("laoba_block", ModBlocks.LAOBA_BLOCK);
    public static final Item LAOBA_ORE = registerBlockItem("laoba_ore", ModBlocks.LAOBA_ORE);
    private static void addItems() {
        addToItemGroup(ModItemGroups.OLD_EIGHT, LAOBA);
        addToItemGroup(ModItemGroups.OLD_EIGHT, LAOBA_BLOCK);
        addToItemGroup(ModItemGroups.OLD_EIGHT, LAOBA_ORE);
    }
    private static Item register(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), item);
    }
    private static Item registerBlockItem(String id, Block block) {
        return register(id, new BlockItem(block, new FabricItemSettings()));
    }
    private static void addToItemGroup(ItemGroup itemGroup, Item after, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.addAfter(after, item));
    }
    private static void addToItemGroup(ItemGroup itemGroup, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(item));
    }

    public static void registerItem(){
        OldEight.LOGGER.info("Registering mod items for " + MOD_ID);
        addItems();
    }
}
