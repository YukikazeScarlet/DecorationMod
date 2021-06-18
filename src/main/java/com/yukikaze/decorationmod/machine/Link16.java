package com.yukikaze.decorationmod.machine;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Link16 extends Block {
    public Link16(){
        super(Material.ROCK);
        setUnlocalizedName(DecorationMod.MODID+".link16_atn");
        setRegistryName(DecorationMod.MODID,"link16_atn");
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

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileLink16();
    }
}
