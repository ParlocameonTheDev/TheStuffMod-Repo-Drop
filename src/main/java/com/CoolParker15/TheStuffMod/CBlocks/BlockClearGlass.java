package com.CoolParker15.TheStuffMod.CBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class BlockClearGlass extends Block {

	public BlockClearGlass(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isFullCube()
	{
		return false;	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
}
