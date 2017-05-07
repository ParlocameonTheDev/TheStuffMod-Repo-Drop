package com.CoolParker15.TheStuffMod.init;

import com.CoolParker15.TheStuffMod.ModTab;
import com.CoolParker15.TheStuffMod.Reference;
import com.CoolParker15.TheStuffMod.TheStuffModMain;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldArmor;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldAxe;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldHoe;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldPickaxe;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldShovel;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldSword;
import com.CoolParker15.TheStuffMod.CItems.ItemInstaKillSword;
import com.CoolParker15.TheStuffMod.CItems.ItemEmeraldBow;
import com.CoolParker15.TheStuffMod.CItems.ItemStaffOfHealing;
import com.CoolParker15.TheStuffMod.CItems.ItemTeleporterEye;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item obsidian_stick;
    public static Item obsidian_emerald;
    public static Item corn_dog;
    public static Item grilled_corn_dog;
    public static Item emerald_sword;
    public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item emerald_hoe;
    public static Item emerald_shovel;
    public static Item teleporter_eye;
    public static Item staff_of_healing;
    public static Item emerald_bow;
    public static Item healing_essence;
    public static Item healing_orb;
    public static Item emerald_helmet;
    public static Item emerald_chestplate;
    public static Item emerald_leggings;
    public static Item emerald_boots;
    public static Item insta_kill_sword;
    public static Item healite;
    
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 4, 4500, 20.0F, 7.0F, 30);
    public static final Item.ToolMaterial InstaKillSwordMaterial = EnumHelper.addToolMaterial("InstaKillSwordMaterial", 20, 999999999, 200000F, 999999999F, 999999999);
    public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emeraldArmorMaterial", "thestuffmod:emeraldarmor", 5000, new int[]{4,12,6,4}, 200);

    public static void init() {
        obsidian_stick = new Item().setUnlocalizedName("obsidian_stick").setCreativeTab(TheStuffModMain.tabMod);
        obsidian_emerald = new Item().setUnlocalizedName("obsidian_emerald").setCreativeTab(TheStuffModMain.tabMod);
        corn_dog = new ItemFood(10, 0.5f, true).setUnlocalizedName("corn_dog").setCreativeTab(TheStuffModMain.tabMod);
        grilled_corn_dog = new ItemFood(20, 1.0f, true).setUnlocalizedName("grilled_corn_dog").setCreativeTab(TheStuffModMain.tabMod);
        emerald_sword = new ItemEmeraldSword(emeraldToolMaterial).setUnlocalizedName("emerald_sword").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        emerald_pickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("emerald_pickaxe").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        emerald_axe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("emerald_axe").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        emerald_hoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("emerald_hoe").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        emerald_shovel = new ItemEmeraldShovel(emeraldToolMaterial).setUnlocalizedName("emerald_shovel").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        emerald_bow = new ItemEmeraldBow().setUnlocalizedName("emerald_bow").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        teleporter_eye = new ItemTeleporterEye().setUnlocalizedName("teleporter_eye").setCreativeTab(TheStuffModMain.tabMod).setMaxStackSize(1); 
        staff_of_healing = new ItemStaffOfHealing().setUnlocalizedName("staff_of_healing").setCreativeTab(TheStuffModMain.tabMod).setMaxStackSize(1); 
        healing_essence = new Item().setUnlocalizedName("healing_essence").setCreativeTab(TheStuffModMain.tabMod);
        healing_orb = new Item().setUnlocalizedName("healing_orb").setCreativeTab(TheStuffModMain.tabMod);
        emerald_helmet = new ItemEmeraldArmor("emerald_helmet", emeraldArmorMaterial, 1, 0).setUnlocalizedName("emerald_helmet").setCreativeTab(TheStuffModMain.tabMod);
        emerald_chestplate = new ItemEmeraldArmor("emerald_chestplate", emeraldArmorMaterial, 1, 1).setUnlocalizedName("emerald_chestplate").setCreativeTab(TheStuffModMain.tabMod);
        emerald_leggings = new ItemEmeraldArmor("emerald_leggings", emeraldArmorMaterial, 2, 2).setUnlocalizedName("emerald_leggings").setCreativeTab(TheStuffModMain.tabMod);
        emerald_boots = new ItemEmeraldArmor("emerald_boots", emeraldArmorMaterial, 1, 3).setUnlocalizedName("emerald_boots").setCreativeTab(TheStuffModMain.tabMod);
        insta_kill_sword = new ItemInstaKillSword(InstaKillSwordMaterial).setUnlocalizedName("insta_kill_sword").setFull3D().setCreativeTab(TheStuffModMain.tabMod);
        healite = new Item().setUnlocalizedName("healite").setCreativeTab(TheStuffModMain.tabMod);
        
        
    }

    public static void register() {
        GameRegistry.registerItem(obsidian_stick, obsidian_stick.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_emerald, obsidian_emerald.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(corn_dog, corn_dog.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(grilled_corn_dog, grilled_corn_dog.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_sword, emerald_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_pickaxe, emerald_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_axe, emerald_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_hoe, emerald_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_shovel, emerald_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(teleporter_eye, teleporter_eye.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(staff_of_healing, staff_of_healing.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_bow, emerald_bow.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(healing_essence, healing_essence.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(healing_orb, healing_orb.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_helmet, emerald_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_chestplate, emerald_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_leggings, emerald_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_boots, emerald_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(insta_kill_sword, insta_kill_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(healite, healite.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        ModItems.registerRender(obsidian_stick);
        ModItems.registerRender(obsidian_emerald);
        ModItems.registerRender(corn_dog);
        ModItems.registerRender(grilled_corn_dog);
        ModItems.registerRender(emerald_sword);
        ModItems.registerRender(emerald_pickaxe);
        ModItems.registerRender(emerald_axe);
        ModItems.registerRender(emerald_hoe);
        ModItems.registerRender(emerald_shovel);
        ModItems.registerRender(teleporter_eye);
        ModItems.registerRender(staff_of_healing);
        ModItems.registerRender(emerald_bow);
        ModItems.registerRender(healing_essence);
        ModItems.registerRender(healing_orb);
        ModItems.registerRender(emerald_helmet);
        ModItems.registerRender(emerald_chestplate);
        ModItems.registerRender(emerald_leggings);
        ModItems.registerRender(emerald_boots);
        ModItems.registerRender(insta_kill_sword);
        ModItems.registerRender(healite);
    }

    public static void registerRender(Item item) {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}

