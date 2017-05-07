package com.CoolParker15.TheStuffMod.CItems;

import net.minecraft.item.ItemArmor;

public class ItemEmeraldArmor extends ItemArmor {
	
	public ItemEmeraldArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		
		this.setUnlocalizedName(unlocalizedName);
	}

}
