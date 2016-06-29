package org.oxerr.youzan.weixin.auth;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class KdtRedirectApiClient {

	private static final String API_ENTRY = "http://wap.koudaitong.com/v2/open/weixin/auth";

	private final SimpleDateFormat timestampFormat;

	private String appId;
	private String appSecret;

	public KdtRedirectApiClient(String appId, String appSecret) {
		if (appId == null || appId.isEmpty() || appSecret == null || appSecret.isEmpty()) {
			throw new IllegalArgumentException("appId 和 appSecret 不能为空");
		}

		this.appId = appId;
		this.appSecret = appSecret;
		this.timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.timestampFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
	}

	public String authorize(String redirectUrl, String scope, String custom,
			Boolean withSignKeys) {
		final Map<String, String> params = buildRequestParams(redirectUrl,
				scope, custom, withSignKeys);
		final String query = params.entrySet().stream()
				.map(e -> e.getKey() + "=" + e.getValue())
				.collect(Collectors.joining("&"));
		return API_ENTRY + "?" + query;
	}

	private Map<String, String> buildRequestParams(String redirectUrl,
			String scope, String custom, Boolean withSignKeys) {
		final HashMap<String, String> pairs = new LinkedHashMap<>(7);
		pairs.put(KdtRedirectApiProtocol.APP_ID_KEY, this.appId);
		pairs.put(KdtRedirectApiProtocol.REDIRECT_URL_KEY, redirectUrl);
		pairs.put(KdtRedirectApiProtocol.SCOPE_KEY, scope);

		final String timestamp;
		synchronized (timestampFormat) {
			timestamp = this.timestampFormat.format(new Date());
		}

		pairs.put(KdtRedirectApiProtocol.TIMESTAMP_KEY, timestamp);
		if (custom != null) {
			pairs.put(KdtRedirectApiProtocol.CUSTOM_KEY, custom);
		}
		if (withSignKeys != null && withSignKeys.booleanValue()) {
			pairs.put(KdtRedirectApiProtocol.WITH_SIGN_KEYS_KEY, "1");
		}

		pairs.put(KdtRedirectApiProtocol.SIGN_KEY, KdtRedirectApiProtocol.sign(this.appSecret, pairs));
		return pairs;
	}

}
