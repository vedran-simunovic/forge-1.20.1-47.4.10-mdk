package net.leon.tutorialmod.item;

import net.leon.tutorialmod.TutorialMod;
import net.leon.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RAINBOWGEM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RAINBOWGEM_TOOL, () -> Ingredient.of(ModItems.RAINBOWGEM.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "rainbowgem"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier RAINBOWDIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RAINBOWDIAMOND_TOOL, () -> Ingredient.of(ModItems.RAINBOWDIAMOND.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "rainbowdiamond"), List.of(Tiers.NETHERITE), List.of());

}