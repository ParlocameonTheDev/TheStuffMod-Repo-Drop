package com.CoolParker15.TheStuffMod.init;

import com.CoolParker15.TheStuffMod.tileentity.TileEntityTeleporterBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntities
{
	public static void register()
	{
		GameRegistry.registerTileEntity(TileEntityTeleporterBlock.class, "TheStuffModTeleporterBlock");
	}
}
