/*
 * 防火墙特征库升级
 * 防火墙特征库升级接口 
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
import com.huawei.cloudcampus.api.model.FailBean;
import com.huawei.cloudcampus.api.model.SuccessBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigPolicyResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:03.141+08:00")
public class ConfigPolicyResponse {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("success")
  private List<SuccessBean> success = null;

  @SerializedName("fail")
  private List<FailBean> fail = null;

  public ConfigPolicyResponse errcode(String errcode) {
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

  public ConfigPolicyResponse errmsg(String errmsg) {
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

  public ConfigPolicyResponse success(List<SuccessBean> success) {
    this.success = success;
    return this;
  }

  public ConfigPolicyResponse addSuccessItem(SuccessBean successItem) {
    if (this.success == null) {
      this.success = new ArrayList<SuccessBean>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * 策略下发成功的站点的信息列表。
   * return success
  **/
  @ApiModelProperty(value = "策略下发成功的站点的信息列表。")
  public List<SuccessBean> getSuccess() {
    return success;
  }

   /**
   * 策略下发成功的站点的信息列表。
   * Param success
  **/
  public void setSuccess(List<SuccessBean> success) {
    this.success = success;
  }

  public ConfigPolicyResponse fail(List<FailBean> fail) {
    this.fail = fail;
    return this;
  }

  public ConfigPolicyResponse addFailItem(FailBean failItem) {
    if (this.fail == null) {
      this.fail = new ArrayList<FailBean>();
    }
    this.fail.add(failItem);
    return this;
  }

   /**
   * 策略下发失败的站点的信息列表。
   * return fail
  **/
  @ApiModelProperty(value = "策略下发失败的站点的信息列表。")
  public List<FailBean> getFail() {
    return fail;
  }

   /**
   * 策略下发失败的站点的信息列表。
   * Param fail
  **/
  public void setFail(List<FailBean> fail) {
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
    ConfigPolicyResponse configPolicyResponse = (ConfigPolicyResponse) o;
    return Objects.equals(this.errcode, configPolicyResponse.errcode) &&
        Objects.equals(this.errmsg, configPolicyResponse.errmsg) &&
        Objects.equals(this.success, configPolicyResponse.success) &&
        Objects.equals(this.fail, configPolicyResponse.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, success, fail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigPolicyResponse {\n");
    
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

