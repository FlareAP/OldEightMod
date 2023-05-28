package com.flare.old_eight.data;

import com.flare.old_eight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.LAOBA_ORE), RecipeCategory.FOOD, ModItems.LAOBA, 0.3f, 200, "old_eight");
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.LAOBA_BLOCK, ModItems.LAOBA);
        offerShapelessRecipe(exporter, ModItems.LAOBA, ModItems.LAOBA_BLOCK, "old_eight", 1);
    }
}
