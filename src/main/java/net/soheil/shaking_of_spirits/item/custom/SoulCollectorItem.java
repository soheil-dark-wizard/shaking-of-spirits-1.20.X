package net.soheil.shaking_of_spirits.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SoulCollectorItem extends Item {
    public SoulCollectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        int soul_bank = 0;

        if(entity.getName().equals("cow")){
            entity.kill();
            soul_bank += 1;
            player.sendSystemMessage(Component.literal("your souls are: " + soul_bank));


        }
        player.sendSystemMessage(Component.literal("your souls are: " + soul_bank));

        return false;
    }
}
