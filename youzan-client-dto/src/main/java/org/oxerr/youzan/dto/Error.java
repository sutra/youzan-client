package org.oxerr.youzan.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private int code;
	private String msg;

	public Error(
		@JsonProperty("code") int code,
		@JsonProperty("msg") String msg
	) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
