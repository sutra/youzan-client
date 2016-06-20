package org.oxerr.youzan.dto;

import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsTag">商品标签数据结构</a>.
 */
public class GoodsTag extends BaseObject {

	private static final long serialVersionUID = 2016061901L;

	private String shareUrl;
	private String name;
	private Long id;
	private String tagUrl;
	private Integer type;
	private Long itemNum;
	private String desc;

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
		super(created);
		this.shareUrl = shareUrl;
		this.name = name;
		this.id = id;
		this.tagUrl = tagUrl;
		this.type = type;
		this.itemNum = itemNum;
		this.desc = desc;
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
