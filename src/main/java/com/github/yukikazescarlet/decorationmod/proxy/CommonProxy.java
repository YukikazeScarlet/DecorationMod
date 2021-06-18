package com.github.yukikazescarlet.decorationmod.proxy;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import com.github.yukikazescarlet.decorationmod.machine.*;
import com.github.yukikazescarlet.decorationmod.radar.navigationradar.ops20.OPS20;
import com.github.yukikazescarlet.decorationmod.radar.navigationradar.ops20.TileOPS20;
import com.github.yukikazescarlet.decorationmod.radar.navigationradar.ops39.OPS39;
import com.github.yukikazescarlet.decorationmod.radar.navigationradar.ops39.TileOPS39;
import com.github.yukikazescarlet.decorationmod.radar.surfaceradar.spq9b.SPQ9B;
import com.github.yukikazescarlet.decorationmod.radar.surfaceradar.spq9b.TileSPQ9B;
import com.yukikaze.decorationmod.block.*;
import com.yukikaze.decorationmod.machine.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    //public static final Block first_block = new FirstBlock();
    //public static final Block block_json_obj = new BlockJsonOBJ();
    //public static final Block block_obj = new BlockOBJ();
    public static final Block link16_atn = new Link16();
    public static final Block nolq_3d_esm = new NOLQ3DESM();
    public static final Block nora_1c = new NORA1C();
    public static final Block norc_4b = new NORC4B();
    public static final Block norq_1 = new NORQ1();
    public static final Block orq_1 = new ORQ1();
    public static final Block orn_6 = new ORN6();
    public static final Block usc_42 = new USC42();
    public static final Block ops_20 = new OPS20();
    public static final Block ops_39 = new OPS39();
    public static final Block spq_9b = new SPQ9B();

    public void registerItems(RegistryEvent.Register<Item> event) {
        //event.getRegistry().register(new ItemBlock(first_block).setRegistryName(DecorationMod.MODID,"first_block"));
        //event.getRegistry().register(new ItemBlock(block_json_obj).setRegistryName(DecorationMod.MODID,"block_json_obj"));
        //event.getRegistry().register(new ItemBlock(block_obj).setRegistryName(DecorationMod.MODID,"block_obj"));
        event.getRegistry().register(new ItemBlock(link16_atn).setRegistryName(DecorationMod.MODID,"link16_atn"));
        event.getRegistry().register(new ItemBlock(nolq_3d_esm).setRegistryName(DecorationMod.MODID,"nolq_3d_esm"));
        event.getRegistry().register(new ItemBlock(nora_1c).setRegistryName(DecorationMod.MODID,"nora_1c"));
        event.getRegistry().register(new ItemBlock(norc_4b).setRegistryName(DecorationMod.MODID,"norc_4b"));
        event.getRegistry().register(new ItemBlock(norq_1).setRegistryName(DecorationMod.MODID,"norq_1"));
        event.getRegistry().register(new ItemBlock(orq_1).setRegistryName(DecorationMod.MODID,"orq_1"));
        event.getRegistry().register(new ItemBlock(orn_6).setRegistryName(DecorationMod.MODID,"orn_6"));
        event.getRegistry().register(new ItemBlock(usc_42).setRegistryName(DecorationMod.MODID,"usc_42"));
        event.getRegistry().register(new ItemBlock(ops_20).setRegistryName(DecorationMod.MODID,"ops_20"));
        event.getRegistry().register(new ItemBlock(ops_39).setRegistryName(DecorationMod.MODID,"ops_39"));
        event.getRegistry().register(new ItemBlock(spq_9b).setRegistryName(DecorationMod.MODID,"spq_9b"));
    }

    public void registerBlocks(RegistryEvent.Register<Block> event) {
        //event.getRegistry().register(first_block);
        //event.getRegistry().register(block_json_obj);
        //event.getRegistry().register(block_obj);
        event.getRegistry().register(link16_atn);
        event.getRegistry().register(nolq_3d_esm);
        event.getRegistry().register(nora_1c);
        event.getRegistry().register(norc_4b);
        event.getRegistry().register(norq_1);
        event.getRegistry().register(orq_1);
        event.getRegistry().register(orn_6);
        event.getRegistry().register(usc_42);
        event.getRegistry().register(ops_20);
        event.getRegistry().register(ops_39);
        event.getRegistry().register(spq_9b);

        registerTileEntity();

    }

    public void registerModels(ModelRegistryEvent event) {
    }

    private static void registerTileEntity() {
        //GameRegistry.registerTileEntity(TileBlockOBJ.class, new ResourceLocation(DecorationMod.DOMAIN,":blocks/monkey.obj"));
        GameRegistry.registerTileEntity(TileLink16.class,new ResourceLocation(DecorationMod.DOMAIN,":blocks/link16_atn"));
        GameRegistry.registerTileEntity(TileOPS20.class,new ResourceLocation(DecorationMod.DOMAIN,":blocks/ops_20"));
        GameRegistry.registerTileEntity(TileOPS39.class,new ResourceLocation(DecorationMod.DOMAIN,":blocks/ops_39"));
        GameRegistry.registerTileEntity(TileSPQ9B.class,new ResourceLocation(DecorationMod.DOMAIN,":blocks/spq_9b"));
    }


    //abstract public void registerObjModels(ModelBakeEvent event);
}
