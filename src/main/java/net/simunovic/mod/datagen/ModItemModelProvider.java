package net.simunovic.mod.datagen;

import net.simunovic.mod.SimunovicMod;
import net.simunovic.mod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimunovicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.RAINBOWDIAMOND_SWORD);
        handheldItem(ModItems.GALAXY_SWORD);
        handheldItem(ModItems.HACKER_SWORD);
        handheldItem(ModItems.DRAGON_SWORD);
        handheldItem(ModItems.KEYBLADE_KINGDOM_KEY_SWORD);
        handheldItem(ModItems.KEYBLADE_KINGDOM_KEY_16BIT_SWORD);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SimunovicMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}