package com.yukikaze.decorationmod.machine;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class NOLQ3DESM extends Block {
    public NOLQ3DESM(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".nolq_3d_esm");
        setRegistryName(DecorationMod.MODID,"nolq_3d_esm");
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
