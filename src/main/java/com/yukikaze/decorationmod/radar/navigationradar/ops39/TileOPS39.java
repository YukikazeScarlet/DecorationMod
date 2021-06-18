package com.yukikaze.decorationmod.radar.navigationradar.ops39;

import com.yukikaze.decorationmod.modelLoader.ObjModelLoader;
import com.yukikaze.decorationmod.modelLoader.ObjModelStruct;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

public class TileOPS39 extends TileEntity implements ITickable{
    float rpm = 10*360;
    float yaw;
    float pitch;
    ObjModelLoader objModelLoader = new ObjModelLoader("block\\ops_39.obj");
    ObjModelStruct struct = objModelLoader.openFile();

    public TileOPS39(){
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
        EnumFacing facing = this.world.getBlockState(this.pos).getValue(OPS39.FACING);
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
