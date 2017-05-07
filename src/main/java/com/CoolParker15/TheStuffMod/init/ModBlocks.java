package com.CoolParker15.TheStuffMod.init;

import com.CoolParker15.TheStuffMod.BlockCreator.BlockC;
import com.CoolParker15.TheStuffMod.CBlocks.BlockClearGlass;
import com.CoolParker15.TheStuffMod.CBlocks.BlockHealiteOre;
import com.CoolParker15.TheStuffMod.CBlocks.BlockTeleporter;
import com.CoolParker15.TheStuffMod.ModTab;
import com.CoolParker15.TheStuffMod.Reference;
import com.CoolParker15.TheStuffMod.TheStuffModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block red_dyed_stone;
    public static Block blue_dyed_stone;
    public static Block nyan_block;
    public static Block left_arrow_block;
    public static Block right_arrow_block;
    public static Block up_arrow_block;
    public static Block down_arrow_block;
    public static Block clear_glass;
    public static Block teleporter_block;
    public static Block healite_ore;

    public static void init() {
        red_dyed_stone = new BlockC(Material.rock).setUnlocalizedName("red_dyed_stone").setCreativeTab(TheStuffModMain.tabMod).setHardness(6.0F);
        blue_dyed_stone = new BlockC(Material.rock).setUnlocalizedName("blue_dyed_stone").setCreativeTab(TheStuffModMain.tabMod).setHardness(6.0F);
        right_arrow_block = new BlockC(Material.rock).setUnlocalizedName("right_arrow_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(4.0F);
        left_arrow_block = new BlockC(Material.rock).setUnlocalizedName("left_arrow_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(4.0F);
        up_arrow_block = new BlockC(Material.rock).setUnlocalizedName("up_arrow_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(4.0F);
        down_arrow_block = new BlockC(Material.rock).setUnlocalizedName("down_arrow_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(4.0F);
        nyan_block = new BlockC(Material.rock).setUnlocalizedName("nyan_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(1.0F);
        clear_glass = new BlockClearGlass(Material.glass).setUnlocalizedName("clear_glass").setCreativeTab(TheStuffModMain.tabMod).setHardness(2.0F);
        teleporter_block = new BlockTeleporter(Material.glass).setUnlocalizedName("teleporter_block").setCreativeTab(TheStuffModMain.tabMod).setHardness(4.0F);
        healite_ore = new BlockHealiteOre(Material.iron).setUnlocalizedName("healite_ore").setCreativeTab(TheStuffModMain.tabMod).setHardness(51.0F).setResistance(3000.0F).setLightLevel(200.0F);
        
    }

    public static void register() {
        GameRegistry.registerBlock(red_dyed_stone, red_dyed_stone.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blue_dyed_stone, blue_dyed_stone.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nyan_block, nyan_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(up_arrow_block, up_arrow_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(down_arrow_block, down_arrow_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(left_arrow_block, left_arrow_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(right_arrow_block, right_arrow_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(clear_glass, clear_glass.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(teleporter_block, teleporter_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(healite_ore, healite_ore.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        ModBlocks.registerRender(red_dyed_stone);
        ModBlocks.registerRender(blue_dyed_stone);
        ModBlocks.registerRender(nyan_block);
        ModBlocks.registerRender(left_arrow_block);
        ModBlocks.registerRender(right_arrow_block);
        ModBlocks.registerRender(up_arrow_block);
        ModBlocks.registerRender(down_arrow_block);
        ModBlocks.registerRender(clear_glass);
        ModBlocks.registerRender(teleporter_block);
        ModBlocks.registerRender(healite_ore);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}

