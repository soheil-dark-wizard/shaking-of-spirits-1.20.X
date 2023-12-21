package net.soheil.shaking_of_spirits.networking.packet;


import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;
import net.soheil.shaking_of_spirits.mana.PlayerMana;
import net.soheil.shaking_of_spirits.mana.PlayerManaProvider;

import java.util.function.Supplier;

public class ExamoleC2SPacket {
    public ExamoleC2SPacket(){

    }
    public ExamoleC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            ServerLevel level = player.serverLevel().getLevel();
            int mana = PlayerMana.getMana();
            if (mana >= 5) {
                EntityType.IRON_GOLEM.spawn(level, (ItemStack) null, null, player.blockPosition(),
                        MobSpawnType.COMMAND, true, false);
                PlayerMana.subMana(5);
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("your mana now is:" + PlayerMana.getMana()));
            }
        });
        return true;
    }
}