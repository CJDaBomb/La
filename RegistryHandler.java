package com.nekomaster1000.Infernal.util;
import com.nekomaster1000.Infernal.InfernalExpansion;
import com.nekomaster1000.Infernal.blocks.*;
import com.nekomaster1000.Infernal.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfernalExpansion.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InfernalExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> GLOWCOAL = ITEMS.register("glowcoal", ItemBase::new);
    public static final RegistryObject<Item> DIMROCKS = ITEMS.register("glownuggets", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> DIMSTONE = BLOCKS.register("dimstone", Dimstone::new);
    public static final RegistryObject<Block> DULLSTONE = BLOCKS.register("dullstone", Dullstone::new);
    public static final RegistryObject<Block> chiselled_dimstone_brick1 = BLOCKS.register("chiselled_dimstone_brick1", chiselledDimstoneBrick1::new);
    public static final RegistryObject<Block> chiselled_dimstone_brick2 = BLOCKS.register("chiselled_dimstone_brick2", chiselledDimstoneBrick2::new);
    public static final RegistryObject<Block> chiselled_dullstone_brick1 = BLOCKS.register("chiselled_dullstone_brick1", chiselledDullstoneBrick1::new);
    public static final RegistryObject<Block> chiselled_dullstone_brick2 = BLOCKS.register("chiselled_dullstone_brick2", chiselledDullstoneBrick2::new);

    //Block Items
    public static final RegistryObject<Item> DIMSTONE_ITEM = ITEMS.register("dimstone", () -> new BlockItemBase(DIMSTONE.get()));
    public static final RegistryObject<Item> chiselled_dimstone_brick_Item1 = ITEMS.register("chiselled_dimstone_brick1", () -> new BlockItemBase(chiselled_dimstone_brick1.get()));
    public static final RegistryObject<Item> chiselled_dimstone_brick_Item2 = ITEMS.register("chiselled_dimstone_brick2", () -> new BlockItemBase(chiselled_dimstone_brick2.get()));
    public static final RegistryObject<Item> chiselled_dullstone_brick_Item1 = ITEMS.register("chiselled_dullstone_brick1", () -> new BlockItemBase(chiselled_dullstone_brick1.get()));
    public static final RegistryObject<Item> chiselled_dullstone_brick_Item2 = ITEMS.register("chiselled_dullstone_brick2", () -> new BlockItemBase(chiselled_dullstone_brick2.get()));
}
