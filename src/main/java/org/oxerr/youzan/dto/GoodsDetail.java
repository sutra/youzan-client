package org.oxerr.youzan.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Map;

import org.oxerr.youzan.dto.deserializer.EpochSecondStringDeserializer;
import org.oxerr.youzan.dto.deserializer.InstantDeserializer;
import org.oxerr.youzan.service.ParamsBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsDetail">商品数据结构</a>.
 */
public class GoodsDetail extends BaseObject {

	private static final long serialVersionUID = 2016061901L;

	private Boolean isVirtual;
	private Instant autoListingTime;
	private String detailUrl;
	private BigDecimal postFee;
	private GoodsSku[] skus;
	private GoodsQrcode[] itemQrcodes;
	private String[] umpLevel;
	private Long promotionCid;
	private Long buyQuota;
	private Integer itemType;
	private Long num;
	private String deliveryTemplateFee;
	private String templateTitle;
	private Long numIid;
	private String title;
	private String outerId;
	private Boolean joinLevelDiscount;
	private Integer purchaseRight;
	private String[] umpTagsText;
	private BigDecimal price;
	private String alias;
	private Integer postType;
	private String[] umpLevelText;
	private String deliveryTemplateName;
	private Long order;
	private String[] umpTags;
	private String tagIds;
	private Boolean isSupplierItem;
	private Long likeCount;
	private GoodsTag[] itemTags;
	private GoodsImage[] itemImgs;
	private Boolean isListing;
	private Boolean isUsed;
	private Long soldNum;
	private String outerBuyUrl;
	private String productType;
	private String shareUrl;
	private String picThumbUrl;
	private Long deliveryTemplateId;
	private Boolean isLock;
	private Map<String, String>[] messages;
	private Long templateId;
	private String originPrice;
	private String picUrl;
	private Long cid;
	private String desc;

	public GoodsDetail(
		@JsonProperty("is_virtual") Boolean isVirtual,
		@JsonProperty("auto_listing_time")
		@JsonDeserialize(using = EpochSecondStringDeserializer.class)
		Instant autoListingTime,
		@JsonProperty("detail_url") String detailUrl,
		@JsonProperty("post_fee") BigDecimal postFee,
		@JsonProperty("skus") GoodsSku[] skus,
		@JsonProperty("item_qrcodes") GoodsQrcode[] itemQrcodes,
		@JsonProperty("ump_level") String[] umpLevel,
		@JsonProperty("promotion_cid") Long promotionCid,
		@JsonProperty("buy_quota") Long buyQuota,
		@JsonProperty("item_type") Integer itemType,
		@JsonProperty("num") Long num,
		@JsonProperty("delivery_template_fee") String deliveryTemplateFee,
		@JsonProperty("template_title") String templateTitle,
		@JsonProperty("num_iid") Long numIid,
		@JsonProperty("title") String title,
		@JsonProperty("outer_id") String outerId,
		@JsonProperty("join_level_discount") String joinLevelDiscount,
		@JsonProperty("purchase_right") Integer purchaseRight,
		@JsonProperty("ump_tags_text") String[] umpTagsText,
		@JsonProperty("price") BigDecimal price,
		@JsonProperty("alias") String alias,
		@JsonProperty("post_type") Integer postType,
		@JsonProperty("ump_level_text") String[] umpLevelText,
		@JsonProperty("delivery_template_name") String deliveryTemplateName,
		@JsonProperty("order") Long order,
		@JsonProperty("ump_tags") String[] umpTags,
		@JsonProperty("tag_ids") String tagIds,
		@JsonProperty("is_supplier_item") Boolean isSupplierItem,
		@JsonProperty("like_count") Long likeCount,
		@JsonProperty("item_tags") GoodsTag[] itemTags,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("item_imgs") GoodsImage[] itemImgs,
		@JsonProperty("is_listing") Boolean isListing,
		@JsonProperty("is_used") Boolean isUsed,
		@JsonProperty("sold_num") Long soldNum,
		@JsonProperty("outer_buy_url") String outerBuyUrl,
		@JsonProperty("product_type") String productType,
		@JsonProperty("share_ur") String shareUrl,
		@JsonProperty("pic_thumb_url") String picThumbUrl,
		@JsonProperty("delivery_template_id") Long deliveryTemplateId,
		@JsonProperty("is_lock") Boolean isLock,
		@JsonProperty("messages") Map<String, String>[] messages,
		@JsonProperty("template_id") Long templateId,
		@JsonProperty("origin_price") String originPrice,
		@JsonProperty("pic_url") String picUrl,
		@JsonProperty("cid") Long cid,
		@JsonProperty("desc") String desc
	) {
		super(created);
		this.isVirtual = isVirtual;
		this.autoListingTime = autoListingTime;
		this.detailUrl = detailUrl;
		this.postFee = postFee;
		this.skus = skus;
		this.itemQrcodes = itemQrcodes;
		this.umpLevel = umpLevel;
		this.promotionCid = promotionCid;
		this.buyQuota = buyQuota;
		this.itemType = itemType;
		this.num = num;
		this.deliveryTemplateFee = deliveryTemplateFee;
		this.templateTitle = templateTitle;
		this.numIid = numIid;
		this.title = title;
		this.outerId = outerId;
		this.joinLevelDiscount = "1".equals(joinLevelDiscount);
		this.purchaseRight = purchaseRight;
		this.umpTagsText = umpTagsText;
		this.price = price;
		this.alias = alias;
		this.postType = postType;
		this.umpLevelText = umpLevelText;
		this.deliveryTemplateName = deliveryTemplateName;
		this.order = order;
		this.umpTags = umpTags;
		this.tagIds = tagIds;
		this.isSupplierItem = isSupplierItem;
		this.likeCount = likeCount;
		this.itemTags = itemTags;
		this.itemImgs = itemImgs;
		this.isListing = isListing;
		this.isUsed = isUsed;
		this.soldNum = soldNum;
		this.outerBuyUrl = outerBuyUrl;
		this.productType = productType;
		this.shareUrl = shareUrl;
		this.picThumbUrl = picThumbUrl;
		this.deliveryTemplateId = deliveryTemplateId;
		this.isLock = isLock;
		this.messages = messages;
		this.templateId = templateId;
		this.originPrice = originPrice;
		this.picUrl = picUrl;
		this.cid = cid;
		this.desc = desc;
	}

	public Boolean getIsVirtual() {
		return isVirtual;
	}

	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public Instant getAutoListingTime() {
		return autoListingTime;
	}

	public void setAutoListingTime(Instant autoListingTime) {
		this.autoListingTime = autoListingTime;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public BigDecimal getPostFee() {
		return postFee;
	}

	public void setPostFee(BigDecimal postFee) {
		this.postFee = postFee;
	}

	public GoodsSku[] getSkus() {
		return skus;
	}

	public void setSkus(GoodsSku[] skus) {
		this.skus = skus;
	}

	public GoodsQrcode[] getItemQrcodes() {
		return itemQrcodes;
	}

	public void setItemQrcodes(GoodsQrcode[] itemQrcodes) {
		this.itemQrcodes = itemQrcodes;
	}

	public String[] getUmpLevel() {
		return umpLevel;
	}

	public void setUmpLevel(String[] umpLevel) {
		this.umpLevel = umpLevel;
	}

	public Long getPromotionCid() {
		return promotionCid;
	}

	public void setPromotionCid(Long promotionCid) {
		this.promotionCid = promotionCid;
	}

	public Long getBuyQuota() {
		return buyQuota;
	}

	public void setBuyQuota(Long buyQuota) {
		this.buyQuota = buyQuota;
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

	public String getDeliveryTemplateFee() {
		return deliveryTemplateFee;
	}

	public void setDeliveryTemplateFee(String deliveryTemplateFee) {
		this.deliveryTemplateFee = deliveryTemplateFee;
	}

	public String getTemplateTitle() {
		return templateTitle;
	}

	public void setTemplateTitle(String templateTitle) {
		this.templateTitle = templateTitle;
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

	public String getOuterId() {
		return outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Boolean getJoinLevelDiscount() {
		return joinLevelDiscount;
	}

	public void setJoinLevelDiscount(Boolean joinLevelDiscount) {
		this.joinLevelDiscount = joinLevelDiscount;
	}

	public Integer getPurchaseRight() {
		return purchaseRight;
	}

	public void setPurchaseRight(Integer purchaseRight) {
		this.purchaseRight = purchaseRight;
	}

	public String[] getUmpTagsText() {
		return umpTagsText;
	}

	public void setUmpTagsText(String[] umpTagsText) {
		this.umpTagsText = umpTagsText;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getPostType() {
		return postType;
	}

	public void setPostType(Integer postType) {
		this.postType = postType;
	}

	public String[] getUmpLevelText() {
		return umpLevelText;
	}

	public void setUmpLevelText(String[] umpLevelText) {
		this.umpLevelText = umpLevelText;
	}

	public String getDeliveryTemplateName() {
		return deliveryTemplateName;
	}

	public void setDeliveryTemplateName(String deliveryTemplateName) {
		this.deliveryTemplateName = deliveryTemplateName;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String[] getUmpTags() {
		return umpTags;
	}

	public void setUmpTags(String[] umpTags) {
		this.umpTags = umpTags;
	}

	public String getTagIds() {
		return tagIds;
	}

	public void setTagIds(String tagIds) {
		this.tagIds = tagIds;
	}

	public Boolean getIsSupplierItem() {
		return isSupplierItem;
	}

	public void setIsSupplierItem(Boolean isSupplierItem) {
		this.isSupplierItem = isSupplierItem;
	}

	public Long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
	}

	public GoodsTag[] getItemTags() {
		return itemTags;
	}

	public void setItemTags(GoodsTag[] itemTags) {
		this.itemTags = itemTags;
	}

	public GoodsImage[] getItemImgs() {
		return itemImgs;
	}

	public void setItemImgs(GoodsImage[] itemImgs) {
		this.itemImgs = itemImgs;
	}

	public Boolean getIsListing() {
		return isListing;
	}

	public void setIsListing(Boolean isListing) {
		this.isListing = isListing;
	}

	public Boolean getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Long getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(Long soldNum) {
		this.soldNum = soldNum;
	}

	public String getOuterBuyUrl() {
		return outerBuyUrl;
	}

	public void setOuterBuyUrl(String outerBuyUrl) {
		this.outerBuyUrl = outerBuyUrl;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getPicThumbUrl() {
		return picThumbUrl;
	}

	public void setPicThumbUrl(String picThumbUrl) {
		this.picThumbUrl = picThumbUrl;
	}

	public Long getDeliveryTemplateId() {
		return deliveryTemplateId;
	}

	public void setDeliveryTemplateId(Long deliveryTemplateId) {
		this.deliveryTemplateId = deliveryTemplateId;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Map<String, String>[] getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String>[] messages) {
		this.messages = messages;
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getOriginPrice() {
		return originPrice;
	}

	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Map<String, String> toParams() {
		return new ParamsBuilder()
			.put("ump_tags", this.getUmpTags())
			.put("ump_level", this.getUmpLevel())
			.put("title", this.getTitle())
			.put("template_id", this.getTemplateId())
			.put("tag_ids", this.getTagIds())
			.put("skus_with_json", this.getSkus())
			// .put("sku_quantities", "TODO")
			// .put("sku_properties", "TODO")
			// .put("sku_prices", "TODO")
			// .put("sku_outer_ids", "TODO")
			.put("quantity", this.getNum())
			.put("purchase_right", this.getPurchaseRight())
			.put("promotion_cid", this.getPromotionCid())
			.put("price", this.getPrice())
			.put("post_fee", this.getPostFee())
			.put("outer_id", this.getOuterId())
			.put("origin_price", this.getOriginPrice())
			.put("num_iid", this.getNumIid())
			// .put("messages", "TODO")
			// .put("keep_item_img_ids", "TODO")
			.put("join_level_discount", this.getJoinLevelDiscount())
			.put("is_used", this.getIsUsed())
			// .put("images", "TODO")
			// .put("image_ids", "TODO")
			// .put("hide_quantity", "TODO")
			.put("desc", this.getDesc())
			.put("delivery_template_id", this.getDeliveryTemplateId())
			.put("cid", this.getCid())
			.put("buy_url", this.getOuterBuyUrl())
			.put("buy_quota", this.getBuyQuota())
			.put("auto_listing_time", this.getAutoListingTime())
			.getParams();
	}

}
