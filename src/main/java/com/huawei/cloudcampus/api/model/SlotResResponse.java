/*
 * 实体资源北向接口
 * 实体资源条件查询。 
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
import com.huawei.cloudcampus.api.model.SlotResData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 条件查询单板资源返回结果。
 */
@ApiModel(description = "条件查询单板资源返回结果。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:39.630+08:00")
public class SlotResResponse {
  @SerializedName("code")
  private Integer code = 0;

  @SerializedName("data")
  private List<SlotResData> data = new ArrayList<SlotResData>();

  @SerializedName("description")
  private String description = null;

  public SlotResResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 操作返回码。可以是如下值之一： 0：成功 非0：失败 
   * return code
  **/
  @ApiModelProperty(required = true, value = "操作返回码。可以是如下值之一： 0：成功 非0：失败 ")
  public Integer getCode() {
    return code;
  }

   /**
   * 操作返回码。可以是如下值之一： 0：成功 非0：失败 
   * Param code
  **/
  public void setCode(Integer code) {
    this.code = code;
  }

  public SlotResResponse data(List<SlotResData> data) {
    this.data = data;
    return this;
  }

  public SlotResResponse addDataItem(SlotResData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SlotResData> getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(List<SlotResData> data) {
    this.data = data;
  }

  public SlotResResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 描述信息。
   * return description
  **/
  @ApiModelProperty(required = true, value = "描述信息。")
  public String getDescription() {
    return description;
  }

   /**
   * 描述信息。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotResResponse slotResResponse = (SlotResResponse) o;
    return Objects.equals(this.code, slotResResponse.code) &&
        Objects.equals(this.data, slotResResponse.data) &&
        Objects.equals(this.description, slotResResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotResResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

