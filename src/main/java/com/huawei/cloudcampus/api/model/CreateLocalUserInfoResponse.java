/*
 * 本地用户配置管理
 * 本地用户配置北向接口，主要特性： · 查询本地用户配置 · 修改本地用户配置 · 创建本地用户配置 
 *
 * OpenAPI spec version: 1.2.1
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
import com.huawei.cloudcampus.api.model.LocalUserSecurityInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 新增本地用户信息返回数据结构。
 */
@ApiModel(description = "新增本地用户信息返回数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:24.051+08:00")
public class CreateLocalUserInfoResponse {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private LocalUserSecurityInfoDto data = null;

  public CreateLocalUserInfoResponse errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码。
   * return errcode
  **/
  @ApiModelProperty(required = true, value = "错误码。")
  public String getErrcode() {
    return errcode;
  }

   /**
   * 错误码。
   * Param errcode
  **/
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }

  public CreateLocalUserInfoResponse errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 错误信息。
   * return errmsg
  **/
  @ApiModelProperty(required = true, value = "错误信息。")
  public String getErrmsg() {
    return errmsg;
  }

   /**
   * 错误信息。
   * Param errmsg
  **/
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public CreateLocalUserInfoResponse data(LocalUserSecurityInfoDto data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(value = "")
  public LocalUserSecurityInfoDto getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(LocalUserSecurityInfoDto data) {
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
    CreateLocalUserInfoResponse createLocalUserInfoResponse = (CreateLocalUserInfoResponse) o;
    return Objects.equals(this.errcode, createLocalUserInfoResponse.errcode) &&
        Objects.equals(this.errmsg, createLocalUserInfoResponse.errmsg) &&
        Objects.equals(this.data, createLocalUserInfoResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLocalUserInfoResponse {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
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

