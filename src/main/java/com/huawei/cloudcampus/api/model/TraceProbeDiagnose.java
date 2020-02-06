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
 * trace探测任务单跳返回具体信息。
 */
@ApiModel(description = "trace探测任务单跳返回具体信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:49.142+08:00")
public class TraceProbeDiagnose {
  @SerializedName("probeIndex")
  private Integer probeIndex = null;

  @SerializedName("result")
  private Integer result = null;

  @SerializedName("deltaTime")
  private Integer deltaTime = null;

  @SerializedName("probeAddress")
  private String probeAddress = null;

  public TraceProbeDiagnose probeIndex(Integer probeIndex) {
    this.probeIndex = probeIndex;
    return this;
  }

   /**
   * 单跳探测索引。
   * return probeIndex
  **/
  @ApiModelProperty(required = true, value = "单跳探测索引。")
  public Integer getProbeIndex() {
    return probeIndex;
  }

   /**
   * 单跳探测索引。
   * Param probeIndex
  **/
  public void setProbeIndex(Integer probeIndex) {
    this.probeIndex = probeIndex;
  }

  public TraceProbeDiagnose result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * 探测状态。 0 --- 已完成 1 --- 执行中 2 --- 超时 3 --- 失败 
   * return result
  **/
  @ApiModelProperty(required = true, value = "探测状态。 0 --- 已完成 1 --- 执行中 2 --- 超时 3 --- 失败 ")
  public Integer getResult() {
    return result;
  }

   /**
   * 探测状态。 0 --- 已完成 1 --- 执行中 2 --- 超时 3 --- 失败 
   * Param result
  **/
  public void setResult(Integer result) {
    this.result = result;
  }

  public TraceProbeDiagnose deltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
    return this;
  }

   /**
   * 探测增量时间。
   * return deltaTime
  **/
  @ApiModelProperty(required = true, value = "探测增量时间。")
  public Integer getDeltaTime() {
    return deltaTime;
  }

   /**
   * 探测增量时间。
   * Param deltaTime
  **/
  public void setDeltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
  }

  public TraceProbeDiagnose probeAddress(String probeAddress) {
    this.probeAddress = probeAddress;
    return this;
  }

   /**
   * 单跳探测地址。可以是IP地址或域名，域名中不能包含空格。
   * return probeAddress
  **/
  @ApiModelProperty(required = true, value = "单跳探测地址。可以是IP地址或域名，域名中不能包含空格。")
  public String getProbeAddress() {
    return probeAddress;
  }

   /**
   * 单跳探测地址。可以是IP地址或域名，域名中不能包含空格。
   * Param probeAddress
  **/
  public void setProbeAddress(String probeAddress) {
    this.probeAddress = probeAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceProbeDiagnose traceProbeDiagnose = (TraceProbeDiagnose) o;
    return Objects.equals(this.probeIndex, traceProbeDiagnose.probeIndex) &&
        Objects.equals(this.result, traceProbeDiagnose.result) &&
        Objects.equals(this.deltaTime, traceProbeDiagnose.deltaTime) &&
        Objects.equals(this.probeAddress, traceProbeDiagnose.probeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probeIndex, result, deltaTime, probeAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceProbeDiagnose {\n");
    
    sb.append("    probeIndex: ").append(toIndentedString(probeIndex)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    deltaTime: ").append(toIndentedString(deltaTime)).append("\n");
    sb.append("    probeAddress: ").append(toIndentedString(probeAddress)).append("\n");
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

