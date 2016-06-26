package org.oxerr.youzan.service;

import java.io.IOException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.Success;
import org.oxerr.youzan.dto.ump.Coupon;
import org.oxerr.youzan.dto.ump.CouponConsume;
import org.oxerr.youzan.dto.ump.Coupons;
import org.oxerr.youzan.dto.ump.TimelimitedDiscounts;
import org.oxerr.youzan.dto.ump.UmpCoupon;
import org.oxerr.youzan.dto.ump.UmpPromotionVerifylog;
import org.oxerr.youzan.dto.ump.Verifylogs;

import com.kdt.api.KdtApiClient;

/**
 * <a href="http://open.youzan.com/api#3">优惠券优惠码接口</a>.
 */
public class CouponService extends BaseService {

	public CouponService(KdtApiClient client) {
		super(client);
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.ump.coupons.unfinished.all&apiId=6805">
	 * 获取所有未结束的优惠列表（包含未开始的、进行中的）</a>.
	 *
	 * @param fields 需要返回的优惠对象字段。可选值：优惠结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 所有未结束的优惠列表（包含未开始的、进行中的）
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public UmpCoupon[] getAllUnfinishedCoupons(@Nullable String fields)
			throws IOException, YouzanException {
		final Coupons couponsResponse = readValue(
			"kdt.ump.coupons.unfinished.all",
			new ParamsBuilder(1)
				.put("fields", fields)
				.getParams(),
			COUPONS_RESPONSE_TYPE_REF
		);
		return couponsResponse.getCoupons();
	}

	/**
	 * <a href=
	 * "http://open.youzan.com/apidetail?method=kdt.ump.coupon.consume.get&apiId=6818">
	 * 根据核销码获取优惠券/优惠码</a>.
	 *
	 * @param code 核销码
	 * @return 优惠券/优惠码
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public CouponConsume getCouponConsume(@Nonnull String code)
			throws IOException, YouzanException {
		final CouponConsume couponConsume = readValue(
			"kdt.ump.coupon.consume.get",
			new ParamsBuilder(1)
				.put("code", code)
				.getParams(),
			COUPON_CONSUME_RESPONSE_TYPE_REF
		);
		return couponConsume;
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.ump.coupon.consume.verify&apiId=6819">
	 * 核销优惠券/优惠码</a>.
	 *
	 * @param code 核销码
	 * @return 核销结果
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public boolean verifyCouponConsume(@Nonnull String code) throws IOException, YouzanException {
		final Success successResponse = readValue(
			"kdt.ump.coupon.consume.verify",
			new ParamsBuilder(1)
				.put("code", code)
				.getParams(),
			SUCCESS_RESPONSE_TYPE_REF
		);
		return successResponse.isSuccess();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.ump.coupon.consume.verifylogs.get&apiId=7003">
	 * 获取优惠券/优惠码核销记录</a>.
	 *
	 * @param type the type.
	 * @param pageSize the page size.
	 * @param pageNo the page number.
	 * @return 优惠券/优惠码核销记录
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public UmpPromotionVerifylog[] getVerifylogs(@Nullable String type,
			@Nullable Integer pageSize, @Nullable Long pageNo)
					throws IOException, YouzanException {
		final Verifylogs verifylogs = readValue(
			"kdt.ump.coupon.consume.verifylogs.get",
			new ParamsBuilder(3)
				.put("type", type)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.getParams(),
			VERIFYLOGS_RESPONSE_TYPE_REF
		);
		return verifylogs.getVerifylogs();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.ump.coupon.take&apiId=7059">
	 * 微信粉丝领取优惠券优惠码</a>.
	 *
	 * @param weixinOpenId 微信用户对应的openid
	 * @param fansId 微信粉丝id，fans_id与weixin_openid存在一个即可
	 * @param couponGroupId 优惠券码组id
	 * @return 优惠券优惠码
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public Coupon takeCoupon(@Nullable String weixinOpenId,
			@Nullable Long fansId, @Nonnull Long couponGroupId)
					throws IOException, YouzanException {
		final Coupon coupon = readValue(
			"kdt.ump.coupon.take",
			new ParamsBuilder(3)
				.put("weixin_openid", weixinOpenId)
				.put("fans_id", fansId)
				.put("coupon_group_id", couponGroupId)
				.getParams(),
			COUPON_RESPONSE_TYPE_REF
		);
		return coupon;
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.ump.timelimiteddiscount.find&apiId=7155">
	 * 获取限时折扣的商品和折扣信息</a>.
	 *
	 * @param pageSize 每页多少行数据(默认40行，最大500行)
	 * @param pageNo 第几页
	 * @return 限时折扣的商品和折扣信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public TimelimitedDiscounts getTimelimitedDiscounts(
			@Nonnull Integer pageSize, @Nonnull Long pageNo)
					throws IOException, YouzanException {
		final TimelimitedDiscounts timelimitedDiscounts = readValue(
			"kdt.ump.timelimiteddiscount.find",
			new ParamsBuilder(2)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.getParams(),
			TIMELIMITED_DISCOUNTS_RESPONSE_TYPE_REF
		);
		return timelimitedDiscounts;
	}

}
