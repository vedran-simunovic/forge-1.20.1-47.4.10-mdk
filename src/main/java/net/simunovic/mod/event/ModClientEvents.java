package net.simunovic.mod.event;

import net.simunovic.mod.SimunovicMod;
import net.simunovic.mod.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Handles client-side events such as FOV changes when using a custom bow.
 */
@Mod.EventBusSubscriber(modid = SimunovicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
        // Check if the player is using our custom bow
        if (event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == ModItems.RAINBOWGEM_BOW.get()) {
            float fovModifier = 1f;

            int ticksUsingItem = event.getPlayer().getTicksUsingItem();
            float deltaTicks = (float) ticksUsingItem / 20f;

            // Cap at 1f, square for smooth transition
            if (deltaTicks > 1f) {
                deltaTicks = 1f;
            } else {
                deltaTicks *= deltaTicks;
            }

            fovModifier *= 1f - deltaTicks * 0.15f;
            event.setNewFovModifier(fovModifier);
        }
    }
}