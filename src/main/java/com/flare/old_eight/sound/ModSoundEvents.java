package com.flare.old_eight.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.flare.old_eight.Old_eight.MOD_ID;

public class ModSoundEvents {
    public static final Identifier OLIGEI = new Identifier(MOD_ID, "oligei");
    public static final Identifier YUE = new Identifier(MOD_ID, "yue");
    public static final SoundEvent OLD_EIGHT_OLIGEI = SoundEvent.of(OLIGEI);
    public static final SoundEvent OLD_EIGHT_YUE = SoundEvent.of(YUE);
}
