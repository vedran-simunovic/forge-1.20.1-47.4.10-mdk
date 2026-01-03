package net.leon.tutorialmod.item;

import net.leon.tutorialmod.TutorialMod;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RAINBOWGEM = ITEMS.register("rainbowgem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOWGEM_BOW = ITEMS.register("rainbowgem_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> RAINBOWDIAMOND = ITEMS.register("rainbowdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOWDIAMOND_SWORD = ITEMS.register("rainbowdiamond_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWDIAMOND, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
            () -> new SwordItem(ModToolTiers.RAINBOWGEM, 9994, 2, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
