/*
 * PPSK帐号配置
 * PPSK帐号管理北向接口，主要包括： · 创建PPSK帐号 · 修改PPSK帐号 · 删除PPSK帐号 · 查询PPSK帐号 
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
import com.huawei.cloudcampus.api.model.BaseResponseDto;
import com.huawei.cloudcampus.api.model.PPSKResponseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询PPSK帐号信息返回数据结构。
 */
@ApiModel(description = "查询PPSK帐号信息返回数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:02.589+08:00")
public class PpskGetResponseDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("totalrecords")
  private Integer totalrecords = null;

  @SerializedName("data")
  private List<PPSKResponseDto> data = new ArrayList<PPSKResponseDto>();

  public PpskGetResponseDto errcode(String errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码，错误码为0表示操作成功。
   * return errcode
  **/
  @ApiModelProperty(required = true, value = "错误码，错误码为0表示操作成功。")
  public String getErrcode() {
    return errcode;
  }

   /**
   * 错误码，错误码为0表示操作成功。
   * Param errcode
  **/
  public void setErrcode(String errcode) {
    this.errcode = errcode;
  }

  public PpskGetResponseDto errmsg(String errmsg) {
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

  public PpskGetResponseDto totalrecords(Integer totalrecords) {
    this.totalrecords = totalrecords;
    return this;
  }

   /**
   * 总记录数。
   * return totalrecords
  **/
  @ApiModelProperty(value = "总记录数。")
  public Integer getTotalrecords() {
    return totalrecords;
  }

   /**
   * 总记录数。
   * Param totalrecords
  **/
  public void setTotalrecords(Integer totalrecords) {
    this.totalrecords = totalrecords;
  }

  public PpskGetResponseDto data(List<PPSKResponseDto> data) {
    this.data = data;
    return this;
  }

  public PpskGetResponseDto addDataItem(PPSKResponseDto dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * PSK帐号数据列表。
   * return data
  **/
  @ApiModelProperty(required = true, value = "PSK帐号数据列表。")
  public List<PPSKResponseDto> getData() {
    return data;
  }

   /**
   * PSK帐号数据列表。
   * Param data
  **/
  public void setData(List<PPSKResponseDto> data) {
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
    PpskGetResponseDto ppskGetResponseDto = (PpskGetResponseDto) o;
    return Objects.equals(this.errcode, ppskGetResponseDto.errcode) &&
        Objects.equals(this.errmsg, ppskGetResponseDto.errmsg) &&
        Objects.equals(this.totalrecords, ppskGetResponseDto.totalrecords) &&
        Objects.equals(this.data, ppskGetResponseDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, totalrecords, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PpskGetResponseDto {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    totalrecords: ").append(toIndentedString(totalrecords)).append("\n");
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

