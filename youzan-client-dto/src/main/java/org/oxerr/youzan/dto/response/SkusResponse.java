package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.dto.GoodsSku;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SkusResponse implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private GoodsSku[] skus;

	public SkusResponse(@JsonProperty("skus") GoodsSku[] skus) {
		this.skus = skus;
	}

	public GoodsSku[] getSkus() {
		return skus;
	}

	public void setSkus(GoodsSku[] skus) {
		this.skus = skus;
	}

}
