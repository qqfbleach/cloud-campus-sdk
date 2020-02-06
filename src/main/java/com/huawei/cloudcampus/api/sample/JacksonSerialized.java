package com.huawei.cloudcampus.api.sample;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;

public class JacksonSerialized {
	public static String obj2Json(Object obj) {
		if (obj == null) {
			return null;
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		StringWriter sw = new StringWriter();
		
		try {
			objectMapper.writeValue(sw, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sw.toString();
	}
	
	public static <T> T json2Obj(String json, Class<T> clazz){
		if (StringUtil.isNullOrEmpty(json) || clazz == null) {
			throw new IllegalArgumentException("The input json and clazz can not be null or empty!");
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		T result = null;
		try {
			result = (T) objectMapper.readValue(json, clazz);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
