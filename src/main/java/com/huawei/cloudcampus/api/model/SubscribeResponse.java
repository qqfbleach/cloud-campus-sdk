/*
 * 链路管理
 * 链路管理北向接口 
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
 * SubscribeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:41.151+08:00")
public class SubscribeResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("data")
  private Object data = null;

  public SubscribeResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 操作返回码。可以是如下值之一： 0：成功 非0：失败 
   * return code
  **/
  @ApiModelProperty(value = "操作返回码。可以是如下值之一： 0：成功 非0：失败 ")
  public Integer getCode() {
    return code;
  }

   /**
   * 操作返回码。可以是如下值之一： 0：成功 非0：失败 
   * Param code
  **/
  public void setCode(Integer code) {
    this.code = code;
  }

  public SubscribeResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 接口调用结果的描述信息。
   * return description
  **/
  @ApiModelProperty(value = "接口调用结果的描述信息。")
  public String getDescription() {
    return description;
  }

   /**
   * 接口调用结果的描述信息。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public SubscribeResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * 此处为null。
   * return data
  **/
  @ApiModelProperty(value = "此处为null。")
  public Object getData() {
    return data;
  }

   /**
   * 此处为null。
   * Param data
  **/
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeResponse subscribeResponse = (SubscribeResponse) o;
    return Objects.equals(this.code, subscribeResponse.code) &&
        Objects.equals(this.description, subscribeResponse.description) &&
        Objects.equals(this.data, subscribeResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
