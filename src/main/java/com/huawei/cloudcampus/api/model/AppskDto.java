/*
 * 站点内AP增值服务配置
 * 站点内AP增值服务配置北向接口，主要特性： * 查询站点内AP增值服务配置。 * 修改站点内AP增值服务配置。 
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
 * 站点内更新预密钥配置结构体。
 */
@ApiModel(description = "站点内更新预密钥配置结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:13.248+08:00")
public class AppskDto {
  @SerializedName("enablePsk")
  private Boolean enablePsk = null;

  @SerializedName("lastUpdateTime")
  private String lastUpdateTime = null;

  public AppskDto enablePsk(Boolean enablePsk) {
    this.enablePsk = enablePsk;
    return this;
  }

   /**
   * PSK使能。
   * return enablePsk
  **/
  @ApiModelProperty(value = "PSK使能。")
  public Boolean getEnablePsk() {
    return enablePsk;
  }

   /**
   * PSK使能。
   * Param enablePsk
  **/
  public void setEnablePsk(Boolean enablePsk) {
    this.enablePsk = enablePsk;
  }

  public AppskDto lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * 最后一次更新时间。时间格式：UTC。
   * return lastUpdateTime
  **/
  @ApiModelProperty(value = "最后一次更新时间。时间格式：UTC。")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

   /**
   * 最后一次更新时间。时间格式：UTC。
   * Param lastUpdateTime
  **/
  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppskDto appskDto = (AppskDto) o;
    return Objects.equals(this.enablePsk, appskDto.enablePsk) &&
        Objects.equals(this.lastUpdateTime, appskDto.lastUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePsk, lastUpdateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppskDto {\n");
    
    sb.append("    enablePsk: ").append(toIndentedString(enablePsk)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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

