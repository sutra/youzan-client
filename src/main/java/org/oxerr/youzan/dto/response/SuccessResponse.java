package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuccessResponse implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private boolean success;

	public SuccessResponse(@JsonProperty("is_success") boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
