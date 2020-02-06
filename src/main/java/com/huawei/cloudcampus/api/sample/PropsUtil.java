package com.huawei.cloudcampus.api.sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {
	private static final String PROP_FILE = "config.properties";
	
	private static Properties PROPS = new Properties();
	
	static
	{
		InputStream inputStream = null;
		
		try {
			inputStream = PropsUtil.class.getClassLoader().getResourceAsStream(PROP_FILE);
			PROPS.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			CloseableUtil.close(inputStream);
		}
	}
	
	public static String getPropByKey(String key) {
		if (StringUtil.isNullOrEmpty(key)) {
			return null;
		}else {
			Object value = PROPS.get(key);
			return value == null? null : value.toString();
		}
	}
}
