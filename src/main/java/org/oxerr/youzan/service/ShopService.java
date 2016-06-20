package org.oxerr.youzan.service;

import java.io.IOException;

import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.Shop;

import com.kdt.api.KdtApiClient;

public class ShopService extends BaseService {

	public ShopService(KdtApiClient client) {
		super(client);
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.shop.basic.get&apiId=6669">获取店铺基本信息</a>.
	 *
	 * @return 店铺基本信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public Shop getShop() throws IOException, YouzanException {
		final Shop shop = readValue("kdt.shop.basic.get", null, SHOP_RESPONSE_TYPE_REF);
		return shop;
	}

}
