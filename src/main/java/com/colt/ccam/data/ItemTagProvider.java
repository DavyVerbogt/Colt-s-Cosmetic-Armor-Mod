package com.colt.ccam.data;

import com.colt.ccam.registries.ccamItems;
import com.colt.ccam.registries.ccamTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public class ItemTagProvider extends ItemTagsProvider {

	public ItemTagProvider(DataGenerator generatorIn, BlockTagsProvider blockTagsProviderIn) {
		super(generatorIn, blockTagsProviderIn);
	}

	@Override
	protected void registerTags() {
		getOrCreateBuilder(Tags.Items.INGOTS).addTag(ccamTags.Items.HELMET_PART);

		getOrCreateBuilder(ccamTags.Items.HELMET_PART).add(ccamItems.BASIC_HELMET.get());
		
	}
}
