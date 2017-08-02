package org.oxerr.youzan.service;

import java.util.Map;

import org.oxerr.youzan.dto.item.GoodsDetail;

public final class ParamsAdapter {

	private ParamsAdapter() {
	}

	public static Map<String, String> toParams(GoodsDetail item) {
		return new ParamsBuilder()
			.put("ump_tags", item.getUmpTags())
			.put("ump_level", item.getUmpLevel())
			.put("title", item.getTitle())
			.put("template_id", item.getTemplateId())
			.put("tag_ids", item.getTagIds())
			.put("skus_with_json", item.getSkus())
			// .put("sku_quantities", "TODO")
			// .put("sku_properties", "TODO")
			// .put("sku_prices", "TODO")
			// .put("sku_outer_ids", "TODO")
			.put("quantity", item.getNum())
			.put("purchase_right", item.getPurchaseRight())
			.put("promotion_cid", item.getPromotionCid())
			.put("price", item.getPrice())
			.put("post_fee", item.getPostFee())
			.put("outer_id", item.getOuterId())
			.put("origin_price", item.getOriginPrice())
			.put("num_iid", item.getNumIid())
			// .put("messages", "TODO")
			// .put("keep_item_img_ids", "TODO")
			.put("join_level_discount", item.getJoinLevelDiscount())
			.put("is_used", item.getIsUsed())
			// .put("images", "TODO")
			// .put("image_ids", "TODO")
			// .put("hide_quantity", "TODO")
			.put("desc", item.getDesc())
			.put("delivery_template_id", item.getDeliveryTemplateId())
			.put("cid", item.getCid())
			.put("buy_url", item.getOuterBuyUrl())
			.put("buy_quota", item.getBuyQuota())
			.put("auto_listing_time", item.getAutoListingTime())
			.getParams();
	}

}
