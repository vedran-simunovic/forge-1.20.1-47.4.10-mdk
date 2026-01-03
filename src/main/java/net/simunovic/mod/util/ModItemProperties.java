package net.simunovic.mod.util;

import net.simunovic.mod.item.ModItems;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Registers custom item properties like bow pulling and pull strength
 * so that Minecraft can handle bow animations properly.
 */
@OnlyIn(Dist.CLIENT)
public class ModItemProperties {

    public static void addCustomItemProperties() {
        makeCustomBow(ModItems.RAINBOWGEM_BOW_STANDBY.get());
    }

    private static void makeCustomBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (ClampedItemPropertyFunction)((p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        }));
        ItemProperties.register(item, new ResourceLocation("pulling"), (ClampedItemPropertyFunction)((p_174630_, p_174631_, p_174632_, p_174633_) -> p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F));
    }
}