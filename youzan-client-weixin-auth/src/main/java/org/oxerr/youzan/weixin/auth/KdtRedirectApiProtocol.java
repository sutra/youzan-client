package org.oxerr.youzan.weixin.auth;

import com.kdt.api.KdtApiProtocol;

public class KdtRedirectApiProtocol extends KdtApiProtocol {

	public static final String APP_ID_KEY = "app_id";
	public static final String REDIRECT_URL_KEY = "redirect_url";
	public static final String SCOPE_KEY = "scope";
	public static final String TIMESTAMP_KEY = "timestamp";
	public static final String CUSTOM_KEY = "custom";
	public static final String WITH_SIGN_KEYS_KEY = "with_sign_keys";
	public static final String SIGN_KEY = "sign";

	public static final String SIGN_KEYS_KEY = "sign_keys";

	public static final int ALLOWED_DEVIATE_SECONDS = 600;

}
