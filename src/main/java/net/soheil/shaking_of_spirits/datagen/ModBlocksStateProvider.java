package net.soheil.shaking_of_spirits.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.soheil.shaking_of_spirits.block.ModBlocks;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Shaking_Of_Spirits.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TRAPPED_SOUL_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
