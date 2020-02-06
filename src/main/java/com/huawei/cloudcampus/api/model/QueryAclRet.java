/*
 * ACL模板管理
 * ACL模板第三方管理接口说明。 
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
import com.huawei.cloudcampus.api.model.AclDtoInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryAclRet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:09.348+08:00")
public class QueryAclRet {
  @SerializedName("errcode")
  private String errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  @SerializedName("data")
  private List<AclDtoInResponse> data = null;

  public QueryAclRet errcode(String errcode) {
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

  public QueryAclRet errmsg(String errmsg) {
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

  public QueryAclRet totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 查询匹配到的ACL模板总数。
   * return totalRecords
  **/
  @ApiModelProperty(value = "查询匹配到的ACL模板总数。")
  public Integer getTotalRecords() {
    return totalRecords;
  }

   /**
   * 查询匹配到的ACL模板总数。
   * Param totalRecords
  **/
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public QueryAclRet data(List<AclDtoInResponse> data) {
    this.data = data;
    return this;
  }

  public QueryAclRet addDataItem(AclDtoInResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<AclDtoInResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 返回的ACL模板记录信息。
   * return data
  **/
  @ApiModelProperty(value = "返回的ACL模板记录信息。")
  public List<AclDtoInResponse> getData() {
    return data;
  }

   /**
   * 返回的ACL模板记录信息。
   * Param data
  **/
  public void setData(List<AclDtoInResponse> data) {
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
    QueryAclRet queryAclRet = (QueryAclRet) o;
    return Objects.equals(this.errcode, queryAclRet.errcode) &&
        Objects.equals(this.errmsg, queryAclRet.errmsg) &&
        Objects.equals(this.totalRecords, queryAclRet.totalRecords) &&
        Objects.equals(this.data, queryAclRet.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, totalRecords, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAclRet {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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

