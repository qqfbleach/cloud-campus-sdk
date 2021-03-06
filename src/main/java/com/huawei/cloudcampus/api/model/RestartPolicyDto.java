/*
 * 设备升级
 * · 查询设备文件 · 创建站点升级 · 查询站点升级 · 查询设备升级 · 取消设备升级 · 删除站点升级 · 重新升级设备 
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
 * 重启策略。
 */
@ApiModel(description = "重启策略。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:28.844+08:00")
public class RestartPolicyDto {
  @SerializedName("type")
  private String type = null;

  @SerializedName("day")
  private String day = null;

  @SerializedName("daytime")
  private String daytime = null;

  @SerializedName("timeZoneOffSet")
  private String timeZoneOffSet = null;

  public RestartPolicyDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 重启策略，immediately（立即重启），weektime（周期重启）二者之一。 如果是立即重启场景，type填写immediately； 如果是周期重启场景，type填写|weektime，day，daytime和timeZoneOffSet会生效。 
   * return type
  **/
  @ApiModelProperty(value = "重启策略，immediately（立即重启），weektime（周期重启）二者之一。 如果是立即重启场景，type填写immediately； 如果是周期重启场景，type填写|weektime，day，daytime和timeZoneOffSet会生效。 ")
  public String getType() {
    return type;
  }

   /**
   * 重启策略，immediately（立即重启），weektime（周期重启）二者之一。 如果是立即重启场景，type填写immediately； 如果是周期重启场景，type填写|weektime，day，daytime和timeZoneOffSet会生效。 
   * Param type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public RestartPolicyDto day(String day) {
    this.day = day;
    return this;
  }

   /**
   * 周几。
   * return day
  **/
  @ApiModelProperty(value = "周几。")
  public String getDay() {
    return day;
  }

   /**
   * 周几。
   * Param day
  **/
  public void setDay(String day) {
    this.day = day;
  }

  public RestartPolicyDto daytime(String daytime) {
    this.daytime = daytime;
    return this;
  }

   /**
   * 按周重启，配置重启时间，格式为hh:mm:ss。
   * return daytime
  **/
  @ApiModelProperty(value = "按周重启，配置重启时间，格式为hh:mm:ss。")
  public String getDaytime() {
    return daytime;
  }

   /**
   * 按周重启，配置重启时间，格式为hh:mm:ss。
   * Param daytime
  **/
  public void setDaytime(String daytime) {
    this.daytime = daytime;
  }

  public RestartPolicyDto timeZoneOffSet(String timeZoneOffSet) {
    this.timeZoneOffSet = timeZoneOffSet;
    return this;
  }

   /**
   * 时区，UTC+08:00。
   * return timeZoneOffSet
  **/
  @ApiModelProperty(value = "时区，UTC+08:00。")
  public String getTimeZoneOffSet() {
    return timeZoneOffSet;
  }

   /**
   * 时区，UTC+08:00。
   * Param timeZoneOffSet
  **/
  public void setTimeZoneOffSet(String timeZoneOffSet) {
    this.timeZoneOffSet = timeZoneOffSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartPolicyDto restartPolicyDto = (RestartPolicyDto) o;
    return Objects.equals(this.type, restartPolicyDto.type) &&
        Objects.equals(this.day, restartPolicyDto.day) &&
        Objects.equals(this.daytime, restartPolicyDto.daytime) &&
        Objects.equals(this.timeZoneOffSet, restartPolicyDto.timeZoneOffSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, day, daytime, timeZoneOffSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartPolicyDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    daytime: ").append(toIndentedString(daytime)).append("\n");
    sb.append("    timeZoneOffSet: ").append(toIndentedString(timeZoneOffSet)).append("\n");
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

