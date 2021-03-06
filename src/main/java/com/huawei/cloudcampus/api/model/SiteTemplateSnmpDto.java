/*
 * 站点模板SNMP配置
 * 站点模板SNMP配置第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.2
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
import com.huawei.cloudcampus.api.model.TargetHostsDto;
import com.huawei.cloudcampus.api.model.UserInfosDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 站点模板SNMP配置信息。
 */
@ApiModel(description = "站点模板SNMP配置信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:07.861+08:00")
public class SiteTemplateSnmpDto {
  @SerializedName("snmpEnable")
  private Boolean snmpEnable = null;

  @SerializedName("protocolVersion")
  private String protocolVersion = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("userInfos")
  private List<UserInfosDto> userInfos = null;

  @SerializedName("aclIps")
  private List<String> aclIps = null;

  @SerializedName("trapEnable")
  private Boolean trapEnable = null;

  @SerializedName("targetHosts")
  private List<TargetHostsDto> targetHosts = null;

  public SiteTemplateSnmpDto snmpEnable(Boolean snmpEnable) {
    this.snmpEnable = snmpEnable;
    return this;
  }

   /**
   * SNMP使能开关。
   * return snmpEnable
  **/
  @ApiModelProperty(required = true, value = "SNMP使能开关。")
  public Boolean getSnmpEnable() {
    return snmpEnable;
  }

   /**
   * SNMP使能开关。
   * Param snmpEnable
  **/
  public void setSnmpEnable(Boolean snmpEnable) {
    this.snmpEnable = snmpEnable;
  }

  public SiteTemplateSnmpDto protocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * 协议版本，只能为V1、V2C、V3其中一种，当snmpEnable为true时，protocolVersion生效且不能为空。
   * return protocolVersion
  **/
  @ApiModelProperty(value = "协议版本，只能为V1、V2C、V3其中一种，当snmpEnable为true时，protocolVersion生效且不能为空。")
  public String getProtocolVersion() {
    return protocolVersion;
  }

   /**
   * 协议版本，只能为V1、V2C、V3其中一种，当snmpEnable为true时，protocolVersion生效且不能为空。
   * Param protocolVersion
  **/
  public void setProtocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public SiteTemplateSnmpDto groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * 团体名，当snmpEnable为true且protocolVersion为V1或V2C时，groupName生效且不能为空。
   * return groupName
  **/
  @ApiModelProperty(value = "团体名，当snmpEnable为true且protocolVersion为V1或V2C时，groupName生效且不能为空。")
  public String getGroupName() {
    return groupName;
  }

   /**
   * 团体名，当snmpEnable为true且protocolVersion为V1或V2C时，groupName生效且不能为空。
   * Param groupName
  **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public SiteTemplateSnmpDto userInfos(List<UserInfosDto> userInfos) {
    this.userInfos = userInfos;
    return this;
  }

  public SiteTemplateSnmpDto addUserInfosItem(UserInfosDto userInfosItem) {
    if (this.userInfos == null) {
      this.userInfos = new ArrayList<UserInfosDto>();
    }
    this.userInfos.add(userInfosItem);
    return this;
  }

   /**
   * 用户列表，当snmpEnable为true且protocolVersion为V3时，userInfos生效且不能为空。
   * return userInfos
  **/
  @ApiModelProperty(value = "用户列表，当snmpEnable为true且protocolVersion为V3时，userInfos生效且不能为空。")
  public List<UserInfosDto> getUserInfos() {
    return userInfos;
  }

   /**
   * 用户列表，当snmpEnable为true且protocolVersion为V3时，userInfos生效且不能为空。
   * Param userInfos
  **/
  public void setUserInfos(List<UserInfosDto> userInfos) {
    this.userInfos = userInfos;
  }

  public SiteTemplateSnmpDto aclIps(List<String> aclIps) {
    this.aclIps = aclIps;
    return this;
  }

  public SiteTemplateSnmpDto addAclIpsItem(String aclIpsItem) {
    if (this.aclIps == null) {
      this.aclIps = new ArrayList<String>();
    }
    this.aclIps.add(aclIpsItem);
    return this;
  }

   /**
   * IP地址限定，当snmpEnable为true时，aclIps生效。
   * return aclIps
  **/
  @ApiModelProperty(value = "IP地址限定，当snmpEnable为true时，aclIps生效。")
  public List<String> getAclIps() {
    return aclIps;
  }

   /**
   * IP地址限定，当snmpEnable为true时，aclIps生效。
   * Param aclIps
  **/
  public void setAclIps(List<String> aclIps) {
    this.aclIps = aclIps;
  }

  public SiteTemplateSnmpDto trapEnable(Boolean trapEnable) {
    this.trapEnable = trapEnable;
    return this;
  }

   /**
   * 告警服务器使能开关，当snmpEnable为true时，trapEnable生效。
   * return trapEnable
  **/
  @ApiModelProperty(value = "告警服务器使能开关，当snmpEnable为true时，trapEnable生效。")
  public Boolean getTrapEnable() {
    return trapEnable;
  }

   /**
   * 告警服务器使能开关，当snmpEnable为true时，trapEnable生效。
   * Param trapEnable
  **/
  public void setTrapEnable(Boolean trapEnable) {
    this.trapEnable = trapEnable;
  }

  public SiteTemplateSnmpDto targetHosts(List<TargetHostsDto> targetHosts) {
    this.targetHosts = targetHosts;
    return this;
  }

  public SiteTemplateSnmpDto addTargetHostsItem(TargetHostsDto targetHostsItem) {
    if (this.targetHosts == null) {
      this.targetHosts = new ArrayList<TargetHostsDto>();
    }
    this.targetHosts.add(targetHostsItem);
    return this;
  }

   /**
   * 告警服务器列表，当trapEnable为true时，targetHosts生效且不能为空。
   * return targetHosts
  **/
  @ApiModelProperty(value = "告警服务器列表，当trapEnable为true时，targetHosts生效且不能为空。")
  public List<TargetHostsDto> getTargetHosts() {
    return targetHosts;
  }

   /**
   * 告警服务器列表，当trapEnable为true时，targetHosts生效且不能为空。
   * Param targetHosts
  **/
  public void setTargetHosts(List<TargetHostsDto> targetHosts) {
    this.targetHosts = targetHosts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteTemplateSnmpDto siteTemplateSnmpDto = (SiteTemplateSnmpDto) o;
    return Objects.equals(this.snmpEnable, siteTemplateSnmpDto.snmpEnable) &&
        Objects.equals(this.protocolVersion, siteTemplateSnmpDto.protocolVersion) &&
        Objects.equals(this.groupName, siteTemplateSnmpDto.groupName) &&
        Objects.equals(this.userInfos, siteTemplateSnmpDto.userInfos) &&
        Objects.equals(this.aclIps, siteTemplateSnmpDto.aclIps) &&
        Objects.equals(this.trapEnable, siteTemplateSnmpDto.trapEnable) &&
        Objects.equals(this.targetHosts, siteTemplateSnmpDto.targetHosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snmpEnable, protocolVersion, groupName, userInfos, aclIps, trapEnable, targetHosts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteTemplateSnmpDto {\n");
    
    sb.append("    snmpEnable: ").append(toIndentedString(snmpEnable)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    userInfos: ").append(toIndentedString(userInfos)).append("\n");
    sb.append("    aclIps: ").append(toIndentedString(aclIps)).append("\n");
    sb.append("    trapEnable: ").append(toIndentedString(trapEnable)).append("\n");
    sb.append("    targetHosts: ").append(toIndentedString(targetHosts)).append("\n");
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

