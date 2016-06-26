package org.oxerr.youzan.service;

import java.io.IOException;
import java.time.Instant;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.Success;
import org.oxerr.youzan.dto.item.SelfFetchTrade;
import org.oxerr.youzan.dto.item.Trade;
import org.oxerr.youzan.dto.item.TradeDetail;
import org.oxerr.youzan.dto.item.Trades;

import com.kdt.api.KdtApiClient;

/**
 * <a href="http://open.youzan.com/api#7">交易接口</a>.
 */
public class TradeService extends BaseService {

	public TradeService(KdtApiClient client) {
		super(client);
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trade.get&apiId=6453">
	 * 获取单笔交易的信息</a>.
	 *
	 * @param tid 交易编号
	 * @param subTradePageSize 指定获取子交易每页条数，不传则获取全部，上限500
	 * @param subTradePageNo 指定获取子交易的第几页，不传则获取全部
	 * @param fields 需要返回的交易对象字段，如tid,title,receiver_city等
	 * @return 单笔交易的信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public TradeDetail getTrade(
		@Nonnull String tid,
		@Nullable Integer subTradePageSize,
		@Nullable Long subTradePageNo,
		@Nullable String fields
	) throws IOException, YouzanException {
		final Trade tradeResponse = readValue(
			"kdt.trade.get",
			new ParamsBuilder(3)
				.put("tid", tid)
				.put("sub_trade_page_size", subTradePageSize)
				.put("sub_trade_page_no", subTradePageNo)
				.put("fields", fields)
				.getParams(),
			TRADE_RESPONSE_TYPE_REF
		);
		return tradeResponse.getTrade();
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trades.sold.get&apiId=6459">
	 * 查询卖家已卖出的交易列表</a>.
	 *
	 * @param version 版本号
	 * @param pageSize 每页条数
	 * @param pageNo 页码
	 * @param useHasNext 是否启用has_next的分页方式
	 * @param startCreated 交易创建开始时间
	 * @param endCreated 交易创建结束时间
	 * @param startUpdate 交易状态更新的开始时间
	 * @param endUpdate 交易状态更新的结束时间
	 * @param type 订单类型 ，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。 可选值：
	 * <ul>
	 * <li>FIXED （一口价）</li>
	 * <li>GIFT （送礼）</li>
	 * <li>BULK_PURCHASE（来自分销商的采购）</li>
	 * <li>PRESENT （赠品领取）</li>
	 * <li>GROUP （拼团订单）</li>
	 * <li>COD （货到付款）</li>
	 * <li>PEER （代付）</li>
	 * <li>QRCODE（扫码商家二维码直接支付的交易）</li>
	 * <li>QRCODE_3RD（线下收银台二维码交易）</li>
	 * </ul>
	 * @param status 一次只能查询一种状态。 可选值：
	 * <ul>
	 * <li>TRADE_NO_CREATE_PAY（没有创建支付交易）</li>
	 * <li>WAIT_BUYER_PAY（等待买家付款）</li>
	 * <li>WAIT_GROUP（等待成团，即：买家已付款，等待成团）</li>
	 * <li>WAIT_SELLER_SEND_GOODS（等待卖家发货，即：买家已付款）</li>
	 * <li>WAIT_BUYER_CONFIRM_GOODS（等待买家确认收货，即：卖家已发货）</li>
	 * <li>TRADE_BUYER_SIGNED（买家已签收）</li>
	 * <li>TRADE_CLOSED（付款以后用户退款成功，交易自动关闭）</li>
	 * <li>ALL_WAIT_PAY（包含：WAIT_BUYER_PAY、TRADE_NO_CREATE_PAY）</li>
	 * <li>ALL_CLOSED（所有关闭订单）</li>
	 * </ul>
	 * @param senderId sender ID
	 * @param buyerId 注册买家ID
	 * @param buyerNick 买家昵称
	 * @param buyWay 购买方式
	 * @param keyword 搜索条件
	 * @param weixinUserType 微信粉丝类型
	 * @param weixinUserId 微信粉丝ID
	 * @param fields 需要返回的交易对象字段
	 * @return 卖家已卖出的交易列表
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public Trades getSoldTrades(
		@Nullable String version,
		@Nullable Integer pageSize,
		@Nullable Long pageNo,
		@Nullable Boolean useHasNext,
		@Nullable Instant startCreated,
		@Nullable Instant endCreated,
		@Nullable Instant startUpdate,
		@Nullable Instant endUpdate,
		@Nullable String type,
		@Nullable String status,
		@Nullable Long senderId,
		@Nullable Long buyerId,
		@Nullable String buyerNick,
		@Nullable String buyWay,
		@Nullable String keyword,
		@Nullable Integer weixinUserType,
		@Nullable Long weixinUserId,
		@Nullable String fields
	) throws IOException, YouzanException {
		final Trades tradesResponse = readValue(
			"kdt.trades.sold.get",
			new ParamsBuilder(18)
				.put("version", version)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.put("use_has_next", useHasNext)
				.put("start_created", startCreated)
				.put("end_created", endCreated)
				.put("start_update", startUpdate)
				.put("end_update", endUpdate)
				.put("type", type)
				.put("status", status)
				.put("senderId", senderId)
				.put("buyer_id", buyerId)
				.put("buyer_nick", buyerNick)
				.put("buy_way", buyWay)
				.put("keyword", keyword)
				.put("weixin_user_type", weixinUserType)
				.put("weixin_user_id", weixinUserId)
				.put("fields", fields)
				.getParams(),
			TRADES_RESPONSE_TYPE_REF
		);
		return tradesResponse;
	}

	/**
	 * @see #getSoldTrades(String, Integer, Long, Boolean, Instant, Instant, Instant, Instant, String, String, Long, Long, String, String, String, Integer, Long, String)
	 */
	public Trades getSoldTrades(
		@Nullable Integer pageSize,
		@Nullable Long pageNo
	) throws IOException, YouzanException {
		return this.getSoldTrades(null, pageSize, pageNo, Boolean.TRUE, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null);
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trade.memo.update&apiId=6931">
	 * 修改一笔交易备注</a>.
	 *
	 * @param tid 交易编号
	 * @param memo 交易备注
	 * @param flag 交易备注加星标，取值为1-5
	 * @param fields 需要返回的交易对象字段，如tid,title,receiver_city等。可选值：TradeDetail交易结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 交易的信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public TradeDetail updateTradeMemo(
		@Nonnull String tid,
		@Nullable String memo,
		@Nullable String flag,
		@Nullable String fields
	) throws IOException, YouzanException {
		final Trade tradeResponse = readValue(
			"kdt.trade.memo.update",
			new ParamsBuilder(3)
				.put("tid", tid)
				.put("memo", memo)
				.put("flag", flag)
				.put("fields", fields)
				.getParams(),
			TRADE_RESPONSE_TYPE_REF
		);
		return tradeResponse.getTrade();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.trade.close&apiId=6932">卖家关闭一笔交易</a>.
	 * <p>买家下单后未支付的情况下卖家关闭订单，在买家付款后该接口失效。</p>
	 *
	 * @param tid 交易订单编号
	 * @param closeReasonId 关闭原因代码
	 * @param closeReason 关闭交易的原因
	 * @param fields 需要返回的交易对象字段，如tid,title,receiver_city等。可选值：TradeDetail交易结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 交易的信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public TradeDetail closeTrade(
		String tid,
		String closeReasonId,
		String closeReason,
		String fields
	) throws IOException, YouzanException {
		final Trade tradeResponse = readValue(
			"kdt.trade.close",
			new ParamsBuilder(4)
				.put("tid", tid)
				.put("close_reason_id", closeReasonId)
				.put("close_reason", closeReason)
				.put("fields", fields)
				.getParams(),
			TRADE_RESPONSE_TYPE_REF
		);
		return tradeResponse.getTrade();
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trade.selffetchcode.apply&apiId=7054">
	 * 核销到店自提订单</a>.
	 *
	 * @param code 提货码
	 * @return 核销结果
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public boolean applySelfFetchTrade(@Nonnull String code)
			throws IOException, YouzanException {
		final Success successResponse = readValue(
			"kdt.trade.selffetchcode.apply",
			new ParamsBuilder(1)
				.put("code", code)
				.getParams(),
			SUCCESS_RESPONSE_TYPE_REF
		);
		return successResponse.isSuccess();
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trade.selffetchcode.get&apiId=7055">
	 * 获取到店自提订单信息</a>.
	 *
	 * @param code 提货码
	 * @param fields 需要返回的交易对象字段，如tid,title,receiver_city等。可选值：TradeDetail交易结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 到店自提订单信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public SelfFetchTrade getSelfFetchTrade(@Nonnull String code,
			@Nullable String fields) throws IOException, YouzanException {
		final SelfFetchTrade selfFetchTradeResponse = readValue(
			"kdt.trade.selffetchcode.get",
			new ParamsBuilder(2)
				.put("code", code)
				.put("fields", fields)
				.getParams(),
			SELF_FETCH_TRADE_RESPONSE_TYPE_REF
		);
		return selfFetchTradeResponse;
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.trades.sold.getforouter&apiId=7145">
	 * 根据第三方userId查询订单列表</a>.
	 *
	 * @param outerType 三方用户ua
	 * @param outerUserId 三方用户userId
	 * @param pageSize 每页条数
	 * @param pageNo 页码
	 * @param useHasNext 是否启用has_next的分页方式
	 * @param startCreated 交易创建开始时间
	 * @param endCreated 交易创建结束时间
	 * @param startUpdate 交易状态更新的开始时间
	 * @param endUpdate 交易状态更新的结束时间
	 * @param type 订单类型 ，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。 可选值： FIXED （一口价） GIFT （送礼） BULK_PURCHASE（来自分销商的采购） PRESENT （赠品领取） GROUP （拼团订单） COD （货到付款） PEER （代付） QRCODE（扫码商家二维码直接支付的交易）
	 * @param status 交易状态 ，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。 可选值： TRADE_NO_CREATE_PAY（没有创建支付交易） WAIT_BUYER_PAY（等待买家付款） WAIT_GROUP（等待成团，即：买家已付款，等待成团） WAIT_SELLER_SEND_GOODS（等待卖家发货，即：买家已付款） WAIT_BUYER_CONFIRM_GOODS（等待买家确认收货，即：卖家已发货） TRADE_BUYER_SIGNED（买家已签收） TRADE_CLOSED（付款以后用户退款成功，交易自动关闭） ALL_WAIT_PAY（包含：WAIT_BUYER_PAY、TRADE_NO_CREATE_PAY） ALL_CLOSED（所有关闭订单）
	 * @param fields 需要返回的交易对象字段
	 * @return 交易订单列表
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public Trades getForOuterSoldTrades(
		@Nonnull String outerType,
		@Nonnull String outerUserId,
		@Nullable Integer pageSize,
		@Nullable Long pageNo,
		@Nullable Boolean useHasNext,
		@Nullable Instant startCreated,
		@Nullable Instant endCreated,
		@Nullable Instant startUpdate,
		@Nullable Instant endUpdate,
		@Nullable String type,
		@Nullable String status,
		@Nullable String fields
	) throws IOException, YouzanException {
		final Trades tradesResponse = readValue(
			"kdt.trades.sold.getforouter ",
			new ParamsBuilder(18)
				.put("outer_type", outerType)
				.put("outer_user_id", outerUserId)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.put("use_has_next", useHasNext)
				.put("start_created", startCreated)
				.put("end_created", endCreated)
				.put("start_update", startUpdate)
				.put("end_update", endUpdate)
				.put("type", type)
				.put("status", status)
				.put("fields", fields)
				.getParams(),
			TRADES_RESPONSE_TYPE_REF
		);
		return tradesResponse;
	}

}
