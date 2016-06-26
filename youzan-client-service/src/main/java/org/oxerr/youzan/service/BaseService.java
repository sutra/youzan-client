package org.oxerr.youzan.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.http.HttpResponse;
import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.Response;
import org.oxerr.youzan.dto.Success;
import org.oxerr.youzan.dto.item.Item;
import org.oxerr.youzan.dto.item.Items;
import org.oxerr.youzan.dto.item.SelfFetchTrade;
import org.oxerr.youzan.dto.item.Sku;
import org.oxerr.youzan.dto.item.Skus;
import org.oxerr.youzan.dto.item.Trade;
import org.oxerr.youzan.dto.item.Trades;
import org.oxerr.youzan.dto.shop.Shop;
import org.oxerr.youzan.dto.ump.Coupon;
import org.oxerr.youzan.dto.ump.CouponConsume;
import org.oxerr.youzan.dto.ump.Coupons;
import org.oxerr.youzan.dto.ump.TimelimitedDiscounts;
import org.oxerr.youzan.dto.ump.Verifylogs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kdt.api.KdtApiClient;

abstract class BaseService {

	private static final HashMap<String, String> EMPTY_PARAMS = new HashMap<>(0);

	protected static final TypeReference<Response<Success>> SUCCESS_RESPONSE_TYPE_REF = new TypeReference<Response<Success>>() {};
	protected static final TypeReference<Response<Item>> ITEM_RESPONSE_TYPE_REF = new TypeReference<Response<Item>>() {};
	protected static final TypeReference<Response<Items>> ITEMS_RESPONSE_TYPE_REF = new TypeReference<Response<Items>>() {};
	protected static final TypeReference<Response<Sku>> SKU_RESPONSE_TYPE_REF = new TypeReference<Response<Sku>>() {};
	protected static final TypeReference<Response<Skus>> SKUS_RESPONSE_TYPE_REF = new TypeReference<Response<Skus>>() {};
	protected static final TypeReference<Response<Shop>> SHOP_RESPONSE_TYPE_REF = new TypeReference<Response<Shop>>() {};
	protected static final TypeReference<Response<Trade>> TRADE_RESPONSE_TYPE_REF = new TypeReference<Response<Trade>>() {};
	protected static final TypeReference<Response<Trades>> TRADES_RESPONSE_TYPE_REF = new TypeReference<Response<Trades>>() {};
	protected static final TypeReference<Response<SelfFetchTrade>> SELF_FETCH_TRADE_RESPONSE_TYPE_REF = new TypeReference<Response<SelfFetchTrade>>() {};
	protected static final TypeReference<Response<Coupons>> COUPONS_RESPONSE_TYPE_REF = new TypeReference<Response<Coupons>>() {};
	protected static final TypeReference<Response<CouponConsume>> COUPON_CONSUME_RESPONSE_TYPE_REF = new TypeReference<Response<CouponConsume>>() {};
	protected static final TypeReference<Response<Verifylogs>> VERIFYLOGS_RESPONSE_TYPE_REF = new TypeReference<Response<Verifylogs>>() {};
	protected static final TypeReference<Response<Coupon>> COUPON_RESPONSE_TYPE_REF = new TypeReference<Response<Coupon>>() {};
	protected static final TypeReference<Response<TimelimitedDiscounts>> TIMELIMITED_DISCOUNTS_RESPONSE_TYPE_REF = new TypeReference<Response<TimelimitedDiscounts>>() {};

	protected final KdtApiClient client;
	protected final ObjectMapper mapper;

	public BaseService(KdtApiClient client) {
		this.client = client;
		this.mapper = new ObjectMapper();
		this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		this.mapper.registerModule(new JavaTimeModule());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <T> T readValue(
		@Nonnull String method,
		@Nullable Map<String, String> params,
		@Nonnull TypeReference valueTypeRef
	) throws IOException, YouzanException {
		final HttpResponse httpResponse;

		try {
			httpResponse = client.get(method,
				params != null ? new HashMap<>(params) : EMPTY_PARAMS);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		try (InputStream inputStream = httpResponse.getEntity().getContent()) {
			Response response = this.mapper.readValue(inputStream, valueTypeRef);
			return (T) response.getResponse();
		} catch (JsonMappingException e) {
			if (e.getCause() instanceof YouzanException) {
				throw (YouzanException) e.getCause();
			} else {
				throw e;
			}
		}
	}

}
