package com.CoolParker15.TheStuffMod.WorldGen;

import java.util.Random;

import com.CoolParker15.TheStuffMod.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModWorldGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: //Overworld
			
			break;
		case -1: //Nether
			
			break;
		case 1: //End
			this.runGenerator(this.gen_healite_ore, world, random, chunkX, chunkZ, 2, 16, 50);
			break;
		}
		
	}
	
	private WorldGenerator gen_healite_ore;

	public ModWorldGeneration() {
		this.gen_healite_ore = new WorldGenMinable(ModBlocks.healite_ore.getDefaultState(), 4, BlockHelper.forBlock(Blocks.end_stone));
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
			}
		}
}
