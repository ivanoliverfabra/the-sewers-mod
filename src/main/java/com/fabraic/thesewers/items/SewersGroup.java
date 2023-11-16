package com.fabraic.thesewers.items;

import com.fabraic.thesewers.TheSewers;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class SewersGroup {
  public static final ItemGroup COSMETICS = FabricItemGroupBuilder.build(
		new Identifier(TheSewers.MOD_ID, "cosmetics"),
		() -> new ItemStack(SewersItem.SANTA_HAT));

	public static final ItemGroup BLOCKS = FabricItemGroupBuilder.build(
		new Identifier(TheSewers.MOD_ID, "blocks"),
		() -> new ItemStack(SewersBlock.SNOW_GLOBE));

	public static final ItemGroup ITEMS = FabricItemGroupBuilder.build(
		new Identifier(TheSewers.MOD_ID, "items"),
		() -> new ItemStack(SewersItem.SEABAG_LOOTBAG));
}