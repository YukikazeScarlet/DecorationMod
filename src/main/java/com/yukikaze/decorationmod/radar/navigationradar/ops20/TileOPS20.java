package com.yukikaze.decorationmod.radar.navigationradar.ops20;

import com.yukikaze.decorationmod.modelLoader.ObjModelLoader;
import com.yukikaze.decorationmod.modelLoader.ObjModelStruct;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

public class TileOPS20 extends TileEntity implements ITickable{
    float rpm = 30*360;
    float yaw;
    float pitch;
    ObjModelLoader objModelLoader = new ObjModelLoader("block\\ops_20.obj");
    ObjModelStruct struct = objModelLoader.openFile();

    public TileOPS20(){
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
        EnumFacing facing = this.world.getBlockState(this.pos).getValue(OPS20.FACING);
        switch (facing){
            case NORTH:
                rotation = 0;
                break;
            case WEST:
                rotation = 90;
                break;
            case SOUTH:
                rotation = 180;
                break;
            case EAST:
                rotation = 270;
        }
        return rotation;
    }
}
