package com.CoolParker15.TheStuffMod.init;

import com.CoolParker15.TheStuffMod.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
    public static void registerSmelting() {
        GameRegistry.addSmelting(ModItems.corn_dog, new ItemStack(ModItems.grilled_corn_dog), 1.0f);
        GameRegistry.addSmelting(new ItemStack(Items.potionitem, 1, 8193), new ItemStack(ModItems.healing_essence), 4.0f);
        GameRegistry.addSmelting(new ItemStack(Items.potionitem, 1, 8225), new ItemStack(ModItems.healing_essence), 4.0f);
        GameRegistry.addSmelting(new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ModItems.healing_essence), 4.0f);
    }
}

