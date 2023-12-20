package net.soheil.shaking_of_spirits.item;

import net.minecraft.world.item.ArmorItem;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soheil.shaking_of_spirits.item.custom.MetalDetectorItem;
import net.soheil.shaking_of_spirits.item.custom.GhostArmorMaterials;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shaking_Of_Spirits.MOD_ID);

    public static final RegistryObject<Item> TRAPPED_SOUL = ITEMS.register("trapped_soul",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> SOUL_COLLECTOR = ITEMS.register("soul_collector",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_SHARD = ITEMS.register("soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASHES_OF_SOUL = ITEMS.register("ashes_of_soul",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GHOST_HELMET = ITEMS.register("ghost_helmet",
            () -> new ArmorItem(GhostArmorMaterials.SOUL_SHARD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_CHESTPLATE = ITEMS.register("ghost_chestplate",
            () -> new ArmorItem(GhostArmorMaterials.SOUL_SHARD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_LEGGINGS = ITEMS.register("ghost_leggings",
            () -> new ArmorItem(GhostArmorMaterials.SOUL_SHARD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_BOOTS = ITEMS.register("ghost_boots",
            () -> new ArmorItem(GhostArmorMaterials.SOUL_SHARD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
