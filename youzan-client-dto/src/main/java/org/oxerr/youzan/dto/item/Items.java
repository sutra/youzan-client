package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsDetail[] items;

	public Items(@JsonProperty("items") GoodsDetail[] items) {
		this.items = items;
	}

	public GoodsDetail[] getItems() {
		return items;
	}

	public void setItems(GoodsDetail[] items) {
		this.items = items;
	}

}
