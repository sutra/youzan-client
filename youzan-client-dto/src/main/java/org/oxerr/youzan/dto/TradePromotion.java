package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradePromotion">
 * 订单中使用到的优惠活动的数据结构</a>.
 */
public class TradePromotion implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 优惠的类型。
	 * 可选值：
	 * <ul>
	 * <li>FULLREDUCE（满减满送）</li>
	 * <li>ORDERCASHBACK（订单返现）</li>
	 * <li>GROUPBUYING（商品团购）</li>
	 * <li>GROUPON（多人拼团）</li>
	 * </ul>
	 */
	private String promotionType;

	/**
	 * 使用时间
	 */
	private Instant usedAt;

	/**
	 * 该优惠活动的名称
	 */
	private String promotionName;

	/**
	 * 优惠使用条件说明
	 */
	private String promotionCondition;

	/**
	 * 该优惠活动的ID
	 */
	private Long promotionId;

	/**
	 * 优惠的金额，单位：元，精确到小数点后两位。
	 */
	private BigDecimal discountFee;

	public TradePromotion() {
	}

	public TradePromotion(
		@JsonProperty("promotion_type") String promotionType,
		@JsonProperty("used_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant usedAt,
		@JsonProperty("promotion_name") String promotionName,
		@JsonProperty("promotion_condition") String promotionCondition,
		@JsonProperty("promotion_id") Long promotionId,
		@JsonProperty("discount_fee") BigDecimal discountFee
	) {
		this.promotionType = promotionType;
		this.usedAt = usedAt;
		this.promotionName = promotionName;
		this.promotionCondition = promotionCondition;
		this.promotionId = promotionId;
		this.discountFee = discountFee;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public Instant getUsedAt() {
		return usedAt;
	}

	public void setUsedAt(Instant usedAt) {
		this.usedAt = usedAt;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionCondition() {
		return promotionCondition;
	}

	public void setPromotionCondition(String promotionCondition) {
		this.promotionCondition = promotionCondition;
	}

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

}
