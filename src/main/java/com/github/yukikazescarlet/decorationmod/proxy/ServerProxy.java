package com.github.yukikazescarlet.decorationmod.proxy;

import com.github.yukikazescarlet.decorationmod.DecorationMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.SERVER, modid = DecorationMod.MODID)
public class ServerProxy extends CommonProxy{
}
