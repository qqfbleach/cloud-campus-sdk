package com.huawei.cloudcampus.api.sample;

public class RestfulApiInvoker {
	private static final String HTTPS_PREFIX = "https://";
	
	private static final String COLON = ":";
	
	public static String invoke(Object request, String serviceUrl, HttpMethodEnum httpMethod) {
		return invokeWithToken(request, serviceUrl, httpMethod, null);
	}
	
	public static String invokeWithToken(Object request, String serviceUrl, HttpMethodEnum httpMethod, String token) {
		// String ip = PropsUtil.getPropByKey(APIConstants.CAMPUS_ADDRESS);
		// String port = PropsUtil.getPropByKey(APIConstants.CAMPUS_PORT);
		//
		// String targetUrl = HTTPS_PREFIX + ip+ COLON + port + serviceUrl;
		
		System.out.println(serviceUrl);
		
		HttpMethodEnum method = httpMethod == null ? HttpMethodEnum.POST : httpMethod;
		
		String soapMessage = JacksonSerialized.obj2Json(request);
		
		return SoapSender.sendJsonMessage(soapMessage, serviceUrl, method, token);
	}
}
