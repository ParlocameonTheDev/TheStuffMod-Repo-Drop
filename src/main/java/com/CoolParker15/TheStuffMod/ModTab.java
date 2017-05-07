package com.CoolParker15.TheStuffMod;

import com.CoolParker15.TheStuffMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTab extends CreativeTabs {

	public ModTab(String label) {
        super(label);
        this.setBackgroundImageName("mod.png");
    }

    @Override
	public Item getTabIconItem() {
		return ModItems.obsidian_emerald;
	}
}

