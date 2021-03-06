/*
 * 时间模板管理
 * 时间模板第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.2
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
 * DayContentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:17.776+08:00")
public class DayContentDto {
  @SerializedName("switchDay")
  private Integer switchDay = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("onOff")
  private Boolean onOff = null;

  public DayContentDto switchDay(Integer switchDay) {
    this.switchDay = switchDay;
    return this;
  }

   /**
   * 日期选择。1代表周一，2代表周二，3代表周三，4代表周四，5代表周五，6代表周六，7代表周日。
   * return switchDay
  **/
  @ApiModelProperty(required = true, value = "日期选择。1代表周一，2代表周二，3代表周三，4代表周四，5代表周五，6代表周六，7代表周日。")
  public Integer getSwitchDay() {
    return switchDay;
  }

   /**
   * 日期选择。1代表周一，2代表周二，3代表周三，4代表周四，5代表周五，6代表周六，7代表周日。
   * Param switchDay
  **/
  public void setSwitchDay(Integer switchDay) {
    this.switchDay = switchDay;
  }

  public DayContentDto startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间，HH:MM格式。
   * return startTime
  **/
  @ApiModelProperty(required = true, value = "开始时间，HH:MM格式。")
  public String getStartTime() {
    return startTime;
  }

   /**
   * 开始时间，HH:MM格式。
   * Param startTime
  **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DayContentDto endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间，HH:MM格式。
   * return endTime
  **/
  @ApiModelProperty(required = true, value = "结束时间，HH:MM格式。")
  public String getEndTime() {
    return endTime;
  }

   /**
   * 结束时间，HH:MM格式。
   * Param endTime
  **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DayContentDto onOff(Boolean onOff) {
    this.onOff = onOff;
    return this;
  }

   /**
   * startTime至endTime时间段是启用或禁止。
   * return onOff
  **/
  @ApiModelProperty(required = true, value = "startTime至endTime时间段是启用或禁止。")
  public Boolean getOnOff() {
    return onOff;
  }

   /**
   * startTime至endTime时间段是启用或禁止。
   * Param onOff
  **/
  public void setOnOff(Boolean onOff) {
    this.onOff = onOff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayContentDto dayContentDto = (DayContentDto) o;
    return Objects.equals(this.switchDay, dayContentDto.switchDay) &&
        Objects.equals(this.startTime, dayContentDto.startTime) &&
        Objects.equals(this.endTime, dayContentDto.endTime) &&
        Objects.equals(this.onOff, dayContentDto.onOff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchDay, startTime, endTime, onOff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayContentDto {\n");
    
    sb.append("    switchDay: ").append(toIndentedString(switchDay)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    onOff: ").append(toIndentedString(onOff)).append("\n");
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

