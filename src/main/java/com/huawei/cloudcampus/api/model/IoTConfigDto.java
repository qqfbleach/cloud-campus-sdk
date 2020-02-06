/*
 * AP IOT配置
 * AP IOT配置北向接口，主要特性： · 查询AP IOT配置信息 · 配置AP IOT信息 
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
import com.huawei.cloudcampus.api.model.IotCardConfigDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * AP IoT配置结构体。
 */
@ApiModel(description = "AP IoT配置结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:01.159+08:00")
public class IoTConfigDto {
  @SerializedName("panelName")
  private String panelName = null;

  @SerializedName("iotCardConfig")
  private IotCardConfigDto iotCardConfig = null;

  @SerializedName("cardNames")
  private List<String> cardNames = new ArrayList<String>();

  @SerializedName("deviceGroupId")
  private UUID deviceGroupId = null;

  @SerializedName("operation")
  private String operation = null;

  public IoTConfigDto panelName(String panelName) {
    this.panelName = panelName;
    return this;
  }

   /**
   * 面板名称，和型号保持一致。
   * return panelName
  **/
  @ApiModelProperty(required = true, value = "面板名称，和型号保持一致。")
  public String getPanelName() {
    return panelName;
  }

   /**
   * 面板名称，和型号保持一致。
   * Param panelName
  **/
  public void setPanelName(String panelName) {
    this.panelName = panelName;
  }

  public IoTConfigDto iotCardConfig(IotCardConfigDto iotCardConfig) {
    this.iotCardConfig = iotCardConfig;
    return this;
  }

   /**
   * Get iotCardConfig
   * return iotCardConfig
  **/
  @ApiModelProperty(value = "")
  public IotCardConfigDto getIotCardConfig() {
    return iotCardConfig;
  }

   /**
   * Set iotCardConfig
   * Param iotCardConfig
  **/
  public void setIotCardConfig(IotCardConfigDto iotCardConfig) {
    this.iotCardConfig = iotCardConfig;
  }

  public IoTConfigDto cardNames(List<String> cardNames) {
    this.cardNames = cardNames;
    return this;
  }

  public IoTConfigDto addCardNamesItem(String cardNamesItem) {
    this.cardNames.add(cardNamesItem);
    return this;
  }

   /**
   * 卡槽名称。
   * return cardNames
  **/
  @ApiModelProperty(required = true, value = "卡槽名称。")
  public List<String> getCardNames() {
    return cardNames;
  }

   /**
   * 卡槽名称。
   * Param cardNames
  **/
  public void setCardNames(List<String> cardNames) {
    this.cardNames = cardNames;
  }

  public IoTConfigDto deviceGroupId(UUID deviceGroupId) {
    this.deviceGroupId = deviceGroupId;
    return this;
  }

   /**
   * 站点ID。
   * return deviceGroupId
  **/
  @ApiModelProperty(value = "站点ID。")
  public UUID getDeviceGroupId() {
    return deviceGroupId;
  }

   /**
   * 站点ID。
   * Param deviceGroupId
  **/
  public void setDeviceGroupId(UUID deviceGroupId) {
    this.deviceGroupId = deviceGroupId;
  }

  public IoTConfigDto operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * 操作符，当前仅支持更新。
   * return operation
  **/
  @ApiModelProperty(value = "操作符，当前仅支持更新。")
  public String getOperation() {
    return operation;
  }

   /**
   * 操作符，当前仅支持更新。
   * Param operation
  **/
  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoTConfigDto ioTConfigDto = (IoTConfigDto) o;
    return Objects.equals(this.panelName, ioTConfigDto.panelName) &&
        Objects.equals(this.iotCardConfig, ioTConfigDto.iotCardConfig) &&
        Objects.equals(this.cardNames, ioTConfigDto.cardNames) &&
        Objects.equals(this.deviceGroupId, ioTConfigDto.deviceGroupId) &&
        Objects.equals(this.operation, ioTConfigDto.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panelName, iotCardConfig, cardNames, deviceGroupId, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoTConfigDto {\n");
    
    sb.append("    panelName: ").append(toIndentedString(panelName)).append("\n");
    sb.append("    iotCardConfig: ").append(toIndentedString(iotCardConfig)).append("\n");
    sb.append("    cardNames: ").append(toIndentedString(cardNames)).append("\n");
    sb.append("    deviceGroupId: ").append(toIndentedString(deviceGroupId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

