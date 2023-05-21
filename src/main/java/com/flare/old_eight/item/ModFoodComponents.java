package com.flare.old_eight.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent LAOBA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).alwaysEdible()
            .statusEffect(
                    new StatusEffectInstance(StatusEffects.POISON, 200, 0), 1.0f
            ).build();

}

