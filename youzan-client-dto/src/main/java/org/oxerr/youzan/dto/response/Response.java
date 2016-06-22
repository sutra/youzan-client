package org.oxerr.youzan.dto.response;

import java.io.Serializable;

import org.oxerr.youzan.YouzanException;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	private T response;

	public Response(
		@JsonProperty("response") T response,
		@JsonProperty("error_response") ErrorResponse errorResponse
	) throws YouzanException {
		this.response = response;
		if (errorResponse != null) {
			throw new YouzanException(errorResponse);
		}
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}
