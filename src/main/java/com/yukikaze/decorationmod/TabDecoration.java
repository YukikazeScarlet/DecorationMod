package com.yukikaze.decorationmod;

import com.yukikaze.decorationmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabDecoration extends CreativeTabs {
    public TabDecoration(String label){
        super(label);
    }

    public ItemStack getTabIconItem(){
        return new ItemStack(Item.getItemFromBlock(CommonProxy.usc_42));
    }
}
