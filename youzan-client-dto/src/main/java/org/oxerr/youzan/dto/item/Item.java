package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsDetail item;

	public Item(@JsonProperty("item") GoodsDetail item) {
		this.item = item;
	}

	public GoodsDetail getItem() {
		return item;
	}

	public void setItem(GoodsDetail item) {
		this.item = item;
	}

}
