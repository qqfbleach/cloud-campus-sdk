package com.huawei.cloudcampus.api.sample;

public class StringUtil {
	public static boolean isNullOrEmpty(String s) {
		return s==null || s.length() == 0;
	}
	
	public static boolean isNotNullOrEmpty(String s) {
		return !isNullOrEmpty(s);
	}
}
