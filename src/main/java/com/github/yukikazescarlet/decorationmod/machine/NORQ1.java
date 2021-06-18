package com.github.yukikazescarlet.decorationmod.machine;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class NORQ1 extends Block {
    public NORQ1(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".norq_1");
        setRegistryName(DecorationMod.MODID,"norq_1");
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
