package org.oxerr.youzan;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = YouzanProperties.PREFIX)
public class YouzanProperties {

	static final String PREFIX = "org.oxerr.youzan";

	private String appId, appSecret;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
