package com.yukikaze.decorationmod.proxy;

import com.yukikaze.decorationmod.DecorationMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.SERVER, modid = DecorationMod.MODID)
public class ServerProxy extends CommonProxy{
}
