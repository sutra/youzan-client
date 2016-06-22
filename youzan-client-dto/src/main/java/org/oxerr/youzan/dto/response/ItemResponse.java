package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.GoodsDetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemResponse implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsDetail item;

	public ItemResponse(@JsonProperty("item") GoodsDetail item) {
		this.item = item;
	}

	public GoodsDetail getItem() {
		return item;
	}

	public void setItem(GoodsDetail item) {
		this.item = item;
	}

}
