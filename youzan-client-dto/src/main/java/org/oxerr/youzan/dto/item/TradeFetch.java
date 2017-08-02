package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradeFetch">到店自提详情</a>.
 */
public class TradeFetch implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 领取人（即：预约人）的姓名
	 */
	private String fetcherName;

	/**
	 * 自提点所在省份
	 */
	private String shopState;

	/**
	 * 自提点联系方式
	 */
	private String shopMobile;

	/**
	 * 自提点所在城市
	 */
	private String shopCity;

	/**
	 * 自提点所在地区
	 */
	private String shopDistrict;

	/**
	 * 领取人的手机号
	 */
	private String fetcherMobile;

	/**
	 * 领取人的手机号
	 */
	private String shopName;

	/**
	 * 自提点详细地址
	 */
	private String shopAddress;

	/**
	 * 预约的领取时间。
	 * 新版到店自提的数据格式:
	 * <ul>
	 * <li>1: 2016-04-18 17:00-17:15</li>
	 * <li>2: 尽快到店提货</li>
	 * </ul>
	 */
	private Instant fetchTime;

	public TradeFetch() {
	}

	public TradeFetch(
		@JsonProperty("fetcher_name") String fetcherName,
		@JsonProperty("shop_state") String shopState,
		@JsonProperty("shop_mobile") String shopMobile,
		@JsonProperty("shop_city") String shopCity,
		@JsonProperty("shop_district") String shopDistrict,
		@JsonProperty("fetcher_mobile") String fetcherMobile,
		@JsonProperty("shop_name") String shopName,
		@JsonProperty("shop_address") String shopAddress,
		@JsonProperty("fetch_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant fetchTime
	) {
		this.fetcherName = fetcherName;
		this.shopState = shopState;
		this.shopMobile = shopMobile;
		this.shopCity = shopCity;
		this.shopDistrict = shopDistrict;
		this.fetcherMobile = fetcherMobile;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.fetchTime = fetchTime;
	}

	public String getFetcherName() {
		return fetcherName;
	}

	public void setFetcherName(String fetcherName) {
		this.fetcherName = fetcherName;
	}

	public String getShopState() {
		return shopState;
	}

	public void setShopState(String shopState) {
		this.shopState = shopState;
	}

	public String getShopMobile() {
		return shopMobile;
	}

	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public String getShopCity() {
		return shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopDistrict() {
		return shopDistrict;
	}

	public void setShopDistrict(String shopDistrict) {
		this.shopDistrict = shopDistrict;
	}

	public String getFetcherMobile() {
		return fetcherMobile;
	}

	public void setFetcherMobile(String fetcherMobile) {
		this.fetcherMobile = fetcherMobile;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public Instant getFetchTime() {
		return fetchTime;
	}

	public void setFetchTime(Instant fetchTime) {
		this.fetchTime = fetchTime;
	}

}
