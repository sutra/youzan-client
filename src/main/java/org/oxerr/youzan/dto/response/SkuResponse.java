package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.GoodsSku;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SkuResponse implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	private GoodsSku sku;

	public SkuResponse(@JsonProperty("sku") GoodsSku sku) {
		this.sku = sku;
	}

	public GoodsSku getSku() {
		return sku;
	}

	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}

}
