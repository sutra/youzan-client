package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=UmpTradeCoupon">
 * 订单中使用到的卡券的数据结构</a>.
 */
public class UmpTradeCoupon implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 卡券的说明
	 */
	private String couponDescription;

	/**
	 * 使用时间
	 */
	private Instant usedAt;

	/**
	 * 卡券使用条件说明
	 */
	private String couponCondition;

	/**
	 * 该组卡券的ID
	 */
	private Long couponId;

	/**
	 * 卡券内容。当卡券类型为优惠码时，值为优惠码字符串
	 */
	private String couponContent;

	/**
	 * 该组卡券的名称
	 */
	private String couponName;

	/**
	 * 卡券的类型。可选值：PROMOCARD（优惠券）、PROMOCODE（优惠码）。
	 */
	private String couponType;

	/**
	 * 优惠的金额，单位：元，精确到小数点后两位
	 */
	private BigDecimal discountFee;

	public UmpTradeCoupon(
		@JsonProperty("coupon_description") String couponDescription,
		@JsonProperty("used_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant usedAt,
		@JsonProperty("coupon_condition") String couponCondition,
		@JsonProperty("coupon_id") Long couponId,
		@JsonProperty("coupon_content") String couponContent,
		@JsonProperty("coupon_name") String couponName,
		@JsonProperty("coupon_type") String couponType,
		@JsonProperty("discount_fee") BigDecimal discountFee
	) {
		this.couponDescription = couponDescription;
		this.usedAt = usedAt;
		this.couponCondition = couponCondition;
		this.couponId = couponId;
		this.couponContent = couponContent;
		this.couponName = couponName;
		this.couponType = couponType;
		this.discountFee = discountFee;
	}

	public String getCouponDescription() {
		return couponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}

	public Instant getUsedAt() {
		return usedAt;
	}

	public void setUsedAt(Instant usedAt) {
		this.usedAt = usedAt;
	}

	public String getCouponCondition() {
		return couponCondition;
	}

	public void setCouponCondition(String couponCondition) {
		this.couponCondition = couponCondition;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public String getCouponContent() {
		return couponContent;
	}

	public void setCouponContent(String couponContent) {
		this.couponContent = couponContent;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

}
