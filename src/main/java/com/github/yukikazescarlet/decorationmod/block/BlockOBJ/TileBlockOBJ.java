package com.github.yukikazescarlet.decorationmod.block.BlockOBJ;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileBlockOBJ extends TileEntity implements ITickable{

    public long rotation = 0;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
    }

    @Override
    public void update() {
        rotation+=5;
        if(rotation>=360)rotation-=360;
        System.out.println(new ModelResourceLocation(DecorationMod.DOMAIN+":blocks/monkey.obj"));
    }
}
