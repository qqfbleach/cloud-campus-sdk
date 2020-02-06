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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EthTrunkInterfacesDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:19.739+08:00")
public class EthTrunkInterfacesDto {
  @SerializedName("ifId")
  private Integer ifId = null;

  @SerializedName("ifName")
  private String ifName = null;

  @SerializedName("remPrio")
  private Integer remPrio = null;

  @SerializedName("remId")
  private String remId = null;

  @SerializedName("ifOpStatus")
  private String ifOpStatus = null;

  @SerializedName("ifWeight")
  private Integer ifWeight = null;

  public EthTrunkInterfacesDto ifId(Integer ifId) {
    this.ifId = ifId;
    return this;
  }

   /**
   * 接口ID。
   * return ifId
  **/
  @ApiModelProperty(value = "接口ID。")
  public Integer getIfId() {
    return ifId;
  }

   /**
   * 接口ID。
   * Param ifId
  **/
  public void setIfId(Integer ifId) {
    this.ifId = ifId;
  }

  public EthTrunkInterfacesDto ifName(String ifName) {
    this.ifName = ifName;
    return this;
  }

   /**
   * 接口名称。
   * return ifName
  **/
  @ApiModelProperty(value = "接口名称。")
  public String getIfName() {
    return ifName;
  }

   /**
   * 接口名称。
   * Param ifName
  **/
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  public EthTrunkInterfacesDto remPrio(Integer remPrio) {
    this.remPrio = remPrio;
    return this;
  }

   /**
   * 远端系统优先级。
   * return remPrio
  **/
  @ApiModelProperty(value = "远端系统优先级。")
  public Integer getRemPrio() {
    return remPrio;
  }

   /**
   * 远端系统优先级。
   * Param remPrio
  **/
  public void setRemPrio(Integer remPrio) {
    this.remPrio = remPrio;
  }

  public EthTrunkInterfacesDto remId(String remId) {
    this.remId = remId;
    return this;
  }

   /**
   * 远端系统ID。
   * return remId
  **/
  @ApiModelProperty(value = "远端系统ID。")
  public String getRemId() {
    return remId;
  }

   /**
   * 远端系统ID。
   * Param remId
  **/
  public void setRemId(String remId) {
    this.remId = remId;
  }

  public EthTrunkInterfacesDto ifOpStatus(String ifOpStatus) {
    this.ifOpStatus = ifOpStatus;
    return this;
  }

   /**
   * 接口操作状态：up、down。
   * return ifOpStatus
  **/
  @ApiModelProperty(value = "接口操作状态：up、down。")
  public String getIfOpStatus() {
    return ifOpStatus;
  }

   /**
   * 接口操作状态：up、down。
   * Param ifOpStatus
  **/
  public void setIfOpStatus(String ifOpStatus) {
    this.ifOpStatus = ifOpStatus;
  }

  public EthTrunkInterfacesDto ifWeight(Integer ifWeight) {
    this.ifWeight = ifWeight;
    return this;
  }

   /**
   * 接口负载的权重。
   * return ifWeight
  **/
  @ApiModelProperty(value = "接口负载的权重。")
  public Integer getIfWeight() {
    return ifWeight;
  }

   /**
   * 接口负载的权重。
   * Param ifWeight
  **/
  public void setIfWeight(Integer ifWeight) {
    this.ifWeight = ifWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthTrunkInterfacesDto ethTrunkInterfacesDto = (EthTrunkInterfacesDto) o;
    return Objects.equals(this.ifId, ethTrunkInterfacesDto.ifId) &&
        Objects.equals(this.ifName, ethTrunkInterfacesDto.ifName) &&
        Objects.equals(this.remPrio, ethTrunkInterfacesDto.remPrio) &&
        Objects.equals(this.remId, ethTrunkInterfacesDto.remId) &&
        Objects.equals(this.ifOpStatus, ethTrunkInterfacesDto.ifOpStatus) &&
        Objects.equals(this.ifWeight, ethTrunkInterfacesDto.ifWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifId, ifName, remPrio, remId, ifOpStatus, ifWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthTrunkInterfacesDto {\n");
    
    sb.append("    ifId: ").append(toIndentedString(ifId)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    remPrio: ").append(toIndentedString(remPrio)).append("\n");
    sb.append("    remId: ").append(toIndentedString(remId)).append("\n");
    sb.append("    ifOpStatus: ").append(toIndentedString(ifOpStatus)).append("\n");
    sb.append("    ifWeight: ").append(toIndentedString(ifWeight)).append("\n");
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

