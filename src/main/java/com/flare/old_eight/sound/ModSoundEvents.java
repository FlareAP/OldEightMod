package com.flare.old_eight.sound;

import com.flare.old_eight.Old_eight;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.Old_eight.MOD_ID;

public class ModSoundEvents {
    public static final SoundEvent OLD_EIGHT_OLIGEI = register("oligei");
    public static final SoundEvent OLD_EIGHT_YUE = register("yue");

    private static SoundEvent register(String id) {
        Identifier identifier = new Identifier(MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSoundEvent() {
        Old_eight.LOGGER.info("Registering mod sound events for " + MOD_ID);
    }
}
