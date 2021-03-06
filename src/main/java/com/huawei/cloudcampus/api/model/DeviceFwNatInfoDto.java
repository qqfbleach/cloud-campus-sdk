/*
 * 防火墙设备NAT配置
 * 防火墙设备NAT配置第三方接口。
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
import com.huawei.cloudcampus.api.model.ServiceListInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceFwNatInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:35.290+08:00")
public class DeviceFwNatInfoDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("conversionMode")
  private Integer conversionMode = null;

  @SerializedName("destinationMode")
  private String destinationMode = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("oldSourceIp")
  private String oldSourceIp = null;

  @SerializedName("oldDestinationIp")
  private String oldDestinationIp = null;

  @SerializedName("sourceConvert")
  private Integer sourceConvert = null;

  @SerializedName("newSourceIpGroup")
  private List<String> newSourceIpGroup = null;

  @SerializedName("newDestinationIpGroup")
  private List<String> newDestinationIpGroup = null;

  @SerializedName("destinationPort")
  private String destinationPort = null;

  @SerializedName("serviceList")
  private List<ServiceListInfoDto> serviceList = null;

  public DeviceFwNatInfoDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * NAT策略ID。创建时不能填写，修改时必须填写。
   * return id
  **/
  @ApiModelProperty(value = "NAT策略ID。创建时不能填写，修改时必须填写。")
  public String getId() {
    return id;
  }

   /**
   * NAT策略ID。创建时不能填写，修改时必须填写。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public DeviceFwNatInfoDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 名称，不能包含?、双引号和空格。
   * return name
  **/
  @ApiModelProperty(value = "名称，不能包含?、双引号和空格。")
  public String getName() {
    return name;
  }

   /**
   * 名称，不能包含?、双引号和空格。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public DeviceFwNatInfoDto description(String description) {
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

  public DeviceFwNatInfoDto conversionMode(Integer conversionMode) {
    this.conversionMode = conversionMode;
    return this;
  }

   /**
   * 转换模式（不允许修改）。取值范围：1---仅转换源地址。2---仅转换目的地址。3---源地址和目的地址同时转换。
   * minimum: 1
   * maximum: 3
   * return conversionMode
  **/
  @ApiModelProperty(value = "转换模式（不允许修改）。取值范围：1---仅转换源地址。2---仅转换目的地址。3---源地址和目的地址同时转换。")
  public Integer getConversionMode() {
    return conversionMode;
  }

   /**
   * 转换模式（不允许修改）。取值范围：1---仅转换源地址。2---仅转换目的地址。3---源地址和目的地址同时转换。
   * minimum: 1
   * maximum: 3
   * Param conversionMode
  **/
  public void setConversionMode(Integer conversionMode) {
    this.conversionMode = conversionMode;
  }

  public DeviceFwNatInfoDto destinationMode(String destinationMode) {
    this.destinationMode = destinationMode;
    return this;
  }

   /**
   * 目的地址转换方式。取值范围：address-to-address---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）数量一致。port-to-address---转换前目的地址（oldDestinationIp）为单个ip，转换后目的端口（destinationPort）为单个端口，转换前服务目的端口（destPort）与转换后目的地址（newDestinationIpGroup）数量一致。port-to-port---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）都为单个ip，转换前服务目的端口（destPort）和转换后目的端口（destinationPort）数量保持一致。address-to-port---转换前目的地址（oldDestinationIp）和转换后目的端口（destinationPort）数量一致，转换前服务目的端口（destPort）为单个端口，转换后目的地址（newDestinationIpGroup）为单个ip。
   * return destinationMode
  **/
  @ApiModelProperty(value = "目的地址转换方式。取值范围：address-to-address---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）数量一致。port-to-address---转换前目的地址（oldDestinationIp）为单个ip，转换后目的端口（destinationPort）为单个端口，转换前服务目的端口（destPort）与转换后目的地址（newDestinationIpGroup）数量一致。port-to-port---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）都为单个ip，转换前服务目的端口（destPort）和转换后目的端口（destinationPort）数量保持一致。address-to-port---转换前目的地址（oldDestinationIp）和转换后目的端口（destinationPort）数量一致，转换前服务目的端口（destPort）为单个端口，转换后目的地址（newDestinationIpGroup）为单个ip。")
  public String getDestinationMode() {
    return destinationMode;
  }

   /**
   * 目的地址转换方式。取值范围：address-to-address---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）数量一致。port-to-address---转换前目的地址（oldDestinationIp）为单个ip，转换后目的端口（destinationPort）为单个端口，转换前服务目的端口（destPort）与转换后目的地址（newDestinationIpGroup）数量一致。port-to-port---转换前目的地址（oldDestinationIp）和转换后目的地址（newDestinationIpGroup）都为单个ip，转换前服务目的端口（destPort）和转换后目的端口（destinationPort）数量保持一致。address-to-port---转换前目的地址（oldDestinationIp）和转换后目的端口（destinationPort）数量一致，转换前服务目的端口（destPort）为单个端口，转换后目的地址（newDestinationIpGroup）为单个ip。
   * Param destinationMode
  **/
  public void setDestinationMode(String destinationMode) {
    this.destinationMode = destinationMode;
  }

  public DeviceFwNatInfoDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 优先级。取值越小优先等级越高。
   * minimum: 1
   * maximum: 100
   * return priority
  **/
  @ApiModelProperty(value = "优先级。取值越小优先等级越高。")
  public Integer getPriority() {
    return priority;
  }

   /**
   * 优先级。取值越小优先等级越高。
   * minimum: 1
   * maximum: 100
   * Param priority
  **/
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public DeviceFwNatInfoDto oldSourceIp(String oldSourceIp) {
    this.oldSourceIp = oldSourceIp;
    return this;
  }

   /**
   * 转换前源地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或10.2.0.6/24。
   * return oldSourceIp
  **/
  @ApiModelProperty(value = "转换前源地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或10.2.0.6/24。")
  public String getOldSourceIp() {
    return oldSourceIp;
  }

   /**
   * 转换前源地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或10.2.0.6/24。
   * Param oldSourceIp
  **/
  public void setOldSourceIp(String oldSourceIp) {
    this.oldSourceIp = oldSourceIp;
  }

  public DeviceFwNatInfoDto oldDestinationIp(String oldDestinationIp) {
    this.oldDestinationIp = oldDestinationIp;
    return this;
  }

   /**
   * 转换前目的地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或1.1.1.10。
   * return oldDestinationIp
  **/
  @ApiModelProperty(value = "转换前目的地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或1.1.1.10。")
  public String getOldDestinationIp() {
    return oldDestinationIp;
  }

   /**
   * 转换前目的地址。转换模式（conversionMode）为1或3时必填，两种形式：1.1.1.1-1.1.1.2或1.1.1.10。
   * Param oldDestinationIp
  **/
  public void setOldDestinationIp(String oldDestinationIp) {
    this.oldDestinationIp = oldDestinationIp;
  }

  public DeviceFwNatInfoDto sourceConvert(Integer sourceConvert) {
    this.sourceConvert = sourceConvert;
    return this;
  }

   /**
   * 源地址转换为。转换模式（conversionMode）为1或3时必填，取值范围：0---出接口地址。1---地址池中地址。
   * minimum: 0
   * maximum: 1
   * return sourceConvert
  **/
  @ApiModelProperty(value = "源地址转换为。转换模式（conversionMode）为1或3时必填，取值范围：0---出接口地址。1---地址池中地址。")
  public Integer getSourceConvert() {
    return sourceConvert;
  }

   /**
   * 源地址转换为。转换模式（conversionMode）为1或3时必填，取值范围：0---出接口地址。1---地址池中地址。
   * minimum: 0
   * maximum: 1
   * Param sourceConvert
  **/
  public void setSourceConvert(Integer sourceConvert) {
    this.sourceConvert = sourceConvert;
  }

  public DeviceFwNatInfoDto newSourceIpGroup(List<String> newSourceIpGroup) {
    this.newSourceIpGroup = newSourceIpGroup;
    return this;
  }

  public DeviceFwNatInfoDto addNewSourceIpGroupItem(String newSourceIpGroupItem) {
    if (this.newSourceIpGroup == null) {
      this.newSourceIpGroup = new ArrayList<String>();
    }
    this.newSourceIpGroup.add(newSourceIpGroupItem);
    return this;
  }

   /**
   * 转换后源地址池列表。转换模式（conversionMode）为1或3，并且源地址转化为（sourceConvert）1时必填。
   * return newSourceIpGroup
  **/
  @ApiModelProperty(value = "转换后源地址池列表。转换模式（conversionMode）为1或3，并且源地址转化为（sourceConvert）1时必填。")
  public List<String> getNewSourceIpGroup() {
    return newSourceIpGroup;
  }

   /**
   * 转换后源地址池列表。转换模式（conversionMode）为1或3，并且源地址转化为（sourceConvert）1时必填。
   * Param newSourceIpGroup
  **/
  public void setNewSourceIpGroup(List<String> newSourceIpGroup) {
    this.newSourceIpGroup = newSourceIpGroup;
  }

  public DeviceFwNatInfoDto newDestinationIpGroup(List<String> newDestinationIpGroup) {
    this.newDestinationIpGroup = newDestinationIpGroup;
    return this;
  }

  public DeviceFwNatInfoDto addNewDestinationIpGroupItem(String newDestinationIpGroupItem) {
    if (this.newDestinationIpGroup == null) {
      this.newDestinationIpGroup = new ArrayList<String>();
    }
    this.newDestinationIpGroup.add(newDestinationIpGroupItem);
    return this;
  }

   /**
   * 转换后目的地址池列表。转换模式（conversionMode）为2或3时必填。
   * return newDestinationIpGroup
  **/
  @ApiModelProperty(value = "转换后目的地址池列表。转换模式（conversionMode）为2或3时必填。")
  public List<String> getNewDestinationIpGroup() {
    return newDestinationIpGroup;
  }

   /**
   * 转换后目的地址池列表。转换模式（conversionMode）为2或3时必填。
   * Param newDestinationIpGroup
  **/
  public void setNewDestinationIpGroup(List<String> newDestinationIpGroup) {
    this.newDestinationIpGroup = newDestinationIpGroup;
  }

  public DeviceFwNatInfoDto destinationPort(String destinationPort) {
    this.destinationPort = destinationPort;
    return this;
  }

   /**
   * 目的端口。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。
   * return destinationPort
  **/
  @ApiModelProperty(value = "目的端口。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。")
  public String getDestinationPort() {
    return destinationPort;
  }

   /**
   * 目的端口。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。
   * Param destinationPort
  **/
  public void setDestinationPort(String destinationPort) {
    this.destinationPort = destinationPort;
  }

  public DeviceFwNatInfoDto serviceList(List<ServiceListInfoDto> serviceList) {
    this.serviceList = serviceList;
    return this;
  }

  public DeviceFwNatInfoDto addServiceListItem(ServiceListInfoDto serviceListItem) {
    if (this.serviceList == null) {
      this.serviceList = new ArrayList<ServiceListInfoDto>();
    }
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * 服务配置信息列表。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。
   * return serviceList
  **/
  @ApiModelProperty(value = "服务配置信息列表。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。")
  public List<ServiceListInfoDto> getServiceList() {
    return serviceList;
  }

   /**
   * 服务配置信息列表。转换模式（conversionMode）为2或3，并且目的地址转换方式（destinationMode）为port-to-address或port-to-port或address-to-port时必填。
   * Param serviceList
  **/
  public void setServiceList(List<ServiceListInfoDto> serviceList) {
    this.serviceList = serviceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFwNatInfoDto deviceFwNatInfoDto = (DeviceFwNatInfoDto) o;
    return Objects.equals(this.id, deviceFwNatInfoDto.id) &&
        Objects.equals(this.name, deviceFwNatInfoDto.name) &&
        Objects.equals(this.description, deviceFwNatInfoDto.description) &&
        Objects.equals(this.conversionMode, deviceFwNatInfoDto.conversionMode) &&
        Objects.equals(this.destinationMode, deviceFwNatInfoDto.destinationMode) &&
        Objects.equals(this.priority, deviceFwNatInfoDto.priority) &&
        Objects.equals(this.oldSourceIp, deviceFwNatInfoDto.oldSourceIp) &&
        Objects.equals(this.oldDestinationIp, deviceFwNatInfoDto.oldDestinationIp) &&
        Objects.equals(this.sourceConvert, deviceFwNatInfoDto.sourceConvert) &&
        Objects.equals(this.newSourceIpGroup, deviceFwNatInfoDto.newSourceIpGroup) &&
        Objects.equals(this.newDestinationIpGroup, deviceFwNatInfoDto.newDestinationIpGroup) &&
        Objects.equals(this.destinationPort, deviceFwNatInfoDto.destinationPort) &&
        Objects.equals(this.serviceList, deviceFwNatInfoDto.serviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, conversionMode, destinationMode, priority, oldSourceIp, oldDestinationIp, sourceConvert, newSourceIpGroup, newDestinationIpGroup, destinationPort, serviceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFwNatInfoDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    conversionMode: ").append(toIndentedString(conversionMode)).append("\n");
    sb.append("    destinationMode: ").append(toIndentedString(destinationMode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    oldSourceIp: ").append(toIndentedString(oldSourceIp)).append("\n");
    sb.append("    oldDestinationIp: ").append(toIndentedString(oldDestinationIp)).append("\n");
    sb.append("    sourceConvert: ").append(toIndentedString(sourceConvert)).append("\n");
    sb.append("    newSourceIpGroup: ").append(toIndentedString(newSourceIpGroup)).append("\n");
    sb.append("    newDestinationIpGroup: ").append(toIndentedString(newDestinationIpGroup)).append("\n");
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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

