package com.colt.ccam.armor;

import java.util.List;
import java.util.function.Supplier;

import com.colt.ccam.ColtCosmeticArmorMod;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.Lazy;

public enum ModArmorMaterial implements ArmorMaterial {

	// New armor types
	BASIC("basic", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	WITCH("witch", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	COLT("colt", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	TULIP("tulip", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of(Items.RED_TULIP, Items.ORANGE_TULIP, Items.WHITE_TULIP, Items.PINK_TULIP)),

	FLOWERCROWN("flowercrown", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of(Items.STRING)),

	COWBOYHAT("cowboyhat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	TRAFFICCONE("trafficcone", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	TOPHAT("tophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	SMALLTOPHAT("smalltophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	MONOCLE("monocle", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
			() -> Ingredient.of()),

	GLADIATOR("gladiator", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	CONSTRUCTION("construction", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	ARROW("arrow", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARROW_HIT, 0.0F, 0.0F,
			() -> Ingredient.of()),

	LONGSMALLTOPHAT("longsmalltophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F,
			0.0F, () -> Ingredient.of()),

	WOLFHIDE("wolfhide", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	TOPTOPTOPHAT("toptoptophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	LONGTOPHAT("longtophat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	MAJIMACONSTRUCTIONHAT("majimacontructionhat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON,
			0.0F, 0.0F, () -> Ingredient.of()),

	NACHOSOMBRARO("nachosombraro", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	SOMBRARO("sombraro", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	FURCOAT("furcoat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of()),

	SAMURAI("samurai", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	COW("cow", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
			() -> Ingredient.of()),

	SHOTCOWBOYHAT("shotcowboyhat", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
			() -> Ingredient.of());

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
	public int getDurabilityForSlot(EquipmentSlot slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public net.minecraft.sounds.SoundEvent getEquipSound() {
	return this.soundEvent;
	}

	@Override
	public Ingredient getRepairIngredient() {
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
