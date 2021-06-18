package com.yukikaze.decorationmod.block.BlockOBJ;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.model.TRSRTransformation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderBlockOBJ extends TileEntitySpecialRenderer{

    private IModel model;
    private IBakedModel bakedModel;
    private static final ResourceLocation TEX = new ResourceLocation(DecorationMod.DOMAIN+":textures/blocks/monkey.png");

    private IBakedModel getBakedModel(){
        if(bakedModel == null){
            try {
                model = ModelLoaderRegistry.getModel(new ResourceLocation(DecorationMod.DOMAIN,"block/monkey.obj"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            bakedModel = model.bake(TRSRTransformation.identity(), DefaultVertexFormats.BLOCK,
                    resourceLocation -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(resourceLocation.toString()));
        }
        return bakedModel;
        //return Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getModelManager().getModel(DecorationMod.modelResourceLocation);
    }

    @Override
    public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        GlStateManager.translate(x+0.5f, y, z+0.5f);

        TileBlockOBJ te2 = (TileBlockOBJ) te;
        GlStateManager.rotate(te2.rotation, 0, 1, 0);

        renderBody((TileBlockOBJ) te, x, y, z, partialTicks, destroyStage);

        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    public void renderBody(TileBlockOBJ te, double x, double y, double z, float ticks, int stage){
        GlStateManager.pushAttrib();
        GlStateManager.pushMatrix();
        GlStateManager.enableLighting();

        RenderHelper.disableStandardItemLighting();
        this.bindTexture(TEX);

        World world = getWorld();
        GlStateManager.translate(-te.getPos().getX(), -te.getPos().getY(), -te.getPos().getZ());

        Tessellator tessellator = Tessellator.getInstance();
        tessellator.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_NORMAL);
        Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModel(
                world,
                getBakedModel(),
                world.getBlockState(te.getPos()),
                te.getPos(),
                Tessellator.getInstance().getBuffer(), false);
        tessellator.draw();

        GlStateManager.disableBlend();
        GlStateManager.translate(te.getPos().getX(), te.getPos().getY(), te.getPos().getZ());
        GlStateManager.disableLighting();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }
}
