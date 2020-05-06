package com.evilstickfigure.archaic.item;

import com.evilstickfigure.archaic.Main;
import com.evilstickfigure.archaic.RegistryHandler;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;

public class weathered_battleaxe extends AxeItem {

    public weathered_battleaxe() {
        // Same as Diamond, select AxeItem then find usages to see vanilla values
        super(ItemTier.DIAMOND, 5.0F, -3.0F, new Item.Properties().group(RegistryHandler.ARCHAIC_COMBAT_TAB));
    }

}