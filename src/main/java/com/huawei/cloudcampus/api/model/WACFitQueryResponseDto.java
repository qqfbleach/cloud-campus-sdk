/*
 * WAC关联Fit AP管理
 * WAC关联Fit AP第三方接口，主要特性：  · 根据指定的WAC设备ID查询关联的Fit AP列表 · 根据指定的WAC设备关联Fit AP列表 · 根据指定的WAC设备解除关联的Fit AP列表 
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
import com.huawei.cloudcampus.api.model.FitApInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询WAC设备关联的Fit AP的返回体数据结构。
 */
@ApiModel(description = "查询WAC设备关联的Fit AP的返回体数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:34.692+08:00")
public class WACFitQueryResponseDto {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("data")
  private List<FitApInfo> data = null;

  public WACFitQueryResponseDto errcode(String errcode) {
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

  public WACFitQueryResponseDto errmsg(String errmsg) {
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

  public WACFitQueryResponseDto total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 总的数据条数。
   * return total
  **/
  @ApiModelProperty(value = "总的数据条数。")
  public Integer getTotal() {
    return total;
  }

   /**
   * 总的数据条数。
   * Param total
  **/
  public void setTotal(Integer total) {
    this.total = total;
  }

  public WACFitQueryResponseDto pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 当前页。
   * return pageIndex
  **/
  @ApiModelProperty(value = "当前页。")
  public Integer getPageIndex() {
    return pageIndex;
  }

   /**
   * 当前页。
   * Param pageIndex
  **/
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public WACFitQueryResponseDto data(List<FitApInfo> data) {
    this.data = data;
    return this;
  }

  public WACFitQueryResponseDto addDataItem(FitApInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<FitApInfo>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Fit AP设备信息的数据结构。
   * return data
  **/
  @ApiModelProperty(value = "Fit AP设备信息的数据结构。")
  public List<FitApInfo> getData() {
    return data;
  }

   /**
   * Fit AP设备信息的数据结构。
   * Param data
  **/
  public void setData(List<FitApInfo> data) {
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
    WACFitQueryResponseDto waCFitQueryResponseDto = (WACFitQueryResponseDto) o;
    return Objects.equals(this.errcode, waCFitQueryResponseDto.errcode) &&
        Objects.equals(this.errmsg, waCFitQueryResponseDto.errmsg) &&
        Objects.equals(this.total, waCFitQueryResponseDto.total) &&
        Objects.equals(this.pageIndex, waCFitQueryResponseDto.pageIndex) &&
        Objects.equals(this.data, waCFitQueryResponseDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, total, pageIndex, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WACFitQueryResponseDto {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
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
