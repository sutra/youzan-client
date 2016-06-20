package org.oxerr.youzan.dto;

import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsQrcode">商品二维码数据结构</a>.
 */
public class GoodsQrcode extends BaseObject {

	private static final long serialVersionUID = 2016061901L;

	private String name;
	private String discount;
	private String linkUrl;
	private Long id;
	private String type;
	private String weixinQrcodeUrl;
	private BigDecimal decrease;
	private String desc;

	public GoodsQrcode(
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("name") String name,
		@JsonProperty("discount") String discount,
		@JsonProperty("link_url") String linkUrl,
		@JsonProperty("id") Long id,
		@JsonProperty("type") String type,
		@JsonProperty("weixin_qrcode_url") String weixinQrcodeUrl,
		@JsonProperty("decrease") BigDecimal decrease,
		@JsonProperty("desc") String desc
	) {
		super(created);
		this.name = name;
		this.discount = discount;
		this.linkUrl = linkUrl;
		this.id = id;
		this.type = type;
		this.weixinQrcodeUrl = weixinQrcodeUrl;
		this.decrease = decrease;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeixinQrcodeUrl() {
		return weixinQrcodeUrl;
	}

	public void setWeixinQrcodeUrl(String weixinQrcodeUrl) {
		this.weixinQrcodeUrl = weixinQrcodeUrl;
	}

	public BigDecimal getDecrease() {
		return decrease;
	}

	public void setDecrease(BigDecimal decrease) {
		this.decrease = decrease;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
