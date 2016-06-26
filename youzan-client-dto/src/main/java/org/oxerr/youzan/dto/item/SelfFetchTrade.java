package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SelfFetchTrade implements Serializable {

	private static final long serialVersionUID = 2016062101L;

	private String code;
	private Integer status;
	private String tid;
	private TradeDetail trade;

	public SelfFetchTrade(
		@JsonProperty("code") String code,
		@JsonProperty("status") Integer status,
		@JsonProperty("tid") String tid,
		@JsonProperty("trade") TradeDetail trade
	) {
		this.code = code;
		this.status = status;
		this.tid = tid;
		this.trade = trade;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public TradeDetail getTrade() {
		return trade;
	}

	public void setTrade(TradeDetail trade) {
		this.trade = trade;
	}

}
