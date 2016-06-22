package org.oxerr.youzan.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.oxerr.youzan.YouzanException;
import org.oxerr.youzan.dto.GoodsDetail;
import org.oxerr.youzan.dto.GoodsSku;
import org.oxerr.youzan.dto.response.ItemResponse;
import org.oxerr.youzan.dto.response.ItemsResponse;
import org.oxerr.youzan.dto.response.SkuResponse;
import org.oxerr.youzan.dto.response.SkusResponse;
import org.oxerr.youzan.dto.response.SuccessResponse;

import com.kdt.api.KdtApiClient;

/**
 * <a href="http://open.youzan.com/api#1">商品接口</a>.
 */
public class ItemService extends BaseService {

	public ItemService(KdtApiClient client) {
		super(client);
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.delete&apiId=6449">删除一个商品</a>.
	 *
	 * @param numIid 商品数字编号
	 * @return true if delete successfully.
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public boolean deleteItem(@Nonnull Long numIid)
			throws IOException, YouzanException {
		final SuccessResponse successResponse = readValue(
			"kdt.item.delete",
			new ParamsBuilder(1)
				.put("num_iid", numIid)
				.getParams(),
			SUCCESS_RESPONSE_TYPE_REF
		);
		return successResponse.isSuccess();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.update&apiId=6451">更新单个商品信息</a>.
	 *
	 * @param item the item to be updated.
	 * @param fields 需要返回的商品对象字段
	 * @return the updated item.
	 * @throws IOException indicates i/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail updateItem(GoodsDetail item, String fields)
			throws IOException, YouzanException {
		final ItemResponse itemResponse = readValue(
			"kdt.item.update",
			new ParamsBuilder()
				.putAll(ParamsAdapter.toParams(item))
				.put("fields", fields)
				.getParams(),
			ITEM_RESPONSE_TYPE_REF
		);
		return itemResponse.getItem();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.get&apiId=6452">获取单个商品信息</a>.
	 *
	 * @param numIid 商品数字编号
	 * @param fields 需要返回的商品对象字段，如title,price,desc等
	 * @param alias 商品别名 调用时，参数 num_iid 和 alias 必须选其一
	 * @return 单个商品信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail getItem(@Nullable Long numIid, @Nullable String fields,
			@Nullable String alias) throws IOException, YouzanException {
		if (numIid == null && alias == null) {
			throw new IllegalArgumentException("参数 num_iid 和 alias 必须选其一");
		}

		final ItemResponse itemResponse = readValue(
			"kdt.item.get",
			new ParamsBuilder(3)
				.put("num_iid", numIid)
				.put("fields", fields)
				.put("alias", alias)
				.getParams(),
			ITEM_RESPONSE_TYPE_REF
		);
		return itemResponse.getItem();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.update.listing&apiId=6458">商品上架</a>.
	 *
	 * @param numIid 商品数字编号
	 * @param fields 需要返回的商品对象字段
	 * @return 商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail listingItem(@Nonnull Long numIid,
			@Nullable String fields) throws IOException, YouzanException {
		final ItemResponse itemResponse = readValue(
			"kdt.item.update.listing",
			new ParamsBuilder(2)
				.put("num_iid", numIid)
				.put("fields", fields)
				.getParams(),
			ITEM_RESPONSE_TYPE_REF
		);
		return itemResponse.getItem();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.update.delisting&apiId=6457">商品下架</a>.
	 *
	 * @param numIid 商品数字编号
	 * @param fields 需要返回的商品对象字段
	 * @return 商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail delistingItem(@Nonnull Long numIid,
			@Nullable String fields) throws IOException, YouzanException {
		final ItemResponse itemResponse = readValue(
			"kdt.item.update.delisting",
			new ParamsBuilder(2)
				.put("num_iid", numIid)
				.put("fields", fields)
				.getParams(),
			ITEM_RESPONSE_TYPE_REF
		);
		return itemResponse.getItem();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.items.update.listing&apiId=6736">批量上架商品</a>.
	 *
	 * @param numIids 商品数字编号
	 * @return 商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public boolean listingItems(@Nonnull Long[] numIids)
			throws IOException, YouzanException {
		final SuccessResponse successResponse = readValue(
			"kdt.items.update.listing",
			new ParamsBuilder(1)
				.put("num_iids",
					String.join(",", Arrays.stream(numIids)
						.map(n -> n.toString())
						.collect(Collectors.toList())))
				.getParams(),
			SUCCESS_RESPONSE_TYPE_REF
		);
		return successResponse.isSuccess();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.items.update.delisting&apiId=6737">批量下架商品</a>.
	 *
	 * @param numIids 商品数字编号
	 * @return 商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public boolean delistingItems(@Nonnull Long[] numIids)
			throws IOException, YouzanException {
		final SuccessResponse successResponse = readValue(
			"kdt.items.update.delisting",
			new ParamsBuilder(1)
				.put("num_iids",
					String.join(",", Arrays.stream(numIids)
						.map(n -> n.toString())
						.collect(Collectors.toList())))
				.getParams(),
			SUCCESS_RESPONSE_TYPE_REF
		);
		return successResponse.isSuccess();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.skus.custom.get&apiId=6738">根据外部编号取商品Sku</a>.
	 * <p>跟据商家编码（商家为Sku设置的外部编号）获取商品Sku，如果一个outer_id对应多个Sku会返回所有符合条件的Sku。</p>
	 * @param outerId 商家编码（商家为Sku设置的外部编号）
	 * @param numIid 商品数字编号
	 * @param fields 需要返回的Sku对象字段，如sku_id,num_iid,quantity等。可选值：Sku结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 商品Sku
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsSku[] getSkus(@Nonnull String outerId, @Nonnull Long numIid,
			@Nullable String fields) throws IOException, YouzanException {
		final SkusResponse skusResponse = readValue(
			"kdt.skus.custom.get",
			new ParamsBuilder(3)
				.put("outer_id", outerId)
				.put("num_iid", numIid)
				.put("fields", fields)
				.getParams(),
			SKUS_RESPONSE_TYPE_REF
		);
		return skusResponse.getSkus();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.items.onsale.get&apiId=6739">获取出售中的商品列表</a>.
	 *
	 * @param tagId 商品标签的ID
	 * @param q 搜索字段。搜索商品的title
	 * @param pageSize 每页条数
	 * @param pageNo 页码
	 * @param orderBy 排序方式。格式为column:asc/desc，column可选值：created 创建时间
	 * @param fields 需要返回的商品对象字段，如title,price,desc等。可选值：Item商品结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 出售中的商品列表
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail[] getOnsaleItems(@Nullable Long tagId, @Nullable String q,
			@Nullable Integer pageSize, @Nullable Long pageNo,
			@Nullable String orderBy, @Nullable String fields)
					throws IOException, YouzanException {
		final ItemsResponse itemsResponse = readValue(
			"kdt.items.onsale.get",
			new ParamsBuilder(6)
				.put("tag_id", tagId)
				.put("q", q)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.put("order_by", orderBy)
				.put("fields", fields)
				.getParams(),
			ITEMS_RESPONSE_TYPE_REF
		);
		return itemsResponse.getItems();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.items.inventory.get&apiId=6740">获取仓库中的商品列表</a>.
	 *
	 * @param tagId 商品标签的ID
	 * @param q 搜索字段。搜索商品的title
	 * @param pageSize 每页条数
	 * @param pageNo 页码
	 * @param orderBy 排序方式。格式为column:asc/desc，column可选值：created 创建时间 / modified 修改时间
	 * @param fields 需要返回的商品对象字段，如title,price,desc等。可选值：Item商品结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @param banner 分类字段。可选值：for_shelved（已下架的）/ sold_out（已售罄的）
	 * @return 仓库中的商品列表
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail[] getInventoryItems(@Nullable Long tagId, @Nullable String q,
			@Nullable Integer pageSize, @Nullable Long pageNo,
			@Nullable String orderBy, @Nullable String fields,
			@Nullable String banner) throws IOException, YouzanException {
		final ItemsResponse itemsResponse = readValue(
			"kdt.items.inventory.get",
			new ParamsBuilder(4)
				.put("page_size", pageSize)
				.put("page_no", pageNo)
				.put("order_by", orderBy)
				.put("fields", fields)
				.getParams(),
			ITEMS_RESPONSE_TYPE_REF
		);
		return itemsResponse.getItems();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.items.custom.get&apiId=6741">根据商品货号获取商品</a>.
	 *
	 * @param outerId 商品货号（商家为商品设置的外部编号）
	 * @param fields 需要返回的商品对象字段，如title,price,desc等。可选值：Item商品结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
	 * @return 商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail[] getItems(@Nonnull String outerId,
			@Nullable String fields) throws IOException, YouzanException {
		final ItemsResponse itemsResponse = readValue(
			"kdt.items.custom.get",
			new ParamsBuilder(2)
				.put("outer_id", outerId)
				.put("fields", fields)
				.getParams(),
			ITEMS_RESPONSE_TYPE_REF
		);
		return itemsResponse.getItems();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.sku.update&apiId=6742">更新SKU信息</a>.
	 *
	 * @param skuId Sku数字ID
	 * @param quantity Sku的库存数量
	 * @param price Sku的销售价格。精确到2位小数；单位：元
	 * @param outerId 商家编码（商家为Sku设置的外部编号）
	 * @param numIid 商品数字编号
	 * @return SKU信息
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsSku updateSku(@Nonnull Long skuId, @Nullable Long quantity,
			@Nullable BigDecimal price, @Nullable String outerId,
			@Nonnull Long numIid) throws IOException, YouzanException {
		final SkuResponse skuResponse = readValue(
			"kdt.item.sku.update",
			new ParamsBuilder(5)
				.put("sku_id", skuId)
				.put("quantity", quantity)
				.put("price", price)
				.put("outer_id", outerId)
				.put("num_iid", numIid)
				.getParams(),
			SKU_RESPONSE_TYPE_REF
		);
		return skuResponse.getSku();
	}

	/**
	 * <a href="http://open.youzan.com/apidetail?method=kdt.item.add&apiId=6748">新增一个商品</a>.
	 *
	 * @param item 商品信息。
	 * @param fields 需要返回的商品对象字段，如title,price,desc等。可选值：Item商品结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有'
	 * @return 新增的商品
	 * @throws IOException indicates I/O exception.
	 * @throws YouzanException indicates Youzan business exception.
	 */
	public GoodsDetail addItem(GoodsDetail item, String fields)
			throws IOException, YouzanException {
		final ItemResponse itemResponse = readValue(
			"kdt.item.add",
			new ParamsBuilder()
				.putAll(ParamsAdapter.toParams(item))
				.put("fields", fields)
				.getParams(),
			ITEM_RESPONSE_TYPE_REF
		);
		return itemResponse.getItem();
	}

}
