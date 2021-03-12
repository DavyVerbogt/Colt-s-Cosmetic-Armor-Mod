package com.colt.ccam.sewingstation;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class SewingStationBlock extends StonecutterBlock {

	private static final TranslationTextComponent TITLE = new TranslationTextComponent("container.sewing_station");

	public SewingStationBlock(AbstractBlock.Properties settings) {
		super(settings);
	}
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.isRemote) {
		   return ActionResultType.SUCCESS;
		} else {
		   player.openContainer(state.getContainer(worldIn, pos));
		   return ActionResultType.CONSUME;
		}
	 }
	 @Nullable
	 public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
		return new SimpleNamedContainerProvider((id, inventory, player) -> {
		   return new SewingStationContainer(id, inventory, IWorldPosCallable.of(worldIn, pos));
		}, TITLE);
	 }
}
