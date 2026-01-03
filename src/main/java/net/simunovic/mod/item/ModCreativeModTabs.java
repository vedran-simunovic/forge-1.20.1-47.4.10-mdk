package net.simunovic.mod.item;

import net.simunovic.mod.SimunovicMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.network.chat.Component;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimunovicMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAINBOWGEM.get()))
            .title(Component.translatable("creative.tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.RAINBOWGEM.get());
                pOutput.accept(ModItems.RAINBOWGEM_BOW.get());
                pOutput.accept(Items.SPECTRAL_ARROW);
                pOutput.accept(ModItems.RAINBOWDIAMOND.get());
                pOutput.accept(ModItems.RAINBOWDIAMOND_SWORD.get());
                pOutput.accept(ModItems.GALAXY_SWORD.get());
                pOutput.accept(ModItems.HACKER_SWORD.get());
                pOutput.accept(ModItems.DRAGON_SWORD.get());
                pOutput.accept(ModItems.KEYBLADE_KINGDOM_KEY_SWORD.get());
                pOutput.accept(ModItems.KEYBLADE_KINGDOM_KEY_16BIT_SWORD.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}





















