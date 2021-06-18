package com.github.yukikazescarlet.decorationmod.radar.surfaceradar.spq9b;

import com.github.yukikazescarlet.decorationmod.modelLoader.ObjModelStruct;
import com.github.yukikazescarlet.decorationmod.modelLoader.ObjModelLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

public class TileSPQ9B extends TileEntity implements ITickable{
    float rpm = 10*360;
    float yaw;
    float pitch;
    ObjModelLoader objModelLoader = new ObjModelLoader("block\\spq_9b.obj");
    ObjModelStruct struct = objModelLoader.openFile();

    public TileSPQ9B(){
    }

    @Override
    public void onLoad() {
    }

    @Override
    public void update() {
        yaw+=(rpm/60.0)/20.0;
    }

    public int getFacing(){
        int rotation=0;
        EnumFacing facing = this.world.getBlockState(this.pos).getValue(SPQ9B.FACING);
        switch (facing){
            case NORTH:
                rotation = 180;
                break;
            case WEST:
                rotation = 270;
                break;
            case SOUTH:
                rotation = 0;
                break;
            case EAST:
                rotation = 90;
        }
        return rotation;
    }
}
