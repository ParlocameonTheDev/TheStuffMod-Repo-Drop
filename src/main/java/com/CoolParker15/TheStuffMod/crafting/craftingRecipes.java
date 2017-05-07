package com.CoolParker15.TheStuffMod.crafting;

import com.CoolParker15.TheStuffMod.init.ModBlocks;
import com.CoolParker15.TheStuffMod.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class craftingRecipes
{
  public static void registerRecipes()
  {
    GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_stick), new Object[]{"OOO", "OSO", "OOO", 'O', Blocks.obsidian, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_emerald), new Object[]{"OOO", "OEO", "OOO", 'O', Blocks.obsidian, 'E', Items.emerald});
    GameRegistry.addRecipe(new ItemStack(ModItems.corn_dog), new Object[]{"BPB", "BPB", "BPB", 'B', Items.bread, 'P', new ItemStack(Items.porkchop, 1, 0)});
    GameRegistry.addRecipe(new ItemStack(ModBlocks.nyan_block), new Object[]{"DDD", "DDD", "DDD", 'D', Blocks.dirt});
    GameRegistry.addRecipe(new ItemStack(ModItems.emerald_sword), new Object[]{" E ", " E ", " S ", 'E', Items.emerald, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModItems.emerald_axe), new Object[]{ " EE", " SE", " S ", 'E', Items.emerald, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModItems.emerald_shovel), new Object[]{ " E ", " S ", " S ", 'E', Items.emerald, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModItems.emerald_hoe), new Object[]{" EE", " S ", " S ", 'E', Items.emerald, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModItems.emerald_pickaxe), new Object[]{"EEE", " S ", " S ", 'E', Items.emerald, 'S', Items.stick});
    GameRegistry.addRecipe(new ItemStack(ModBlocks.clear_glass), new Object[]{"OOO", "OGO", "OOO", 'O', Blocks.obsidian, 'G', Blocks.glass});
    GameRegistry.addRecipe(new ItemStack(ModItems.healing_orb), new Object[]{"HHH", "HHH", "HHH", 'H', ModItems.healing_essence});
    GameRegistry.addRecipe(new ItemStack(ModItems.staff_of_healing), new Object[]{"NHN", "DOD", " O ", 'N', Items.nether_star, 'H', ModItems.healing_orb, 'O', ModItems.obsidian_stick, 'D', Blocks.diamond_block});
    GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blue_dyed_stone), new Object[]{ Blocks.stone, new ItemStack(Items.dye, 1, 4)});
    GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.red_dyed_stone), new Object[]{Blocks.stone, new ItemStack(Items.dye, 1, 1)});
    GameRegistry.addRecipe(new ItemStack(ModItems.healing_orb), new Object[]{"HHH", "HHH", "HHH", 'H', ModItems.healite});
  }
}
