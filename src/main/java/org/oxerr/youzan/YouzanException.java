package org.oxerr.youzan;

import org.oxerr.youzan.dto.response.ErrorResponse;

public class YouzanException extends Exception {

	private static final long serialVersionUID = 2016061901L;

	private final ErrorResponse errorResponse;

	public YouzanException(ErrorResponse errorResponse) {
		super(errorResponse.getMsg());
		this.errorResponse = errorResponse;
	}

	public int getCode() {
		return errorResponse.getCode();
	}

	public String getMsg() {
		return errorResponse.getMsg();
	}

}
