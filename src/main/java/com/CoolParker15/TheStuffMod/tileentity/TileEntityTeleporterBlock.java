package com.CoolParker15.TheStuffMod.tileentity;

import java.util.ArrayList;
import java.util.List;

import com.CoolParker15.TheStuffMod.CoordEntry;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTeleporterBlock extends TileEntity
{
	private List<CoordEntry> teleports = new ArrayList<CoordEntry>();
	
	public void addEntry(String name, ItemStack teleportBlock)
	{
		NBTTagCompound nbt = (NBTTagCompound) teleportBlock.getTagCompound().getTag("coords");
			int dim = nbt.getInteger("dim");
			int posX = nbt.getInteger("posX");
			int posY = nbt.getInteger("posY");
			int posZ = nbt.getInteger("posZ");
			teleports.add(new CoordEntry(name, dim, posX, posY, posZ));
	}
	
	public CoordEntry getEntry(int i)
	{
		if(i < teleports.size())
		{
			return teleports.get(i);
		}
		return null;
	}
	
	public void deleteEntry(int i)
	{
		if(i < teleports.size())
		{
			teleports.remove(i);
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		
		teleports = new ArrayList<CoordEntry>();
		
		NBTTagList entryList = (NBTTagList) compound.getTag("teleports");
		for(int i = 0; i < entryList.tagCount(); i++)
		{
			NBTTagCompound entryCompound = entryList.getCompoundTagAt(i);
			CoordEntry entry = CoordEntry.readEntryFromNBT(entryCompound);
			teleports.add(entry);
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		NBTTagList entryList = new NBTTagList();
		for(CoordEntry entry : teleports)
		{
			NBTTagCompound entryCompound = new NBTTagCompound();
			entry.writeEntryToNBT(entryCompound);
			entryList.appendTag(entryCompound);
		}
		
		compound.setTag("teleports", entryList);
	}
}
