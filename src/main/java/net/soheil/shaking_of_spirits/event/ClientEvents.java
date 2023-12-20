package net.soheil.shaking_of_spirits.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.soheil.shaking_of_spirits.util.KeyBinding;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Shaking_Of_Spirits.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents{
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.BLACK_HOLE_KEY);
        }
        @SubscribeEvent
        private static void onKeyInput(InputEvent event){
            if (KeyBinding.BLACK_HOLE_KEY.consumeClick()){
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("pressed key!"));
            }
        }
    }
    @Mod.EventBusSubscriber(modid = Shaking_Of_Spirits.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents{
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.BLACK_HOLE_KEY);

        }

    }
}
