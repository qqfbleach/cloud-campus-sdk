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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 设备状态历史趋势信息。
 */
@ApiModel(description = "设备状态历史趋势信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:47.511+08:00")
public class DeviceCountTrend {
  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("deviceOnlineCount")
  private Integer deviceOnlineCount = null;

  @SerializedName("deviceOfflineCount")
  private Integer deviceOfflineCount = null;

  @SerializedName("deviceUnregisteredCount")
  private Integer deviceUnregisteredCount = null;

  public DeviceCountTrend timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 格林威治时间。
   * return timestamp
  **/
  @ApiModelProperty(value = "格林威治时间。")
  public Long getTimestamp() {
    return timestamp;
  }

   /**
   * 格林威治时间。
   * Param timestamp
  **/
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public DeviceCountTrend deviceOnlineCount(Integer deviceOnlineCount) {
    this.deviceOnlineCount = deviceOnlineCount;
    return this;
  }

   /**
   * 在线设备数量。
   * minimum: 0
   * maximum: 2147483647
   * return deviceOnlineCount
  **/
  @ApiModelProperty(value = "在线设备数量。")
  public Integer getDeviceOnlineCount() {
    return deviceOnlineCount;
  }

   /**
   * 在线设备数量。
   * minimum: 0
   * maximum: 2147483647
   * Param deviceOnlineCount
  **/
  public void setDeviceOnlineCount(Integer deviceOnlineCount) {
    this.deviceOnlineCount = deviceOnlineCount;
  }

  public DeviceCountTrend deviceOfflineCount(Integer deviceOfflineCount) {
    this.deviceOfflineCount = deviceOfflineCount;
    return this;
  }

   /**
   * 离线设备数量。
   * minimum: 0
   * maximum: 2147483647
   * return deviceOfflineCount
  **/
  @ApiModelProperty(value = "离线设备数量。")
  public Integer getDeviceOfflineCount() {
    return deviceOfflineCount;
  }

   /**
   * 离线设备数量。
   * minimum: 0
   * maximum: 2147483647
   * Param deviceOfflineCount
  **/
  public void setDeviceOfflineCount(Integer deviceOfflineCount) {
    this.deviceOfflineCount = deviceOfflineCount;
  }

  public DeviceCountTrend deviceUnregisteredCount(Integer deviceUnregisteredCount) {
    this.deviceUnregisteredCount = deviceUnregisteredCount;
    return this;
  }

   /**
   * 未注册设备数量。
   * minimum: 0
   * maximum: 2147483647
   * return deviceUnregisteredCount
  **/
  @ApiModelProperty(value = "未注册设备数量。")
  public Integer getDeviceUnregisteredCount() {
    return deviceUnregisteredCount;
  }

   /**
   * 未注册设备数量。
   * minimum: 0
   * maximum: 2147483647
   * Param deviceUnregisteredCount
  **/
  public void setDeviceUnregisteredCount(Integer deviceUnregisteredCount) {
    this.deviceUnregisteredCount = deviceUnregisteredCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCountTrend deviceCountTrend = (DeviceCountTrend) o;
    return Objects.equals(this.timestamp, deviceCountTrend.timestamp) &&
        Objects.equals(this.deviceOnlineCount, deviceCountTrend.deviceOnlineCount) &&
        Objects.equals(this.deviceOfflineCount, deviceCountTrend.deviceOfflineCount) &&
        Objects.equals(this.deviceUnregisteredCount, deviceCountTrend.deviceUnregisteredCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, deviceOnlineCount, deviceOfflineCount, deviceUnregisteredCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCountTrend {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    deviceOnlineCount: ").append(toIndentedString(deviceOnlineCount)).append("\n");
    sb.append("    deviceOfflineCount: ").append(toIndentedString(deviceOfflineCount)).append("\n");
    sb.append("    deviceUnregisteredCount: ").append(toIndentedString(deviceUnregisteredCount)).append("\n");
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

