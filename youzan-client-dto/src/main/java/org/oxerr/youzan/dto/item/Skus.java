package org.oxerr.youzan.dto.item;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Skus implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsSku[] skus;

	public Skus(@JsonProperty("skus") GoodsSku[] skus) {
		this.skus = skus;
	}

	public GoodsSku[] getSkus() {
		return skus;
	}

	public void setSkus(GoodsSku[] skus) {
		this.skus = skus;
	}

}
