package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CouponConsume implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	/**
	 * 核销码
	 */
	private String code;

	/**
	 * 核销状态，0表示未核销，1表示已核销
	 */
	private Integer status;

	/**
	 * 核销时间，格式，如果未核销，则为空
	 */
	private Instant consumeAt;

	/**
	 * 核销编号。如果卡券已被独立核销，值为核销编号；如果卡券在商城的交易中被核销、或者未核销，值为空
	 */
	private String consumeId;

	/**
	 * 优惠券/优惠码信息
	 */
	private UmpCoupon coupon;

	public CouponConsume() {
	}

	public CouponConsume(
		@JsonProperty("code") String code,
		@JsonProperty("status") Integer status,
		@JsonProperty("consume_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant consumeAt,
		@JsonProperty("consume_id") String consumeId,
		@JsonProperty("coupon") UmpCoupon coupon
	) {
		this.code = code;
		this.status = status;
		this.consumeAt = consumeAt;
		this.consumeId = consumeId;
		this.coupon = coupon;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Instant getConsumeAt() {
		return consumeAt;
	}

	public void setConsumeAt(Instant consumeAt) {
		this.consumeAt = consumeAt;
	}

	public String getConsumeId() {
		return consumeId;
	}

	public void setConsumeId(String consumeId) {
		this.consumeId = consumeId;
	}

	public UmpCoupon getCoupon() {
		return coupon;
	}

	public void setCoupon(UmpCoupon coupon) {
		this.coupon = coupon;
	}

}
