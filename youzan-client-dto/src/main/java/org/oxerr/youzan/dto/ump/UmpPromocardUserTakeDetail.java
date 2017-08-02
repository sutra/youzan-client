package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href=
 * "http://open.youzan.com/structparam?struct=UmpPromocardUserTakedetail">
 * 用户领取优惠券详情</a>.
 */
public class UmpPromocardUserTakeDetail implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	/**
	 * 优惠券结束时间
	 */
	private Instant endAt;

	/**
	 * 优惠券详情链接
	 */
	private String detailUrl;

	/**
	 * 优惠券满额条件
	 */
	private String condition;

	/**
	 * 优惠券是否已过期
	 */
	private Boolean isExpired;

	/**
	 * 优惠券背景颜色
	 */
	private String backgroundColor;

	/**
	 * 优惠券id
	 */
	private Long promocardId;

	/**
	 * 优惠券标题
	 */
	private String title;

	/**
	 * 优惠券生效时间
	 */
	private Instant startAt;

	/**
	 * 优惠券面额
	 */
	private BigDecimal value;

	/**
	 * 优惠券是否已失效
	 */
	private Boolean isInvalid;

	/**
	 * 优惠券是否已使用
	 */
	private Boolean isUsed;

	public UmpPromocardUserTakeDetail() {
	}

	public UmpPromocardUserTakeDetail(
		@JsonProperty("end_at") Instant endAt,
		@JsonProperty("detail_url") String detailUrl,
		@JsonProperty("condition") String condition,
		@JsonProperty("is_expired") Boolean isExpired,
		@JsonProperty("background_color") String backgroundColor,
		@JsonProperty("promocard_id") Long promocardId,
		@JsonProperty("title") String title,
		@JsonProperty("start_at") Instant startAt,
		@JsonProperty("value") BigDecimal value,
		@JsonProperty("is_invalid") Boolean isInvalid,
		@JsonProperty("is_used") Boolean isUsed
	) {
		this.endAt = endAt;
		this.detailUrl = detailUrl;
		this.condition = condition;
		this.isExpired = isExpired;
		this.backgroundColor = backgroundColor;
		this.promocardId = promocardId;
		this.title = title;
		this.startAt = startAt;
		this.value = value;
		this.isInvalid = isInvalid;
		this.isUsed = isUsed;
	}

	public Instant getEndAt() {
		return endAt;
	}

	public void setEndAt(Instant endAt) {
		this.endAt = endAt;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Long getPromocardId() {
		return promocardId;
	}

	public void setPromocardId(Long promocardId) {
		this.promocardId = promocardId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instant getStartAt() {
		return startAt;
	}

	public void setStartAt(Instant startAt) {
		this.startAt = startAt;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Boolean getIsInvalid() {
		return isInvalid;
	}

	public void setIsInvalid(Boolean isInvalid) {
		this.isInvalid = isInvalid;
	}

	public Boolean getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

}
