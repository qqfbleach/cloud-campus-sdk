/*
 * 交换机STP保护配置
 * 主要特性： · 创建交换机STP保护配置 · 修改交换机STP保护配置 · 查询交换机STP保护配置 · 删除交换机STP保护配置 
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
import com.huawei.cloudcampus.api.model.StpProtectionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建或修改交换机STP保护配置请求数据结构。
 */
@ApiModel(description = "创建或修改交换机STP保护配置请求数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:44.878+08:00")
public class StpProtectionRequestDto {
  @SerializedName("stpProtectionConfigs")
  private List<StpProtectionDto> stpProtectionConfigs = new ArrayList<StpProtectionDto>();

  public StpProtectionRequestDto stpProtectionConfigs(List<StpProtectionDto> stpProtectionConfigs) {
    this.stpProtectionConfigs = stpProtectionConfigs;
    return this;
  }

  public StpProtectionRequestDto addStpProtectionConfigsItem(StpProtectionDto stpProtectionConfigsItem) {
    this.stpProtectionConfigs.add(stpProtectionConfigsItem);
    return this;
  }

   /**
   * 交换机STP保护配置列表。
   * return stpProtectionConfigs
  **/
  @ApiModelProperty(required = true, value = "交换机STP保护配置列表。")
  public List<StpProtectionDto> getStpProtectionConfigs() {
    return stpProtectionConfigs;
  }

   /**
   * 交换机STP保护配置列表。
   * Param stpProtectionConfigs
  **/
  public void setStpProtectionConfigs(List<StpProtectionDto> stpProtectionConfigs) {
    this.stpProtectionConfigs = stpProtectionConfigs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StpProtectionRequestDto stpProtectionRequestDto = (StpProtectionRequestDto) o;
    return Objects.equals(this.stpProtectionConfigs, stpProtectionRequestDto.stpProtectionConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stpProtectionConfigs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StpProtectionRequestDto {\n");
    
    sb.append("    stpProtectionConfigs: ").append(toIndentedString(stpProtectionConfigs)).append("\n");
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

