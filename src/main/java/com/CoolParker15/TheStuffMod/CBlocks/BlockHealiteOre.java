package com.CoolParker15.TheStuffMod.CBlocks;

import java.util.Random;

import com.CoolParker15.TheStuffMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockHealiteOre extends Block {

	public BlockHealiteOre(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.healite;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(3);
	}
}
