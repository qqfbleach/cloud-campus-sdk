package com.huawei.cloudcampus.api.sample;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import java.io.IOException;

public class SoapSender {
	private static final int DEFAULT_TIME_OUT = 3000;
	private static final String CONTENT_TYPE_JSON = "application/json; charset=UTF-8";
	private static final String APP_JSON = "application/json";
	private static final String UTF8 = "UTF-8";
	
	public static String sendJsonMessage(String jsonMessage, String targetUrl, HttpMethodEnum httpMethodEnum, String token){
		//System.out.println("[SoapSender] request body: " + jsonMessage);
		//System.out.println("[SoapSender] target url: " + targetUrl);
		//System.out.println("[SoapSender] token: " + token);
		
		if (StringUtil.isNullOrEmpty(targetUrl)) {
			throw new IllegalArgumentException("The input targetUrl can not be empty");
		}
		
		String s = sendMessage(jsonMessage, targetUrl, httpMethodEnum, token);
//		System.out.println("[SoapSender] response body: " + s);
		System.out.println( s.split("\"token_id\":\"")[1].replace("}", "").replace("\"", ""));

		return s;
	}
	
	private static String sendMessage(String jsonMessage, String targetUrl, HttpMethodEnum httpMethodEnum, String token) {
		ProtocolSocketFactory factory = new MySecureProtocolSocketFactory();
		Protocol easyhttps = new Protocol(APIConstants.PROTOCOL_HTTPS, factory, 443);
		Protocol.registerProtocol(APIConstants.PROTOCOL_HTTPS, easyhttps);
		
		HttpMethod httpMethod = null;
		String responseBody = null;
		try {
			switch (httpMethodEnum) {
			case GET:
				httpMethod = new GetMethod(targetUrl);
				break;
			case PUT:
				PutMethod putMethod = new PutMethod(targetUrl);
				putMethod.setRequestEntity(new StringRequestEntity(jsonMessage, APP_JSON, UTF8));
				httpMethod = putMethod;
				break;
			case DELETE:
				httpMethod = new DeleteMethod(targetUrl);
				break;
			default:
				PostMethod postMethod = new PostMethod(targetUrl);
				postMethod.setRequestEntity(new StringRequestEntity(jsonMessage, APP_JSON, UTF8));
				httpMethod = postMethod;
				break;
			}
			
			httpMethod.setRequestHeader("Content-Type", "application/json");
			httpMethod.setRequestHeader("User-Agent","PostmanRuntime/6.4.1");
			httpMethod.setRequestHeader("Accept",APP_JSON);
			
			if (StringUtil.isNotNullOrEmpty(token)) {
				httpMethod.setRequestHeader("x-access-Token", token);
			}
			
			HttpClient httpClient = new HttpClient();
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(DEFAULT_TIME_OUT);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(DEFAULT_TIME_OUT);
			httpClient.executeMethod(httpMethod);
			responseBody = httpMethod.getResponseBodyAsString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (httpMethod != null) {
				httpMethod.releaseConnection();
			}
		}
		
		return responseBody;
	}
	
}
