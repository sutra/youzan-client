package org.oxerr.youzan.dto.ump;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coupons implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	private UmpCoupon[] coupons;

	public Coupons(
		@JsonProperty("coupons") UmpCoupon[] coupons
	) {
		this.coupons = coupons;
	}

	public UmpCoupon[] getCoupons() {
		return coupons;
	}

	public void setCoupons(UmpCoupon[] coupons) {
		this.coupons = coupons;
	}

}
