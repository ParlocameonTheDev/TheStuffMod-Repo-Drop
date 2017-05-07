package com.CoolParker15.TheStuffMod.proxy;

import com.CoolParker15.TheStuffMod.init.ModBlocks;
import com.CoolParker15.TheStuffMod.init.ModItems;
import com.CoolParker15.TheStuffMod.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}

