/*
 * 配置结果查询
 * 查询配置结果
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
import com.huawei.cloudcampus.api.model.FeatureStateDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 配置结果中的设备信息。
 */
@ApiModel(description = "配置结果中的设备信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:37.211+08:00")
public class ConfigStateResult {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("esn")
  private String esn = null;

  @SerializedName("configStates")
  private List<FeatureStateDto> configStates = null;

  public ConfigStateResult deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID。
   * return deviceId
  **/
  @ApiModelProperty(value = "设备ID。")
  public String getDeviceId() {
    return deviceId;
  }

   /**
   * 设备ID。
   * Param deviceId
  **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ConfigStateResult esn(String esn) {
    this.esn = esn;
    return this;
  }

   /**
   * 设备ESN。
   * return esn
  **/
  @ApiModelProperty(value = "设备ESN。")
  public String getEsn() {
    return esn;
  }

   /**
   * 设备ESN。
   * Param esn
  **/
  public void setEsn(String esn) {
    this.esn = esn;
  }

  public ConfigStateResult configStates(List<FeatureStateDto> configStates) {
    this.configStates = configStates;
    return this;
  }

  public ConfigStateResult addConfigStatesItem(FeatureStateDto configStatesItem) {
    if (this.configStates == null) {
      this.configStates = new ArrayList<FeatureStateDto>();
    }
    this.configStates.add(configStatesItem);
    return this;
  }

   /**
   * 设备的各个特性配置结果。
   * return configStates
  **/
  @ApiModelProperty(value = "设备的各个特性配置结果。")
  public List<FeatureStateDto> getConfigStates() {
    return configStates;
  }

   /**
   * 设备的各个特性配置结果。
   * Param configStates
  **/
  public void setConfigStates(List<FeatureStateDto> configStates) {
    this.configStates = configStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigStateResult configStateResult = (ConfigStateResult) o;
    return Objects.equals(this.deviceId, configStateResult.deviceId) &&
        Objects.equals(this.esn, configStateResult.esn) &&
        Objects.equals(this.configStates, configStateResult.configStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, esn, configStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigStateResult {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    configStates: ").append(toIndentedString(configStates)).append("\n");
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

