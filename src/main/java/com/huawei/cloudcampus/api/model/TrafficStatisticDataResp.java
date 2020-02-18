/*
 * 终端用户列表信息查询
 * · 站点维度终端用户列表查询 · 站点维度TopN终端流量数据查询 · 设备维度下终端用户信息查询 
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
import com.huawei.cloudcampus.api.model.TrafficStatisticInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 终端流量信息。
 */
@ApiModel(description = "终端流量信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:13.331+08:00")
public class TrafficStatisticDataResp {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private List<TrafficStatisticInfo> data = new ArrayList<TrafficStatisticInfo>();

  public TrafficStatisticDataResp errcode(String errcode) {
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

  public TrafficStatisticDataResp errmsg(String errmsg) {
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

  public TrafficStatisticDataResp data(List<TrafficStatisticInfo> data) {
    this.data = data;
    return this;
  }

  public TrafficStatisticDataResp addDataItem(TrafficStatisticInfo dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 查询到的TopN终端流量列表信息。
   * return data
  **/
  @ApiModelProperty(required = true, value = "查询到的TopN终端流量列表信息。")
  public List<TrafficStatisticInfo> getData() {
    return data;
  }

   /**
   * 查询到的TopN终端流量列表信息。
   * Param data
  **/
  public void setData(List<TrafficStatisticInfo> data) {
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
    TrafficStatisticDataResp trafficStatisticDataResp = (TrafficStatisticDataResp) o;
    return Objects.equals(this.errcode, trafficStatisticDataResp.errcode) &&
        Objects.equals(this.errmsg, trafficStatisticDataResp.errmsg) &&
        Objects.equals(this.data, trafficStatisticDataResp.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficStatisticDataResp {\n");
    
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
