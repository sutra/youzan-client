package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradeDetail">交易数据结构</a>.
 */
public class TradeDetail implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 卖家发货时间
	 */
	private Instant consignTime;

	/**
	 * 买家下单的地区
	 */
	private String buyerArea;

	/**
	 * 商品购买数量。当一个trade对应多个order的时候，值为所有商品购买数量之和。
	 */
	private Long num;

	private AdjustFee adjustFee;

	/**
	 * 分销/采购单:
	 * <ul>
	 * <li>source:采购单</li>
	 * <li>fenxiao:分销单</li>
	 * <li>空串则为非分销/采购单</li>
	 * </ul>
	 */
	private String relationType;

	/**
	 * 交易类型。
	 * 取值范围：
	 * <ul>
	 * <li>FIXED （一口价）</li>
	 * <li>GIFT （送礼）</li>
	 * <li>BULK_PURCHASE（来自分销商的采购）</li>
	 * <li>PRESENT （赠品领取）</li>
	 * <li>GROUP （拼团订单）</li>
	 * <li>COD （货到付款）</li>
	 * <li>PEER （代付）</li>
	 * <li>QRCODE（扫码商家二维码直接支付的交易）</li>
	 * <li>QRCODE_3RD（线下收银台二维码交易)</li>
	 * </ul>
	 */
	private String type;

	/**
	 * 买家ID。
	 * 当 buyer_type 为 1 时，buyer_id 的值等于 weixin_user_id 的值。
	 */
	private Long buyerId;

	/**
	 * 交易编号
	 */
	private String tid;

	/**
	 * 交易维权状态。
	 * <ul>
	 * <li>0 无维权</li>
	 * <li>1 顾客发起维权</li>
	 * <li>2 顾客拒绝商家的处理结果</li>
	 * <li>3 顾客接受商家的处理结果</li>
	 * <li>9 商家正在处理</li>
	 * <li>101 维权处理中</li>
	 * <li>110 维权结束</li>
	 * </ul>
	 * 备注：1到10的状态码是微信维权状态码，100以上的状态码是有赞维权状态码。
	 */
	private Integer feedback;

	/**
	 * 第三方APP用户id。
	 */
	private Long outerUserId;

	/**
	 * 商品价格。
	 * 精确到2位小数；单位：元。
	 * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的价格。
	 */
	private BigDecimal price;

	/**
	 * 商品总价（商品价格乘以数量的总金额）。
	 * 单位：元，精确到分。
	 */
	private BigDecimal totalFee;

	/**
	 * 实付金额。
	 * 单位：元，精确到分。
	 */
	private BigDecimal payment;

	/**
	 * 微信粉丝ID
	 */
	private Long weixinUserId;

	/**
	 * 交易中包含的子交易，目前：仅在送礼订单中会有子交易
	 */
	private TradeDetail[] subTrades;

	/**
	 * 买家购买附言
	 */
	private String buyerMessage;

	/**
	 * 交易创建时间
	 */
	private Instant created;

	/**
	 * 买家付款时间
	 */
	private Instant payTime;

	/**
	 * 代付订单外部交易号列表，非代付订单类型返回空。
	 */
	private String[] outTradeNo;

	/**
	 * 交易明细列表
	 */
	private TradeOrder[] orders;

	/**
	 * 在交易中使用到优惠活动详情，包括：满减满送。
	 */
	private TradePromotion[] promotionDetails;

	/**
	 * 退款状态。
	 * 取值范围：
	 * <ul>
	 * <li>NO_REFUND（无退款）</li>
	 * <li>PARTIAL_REFUNDING（部分退款中）</li>
	 * <li>PARTIAL_REFUNDED（已部分退款）</li>
	 * <li>PARTIAL_REFUND_FAILED（部分退款失败）</li>
	 * <li>FULL_REFUNDING（全额退款中）</li>
	 * <li>FULL_REFUNDED（已全额退款）</li>
	 * <li>FULL_REFUND_FAILED（全额退款失败）</li>
	 * </ul>
	 */
	private String refundState;

	/**
	 * 交易状态。
	 * 取值范围：
	 * <ul>
	 * <li>TRADE_NO_CREATE_PAY (没有创建支付交易)</li>
	 * <li>WAIT_BUYER_PAY (等待买家付款)</li>
	 * <li>WAIT_PAY_RETURN (等待支付确认)</li>
	 * <li>WAIT_GROUP（等待成团，即：买家已付款，等待成团）</li>
	 * <li>WAIT_SELLER_SEND_GOODS (等待卖家发货，即：买家已付款)</li>
	 * <li>WAIT_BUYER_CONFIRM_GOODS (等待买家确认收货，即：卖家已发货)</li>
	 * <li>TRADE_BUYER_SIGNED (买家已签收)</li>
	 * <li>TRADE_CLOSED (付款以后用户退款成功，交易自动关闭)</li>
	 * <li>TRADE_CLOSED_BY_USER (付款以前，卖家或买家主动关闭交易)</li>
	 * </ul>
	 */
	private String status;

	/**
	 * 运费。单位：元，精确到分。
	 */
	private BigDecimal postFee;

	/**
	 * 商品主图片缩略图地址
	 */
	private String picThumbPath;

	/**
	 * 收货人的所在城市。
	 * PS：
	 * 如果订单类型是送礼订单，收货地址在sub_trades字段中；
	 * 如果物流方式是到店自提，收货地址在fetch_detail字段中。
	 */
	private String receiverCity;

	/**
	 * 创建交易时的物流方式。
	 * 取值范围：
	 * <ul>
	 * <li>express（快递）</li>
	 * <li>fetch（到店自提）</li>
	 * </ul>
	 */
	private String shippingType;

	/**
	 * 交易完成后退款的金额。
	 * 单位：元，精确到分。
	 */
	private BigDecimal refundedFee;

	/**
	 * 商品数字编号。
	 * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的编号。
	 */
	private Long numIid;

	/**
	 * 交易标题，以首个商品标题作为此标题的值。
	 */
	private String title;

	/**
	 * 交易优惠金额（不包含交易明细中的优惠金额）。单位：元，精确到分。
	 */
	private BigDecimal discountFee;

	/**
	 * 收货人的所在省份
	 */
	private String receiverState;

	/**
	 * 交易更新时间。当交易的：状态改变、备注更改、星标更改 等情况下都会刷新更新时间。
	 */
	private Instant updateTime;

	/**
	 * 在交易中使用到的卡券的详情，包括：优惠券、优惠码。
	 */
	private UmpTradeCoupon[] couponDetails;

	/**
	 * 收货人的邮编
	 */
	private String receiverZip;

	/**
	 * 收货人的姓名
	 */
	private String receiverName;

	/**
	 * 支付类型。
	 * 取值范围：
	 * <ul>
	 * <li>WEIXIN (微信自有支付)</li>
	 * <li>WEIXIN_DAIXIAO (微信代销支付)</li>
	 * <li>ALIPAY (支付宝支付)</li>
	 * <li>BANKCARDPAY (银行卡支付)</li>
	 * <li>PEERPAY (代付)</li>
	 * <li>CODPAY (货到付款)</li>
	 * <li>BAIDUPAY (百度钱包支付)</li>
	 * <li>PRESENTTAKE (直接领取赠品)</li>
	 * <li>COUPONPAY（优惠券/码全额抵扣）</li>
	 * <li>BULKPURCHASE（来自分销商的采购）</li>
	 * <li>MERGEDPAY (合并付货款)</li>
	 * <li>ECARD（有赞E卡通支付）</li>
	 * </ul>
	 */
	private String payType;

	/**
	 * 利润（分销订单特有）。
	 * 格式：5.20；单位：元；精确到：分。
	 */
	private BigDecimal profit;

	/**
	 * 如果是到店自提交易，返回自提详情，否则返回空。
	 */
	private TradeFetch fetchDetail;

	/**
	 * 买家类型。
	 * 取值范围：
	 * <ul>
	 * <li>0 为未知</li>
	 * <li>1 为微信粉丝</li>
	 * <li>2 为微博粉丝</li>
	 * </ul>
	 */
	private Integer buyerType;

	/**
	 * 收货人的所在地区
	 */
	private String receiverDistrict;

	/**
	 * 商品主图片地址。
	 * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的图片地址。
	 */
	private String picPath;

	/**
	 * 收货人的手机号码
	 */
	private String receiverMobile;

	/**
	 * 买家签收时间
	 */
	private Instant signTime;

	/**
	 * 卖家备注星标，取值范围 1、2、3、4、5；如果为0，表示没有备注星标。
	 */
	private Integer sellerFlag;

	/**
	 * 买家昵称
	 */
	private String buyerNick;

	/**
	 * 结算状态（分销订单特有）。1：已结算，0：未结算。
	 */
	private Integer handled;

	/**
	 * 收货人的详细地址
	 */
	private String receiverAddress;

	/**
	 * 卖家对该交易的备注
	 */
	private String tradeMemo;

	/**
	 * relation_type返回source时,为分销订单号列表
	 * 返回fenxiao时,为供应商订单号列表
	 * 返回空时,列表返回空
	 */
	private String[] relations;

	/**
	 * 外部交易编号。比如，如果支付方式是微信支付，就是财付通的交易单号
	 */
	private String outerTid;

	public TradeDetail(
		@JsonProperty("consign_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant consignTime,
		@JsonProperty("buyer_area") String buyerArea,
		@JsonProperty("num") Long num,
		@JsonProperty("adjust_fee") AdjustFee adjustFee,
		@JsonProperty("relation_type") String relationType,
		@JsonProperty("type") String type,
		@JsonProperty("buyer_id") Long buyerId,
		@JsonProperty("tid") String tid,
		@JsonProperty("feedback") Integer feedback,
		@JsonProperty("outer_user_id") Long outerUserId,
		@JsonProperty("price") BigDecimal price,
		@JsonProperty("total_fee") BigDecimal totalFee,
		@JsonProperty("payment") BigDecimal payment,
		@JsonProperty("weixin_user_id") Long weixinUserId,
		@JsonProperty("sub_trades") TradeDetail[] subTrades,
		@JsonProperty("buyer_message") String buyerMessage,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("pay_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant payTime,
		@JsonProperty("out_trade_no") String[] outTradeNo,
		@JsonProperty("orders") TradeOrder[] orders,
		@JsonProperty("promotion_details") TradePromotion[] promotionDetails,
		@JsonProperty("refund_state") String refundState,
		@JsonProperty("status") String status,
		@JsonProperty("post_fee") BigDecimal postFee,
		@JsonProperty("pic_thumb_path") String picThumbPath,
		@JsonProperty("receiver_city") String receiverCity,
		@JsonProperty("shipping_type") String shippingType,
		@JsonProperty("refunded_fee") BigDecimal refundedFee,
		@JsonProperty("num_iid") Long numIid,
		@JsonProperty("title") String title,
		@JsonProperty("discount_fee") BigDecimal discountFee,
		@JsonProperty("receiver_state") String receiverState,
		@JsonProperty("update_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant updateTime,
		@JsonProperty("coupon_details") UmpTradeCoupon[] couponDetails,
		@JsonProperty("receiver_zip") String receiverZip,
		@JsonProperty("receiver_name") String receiverName,
		@JsonProperty("pay_type") String payType,
		@JsonProperty("profit") BigDecimal profit,
		@JsonProperty("fetch_detail") TradeFetch fetchDetail,
		@JsonProperty("buyer_type") Integer buyerType,
		@JsonProperty("receiver_district") String receiverDistrict,
		@JsonProperty("pic_path") String picPath,
		@JsonProperty("receiver_mobile") String receiverMobile,
		@JsonProperty("sign_time")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant signTime,
		@JsonProperty("seller_flag") Integer sellerFlag,
		@JsonProperty("buyer_nick") String buyerNick,
		@JsonProperty("handled") Integer handled,
		@JsonProperty("receiver_address") String receiverAddress,
		@JsonProperty("trade_memo") String tradeMemo,
		@JsonProperty("relations") String[] relations,
		@JsonProperty("outer_tid") String outerTid
	) {
		this.consignTime = consignTime;
		this.buyerArea = buyerArea;
		this.num = num;
		this.adjustFee = adjustFee;
		this.relationType = relationType;
		this.type = type;
		this.buyerId = buyerId;
		this.tid = tid;
		this.feedback = feedback;
		this.outerUserId = outerUserId;
		this.price = price;
		this.totalFee = totalFee;
		this.payment = payment;
		this.weixinUserId = weixinUserId;
		this.subTrades = subTrades;
		this.buyerMessage = buyerMessage;
		this.created = created;
		this.payTime = payTime;
		this.outTradeNo = outTradeNo;
		this.orders = orders;
		this.promotionDetails = promotionDetails;
		this.refundState = refundState;
		this.status = status;
		this.postFee = postFee;
		this.picThumbPath = picThumbPath;
		this.receiverCity = receiverCity;
		this.shippingType = shippingType;
		this.refundedFee = refundedFee;
		this.numIid = numIid;
		this.title = title;
		this.discountFee = discountFee;
		this.receiverState = receiverState;
		this.updateTime = updateTime;
		this.couponDetails = couponDetails;
		this.receiverZip = receiverZip;
		this.receiverName = receiverName;
		this.payType = payType;
		this.profit = profit;
		this.fetchDetail = fetchDetail;
		this.buyerType = buyerType;
		this.receiverDistrict = receiverDistrict;
		this.picPath = picPath;
		this.receiverMobile = receiverMobile;
		this.signTime = signTime;
		this.sellerFlag = sellerFlag;
		this.buyerNick = buyerNick;
		this.handled = handled;
		this.receiverAddress = receiverAddress;
		this.tradeMemo = tradeMemo;
		this.relations = relations;
		this.outerTid = outerTid;
	}

	public Instant getConsignTime() {
		return consignTime;
	}

	public void setConsignTime(Instant consignTime) {
		this.consignTime = consignTime;
	}

	public String getBuyerArea() {
		return buyerArea;
	}

	public void setBuyerArea(String buyerArea) {
		this.buyerArea = buyerArea;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public AdjustFee getAdjustFee() {
		return adjustFee;
	}

	public void setAdjustFee(AdjustFee adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public Integer getFeedback() {
		return feedback;
	}

	public void setFeedback(Integer feedback) {
		this.feedback = feedback;
	}

	public Long getOuterUserId() {
		return outerUserId;
	}

	public void setOuterUserId(Long outerUserId) {
		this.outerUserId = outerUserId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public Long getWeixinUserId() {
		return weixinUserId;
	}

	public void setWeixinUserId(Long weixinUserId) {
		this.weixinUserId = weixinUserId;
	}

	public TradeDetail[] getSubTrades() {
		return subTrades;
	}

	public void setSubTrades(TradeDetail[] subTrades) {
		this.subTrades = subTrades;
	}

	public String getBuyerMessage() {
		return buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public Instant getPayTime() {
		return payTime;
	}

	public void setPayTime(Instant payTime) {
		this.payTime = payTime;
	}

	public String[] getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String[] outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public TradeOrder[] getOrders() {
		return orders;
	}

	public void setOrders(TradeOrder[] orders) {
		this.orders = orders;
	}

	public TradePromotion[] getPromotionDetails() {
		return promotionDetails;
	}

	public void setPromotionDetails(TradePromotion[] promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public String getRefundState() {
		return refundState;
	}

	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getPostFee() {
		return postFee;
	}

	public void setPostFee(BigDecimal postFee) {
		this.postFee = postFee;
	}

	public String getPicThumbPath() {
		return picThumbPath;
	}

	public void setPicThumbPath(String picThumbPath) {
		this.picThumbPath = picThumbPath;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public BigDecimal getRefundedFee() {
		return refundedFee;
	}

	public void setRefundedFee(BigDecimal refundedFee) {
		this.refundedFee = refundedFee;
	}

	public Long getNumIid() {
		return numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

	public String getReceiverState() {
		return receiverState;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public Instant getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Instant updateTime) {
		this.updateTime = updateTime;
	}

	public UmpTradeCoupon[] getCouponDetails() {
		return couponDetails;
	}

	public void setCouponDetails(UmpTradeCoupon[] couponDetails) {
		this.couponDetails = couponDetails;
	}

	public String getReceiverZip() {
		return receiverZip;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public TradeFetch getFetchDetail() {
		return fetchDetail;
	}

	public void setFetchDetail(TradeFetch fetchDetail) {
		this.fetchDetail = fetchDetail;
	}

	public Integer getBuyerType() {
		return buyerType;
	}

	public void setBuyerType(Integer buyerType) {
		this.buyerType = buyerType;
	}

	public String getReceiverDistrict() {
		return receiverDistrict;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public Instant getSignTime() {
		return signTime;
	}

	public void setSignTime(Instant signTime) {
		this.signTime = signTime;
	}

	public Integer getSellerFlag() {
		return sellerFlag;
	}

	public void setSellerFlag(Integer sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

	public String getBuyerNick() {
		return buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Integer getHandled() {
		return handled;
	}

	public void setHandled(Integer handled) {
		this.handled = handled;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String[] getRelations() {
		return relations;
	}

	public void setRelations(String[] relations) {
		this.relations = relations;
	}

	public String getOuterTid() {
		return outerTid;
	}

	public void setOuterTid(String outerTid) {
		this.outerTid = outerTid;
	}

}
