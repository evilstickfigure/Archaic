package com.evilstickfigure.archaic;

import com.evilstickfigure.archaic.block.generic_block;
import com.evilstickfigure.archaic.item.*;
import com.evilstickfigure.archaic.item.block.generic_block_item;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> GENERIC_BLOCK = BLOCKS.register("generic_block", generic_block::new);
    // Block Items
    public static final RegistryObject<Item> GENERIC_BLOCK_ITEM = ITEMS.register("generic_block", () -> new generic_block_item(GENERIC_BLOCK.get()));
    // Items
    public static final RegistryObject<Item> GENERIC_ITEM = ITEMS.register("generic_item", generic_item::new);
    public static final RegistryObject<Item> ARCHAIC_ATLAS = ITEMS.register("archaic_atlas", archaic_atlas::new);
    public static final RegistryObject<Item> DUSTY_BOOK = ITEMS.register("dusty_book", dusty_book::new);
    public static final RegistryObject<Item> WEATHERED_BATTLEAXE = ITEMS.register("weathered_battleaxe", weathered_battleaxe::new);
    public static final RegistryObject<Item> ANCIENT_ALLOY = ITEMS.register("ancient_alloy", ancient_alloy::new);

    // Creative Tabs
    public static final ItemGroup ARCHAIC_COMBAT_TAB = new ItemGroup("archaic_combat_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WEATHERED_BATTLEAXE.get());
        }
    };
    public static final ItemGroup ARCHAIC_GENERAL_TAB = new ItemGroup("archaic_general_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ARCHAIC_ATLAS.get());
        }
    };
}
