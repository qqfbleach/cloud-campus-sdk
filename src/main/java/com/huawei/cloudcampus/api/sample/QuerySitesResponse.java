package com.huawei.cloudcampus.api.sample;

import java.util.List;

public class QuerySitesResponse {
	private String errcode;
	
	private String errmsg;
	
	private int totalRecords;
	
	private List<SiteData> data;

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
	 * @return the totalRecords
	 */
	public int getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	/**
	 * @return the data
	 */
	public List<SiteData> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<SiteData> data) {
		this.data = data;
	}
	
	
}
