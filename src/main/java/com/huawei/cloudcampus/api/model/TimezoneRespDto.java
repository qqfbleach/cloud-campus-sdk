/*
 * 时间配置
 * 时间配置北向接口，主要特性： · 查询时区资源 · 查询时间配置信息（包括时区、夏令时和NTP） · 修改时间配置（包括时区、夏令时和NTP） . 查询站点模板时间配置信息（包括时区、夏令时和NTP） . 修改站点模板时间配置信息（包括时区、夏令时和NTP） 
 *
 * OpenAPI spec version: 1.1.1
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
import com.huawei.cloudcampus.api.model.ResponseDto;
import com.huawei.cloudcampus.api.model.TimezoneDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimezoneRespDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:33.353+08:00")
public class TimezoneRespDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("data")
  private List<TimezoneDto> data = new ArrayList<TimezoneDto>();

  public TimezoneRespDto errcode(String errcode) {
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

  public TimezoneRespDto errmsg(String errmsg) {
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

  public TimezoneRespDto data(List<TimezoneDto> data) {
    this.data = data;
    return this;
  }

  public TimezoneRespDto addDataItem(TimezoneDto dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 所有时区资源。
   * return data
  **/
  @ApiModelProperty(required = true, value = "所有时区资源。")
  public List<TimezoneDto> getData() {
    return data;
  }

   /**
   * 所有时区资源。
   * Param data
  **/
  public void setData(List<TimezoneDto> data) {
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
    TimezoneRespDto timezoneRespDto = (TimezoneRespDto) o;
    return Objects.equals(this.errcode, timezoneRespDto.errcode) &&
        Objects.equals(this.errmsg, timezoneRespDto.errmsg) &&
        Objects.equals(this.data, timezoneRespDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneRespDto {\n");
    
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

