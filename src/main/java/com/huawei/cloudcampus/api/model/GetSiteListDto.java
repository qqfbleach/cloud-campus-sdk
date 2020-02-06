/*
 * 站点模板管理
 * 站点模板第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.huawei.cloudcampus.api.model.SiteListDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询绑定的站点信息返回体数据结构。
 */
@ApiModel(description = "查询绑定的站点信息返回体数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:09.284+08:00")
public class GetSiteListDto {
  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private List<SiteListDto> data = null;

  public GetSiteListDto pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 页码。
   * return pageIndex
  **/
  @ApiModelProperty(value = "页码。")
  public Integer getPageIndex() {
    return pageIndex;
  }

   /**
   * 页码。
   * Param pageIndex
  **/
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public GetSiteListDto pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页大小。
   * return pageSize
  **/
  @ApiModelProperty(value = "每页大小。")
  public Integer getPageSize() {
    return pageSize;
  }

   /**
   * 每页大小。
   * Param pageSize
  **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public GetSiteListDto totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 总数。
   * return totalRecords
  **/
  @ApiModelProperty(value = "总数。")
  public Integer getTotalRecords() {
    return totalRecords;
  }

   /**
   * 总数。
   * Param totalRecords
  **/
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public GetSiteListDto errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码。
   * return errcode
  **/
  @ApiModelProperty(value = "错误码。")
  public String getErrcode() {
    return errcode;
  }

   /**
   * 错误码。
   * Param errcode
  **/
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }

  public GetSiteListDto errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 错误信息。
   * return errmsg
  **/
  @ApiModelProperty(value = "错误信息。")
  public String getErrmsg() {
    return errmsg;
  }

   /**
   * 错误信息。
   * Param errmsg
  **/
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public GetSiteListDto data(List<SiteListDto> data) {
    this.data = data;
    return this;
  }

  public GetSiteListDto addDataItem(SiteListDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<SiteListDto>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(value = "")
  public List<SiteListDto> getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(List<SiteListDto> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSiteListDto getSiteListDto = (GetSiteListDto) o;
    return Objects.equals(this.pageIndex, getSiteListDto.pageIndex) &&
        Objects.equals(this.pageSize, getSiteListDto.pageSize) &&
        Objects.equals(this.totalRecords, getSiteListDto.totalRecords) &&
        Objects.equals(this.errcode, getSiteListDto.errcode) &&
        Objects.equals(this.errmsg, getSiteListDto.errmsg) &&
        Objects.equals(this.data, getSiteListDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIndex, pageSize, totalRecords, errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSiteListDto {\n");
    
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

