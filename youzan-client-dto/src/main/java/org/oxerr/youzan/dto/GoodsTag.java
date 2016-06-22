package org.oxerr.youzan.dto;

import java.io.Serializable;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsTag">商品标签数据结构</a>.
 */
public class GoodsTag implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	/**
	 * 商品标签创建时间
	 */
	private Instant created;

	/**
	 * 分享出去的商品标签展示地址
	 */
	private String shareUrl;

	/**
	 * 商品标签的名称
	 */
	private String name;

	/**
	 * 商品标签的ID
	 */
	private Long id;

	/**
	 * 商品标签的展示的URL地址
	 */
	private String tagUrl;

	/**
	 * 商品标签类型，0 自定义，1 未分类，2 最新，3 最热，4 隐藏。
	 */
	private Integer type;

	/**
	 * 商品标签内的商品数量
	 */
	private Long itemNum;

	/**
	 * 商品标签描述
	 */
	private String desc;

	public GoodsTag() {
	}

	public GoodsTag(
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("share_url") String shareUrl,
		@JsonProperty("name") String name,
		@JsonProperty("id") Long id,
		@JsonProperty("tag_url") String tagUrl,
		@JsonProperty("type") Integer type,
		@JsonProperty("item_num") Long itemNum,
		@JsonProperty("desc") String desc
	) {
		this.created = created;
		this.shareUrl = shareUrl;
		this.name = name;
		this.id = id;
		this.tagUrl = tagUrl;
		this.type = type;
		this.itemNum = itemNum;
		this.desc = desc;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagUrl() {
		return tagUrl;
	}

	public void setTagUrl(String tagUrl) {
		this.tagUrl = tagUrl;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getItemNum() {
		return itemNum;
	}

	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
