package com.yukikaze.decorationmod.radar.surfaceradar.spq9b;

import com.yukikaze.decorationmod.DecorationMod;
import com.yukikaze.decorationmod.modelLoader.ObjModelStruct;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class SPQ9BRenderer extends TileEntitySpecialRenderer<TileSPQ9B> {
    ObjModelStruct struct;
    @Override
    public void render(TileSPQ9B te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        bindTexture(new ResourceLocation(DecorationMod.DOMAIN,"textures/blocks/common1.png"));
        struct = te.struct;
        int rotation= te.getFacing();


        renderObj("body",x,y,z, rotation);

        renderObj("radar",x,y,z, te.yaw+ rotation);

    }

    private void renderObj(String part,double x, double y, double z,float yaw){

        GlStateManager.pushMatrix();
        GlStateManager.translate(x+0.5, y, z+0.5);
        BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
        bufferbuilder.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_TEX_NORMAL);
        GL11.glRotatef(yaw,0,1,0);

        int i=struct.hashMap.get(part);
        while (i<struct.hashMap.get(part+"End")){
            int v_num = (struct.xv.get(i)-1)*3;
            int vt_num = (struct.xvt.get(i)-1)*2;
            int vn_num = (struct.xvn.get(i)-1)*3;

            bufferbuilder.pos(struct.v.get(v_num), struct.v.get(v_num+1), struct.v.get(v_num+2))
                    .tex(struct.vt.get(vt_num), struct.vt.get(vt_num+1))
                    .normal(struct.vn.get(vn_num), struct.vn.get(vn_num+1), struct.vn.get(vn_num+2)).endVertex();
            i++;
        }
        Tessellator.getInstance().draw();
        GlStateManager.popMatrix();
    }
}
