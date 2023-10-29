package com.example.zaryaentity.init;

import com.example.zaryaentity.zaryaentity;
import net.minecraft.util.profiling.metrics.profiling.InactiveMetricsRecorder;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class inititems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, zaryaentity.MODID
    );
    public static final RegistryObject<Item> POKEBOLA = ITEMS.register(
            name:"Pokebola", () -> new item
    )
