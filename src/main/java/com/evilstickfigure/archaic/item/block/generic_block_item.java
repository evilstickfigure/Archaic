package com.evilstickfigure.archaic.item.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class generic_block_item extends BlockItem {
    public generic_block_item(Block block){
        super(block,new Item.Properties().group(ItemGroup.SEARCH));
    }
}
