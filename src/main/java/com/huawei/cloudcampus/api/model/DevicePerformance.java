/*
 * 设备基础性能数据信息查询
 * · 查询设备网络速率历史数据 · 查询站点维度TopN设备或者全部设备的上行流量、下行流量 · 查询站点维度设备连接终端数历史数据 · 查询单设备连接终端数历史数据 · 查询租户维度下设备状态历史数据 · 查询基于站点的站点健康度和设备健康度 · 查询站点下TOP N SSID流量和最近在线用户数 
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
import java.math.BigDecimal;

/**
 * 设备信息。
 */
@ApiModel(description = "设备信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:47.511+08:00")
public class DevicePerformance {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("esn")
  private String esn = null;

  @SerializedName("deviceIp")
  private String deviceIp = null;

  @SerializedName("neType")
  private String neType = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("gisLon")
  private BigDecimal gisLon = null;

  @SerializedName("gisLat")
  private BigDecimal gisLat = null;

  @SerializedName("traffic")
  private BigDecimal traffic = null;

  @SerializedName("onlineUsers")
  private Integer onlineUsers = null;

  @SerializedName("cpuRate")
  private Integer cpuRate = null;

  @SerializedName("upwardSpeed")
  private BigDecimal upwardSpeed = null;

  @SerializedName("downwardSpeed")
  private BigDecimal downwardSpeed = null;

  @SerializedName("mac")
  private String mac = null;

  public DevicePerformance id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 设备标识。
   * return id
  **/
  @ApiModelProperty(value = "设备标识。")
  public String getId() {
    return id;
  }

   /**
   * 设备标识。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public DevicePerformance name(String name) {
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

  public DevicePerformance esn(String esn) {
    this.esn = esn;
    return this;
  }

   /**
   * 设备ESN号。
   * return esn
  **/
  @ApiModelProperty(value = "设备ESN号。")
  public String getEsn() {
    return esn;
  }

   /**
   * 设备ESN号。
   * Param esn
  **/
  public void setEsn(String esn) {
    this.esn = esn;
  }

  public DevicePerformance deviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
    return this;
  }

   /**
   * 设备IP。
   * return deviceIp
  **/
  @ApiModelProperty(value = "设备IP。")
  public String getDeviceIp() {
    return deviceIp;
  }

   /**
   * 设备IP。
   * Param deviceIp
  **/
  public void setDeviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
  }

  public DevicePerformance neType(String neType) {
    this.neType = neType;
    return this;
  }

   /**
   * 具体的设备款型。
   * return neType
  **/
  @ApiModelProperty(value = "具体的设备款型。")
  public String getNeType() {
    return neType;
  }

   /**
   * 具体的设备款型。
   * Param neType
  **/
  public void setNeType(String neType) {
    this.neType = neType;
  }

  public DevicePerformance status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 设备状态，0---在线、1---告警、3---离线、4---未注册。
   * minimum: 0
   * maximum: 10
   * return status
  **/
  @ApiModelProperty(value = "设备状态，0---在线、1---告警、3---离线、4---未注册。")
  public Integer getStatus() {
    return status;
  }

   /**
   * 设备状态，0---在线、1---告警、3---离线、4---未注册。
   * minimum: 0
   * maximum: 10
   * Param status
  **/
  public void setStatus(Integer status) {
    this.status = status;
  }

  public DevicePerformance gisLon(BigDecimal gisLon) {
    this.gisLon = gisLon;
    return this;
  }

   /**
   * 设备位置经度。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * return gisLon
  **/
  @ApiModelProperty(value = "设备位置经度。")
  public BigDecimal getGisLon() {
    return gisLon;
  }

   /**
   * 设备位置经度。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * Param gisLon
  **/
  public void setGisLon(BigDecimal gisLon) {
    this.gisLon = gisLon;
  }

  public DevicePerformance gisLat(BigDecimal gisLat) {
    this.gisLat = gisLat;
    return this;
  }

   /**
   * 设备位置纬度。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * return gisLat
  **/
  @ApiModelProperty(value = "设备位置纬度。")
  public BigDecimal getGisLat() {
    return gisLat;
  }

   /**
   * 设备位置纬度。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * Param gisLat
  **/
  public void setGisLat(BigDecimal gisLat) {
    this.gisLat = gisLat;
  }

  public DevicePerformance traffic(BigDecimal traffic) {
    this.traffic = traffic;
    return this;
  }

   /**
   * 总流量，单位：字节。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * return traffic
  **/
  @ApiModelProperty(value = "总流量，单位：字节。")
  public BigDecimal getTraffic() {
    return traffic;
  }

   /**
   * 总流量，单位：字节。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * Param traffic
  **/
  public void setTraffic(BigDecimal traffic) {
    this.traffic = traffic;
  }

  public DevicePerformance onlineUsers(Integer onlineUsers) {
    this.onlineUsers = onlineUsers;
    return this;
  }

   /**
   * 终端连接数。
   * minimum: 0
   * maximum: 2147483647
   * return onlineUsers
  **/
  @ApiModelProperty(value = "终端连接数。")
  public Integer getOnlineUsers() {
    return onlineUsers;
  }

   /**
   * 终端连接数。
   * minimum: 0
   * maximum: 2147483647
   * Param onlineUsers
  **/
  public void setOnlineUsers(Integer onlineUsers) {
    this.onlineUsers = onlineUsers;
  }

  public DevicePerformance cpuRate(Integer cpuRate) {
    this.cpuRate = cpuRate;
    return this;
  }

   /**
   * CPU利用率，单位：百分比。
   * minimum: 0
   * maximum: 100
   * return cpuRate
  **/
  @ApiModelProperty(value = "CPU利用率，单位：百分比。")
  public Integer getCpuRate() {
    return cpuRate;
  }

   /**
   * CPU利用率，单位：百分比。
   * minimum: 0
   * maximum: 100
   * Param cpuRate
  **/
  public void setCpuRate(Integer cpuRate) {
    this.cpuRate = cpuRate;
  }

  public DevicePerformance upwardSpeed(BigDecimal upwardSpeed) {
    this.upwardSpeed = upwardSpeed;
    return this;
  }

   /**
   * 上行速率，单位：bps。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * return upwardSpeed
  **/
  @ApiModelProperty(value = "上行速率，单位：bps。")
  public BigDecimal getUpwardSpeed() {
    return upwardSpeed;
  }

   /**
   * 上行速率，单位：bps。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * Param upwardSpeed
  **/
  public void setUpwardSpeed(BigDecimal upwardSpeed) {
    this.upwardSpeed = upwardSpeed;
  }

  public DevicePerformance downwardSpeed(BigDecimal downwardSpeed) {
    this.downwardSpeed = downwardSpeed;
    return this;
  }

   /**
   * 下行速率，单位：bps。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * return downwardSpeed
  **/
  @ApiModelProperty(value = "下行速率，单位：bps。")
  public BigDecimal getDownwardSpeed() {
    return downwardSpeed;
  }

   /**
   * 下行速率，单位：bps。
   * minimum: 0
   * maximum: 340282350000000000000000000000000000000
   * Param downwardSpeed
  **/
  public void setDownwardSpeed(BigDecimal downwardSpeed) {
    this.downwardSpeed = downwardSpeed;
  }

  public DevicePerformance mac(String mac) {
    this.mac = mac;
    return this;
  }

   /**
   * MAC地址。
   * return mac
  **/
  @ApiModelProperty(value = "MAC地址。")
  public String getMac() {
    return mac;
  }

   /**
   * MAC地址。
   * Param mac
  **/
  public void setMac(String mac) {
    this.mac = mac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicePerformance devicePerformance = (DevicePerformance) o;
    return Objects.equals(this.id, devicePerformance.id) &&
        Objects.equals(this.name, devicePerformance.name) &&
        Objects.equals(this.esn, devicePerformance.esn) &&
        Objects.equals(this.deviceIp, devicePerformance.deviceIp) &&
        Objects.equals(this.neType, devicePerformance.neType) &&
        Objects.equals(this.status, devicePerformance.status) &&
        Objects.equals(this.gisLon, devicePerformance.gisLon) &&
        Objects.equals(this.gisLat, devicePerformance.gisLat) &&
        Objects.equals(this.traffic, devicePerformance.traffic) &&
        Objects.equals(this.onlineUsers, devicePerformance.onlineUsers) &&
        Objects.equals(this.cpuRate, devicePerformance.cpuRate) &&
        Objects.equals(this.upwardSpeed, devicePerformance.upwardSpeed) &&
        Objects.equals(this.downwardSpeed, devicePerformance.downwardSpeed) &&
        Objects.equals(this.mac, devicePerformance.mac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, esn, deviceIp, neType, status, gisLon, gisLat, traffic, onlineUsers, cpuRate, upwardSpeed, downwardSpeed, mac);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicePerformance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    deviceIp: ").append(toIndentedString(deviceIp)).append("\n");
    sb.append("    neType: ").append(toIndentedString(neType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    gisLon: ").append(toIndentedString(gisLon)).append("\n");
    sb.append("    gisLat: ").append(toIndentedString(gisLat)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    onlineUsers: ").append(toIndentedString(onlineUsers)).append("\n");
    sb.append("    cpuRate: ").append(toIndentedString(cpuRate)).append("\n");
    sb.append("    upwardSpeed: ").append(toIndentedString(upwardSpeed)).append("\n");
    sb.append("    downwardSpeed: ").append(toIndentedString(downwardSpeed)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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

