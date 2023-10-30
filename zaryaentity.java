package com.example.zaryaentity;

import com.example.zaryaentity.init.inititems;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(zaryaentity.MODID)
public class zaryaentity {
    public static final String MODID = "zaryaentity";
    public zaryaentity() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        inititems.ITEMS.register(bus);
    }
}
