package com.fabraic.thesewers.items.cosmetics;

import org.jetbrains.annotations.Nullable;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import java.util.List;

public class SantaHatCosmetic extends Item {
  public SantaHatCosmetic(Settings settings) {
    super(settings);
  }

  @Override
  public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
    tooltip.add(Text.translatable("tooltip.thesewers.santa_hat").formatted(Formatting.RED));
    super.appendTooltip(stack, world, tooltip, context);
  }
}