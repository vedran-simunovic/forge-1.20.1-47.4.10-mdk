package net.simunovic.mod.item;

import net.minecraft.world.item.ArmorItem;
import net.simunovic.mod.SimunovicMod;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimunovicMod.MOD_ID);

    public static final RegistryObject<Item> RAINBOWGEM = ITEMS.register("rainbowgem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GALAXY = ITEMS.register("galaxy",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOWGEM_BOW_STANDBY = ITEMS.register("rainbowgem_bow_standby",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> RAINBOWDIAMOND = ITEMS.register("rainbowdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOWDIAMOND_SWORD = ITEMS.register("rainbowdiamond_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWDIAMOND, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 9994, 2, new Item.Properties()));
    public static final RegistryObject<Item> HACKER_SWORD = ITEMS.register("hacker_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 10995, 2, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SWORD = ITEMS.register("dragon_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 9995, 2, new Item.Properties()));
    public static final RegistryObject<Item> KEYBLADE_KINGDOM_KEY_SWORD = ITEMS.register("keyblade_kingdom_key_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 9994, 2, new Item.Properties()));
    public static final RegistryObject<Item> KEYBLADE_KINGDOM_KEY_16BIT_SWORD = ITEMS.register("keyblade_kingdom_key_16bit_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 9994, 2, new Item.Properties()));

    public static final RegistryObject<Item> GALAXY_HELMET = ITEMS.register("galaxy_helmet",
            () -> new ArmorItem(ModArmorMaterials.GALAXY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GALAXY_CHESTPLATE = ITEMS.register("galaxy_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GALAXY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GALAXY_LEGGINGS = ITEMS.register("galaxy_leggings",
            () -> new ArmorItem(ModArmorMaterials.GALAXY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GALAXY_BOOTS = ITEMS.register("galaxy_boots",
            () -> new ArmorItem(ModArmorMaterials.GALAXY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GINGERBREADMAN = ITEMS.register("gingerbreadman",
            () -> new Item(new Item.Properties().food(ModFoods.GINGERBREADMAN)));
    public static final RegistryObject<Item> GINGERBREADCOOKIE = ITEMS.register("gingerbreadcookie",
            () -> new Item(new Item.Properties().food(ModFoods.GINGERBREADCOOKIE)));
    public static final RegistryObject<Item> CANDYCANE = ITEMS.register("candycane",
            () -> new Item(new Item.Properties().food(ModFoods.CANDYCANE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
