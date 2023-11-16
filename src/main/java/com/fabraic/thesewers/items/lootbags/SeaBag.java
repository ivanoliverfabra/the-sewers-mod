package com.fabraic.thesewers.items.lootbags;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import com.fabraic.thesewers.items.LootBagItem;
import com.fabraic.thesewers.items.SewersItem;
import java.util.List;

public class SeaBag extends LootBagItem {
  public SeaBag(Settings settings) {
    super(settings);
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
    final ItemStack[] lootTable = {
      new ItemStack(SewersItem.BLUE_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.GREEN_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.YELLOW_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.RED_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.ORANGE_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.PINK_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.PURPLE_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.MAGENTA_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.LIGHTGRAY_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.LIGHTBLUE_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.CYAN_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.GRAY_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.WHITE_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.BLACK_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.BROWN_JELLYFISH_FAMILIAR, 1),
      new ItemStack(SewersItem.RED_FISH_FAMILIAR, 1),
      new ItemStack(SewersItem.PURPLE_FISH_FAMILIAR, 1),
      new ItemStack(SewersItem.CYAN_FISH_FAMILIAR, 1),
    };

    Random generator = new Random();
    if (!world.isClient) {
      int randomInt = generator.nextInt(lootTable.length);
      ItemStack stack = player.getStackInHand(hand);
      ItemStack itemStack = lootTable[randomInt];
      player.giveItemStack(itemStack);
      stack.decrement(1);
    }
    return TypedActionResult.success(player.getStackInHand(hand));
  }

  @Override
  public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
    tooltip.add(Text.translatable("tooltip.thesewers.seabag_lootbag").formatted(Formatting.AQUA));
    super.appendTooltip(stack, world, tooltip, context);
  }
}
