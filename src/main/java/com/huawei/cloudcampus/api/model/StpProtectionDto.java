/*
 * 交换机STP保护配置
 * 主要特性： · 创建交换机STP保护配置 · 修改交换机STP保护配置 · 查询交换机STP保护配置 · 删除交换机STP保护配置 
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
import java.util.UUID;

/**
 * 交换机STP保护配置数据结构。
 */
@ApiModel(description = "交换机STP保护配置数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:44.878+08:00")
public class StpProtectionDto {
  @SerializedName("deviceId")
  private UUID deviceId = null;

  @SerializedName("edgedPortEnable")
  private Boolean edgedPortEnable = null;

  @SerializedName("bpduProtection")
  private Boolean bpduProtection = null;

  @SerializedName("autoRecoveryInterval")
  private Long autoRecoveryInterval = null;

  @SerializedName("upstreamEnable")
  private Boolean upstreamEnable = null;

  public StpProtectionDto deviceId(UUID deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID。
   * return deviceId
  **/
  @ApiModelProperty(required = true, value = "设备ID。")
  public UUID getDeviceId() {
    return deviceId;
  }

   /**
   * 设备ID。
   * Param deviceId
  **/
  public void setDeviceId(UUID deviceId) {
    this.deviceId = deviceId;
  }

  public StpProtectionDto edgedPortEnable(Boolean edgedPortEnable) {
    this.edgedPortEnable = edgedPortEnable;
    return this;
  }

   /**
   * 全局边缘端口使能。
   * return edgedPortEnable
  **/
  @ApiModelProperty(required = true, value = "全局边缘端口使能。")
  public Boolean getEdgedPortEnable() {
    return edgedPortEnable;
  }

   /**
   * 全局边缘端口使能。
   * Param edgedPortEnable
  **/
  public void setEdgedPortEnable(Boolean edgedPortEnable) {
    this.edgedPortEnable = edgedPortEnable;
  }

  public StpProtectionDto bpduProtection(Boolean bpduProtection) {
    this.bpduProtection = bpduProtection;
    return this;
  }

   /**
   * BPDU保护开关状态。
   * return bpduProtection
  **/
  @ApiModelProperty(required = true, value = "BPDU保护开关状态。")
  public Boolean getBpduProtection() {
    return bpduProtection;
  }

   /**
   * BPDU保护开关状态。
   * Param bpduProtection
  **/
  public void setBpduProtection(Boolean bpduProtection) {
    this.bpduProtection = bpduProtection;
  }

  public StpProtectionDto autoRecoveryInterval(Long autoRecoveryInterval) {
    this.autoRecoveryInterval = autoRecoveryInterval;
    return this;
  }

   /**
   * 自动恢复周期（秒）。
   * return autoRecoveryInterval
  **/
  @ApiModelProperty(value = "自动恢复周期（秒）。")
  public Long getAutoRecoveryInterval() {
    return autoRecoveryInterval;
  }

   /**
   * 自动恢复周期（秒）。
   * Param autoRecoveryInterval
  **/
  public void setAutoRecoveryInterval(Long autoRecoveryInterval) {
    this.autoRecoveryInterval = autoRecoveryInterval;
  }

  public StpProtectionDto upstreamEnable(Boolean upstreamEnable) {
    this.upstreamEnable = upstreamEnable;
    return this;
  }

   /**
   * 上行口自动修正。
   * return upstreamEnable
  **/
  @ApiModelProperty(value = "上行口自动修正。")
  public Boolean getUpstreamEnable() {
    return upstreamEnable;
  }

   /**
   * 上行口自动修正。
   * Param upstreamEnable
  **/
  public void setUpstreamEnable(Boolean upstreamEnable) {
    this.upstreamEnable = upstreamEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StpProtectionDto stpProtectionDto = (StpProtectionDto) o;
    return Objects.equals(this.deviceId, stpProtectionDto.deviceId) &&
        Objects.equals(this.edgedPortEnable, stpProtectionDto.edgedPortEnable) &&
        Objects.equals(this.bpduProtection, stpProtectionDto.bpduProtection) &&
        Objects.equals(this.autoRecoveryInterval, stpProtectionDto.autoRecoveryInterval) &&
        Objects.equals(this.upstreamEnable, stpProtectionDto.upstreamEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, edgedPortEnable, bpduProtection, autoRecoveryInterval, upstreamEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StpProtectionDto {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    edgedPortEnable: ").append(toIndentedString(edgedPortEnable)).append("\n");
    sb.append("    bpduProtection: ").append(toIndentedString(bpduProtection)).append("\n");
    sb.append("    autoRecoveryInterval: ").append(toIndentedString(autoRecoveryInterval)).append("\n");
    sb.append("    upstreamEnable: ").append(toIndentedString(upstreamEnable)).append("\n");
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
