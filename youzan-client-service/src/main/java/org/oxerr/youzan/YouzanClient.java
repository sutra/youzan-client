package org.oxerr.youzan;

import org.oxerr.youzan.service.CouponService;
import org.oxerr.youzan.service.ItemService;
import org.oxerr.youzan.service.ShopService;
import org.oxerr.youzan.service.TradeService;

import com.kdt.api.KdtApiClient;

public class YouzanClient {

	private final KdtApiClient kdtApiClient;
	private final ItemService itemService;
	private final ShopService shopService;
	private final CouponService couponService;
	private final TradeService tradeService;

	public YouzanClient(String appId, String appSecret) {
		try {
			this.kdtApiClient = new KdtApiClient(appId, appSecret);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		this.itemService = new ItemService(kdtApiClient);
		this.shopService = new ShopService(kdtApiClient);
		this.couponService = new CouponService(kdtApiClient);
		this.tradeService = new TradeService(kdtApiClient);
	}

	public ItemService getItemService() {
		return itemService;
	}

	public ShopService getShopService() {
		return shopService;
	}

	public CouponService getCouponService() {
		return couponService;
	}

	public TradeService getTradeService() {
		return tradeService;
	}

}
