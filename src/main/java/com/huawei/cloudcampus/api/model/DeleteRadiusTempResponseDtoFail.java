/*
 * RADIUS模板管理
 * RADIUS模板配置第三方北向接口说明。 
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
 * 删除RADIUS服务器模板失败信息列表。
 */
@ApiModel(description = "删除RADIUS服务器模板失败信息列表。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:57.602+08:00")
public class DeleteRadiusTempResponseDtoFail {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private String data = null;

  public DeleteRadiusTempResponseDtoFail errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码。
   * return errcode
  **/
  @ApiModelProperty(value = "错误码。")
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

  public DeleteRadiusTempResponseDtoFail errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 错误信息。
   * return errmsg
  **/
  @ApiModelProperty(value = "错误信息。")
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

  public DeleteRadiusTempResponseDtoFail data(String data) {
    this.data = data;
    return this;
  }

   /**
   * 模板ID，UUID格式。
   * return data
  **/
  @ApiModelProperty(value = "模板ID，UUID格式。")
  public String getData() {
    return data;
  }

   /**
   * 模板ID，UUID格式。
   * Param data
  **/
  public void setData(String data) {
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
    DeleteRadiusTempResponseDtoFail deleteRadiusTempResponseDtoFail = (DeleteRadiusTempResponseDtoFail) o;
    return Objects.equals(this.errcode, deleteRadiusTempResponseDtoFail.errcode) &&
        Objects.equals(this.errmsg, deleteRadiusTempResponseDtoFail.errmsg) &&
        Objects.equals(this.data, deleteRadiusTempResponseDtoFail.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRadiusTempResponseDtoFail {\n");
    
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

