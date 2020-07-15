package com.nekomaster1000.Infernal.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Dullstone extends Block {

    public Dullstone() {
        super(Block.Properties.create(Material.GLASS)
            // Add a . for block property options
                .hardnessAndResistance(4.0f, 5.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)



        );
    }
}
