package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trade implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private TradeDetail trade;

	public Trade(@JsonProperty("trade") TradeDetail trade) {
		this.trade = trade;
	}

	public TradeDetail getTrade() {
		return trade;
	}

	public void setTrade(TradeDetail trade) {
		this.trade = trade;
	}

}
