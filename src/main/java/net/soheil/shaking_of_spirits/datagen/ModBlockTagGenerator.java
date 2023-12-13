package net.soheil.shaking_of_spirits.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.soheil.shaking_of_spirits.Shaking_Of_Spirits;
import net.soheil.shaking_of_spirits.block.ModBlocks;
import net.soheil.shaking_of_spirits.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Shaking_Of_Spirits.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TRAPPED_SOUL_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TRAPPED_SOUL_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TRAPPED_SOUL_BLOCK.get());


    }
}
