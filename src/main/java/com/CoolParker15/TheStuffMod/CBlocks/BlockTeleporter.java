package com.CoolParker15.TheStuffMod.CBlocks;

import com.CoolParker15.TheStuffMod.CItems.ItemTeleporterEye;
import com.CoolParker15.TheStuffMod.tileentity.TileEntityTeleporterBlock;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class BlockTeleporter extends Block implements ITileEntityProvider {

	public BlockTeleporter(Material materialIn) {
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
		return false;
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		ItemStack stack = playerIn.getCurrentEquippedItem();
		if(stack != null)
		{
			if(stack.getItem() instanceof ItemTeleporterEye)
			{
				if (stack.getItem().hasEffect(stack))
				{
					TileEntityTeleporterBlock tect = (TileEntityTeleporterBlock) worldIn.getTileEntity(pos);
					tect.addEntry("teleportEntry", stack);
					stack.stackSize--;
					playerIn.addChatMessage(new ChatComponentText("Added Information to block."));
				}
			}
		}
        return true;
    }
	
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityTeleporterBlock();
	}
}
