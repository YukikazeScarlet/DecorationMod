package com.yukikaze.decorationmod.machine;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ORN6 extends Block {
    public ORN6(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".orn_6");
        setRegistryName(DecorationMod.MODID,"orn_6");
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
