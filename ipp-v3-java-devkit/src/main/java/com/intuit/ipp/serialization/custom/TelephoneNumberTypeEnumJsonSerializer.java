package com.intuit.ipp.serialization.custom;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.intuit.ipp.data.TelephoneNumberTypeEnum;

/**
 * Custom JsonSerializer for reading TelephoneNumberTypeEnum values
 * 
 */
public class TelephoneNumberTypeEnumJsonSerializer extends JsonSerializer<TelephoneNumberTypeEnum> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void serialize(TelephoneNumberTypeEnum value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeString(value.value());
	}

}