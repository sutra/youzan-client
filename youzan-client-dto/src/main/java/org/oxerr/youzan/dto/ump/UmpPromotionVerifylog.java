package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class UmpPromotionVerifylog implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	private String verifyType;
	private String condition;
	private String groupId;
	private String description;
	private String tradeNo;
	private Instant createdAt;
	private String id;
	private String verifyCode;
	private String state;
	private String title;
	private String value;
	private String adminNickname;

	public UmpPromotionVerifylog() {
	}

	public UmpPromotionVerifylog(
		@JsonProperty("verify_type") String verifyType,
		@JsonProperty("condition") String condition,
		@JsonProperty("group_id") String groupId,
		@JsonProperty("description") String description,
		@JsonProperty("trade_no") String tradeNo,
		@JsonProperty("created_at")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant createdAt,
		@JsonProperty("id") String id,
		@JsonProperty("verify_code") String verifyCode,
		@JsonProperty("state") String state,
		@JsonProperty("title") String title,
		@JsonProperty("value") String value,
		@JsonProperty("admin_nickname") String adminNickname
	) {
		this.verifyType = verifyType;
		this.condition = condition;
		this.groupId = groupId;
		this.description = description;
		this.tradeNo = tradeNo;
		this.createdAt = createdAt;
		this.id = id;
		this.verifyCode = verifyCode;
		this.state = state;
		this.title = title;
		this.value = value;
		this.adminNickname = adminNickname;
	}

	public String getVerifyType() {
		return verifyType;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAdminNickname() {
		return adminNickname;
	}

	public void setAdminNickname(String adminNickname) {
		this.adminNickname = adminNickname;
	}

}
