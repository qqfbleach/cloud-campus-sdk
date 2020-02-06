/*
 * 框式交换机板卡信息操作
 * 框式上云相关操作接口： 场景：对框式交换机信息查询操作的第三方接口。
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 单板复位原因结果。
 */
@ApiModel(description = "单板复位原因结果。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:14.794+08:00")
public class ResetReasonDto {
  @SerializedName("slotIndex")
  private String slotIndex = null;

  @SerializedName("resetTime")
  private String resetTime = null;

  @SerializedName("reason")
  private String reason = null;

  public ResetReasonDto slotIndex(String slotIndex) {
    this.slotIndex = slotIndex;
    return this;
  }

   /**
   * 槽位号。
   * return slotIndex
  **/
  @ApiModelProperty(value = "槽位号。")
  public String getSlotIndex() {
    return slotIndex;
  }

   /**
   * 槽位号。
   * Param slotIndex
  **/
  public void setSlotIndex(String slotIndex) {
    this.slotIndex = slotIndex;
  }

  public ResetReasonDto resetTime(String resetTime) {
    this.resetTime = resetTime;
    return this;
  }

   /**
   * 复位时间，UTC时间格式。
   * return resetTime
  **/
  @ApiModelProperty(value = "复位时间，UTC时间格式。")
  public String getResetTime() {
    return resetTime;
  }

   /**
   * 复位时间，UTC时间格式。
   * Param resetTime
  **/
  public void setResetTime(String resetTime) {
    this.resetTime = resetTime;
  }

  public ResetReasonDto reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * 复位原因。
   * return reason
  **/
  @ApiModelProperty(value = "复位原因。")
  public String getReason() {
    return reason;
  }

   /**
   * 复位原因。
   * Param reason
  **/
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetReasonDto resetReasonDto = (ResetReasonDto) o;
    return Objects.equals(this.slotIndex, resetReasonDto.slotIndex) &&
        Objects.equals(this.resetTime, resetReasonDto.resetTime) &&
        Objects.equals(this.reason, resetReasonDto.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotIndex, resetTime, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetReasonDto {\n");
    
    sb.append("    slotIndex: ").append(toIndentedString(slotIndex)).append("\n");
    sb.append("    resetTime: ").append(toIndentedString(resetTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

