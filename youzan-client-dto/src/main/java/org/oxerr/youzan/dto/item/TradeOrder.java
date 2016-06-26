package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradeOrder">交易明细数据结构</a>.
 */
public class TradeOrder implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 商家编码（商家为Sku设置的外部编号）
	 */
	private String outerSkuId;

	/**
	 * Sku在系统中的唯一编号，可以在开发者的系统中用作 Sku 的唯一ID，但不能用于调用接口
	 */
	private String skuUniqueCode;

	/**
	 * 商品货号（商家为商品设置的外部编号）
	 */
	private String outerItemId;

	/**
	 * 商品主图片缩略图地址
	 */
	private String picThumbPath;

	/**
	 * 商品类型。
	 * <ul>
	 * <li>0：普通商品</li>
	 * <li>10：分销商品</li>
	 * </ul>
	 */
	private Integer itemType;

	/**
	 * 商品购买数量
	 */
	private Long num;

	/**
	 * 商品数字编号
	 */
	private Long numIid;

	/**
	 * Sku的ID，sku_id 在系统里并不是唯一的，结合商品ID一起使用才是唯一的。
	 */
	private Long skuId;

	/**
	 * SKU的值，即：商品的规格。如：机身颜色:黑色;手机套餐:官方标配。
	 */
	private String skuPropertiesName;

	/**
	 * 商品主图片地址
	 */
	private String picPath;

	/**
	 * 交易明细编号。该编号并不唯一，只用于区分交易内的多条明细记录。
	 */
	private Long oid;

	/**
	 * 商品标题
	 */
	private String title;

	/**
	 * 商品在分销商那边的实付金额。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0。
	 */
	private BigDecimal fenxiaoPayment;

	/**
	 * 商品退款状态
	 */
	private String itemRefundState;

	/**
	 * 交易明细内的优惠金额。精确到2位小数，单位：元。
	 */
	private BigDecimal discountFee;

	/**
	 * 交易明细中的买家留言列表
	 */
	private TradeBuyerMessage[] buyerMessages;

	/**
	 * 商品状态
	 */
	private String stateStr;

	/**
	 * 交易明细中的优惠信息列表
	 */
	private TradeOrderPromotion[] orderPromotionDetails;

	/**
	 * 商品价格。精确到2位小数；单位：元。
	 */
	private BigDecimal price;

	/**
	 * 商品在分销商那边的出售价格。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0。
	 */
	private BigDecimal fenxiaoPrice;

	/**
	 * 应付金额（商品价格乘以数量的总金额）
	 */
	private BigDecimal totalFee;

	/**
	 * 实付金额。精确到2位小数，单位：元。
	 */
	private BigDecimal payment;

	/**
	 * 卖家昵称
	 */
	private String sellerNick;

	public TradeOrder() {
	}

	public TradeOrder(
		@JsonProperty("outer_sku_id") String outerSkuId,
		@JsonProperty("sku_unique_code") String skuUniqueCode,
		@JsonProperty("outer_item_id") String outerItemId,
		@JsonProperty("pic_thumb_path") String picThumbPath,
		@JsonProperty("item_type") Integer itemType,
		@JsonProperty("num") Long num,
		@JsonProperty("num_iid") Long numIid,
		@JsonProperty("sku_id") Long skuId,
		@JsonProperty("sku_properties_name") String skuPropertiesName,
		@JsonProperty("pic_path") String picPath,
		@JsonProperty("oid") Long oid,
		@JsonProperty("title") String title,
		@JsonProperty("fenxiao_payment") BigDecimal fenxiaoPayment,
		@JsonProperty("item_refund_state") String itemRefundState,
		@JsonProperty("discount_fee") BigDecimal discountFee,
		@JsonProperty("buyer_messages") TradeBuyerMessage[] buyerMessages,
		@JsonProperty("state_str") String stateStr,
		@JsonProperty("order_promotion_details") TradeOrderPromotion[] orderPromotionDetails,
		@JsonProperty("price") BigDecimal price,
		@JsonProperty("fenxiao_price") BigDecimal fenxiaoPrice,
		@JsonProperty("total_fee") BigDecimal totalFee,
		@JsonProperty("payment") BigDecimal payment,
		@JsonProperty("seller_nick") String sellerNick
	) {
		this.outerSkuId = outerSkuId;
		this.skuUniqueCode = skuUniqueCode;
		this.outerItemId = outerItemId;
		this.picThumbPath = picThumbPath;
		this.itemType = itemType;
		this.num = num;
		this.numIid = numIid;
		this.skuId = skuId;
		this.skuPropertiesName = skuPropertiesName;
		this.picPath = picPath;
		this.oid = oid;
		this.title = title;
		this.fenxiaoPayment = fenxiaoPayment;
		this.itemRefundState = itemRefundState;
		this.discountFee = discountFee;
		this.buyerMessages = buyerMessages;
		this.stateStr = stateStr;
		this.orderPromotionDetails = orderPromotionDetails;
		this.price = price;
		this.fenxiaoPrice = fenxiaoPrice;
		this.totalFee = totalFee;
		this.payment = payment;
		this.sellerNick = sellerNick;
	}

	public String getOuterSkuId() {
		return outerSkuId;
	}

	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getSkuUniqueCode() {
		return skuUniqueCode;
	}

	public void setSkuUniqueCode(String skuUniqueCode) {
		this.skuUniqueCode = skuUniqueCode;
	}

	public String getOuterItemId() {
		return outerItemId;
	}

	public void setOuterItemId(String outerItemId) {
		this.outerItemId = outerItemId;
	}

	public String getPicThumbPath() {
		return picThumbPath;
	}

	public void setPicThumbPath(String picThumbPath) {
		this.picThumbPath = picThumbPath;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return skuPropertiesName;
	}

	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getFenxiaoPayment() {
		return fenxiaoPayment;
	}

	public void setFenxiaoPayment(BigDecimal fenxiaoPayment) {
		this.fenxiaoPayment = fenxiaoPayment;
	}

	public String getItemRefundState() {
		return itemRefundState;
	}

	public void setItemRefundState(String itemRefundState) {
		this.itemRefundState = itemRefundState;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

	public TradeBuyerMessage[] getBuyerMessages() {
		return buyerMessages;
	}

	public void setBuyerMessages(TradeBuyerMessage[] buyerMessages) {
		this.buyerMessages = buyerMessages;
	}

	public String getStateStr() {
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public TradeOrderPromotion[] getOrderPromotionDetails() {
		return orderPromotionDetails;
	}

	public void setOrderPromotionDetails(
			TradeOrderPromotion[] orderPromotionDetails) {
		this.orderPromotionDetails = orderPromotionDetails;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getFenxiaoPrice() {
		return fenxiaoPrice;
	}

	public void setFenxiaoPrice(BigDecimal fenxiaoPrice) {
		this.fenxiaoPrice = fenxiaoPrice;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public String getSellerNick() {
		return sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

}
