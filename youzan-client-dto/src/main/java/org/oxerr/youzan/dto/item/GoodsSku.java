package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsSku">Sku数据结构</a>.
 */
public class GoodsSku implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	/**
	 * Sku所对应的销售属性的中文名字串，
	 * 格式如：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……
	 */
	private String propertiesName;

	/**
	 * Sku在系统中的唯一编号，可以在开发者的系统中用作 Sku 的唯一ID，但不能用于调用接口
	 */
	private String skuUniqueCode;

	/**
	 * 商品在付款减库存的状态下，该Sku上未付款的订单数量
	 */
	private Long withHoldQuantity;

	/**
	 * 属于这个Sku的商品的数量
	 */
	private Long quantity;

	/**
	 * 商品的这个Sku的价格；精确到2位小数；单位：元。
	 */
	private BigDecimal price;

	/**
	 * Sku创建日期，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	private Instant created;

	/**
	 * Sku所对应的销售属性的Json字符串（需另行解析），
	 * 该字段内容与properties_name字段除了格式不一样，内容完全一致。
	 * 由于产品规格信息难以避免涉及到‘:’、‘,’、‘;’这些与解析规则冲突的字符，所以增加该字段。
	 * 格式定义：
	 * <pre>
	 * [
	 * 	{
	 * 		"kid": "20000",
	 * 		"vid": "3275069",
	 * 		"k": "品牌",
	 * 		"v": "盈讯"
	 * 	},
	 * 	{
	 * 		"kid": "1753146",
	 *		"vid": "3485013",
	 *		"k": "型号",
	 *		"v": "F908"
	 *	}
	 *	......
	 * ]
	 * </pre>
	 */
	private String propertiesNameJson;

	/**
	 * Sku最后修改日期，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	private Instant modified;

	/**
	 * Sku的ID，sku_id 在系统里并不是唯一的，结合商品ID一起使用才是唯一的。
	 */
	private Long skuId;

	/**
	 * Sku所属商品的数字编号
	 */
	private Long numIid;

	/**
	 * 商家编码（商家为Sku设置的外部编号）
	 */
	private String outerId;

	public GoodsSku() {
	}

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
		this.propertiesName = propertiesName;
		this.skuUniqueCode = skuUniqueCode;
		this.withHoldQuantity = withHoldQuantity;
		this.quantity = quantity;
		this.price = price;
		this.created = created;
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

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
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
