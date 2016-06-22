package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 数据为0.00代表没有对应的改价。
 * 卖家手工调整订单金额。
 * 精确到2位小数；单位：元。
 * 若卖家减少订单金额10元2分，则这里为10.02；若卖家增加订单金额10元2分，则这里为-10.02。
 */
public class AdjustFee implements Serializable {

	private static final long serialVersionUID = 2016062101L;

	/**
	 * 总改价金额
	 */
	private BigDecimal change;

	/**
	 * 订单改价
	 */
	private BigDecimal payChange;

	/**
	 * 邮费改价
	 */
	private BigDecimal postChange;

	public AdjustFee() {
	}

	public AdjustFee(
		@JsonProperty("change") BigDecimal change,
		@JsonProperty("pay_change") BigDecimal payChange,
		@JsonProperty("post_change") BigDecimal postChange
	) {
		this.change = change;
		this.payChange = payChange;
		this.postChange = postChange;
	}

	public BigDecimal getChange() {
		return change;
	}

	public void setChange(BigDecimal change) {
		this.change = change;
	}

	public BigDecimal getPayChange() {
		return payChange;
	}

	public void setPayChange(BigDecimal payChange) {
		this.payChange = payChange;
	}

	public BigDecimal getPostChange() {
		return postChange;
	}

	public void setPostChange(BigDecimal postChange) {
		this.postChange = postChange;
	}

}
