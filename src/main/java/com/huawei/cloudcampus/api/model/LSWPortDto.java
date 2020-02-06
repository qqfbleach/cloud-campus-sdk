/*
 * 交换机端口配置
 * LSW端口配置北向接口，主要特性： · 查询交换机所有接口信息 · 修改交换机以太接口配置 · 创建交换机Eth-Trunk接口 · 修改交换机Eth-Trunk接口 · 删除交换机Eth-Trunk接口 
 *
 * OpenAPI spec version: 1.4.2
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
 * 交换机端口配置基本数据结构。
 */
@ApiModel(description = "交换机端口配置基本数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:28.021+08:00")
public class LSWPortDto {
  @SerializedName("status")
  private Boolean status = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("linkType")
  private String linkType = null;

  @SerializedName("defaultVlan")
  private Integer defaultVlan = null;

  @SerializedName("allowPassVlan")
  private String allowPassVlan = null;

  @SerializedName("dhcpSnooping")
  private Boolean dhcpSnooping = null;

  @SerializedName("dhcpSnoopingTrusted")
  private Boolean dhcpSnoopingTrusted = null;

  @SerializedName("ndSnooping")
  private Boolean ndSnooping = null;

  @SerializedName("ndSnoopingTrusted")
  private Boolean ndSnoopingTrusted = null;

  @SerializedName("portIsolation")
  private Boolean portIsolation = null;

  @SerializedName("stp")
  private Boolean stp = null;

  @SerializedName("stpEdgedport")
  private String stpEdgedport = null;

  @SerializedName("enableRelay")
  private Boolean enableRelay = null;

  @SerializedName("enableMadDetection")
  private Boolean enableMadDetection = null;

  @SerializedName("domainId")
  private Integer domainId = null;

  @SerializedName("naMsgCheck")
  private Boolean naMsgCheck = null;

  @SerializedName("nsMsgCheck")
  private Boolean nsMsgCheck = null;

  @SerializedName("rsMsgCheck")
  private Boolean rsMsgCheck = null;

  @SerializedName("ipsgCheck")
  private Boolean ipsgCheck = null;

  @SerializedName("daiCheck")
  private Boolean daiCheck = null;

  @SerializedName("ipSubnetVlanEnable")
  private Boolean ipSubnetVlanEnable = null;

  public LSWPortDto status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * 接口管理状态（true为undo shutdown，false为shutdown）。
   * return status
  **/
  @ApiModelProperty(value = "接口管理状态（true为undo shutdown，false为shutdown）。")
  public Boolean getStatus() {
    return status;
  }

   /**
   * 接口管理状态（true为undo shutdown，false为shutdown）。
   * Param status
  **/
  public void setStatus(Boolean status) {
    this.status = status;
  }

  public LSWPortDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 接口描述。
   * return description
  **/
  @ApiModelProperty(value = "接口描述。")
  public String getDescription() {
    return description;
  }

   /**
   * 接口描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public LSWPortDto linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * 链路类型，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：access；trunk。
   * return linkType
  **/
  @ApiModelProperty(value = "链路类型，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：access；trunk。")
  public String getLinkType() {
    return linkType;
  }

   /**
   * 链路类型，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：access；trunk。
   * Param linkType
  **/
  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public LSWPortDto defaultVlan(Integer defaultVlan) {
    this.defaultVlan = defaultVlan;
    return this;
  }

   /**
   * access类型下缺省VLAN；或trunk类型下pvid。若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * minimum: 1
   * maximum: 4094
   * return defaultVlan
  **/
  @ApiModelProperty(value = "access类型下缺省VLAN；或trunk类型下pvid。若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Integer getDefaultVlan() {
    return defaultVlan;
  }

   /**
   * access类型下缺省VLAN；或trunk类型下pvid。若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * minimum: 1
   * maximum: 4094
   * Param defaultVlan
  **/
  public void setDefaultVlan(Integer defaultVlan) {
    this.defaultVlan = defaultVlan;
  }

  public LSWPortDto allowPassVlan(String allowPassVlan) {
    this.allowPassVlan = allowPassVlan;
    return this;
  }

   /**
   * trunk类型下允许通过VLAN，接口为trunk类型时必填。
   * return allowPassVlan
  **/
  @ApiModelProperty(value = "trunk类型下允许通过VLAN，接口为trunk类型时必填。")
  public String getAllowPassVlan() {
    return allowPassVlan;
  }

   /**
   * trunk类型下允许通过VLAN，接口为trunk类型时必填。
   * Param allowPassVlan
  **/
  public void setAllowPassVlan(String allowPassVlan) {
    this.allowPassVlan = allowPassVlan;
  }

  public LSWPortDto dhcpSnooping(Boolean dhcpSnooping) {
    this.dhcpSnooping = dhcpSnooping;
    return this;
  }

   /**
   * DHCP Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return dhcpSnooping
  **/
  @ApiModelProperty(value = "DHCP Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getDhcpSnooping() {
    return dhcpSnooping;
  }

   /**
   * DHCP Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param dhcpSnooping
  **/
  public void setDhcpSnooping(Boolean dhcpSnooping) {
    this.dhcpSnooping = dhcpSnooping;
  }

  public LSWPortDto dhcpSnoopingTrusted(Boolean dhcpSnoopingTrusted) {
    this.dhcpSnoopingTrusted = dhcpSnoopingTrusted;
    return this;
  }

   /**
   * 配置接口为DHCP Snooping信任状态，默认为非信任状态。
   * return dhcpSnoopingTrusted
  **/
  @ApiModelProperty(value = "配置接口为DHCP Snooping信任状态，默认为非信任状态。")
  public Boolean getDhcpSnoopingTrusted() {
    return dhcpSnoopingTrusted;
  }

   /**
   * 配置接口为DHCP Snooping信任状态，默认为非信任状态。
   * Param dhcpSnoopingTrusted
  **/
  public void setDhcpSnoopingTrusted(Boolean dhcpSnoopingTrusted) {
    this.dhcpSnoopingTrusted = dhcpSnoopingTrusted;
  }

  public LSWPortDto ndSnooping(Boolean ndSnooping) {
    this.ndSnooping = ndSnooping;
    return this;
  }

   /**
   * ND Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return ndSnooping
  **/
  @ApiModelProperty(value = "ND Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getNdSnooping() {
    return ndSnooping;
  }

   /**
   * ND Snooping使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param ndSnooping
  **/
  public void setNdSnooping(Boolean ndSnooping) {
    this.ndSnooping = ndSnooping;
  }

  public LSWPortDto ndSnoopingTrusted(Boolean ndSnoopingTrusted) {
    this.ndSnoopingTrusted = ndSnoopingTrusted;
    return this;
  }

   /**
   * 配置接口为ND Snooping信任状态，默认为非信任状态。
   * return ndSnoopingTrusted
  **/
  @ApiModelProperty(value = "配置接口为ND Snooping信任状态，默认为非信任状态。")
  public Boolean getNdSnoopingTrusted() {
    return ndSnoopingTrusted;
  }

   /**
   * 配置接口为ND Snooping信任状态，默认为非信任状态。
   * Param ndSnoopingTrusted
  **/
  public void setNdSnoopingTrusted(Boolean ndSnoopingTrusted) {
    this.ndSnoopingTrusted = ndSnoopingTrusted;
  }

  public LSWPortDto portIsolation(Boolean portIsolation) {
    this.portIsolation = portIsolation;
    return this;
  }

   /**
   * 端口隔离使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return portIsolation
  **/
  @ApiModelProperty(value = "端口隔离使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getPortIsolation() {
    return portIsolation;
  }

   /**
   * 端口隔离使能，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param portIsolation
  **/
  public void setPortIsolation(Boolean portIsolation) {
    this.portIsolation = portIsolation;
  }

  public LSWPortDto stp(Boolean stp) {
    this.stp = stp;
    return this;
  }

   /**
   * STP功能状态，取值：true（使能）；false（未使能）。当STP为false时，stpEdgedport自动赋值为normal，传入其他参数无效。
   * return stp
  **/
  @ApiModelProperty(value = "STP功能状态，取值：true（使能）；false（未使能）。当STP为false时，stpEdgedport自动赋值为normal，传入其他参数无效。")
  public Boolean getStp() {
    return stp;
  }

   /**
   * STP功能状态，取值：true（使能）；false（未使能）。当STP为false时，stpEdgedport自动赋值为normal，传入其他参数无效。
   * Param stp
  **/
  public void setStp(Boolean stp) {
    this.stp = stp;
  }

  public LSWPortDto stpEdgedport(String stpEdgedport) {
    this.stpEdgedport = stpEdgedport;
    return this;
  }

   /**
   * STP边缘端口状态，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：enable（使能）；normal（遵从全局状态）；disable（未使能）。
   * return stpEdgedport
  **/
  @ApiModelProperty(value = "STP边缘端口状态，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：enable（使能）；normal（遵从全局状态）；disable（未使能）。")
  public String getStpEdgedport() {
    return stpEdgedport;
  }

   /**
   * STP边缘端口状态，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。取值：enable（使能）；normal（遵从全局状态）；disable（未使能）。
   * Param stpEdgedport
  **/
  public void setStpEdgedport(String stpEdgedport) {
    this.stpEdgedport = stpEdgedport;
  }

  public LSWPortDto enableRelay(Boolean enableRelay) {
    this.enableRelay = enableRelay;
    return this;
  }

   /**
   * 堆叠多主检测场景下，设为检测代理设备。
   * return enableRelay
  **/
  @ApiModelProperty(value = "堆叠多主检测场景下，设为检测代理设备。")
  public Boolean getEnableRelay() {
    return enableRelay;
  }

   /**
   * 堆叠多主检测场景下，设为检测代理设备。
   * Param enableRelay
  **/
  public void setEnableRelay(Boolean enableRelay) {
    this.enableRelay = enableRelay;
  }

  public LSWPortDto enableMadDetection(Boolean enableMadDetection) {
    this.enableMadDetection = enableMadDetection;
    return this;
  }

   /**
   * 堆叠多主检测场景下，代理模式双主检测开关。
   * return enableMadDetection
  **/
  @ApiModelProperty(value = "堆叠多主检测场景下，代理模式双主检测开关。")
  public Boolean getEnableMadDetection() {
    return enableMadDetection;
  }

   /**
   * 堆叠多主检测场景下，代理模式双主检测开关。
   * Param enableMadDetection
  **/
  public void setEnableMadDetection(Boolean enableMadDetection) {
    this.enableMadDetection = enableMadDetection;
  }

  public LSWPortDto domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * 堆叠多主检测场景下，堆叠域编号，两个堆叠互相检测时，堆叠域编号需不同。
   * minimum: 0
   * maximum: 255
   * return domainId
  **/
  @ApiModelProperty(value = "堆叠多主检测场景下，堆叠域编号，两个堆叠互相检测时，堆叠域编号需不同。")
  public Integer getDomainId() {
    return domainId;
  }

   /**
   * 堆叠多主检测场景下，堆叠域编号，两个堆叠互相检测时，堆叠域编号需不同。
   * minimum: 0
   * maximum: 255
   * Param domainId
  **/
  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public LSWPortDto naMsgCheck(Boolean naMsgCheck) {
    this.naMsgCheck = naMsgCheck;
    return this;
  }

   /**
   * NA报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return naMsgCheck
  **/
  @ApiModelProperty(value = "NA报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getNaMsgCheck() {
    return naMsgCheck;
  }

   /**
   * NA报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param naMsgCheck
  **/
  public void setNaMsgCheck(Boolean naMsgCheck) {
    this.naMsgCheck = naMsgCheck;
  }

  public LSWPortDto nsMsgCheck(Boolean nsMsgCheck) {
    this.nsMsgCheck = nsMsgCheck;
    return this;
  }

   /**
   * NS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return nsMsgCheck
  **/
  @ApiModelProperty(value = "NS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getNsMsgCheck() {
    return nsMsgCheck;
  }

   /**
   * NS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param nsMsgCheck
  **/
  public void setNsMsgCheck(Boolean nsMsgCheck) {
    this.nsMsgCheck = nsMsgCheck;
  }

  public LSWPortDto rsMsgCheck(Boolean rsMsgCheck) {
    this.rsMsgCheck = rsMsgCheck;
    return this;
  }

   /**
   * RS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * return rsMsgCheck
  **/
  @ApiModelProperty(value = "RS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。")
  public Boolean getRsMsgCheck() {
    return rsMsgCheck;
  }

   /**
   * RS报文检测，若当前是以太接口，其加入Eth-Trunk后不能配置此参数。
   * Param rsMsgCheck
  **/
  public void setRsMsgCheck(Boolean rsMsgCheck) {
    this.rsMsgCheck = rsMsgCheck;
  }

  public LSWPortDto ipsgCheck(Boolean ipsgCheck) {
    this.ipsgCheck = ipsgCheck;
    return this;
  }

   /**
   * IPSG检测使能开关。
   * return ipsgCheck
  **/
  @ApiModelProperty(value = "IPSG检测使能开关。")
  public Boolean getIpsgCheck() {
    return ipsgCheck;
  }

   /**
   * IPSG检测使能开关。
   * Param ipsgCheck
  **/
  public void setIpsgCheck(Boolean ipsgCheck) {
    this.ipsgCheck = ipsgCheck;
  }

  public LSWPortDto daiCheck(Boolean daiCheck) {
    this.daiCheck = daiCheck;
    return this;
  }

   /**
   * DAI检测使能开关。
   * return daiCheck
  **/
  @ApiModelProperty(value = "DAI检测使能开关。")
  public Boolean getDaiCheck() {
    return daiCheck;
  }

   /**
   * DAI检测使能开关。
   * Param daiCheck
  **/
  public void setDaiCheck(Boolean daiCheck) {
    this.daiCheck = daiCheck;
  }

  public LSWPortDto ipSubnetVlanEnable(Boolean ipSubnetVlanEnable) {
    this.ipSubnetVlanEnable = ipSubnetVlanEnable;
    return this;
  }

   /**
   * IP子网划分Vlan开关。
   * return ipSubnetVlanEnable
  **/
  @ApiModelProperty(value = "IP子网划分Vlan开关。")
  public Boolean getIpSubnetVlanEnable() {
    return ipSubnetVlanEnable;
  }

   /**
   * IP子网划分Vlan开关。
   * Param ipSubnetVlanEnable
  **/
  public void setIpSubnetVlanEnable(Boolean ipSubnetVlanEnable) {
    this.ipSubnetVlanEnable = ipSubnetVlanEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LSWPortDto lsWPortDto = (LSWPortDto) o;
    return Objects.equals(this.status, lsWPortDto.status) &&
        Objects.equals(this.description, lsWPortDto.description) &&
        Objects.equals(this.linkType, lsWPortDto.linkType) &&
        Objects.equals(this.defaultVlan, lsWPortDto.defaultVlan) &&
        Objects.equals(this.allowPassVlan, lsWPortDto.allowPassVlan) &&
        Objects.equals(this.dhcpSnooping, lsWPortDto.dhcpSnooping) &&
        Objects.equals(this.dhcpSnoopingTrusted, lsWPortDto.dhcpSnoopingTrusted) &&
        Objects.equals(this.ndSnooping, lsWPortDto.ndSnooping) &&
        Objects.equals(this.ndSnoopingTrusted, lsWPortDto.ndSnoopingTrusted) &&
        Objects.equals(this.portIsolation, lsWPortDto.portIsolation) &&
        Objects.equals(this.stp, lsWPortDto.stp) &&
        Objects.equals(this.stpEdgedport, lsWPortDto.stpEdgedport) &&
        Objects.equals(this.enableRelay, lsWPortDto.enableRelay) &&
        Objects.equals(this.enableMadDetection, lsWPortDto.enableMadDetection) &&
        Objects.equals(this.domainId, lsWPortDto.domainId) &&
        Objects.equals(this.naMsgCheck, lsWPortDto.naMsgCheck) &&
        Objects.equals(this.nsMsgCheck, lsWPortDto.nsMsgCheck) &&
        Objects.equals(this.rsMsgCheck, lsWPortDto.rsMsgCheck) &&
        Objects.equals(this.ipsgCheck, lsWPortDto.ipsgCheck) &&
        Objects.equals(this.daiCheck, lsWPortDto.daiCheck) &&
        Objects.equals(this.ipSubnetVlanEnable, lsWPortDto.ipSubnetVlanEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, linkType, defaultVlan, allowPassVlan, dhcpSnooping, dhcpSnoopingTrusted, ndSnooping, ndSnoopingTrusted, portIsolation, stp, stpEdgedport, enableRelay, enableMadDetection, domainId, naMsgCheck, nsMsgCheck, rsMsgCheck, ipsgCheck, daiCheck, ipSubnetVlanEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LSWPortDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    defaultVlan: ").append(toIndentedString(defaultVlan)).append("\n");
    sb.append("    allowPassVlan: ").append(toIndentedString(allowPassVlan)).append("\n");
    sb.append("    dhcpSnooping: ").append(toIndentedString(dhcpSnooping)).append("\n");
    sb.append("    dhcpSnoopingTrusted: ").append(toIndentedString(dhcpSnoopingTrusted)).append("\n");
    sb.append("    ndSnooping: ").append(toIndentedString(ndSnooping)).append("\n");
    sb.append("    ndSnoopingTrusted: ").append(toIndentedString(ndSnoopingTrusted)).append("\n");
    sb.append("    portIsolation: ").append(toIndentedString(portIsolation)).append("\n");
    sb.append("    stp: ").append(toIndentedString(stp)).append("\n");
    sb.append("    stpEdgedport: ").append(toIndentedString(stpEdgedport)).append("\n");
    sb.append("    enableRelay: ").append(toIndentedString(enableRelay)).append("\n");
    sb.append("    enableMadDetection: ").append(toIndentedString(enableMadDetection)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    naMsgCheck: ").append(toIndentedString(naMsgCheck)).append("\n");
    sb.append("    nsMsgCheck: ").append(toIndentedString(nsMsgCheck)).append("\n");
    sb.append("    rsMsgCheck: ").append(toIndentedString(rsMsgCheck)).append("\n");
    sb.append("    ipsgCheck: ").append(toIndentedString(ipsgCheck)).append("\n");
    sb.append("    daiCheck: ").append(toIndentedString(daiCheck)).append("\n");
    sb.append("    ipSubnetVlanEnable: ").append(toIndentedString(ipSubnetVlanEnable)).append("\n");
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

