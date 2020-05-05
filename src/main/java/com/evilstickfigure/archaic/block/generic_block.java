package com.evilstickfigure.archaic.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class generic_block extends Block {
    public generic_block() {
        super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(4.0f, 0.8f)
            .harvestLevel(2)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
        );
    }

}
