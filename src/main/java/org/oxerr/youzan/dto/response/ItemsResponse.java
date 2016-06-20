package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.GoodsDetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsResponse implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsDetail[] items;

	public ItemsResponse(@JsonProperty("items") GoodsDetail[] items) {
		this.items = items;
	}

	public GoodsDetail[] getItems() {
		return items;
	}

	public void setItems(GoodsDetail[] items) {
		this.items = items;
	}

}
