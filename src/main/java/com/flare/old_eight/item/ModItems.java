package com.flare.old_eight.item;

import com.flare.old_eight.Old_eight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.Old_eight.MOD_ID;

public class ModItems {
    public static final Item LAOBA = register("laoba", new LaobaItem(new FabricItemSettings().food(ModFoodComponents.LAOBA)));

    private static Item register(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), item);
    }

    public static void registerItem(){
        Old_eight.LOGGER.info("Registering mod items for " + MOD_ID);
    }
}
