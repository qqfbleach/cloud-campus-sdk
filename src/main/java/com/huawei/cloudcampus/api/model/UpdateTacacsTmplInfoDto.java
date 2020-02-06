/*
 * TACACS模板管理
 * TACACS模板配置北向接口，主要特性：  * 创建tacacs模板。 * 修改tacacs模板。 * 查询tacacs模板。 * 删除tacacs模板。 
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
import com.huawei.cloudcampus.api.model.TacacsTmplCommonInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * tacacs服务器模板信息。
 */
@ApiModel(description = "tacacs服务器模板信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:32.009+08:00")
public class UpdateTacacsTmplInfoDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("masterAuthenServerIp")
  private String masterAuthenServerIp = null;

  @SerializedName("masterAuthenServerPort")
  private Integer masterAuthenServerPort = null;

  @SerializedName("slaveAuthenServerIp")
  private String slaveAuthenServerIp = null;

  @SerializedName("slaveAuthenServerPort")
  private Integer slaveAuthenServerPort = null;

  @SerializedName("masterAuthorServerIp")
  private String masterAuthorServerIp = null;

  @SerializedName("masterAuthorServerPort")
  private Integer masterAuthorServerPort = null;

  @SerializedName("slaveAuthorServerIp")
  private String slaveAuthorServerIp = null;

  @SerializedName("slaveAuthorServerPort")
  private Integer slaveAuthorServerPort = null;

  @SerializedName("masterAccServerIp")
  private String masterAccServerIp = null;

  @SerializedName("masterAccServerPort")
  private Integer masterAccServerPort = null;

  @SerializedName("slaveAccServerIp")
  private String slaveAccServerIp = null;

  @SerializedName("slaveAccServerPort")
  private Integer slaveAccServerPort = null;

  @SerializedName("includeDomain")
  private Boolean includeDomain = null;

  @SerializedName("shareKey")
  private String shareKey = null;

  public UpdateTacacsTmplInfoDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 名称（不支持$&amp;?&#x3D;+%][^_,#\&quot;相关特殊字符）。
   * return name
  **/
  @ApiModelProperty(required = true, value = "名称（不支持$&?=+%][^_,#\"相关特殊字符）。")
  public String getName() {
    return name;
  }

   /**
   * 名称（不支持$&amp;?&#x3D;+%][^_,#\&quot;相关特殊字符）。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public UpdateTacacsTmplInfoDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 描述。
   * return description
  **/
  @ApiModelProperty(value = "描述。")
  public String getDescription() {
    return description;
  }

   /**
   * 描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateTacacsTmplInfoDto masterAuthenServerIp(String masterAuthenServerIp) {
    this.masterAuthenServerIp = masterAuthenServerIp;
    return this;
  }

   /**
   * 主认证服务器IP地址。
   * return masterAuthenServerIp
  **/
  @ApiModelProperty(required = true, value = "主认证服务器IP地址。")
  public String getMasterAuthenServerIp() {
    return masterAuthenServerIp;
  }

   /**
   * 主认证服务器IP地址。
   * Param masterAuthenServerIp
  **/
  public void setMasterAuthenServerIp(String masterAuthenServerIp) {
    this.masterAuthenServerIp = masterAuthenServerIp;
  }

  public UpdateTacacsTmplInfoDto masterAuthenServerPort(Integer masterAuthenServerPort) {
    this.masterAuthenServerPort = masterAuthenServerPort;
    return this;
  }

   /**
   * 主认证服务器端口。
   * minimum: 1
   * maximum: 65535
   * return masterAuthenServerPort
  **/
  @ApiModelProperty(required = true, value = "主认证服务器端口。")
  public Integer getMasterAuthenServerPort() {
    return masterAuthenServerPort;
  }

   /**
   * 主认证服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param masterAuthenServerPort
  **/
  public void setMasterAuthenServerPort(Integer masterAuthenServerPort) {
    this.masterAuthenServerPort = masterAuthenServerPort;
  }

  public UpdateTacacsTmplInfoDto slaveAuthenServerIp(String slaveAuthenServerIp) {
    this.slaveAuthenServerIp = slaveAuthenServerIp;
    return this;
  }

   /**
   * 备认证服务器IP地址。
   * return slaveAuthenServerIp
  **/
  @ApiModelProperty(value = "备认证服务器IP地址。")
  public String getSlaveAuthenServerIp() {
    return slaveAuthenServerIp;
  }

   /**
   * 备认证服务器IP地址。
   * Param slaveAuthenServerIp
  **/
  public void setSlaveAuthenServerIp(String slaveAuthenServerIp) {
    this.slaveAuthenServerIp = slaveAuthenServerIp;
  }

  public UpdateTacacsTmplInfoDto slaveAuthenServerPort(Integer slaveAuthenServerPort) {
    this.slaveAuthenServerPort = slaveAuthenServerPort;
    return this;
  }

   /**
   * 备认证服务器端口。
   * minimum: 1
   * maximum: 65535
   * return slaveAuthenServerPort
  **/
  @ApiModelProperty(value = "备认证服务器端口。")
  public Integer getSlaveAuthenServerPort() {
    return slaveAuthenServerPort;
  }

   /**
   * 备认证服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param slaveAuthenServerPort
  **/
  public void setSlaveAuthenServerPort(Integer slaveAuthenServerPort) {
    this.slaveAuthenServerPort = slaveAuthenServerPort;
  }

  public UpdateTacacsTmplInfoDto masterAuthorServerIp(String masterAuthorServerIp) {
    this.masterAuthorServerIp = masterAuthorServerIp;
    return this;
  }

   /**
   * 主授权服务器IP地址。
   * return masterAuthorServerIp
  **/
  @ApiModelProperty(value = "主授权服务器IP地址。")
  public String getMasterAuthorServerIp() {
    return masterAuthorServerIp;
  }

   /**
   * 主授权服务器IP地址。
   * Param masterAuthorServerIp
  **/
  public void setMasterAuthorServerIp(String masterAuthorServerIp) {
    this.masterAuthorServerIp = masterAuthorServerIp;
  }

  public UpdateTacacsTmplInfoDto masterAuthorServerPort(Integer masterAuthorServerPort) {
    this.masterAuthorServerPort = masterAuthorServerPort;
    return this;
  }

   /**
   * 主授权服务器端口。
   * minimum: 1
   * maximum: 65535
   * return masterAuthorServerPort
  **/
  @ApiModelProperty(value = "主授权服务器端口。")
  public Integer getMasterAuthorServerPort() {
    return masterAuthorServerPort;
  }

   /**
   * 主授权服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param masterAuthorServerPort
  **/
  public void setMasterAuthorServerPort(Integer masterAuthorServerPort) {
    this.masterAuthorServerPort = masterAuthorServerPort;
  }

  public UpdateTacacsTmplInfoDto slaveAuthorServerIp(String slaveAuthorServerIp) {
    this.slaveAuthorServerIp = slaveAuthorServerIp;
    return this;
  }

   /**
   * 备授权服务器IP地址。
   * return slaveAuthorServerIp
  **/
  @ApiModelProperty(value = "备授权服务器IP地址。")
  public String getSlaveAuthorServerIp() {
    return slaveAuthorServerIp;
  }

   /**
   * 备授权服务器IP地址。
   * Param slaveAuthorServerIp
  **/
  public void setSlaveAuthorServerIp(String slaveAuthorServerIp) {
    this.slaveAuthorServerIp = slaveAuthorServerIp;
  }

  public UpdateTacacsTmplInfoDto slaveAuthorServerPort(Integer slaveAuthorServerPort) {
    this.slaveAuthorServerPort = slaveAuthorServerPort;
    return this;
  }

   /**
   * 备授权服务器端口。
   * minimum: 1
   * maximum: 65535
   * return slaveAuthorServerPort
  **/
  @ApiModelProperty(value = "备授权服务器端口。")
  public Integer getSlaveAuthorServerPort() {
    return slaveAuthorServerPort;
  }

   /**
   * 备授权服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param slaveAuthorServerPort
  **/
  public void setSlaveAuthorServerPort(Integer slaveAuthorServerPort) {
    this.slaveAuthorServerPort = slaveAuthorServerPort;
  }

  public UpdateTacacsTmplInfoDto masterAccServerIp(String masterAccServerIp) {
    this.masterAccServerIp = masterAccServerIp;
    return this;
  }

   /**
   * 主计费服务器IP地址。
   * return masterAccServerIp
  **/
  @ApiModelProperty(value = "主计费服务器IP地址。")
  public String getMasterAccServerIp() {
    return masterAccServerIp;
  }

   /**
   * 主计费服务器IP地址。
   * Param masterAccServerIp
  **/
  public void setMasterAccServerIp(String masterAccServerIp) {
    this.masterAccServerIp = masterAccServerIp;
  }

  public UpdateTacacsTmplInfoDto masterAccServerPort(Integer masterAccServerPort) {
    this.masterAccServerPort = masterAccServerPort;
    return this;
  }

   /**
   * 主计费服务器端口。
   * minimum: 1
   * maximum: 65535
   * return masterAccServerPort
  **/
  @ApiModelProperty(value = "主计费服务器端口。")
  public Integer getMasterAccServerPort() {
    return masterAccServerPort;
  }

   /**
   * 主计费服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param masterAccServerPort
  **/
  public void setMasterAccServerPort(Integer masterAccServerPort) {
    this.masterAccServerPort = masterAccServerPort;
  }

  public UpdateTacacsTmplInfoDto slaveAccServerIp(String slaveAccServerIp) {
    this.slaveAccServerIp = slaveAccServerIp;
    return this;
  }

   /**
   * 备计费服务器IP地址。
   * return slaveAccServerIp
  **/
  @ApiModelProperty(value = "备计费服务器IP地址。")
  public String getSlaveAccServerIp() {
    return slaveAccServerIp;
  }

   /**
   * 备计费服务器IP地址。
   * Param slaveAccServerIp
  **/
  public void setSlaveAccServerIp(String slaveAccServerIp) {
    this.slaveAccServerIp = slaveAccServerIp;
  }

  public UpdateTacacsTmplInfoDto slaveAccServerPort(Integer slaveAccServerPort) {
    this.slaveAccServerPort = slaveAccServerPort;
    return this;
  }

   /**
   * 备计费服务器端口。
   * minimum: 1
   * maximum: 65535
   * return slaveAccServerPort
  **/
  @ApiModelProperty(value = "备计费服务器端口。")
  public Integer getSlaveAccServerPort() {
    return slaveAccServerPort;
  }

   /**
   * 备计费服务器端口。
   * minimum: 1
   * maximum: 65535
   * Param slaveAccServerPort
  **/
  public void setSlaveAccServerPort(Integer slaveAccServerPort) {
    this.slaveAccServerPort = slaveAccServerPort;
  }

  public UpdateTacacsTmplInfoDto includeDomain(Boolean includeDomain) {
    this.includeDomain = includeDomain;
    return this;
  }

   /**
   * 向Tacacs服务器发起认证的用户名是否包含域名。
   * return includeDomain
  **/
  @ApiModelProperty(value = "向Tacacs服务器发起认证的用户名是否包含域名。")
  public Boolean getIncludeDomain() {
    return includeDomain;
  }

   /**
   * 向Tacacs服务器发起认证的用户名是否包含域名。
   * Param includeDomain
  **/
  public void setIncludeDomain(Boolean includeDomain) {
    this.includeDomain = includeDomain;
  }

  public UpdateTacacsTmplInfoDto shareKey(String shareKey) {
    this.shareKey = shareKey;
    return this;
  }

   /**
   * 秘钥（英文字母、数字、除空格和问号外特殊符号，建议长度为6位以上）。
   * return shareKey
  **/
  @ApiModelProperty(value = "秘钥（英文字母、数字、除空格和问号外特殊符号，建议长度为6位以上）。")
  public String getShareKey() {
    return shareKey;
  }

   /**
   * 秘钥（英文字母、数字、除空格和问号外特殊符号，建议长度为6位以上）。
   * Param shareKey
  **/
  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTacacsTmplInfoDto updateTacacsTmplInfoDto = (UpdateTacacsTmplInfoDto) o;
    return Objects.equals(this.name, updateTacacsTmplInfoDto.name) &&
        Objects.equals(this.description, updateTacacsTmplInfoDto.description) &&
        Objects.equals(this.masterAuthenServerIp, updateTacacsTmplInfoDto.masterAuthenServerIp) &&
        Objects.equals(this.masterAuthenServerPort, updateTacacsTmplInfoDto.masterAuthenServerPort) &&
        Objects.equals(this.slaveAuthenServerIp, updateTacacsTmplInfoDto.slaveAuthenServerIp) &&
        Objects.equals(this.slaveAuthenServerPort, updateTacacsTmplInfoDto.slaveAuthenServerPort) &&
        Objects.equals(this.masterAuthorServerIp, updateTacacsTmplInfoDto.masterAuthorServerIp) &&
        Objects.equals(this.masterAuthorServerPort, updateTacacsTmplInfoDto.masterAuthorServerPort) &&
        Objects.equals(this.slaveAuthorServerIp, updateTacacsTmplInfoDto.slaveAuthorServerIp) &&
        Objects.equals(this.slaveAuthorServerPort, updateTacacsTmplInfoDto.slaveAuthorServerPort) &&
        Objects.equals(this.masterAccServerIp, updateTacacsTmplInfoDto.masterAccServerIp) &&
        Objects.equals(this.masterAccServerPort, updateTacacsTmplInfoDto.masterAccServerPort) &&
        Objects.equals(this.slaveAccServerIp, updateTacacsTmplInfoDto.slaveAccServerIp) &&
        Objects.equals(this.slaveAccServerPort, updateTacacsTmplInfoDto.slaveAccServerPort) &&
        Objects.equals(this.includeDomain, updateTacacsTmplInfoDto.includeDomain) &&
        Objects.equals(this.shareKey, updateTacacsTmplInfoDto.shareKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, masterAuthenServerIp, masterAuthenServerPort, slaveAuthenServerIp, slaveAuthenServerPort, masterAuthorServerIp, masterAuthorServerPort, slaveAuthorServerIp, slaveAuthorServerPort, masterAccServerIp, masterAccServerPort, slaveAccServerIp, slaveAccServerPort, includeDomain, shareKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTacacsTmplInfoDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    masterAuthenServerIp: ").append(toIndentedString(masterAuthenServerIp)).append("\n");
    sb.append("    masterAuthenServerPort: ").append(toIndentedString(masterAuthenServerPort)).append("\n");
    sb.append("    slaveAuthenServerIp: ").append(toIndentedString(slaveAuthenServerIp)).append("\n");
    sb.append("    slaveAuthenServerPort: ").append(toIndentedString(slaveAuthenServerPort)).append("\n");
    sb.append("    masterAuthorServerIp: ").append(toIndentedString(masterAuthorServerIp)).append("\n");
    sb.append("    masterAuthorServerPort: ").append(toIndentedString(masterAuthorServerPort)).append("\n");
    sb.append("    slaveAuthorServerIp: ").append(toIndentedString(slaveAuthorServerIp)).append("\n");
    sb.append("    slaveAuthorServerPort: ").append(toIndentedString(slaveAuthorServerPort)).append("\n");
    sb.append("    masterAccServerIp: ").append(toIndentedString(masterAccServerIp)).append("\n");
    sb.append("    masterAccServerPort: ").append(toIndentedString(masterAccServerPort)).append("\n");
    sb.append("    slaveAccServerIp: ").append(toIndentedString(slaveAccServerIp)).append("\n");
    sb.append("    slaveAccServerPort: ").append(toIndentedString(slaveAccServerPort)).append("\n");
    sb.append("    includeDomain: ").append(toIndentedString(includeDomain)).append("\n");
    sb.append("    shareKey: ").append(toIndentedString(shareKey)).append("\n");
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

