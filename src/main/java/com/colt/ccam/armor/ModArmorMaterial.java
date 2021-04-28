package com.colt.ccam.armor;

import java.util.List;
import java.util.function.Supplier;

import com.colt.ccam.ColtCosmeticArmorMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.Lazy;
import com.colt.ccam.data.ConfigData;

public enum ModArmorMaterial implements IArmorMaterial {

	// New armor types
	BASIC("basic", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	WITCH("witch", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	COLT("colt", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	TULIP("tulip", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems(Items.RED_TULIP, Items.ORANGE_TULIP, Items.WHITE_TULIP, Items.PINK_TULIP)),

	FLOWERCROWN("flowercrown", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems(Items.STRING)),

	COWBOYHAT("cowboyhat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	TRAFFICCONE("trafficcone", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	TOPHAT("tophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	SMALLTOPHAT("smalltophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	MONOCLE("monocle", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	GLADIATOR("gladiator", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	CONSTRUCTION("construction", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	ARROW("arrow", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ENTITY_ARROW_HIT, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	LONGSMALLTOPHAT("longsmalltophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F,
			0.0F, () -> Ingredient.fromItems()),

	WOLFHIDE("wolfhide", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	TOPTOPTOPHAT("toptoptophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	LONGTOPHAT("longtophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	MAJIMACONSTRUCTIONHAT("majimacontructionhat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F, 0.0F, () -> Ingredient.fromItems()),

	NACHOSOMBRARO("nachosombraro", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	SOMBRARO("sombraro", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems()),

	FURCOAT("furcoat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.fromItems());

	// Stuff that is needed
	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairMaterialLazy;

	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn,
			int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistanceIn,
			Supplier<Ingredient> repairMaterialSupplier) {
		this.name = ColtCosmeticArmorMod.MOD_ID + ":" + nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountArrayIn;
		this.enchantability = enchantabilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.knockbackResistance = knockbackResistanceIn;
		this.repairMaterialLazy = Lazy.concurrentOf(repairMaterialSupplier);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterialLazy.get();
	}

	@OnlyIn(Dist.CLIENT)
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
