/*
 * 运维ping/trace探测
 * ping/trace探测第三方接口。 · 创建ping探测任务 · 查询ping探测结果 · 创建trace探测任务 · 查询trace探测结果 
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
 * 新任务模型。
 */
@ApiModel(description = "新任务模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:49.142+08:00")
public class PingDiagnoseDto {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("pingSelf")
  private Boolean pingSelf = null;

  public PingDiagnoseDto deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID，UUID格式。
   * return deviceId
  **/
  @ApiModelProperty(required = true, value = "设备ID，UUID格式。")
  public String getDeviceId() {
    return deviceId;
  }

   /**
   * 设备ID，UUID格式。
   * Param deviceId
  **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public PingDiagnoseDto destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * ping目的地址，可以是IP地址或域名，域名中不能包含空格。
   * return destination
  **/
  @ApiModelProperty(value = "ping目的地址，可以是IP地址或域名，域名中不能包含空格。")
  public String getDestination() {
    return destination;
  }

   /**
   * ping目的地址，可以是IP地址或域名，域名中不能包含空格。
   * Param destination
  **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public PingDiagnoseDto pingSelf(Boolean pingSelf) {
    this.pingSelf = pingSelf;
    return this;
  }

   /**
   * 是否ping探测自身。默认为false。当为true时，destination值不写。
   * return pingSelf
  **/
  @ApiModelProperty(required = true, value = "是否ping探测自身。默认为false。当为true时，destination值不写。")
  public Boolean getPingSelf() {
    return pingSelf;
  }

   /**
   * 是否ping探测自身。默认为false。当为true时，destination值不写。
   * Param pingSelf
  **/
  public void setPingSelf(Boolean pingSelf) {
    this.pingSelf = pingSelf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingDiagnoseDto pingDiagnoseDto = (PingDiagnoseDto) o;
    return Objects.equals(this.deviceId, pingDiagnoseDto.deviceId) &&
        Objects.equals(this.destination, pingDiagnoseDto.destination) &&
        Objects.equals(this.pingSelf, pingDiagnoseDto.pingSelf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, destination, pingSelf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingDiagnoseDto {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    pingSelf: ").append(toIndentedString(pingSelf)).append("\n");
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
