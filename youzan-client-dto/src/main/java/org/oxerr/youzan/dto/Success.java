package org.oxerr.youzan.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Success implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private boolean success;

	public Success(@JsonProperty("is_success") boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
