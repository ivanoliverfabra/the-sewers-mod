package com.fabraic.thesewers.items;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class SewersBlock {
  public static final Block SNOW_GLOBE = RegisterBlock("snow_globe", 
    new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().sounds(BlockSoundGroup.GLASS)), SewersGroup.BLOCKS);

  public static final Block RED_PRESENT = RegisterBlock("red_present",
    new BarrelBlock(FabricBlockSettings.of(Material.WOOL, DyeColor.RED).sounds(BlockSoundGroup.WOOL).nonOpaque()), SewersGroup.BLOCKS);

  private static Block RegisterBlock(String name, Block block, ItemGroup group) {
    registerBlockItem(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier("thesewers", name), block);
  }

  private static Item registerBlockItem(String name, Block block, ItemGroup group) {
    return Registry.register(Registry.ITEM, new Identifier("thesewers", name), new BlockItem(block, new Item.Settings().group(group)));
  }

  public static void registerModBlocks() {
    System.out.println("Registering mod blocks");
  }
}
