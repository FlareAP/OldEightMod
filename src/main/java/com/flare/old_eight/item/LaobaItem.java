package com.flare.old_eight.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

import com.flare.old_eight.sound.ModSoundEvents;

public class LaobaItem extends Item {

    public LaobaItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.old_eight.laoba.tooltip")
                .formatted(Formatting.GRAY).formatted(Formatting.ITALIC));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        useLaoba(user, 0, world);
        user.getItemCooldownManager().set(this, 60);
        return super.use(world, user, hand);
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        useLaoba(user, 2, world);
        super.onStoppedUsing(stack, world, user, remainingUseTicks);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        useLaoba(user, 1, world);
        return super.finishUsing(stack, world, user);
    }

    private void useLaoba(LivingEntity user, int type, World world) {
        if (!world.isClient && user instanceof PlayerEntity) {
            switch (type) {
                case 0 -> {
                    world.playSound(null, user.getBlockPos(),
                            ModSoundEvents.OLD_EIGHT_OLIGEI, SoundCategory.PLAYERS, 0.35f, 1.0f);
                    user.sendMessage(Text.translatable("item.old_eight.laoba.on_use"));
                }
                case 1 -> {
                    world.playSound(null, user.getBlockPos(),
                            ModSoundEvents.OLD_EIGHT_YUE, SoundCategory.PLAYERS, 0.35f, 1.0f);
                    user.sendMessage(Text.translatable("item.old_eight.laoba.after_use"));
                }
                case 2 -> {
                    user.sendMessage(Text.translatable("item.old_eight.laoba.stop_use"));
                }
            }
        }
    }
}
