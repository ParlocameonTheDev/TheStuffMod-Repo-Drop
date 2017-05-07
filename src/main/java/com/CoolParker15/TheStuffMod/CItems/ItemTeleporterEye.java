package com.CoolParker15.TheStuffMod.CItems;

import java.util.List;
import java.util.Stack;

import com.CoolParker15.TheStuffMod.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTeleporterEye extends Item {
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
			if(!playerIn.isSneaking())
			{
				if(stack.getTagCompound() == null)
				{
					stack.setTagCompound(new NBTTagCompound());
				}
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setInteger("dim", playerIn.dimension);
				nbt.setInteger("posX", pos.getX());
				nbt.setInteger("posY", pos.getY());
				nbt.setInteger("posZ", pos.getZ());
				stack.getTagCompound().setTag("coords", nbt);
				stack.setStackDisplayName(EnumChatFormatting.AQUA + "Teleporter Eye");
			}
	        return false;
	    }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	    {
			if(playerIn.isSneaking())
			{
				if(stack.getTagCompound() != null)
				{
					stack.getTagCompound().removeTag("coords");
					stack.clearCustomName();
				}
			}
	        return stack;
	    }
	 	@Override
	 	@SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
	 	{
	 		if(stack.getTagCompound() != null)
	 		{
	 			if(stack.getTagCompound().hasKey("coords"))
	 			{
	 				NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("coords");
	 				int dim = nbt.getInteger("dim");
	 				int posX = nbt.getInteger("posX");
	 				int posY = nbt.getInteger("posY");
	 				int posZ = nbt.getInteger("posZ");
	 				tooltip.add("Dim #: " + dim + " X: " + posX + " Y: " + posY + " Z: " + posZ);
	 			}
	 		}
	 	}
	
	 	@SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack stack)
	    {
	 		if(stack.getTagCompound() != null)
	 		{
	 			return stack.getTagCompound().hasKey("coords");
	 		}
	        return false;
	    }
	 	
	 	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5)
	 	{
	 		super.onUpdate(stack, world, entity, par4, par5);
	 		{
	 			EntityPlayer player = (EntityPlayer) entity;
	 			ItemStack equipped = player.getCurrentEquippedItem();
	 			if(equipped == stack)
	 			{
	 				player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 150, 6));
	 				player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 150, 3));
	 			}
	 		}
		}
	}
