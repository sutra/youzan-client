package org.oxerr.youzan.dto.deserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Deserializer to deserialize epoch seconds in string to {@link Instant}.
 */
public class InstantDeserializer extends JsonDeserializer<Instant> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Instant deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		try {
			synchronized (sdf) {
				return sdf.parse(jp.getText()).toInstant();
			}
		} catch (ParseException e) {
			return null;
		}
	}

}
