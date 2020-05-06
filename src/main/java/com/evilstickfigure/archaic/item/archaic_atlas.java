package com.evilstickfigure.archaic.item;

import com.evilstickfigure.archaic.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class archaic_atlas extends Item {
    public archaic_atlas() {
        super(new Item.Properties().group(RegistryHandler.ARCHAIC_GENERAL_TAB));
    }
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.openBook(itemstack, handIn);
        playerIn.addStat(Stats.ITEM_USED.get(this));
        return ActionResult.resultSuccess(itemstack);
    }
}