/*
 * 认证模板管理
 * 认证模板北向接口定义 
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
import com.huawei.cloudcampus.api.model.AuthenProfileDeleteFailedResultDto;
import com.huawei.cloudcampus.api.model.AuthenProfileDeleteSuccessResultDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 删除认证模板返回参数。
 */
@ApiModel(description = "删除认证模板返回参数。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:20.231+08:00")
public class AuthenProfileDeleteRespDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("success")
  private List<AuthenProfileDeleteSuccessResultDto> success = null;

  @SerializedName("fail")
  private List<AuthenProfileDeleteFailedResultDto> fail = null;

  public AuthenProfileDeleteRespDto errcode(String errcode) {
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

  public AuthenProfileDeleteRespDto errmsg(String errmsg) {
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

  public AuthenProfileDeleteRespDto success(List<AuthenProfileDeleteSuccessResultDto> success) {
    this.success = success;
    return this;
  }

  public AuthenProfileDeleteRespDto addSuccessItem(AuthenProfileDeleteSuccessResultDto successItem) {
    if (this.success == null) {
      this.success = new ArrayList<AuthenProfileDeleteSuccessResultDto>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * Get success
   * return success
  **/
  @ApiModelProperty(value = "")
  public List<AuthenProfileDeleteSuccessResultDto> getSuccess() {
    return success;
  }

   /**
   * Set success
   * Param success
  **/
  public void setSuccess(List<AuthenProfileDeleteSuccessResultDto> success) {
    this.success = success;
  }

  public AuthenProfileDeleteRespDto fail(List<AuthenProfileDeleteFailedResultDto> fail) {
    this.fail = fail;
    return this;
  }

  public AuthenProfileDeleteRespDto addFailItem(AuthenProfileDeleteFailedResultDto failItem) {
    if (this.fail == null) {
      this.fail = new ArrayList<AuthenProfileDeleteFailedResultDto>();
    }
    this.fail.add(failItem);
    return this;
  }

   /**
   * Get fail
   * return fail
  **/
  @ApiModelProperty(value = "")
  public List<AuthenProfileDeleteFailedResultDto> getFail() {
    return fail;
  }

   /**
   * Set fail
   * Param fail
  **/
  public void setFail(List<AuthenProfileDeleteFailedResultDto> fail) {
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
    AuthenProfileDeleteRespDto authenProfileDeleteRespDto = (AuthenProfileDeleteRespDto) o;
    return Objects.equals(this.errcode, authenProfileDeleteRespDto.errcode) &&
        Objects.equals(this.errmsg, authenProfileDeleteRespDto.errmsg) &&
        Objects.equals(this.success, authenProfileDeleteRespDto.success) &&
        Objects.equals(this.fail, authenProfileDeleteRespDto.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, success, fail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenProfileDeleteRespDto {\n");
    
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

