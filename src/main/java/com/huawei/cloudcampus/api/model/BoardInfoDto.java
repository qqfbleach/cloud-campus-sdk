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
 * BoardInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:23.312+08:00")
public class BoardInfoDto {
  @SerializedName("slot")
  private String slot = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("status")
  private String status = null;

  public BoardInfoDto slot(String slot) {
    this.slot = slot;
    return this;
  }

   /**
   * 单板槽位。
   * return slot
  **/
  @ApiModelProperty(value = "单板槽位。")
  public String getSlot() {
    return slot;
  }

   /**
   * 单板槽位。
   * Param slot
  **/
  public void setSlot(String slot) {
    this.slot = slot;
  }

  public BoardInfoDto model(String model) {
    this.model = model;
    return this;
  }

   /**
   * 单板对外型号。
   * return model
  **/
  @ApiModelProperty(value = "单板对外型号。")
  public String getModel() {
    return model;
  }

   /**
   * 单板对外型号。
   * Param model
  **/
  public void setModel(String model) {
    this.model = model;
  }

  public BoardInfoDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 单板状态，0---未知、1---不在位、2---在位、3---正常、4---故障、5---已删除、6---冲突。
   * return status
  **/
  @ApiModelProperty(value = "单板状态，0---未知、1---不在位、2---在位、3---正常、4---故障、5---已删除、6---冲突。")
  public String getStatus() {
    return status;
  }

   /**
   * 单板状态，0---未知、1---不在位、2---在位、3---正常、4---故障、5---已删除、6---冲突。
   * Param status
  **/
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardInfoDto boardInfoDto = (BoardInfoDto) o;
    return Objects.equals(this.slot, boardInfoDto.slot) &&
        Objects.equals(this.model, boardInfoDto.model) &&
        Objects.equals(this.status, boardInfoDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, model, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardInfoDto {\n");
    
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

