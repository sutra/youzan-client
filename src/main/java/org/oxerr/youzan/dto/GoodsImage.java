package org.oxerr.youzan.dto;

import java.time.Instant;

import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsImage">商品图片数据结构</a>.
 */
public class GoodsImage extends BaseObject {

	private static final long serialVersionUID = 2016061901L;

	private String thumbnail;
	private Long id;
	private String medium;
	private String url;
	private String combine;

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
		super(created);
		this.thumbnail = thumbnail;
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
