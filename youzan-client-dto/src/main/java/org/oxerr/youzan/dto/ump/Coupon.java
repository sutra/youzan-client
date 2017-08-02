package org.oxerr.youzan.dto.ump;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coupon implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	/**
	 * 值：1.PROMOCODE（表示优惠码） 2.PROMOCARD（表示优惠券）
	 */
	private String couponType;

	/**
	 * 用户领取优惠码详情
	 */
	private UmpPromocodeUserTakeDetail promocode;

	/**
	 * 用户领取优惠券详情（优惠码or优惠券详情只返回其一）
	 */
	private UmpPromocardUserTakeDetail promocard;

	public Coupon() {
	}

	public Coupon(
		@JsonProperty("coupon_type") String couponType,
		@JsonProperty("promocode") UmpPromocodeUserTakeDetail promocode,
		@JsonProperty("promocard") UmpPromocardUserTakeDetail promocard
	) {
		this.couponType = couponType;
		this.promocode = promocode;
		this.promocard = promocard;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public UmpPromocodeUserTakeDetail getPromocode() {
		return promocode;
	}

	public void setPromocode(UmpPromocodeUserTakeDetail promocode) {
		this.promocode = promocode;
	}

	public UmpPromocardUserTakeDetail getPromocard() {
		return promocard;
	}

	public void setPromocard(UmpPromocardUserTakeDetail promocard) {
		this.promocard = promocard;
	}

}
