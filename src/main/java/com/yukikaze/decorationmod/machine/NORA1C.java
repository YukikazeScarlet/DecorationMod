package com.yukikaze.decorationmod.machine;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class NORA1C extends Block {
    public NORA1C(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".nora_1c");
        setRegistryName(DecorationMod.MODID,"nora_1c");
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
