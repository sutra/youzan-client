package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href=
 * "http://open.youzan.com/structparam?struct=UmpPromocodeUserTakedetail">
 * 用户领取优惠码详情</a>.
 */
public class UmpPromocodeUserTakeDetail implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	/**
	 * 优惠码结束时间
	 */
	private Instant endAt;

	/**
	 * 优惠码详情链接
	 */
	private String detailUrl;

	/**
	 * 优惠码满额条件
	 */
	private String condition;

	/**
	 * 优惠码编号
	 */
	private String code;

	/**
	 * 优惠码是否已过期
	 */
	private Boolean isExpired;

	/**
	 * 优惠码背景颜色
	 */
	private String backgroundColor;

	/**
	 * 优惠码标题
	 */
	private String title;

	/**
	 * 优惠码生效时间
	 */
	private Instant startAt;

	/**
	 * 优惠码面额
	 */
	private BigDecimal value;

	/**
	 * 优惠码是否已失效
	 */
	private Boolean isInvalid;

	/**
	 * 优惠码id
	 */
	private Long promocodeId;

	/**
	 * 优惠码是否已使用
	 */
	private Boolean isUsed;

	public UmpPromocodeUserTakeDetail() {
	}

	public UmpPromocodeUserTakeDetail(
		@JsonProperty("end_at") Instant endAt,
		@JsonProperty("detail_url") String detailUrl,
		@JsonProperty("condition") String condition,
		@JsonProperty("code") String code,
		@JsonProperty("is_expired") Boolean isExpired,
		@JsonProperty("background_color") String backgroundColor,
		@JsonProperty("title") String title,
		@JsonProperty("start_at") Instant startAt,
		@JsonProperty("value") BigDecimal value,
		@JsonProperty("is_invalid") Boolean isInvalid,
		@JsonProperty("promocode_id") Long promocodeId,
		@JsonProperty("is_used") Boolean isUsed
	) {
		this.endAt = endAt;
		this.detailUrl = detailUrl;
		this.condition = condition;
		this.code = code;
		this.isExpired = isExpired;
		this.backgroundColor = backgroundColor;
		this.title = title;
		this.startAt = startAt;
		this.value = value;
		this.isInvalid = isInvalid;
		this.promocodeId = promocodeId;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Long getPromocodeId() {
		return promocodeId;
	}

	public void setPromocodeId(Long promocodeId) {
		this.promocodeId = promocodeId;
	}

	public Boolean getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

}
