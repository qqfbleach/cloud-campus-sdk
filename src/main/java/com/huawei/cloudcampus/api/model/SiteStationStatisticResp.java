/*
 * 设备基础性能数据信息查询
 * · 查询设备网络速率历史数据 · 查询站点维度TopN设备或者全部设备的上行流量、下行流量 · 查询站点维度设备连接终端数历史数据 · 查询单设备连接终端数历史数据 · 查询租户维度下设备状态历史数据 · 查询基于站点的站点健康度和设备健康度 · 查询站点下TOP N SSID流量和最近在线用户数 
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
import com.huawei.cloudcampus.api.model.SiteStationStatisticInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 站点下设备连接终端数信息。
 */
@ApiModel(description = "站点下设备连接终端数信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:47.511+08:00")
public class SiteStationStatisticResp {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private List<SiteStationStatisticInfo> data = new ArrayList<SiteStationStatisticInfo>();

  public SiteStationStatisticResp errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码信息。
   * return errcode
  **/
  @ApiModelProperty(required = true, value = "错误码信息。")
  public String getErrcode() {
    return errcode;
  }

   /**
   * 错误码信息。
   * Param errcode
  **/
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }

  public SiteStationStatisticResp errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 结果信息。
   * return errmsg
  **/
  @ApiModelProperty(required = true, value = "结果信息。")
  public String getErrmsg() {
    return errmsg;
  }

   /**
   * 结果信息。
   * Param errmsg
  **/
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public SiteStationStatisticResp data(List<SiteStationStatisticInfo> data) {
    this.data = data;
    return this;
  }

  public SiteStationStatisticResp addDataItem(SiteStationStatisticInfo dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 查询到的站点下设备连接终端数信息。
   * return data
  **/
  @ApiModelProperty(required = true, value = "查询到的站点下设备连接终端数信息。")
  public List<SiteStationStatisticInfo> getData() {
    return data;
  }

   /**
   * 查询到的站点下设备连接终端数信息。
   * Param data
  **/
  public void setData(List<SiteStationStatisticInfo> data) {
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
    SiteStationStatisticResp siteStationStatisticResp = (SiteStationStatisticResp) o;
    return Objects.equals(this.errcode, siteStationStatisticResp.errcode) &&
        Objects.equals(this.errmsg, siteStationStatisticResp.errmsg) &&
        Objects.equals(this.data, siteStationStatisticResp.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteStationStatisticResp {\n");
    
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

