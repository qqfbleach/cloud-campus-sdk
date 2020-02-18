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
 * LinkDataModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:41.151+08:00")
public class LinkDataModel {
  @SerializedName("linkdn")
  private String linkdn = null;

  @SerializedName("linkname")
  private String linkname = null;

  @SerializedName("anedn")
  private String anedn = null;

  @SerializedName("anename")
  private String anename = null;

  @SerializedName("aneip")
  private String aneip = null;

  @SerializedName("anestate")
  private Integer anestate = null;

  @SerializedName("aportdn")
  private String aportdn = null;

  @SerializedName("aportname")
  private String aportname = null;

  @SerializedName("aportip")
  private String aportip = null;

  @SerializedName("aportadminstatus")
  private Integer aportadminstatus = null;

  @SerializedName("aportoperstatus")
  private Integer aportoperstatus = null;

  @SerializedName("znedn")
  private String znedn = null;

  @SerializedName("znename")
  private String znename = null;

  @SerializedName("zneip")
  private String zneip = null;

  @SerializedName("znestate")
  private Integer znestate = null;

  @SerializedName("zportdn")
  private String zportdn = null;

  @SerializedName("zportname")
  private String zportname = null;

  @SerializedName("zportip")
  private String zportip = null;

  @SerializedName("zportadminstatus")
  private Integer zportadminstatus = null;

  @SerializedName("zportoperstatus")
  private Integer zportoperstatus = null;

  @SerializedName("linkstatus")
  private Integer linkstatus = null;

  @SerializedName("linktype")
  private Integer linktype = null;

  @SerializedName("speed")
  private String speed = null;

  public LinkDataModel linkdn(String linkdn) {
    this.linkdn = linkdn;
    return this;
  }

   /**
   * 链路DN
   * return linkdn
  **/
  @ApiModelProperty(value = "链路DN")
  public String getLinkdn() {
    return linkdn;
  }

   /**
   * 链路DN
   * Param linkdn
  **/
  public void setLinkdn(String linkdn) {
    this.linkdn = linkdn;
  }

  public LinkDataModel linkname(String linkname) {
    this.linkname = linkname;
    return this;
  }

   /**
   * 链路名称
   * return linkname
  **/
  @ApiModelProperty(value = "链路名称")
  public String getLinkname() {
    return linkname;
  }

   /**
   * 链路名称
   * Param linkname
  **/
  public void setLinkname(String linkname) {
    this.linkname = linkname;
  }

  public LinkDataModel anedn(String anedn) {
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

  public LinkDataModel anename(String anename) {
    this.anename = anename;
    return this;
  }

   /**
   * 源网元名称
   * return anename
  **/
  @ApiModelProperty(value = "源网元名称")
  public String getAnename() {
    return anename;
  }

   /**
   * 源网元名称
   * Param anename
  **/
  public void setAnename(String anename) {
    this.anename = anename;
  }

  public LinkDataModel aneip(String aneip) {
    this.aneip = aneip;
    return this;
  }

   /**
   * 源网元IP
   * return aneip
  **/
  @ApiModelProperty(value = "源网元IP")
  public String getAneip() {
    return aneip;
  }

   /**
   * 源网元IP
   * Param aneip
  **/
  public void setAneip(String aneip) {
    this.aneip = aneip;
  }

  public LinkDataModel anestate(Integer anestate) {
    this.anestate = anestate;
    return this;
  }

   /**
   * 源网元状态： 0：未管理 1：在线 2：离线 3：未知 
   * return anestate
  **/
  @ApiModelProperty(value = "源网元状态： 0：未管理 1：在线 2：离线 3：未知 ")
  public Integer getAnestate() {
    return anestate;
  }

   /**
   * 源网元状态： 0：未管理 1：在线 2：离线 3：未知 
   * Param anestate
  **/
  public void setAnestate(Integer anestate) {
    this.anestate = anestate;
  }

  public LinkDataModel aportdn(String aportdn) {
    this.aportdn = aportdn;
    return this;
  }

   /**
   * 源端口DN
   * return aportdn
  **/
  @ApiModelProperty(value = "源端口DN")
  public String getAportdn() {
    return aportdn;
  }

   /**
   * 源端口DN
   * Param aportdn
  **/
  public void setAportdn(String aportdn) {
    this.aportdn = aportdn;
  }

  public LinkDataModel aportname(String aportname) {
    this.aportname = aportname;
    return this;
  }

   /**
   * 源端口名称
   * return aportname
  **/
  @ApiModelProperty(value = "源端口名称")
  public String getAportname() {
    return aportname;
  }

   /**
   * 源端口名称
   * Param aportname
  **/
  public void setAportname(String aportname) {
    this.aportname = aportname;
  }

  public LinkDataModel aportip(String aportip) {
    this.aportip = aportip;
    return this;
  }

   /**
   * 源端口IP
   * return aportip
  **/
  @ApiModelProperty(value = "源端口IP")
  public String getAportip() {
    return aportip;
  }

   /**
   * 源端口IP
   * Param aportip
  **/
  public void setAportip(String aportip) {
    this.aportip = aportip;
  }

  public LinkDataModel aportadminstatus(Integer aportadminstatus) {
    this.aportadminstatus = aportadminstatus;
    return this;
  }

   /**
   * 源端口管理状态： 1：up 2：down 3：testing 
   * return aportadminstatus
  **/
  @ApiModelProperty(value = "源端口管理状态： 1：up 2：down 3：testing ")
  public Integer getAportadminstatus() {
    return aportadminstatus;
  }

   /**
   * 源端口管理状态： 1：up 2：down 3：testing 
   * Param aportadminstatus
  **/
  public void setAportadminstatus(Integer aportadminstatus) {
    this.aportadminstatus = aportadminstatus;
  }

  public LinkDataModel aportoperstatus(Integer aportoperstatus) {
    this.aportoperstatus = aportoperstatus;
    return this;
  }

   /**
   * 源端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown 
   * return aportoperstatus
  **/
  @ApiModelProperty(value = "源端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown ")
  public Integer getAportoperstatus() {
    return aportoperstatus;
  }

   /**
   * 源端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown 
   * Param aportoperstatus
  **/
  public void setAportoperstatus(Integer aportoperstatus) {
    this.aportoperstatus = aportoperstatus;
  }

  public LinkDataModel znedn(String znedn) {
    this.znedn = znedn;
    return this;
  }

   /**
   * 宿网元DN
   * return znedn
  **/
  @ApiModelProperty(value = "宿网元DN")
  public String getZnedn() {
    return znedn;
  }

   /**
   * 宿网元DN
   * Param znedn
  **/
  public void setZnedn(String znedn) {
    this.znedn = znedn;
  }

  public LinkDataModel znename(String znename) {
    this.znename = znename;
    return this;
  }

   /**
   * 宿网元名称
   * return znename
  **/
  @ApiModelProperty(value = "宿网元名称")
  public String getZnename() {
    return znename;
  }

   /**
   * 宿网元名称
   * Param znename
  **/
  public void setZnename(String znename) {
    this.znename = znename;
  }

  public LinkDataModel zneip(String zneip) {
    this.zneip = zneip;
    return this;
  }

   /**
   * 宿网元IP
   * return zneip
  **/
  @ApiModelProperty(value = "宿网元IP")
  public String getZneip() {
    return zneip;
  }

   /**
   * 宿网元IP
   * Param zneip
  **/
  public void setZneip(String zneip) {
    this.zneip = zneip;
  }

  public LinkDataModel znestate(Integer znestate) {
    this.znestate = znestate;
    return this;
  }

   /**
   * 宿网元状态： 0：未管理 1：在线 2：离线 3：未知 
   * return znestate
  **/
  @ApiModelProperty(value = "宿网元状态： 0：未管理 1：在线 2：离线 3：未知 ")
  public Integer getZnestate() {
    return znestate;
  }

   /**
   * 宿网元状态： 0：未管理 1：在线 2：离线 3：未知 
   * Param znestate
  **/
  public void setZnestate(Integer znestate) {
    this.znestate = znestate;
  }

  public LinkDataModel zportdn(String zportdn) {
    this.zportdn = zportdn;
    return this;
  }

   /**
   * 宿端口DN
   * return zportdn
  **/
  @ApiModelProperty(value = "宿端口DN")
  public String getZportdn() {
    return zportdn;
  }

   /**
   * 宿端口DN
   * Param zportdn
  **/
  public void setZportdn(String zportdn) {
    this.zportdn = zportdn;
  }

  public LinkDataModel zportname(String zportname) {
    this.zportname = zportname;
    return this;
  }

   /**
   * 宿端口名称
   * return zportname
  **/
  @ApiModelProperty(value = "宿端口名称")
  public String getZportname() {
    return zportname;
  }

   /**
   * 宿端口名称
   * Param zportname
  **/
  public void setZportname(String zportname) {
    this.zportname = zportname;
  }

  public LinkDataModel zportip(String zportip) {
    this.zportip = zportip;
    return this;
  }

   /**
   * 宿端口IP
   * return zportip
  **/
  @ApiModelProperty(value = "宿端口IP")
  public String getZportip() {
    return zportip;
  }

   /**
   * 宿端口IP
   * Param zportip
  **/
  public void setZportip(String zportip) {
    this.zportip = zportip;
  }

  public LinkDataModel zportadminstatus(Integer zportadminstatus) {
    this.zportadminstatus = zportadminstatus;
    return this;
  }

   /**
   * 宿端口管理状态： 1：up 2：down 3：testing 
   * return zportadminstatus
  **/
  @ApiModelProperty(value = "宿端口管理状态： 1：up 2：down 3：testing ")
  public Integer getZportadminstatus() {
    return zportadminstatus;
  }

   /**
   * 宿端口管理状态： 1：up 2：down 3：testing 
   * Param zportadminstatus
  **/
  public void setZportadminstatus(Integer zportadminstatus) {
    this.zportadminstatus = zportadminstatus;
  }

  public LinkDataModel zportoperstatus(Integer zportoperstatus) {
    this.zportoperstatus = zportoperstatus;
    return this;
  }

   /**
   * 宿端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown 
   * return zportoperstatus
  **/
  @ApiModelProperty(value = "宿端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown ")
  public Integer getZportoperstatus() {
    return zportoperstatus;
  }

   /**
   * 宿端口运行状态： 1：up 2：down 3：testing 4：unknown 5：dormant 6：notPresent 7：lowerLayerDown 
   * Param zportoperstatus
  **/
  public void setZportoperstatus(Integer zportoperstatus) {
    this.zportoperstatus = zportoperstatus;
  }

  public LinkDataModel linkstatus(Integer linkstatus) {
    this.linkstatus = linkstatus;
    return this;
  }

   /**
   * 链路状态： 0：正常 1：未知 2：重要故障 3：紧急故障 4：离线 5：不管理 
   * return linkstatus
  **/
  @ApiModelProperty(value = "链路状态： 0：正常 1：未知 2：重要故障 3：紧急故障 4：离线 5：不管理 ")
  public Integer getLinkstatus() {
    return linkstatus;
  }

   /**
   * 链路状态： 0：正常 1：未知 2：重要故障 3：紧急故障 4：离线 5：不管理 
   * Param linkstatus
  **/
  public void setLinkstatus(Integer linkstatus) {
    this.linkstatus = linkstatus;
  }

  public LinkDataModel linktype(Integer linktype) {
    this.linktype = linktype;
    return this;
  }

   /**
   * 链路类型： 1：LLDP 2：Side-By-Side链路 3：MACARP 4：CDP 5：IP 6：由物理链路生成Eth-Trunk链路 99：手工 
   * return linktype
  **/
  @ApiModelProperty(value = "链路类型： 1：LLDP 2：Side-By-Side链路 3：MACARP 4：CDP 5：IP 6：由物理链路生成Eth-Trunk链路 99：手工 ")
  public Integer getLinktype() {
    return linktype;
  }

   /**
   * 链路类型： 1：LLDP 2：Side-By-Side链路 3：MACARP 4：CDP 5：IP 6：由物理链路生成Eth-Trunk链路 99：手工 
   * Param linktype
  **/
  public void setLinktype(Integer linktype) {
    this.linktype = linktype;
  }

  public LinkDataModel speed(String speed) {
    this.speed = speed;
    return this;
  }

   /**
   * 单位：Mbit/s
   * return speed
  **/
  @ApiModelProperty(value = "单位：Mbit/s")
  public String getSpeed() {
    return speed;
  }

   /**
   * 单位：Mbit/s
   * Param speed
  **/
  public void setSpeed(String speed) {
    this.speed = speed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDataModel linkDataModel = (LinkDataModel) o;
    return Objects.equals(this.linkdn, linkDataModel.linkdn) &&
        Objects.equals(this.linkname, linkDataModel.linkname) &&
        Objects.equals(this.anedn, linkDataModel.anedn) &&
        Objects.equals(this.anename, linkDataModel.anename) &&
        Objects.equals(this.aneip, linkDataModel.aneip) &&
        Objects.equals(this.anestate, linkDataModel.anestate) &&
        Objects.equals(this.aportdn, linkDataModel.aportdn) &&
        Objects.equals(this.aportname, linkDataModel.aportname) &&
        Objects.equals(this.aportip, linkDataModel.aportip) &&
        Objects.equals(this.aportadminstatus, linkDataModel.aportadminstatus) &&
        Objects.equals(this.aportoperstatus, linkDataModel.aportoperstatus) &&
        Objects.equals(this.znedn, linkDataModel.znedn) &&
        Objects.equals(this.znename, linkDataModel.znename) &&
        Objects.equals(this.zneip, linkDataModel.zneip) &&
        Objects.equals(this.znestate, linkDataModel.znestate) &&
        Objects.equals(this.zportdn, linkDataModel.zportdn) &&
        Objects.equals(this.zportname, linkDataModel.zportname) &&
        Objects.equals(this.zportip, linkDataModel.zportip) &&
        Objects.equals(this.zportadminstatus, linkDataModel.zportadminstatus) &&
        Objects.equals(this.zportoperstatus, linkDataModel.zportoperstatus) &&
        Objects.equals(this.linkstatus, linkDataModel.linkstatus) &&
        Objects.equals(this.linktype, linkDataModel.linktype) &&
        Objects.equals(this.speed, linkDataModel.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkdn, linkname, anedn, anename, aneip, anestate, aportdn, aportname, aportip, aportadminstatus, aportoperstatus, znedn, znename, zneip, znestate, zportdn, zportname, zportip, zportadminstatus, zportoperstatus, linkstatus, linktype, speed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDataModel {\n");
    
    sb.append("    linkdn: ").append(toIndentedString(linkdn)).append("\n");
    sb.append("    linkname: ").append(toIndentedString(linkname)).append("\n");
    sb.append("    anedn: ").append(toIndentedString(anedn)).append("\n");
    sb.append("    anename: ").append(toIndentedString(anename)).append("\n");
    sb.append("    aneip: ").append(toIndentedString(aneip)).append("\n");
    sb.append("    anestate: ").append(toIndentedString(anestate)).append("\n");
    sb.append("    aportdn: ").append(toIndentedString(aportdn)).append("\n");
    sb.append("    aportname: ").append(toIndentedString(aportname)).append("\n");
    sb.append("    aportip: ").append(toIndentedString(aportip)).append("\n");
    sb.append("    aportadminstatus: ").append(toIndentedString(aportadminstatus)).append("\n");
    sb.append("    aportoperstatus: ").append(toIndentedString(aportoperstatus)).append("\n");
    sb.append("    znedn: ").append(toIndentedString(znedn)).append("\n");
    sb.append("    znename: ").append(toIndentedString(znename)).append("\n");
    sb.append("    zneip: ").append(toIndentedString(zneip)).append("\n");
    sb.append("    znestate: ").append(toIndentedString(znestate)).append("\n");
    sb.append("    zportdn: ").append(toIndentedString(zportdn)).append("\n");
    sb.append("    zportname: ").append(toIndentedString(zportname)).append("\n");
    sb.append("    zportip: ").append(toIndentedString(zportip)).append("\n");
    sb.append("    zportadminstatus: ").append(toIndentedString(zportadminstatus)).append("\n");
    sb.append("    zportoperstatus: ").append(toIndentedString(zportoperstatus)).append("\n");
    sb.append("    linkstatus: ").append(toIndentedString(linkstatus)).append("\n");
    sb.append("    linktype: ").append(toIndentedString(linktype)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
