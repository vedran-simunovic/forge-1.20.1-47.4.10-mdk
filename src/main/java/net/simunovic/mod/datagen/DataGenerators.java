package net.simunovic.mod.datagen;

import net.minecraft.data.tags.TagsProvider;
import net.simunovic.mod.SimunovicMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SimunovicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // CLIENT
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        // BLOCK TAGS (REQUIRED)
        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        // ITEM TAGS (TRIMS LIVE HERE)
        generator.addProvider(event.includeServer(),
                new ModItemTagGenerator(
                        packOutput,
                        lookupProvider,
                        blockTagGenerator.contentsGetter(),
                        existingFileHelper
                ));
    }
}