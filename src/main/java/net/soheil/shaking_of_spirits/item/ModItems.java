package net.soheil.shaking_of_spirits.item;

import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shaking_Of_Spirits.MOD_ID);

    public static final RegistryObject<Item> TRAPPED_SOUL = ITEMS.register("trapped_soul",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
