package org.oxerr.youzan.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <a href="http://open.youzan.com/structparam?struct=TradeBuyerMessage">
 * 交易明细中买家留言的数据结构</a>.
 */
public class TradeBuyerMessage implements Serializable {

	private static final long serialVersionUID = 2016062001L;

	/**
	 * 留言的标题
	 */
	private String title;

	/**
	 * 留言的内容
	 */
	private String content;

	public TradeBuyerMessage(
		@JsonProperty("title") String title,
		@JsonProperty("content") String content
	) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
