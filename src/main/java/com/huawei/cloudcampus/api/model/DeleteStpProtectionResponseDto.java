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
import com.huawei.cloudcampus.api.model.DeleteStpProtectionFail;
import com.huawei.cloudcampus.api.model.ResponseBaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 删除交换机STP保护配置响应数据结构。
 */
@ApiModel(description = "删除交换机STP保护配置响应数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:44.878+08:00")
public class DeleteStpProtectionResponseDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("success")
  private List<String> success = new ArrayList<String>();

  @SerializedName("fail")
  private DeleteStpProtectionFail fail = null;

  public DeleteStpProtectionResponseDto errcode(String errcode) {
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

  public DeleteStpProtectionResponseDto errmsg(String errmsg) {
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

  public DeleteStpProtectionResponseDto success(List<String> success) {
    this.success = success;
    return this;
  }

  public DeleteStpProtectionResponseDto addSuccessItem(String successItem) {
    this.success.add(successItem);
    return this;
  }

   /**
   * 删除成功的设备ID列表。
   * return success
  **/
  @ApiModelProperty(required = true, value = "删除成功的设备ID列表。")
  public List<String> getSuccess() {
    return success;
  }

   /**
   * 删除成功的设备ID列表。
   * Param success
  **/
  public void setSuccess(List<String> success) {
    this.success = success;
  }

  public DeleteStpProtectionResponseDto fail(DeleteStpProtectionFail fail) {
    this.fail = fail;
    return this;
  }

   /**
   * Get fail
   * return fail
  **/
  @ApiModelProperty(required = true, value = "")
  public DeleteStpProtectionFail getFail() {
    return fail;
  }

   /**
   * Set fail
   * Param fail
  **/
  public void setFail(DeleteStpProtectionFail fail) {
    this.fail = fail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteStpProtectionResponseDto deleteStpProtectionResponseDto = (DeleteStpProtectionResponseDto) o;
    return Objects.equals(this.errcode, deleteStpProtectionResponseDto.errcode) &&
        Objects.equals(this.errmsg, deleteStpProtectionResponseDto.errmsg) &&
        Objects.equals(this.success, deleteStpProtectionResponseDto.success) &&
        Objects.equals(this.fail, deleteStpProtectionResponseDto.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, success, fail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteStpProtectionResponseDto {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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

