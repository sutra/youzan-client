package org.oxerr.youzan.dto;

import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsSku">Sku数据结构</a>.
 */
public class GoodsSku extends BaseObject {

	private static final long serialVersionUID = 2016061901L;

	private String propertiesName;
	private String skuUniqueCode;
	private Long withHoldQuantity;
	private Long quantity;
	private BigDecimal price;
	private String propertiesNameJson;
	private Instant modified;
	private Long skuId;
	private Long numIid;
	private String outerId;

	public GoodsSku(
		@JsonProperty("properties_name") final String propertiesName,
		@JsonProperty("sku_unique_code") final String skuUniqueCode,
		@JsonProperty("with_hold_quantity") final Long withHoldQuantity,
		@JsonProperty("quantity") final Long quantity,
		@JsonProperty("price") final BigDecimal price,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		final Instant created,
		@JsonProperty("properties_name_json") final String propertiesNameJson,
		@JsonProperty("modified")
		@JsonDeserialize(using = InstantDeserializer.class)
		final Instant modified,
		@JsonProperty("sku_id") final Long skuId,
		@JsonProperty("num_iid") final Long numIid,
		@JsonProperty("outer_id") final String outerId
	) {
		super(created);
		this.propertiesName = propertiesName;
		this.skuUniqueCode = skuUniqueCode;
		this.withHoldQuantity = withHoldQuantity;
		this.quantity = quantity;
		this.price = price;
		this.propertiesNameJson = propertiesNameJson;
		this.modified = modified;
		this.skuId = skuId;
		this.numIid = numIid;
		this.outerId = outerId;
	}

	public String getPropertiesName() {
		return propertiesName;
	}

	public void setPropertiesName(String propertiesName) {
		this.propertiesName = propertiesName;
	}

	public String getSkuUniqueCode() {
		return skuUniqueCode;
	}

	public void setSkuUniqueCode(String skuUniqueCode) {
		this.skuUniqueCode = skuUniqueCode;
	}

	public Long getWithHoldQuantity() {
		return withHoldQuantity;
	}

	public void setWithHoldQuantity(Long withHoldQuantity) {
		this.withHoldQuantity = withHoldQuantity;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPropertiesNameJson() {
		return propertiesNameJson;
	}

	public void setPropertiesNameJson(String propertiesNameJson) {
		this.propertiesNameJson = propertiesNameJson;
	}

	public Instant getModified() {
		return modified;
	}

	public void setModified(Instant modified) {
		this.modified = modified;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getNumIid() {
		return numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterId() {
		return outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

}
