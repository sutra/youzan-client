package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sku implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	private GoodsSku sku;

	public Sku(@JsonProperty("sku") GoodsSku sku) {
		this.sku = sku;
	}

	public GoodsSku getSku() {
		return sku;
	}

	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}

}
