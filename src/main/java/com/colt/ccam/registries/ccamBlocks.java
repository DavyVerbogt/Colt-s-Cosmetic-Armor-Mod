package com.colt.ccam.registries;

import java.util.function.Function;
import javax.annotation.Nullable;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.sewingstation.SewingStationBlock;
import com.colt.ccam.itemgroup.ccamItemGroup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ccamBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColtCosmeticArmorMod.MOD_ID);

    public static final RegistryObject<SewingStationBlock> SEWING_STATION = register("sewing_station", new SewingStationBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.0f).harvestTool(ToolType.PICKAXE).harvestLevel(1)), block -> new BlockItem(block, new Item.Properties().group(ccamItemGroup.CCAM_TAB)));
    
    private static <V extends Block> RegistryObject<V> register(String id, V block, @Nullable Function<V, BlockItem> item) {
		if(item != null) ccamItems.ITEMS.register(id, () -> item.apply(block));
		return BLOCKS.register(id, () -> block);
	}
}
