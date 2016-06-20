package org.oxerr.youzan.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParamsBuilder {

	private final ObjectMapper mapper;
	private final Map<String, String> params;

	public ParamsBuilder() {
		this(new HashMap<>());
	}

	public ParamsBuilder(int initialCapacity) {
		this(new HashMap<>(initialCapacity));
	}

	public ParamsBuilder(Map<String, String> params) {
		this.mapper = new ObjectMapper();
		this.params = params;
	}

	public ParamsBuilder put(@Nonnull String key, @Nullable Object value) {
		if (value != null) {
			try {
				params.put(key, mapper.writeValueAsString(value));
			} catch (JsonProcessingException e) {
				throw new IllegalArgumentException(e);
			}
		}
		return this;
	}

	public ParamsBuilder putAll(Map<String, String> params) {
		this.params.putAll(params);
		return this;
	}

	public Map<String, String> getParams() {
		return params;
	}

}
