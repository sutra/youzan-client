package org.oxerr.youzan.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.http.HttpResponse;
import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.Shop;
import org.oxerr.youzan.dto.response.ItemResponse;
import org.oxerr.youzan.dto.response.ItemsResponse;
import org.oxerr.youzan.dto.response.Response;
import org.oxerr.youzan.dto.response.SelfFetchTradeResponse;
import org.oxerr.youzan.dto.response.SkuResponse;
import org.oxerr.youzan.dto.response.SkusResponse;
import org.oxerr.youzan.dto.response.SuccessResponse;
import org.oxerr.youzan.dto.response.TradeResponse;
import org.oxerr.youzan.dto.response.TradesResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kdt.api.KdtApiClient;

abstract class BaseService {

	private static final HashMap<String, String> EMPTY_PARAMS = new HashMap<>(0);

	protected static final TypeReference<Response<SuccessResponse>> SUCCESS_RESPONSE_TYPE_REF = new TypeReference<Response<SuccessResponse>>() {};

	protected static final TypeReference<Response<ItemResponse>> ITEM_RESPONSE_TYPE_REF = new TypeReference<Response<ItemResponse>>() {};
	protected static final TypeReference<Response<ItemsResponse>> ITEMS_RESPONSE_TYPE_REF = new TypeReference<Response<ItemsResponse>>() {};

	protected static final TypeReference<Response<SkuResponse>> SKU_RESPONSE_TYPE_REF = new TypeReference<Response<SkuResponse>>() {};
	protected static final TypeReference<Response<SkusResponse>> SKUS_RESPONSE_TYPE_REF = new TypeReference<Response<SkusResponse>>() {};

	protected static final TypeReference<Response<Shop>> SHOP_RESPONSE_TYPE_REF = new TypeReference<Response<Shop>>() {};

	protected static final TypeReference<Response<TradeResponse>> TRADE_RESPONSE_TYPE_REF = new TypeReference<Response<TradeResponse>>() {};
	protected static final TypeReference<Response<TradesResponse>> TRADES_RESPONSE_TYPE_REF = new TypeReference<Response<TradesResponse>>() {};

	protected static final TypeReference<Response<SelfFetchTradeResponse>> SELF_FETCH_TRADE_RESPONSE_TYPE_REF = new TypeReference<Response<SelfFetchTradeResponse>>() {};

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
