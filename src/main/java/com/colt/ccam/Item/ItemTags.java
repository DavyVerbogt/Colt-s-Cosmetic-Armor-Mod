package com.colt.ccam.Item;

import com.colt.ccam.ColtCosmeticArmorMod;
import com.colt.ccam.registries.ccamItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.stream.Collectors;

public class ItemTags extends ItemTagsProvider {

    private static final TagKey<Item> BELT = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "belt"));
    private static final TagKey<Item> CURIO = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "curio"));
    private static final TagKey<Item> FEET = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "feet"));
    private static final TagKey<Item> HANDS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "hands"));
    private static final TagKey<Item> HEAD = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "head"));
    private static final TagKey<Item> NECKLACE = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "necklace"));
    private static final TagKey<Item> TAIL = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CuriosApi.MODID, "tail"));

    public ItemTags(DataGenerator p_126530_, BlockTagsProvider p_126531_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, ColtCosmeticArmorMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {
        tag(HEAD).add(
                ccamItems.CAT_EARS.get()
        );
    }
}
