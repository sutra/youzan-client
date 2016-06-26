package org.oxerr.youzan.dto.shop;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href=
 * "http://open.youzan.com/apidetail?method=kdt.shop.basic.get&apiId=6669">
 * 店铺基本信息</a>.
 */
public class Shop implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 店铺ID
	 */
	private Long sid;

	/**
	 * 店铺名称
	 */
	private String name;

	/**
	 * 店铺LOGO
	 */
	private String logo;

	/**
	 * 店铺地址
	 */
	private String url;

	public Shop() {
	}

	public Shop(
		@JsonProperty("sid") Long sid,
		@JsonProperty("name") String name,
		@JsonProperty("logo") String logo,
		@JsonProperty("url") String url
	) {
		this.sid = sid;
		this.name = name;
		this.logo = logo;
		this.url = url;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
