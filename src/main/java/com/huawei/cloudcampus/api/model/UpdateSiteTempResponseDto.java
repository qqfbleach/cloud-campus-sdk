/*
 * 站点模板管理
 * 站点模板第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.4
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
import com.huawei.cloudcampus.api.model.SiteTempResponseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 修改站点模板信息返回体数据结构。
 */
@ApiModel(description = "修改站点模板信息返回体数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:09.284+08:00")
public class UpdateSiteTempResponseDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private SiteTempResponseDto data = null;

  public UpdateSiteTempResponseDto errcode(String errcode) {
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

  public UpdateSiteTempResponseDto errmsg(String errmsg) {
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

  public UpdateSiteTempResponseDto data(SiteTempResponseDto data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(value = "")
  public SiteTempResponseDto getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(SiteTempResponseDto data) {
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
    UpdateSiteTempResponseDto updateSiteTempResponseDto = (UpdateSiteTempResponseDto) o;
    return Objects.equals(this.errcode, updateSiteTempResponseDto.errcode) &&
        Objects.equals(this.errmsg, updateSiteTempResponseDto.errmsg) &&
        Objects.equals(this.data, updateSiteTempResponseDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSiteTempResponseDto {\n");
    
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
