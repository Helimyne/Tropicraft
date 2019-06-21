package net.tropicraft.core.registry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import net.tropicraft.Names;
import net.tropicraft.Tropicraft;
import net.tropicraft.core.common.drinks.Drink;
import net.tropicraft.core.common.entity.placeable.EntityBambooItemFrame;
import net.tropicraft.core.common.entity.underdasea.atlantoku.EntityTropicalFish;
import net.tropicraft.core.common.enums.AshenMasks;
import net.tropicraft.core.common.enums.ITropicraftVariant;
import net.tropicraft.core.common.enums.TropicraftShells;
import net.tropicraft.core.common.item.ItemBambooItemFrame;
import net.tropicraft.core.common.item.ItemBeachFloat;
import net.tropicraft.core.common.item.ItemChair;
import net.tropicraft.core.common.item.ItemCocktail;
import net.tropicraft.core.common.item.ItemCoconutBomb;
import net.tropicraft.core.common.item.ItemCoffeeBean;
import net.tropicraft.core.common.item.ItemDagger;
import net.tropicraft.core.common.item.ItemEncyclopediaTropica;
import net.tropicraft.core.common.item.ItemFertilizer;
import net.tropicraft.core.common.item.ItemFishBucket;
import net.tropicraft.core.common.item.ItemFishingRod;
import net.tropicraft.core.common.item.ItemLoveTropicsShell;
import net.tropicraft.core.common.item.ItemMobEgg;
import net.tropicraft.core.common.item.ItemMusicDisc;
import net.tropicraft.core.common.item.ItemPortalEnchanter;
import net.tropicraft.core.common.item.ItemRiverFish;
import net.tropicraft.core.common.item.ItemSeaweed;
import net.tropicraft.core.common.item.ItemShell;
import net.tropicraft.core.common.item.ItemTropicalFish;
import net.tropicraft.core.common.item.ItemTropicraft;
import net.tropicraft.core.common.item.ItemTropicraftAxe;
import net.tropicraft.core.common.item.ItemTropicraftBlockSpecial;
import net.tropicraft.core.common.item.ItemTropicraftFood;
import net.tropicraft.core.common.item.ItemTropicraftPickaxe;
import net.tropicraft.core.common.item.ItemTropicsOre;
import net.tropicraft.core.common.item.ItemUmbrella;
import net.tropicraft.core.common.item.ItemWaterWand;
import net.tropicraft.core.common.item.armor.ItemAshenMask;
import net.tropicraft.core.common.item.armor.ItemFireArmor;
import net.tropicraft.core.common.item.armor.ItemNigelStache;
import net.tropicraft.core.common.item.armor.ItemScaleArmor;
import net.tropicraft.core.common.item.scuba.ItemBCD;
import net.tropicraft.core.common.item.scuba.ItemDiveComputer;
import net.tropicraft.core.common.item.scuba.ItemPonyBottle;
import net.tropicraft.core.common.item.scuba.ItemScubaChestplateGear;
import net.tropicraft.core.common.item.scuba.ItemScubaFlippers;
import net.tropicraft.core.common.item.scuba.ItemScubaHelmet;
import net.tropicraft.core.common.item.scuba.ItemScubaTank;
import net.tropicraft.core.common.item.scuba.api.ScubaMaterial;
import net.tropicraft.core.common.sound.TropicraftSounds;

@Mod.EventBusSubscriber
public class ItemRegistry extends TropicraftRegistry {

    //TODO: PLACEHOLDERS
    public static Item fishingNet = Items.TROPICAL_FISH;
    public static Item fishingRod = Items.TROPICAL_FISH;
    public static Item freshMarlin = Items.TROPICAL_FISH;
    public static Item fertilizer = Items.TROPICAL_FISH;
    public static Item nigelStache;
    public static Item poisonFrogSkin = Items.TROPICAL_FISH;
    public static Item diveComputer = Items.TROPICAL_FISH;
    public static Item trimix = Items.TROPICAL_FISH;
    public static Item frogLeg = Items.TROPICAL_FISH;
    public static Item iguanaLeather = Items.TROPICAL_FISH;
    public static Item scale = Items.TROPICAL_FISH;
    public static Item whitePearl = Items.TROPICAL_FISH;
    public static Item blackPearl = Items.TROPICAL_FISH;
}