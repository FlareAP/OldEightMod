package com.flare.old_eight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.OldEight.LOGGER;
import static com.flare.old_eight.OldEight.MOD_ID;


public class ModItemGroups {
    public static ItemGroup OLD_EIGHT = FabricItemGroup.builder(new Identifier(MOD_ID, "laoba"))
            .icon(() -> new ItemStack(ModItems.LAOBA))
            .displayName(Text.translatable("itemgroup.old_eight"))
            .build();

    public static void registerItemGroup() {
        LOGGER.info("registering item groups for " + MOD_ID);
    }
}
