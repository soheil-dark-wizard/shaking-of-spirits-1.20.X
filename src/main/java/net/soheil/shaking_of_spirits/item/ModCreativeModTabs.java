package net.soheil.shaking_of_spirits.item;

import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.soheil.shaking_of_spirits.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Shaking_Of_Spirits.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRAPPED_SOUL.get()))
                    .title(Component.translatable("creativetab.shaking_of_spirits_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TRAPPED_SOUL.get());

                        pOutput.accept(ModBlocks.TRAPPED_SOUL_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
