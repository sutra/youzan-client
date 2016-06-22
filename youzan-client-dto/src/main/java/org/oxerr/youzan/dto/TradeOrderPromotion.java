package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradeOrderPromotion">
 * 交易明细中的优惠信息的数据结构</a>.
 */
public class TradeOrderPromotion implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 优惠的类型。
	 * 可选值：
	 * <ul>
	 * <li>MEMBER_CARD_DISCOUNT（会员卡折扣）</li>
	 * <li>SCAN_DISCOUNT（扫码折扣）</li>
	 * <li>SCAN_DECREASE（扫码减额优惠）</li>
	 * <li>TIMELIMITED_DISCOUNT（限时折扣）</li>
	 * </ul>
	 */
	private String promotionType;

	/**
	 * 应用优惠的时间
	 */
	private Instant applyAt;

	/**
	 * 优惠的名称
	 */
	private String promotionName;

	/**
	 * 优惠的金额，单位：元，精确到小数点后两位。
	 */
	private BigDecimal discountFee;

	public TradeOrderPromotion() {
	}

	public TradeOrderPromotion(
		@JsonProperty("promotion_type") String promotionType,
		@JsonProperty("apply_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant applyAt,
		@JsonProperty("promotion_name") String promotionName,
		@JsonProperty("discount_fee") BigDecimal discountFee
	) {
		this.promotionType = promotionType;
		this.applyAt = applyAt;
		this.promotionName = promotionName;
		this.discountFee = discountFee;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public Instant getApplyAt() {
		return applyAt;
	}

	public void setApplyAt(Instant applyAt) {
		this.applyAt = applyAt;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

}
