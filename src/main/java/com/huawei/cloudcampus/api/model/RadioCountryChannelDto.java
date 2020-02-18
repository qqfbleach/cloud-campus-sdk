/*
 * 射频管理国家码查询
 * 射频管理国家码第三方北向接口。     
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
 * 国家码信道返回模型。
 */
@ApiModel(description = "国家码信道返回模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:27.462+08:00")
public class RadioCountryChannelDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("countryNameKey")
  private String countryNameKey = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("channel2dot4")
  private String channel2dot4 = null;

  @SerializedName("channel5HT20Indoor")
  private String channel5HT20Indoor = null;

  @SerializedName("channel5HT20Outdoor")
  private String channel5HT20Outdoor = null;

  @SerializedName("channel5HT40PlusIndoor")
  private String channel5HT40PlusIndoor = null;

  @SerializedName("channel5HT40PlusOutdoor")
  private String channel5HT40PlusOutdoor = null;

  @SerializedName("channel5HT40MinusIndoor")
  private String channel5HT40MinusIndoor = null;

  @SerializedName("channel5HT40MinusOutdoor")
  private String channel5HT40MinusOutdoor = null;

  @SerializedName("channel5HT80Indoor")
  private String channel5HT80Indoor = null;

  @SerializedName("channel5HT80Outdoor")
  private String channel5HT80Outdoor = null;

  public RadioCountryChannelDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 国家码ID。
   * return id
  **/
  @ApiModelProperty(value = "国家码ID。")
  public String getId() {
    return id;
  }

   /**
   * 国家码ID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public RadioCountryChannelDto countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 国家码。
   * return countryCode
  **/
  @ApiModelProperty(value = "国家码。")
  public String getCountryCode() {
    return countryCode;
  }

   /**
   * 国家码。
   * Param countryCode
  **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RadioCountryChannelDto countryNameKey(String countryNameKey) {
    this.countryNameKey = countryNameKey;
    return this;
  }

   /**
   * 国家名称国际化key。
   * return countryNameKey
  **/
  @ApiModelProperty(value = "国家名称国际化key。")
  public String getCountryNameKey() {
    return countryNameKey;
  }

   /**
   * 国家名称国际化key。
   * Param countryNameKey
  **/
  public void setCountryNameKey(String countryNameKey) {
    this.countryNameKey = countryNameKey;
  }

  public RadioCountryChannelDto countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * 国家名称。
   * return countryName
  **/
  @ApiModelProperty(value = "国家名称。")
  public String getCountryName() {
    return countryName;
  }

   /**
   * 国家名称。
   * Param countryName
  **/
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public RadioCountryChannelDto channel2dot4(String channel2dot4) {
    this.channel2dot4 = channel2dot4;
    return this;
  }

   /**
   * 支持的2.4G信道。
   * return channel2dot4
  **/
  @ApiModelProperty(value = "支持的2.4G信道。")
  public String getChannel2dot4() {
    return channel2dot4;
  }

   /**
   * 支持的2.4G信道。
   * Param channel2dot4
  **/
  public void setChannel2dot4(String channel2dot4) {
    this.channel2dot4 = channel2dot4;
  }

  public RadioCountryChannelDto channel5HT20Indoor(String channel5HT20Indoor) {
    this.channel5HT20Indoor = channel5HT20Indoor;
    return this;
  }

   /**
   * HT20下支持的室内5G信道。
   * return channel5HT20Indoor
  **/
  @ApiModelProperty(value = "HT20下支持的室内5G信道。")
  public String getChannel5HT20Indoor() {
    return channel5HT20Indoor;
  }

   /**
   * HT20下支持的室内5G信道。
   * Param channel5HT20Indoor
  **/
  public void setChannel5HT20Indoor(String channel5HT20Indoor) {
    this.channel5HT20Indoor = channel5HT20Indoor;
  }

  public RadioCountryChannelDto channel5HT20Outdoor(String channel5HT20Outdoor) {
    this.channel5HT20Outdoor = channel5HT20Outdoor;
    return this;
  }

   /**
   * HT20下支持的室外5G信道。
   * return channel5HT20Outdoor
  **/
  @ApiModelProperty(value = "HT20下支持的室外5G信道。")
  public String getChannel5HT20Outdoor() {
    return channel5HT20Outdoor;
  }

   /**
   * HT20下支持的室外5G信道。
   * Param channel5HT20Outdoor
  **/
  public void setChannel5HT20Outdoor(String channel5HT20Outdoor) {
    this.channel5HT20Outdoor = channel5HT20Outdoor;
  }

  public RadioCountryChannelDto channel5HT40PlusIndoor(String channel5HT40PlusIndoor) {
    this.channel5HT40PlusIndoor = channel5HT40PlusIndoor;
    return this;
  }

   /**
   * HT40+下支持的室内5G信道。
   * return channel5HT40PlusIndoor
  **/
  @ApiModelProperty(value = "HT40+下支持的室内5G信道。")
  public String getChannel5HT40PlusIndoor() {
    return channel5HT40PlusIndoor;
  }

   /**
   * HT40+下支持的室内5G信道。
   * Param channel5HT40PlusIndoor
  **/
  public void setChannel5HT40PlusIndoor(String channel5HT40PlusIndoor) {
    this.channel5HT40PlusIndoor = channel5HT40PlusIndoor;
  }

  public RadioCountryChannelDto channel5HT40PlusOutdoor(String channel5HT40PlusOutdoor) {
    this.channel5HT40PlusOutdoor = channel5HT40PlusOutdoor;
    return this;
  }

   /**
   * HT40+下支持的室外5G信道。
   * return channel5HT40PlusOutdoor
  **/
  @ApiModelProperty(value = "HT40+下支持的室外5G信道。")
  public String getChannel5HT40PlusOutdoor() {
    return channel5HT40PlusOutdoor;
  }

   /**
   * HT40+下支持的室外5G信道。
   * Param channel5HT40PlusOutdoor
  **/
  public void setChannel5HT40PlusOutdoor(String channel5HT40PlusOutdoor) {
    this.channel5HT40PlusOutdoor = channel5HT40PlusOutdoor;
  }

  public RadioCountryChannelDto channel5HT40MinusIndoor(String channel5HT40MinusIndoor) {
    this.channel5HT40MinusIndoor = channel5HT40MinusIndoor;
    return this;
  }

   /**
   * HT40-下支持的室内5G信道。
   * return channel5HT40MinusIndoor
  **/
  @ApiModelProperty(value = "HT40-下支持的室内5G信道。")
  public String getChannel5HT40MinusIndoor() {
    return channel5HT40MinusIndoor;
  }

   /**
   * HT40-下支持的室内5G信道。
   * Param channel5HT40MinusIndoor
  **/
  public void setChannel5HT40MinusIndoor(String channel5HT40MinusIndoor) {
    this.channel5HT40MinusIndoor = channel5HT40MinusIndoor;
  }

  public RadioCountryChannelDto channel5HT40MinusOutdoor(String channel5HT40MinusOutdoor) {
    this.channel5HT40MinusOutdoor = channel5HT40MinusOutdoor;
    return this;
  }

   /**
   * HT40-下支持的室外5G信道。
   * return channel5HT40MinusOutdoor
  **/
  @ApiModelProperty(value = "HT40-下支持的室外5G信道。")
  public String getChannel5HT40MinusOutdoor() {
    return channel5HT40MinusOutdoor;
  }

   /**
   * HT40-下支持的室外5G信道。
   * Param channel5HT40MinusOutdoor
  **/
  public void setChannel5HT40MinusOutdoor(String channel5HT40MinusOutdoor) {
    this.channel5HT40MinusOutdoor = channel5HT40MinusOutdoor;
  }

  public RadioCountryChannelDto channel5HT80Indoor(String channel5HT80Indoor) {
    this.channel5HT80Indoor = channel5HT80Indoor;
    return this;
  }

   /**
   * HT80下支持的室内5G信道。
   * return channel5HT80Indoor
  **/
  @ApiModelProperty(value = "HT80下支持的室内5G信道。")
  public String getChannel5HT80Indoor() {
    return channel5HT80Indoor;
  }

   /**
   * HT80下支持的室内5G信道。
   * Param channel5HT80Indoor
  **/
  public void setChannel5HT80Indoor(String channel5HT80Indoor) {
    this.channel5HT80Indoor = channel5HT80Indoor;
  }

  public RadioCountryChannelDto channel5HT80Outdoor(String channel5HT80Outdoor) {
    this.channel5HT80Outdoor = channel5HT80Outdoor;
    return this;
  }

   /**
   * HT80下支持的室外5G信道。
   * return channel5HT80Outdoor
  **/
  @ApiModelProperty(value = "HT80下支持的室外5G信道。")
  public String getChannel5HT80Outdoor() {
    return channel5HT80Outdoor;
  }

   /**
   * HT80下支持的室外5G信道。
   * Param channel5HT80Outdoor
  **/
  public void setChannel5HT80Outdoor(String channel5HT80Outdoor) {
    this.channel5HT80Outdoor = channel5HT80Outdoor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioCountryChannelDto radioCountryChannelDto = (RadioCountryChannelDto) o;
    return Objects.equals(this.id, radioCountryChannelDto.id) &&
        Objects.equals(this.countryCode, radioCountryChannelDto.countryCode) &&
        Objects.equals(this.countryNameKey, radioCountryChannelDto.countryNameKey) &&
        Objects.equals(this.countryName, radioCountryChannelDto.countryName) &&
        Objects.equals(this.channel2dot4, radioCountryChannelDto.channel2dot4) &&
        Objects.equals(this.channel5HT20Indoor, radioCountryChannelDto.channel5HT20Indoor) &&
        Objects.equals(this.channel5HT20Outdoor, radioCountryChannelDto.channel5HT20Outdoor) &&
        Objects.equals(this.channel5HT40PlusIndoor, radioCountryChannelDto.channel5HT40PlusIndoor) &&
        Objects.equals(this.channel5HT40PlusOutdoor, radioCountryChannelDto.channel5HT40PlusOutdoor) &&
        Objects.equals(this.channel5HT40MinusIndoor, radioCountryChannelDto.channel5HT40MinusIndoor) &&
        Objects.equals(this.channel5HT40MinusOutdoor, radioCountryChannelDto.channel5HT40MinusOutdoor) &&
        Objects.equals(this.channel5HT80Indoor, radioCountryChannelDto.channel5HT80Indoor) &&
        Objects.equals(this.channel5HT80Outdoor, radioCountryChannelDto.channel5HT80Outdoor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, countryCode, countryNameKey, countryName, channel2dot4, channel5HT20Indoor, channel5HT20Outdoor, channel5HT40PlusIndoor, channel5HT40PlusOutdoor, channel5HT40MinusIndoor, channel5HT40MinusOutdoor, channel5HT80Indoor, channel5HT80Outdoor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioCountryChannelDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryNameKey: ").append(toIndentedString(countryNameKey)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    channel2dot4: ").append(toIndentedString(channel2dot4)).append("\n");
    sb.append("    channel5HT20Indoor: ").append(toIndentedString(channel5HT20Indoor)).append("\n");
    sb.append("    channel5HT20Outdoor: ").append(toIndentedString(channel5HT20Outdoor)).append("\n");
    sb.append("    channel5HT40PlusIndoor: ").append(toIndentedString(channel5HT40PlusIndoor)).append("\n");
    sb.append("    channel5HT40PlusOutdoor: ").append(toIndentedString(channel5HT40PlusOutdoor)).append("\n");
    sb.append("    channel5HT40MinusIndoor: ").append(toIndentedString(channel5HT40MinusIndoor)).append("\n");
    sb.append("    channel5HT40MinusOutdoor: ").append(toIndentedString(channel5HT40MinusOutdoor)).append("\n");
    sb.append("    channel5HT80Indoor: ").append(toIndentedString(channel5HT80Indoor)).append("\n");
    sb.append("    channel5HT80Outdoor: ").append(toIndentedString(channel5HT80Outdoor)).append("\n");
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
