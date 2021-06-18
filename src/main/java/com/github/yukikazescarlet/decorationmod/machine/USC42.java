package com.github.yukikazescarlet.decorationmod.machine;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class USC42 extends Block {
    public USC42(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".usc_42");
        setRegistryName(DecorationMod.MODID,"usc_42");
        setCreativeTab(DecorationMod.TabDecoration);
    }
    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }
    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos){
        return false;
    }
}
