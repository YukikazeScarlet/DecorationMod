package com.yukikaze.decorationmod;

import com.yukikaze.decorationmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod(modid = DecorationMod.MODID, version = DecorationMod.VERSION, name = DecorationMod.MODNAME)
public class DecorationMod {

    public static final String MODID = "decorationmod";
    public static final String VERSION = "1.0.0";
    public static final String MODNAME = "Decoration Mod";
    public static final String DOMAIN = "decorationmod";

    //public static final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(DecorationMod.DOMAIN+":blocks/monkey.obj");

    @SidedProxy(clientSide = "com.yukikaze.decorationmod.proxy.ClientProxy", serverSide = "com.yukikaze.decorationmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs TabDecoration = new TabDecoration("TabDecoration");

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        proxy.registerItems(event);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        proxy.registerBlocks(event);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        proxy.registerModels(event);
    }

    /*@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onModelBakeEvent(ModelBakeEvent event)
    {
        proxy.registerObjModels(event);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onTextureStitchEvent(TextureStitchEvent.Pre event)
    {
        event.getMap().registerSprite(new ResourceLocation(DecorationMod.DOMAIN,"blocks/monkey"));
        System.out.println("ResourceLocationLoaded!!");
    }*/

}
