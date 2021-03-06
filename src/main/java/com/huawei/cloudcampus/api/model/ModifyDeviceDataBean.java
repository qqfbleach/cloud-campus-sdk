/*
 * 设备基本信息管理
 * 设备相关操作接口。 场景：对设备增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.6.2
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
import java.util.ArrayList;
import java.util.List;

/**
 * ModifyDeviceDataBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:21.311+08:00")
public class ModifyDeviceDataBean {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("siteId")
  private String siteId = null;

  @SerializedName("esn")
  private String esn = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("systemIp")
  private String systemIp = null;

  public ModifyDeviceDataBean id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 设备ID。
   * return id
  **/
  @ApiModelProperty(value = "设备ID。")
  public String getId() {
    return id;
  }

   /**
   * 设备ID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public ModifyDeviceDataBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 设备名称。
   * return name
  **/
  @ApiModelProperty(value = "设备名称。")
  public String getName() {
    return name;
  }

   /**
   * 设备名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public ModifyDeviceDataBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 设备描述。
   * return description
  **/
  @ApiModelProperty(value = "设备描述。")
  public String getDescription() {
    return description;
  }

   /**
   * 设备描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyDeviceDataBean siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * 站点ID。
   * return siteId
  **/
  @ApiModelProperty(value = "站点ID。")
  public String getSiteId() {
    return siteId;
  }

   /**
   * 站点ID。
   * Param siteId
  **/
  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public ModifyDeviceDataBean esn(String esn) {
    this.esn = esn;
    return this;
  }

   /**
   * 设备ESN。
   * return esn
  **/
  @ApiModelProperty(value = "设备ESN。")
  public String getEsn() {
    return esn;
  }

   /**
   * 设备ESN。
   * Param esn
  **/
  public void setEsn(String esn) {
    this.esn = esn;
  }

  public ModifyDeviceDataBean tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ModifyDeviceDataBean addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 设备标签列表，需和站点ID同时使用，只支持AP设备。
   * return tags
  **/
  @ApiModelProperty(value = "设备标签列表，需和站点ID同时使用，只支持AP设备。")
  public List<String> getTags() {
    return tags;
  }

   /**
   * 设备标签列表，需和站点ID同时使用，只支持AP设备。
   * Param tags
  **/
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ModifyDeviceDataBean systemIp(String systemIp) {
    this.systemIp = systemIp;
    return this;
  }

   /**
   * 系统IP地址。
   * return systemIp
  **/
  @ApiModelProperty(value = "系统IP地址。")
  public String getSystemIp() {
    return systemIp;
  }

   /**
   * 系统IP地址。
   * Param systemIp
  **/
  public void setSystemIp(String systemIp) {
    this.systemIp = systemIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDeviceDataBean modifyDeviceDataBean = (ModifyDeviceDataBean) o;
    return Objects.equals(this.id, modifyDeviceDataBean.id) &&
        Objects.equals(this.name, modifyDeviceDataBean.name) &&
        Objects.equals(this.description, modifyDeviceDataBean.description) &&
        Objects.equals(this.siteId, modifyDeviceDataBean.siteId) &&
        Objects.equals(this.esn, modifyDeviceDataBean.esn) &&
        Objects.equals(this.tags, modifyDeviceDataBean.tags) &&
        Objects.equals(this.systemIp, modifyDeviceDataBean.systemIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, siteId, esn, tags, systemIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDeviceDataBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    systemIp: ").append(toIndentedString(systemIp)).append("\n");
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

