/*
 * 设备定时重启
 * · 创建或修改定时重启、延时重启设备任务 · 查询重启设备任务的状态 
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
 * RebootStatusData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:59.116+08:00")
public class RebootStatusData {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("taskCreatTime")
  private Integer taskCreatTime = null;

  @SerializedName("taskStatus")
  private String taskStatus = null;

  public RebootStatusData deviceId(String deviceId) {
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

  public RebootStatusData taskCreatTime(Integer taskCreatTime) {
    this.taskCreatTime = taskCreatTime;
    return this;
  }

   /**
   * 任务创建时间，时间戳格式，单位秒。
   * return taskCreatTime
  **/
  @ApiModelProperty(value = "任务创建时间，时间戳格式，单位秒。")
  public Integer getTaskCreatTime() {
    return taskCreatTime;
  }

   /**
   * 任务创建时间，时间戳格式，单位秒。
   * Param taskCreatTime
  **/
  public void setTaskCreatTime(Integer taskCreatTime) {
    this.taskCreatTime = taskCreatTime;
  }

  public RebootStatusData taskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * 任务状态范围： waiting、executing、success、failure。
   * return taskStatus
  **/
  @ApiModelProperty(value = "任务状态范围： waiting、executing、success、failure。")
  public String getTaskStatus() {
    return taskStatus;
  }

   /**
   * 任务状态范围： waiting、executing、success、failure。
   * Param taskStatus
  **/
  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebootStatusData rebootStatusData = (RebootStatusData) o;
    return Objects.equals(this.deviceId, rebootStatusData.deviceId) &&
        Objects.equals(this.taskCreatTime, rebootStatusData.taskCreatTime) &&
        Objects.equals(this.taskStatus, rebootStatusData.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, taskCreatTime, taskStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebootStatusData {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    taskCreatTime: ").append(toIndentedString(taskCreatTime)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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

