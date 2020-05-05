package com.evilstickfigure.archaic;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final RegistryObject<Item> GENERIC = ITEMS.register("generic",
            () -> new Item(new Item.Properties().group(ItemGroup.SEARCH)));
}
