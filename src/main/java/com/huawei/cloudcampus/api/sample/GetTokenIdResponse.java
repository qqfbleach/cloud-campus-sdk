package com.huawei.cloudcampus.api.sample;

public class GetTokenIdResponse {
	private String errcode;
	
	private String errmsg;
	
	private TokenData data;

	/**
	 * @return the errcode
	 */
	public String getErrcode() {
		return errcode;
	}

	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	/**
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * @param errmsg the errmsg to set
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * @return the data
	 */
	public TokenData getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(TokenData data) {
		this.data = data;
	}
	
	
}
