/*
 * AP SSID配置管理
 * AP SSID第三方接口。
 *
 * OpenAPI spec version: 1.4.1
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
import com.huawei.cloudcampus.api.model.SsidDeleteFailResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteSsidResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class DeleteSsidResponse {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("success")
  private List<String> success = null;

  @SerializedName("fail")
  private List<SsidDeleteFailResult> fail = null;

  public DeleteSsidResponse errcode(String errcode) {
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

  public DeleteSsidResponse errmsg(String errmsg) {
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

  public DeleteSsidResponse success(List<String> success) {
    this.success = success;
    return this;
  }

  public DeleteSsidResponse addSuccessItem(String successItem) {
    if (this.success == null) {
      this.success = new ArrayList<String>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * 删除成功的列表。
   * return success
  **/
  @ApiModelProperty(value = "删除成功的列表。")
  public List<String> getSuccess() {
    return success;
  }

   /**
   * 删除成功的列表。
   * Param success
  **/
  public void setSuccess(List<String> success) {
    this.success = success;
  }

  public DeleteSsidResponse fail(List<SsidDeleteFailResult> fail) {
    this.fail = fail;
    return this;
  }

  public DeleteSsidResponse addFailItem(SsidDeleteFailResult failItem) {
    if (this.fail == null) {
      this.fail = new ArrayList<SsidDeleteFailResult>();
    }
    this.fail.add(failItem);
    return this;
  }

   /**
   * 删除失败的列表。
   * return fail
  **/
  @ApiModelProperty(value = "删除失败的列表。")
  public List<SsidDeleteFailResult> getFail() {
    return fail;
  }

   /**
   * 删除失败的列表。
   * Param fail
  **/
  public void setFail(List<SsidDeleteFailResult> fail) {
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
    DeleteSsidResponse deleteSsidResponse = (DeleteSsidResponse) o;
    return Objects.equals(this.errcode, deleteSsidResponse.errcode) &&
        Objects.equals(this.errmsg, deleteSsidResponse.errmsg) &&
        Objects.equals(this.success, deleteSsidResponse.success) &&
        Objects.equals(this.fail, deleteSsidResponse.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, success, fail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSsidResponse {\n");
    
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

