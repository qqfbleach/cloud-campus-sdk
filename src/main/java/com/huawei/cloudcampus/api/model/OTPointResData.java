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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 光口资源模型。
 */
@ApiModel(description = "光口资源模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:39.630+08:00")
public class OTPointResData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("adminstatus")
  private String adminstatus = null;

  @SerializedName("operstatus")
  private String operstatus = null;

  @SerializedName("ipaddress")
  private String ipaddress = null;

  @SerializedName("ipnetmask")
  private String ipnetmask = null;

  @SerializedName("portindex")
  private String portindex = null;

  public OTPointResData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 光口名称。
   * return name
  **/
  @ApiModelProperty(value = "光口名称。")
  public String getName() {
    return name;
  }

   /**
   * 光口名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public OTPointResData adminstatus(String adminstatus) {
    this.adminstatus = adminstatus;
    return this;
  }

   /**
   * 管理状态。
   * return adminstatus
  **/
  @ApiModelProperty(value = "管理状态。")
  public String getAdminstatus() {
    return adminstatus;
  }

   /**
   * 管理状态。
   * Param adminstatus
  **/
  public void setAdminstatus(String adminstatus) {
    this.adminstatus = adminstatus;
  }

  public OTPointResData operstatus(String operstatus) {
    this.operstatus = operstatus;
    return this;
  }

   /**
   * 操作状态。
   * return operstatus
  **/
  @ApiModelProperty(value = "操作状态。")
  public String getOperstatus() {
    return operstatus;
  }

   /**
   * 操作状态。
   * Param operstatus
  **/
  public void setOperstatus(String operstatus) {
    this.operstatus = operstatus;
  }

  public OTPointResData ipaddress(String ipaddress) {
    this.ipaddress = ipaddress;
    return this;
  }

   /**
   * 光口IP地址。
   * return ipaddress
  **/
  @ApiModelProperty(value = "光口IP地址。")
  public String getIpaddress() {
    return ipaddress;
  }

   /**
   * 光口IP地址。
   * Param ipaddress
  **/
  public void setIpaddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public OTPointResData ipnetmask(String ipnetmask) {
    this.ipnetmask = ipnetmask;
    return this;
  }

   /**
   * 光口子网掩码。
   * return ipnetmask
  **/
  @ApiModelProperty(value = "光口子网掩码。")
  public String getIpnetmask() {
    return ipnetmask;
  }

   /**
   * 光口子网掩码。
   * Param ipnetmask
  **/
  public void setIpnetmask(String ipnetmask) {
    this.ipnetmask = ipnetmask;
  }

  public OTPointResData portindex(String portindex) {
    this.portindex = portindex;
    return this;
  }

   /**
   * 光口索引。
   * return portindex
  **/
  @ApiModelProperty(value = "光口索引。")
  public String getPortindex() {
    return portindex;
  }

   /**
   * 光口索引。
   * Param portindex
  **/
  public void setPortindex(String portindex) {
    this.portindex = portindex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OTPointResData otPointResData = (OTPointResData) o;
    return Objects.equals(this.name, otPointResData.name) &&
        Objects.equals(this.adminstatus, otPointResData.adminstatus) &&
        Objects.equals(this.operstatus, otPointResData.operstatus) &&
        Objects.equals(this.ipaddress, otPointResData.ipaddress) &&
        Objects.equals(this.ipnetmask, otPointResData.ipnetmask) &&
        Objects.equals(this.portindex, otPointResData.portindex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, adminstatus, operstatus, ipaddress, ipnetmask, portindex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OTPointResData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adminstatus: ").append(toIndentedString(adminstatus)).append("\n");
    sb.append("    operstatus: ").append(toIndentedString(operstatus)).append("\n");
    sb.append("    ipaddress: ").append(toIndentedString(ipaddress)).append("\n");
    sb.append("    ipnetmask: ").append(toIndentedString(ipnetmask)).append("\n");
    sb.append("    portindex: ").append(toIndentedString(portindex)).append("\n");
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

