/*
 * 拓扑管理
 * 拓扑管理第三方北向接口。 1、查询LACP LAG信息 2、查询LLDP信息 
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
import com.huawei.cloudcampus.api.model.EthTrunkInterfacesDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EthTrunkDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:19.739+08:00")
public class EthTrunkDto {
  @SerializedName("lagId")
  private Integer lagId = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("leastActive")
  private Integer leastActive = null;

  @SerializedName("maxActive")
  private Integer maxActive = null;

  @SerializedName("opStatus")
  private String opStatus = null;

  @SerializedName("portCount")
  private Integer portCount = null;

  @SerializedName("sysPrio")
  private Integer sysPrio = null;

  @SerializedName("sysId")
  private String sysId = null;

  @SerializedName("interfaces")
  private List<EthTrunkInterfacesDto> interfaces = null;

  public EthTrunkDto lagId(Integer lagId) {
    this.lagId = lagId;
    return this;
  }

   /**
   * LAG ID。
   * return lagId
  **/
  @ApiModelProperty(value = "LAG ID。")
  public Integer getLagId() {
    return lagId;
  }

   /**
   * LAG ID。
   * Param lagId
  **/
  public void setLagId(Integer lagId) {
    this.lagId = lagId;
  }

  public EthTrunkDto mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * trunk模式：lacp、manual。
   * return mode
  **/
  @ApiModelProperty(value = "trunk模式：lacp、manual。")
  public String getMode() {
    return mode;
  }

   /**
   * trunk模式：lacp、manual。
   * Param mode
  **/
  public void setMode(String mode) {
    this.mode = mode;
  }

  public EthTrunkDto hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * 端口负载均衡的hash算法：dst-ip、dst-mac、src-ip、src-mac、src-dst-ip、src-dst-mac、enhanced、diffluence。
   * return hash
  **/
  @ApiModelProperty(value = "端口负载均衡的hash算法：dst-ip、dst-mac、src-ip、src-mac、src-dst-ip、src-dst-mac、enhanced、diffluence。")
  public String getHash() {
    return hash;
  }

   /**
   * 端口负载均衡的hash算法：dst-ip、dst-mac、src-ip、src-mac、src-dst-ip、src-dst-mac、enhanced、diffluence。
   * Param hash
  **/
  public void setHash(String hash) {
    this.hash = hash;
  }

  public EthTrunkDto leastActive(Integer leastActive) {
    this.leastActive = leastActive;
    return this;
  }

   /**
   * Eth-trunk中活动链路数量的下限。
   * return leastActive
  **/
  @ApiModelProperty(value = "Eth-trunk中活动链路数量的下限。")
  public Integer getLeastActive() {
    return leastActive;
  }

   /**
   * Eth-trunk中活动链路数量的下限。
   * Param leastActive
  **/
  public void setLeastActive(Integer leastActive) {
    this.leastActive = leastActive;
  }

  public EthTrunkDto maxActive(Integer maxActive) {
    this.maxActive = maxActive;
    return this;
  }

   /**
   * 最大激活链路数。
   * return maxActive
  **/
  @ApiModelProperty(value = "最大激活链路数。")
  public Integer getMaxActive() {
    return maxActive;
  }

   /**
   * 最大激活链路数。
   * Param maxActive
  **/
  public void setMaxActive(Integer maxActive) {
    this.maxActive = maxActive;
  }

  public EthTrunkDto opStatus(String opStatus) {
    this.opStatus = opStatus;
    return this;
  }

   /**
   * 操作状态：up、down。
   * return opStatus
  **/
  @ApiModelProperty(value = "操作状态：up、down。")
  public String getOpStatus() {
    return opStatus;
  }

   /**
   * 操作状态：up、down。
   * Param opStatus
  **/
  public void setOpStatus(String opStatus) {
    this.opStatus = opStatus;
  }

  public EthTrunkDto portCount(Integer portCount) {
    this.portCount = portCount;
    return this;
  }

   /**
   * Eth-trunk上行端口数量。
   * return portCount
  **/
  @ApiModelProperty(value = "Eth-trunk上行端口数量。")
  public Integer getPortCount() {
    return portCount;
  }

   /**
   * Eth-trunk上行端口数量。
   * Param portCount
  **/
  public void setPortCount(Integer portCount) {
    this.portCount = portCount;
  }

  public EthTrunkDto sysPrio(Integer sysPrio) {
    this.sysPrio = sysPrio;
    return this;
  }

   /**
   * 本地系统优先级。
   * return sysPrio
  **/
  @ApiModelProperty(value = "本地系统优先级。")
  public Integer getSysPrio() {
    return sysPrio;
  }

   /**
   * 本地系统优先级。
   * Param sysPrio
  **/
  public void setSysPrio(Integer sysPrio) {
    this.sysPrio = sysPrio;
  }

  public EthTrunkDto sysId(String sysId) {
    this.sysId = sysId;
    return this;
  }

   /**
   * 本地系统ID。
   * return sysId
  **/
  @ApiModelProperty(value = "本地系统ID。")
  public String getSysId() {
    return sysId;
  }

   /**
   * 本地系统ID。
   * Param sysId
  **/
  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public EthTrunkDto interfaces(List<EthTrunkInterfacesDto> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  public EthTrunkDto addInterfacesItem(EthTrunkInterfacesDto interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<EthTrunkInterfacesDto>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }

   /**
   * 接口列表。
   * return interfaces
  **/
  @ApiModelProperty(value = "接口列表。")
  public List<EthTrunkInterfacesDto> getInterfaces() {
    return interfaces;
  }

   /**
   * 接口列表。
   * Param interfaces
  **/
  public void setInterfaces(List<EthTrunkInterfacesDto> interfaces) {
    this.interfaces = interfaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthTrunkDto ethTrunkDto = (EthTrunkDto) o;
    return Objects.equals(this.lagId, ethTrunkDto.lagId) &&
        Objects.equals(this.mode, ethTrunkDto.mode) &&
        Objects.equals(this.hash, ethTrunkDto.hash) &&
        Objects.equals(this.leastActive, ethTrunkDto.leastActive) &&
        Objects.equals(this.maxActive, ethTrunkDto.maxActive) &&
        Objects.equals(this.opStatus, ethTrunkDto.opStatus) &&
        Objects.equals(this.portCount, ethTrunkDto.portCount) &&
        Objects.equals(this.sysPrio, ethTrunkDto.sysPrio) &&
        Objects.equals(this.sysId, ethTrunkDto.sysId) &&
        Objects.equals(this.interfaces, ethTrunkDto.interfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagId, mode, hash, leastActive, maxActive, opStatus, portCount, sysPrio, sysId, interfaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthTrunkDto {\n");
    
    sb.append("    lagId: ").append(toIndentedString(lagId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    leastActive: ").append(toIndentedString(leastActive)).append("\n");
    sb.append("    maxActive: ").append(toIndentedString(maxActive)).append("\n");
    sb.append("    opStatus: ").append(toIndentedString(opStatus)).append("\n");
    sb.append("    portCount: ").append(toIndentedString(portCount)).append("\n");
    sb.append("    sysPrio: ").append(toIndentedString(sysPrio)).append("\n");
    sb.append("    sysId: ").append(toIndentedString(sysId)).append("\n");
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
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

