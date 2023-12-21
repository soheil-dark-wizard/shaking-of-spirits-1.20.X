package net.soheil.shaking_of_spirits.networking;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.soheil.shaking_of_spirits.networking.packet.ExamoleC2SPacket;

public class ModMessages {
    private static SimpleChannel INSTANCE;

    private static int packedId = 0;
    private static int Id(){
        return packedId++;
    }
    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Shaking_Of_Spirits.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();
        INSTANCE = net;

        net.messageBuilder(ExamoleC2SPacket.class, packedId, NetworkDirection.PLAY_TO_SERVER)
                .decoder(ExamoleC2SPacket::new)
                .encoder(ExamoleC2SPacket::toBytes)
                .consumerMainThread(ExamoleC2SPacket::handle)
                .add();


    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }
    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
