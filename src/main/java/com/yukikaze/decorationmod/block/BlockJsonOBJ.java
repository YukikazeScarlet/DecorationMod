package com.yukikaze.decorationmod.block;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockJsonOBJ extends Block {
    public BlockJsonOBJ(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".block_json_obj");
        setRegistryName(DecorationMod.MODID,"block_json_obj");
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
