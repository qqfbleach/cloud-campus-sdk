/*
 * 单板管理
 * 单板管理第三方接口。
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
 * FailedOperationDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:23.312+08:00")
public class FailedOperationDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("errdesc")
  private String errdesc = null;

  @SerializedName("errreason")
  private String errreason = null;

  @SerializedName("errdetail")
  private String errdetail = null;

  @SerializedName("erradvice")
  private String erradvice = null;

  public FailedOperationDto errcode(String errcode) {
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

  public FailedOperationDto errmsg(String errmsg) {
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

  public FailedOperationDto errdesc(String errdesc) {
    this.errdesc = errdesc;
    return this;
  }

   /**
   * 错误描述。
   * return errdesc
  **/
  @ApiModelProperty(value = "错误描述。")
  public String getErrdesc() {
    return errdesc;
  }

   /**
   * 错误描述。
   * Param errdesc
  **/
  public void setErrdesc(String errdesc) {
    this.errdesc = errdesc;
  }

  public FailedOperationDto errreason(String errreason) {
    this.errreason = errreason;
    return this;
  }

   /**
   * 错误理由。
   * return errreason
  **/
  @ApiModelProperty(value = "错误理由。")
  public String getErrreason() {
    return errreason;
  }

   /**
   * 错误理由。
   * Param errreason
  **/
  public void setErrreason(String errreason) {
    this.errreason = errreason;
  }

  public FailedOperationDto errdetail(String errdetail) {
    this.errdetail = errdetail;
    return this;
  }

   /**
   * 错误详细信息。
   * return errdetail
  **/
  @ApiModelProperty(value = "错误详细信息。")
  public String getErrdetail() {
    return errdetail;
  }

   /**
   * 错误详细信息。
   * Param errdetail
  **/
  public void setErrdetail(String errdetail) {
    this.errdetail = errdetail;
  }

  public FailedOperationDto erradvice(String erradvice) {
    this.erradvice = erradvice;
    return this;
  }

   /**
   * 更正建议。
   * return erradvice
  **/
  @ApiModelProperty(value = "更正建议。")
  public String getErradvice() {
    return erradvice;
  }

   /**
   * 更正建议。
   * Param erradvice
  **/
  public void setErradvice(String erradvice) {
    this.erradvice = erradvice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedOperationDto failedOperationDto = (FailedOperationDto) o;
    return Objects.equals(this.errcode, failedOperationDto.errcode) &&
        Objects.equals(this.errmsg, failedOperationDto.errmsg) &&
        Objects.equals(this.errdesc, failedOperationDto.errdesc) &&
        Objects.equals(this.errreason, failedOperationDto.errreason) &&
        Objects.equals(this.errdetail, failedOperationDto.errdetail) &&
        Objects.equals(this.erradvice, failedOperationDto.erradvice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, errdesc, errreason, errdetail, erradvice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedOperationDto {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    errdesc: ").append(toIndentedString(errdesc)).append("\n");
    sb.append("    errreason: ").append(toIndentedString(errreason)).append("\n");
    sb.append("    errdetail: ").append(toIndentedString(errdetail)).append("\n");
    sb.append("    erradvice: ").append(toIndentedString(erradvice)).append("\n");
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

