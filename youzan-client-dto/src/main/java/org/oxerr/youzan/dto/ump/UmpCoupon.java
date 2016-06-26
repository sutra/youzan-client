package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=UmpCoupon">优惠数据结构（优惠券、
 * 优惠码的通用结构）</a>.
 */
public class UmpCoupon implements Serializable {

	private static final long serialVersionUID = 2016062501L;

	/**
	 * 是否设置满多少元可用
	 */
	private Boolean isAtLeast;

	/**
	 * 优惠结束时间
	 */
	private Instant endAt;

	/**
	 * 是否同步微信卡券
	 */
	private Boolean isSyncWeixin;

	/**
	 * 是否是随机优惠
	 */
	private Boolean isRandom;

	/**
	 * 是否仅原价购买商品时可用
	 */
	private Boolean isForbidPreference;

	/**
	 * 使用说明
	 */
	private String description;

	/**
	 * 优惠标题
	 */
	private String title;

	/**
	 * 优惠生效时间
	 */
	private Instant startAt;

	/**
	 * 总库存
	 */
	private Long total;

	/**
	 * 是否到期前4天发送提醒
	 */
	private Boolean expireNotice;

	/**
	 * 每人限领个数，为 0 则表示不限制
	 */
	private Long quota;

	/**
	 * 剩余可用库存
	 */
	private Long stock;

	/**
	 * 优惠面额。如果 is_random 为 1，则该字段表示随机金额的下限。单位：元，精确到分。
	 */
	private BigDecimal value;

	/**
	 * 领取优惠的次数
	 */
	private Long statFetchNum;

	/**
	 * 如果 is_random 为 1，则该字段表示随机金额的上限。单位：元，精确到分。
	 */
	private BigDecimal valueRandomTo;

	/**
	 * 是否可分享领取链接
	 */
	private Boolean isShare;

	/**
	 * 使用优惠的次数
	 */
	private Long statUseNum;

	/**
	 * 领取优惠的人数
	 */
	private Long statFetchUserNum;

	/**
	 * 优惠创建时间
	 */
	private Instant created;

	/**
	 * 可用范围的类型，可选值：
	 * <ul>
	 * <li>PART（部分商品可用，或指定商品可用）</li>
	 * <li>ALL（全部商品可用）</li>
	 * </ul>
	 */
	private String rangeType;

	/**
	 * 优惠领取链接
	 */
	private String fetchUrl;

	/**
	 * 限制领用者等级的名称
	 */
	private String userLevelName;

	/**
	 * 优惠的ID
	 */
	private Long groupId;

	/**
	 * 微信卡券ID
	 */
	private String weixinCardId;

	/**
	 * 优惠的类型。可选值：
	 * <ul>
	 * <li>PROMOCARD（优惠券）</li>
	 * <li>PROMOCODE（优惠码）</li>
	 * </ul>
	 */
	private String couponType;

	/**
	 * 是否限制领用者的等级，0 表示不限制，大于 0 表示领用者必须是这个等级ID
	 */
	private Integer needUserLevel;

	/**
	 * 如果 is_at_least 为 1，该字段表示订单必须满这个价格，优惠才可用。单位：元，精确到分。
	 */
	private BigDecimal atLeast;

	/**
	 * 优惠状态，0 表示有效，1 表示失效，2 表示微信卡券审核中
	 */
	private Integer status;

	public UmpCoupon() {
	}

	public UmpCoupon(
		@JsonProperty("is_at_least") Boolean isAtLeast,
		@JsonProperty("end_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant endAt,
		@JsonProperty("is_sync_weixin") Boolean isSyncWeixin,
		@JsonProperty("is_random") Boolean isRandom,
		@JsonProperty("is_forbid_preference") Boolean isForbidPreference,
		@JsonProperty("description") String description,
		@JsonProperty("title") String title,
		@JsonProperty("start_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant startAt,
		@JsonProperty("total") Long total,
		@JsonProperty("expire_notice") Boolean expireNotice,
		@JsonProperty("quota") Long quota,
		@JsonProperty("stock") Long stock,
		@JsonProperty("value") BigDecimal value,
		@JsonProperty("stat_fetch_num") Long statFetchNum,
		@JsonProperty("value_random_to") BigDecimal valueRandomTo,
		@JsonProperty("is_share") Boolean isShare,
		@JsonProperty("stat_use_num") Long statUseNum,
		@JsonProperty("stat_fetch_user_num") Long statFetchUserNum,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("range_type") String rangeType,
		@JsonProperty("fetch_url") String fetchUrl,
		@JsonProperty("user_level_name") String userLevelName,
		@JsonProperty("group_id") Long groupId,
		@JsonProperty("weixin_card_id") String weixinCardId,
		@JsonProperty("coupon_type") String couponType,
		@JsonProperty("need_user_level") Integer needUserLevel,
		@JsonProperty("at_least") BigDecimal atLeast,
		@JsonProperty("status") Integer status
	) {
		this.isAtLeast = isAtLeast;
		this.endAt = endAt;
		this.isSyncWeixin = isSyncWeixin;
		this.isRandom = isRandom;
		this.isForbidPreference = isForbidPreference;
		this.description = description;
		this.title = title;
		this.startAt = startAt;
		this.total = total;
		this.expireNotice = expireNotice;
		this.quota = quota;
		this.stock = stock;
		this.value = value;
		this.statFetchNum = statFetchNum;
		this.valueRandomTo = valueRandomTo;
		this.isShare = isShare;
		this.statUseNum = statUseNum;
		this.statFetchUserNum = statFetchUserNum;
		this.created = created;
		this.rangeType = rangeType;
		this.fetchUrl = fetchUrl;
		this.userLevelName = userLevelName;
		this.groupId = groupId;
		this.weixinCardId = weixinCardId;
		this.couponType = couponType;
		this.needUserLevel = needUserLevel;
		this.atLeast = atLeast;
		this.status = status;
	}

	public Boolean getIsAtLeast() {
		return isAtLeast;
	}

	public void setIsAtLeast(Boolean isAtLeast) {
		this.isAtLeast = isAtLeast;
	}

	public Instant getEndAt() {
		return endAt;
	}

	public void setEndAt(Instant endAt) {
		this.endAt = endAt;
	}

	public Boolean getIsSyncWeixin() {
		return isSyncWeixin;
	}

	public void setIsSyncWeixin(Boolean isSyncWeixin) {
		this.isSyncWeixin = isSyncWeixin;
	}

	public Boolean getIsRandom() {
		return isRandom;
	}

	public void setIsRandom(Boolean isRandom) {
		this.isRandom = isRandom;
	}

	public Boolean getIsForbidPreference() {
		return isForbidPreference;
	}

	public void setIsForbidPreference(Boolean isForbidPreference) {
		this.isForbidPreference = isForbidPreference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Boolean getExpireNotice() {
		return expireNotice;
	}

	public void setExpireNotice(Boolean expireNotice) {
		this.expireNotice = expireNotice;
	}

	public Long getQuota() {
		return quota;
	}

	public void setQuota(Long quota) {
		this.quota = quota;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Long getStatFetchNum() {
		return statFetchNum;
	}

	public void setStatFetchNum(Long statFetchNum) {
		this.statFetchNum = statFetchNum;
	}

	public BigDecimal getValueRandomTo() {
		return valueRandomTo;
	}

	public void setValueRandomTo(BigDecimal valueRandomTo) {
		this.valueRandomTo = valueRandomTo;
	}

	public Boolean getIsShare() {
		return isShare;
	}

	public void setIsShare(Boolean isShare) {
		this.isShare = isShare;
	}

	public Long getStatUseNum() {
		return statUseNum;
	}

	public void setStatUseNum(Long statUseNum) {
		this.statUseNum = statUseNum;
	}

	public Long getStatFetchUserNum() {
		return statFetchUserNum;
	}

	public void setStatFetchUserNum(Long statFetchUserNum) {
		this.statFetchUserNum = statFetchUserNum;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public String getRangeType() {
		return rangeType;
	}

	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}

	public String getFetchUrl() {
		return fetchUrl;
	}

	public void setFetchUrl(String fetchUrl) {
		this.fetchUrl = fetchUrl;
	}

	public String getUserLevelName() {
		return userLevelName;
	}

	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getWeixinCardId() {
		return weixinCardId;
	}

	public void setWeixinCardId(String weixinCardId) {
		this.weixinCardId = weixinCardId;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public Integer getNeedUserLevel() {
		return needUserLevel;
	}

	public void setNeedUserLevel(Integer needUserLevel) {
		this.needUserLevel = needUserLevel;
	}

	public BigDecimal getAtLeast() {
		return atLeast;
	}

	public void setAtLeast(BigDecimal atLeast) {
		this.atLeast = atLeast;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
