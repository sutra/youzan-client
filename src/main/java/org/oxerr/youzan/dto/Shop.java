package org.oxerr.youzan.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shop implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	private Long sid;
	private String name;
	private String logo;
	private String url;

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
