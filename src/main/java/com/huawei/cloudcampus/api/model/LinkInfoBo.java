/*
 * 链路管理
 * 链路管理北向接口 
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
 * LinkInfoBo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:41.151+08:00")
public class LinkInfoBo {
  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("linkType")
  private String linkType = null;

  @SerializedName("anedn")
  private String anedn = null;

  @SerializedName("znedn")
  private String znedn = null;

  @SerializedName("anePortid")
  private String anePortid = null;

  @SerializedName("znePortid")
  private String znePortid = null;

  @SerializedName("aneDevType")
  private String aneDevType = null;

  @SerializedName("zneDevType")
  private String zneDevType = null;

  @SerializedName("linkStatus")
  private Integer linkStatus = null;

  @SerializedName("aportName")
  private String aportName = null;

  @SerializedName("zportName")
  private String zportName = null;

  public LinkInfoBo linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * 链路ID
   * return linkId
  **/
  @ApiModelProperty(value = "链路ID")
  public String getLinkId() {
    return linkId;
  }

   /**
   * 链路ID
   * Param linkId
  **/
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public LinkInfoBo linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * 链路类型，例如： FC、ETH
   * return linkType
  **/
  @ApiModelProperty(value = "链路类型，例如： FC、ETH")
  public String getLinkType() {
    return linkType;
  }

   /**
   * 链路类型，例如： FC、ETH
   * Param linkType
  **/
  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public LinkInfoBo anedn(String anedn) {
    this.anedn = anedn;
    return this;
  }

   /**
   * 源网元DN
   * return anedn
  **/
  @ApiModelProperty(value = "源网元DN")
  public String getAnedn() {
    return anedn;
  }

   /**
   * 源网元DN
   * Param anedn
  **/
  public void setAnedn(String anedn) {
    this.anedn = anedn;
  }

  public LinkInfoBo znedn(String znedn) {
    this.znedn = znedn;
    return this;
  }

   /**
   * 目的网元DN
   * return znedn
  **/
  @ApiModelProperty(value = "目的网元DN")
  public String getZnedn() {
    return znedn;
  }

   /**
   * 目的网元DN
   * Param znedn
  **/
  public void setZnedn(String znedn) {
    this.znedn = znedn;
  }

  public LinkInfoBo anePortid(String anePortid) {
    this.anePortid = anePortid;
    return this;
  }

   /**
   * 源网元端口
   * return anePortid
  **/
  @ApiModelProperty(value = "源网元端口")
  public String getAnePortid() {
    return anePortid;
  }

   /**
   * 源网元端口
   * Param anePortid
  **/
  public void setAnePortid(String anePortid) {
    this.anePortid = anePortid;
  }

  public LinkInfoBo znePortid(String znePortid) {
    this.znePortid = znePortid;
    return this;
  }

   /**
   * 目的网元端口
   * return znePortid
  **/
  @ApiModelProperty(value = "目的网元端口")
  public String getZnePortid() {
    return znePortid;
  }

   /**
   * 目的网元端口
   * Param znePortid
  **/
  public void setZnePortid(String znePortid) {
    this.znePortid = znePortid;
  }

  public LinkInfoBo aneDevType(String aneDevType) {
    this.aneDevType = aneDevType;
    return this;
  }

   /**
   * 源网元类型
   * return aneDevType
  **/
  @ApiModelProperty(value = "源网元类型")
  public String getAneDevType() {
    return aneDevType;
  }

   /**
   * 源网元类型
   * Param aneDevType
  **/
  public void setAneDevType(String aneDevType) {
    this.aneDevType = aneDevType;
  }

  public LinkInfoBo zneDevType(String zneDevType) {
    this.zneDevType = zneDevType;
    return this;
  }

   /**
   * 目的网元类型
   * return zneDevType
  **/
  @ApiModelProperty(value = "目的网元类型")
  public String getZneDevType() {
    return zneDevType;
  }

   /**
   * 目的网元类型
   * Param zneDevType
  **/
  public void setZneDevType(String zneDevType) {
    this.zneDevType = zneDevType;
  }

  public LinkInfoBo linkStatus(Integer linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }

   /**
   * 链路状态： 0：正常 1：未知 2：重要 3：紧急 4：离线 5：未管理 
   * return linkStatus
  **/
  @ApiModelProperty(value = "链路状态： 0：正常 1：未知 2：重要 3：紧急 4：离线 5：未管理 ")
  public Integer getLinkStatus() {
    return linkStatus;
  }

   /**
   * 链路状态： 0：正常 1：未知 2：重要 3：紧急 4：离线 5：未管理 
   * Param linkStatus
  **/
  public void setLinkStatus(Integer linkStatus) {
    this.linkStatus = linkStatus;
  }

  public LinkInfoBo aportName(String aportName) {
    this.aportName = aportName;
    return this;
  }

   /**
   * 源网元端口名称
   * return aportName
  **/
  @ApiModelProperty(value = "源网元端口名称")
  public String getAportName() {
    return aportName;
  }

   /**
   * 源网元端口名称
   * Param aportName
  **/
  public void setAportName(String aportName) {
    this.aportName = aportName;
  }

  public LinkInfoBo zportName(String zportName) {
    this.zportName = zportName;
    return this;
  }

   /**
   * 目的网元端口名称
   * return zportName
  **/
  @ApiModelProperty(value = "目的网元端口名称")
  public String getZportName() {
    return zportName;
  }

   /**
   * 目的网元端口名称
   * Param zportName
  **/
  public void setZportName(String zportName) {
    this.zportName = zportName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkInfoBo linkInfoBo = (LinkInfoBo) o;
    return Objects.equals(this.linkId, linkInfoBo.linkId) &&
        Objects.equals(this.linkType, linkInfoBo.linkType) &&
        Objects.equals(this.anedn, linkInfoBo.anedn) &&
        Objects.equals(this.znedn, linkInfoBo.znedn) &&
        Objects.equals(this.anePortid, linkInfoBo.anePortid) &&
        Objects.equals(this.znePortid, linkInfoBo.znePortid) &&
        Objects.equals(this.aneDevType, linkInfoBo.aneDevType) &&
        Objects.equals(this.zneDevType, linkInfoBo.zneDevType) &&
        Objects.equals(this.linkStatus, linkInfoBo.linkStatus) &&
        Objects.equals(this.aportName, linkInfoBo.aportName) &&
        Objects.equals(this.zportName, linkInfoBo.zportName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, linkType, anedn, znedn, anePortid, znePortid, aneDevType, zneDevType, linkStatus, aportName, zportName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkInfoBo {\n");
    
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    anedn: ").append(toIndentedString(anedn)).append("\n");
    sb.append("    znedn: ").append(toIndentedString(znedn)).append("\n");
    sb.append("    anePortid: ").append(toIndentedString(anePortid)).append("\n");
    sb.append("    znePortid: ").append(toIndentedString(znePortid)).append("\n");
    sb.append("    aneDevType: ").append(toIndentedString(aneDevType)).append("\n");
    sb.append("    zneDevType: ").append(toIndentedString(zneDevType)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    aportName: ").append(toIndentedString(aportName)).append("\n");
    sb.append("    zportName: ").append(toIndentedString(zportName)).append("\n");
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

