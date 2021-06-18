package com.github.yukikazescarlet.decorationmod.block;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock(){
        super(Material.IRON);
        setUnlocalizedName(DecorationMod.MODID + ".first_block");
        setRegistryName(DecorationMod.MODID,"first_block");
        setCreativeTab(DecorationMod.TabDecoration);
    }
}
