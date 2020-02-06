/*
 * 配置保存
 * 配置保存接口说明。 
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
import com.huawei.cloudcampus.api.model.CommonDto;
import com.huawei.cloudcampus.api.model.ConfigSaveItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigSaveResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:35.965+08:00")
public class ConfigSaveResult {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("saveItems")
  private List<ConfigSaveItem> saveItems = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  public ConfigSaveResult errcode(String errcode) {
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

  public ConfigSaveResult errmsg(String errmsg) {
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

  public ConfigSaveResult saveItems(List<ConfigSaveItem> saveItems) {
    this.saveItems = saveItems;
    return this;
  }

  public ConfigSaveResult addSaveItemsItem(ConfigSaveItem saveItemsItem) {
    if (this.saveItems == null) {
      this.saveItems = new ArrayList<ConfigSaveItem>();
    }
    this.saveItems.add(saveItemsItem);
    return this;
  }

   /**
   * 保存结果。
   * return saveItems
  **/
  @ApiModelProperty(value = "保存结果。")
  public List<ConfigSaveItem> getSaveItems() {
    return saveItems;
  }

   /**
   * 保存结果。
   * Param saveItems
  **/
  public void setSaveItems(List<ConfigSaveItem> saveItems) {
    this.saveItems = saveItems;
  }

  public ConfigSaveResult pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 页码，从1开始，默认为1。
   * return pageIndex
  **/
  @ApiModelProperty(value = "页码，从1开始，默认为1。")
  public Integer getPageIndex() {
    return pageIndex;
  }

   /**
   * 页码，从1开始，默认为1。
   * Param pageIndex
  **/
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public ConfigSaveResult pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询，每页数量。
   * return pageSize
  **/
  @ApiModelProperty(value = "分页查询，每页数量。")
  public Integer getPageSize() {
    return pageSize;
  }

   /**
   * 分页查询，每页数量。
   * Param pageSize
  **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ConfigSaveResult totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 结果记录总数。
   * return totalRecords
  **/
  @ApiModelProperty(value = "结果记录总数。")
  public Integer getTotalRecords() {
    return totalRecords;
  }

   /**
   * 结果记录总数。
   * Param totalRecords
  **/
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigSaveResult configSaveResult = (ConfigSaveResult) o;
    return Objects.equals(this.errcode, configSaveResult.errcode) &&
        Objects.equals(this.errmsg, configSaveResult.errmsg) &&
        Objects.equals(this.saveItems, configSaveResult.saveItems) &&
        Objects.equals(this.pageIndex, configSaveResult.pageIndex) &&
        Objects.equals(this.pageSize, configSaveResult.pageSize) &&
        Objects.equals(this.totalRecords, configSaveResult.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, saveItems, pageIndex, pageSize, totalRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigSaveResult {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    saveItems: ").append(toIndentedString(saveItems)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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

