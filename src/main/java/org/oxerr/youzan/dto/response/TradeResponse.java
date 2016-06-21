package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.TradeDetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeResponse implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private TradeDetail trade;

	public TradeResponse(@JsonProperty("trade") TradeDetail trade) {
		this.trade = trade;
	}

	public TradeDetail getTrade() {
		return trade;
	}

	public void setTrade(TradeDetail trade) {
		this.trade = trade;
	}

}
