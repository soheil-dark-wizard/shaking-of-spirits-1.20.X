package net.soheil.shaking_of_spirits.init;

import net.minecraft.world.entity.Saddleable;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public interface ModAttributes {
    DeferredRegister<Attribute> REGISTRY = Shaking_Of_Spirits.makeRegistry(ForgeRegistries.ATTRIBUTES);
    private static RegistryObject<Attribute> register(String name, double initValue, double minValue, double maxValue) {
        return REGISTRY.register("generic." + name, ()-> new RangedAttribute("generic." + name, initValue, minValue, maxValue).setSyncable(true));
    }

    private static RegistryObject<Attribute> register0Max(String name, double initValue) {
        return register(name, initValue, 0, Double.MAX_VALUE);
    }

    //Defensive Stats

    RegistryObject<Attribute> MAGIC_DEFENCE = register0Max("magic_defence", 0);




    //Mana
    RegistryObject<Attribute> MAX_MANA = register0Max("max_mana", 0);
    RegistryObject<Attribute> MANA = register0Max("mana", 100);
    RegistryObject<Attribute> MANA_COST = register("mana_cost", 0, 0, 100000);
    RegistryObject<Attribute> MANA_REGEN = register0Max("mana_regen", 0);
}