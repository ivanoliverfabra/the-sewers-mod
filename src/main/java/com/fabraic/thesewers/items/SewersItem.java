package com.fabraic.thesewers.items;

import com.fabraic.thesewers.items.cosmetics.SantaHatCosmetic;
import com.fabraic.thesewers.items.familiars.BlackJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.BlueJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.BrownJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.ClockFamiliar;
import com.fabraic.thesewers.items.familiars.ConduitEyeFamiliar;
import com.fabraic.thesewers.items.familiars.CyanFishFamiliar;
import com.fabraic.thesewers.items.familiars.CyanJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.DarkMimicFamiliar;
import com.fabraic.thesewers.items.familiars.FiendLanternFamiliar;
import com.fabraic.thesewers.items.familiars.GrayJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.GreenJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.HorologiumFamiliar;
import com.fabraic.thesewers.items.familiars.IceMimicFamiliar;
import com.fabraic.thesewers.items.familiars.LightBlueJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.LightGrayJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.LitLanternFamiliar;
import com.fabraic.thesewers.items.familiars.MagentaJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.MimicFamiliar;
import com.fabraic.thesewers.items.familiars.OrangeJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.PinkJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.PurpleFishFamiliar;
import com.fabraic.thesewers.items.familiars.PurpleJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.RedFishFamiliar;
import com.fabraic.thesewers.items.familiars.RedJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.SuspiciousEyeFamiliar;
import com.fabraic.thesewers.items.familiars.WhiteJellyfishFamiliar;
import com.fabraic.thesewers.items.familiars.YellowJellyfishFamiliar;
import com.fabraic.thesewers.items.lootbags.SeaBag;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SewersItem {
  public static final Item SANTA_HAT = RegisterItem("santa_hat", 
  new SantaHatCosmetic(new FabricItemSettings().group(SewersGroup.COSMETICS).maxCount(1)));

  public static final Item SEABAG_LOOTBAG = RegisterItem("seabag_lootbag", 
  new SeaBag(new Item.Settings().group(SewersGroup.ITEMS)));
  
  public static final Item SUSPICIOUS_EYE_FAMILIAR = RegisterItem("suspiciouseyefamiliaritem",
  new SuspiciousEyeFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item CONDUIT_EYE_FAMILIAR = RegisterItem("conduiteyefamiliaritem",
  new ConduitEyeFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item MIMIC_FAMILIAR = RegisterItem("mimicfamiliaritem",
  new MimicFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item DARK_MIMIC_FAMILIAR = RegisterItem("darkmimicfamiliaritem",
  new DarkMimicFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item ICE_MIMIC_FAMILIAR = RegisterItem("icemimicfamiliaritem",
  new IceMimicFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item BLUE_JELLYFISH_FAMILIAR = RegisterItem("bluejellyfishfamiliaritem",
  new BlueJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item GREEN_JELLYFISH_FAMILIAR = RegisterItem("greenjellyfishfamiliaritem",
  new GreenJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item YELLOW_JELLYFISH_FAMILIAR = RegisterItem("yellowjellyfishfamiliaritem",
  new YellowJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item RED_JELLYFISH_FAMILIAR = RegisterItem("redjellyfishfamiliaritem",
  new RedJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item ORANGE_JELLYFISH_FAMILIAR = RegisterItem("orangejellyfishfamiliaritem",
  new OrangeJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item PINK_JELLYFISH_FAMILIAR = RegisterItem("pinkjellyfishfamiliaritem",
  new PinkJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item PURPLE_JELLYFISH_FAMILIAR = RegisterItem("purplejellyfishfamiliaritem",
  new PurpleJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item MAGENTA_JELLYFISH_FAMILIAR = RegisterItem("magentajellyfishfamiliaritem",
  new MagentaJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item LIGHTGRAY_JELLYFISH_FAMILIAR = RegisterItem("lightgrayjellyfishfamiliaritem",
  new LightGrayJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item LIGHTBLUE_JELLYFISH_FAMILIAR = RegisterItem("lightbluejellyfishfamiliaritem",
  new LightBlueJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item CYAN_JELLYFISH_FAMILIAR = RegisterItem("cyanjellyfishfamiliaritem",
  new CyanJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item GRAY_JELLYFISH_FAMILIAR = RegisterItem("grayjellyfishfamiliaritem",
  new GrayJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item WHITE_JELLYFISH_FAMILIAR = RegisterItem("whitejellyfishfamiliaritem",
  new WhiteJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item BLACK_JELLYFISH_FAMILIAR = RegisterItem("blackjellyfishfamiliaritem",
  new BlackJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item BROWN_JELLYFISH_FAMILIAR = RegisterItem("brownjellyfishfamiliaritem",
  new BrownJellyfishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item LIT_LANTERN = RegisterItem("litlanternfamiliaritem",
  new LitLanternFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item FIEND_LANTERN = RegisterItem("fiendlanternfamiliaritem",
  new FiendLanternFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item RED_FISH_FAMILIAR = RegisterItem("redfishfamiliaritem",
  new RedFishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item CYAN_FISH_FAMILIAR = RegisterItem("cyanfishfamiliaritem",
  new CyanFishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item PURPLE_FISH_FAMILIAR = RegisterItem("purplefishfamiliaritem",
  new PurpleFishFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));
  
  public static final Item CLOCK_FAMILIAR = RegisterItem("clockfamiliaritem",
  new ClockFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));

  public static final Item HOROLOGIUM_FAMILIAR = RegisterItem("horologiumfamiliaritem",
  new HorologiumFamiliar(new FabricItemSettings().maxCount(1).group(SewersGroup.COSMETICS)));

  private static Item RegisterItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier("thesewers", name), item);
  }
  
  public static void registerModItems() {
    System.out.println("Registering mod items");
  }
}
