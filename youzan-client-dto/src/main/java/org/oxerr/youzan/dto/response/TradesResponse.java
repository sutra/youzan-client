package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.TradeDetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradesResponse implements Serializable {

	private static final long serialVersionUID = 2016062101L;

	private TradeDetail[] trades;
	private Integer totalResults;
	private Boolean hasNext;

	public TradesResponse(
		@JsonProperty("trades") TradeDetail[] trades,
		@JsonProperty("total_results") Integer totalResults,
		@JsonProperty("has_next") Boolean hasNext
	) {
		this.trades = trades;
		this.totalResults = totalResults;
		this.hasNext = hasNext;
	}

	public TradeDetail[] getTrades() {
		return trades;
	}

	public void setTrades(TradeDetail[] trades) {
		this.trades = trades;
	}

	public Integer getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	public Boolean getHasNext() {
		return hasNext;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

}
