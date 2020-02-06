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
 * 创建ping任务的返回信息。
 */
@ApiModel(description = "创建ping任务的返回信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:49.142+08:00")
public class PingTaskDiagnose {
  @SerializedName("taskId")
  private String taskId = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("status")
  private Integer status = null;

  public PingTaskDiagnose taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * ping探测任务ID，格式UUID。
   * return taskId
  **/
  @ApiModelProperty(required = true, value = "ping探测任务ID，格式UUID。")
  public String getTaskId() {
    return taskId;
  }

   /**
   * ping探测任务ID，格式UUID。
   * Param taskId
  **/
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public PingTaskDiagnose destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * 目的地址。可以是IP地址或域名，域名中不能包含空格。
   * return destination
  **/
  @ApiModelProperty(required = true, value = "目的地址。可以是IP地址或域名，域名中不能包含空格。")
  public String getDestination() {
    return destination;
  }

   /**
   * 目的地址。可以是IP地址或域名，域名中不能包含空格。
   * Param destination
  **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public PingTaskDiagnose status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 探测状态。当探测状态为1时，会根据任务ID查询任务结果。探测状态取值如下： 0 --- 成功 1 --- 执行中 2 --- 超时 
   * return status
  **/
  @ApiModelProperty(required = true, value = "探测状态。当探测状态为1时，会根据任务ID查询任务结果。探测状态取值如下： 0 --- 成功 1 --- 执行中 2 --- 超时 ")
  public Integer getStatus() {
    return status;
  }

   /**
   * 探测状态。当探测状态为1时，会根据任务ID查询任务结果。探测状态取值如下： 0 --- 成功 1 --- 执行中 2 --- 超时 
   * Param status
  **/
  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingTaskDiagnose pingTaskDiagnose = (PingTaskDiagnose) o;
    return Objects.equals(this.taskId, pingTaskDiagnose.taskId) &&
        Objects.equals(this.destination, pingTaskDiagnose.destination) &&
        Objects.equals(this.status, pingTaskDiagnose.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, destination, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingTaskDiagnose {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

