/*
 * 防火墙设备静态路由配置
 * 防火墙设备静态路由配置第三方接口。
 *
 * OpenAPI spec version: 1.0.0
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
import com.huawei.cloudcampus.api.model.FwRouteInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceFwStaticRouteInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:36.994+08:00")
public class DeviceFwStaticRouteInfoDto {
  @SerializedName("mask")
  private Integer mask = null;

  @SerializedName("destinationPrefixIp")
  private String destinationPrefixIp = null;

  @SerializedName("nextHopAddress")
  private String nextHopAddress = null;

  @SerializedName("nextInterface")
  private String nextInterface = null;

  @SerializedName("trackIplinkId")
  private String trackIplinkId = null;

  @SerializedName("preference")
  private Integer preference = null;

  @SerializedName("id")
  private String id = null;

  public DeviceFwStaticRouteInfoDto mask(Integer mask) {
    this.mask = mask;
    return this;
  }

   /**
   * 掩码。
   * minimum: 0
   * maximum: 32
   * return mask
  **/
  @ApiModelProperty(required = true, value = "掩码。")
  public Integer getMask() {
    return mask;
  }

   /**
   * 掩码。
   * minimum: 0
   * maximum: 32
   * Param mask
  **/
  public void setMask(Integer mask) {
    this.mask = mask;
  }

  public DeviceFwStaticRouteInfoDto destinationPrefixIp(String destinationPrefixIp) {
    this.destinationPrefixIp = destinationPrefixIp;
    return this;
  }

   /**
   * 目的地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。
   * return destinationPrefixIp
  **/
  @ApiModelProperty(value = "目的地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。")
  public String getDestinationPrefixIp() {
    return destinationPrefixIp;
  }

   /**
   * 目的地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。
   * Param destinationPrefixIp
  **/
  public void setDestinationPrefixIp(String destinationPrefixIp) {
    this.destinationPrefixIp = destinationPrefixIp;
  }

  public DeviceFwStaticRouteInfoDto nextHopAddress(String nextHopAddress) {
    this.nextHopAddress = nextHopAddress;
    return this;
  }

   /**
   * 下一跳地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。当nextInterface为空时，nextHopAddress必填。
   * return nextHopAddress
  **/
  @ApiModelProperty(value = "下一跳地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。当nextInterface为空时，nextHopAddress必填。")
  public String getNextHopAddress() {
    return nextHopAddress;
  }

   /**
   * 下一跳地址，必须是合法的IPv4地址，以127或者224~255开头的IP地址为非法IP地址。当nextInterface为空时，nextHopAddress必填。
   * Param nextHopAddress
  **/
  public void setNextHopAddress(String nextHopAddress) {
    this.nextHopAddress = nextHopAddress;
  }

  public DeviceFwStaticRouteInfoDto nextInterface(String nextInterface) {
    this.nextInterface = nextInterface;
    return this;
  }

   /**
   * 设备出接口。当nextHopAddress为空时，nextInterface必填。
   * return nextInterface
  **/
  @ApiModelProperty(value = "设备出接口。当nextHopAddress为空时，nextInterface必填。")
  public String getNextInterface() {
    return nextInterface;
  }

   /**
   * 设备出接口。当nextHopAddress为空时，nextInterface必填。
   * Param nextInterface
  **/
  public void setNextInterface(String nextInterface) {
    this.nextInterface = nextInterface;
  }

  public DeviceFwStaticRouteInfoDto trackIplinkId(String trackIplinkId) {
    this.trackIplinkId = trackIplinkId;
    return this;
  }

   /**
   * IP链接ID。
   * return trackIplinkId
  **/
  @ApiModelProperty(value = "IP链接ID。")
  public String getTrackIplinkId() {
    return trackIplinkId;
  }

   /**
   * IP链接ID。
   * Param trackIplinkId
  **/
  public void setTrackIplinkId(String trackIplinkId) {
    this.trackIplinkId = trackIplinkId;
  }

  public DeviceFwStaticRouteInfoDto preference(Integer preference) {
    this.preference = preference;
    return this;
  }

   /**
   * 优先级。取值越小，优先等级越高。
   * minimum: 1
   * maximum: 255
   * return preference
  **/
  @ApiModelProperty(value = "优先级。取值越小，优先等级越高。")
  public Integer getPreference() {
    return preference;
  }

   /**
   * 优先级。取值越小，优先等级越高。
   * minimum: 1
   * maximum: 255
   * Param preference
  **/
  public void setPreference(Integer preference) {
    this.preference = preference;
  }

  public DeviceFwStaticRouteInfoDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 防火墙静态路由ID。
   * return id
  **/
  @ApiModelProperty(value = "防火墙静态路由ID。")
  public String getId() {
    return id;
  }

   /**
   * 防火墙静态路由ID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFwStaticRouteInfoDto deviceFwStaticRouteInfoDto = (DeviceFwStaticRouteInfoDto) o;
    return Objects.equals(this.mask, deviceFwStaticRouteInfoDto.mask) &&
        Objects.equals(this.destinationPrefixIp, deviceFwStaticRouteInfoDto.destinationPrefixIp) &&
        Objects.equals(this.nextHopAddress, deviceFwStaticRouteInfoDto.nextHopAddress) &&
        Objects.equals(this.nextInterface, deviceFwStaticRouteInfoDto.nextInterface) &&
        Objects.equals(this.trackIplinkId, deviceFwStaticRouteInfoDto.trackIplinkId) &&
        Objects.equals(this.preference, deviceFwStaticRouteInfoDto.preference) &&
        Objects.equals(this.id, deviceFwStaticRouteInfoDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mask, destinationPrefixIp, nextHopAddress, nextInterface, trackIplinkId, preference, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFwStaticRouteInfoDto {\n");
    
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    destinationPrefixIp: ").append(toIndentedString(destinationPrefixIp)).append("\n");
    sb.append("    nextHopAddress: ").append(toIndentedString(nextHopAddress)).append("\n");
    sb.append("    nextInterface: ").append(toIndentedString(nextInterface)).append("\n");
    sb.append("    trackIplinkId: ").append(toIndentedString(trackIplinkId)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

