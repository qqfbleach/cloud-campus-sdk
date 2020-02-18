/*
 * 设备基本信息管理
 * 设备相关操作接口。 场景：对设备增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.6.2
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
import com.huawei.cloudcampus.api.model.BatchModifyDeviceFailBean;
import com.huawei.cloudcampus.api.model.BatchModifyDeviceSuccessBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchModifyDeviceBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:21.311+08:00")
public class BatchModifyDeviceBean {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("success")
  private List<BatchModifyDeviceSuccessBean> success = null;

  @SerializedName("fail")
  private List<BatchModifyDeviceFailBean> fail = null;

  public BatchModifyDeviceBean errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码：全部成功或部分成功返回0；全部失败返回3。
   * return errcode
  **/
  @ApiModelProperty(value = "错误码：全部成功或部分成功返回0；全部失败返回3。")
  public String getErrcode() {
    return errcode;
  }

   /**
   * 错误码：全部成功或部分成功返回0；全部失败返回3。
   * Param errcode
  **/
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }

  public BatchModifyDeviceBean errmsg(String errmsg) {
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

  public BatchModifyDeviceBean success(List<BatchModifyDeviceSuccessBean> success) {
    this.success = success;
    return this;
  }

  public BatchModifyDeviceBean addSuccessItem(BatchModifyDeviceSuccessBean successItem) {
    if (this.success == null) {
      this.success = new ArrayList<BatchModifyDeviceSuccessBean>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * 修改成功的设备信息列表。
   * return success
  **/
  @ApiModelProperty(value = "修改成功的设备信息列表。")
  public List<BatchModifyDeviceSuccessBean> getSuccess() {
    return success;
  }

   /**
   * 修改成功的设备信息列表。
   * Param success
  **/
  public void setSuccess(List<BatchModifyDeviceSuccessBean> success) {
    this.success = success;
  }

  public BatchModifyDeviceBean fail(List<BatchModifyDeviceFailBean> fail) {
    this.fail = fail;
    return this;
  }

  public BatchModifyDeviceBean addFailItem(BatchModifyDeviceFailBean failItem) {
    if (this.fail == null) {
      this.fail = new ArrayList<BatchModifyDeviceFailBean>();
    }
    this.fail.add(failItem);
    return this;
  }

   /**
   * 修改失败的设备信息列表。
   * return fail
  **/
  @ApiModelProperty(value = "修改失败的设备信息列表。")
  public List<BatchModifyDeviceFailBean> getFail() {
    return fail;
  }

   /**
   * 修改失败的设备信息列表。
   * Param fail
  **/
  public void setFail(List<BatchModifyDeviceFailBean> fail) {
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
    BatchModifyDeviceBean batchModifyDeviceBean = (BatchModifyDeviceBean) o;
    return Objects.equals(this.errcode, batchModifyDeviceBean.errcode) &&
        Objects.equals(this.errmsg, batchModifyDeviceBean.errmsg) &&
        Objects.equals(this.success, batchModifyDeviceBean.success) &&
        Objects.equals(this.fail, batchModifyDeviceBean.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, success, fail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchModifyDeviceBean {\n");
    
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
