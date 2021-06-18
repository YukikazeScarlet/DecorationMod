package com.yukikaze.decorationmod.proxy;

import com.yukikaze.decorationmod.DecorationMod;
import com.yukikaze.decorationmod.block.BlockOBJ.RenderBlockOBJ;
import com.yukikaze.decorationmod.block.BlockOBJ.TileBlockOBJ;
import com.yukikaze.decorationmod.radar.navigationradar.ops20.OPS20Renderer;
import com.yukikaze.decorationmod.radar.navigationradar.ops20.TileOPS20;
import com.yukikaze.decorationmod.radar.navigationradar.ops39.OPS39Renderer;
import com.yukikaze.decorationmod.radar.navigationradar.ops39.TileOPS39;
import com.yukikaze.decorationmod.radar.surfaceradar.spq9b.SPQ9BRenderer;
import com.yukikaze.decorationmod.radar.surfaceradar.spq9b.TileSPQ9B;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = DecorationMod.MODID)
public class ClientProxy extends CommonProxy {

    /*@Override
    public void registerObjModels(ModelBakeEvent event) {
        IBakedModel bakedModel;
        ResourceLocation resourceLocation = new ResourceLocation(DecorationMod.DOMAIN+":item/sample.obj");
        try {
            IModel model = ModelLoaderRegistry.getModel(resourceLocation);
            bakedModel = model.bake(model.getDefaultState(), DefaultVertexFormats.ITEM, ModelLoader.defaultTextureGetter());

            event.getModelRegistry().putObject(DecorationMod.modelResourceLocation, bakedModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    @Override
    public void registerModels(ModelRegistryEvent event) {

        OBJLoader.INSTANCE.addDomain(DecorationMod.DOMAIN);

        /*ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(first_block), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "first_block"), "inventory"));//インベントリでのリソース//models/item
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block_json_obj),0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "block_json_obj"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block_obj), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "block_obj"), "inventory"));*/
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(link16_atn), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "link16_atn"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(nolq_3d_esm), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "nolq_3d_esm"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(nora_1c), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "nora_1c"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(norc_4b), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "norc_4b"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(norq_1), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "norq_1"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(orq_1), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "orq_1"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(orn_6), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "orn_6"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(usc_42), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "usc_42"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ops_20), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "ops_20"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ops_39), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "ops_39"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(spq_9b), 0,
                new ModelResourceLocation(new ResourceLocation(DecorationMod.DOMAIN, "spq_9b"), "inventory"));

        registerTileEntitySpecialRenderers();
    }
    private static void registerTileEntitySpecialRenderers(){
        //ClientRegistry.bindTileEntitySpecialRenderer(TileBlockOBJ.class, new RenderBlockOBJ());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOPS20.class, new OPS20Renderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileOPS39.class, new OPS39Renderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileSPQ9B.class, new SPQ9BRenderer());
    }
}
