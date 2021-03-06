/*
 * 设备基本信息管理
 * 设备相关操作接口。 场景：对设备增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.6.2
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
 * ReplaceDeviceDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:21.311+08:00")
public class ReplaceDeviceDto {
  @SerializedName("originalDeviceId")
  private String originalDeviceId = null;

  @SerializedName("replaceDeviceId")
  private String replaceDeviceId = null;

  public ReplaceDeviceDto originalDeviceId(String originalDeviceId) {
    this.originalDeviceId = originalDeviceId;
    return this;
  }

   /**
   * 待替换设备的ID。
   * return originalDeviceId
  **/
  @ApiModelProperty(value = "待替换设备的ID。")
  public String getOriginalDeviceId() {
    return originalDeviceId;
  }

   /**
   * 待替换设备的ID。
   * Param originalDeviceId
  **/
  public void setOriginalDeviceId(String originalDeviceId) {
    this.originalDeviceId = originalDeviceId;
  }

  public ReplaceDeviceDto replaceDeviceId(String replaceDeviceId) {
    this.replaceDeviceId = replaceDeviceId;
    return this;
  }

   /**
   * 替换设备的ID。
   * return replaceDeviceId
  **/
  @ApiModelProperty(value = "替换设备的ID。")
  public String getReplaceDeviceId() {
    return replaceDeviceId;
  }

   /**
   * 替换设备的ID。
   * Param replaceDeviceId
  **/
  public void setReplaceDeviceId(String replaceDeviceId) {
    this.replaceDeviceId = replaceDeviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceDeviceDto replaceDeviceDto = (ReplaceDeviceDto) o;
    return Objects.equals(this.originalDeviceId, replaceDeviceDto.originalDeviceId) &&
        Objects.equals(this.replaceDeviceId, replaceDeviceDto.replaceDeviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalDeviceId, replaceDeviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceDeviceDto {\n");
    
    sb.append("    originalDeviceId: ").append(toIndentedString(originalDeviceId)).append("\n");
    sb.append("    replaceDeviceId: ").append(toIndentedString(replaceDeviceId)).append("\n");
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

