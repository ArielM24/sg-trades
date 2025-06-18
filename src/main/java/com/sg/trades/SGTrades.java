package com.sg.trades;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers.BuyItemFactory;
import net.minecraft.village.TradeOffers.SellItemFactory;
import net.minecraft.village.VillagerProfession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SGTrades implements ModInitializer {
	public static final String MOD_ID = "sgtrades";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// ARMORER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, (consumer) -> {
			consumer.add(new SellItemFactory(Items.DIAMOND_HORSE_ARMOR, 20, 1, 4, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, (consumer) -> {
			consumer.add(new SellItemFactory(Items.IRON_HORSE_ARMOR, 10, 1, 4, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, (consumer) -> {
			consumer.add(new SellItemFactory(Items.GOLDEN_HORSE_ARMOR, 10, 1, 4, 1));
		});
		// BUTCHER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.EGG, 16, 12, 1, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.BLUE_EGG, 16, 12, 1, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.BROWN_EGG, 16, 12, 1, 1));
		});
		// CARTOGRAPHER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.BRUSH, 16, 1, 4, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.GLOW_ITEM_FRAME, 5, 1, 12, 1));
		});
		// CLERIC
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, (consumer) -> {
			consumer.add(new SellItemFactory(Items.AMETHYST_SHARD, 1, 4, 16, 1));
		});
		// FARMER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.GLOW_BERRIES, 16, 4, 1, 1));
		});
		// FISHERMAN
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.TROPICAL_FISH_BUCKET, 16, 1, 4, 1));
		});
		// FLETCHER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.ARROW, 16, 4, 4, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.SPECTRAL_ARROW, 16, 4, 1, 10));
		});
		// LEATHERWORKER
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.BUNDLE, 16, 1, 4, 1));
		});
		// LIBRARIAN
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.WRITABLE_BOOK, 16, 1, 4, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.GLOW_INK_SAC, 5, 12, 1, 1));
		});
		// MASON
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, (consumer) -> {
			consumer.add(new SellItemFactory(Items.CLAY, 1, 2, 16, 1));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.RESIN_BRICK, 1, 16, 1, 1));
		});
		// SHEPHERD
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, (consumer) -> {
			consumer.add(new SellItemFactory(Items.STRING, 1, 4, 8, 1));
		});
		// TOOLSMITH
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, (consumer) -> {
			consumer.add(new BuyItemFactory(Items.COPPER_INGOT, 1, 12, 1, 1));
		});
		// WEAPONSMITH
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, (consumer) -> {
			consumer.add(new SellItemFactory(Items.TNT, 1, 4, 4, 1));
		});
	}
}