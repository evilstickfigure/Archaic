package com.evilstickfigure.archaic;

import com.evilstickfigure.archaic.block.generic_block;
import com.evilstickfigure.archaic.item.archaic_atlas;
import com.evilstickfigure.archaic.item.block.generic_block_item;
import com.evilstickfigure.archaic.item.generic_item;
import com.evilstickfigure.archaic.item.weathered_battleaxe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> GENERIC_BLOCK = BLOCKS.register("generic_block", generic_block::new);
    //Block Items
    public static final RegistryObject<Item> GENERIC_BLOCK_ITEM = ITEMS.register("generic_block", () -> new generic_block_item(GENERIC_BLOCK.get()));
    //Items
    public static final RegistryObject<Item> GENERIC_ITEM = ITEMS.register("generic_item", generic_item::new);
    public static final RegistryObject<Item> ARCHAIC_ATLAS = ITEMS.register("archaic_atlas", archaic_atlas::new);
    public static final RegistryObject<Item> ANCIENT_SMELT = ITEMS.register("ancient_smelt", ancient_smelt::new);
        //Weapons
    public static final RegistryObject<Item> WEATHERED_BATTLEAXE = ITEMS.register("weathered_battleaxe", weathered_battleaxe::new);
    //public static final RegistryObject<Item> WEATHERED_SPEAR = ITEMS.register("weathered_spear", weathered_spear::new);
    //public static final RegistryObject<Item> WEATHERED_DAGGER = ITEMS.register("weathered_dagger", weathered_dagger::new);
    //public static final RegistryObject<Item> WEATHERED_SWORD = ITEMS.register("weathered_sword", weathered_sword::new);
}