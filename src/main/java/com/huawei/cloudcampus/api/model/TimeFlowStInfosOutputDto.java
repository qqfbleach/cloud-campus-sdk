/*
 * 用户流量信息查询
 * 控制器支持查询指定时间内流量和时长发生变化的用户流量信息分页查询北向接口。 
 *
 * OpenAPI spec version: 1.0.1
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
import com.huawei.cloudcampus.api.model.TimeFlowStDetailInfosOutputDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeFlowStInfosOutputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:05.293+08:00")
public class TimeFlowStInfosOutputDto {
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
  private List<TimeFlowStDetailInfosOutputDto> data = null;

  public TimeFlowStInfosOutputDto pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 当前页数。
   * minimum: 0
   * maximum: 2147483647
   * return pageIndex
  **/
  @ApiModelProperty(value = "当前页数。")
  public Integer getPageIndex() {
    return pageIndex;
  }

   /**
   * 当前页数。
   * minimum: 0
   * maximum: 2147483647
   * Param pageIndex
  **/
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public TimeFlowStInfosOutputDto pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页最大显示数量。
   * minimum: 0
   * maximum: 1000
   * return pageSize
  **/
  @ApiModelProperty(value = "每页最大显示数量。")
  public Integer getPageSize() {
    return pageSize;
  }

   /**
   * 每页最大显示数量。
   * minimum: 0
   * maximum: 1000
   * Param pageSize
  **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public TimeFlowStInfosOutputDto totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 查询到的总结果数。
   * minimum: 0
   * maximum: 2147483647
   * return totalRecords
  **/
  @ApiModelProperty(value = "查询到的总结果数。")
  public Integer getTotalRecords() {
    return totalRecords;
  }

   /**
   * 查询到的总结果数。
   * minimum: 0
   * maximum: 2147483647
   * Param totalRecords
  **/
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public TimeFlowStInfosOutputDto errcode(String errcode) {
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

  public TimeFlowStInfosOutputDto errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 错误信息描述。
   * return errmsg
  **/
  @ApiModelProperty(value = "错误信息描述。")
  public String getErrmsg() {
    return errmsg;
  }

   /**
   * 错误信息描述。
   * Param errmsg
  **/
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public TimeFlowStInfosOutputDto data(List<TimeFlowStDetailInfosOutputDto> data) {
    this.data = data;
    return this;
  }

  public TimeFlowStInfosOutputDto addDataItem(TimeFlowStDetailInfosOutputDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<TimeFlowStDetailInfosOutputDto>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(value = "")
  public List<TimeFlowStDetailInfosOutputDto> getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(List<TimeFlowStDetailInfosOutputDto> data) {
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
    TimeFlowStInfosOutputDto timeFlowStInfosOutputDto = (TimeFlowStInfosOutputDto) o;
    return Objects.equals(this.pageIndex, timeFlowStInfosOutputDto.pageIndex) &&
        Objects.equals(this.pageSize, timeFlowStInfosOutputDto.pageSize) &&
        Objects.equals(this.totalRecords, timeFlowStInfosOutputDto.totalRecords) &&
        Objects.equals(this.errcode, timeFlowStInfosOutputDto.errcode) &&
        Objects.equals(this.errmsg, timeFlowStInfosOutputDto.errmsg) &&
        Objects.equals(this.data, timeFlowStInfosOutputDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIndex, pageSize, totalRecords, errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeFlowStInfosOutputDto {\n");
    
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

