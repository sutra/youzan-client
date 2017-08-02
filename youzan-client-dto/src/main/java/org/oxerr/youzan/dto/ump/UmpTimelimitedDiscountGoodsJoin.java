package org.oxerr.youzan.dto.ump;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href=
 * "http://open.youzan.com/structparam?struct=UmpTimelimitedDiscountGoodsJoin">
 * 限时折扣商品信息</a>.
 */
public class UmpTimelimitedDiscountGoodsJoin implements Serializable {

	private static final long serialVersionUID = 2016062601L;

	private Instant createdTime;
	private Long itemId;
	private String imageUrl;
	private BigDecimal discountPrice;
	private Long stockNum;
	private Instant endTime;
	private String discountValue;
	private String title;
	private Integer discountType;
	private Instant startTime;
	private Integer eraseType;
	private BigDecimal price;
	private String itemUrl;
	private String alias;

	public UmpTimelimitedDiscountGoodsJoin() {
	}

	public UmpTimelimitedDiscountGoodsJoin(
		@JsonProperty("created_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant createdTime,
		@JsonProperty("item_id") Long itemId,
		@JsonProperty("image_url") String imageUrl,
		@JsonProperty("discount_price") BigDecimal discountPrice,
		@JsonProperty("stock_num") Long stockNum,
		@JsonProperty("end_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant endTime,
		@JsonProperty("discount_value") String discountValue,
		@JsonProperty("title") String title,
		@JsonProperty("discount_type") Integer discountType,
		@JsonProperty("start_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant startTime,
		@JsonProperty("earse_type") Integer eraseType,
		@JsonProperty("price") BigDecimal price,
		@JsonProperty("item_url") String itemUrl,
		@JsonProperty("alias") String alias
	) {
		this.createdTime = createdTime;
		this.itemId = itemId;
		this.imageUrl = imageUrl;
		this.discountPrice = discountPrice;
		this.stockNum = stockNum;
		this.endTime = endTime;
		this.discountValue = discountValue;
		this.title = title;
		this.discountType = discountType;
		this.startTime = startTime;
		this.eraseType = eraseType;
		this.price = price;
		this.itemUrl = itemUrl;
		this.alias = alias;
	}

	public Instant getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Instant createdTime) {
		this.createdTime = createdTime;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Long getStockNum() {
		return stockNum;
	}

	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public Instant getEndTime() {
		return endTime;
	}

	public void setEndTime(Instant endTime) {
		this.endTime = endTime;
	}

	public String getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDiscountType() {
		return discountType;
	}

	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}

	public Instant getStartTime() {
		return startTime;
	}

	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
	}

	public Integer getEraseType() {
		return eraseType;
	}

	public void setEraseType(Integer eraseType) {
		this.eraseType = eraseType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
