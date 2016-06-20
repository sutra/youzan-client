package org.oxerr.youzan.dto.deserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		Date date;
		try {
			synchronized (sdf) {
				date = sdf.parse(jp.getText());
			}
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		return date.toInstant();
	}

}
