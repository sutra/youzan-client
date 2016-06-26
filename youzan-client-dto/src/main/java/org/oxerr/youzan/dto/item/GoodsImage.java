package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsImage">商品图片数据结构</a>.
 */
public class GoodsImage implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	/**
	 * 图片缩略图链接地址
	 */
	private String thumbnail;

	/**
	 * 图片创建时间，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	private Instant created;

	/**
	 * 商品图片的ID
	 */
	private Long id;

	/**
	 * 中号大小图片链接地址
	 */
	private String medium;

	/**
	 * 图片链接地址
	 */
	private String url;

	/**
	 * 组合图片链接地址
	 */
	private String combine;

	public GoodsImage() {
	}

	public GoodsImage(
		@JsonProperty("thumbnail") String thumbnail,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("id") Long id,
		@JsonProperty("medium") String medium,
		@JsonProperty("url") String url,
		@JsonProperty("combine") String combine
	) {
		this.thumbnail = thumbnail;
		this.created = created;
		this.id = id;
		this.medium = medium;
		this.url = url;
		this.combine = combine;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCombine() {
		return combine;
	}

	public void setCombine(String combine) {
		this.combine = combine;
	}

}
