package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsQrcode">商品二维码数据结构</a>.
 */
public class GoodsQrcode implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	/**
	 * 商品二维码创建时间，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	private Instant created;

	/**
	 * 二维码的名称
	 */
	private String name;

	/**
	 * 折扣，格式：9.0；单位：折，精确到小数点后 1 位。如果没有折扣，则为 0
	 */
	private String discount;

	/**
	 * 扫码直接购买的二维码基于这个url生成。如果不是扫码直接购买的类型，则为空
	 */
	private String linkUrl;

	/**
	 * 商品二维码的ID
	 */
	private Long id;

	/**
	 * 商品二维码类型。
	 * 可选值：
	 * <ul>
	 * <li>GOODS_SCAN_FOLLOW(扫码关注后购买商品)</li>
	 * <li>GOODS_SCAN_FOLLOW_DECREASE(扫码关注后减优惠额)</li>
	 * <li>GOODS_SCAN_FOLLOW_DISCOUNT(扫码关注后折扣)</li>
	 * <li>GOODS_SCAN_DECREASE(扫码直接减优惠额)</li>
	 * <li>GOODS_SCAN_DISCOUNT(扫码直接折扣)</li>
	 * </ul>
	 */
	private String type;

	/**
	 * 扫码关注购买的二维码图片地址。
	 * 如果不是扫码关注购买的类型，则为空。
	 */
	private String weixinQrcodeUrl;

	/**
	 * 减金额优惠，格式：5.00；单位：元；精确到：分。如果没有减额优惠，则为 0。
	 */
	private BigDecimal decrease;

	/**
	 * 二维码的描述
	 */
	private String desc;

	public GoodsQrcode() {
	}

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
		this.created = created;
		this.name = name;
		this.discount = discount;
		this.linkUrl = linkUrl;
		this.id = id;
		this.type = type;
		this.weixinQrcodeUrl = weixinQrcodeUrl;
		this.decrease = decrease;
		this.desc = desc;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
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
