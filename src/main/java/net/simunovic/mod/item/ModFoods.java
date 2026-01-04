package net.simunovic.mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GINGERBREADMAN = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200), 1).build();
    public static final FoodProperties GINGERBREADCOOKIE = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 200), 1).build();
    public static final FoodProperties CANDYCANE = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1).build();
}
