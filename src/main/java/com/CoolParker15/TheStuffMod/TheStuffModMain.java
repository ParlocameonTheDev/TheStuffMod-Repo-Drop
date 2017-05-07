package com.CoolParker15.TheStuffMod;

import com.CoolParker15.TheStuffMod.ModTab;
import com.CoolParker15.TheStuffMod.WorldGen.ModWorldGeneration;
import com.CoolParker15.TheStuffMod.crafting.craftingRecipes;
import com.CoolParker15.TheStuffMod.init.ModBlocks;
import com.CoolParker15.TheStuffMod.init.ModItems;
import com.CoolParker15.TheStuffMod.init.ModSmelting;
import com.CoolParker15.TheStuffMod.init.TileEntities;
import com.CoolParker15.TheStuffMod.proxy.CommonProxy;
import java.io.PrintStream;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_ID, acceptedMinecraftVersions="1.8")
public class TheStuffModMain {
    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static final ModTab tabMod = new ModTab("tabMod");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("TheStuffMod Pre-Initialized");
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
        ModSmelting.registerSmelting();
        TileEntities.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("TheStuffMod Initialized");
        proxy.registerRenders();
        craftingRecipes.registerRecipes();
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("TheStuffMod Post-Initialized");
    }
}