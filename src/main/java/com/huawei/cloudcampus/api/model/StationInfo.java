/*
 * 终端用户列表信息查询
 * · 站点维度终端用户列表查询 · 站点维度TopN终端流量数据查询 · 设备维度下终端用户信息查询 
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
 * 用户信息。
 */
@ApiModel(description = "用户信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:13.331+08:00")
public class StationInfo {
  @SerializedName("accessTime")
  private Long accessTime = null;

  @SerializedName("accessType")
  private Integer accessType = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("authType")
  private String authType = null;

  @SerializedName("channel")
  private Integer channel = null;

  @SerializedName("cumulativeTraffic")
  private Long cumulativeTraffic = null;

  @SerializedName("downwardSpeed")
  private Long downwardSpeed = null;

  @SerializedName("dualFrequency")
  private Integer dualFrequency = null;

  @SerializedName("frequencyBand")
  private Integer frequencyBand = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("onlineStatus")
  private Integer onlineStatus = null;

  @SerializedName("onlineTime")
  private Long onlineTime = null;

  @SerializedName("packageLossRate")
  private Integer packageLossRate = null;

  @SerializedName("portIndex")
  private Integer portIndex = null;

  @SerializedName("retransRate")
  private Integer retransRate = null;

  @SerializedName("rssi")
  private Integer rssi = null;

  @SerializedName("sendPackageSpeed")
  private Integer sendPackageSpeed = null;

  @SerializedName("signalNoiseRatio")
  private Integer signalNoiseRatio = null;

  @SerializedName("ssid")
  private String ssid = null;

  @SerializedName("stickyTags")
  private Integer stickyTags = null;

  @SerializedName("terminalIP")
  private String terminalIP = null;

  @SerializedName("terminalMac")
  private String terminalMac = null;

  @SerializedName("upwardSpeed")
  private Long upwardSpeed = null;

  @SerializedName("vlan")
  private Integer vlan = null;

  public StationInfo accessTime(Long accessTime) {
    this.accessTime = accessTime;
    return this;
  }

   /**
   * 用户接入的格林威治时间，单位：秒。
   * minimum: 0
   * maximum: 9223372036854775807
   * return accessTime
  **/
  @ApiModelProperty(value = "用户接入的格林威治时间，单位：秒。")
  public Long getAccessTime() {
    return accessTime;
  }

   /**
   * 用户接入的格林威治时间，单位：秒。
   * minimum: 0
   * maximum: 9223372036854775807
   * Param accessTime
  **/
  public void setAccessTime(Long accessTime) {
    this.accessTime = accessTime;
  }

  public StationInfo accessType(Integer accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * 接入类型，0---有线接入，1---无线接入。
   * minimum: 0
   * maximum: 2147483647
   * return accessType
  **/
  @ApiModelProperty(value = "接入类型，0---有线接入，1---无线接入。")
  public Integer getAccessType() {
    return accessType;
  }

   /**
   * 接入类型，0---有线接入，1---无线接入。
   * minimum: 0
   * maximum: 2147483647
   * Param accessType
  **/
  public void setAccessType(Integer accessType) {
    this.accessType = accessType;
  }

  public StationInfo account(String account) {
    this.account = account;
    return this;
  }

   /**
   * 用户名称。
   * return account
  **/
  @ApiModelProperty(value = "用户名称。")
  public String getAccount() {
    return account;
  }

   /**
   * 用户名称。
   * Param account
  **/
  public void setAccount(String account) {
    this.account = account;
  }

  public StationInfo deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * 关联设备的名称。
   * return deviceName
  **/
  @ApiModelProperty(value = "关联设备的名称。")
  public String getDeviceName() {
    return deviceName;
  }

   /**
   * 关联设备的名称。
   * Param deviceName
  **/
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public StationInfo authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * 接入设备认证方式。
   * return authType
  **/
  @ApiModelProperty(value = "接入设备认证方式。")
  public String getAuthType() {
    return authType;
  }

   /**
   * 接入设备认证方式。
   * Param authType
  **/
  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public StationInfo channel(Integer channel) {
    this.channel = channel;
    return this;
  }

   /**
   * 无线信道。
   * minimum: 0
   * maximum: 256
   * return channel
  **/
  @ApiModelProperty(value = "无线信道。")
  public Integer getChannel() {
    return channel;
  }

   /**
   * 无线信道。
   * minimum: 0
   * maximum: 256
   * Param channel
  **/
  public void setChannel(Integer channel) {
    this.channel = channel;
  }

  public StationInfo cumulativeTraffic(Long cumulativeTraffic) {
    this.cumulativeTraffic = cumulativeTraffic;
    return this;
  }

   /**
   * 累计上下行流量，单位：字节。
   * minimum: 0
   * maximum: 9223372036854775807
   * return cumulativeTraffic
  **/
  @ApiModelProperty(value = "累计上下行流量，单位：字节。")
  public Long getCumulativeTraffic() {
    return cumulativeTraffic;
  }

   /**
   * 累计上下行流量，单位：字节。
   * minimum: 0
   * maximum: 9223372036854775807
   * Param cumulativeTraffic
  **/
  public void setCumulativeTraffic(Long cumulativeTraffic) {
    this.cumulativeTraffic = cumulativeTraffic;
  }

  public StationInfo downwardSpeed(Long downwardSpeed) {
    this.downwardSpeed = downwardSpeed;
    return this;
  }

   /**
   * 下行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。
   * minimum: 0
   * maximum: 9223372036854775807
   * return downwardSpeed
  **/
  @ApiModelProperty(value = "下行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。")
  public Long getDownwardSpeed() {
    return downwardSpeed;
  }

   /**
   * 下行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。
   * minimum: 0
   * maximum: 9223372036854775807
   * Param downwardSpeed
  **/
  public void setDownwardSpeed(Long downwardSpeed) {
    this.downwardSpeed = downwardSpeed;
  }

  public StationInfo dualFrequency(Integer dualFrequency) {
    this.dualFrequency = dualFrequency;
    return this;
  }

   /**
   * 双频能力，0-支持2.4G、1-支持5G。
   * minimum: 0
   * maximum: 2147483647
   * return dualFrequency
  **/
  @ApiModelProperty(value = "双频能力，0-支持2.4G、1-支持5G。")
  public Integer getDualFrequency() {
    return dualFrequency;
  }

   /**
   * 双频能力，0-支持2.4G、1-支持5G。
   * minimum: 0
   * maximum: 2147483647
   * Param dualFrequency
  **/
  public void setDualFrequency(Integer dualFrequency) {
    this.dualFrequency = dualFrequency;
  }

  public StationInfo frequencyBand(Integer frequencyBand) {
    this.frequencyBand = frequencyBand;
    return this;
  }

   /**
   * 关联频段，1-2.4G、2-5G。
   * minimum: 0
   * maximum: 2147483647
   * return frequencyBand
  **/
  @ApiModelProperty(value = "关联频段，1-2.4G、2-5G。")
  public Integer getFrequencyBand() {
    return frequencyBand;
  }

   /**
   * 关联频段，1-2.4G、2-5G。
   * minimum: 0
   * maximum: 2147483647
   * Param frequencyBand
  **/
  public void setFrequencyBand(Integer frequencyBand) {
    this.frequencyBand = frequencyBand;
  }

  public StationInfo hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * 终端设备名称。
   * return hostName
  **/
  @ApiModelProperty(value = "终端设备名称。")
  public String getHostName() {
    return hostName;
  }

   /**
   * 终端设备名称。
   * Param hostName
  **/
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public StationInfo mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * 模式，0-802.11b、1-802.11g、2-802.11n、3-802.11a、4-802.11ac。
   * minimum: 0
   * maximum: 2147483647
   * return mode
  **/
  @ApiModelProperty(value = "模式，0-802.11b、1-802.11g、2-802.11n、3-802.11a、4-802.11ac。")
  public Integer getMode() {
    return mode;
  }

   /**
   * 模式，0-802.11b、1-802.11g、2-802.11n、3-802.11a、4-802.11ac。
   * minimum: 0
   * maximum: 2147483647
   * Param mode
  **/
  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public StationInfo onlineStatus(Integer onlineStatus) {
    this.onlineStatus = onlineStatus;
    return this;
  }

   /**
   * 在线状态，1---在线、2---离线。
   * minimum: 0
   * maximum: 2147483647
   * return onlineStatus
  **/
  @ApiModelProperty(value = "在线状态，1---在线、2---离线。")
  public Integer getOnlineStatus() {
    return onlineStatus;
  }

   /**
   * 在线状态，1---在线、2---离线。
   * minimum: 0
   * maximum: 2147483647
   * Param onlineStatus
  **/
  public void setOnlineStatus(Integer onlineStatus) {
    this.onlineStatus = onlineStatus;
  }

  public StationInfo onlineTime(Long onlineTime) {
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 在线时长，单位：秒。
   * minimum: 0
   * maximum: 9223372036854775807
   * return onlineTime
  **/
  @ApiModelProperty(value = "在线时长，单位：秒。")
  public Long getOnlineTime() {
    return onlineTime;
  }

   /**
   * 在线时长，单位：秒。
   * minimum: 0
   * maximum: 9223372036854775807
   * Param onlineTime
  **/
  public void setOnlineTime(Long onlineTime) {
    this.onlineTime = onlineTime;
  }

  public StationInfo packageLossRate(Integer packageLossRate) {
    this.packageLossRate = packageLossRate;
    return this;
  }

   /**
   * 丢包率（上报周期内），单位：百分比。
   * minimum: 0
   * maximum: 2147483647
   * return packageLossRate
  **/
  @ApiModelProperty(value = "丢包率（上报周期内），单位：百分比。")
  public Integer getPackageLossRate() {
    return packageLossRate;
  }

   /**
   * 丢包率（上报周期内），单位：百分比。
   * minimum: 0
   * maximum: 2147483647
   * Param packageLossRate
  **/
  public void setPackageLossRate(Integer packageLossRate) {
    this.packageLossRate = packageLossRate;
  }

  public StationInfo portIndex(Integer portIndex) {
    this.portIndex = portIndex;
    return this;
  }

   /**
   * 接入端口索引，不推荐使用。
   * minimum: 0
   * maximum: 2048
   * return portIndex
  **/
  @ApiModelProperty(value = "接入端口索引，不推荐使用。")
  public Integer getPortIndex() {
    return portIndex;
  }

   /**
   * 接入端口索引，不推荐使用。
   * minimum: 0
   * maximum: 2048
   * Param portIndex
  **/
  public void setPortIndex(Integer portIndex) {
    this.portIndex = portIndex;
  }

  public StationInfo retransRate(Integer retransRate) {
    this.retransRate = retransRate;
    return this;
  }

   /**
   * 重传率（上报周期内），单位：百分比。
   * minimum: 0
   * maximum: 100
   * return retransRate
  **/
  @ApiModelProperty(value = "重传率（上报周期内），单位：百分比。")
  public Integer getRetransRate() {
    return retransRate;
  }

   /**
   * 重传率（上报周期内），单位：百分比。
   * minimum: 0
   * maximum: 100
   * Param retransRate
  **/
  public void setRetransRate(Integer retransRate) {
    this.retransRate = retransRate;
  }

  public StationInfo rssi(Integer rssi) {
    this.rssi = rssi;
    return this;
  }

   /**
   * 信号强度，单位：dBm。
   * minimum: 0
   * maximum: 2147483647
   * return rssi
  **/
  @ApiModelProperty(value = "信号强度，单位：dBm。")
  public Integer getRssi() {
    return rssi;
  }

   /**
   * 信号强度，单位：dBm。
   * minimum: 0
   * maximum: 2147483647
   * Param rssi
  **/
  public void setRssi(Integer rssi) {
    this.rssi = rssi;
  }

  public StationInfo sendPackageSpeed(Integer sendPackageSpeed) {
    this.sendPackageSpeed = sendPackageSpeed;
    return this;
  }

   /**
   * 实际发包速率（协商速率），单位：bps。
   * minimum: 0
   * maximum: 2147483647
   * return sendPackageSpeed
  **/
  @ApiModelProperty(value = "实际发包速率（协商速率），单位：bps。")
  public Integer getSendPackageSpeed() {
    return sendPackageSpeed;
  }

   /**
   * 实际发包速率（协商速率），单位：bps。
   * minimum: 0
   * maximum: 2147483647
   * Param sendPackageSpeed
  **/
  public void setSendPackageSpeed(Integer sendPackageSpeed) {
    this.sendPackageSpeed = sendPackageSpeed;
  }

  public StationInfo signalNoiseRatio(Integer signalNoiseRatio) {
    this.signalNoiseRatio = signalNoiseRatio;
    return this;
  }

   /**
   * 信噪比（上报周期内），单位：dB。
   * minimum: 0
   * maximum: 2147483647
   * return signalNoiseRatio
  **/
  @ApiModelProperty(value = "信噪比（上报周期内），单位：dB。")
  public Integer getSignalNoiseRatio() {
    return signalNoiseRatio;
  }

   /**
   * 信噪比（上报周期内），单位：dB。
   * minimum: 0
   * maximum: 2147483647
   * Param signalNoiseRatio
  **/
  public void setSignalNoiseRatio(Integer signalNoiseRatio) {
    this.signalNoiseRatio = signalNoiseRatio;
  }

  public StationInfo ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * SSID名称。
   * return ssid
  **/
  @ApiModelProperty(value = "SSID名称。")
  public String getSsid() {
    return ssid;
  }

   /**
   * SSID名称。
   * Param ssid
  **/
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public StationInfo stickyTags(Integer stickyTags) {
    this.stickyTags = stickyTags;
    return this;
  }

   /**
   * 粘性标记，0---no、1---yes，粘性终端标记含义：信号低、速率低且不漫游的终端。
   * minimum: 0
   * maximum: 2147483647
   * return stickyTags
  **/
  @ApiModelProperty(value = "粘性标记，0---no、1---yes，粘性终端标记含义：信号低、速率低且不漫游的终端。")
  public Integer getStickyTags() {
    return stickyTags;
  }

   /**
   * 粘性标记，0---no、1---yes，粘性终端标记含义：信号低、速率低且不漫游的终端。
   * minimum: 0
   * maximum: 2147483647
   * Param stickyTags
  **/
  public void setStickyTags(Integer stickyTags) {
    this.stickyTags = stickyTags;
  }

  public StationInfo terminalIP(String terminalIP) {
    this.terminalIP = terminalIP;
    return this;
  }

   /**
   * 终端IP。
   * return terminalIP
  **/
  @ApiModelProperty(value = "终端IP。")
  public String getTerminalIP() {
    return terminalIP;
  }

   /**
   * 终端IP。
   * Param terminalIP
  **/
  public void setTerminalIP(String terminalIP) {
    this.terminalIP = terminalIP;
  }

  public StationInfo terminalMac(String terminalMac) {
    this.terminalMac = terminalMac;
    return this;
  }

   /**
   * 终端MAC。
   * return terminalMac
  **/
  @ApiModelProperty(value = "终端MAC。")
  public String getTerminalMac() {
    return terminalMac;
  }

   /**
   * 终端MAC。
   * Param terminalMac
  **/
  public void setTerminalMac(String terminalMac) {
    this.terminalMac = terminalMac;
  }

  public StationInfo upwardSpeed(Long upwardSpeed) {
    this.upwardSpeed = upwardSpeed;
    return this;
  }

   /**
   * 上行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。
   * minimum: 0
   * maximum: 9223372036854775807
   * return upwardSpeed
  **/
  @ApiModelProperty(value = "上行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。")
  public Long getUpwardSpeed() {
    return upwardSpeed;
  }

   /**
   * 上行速率，单位：bps，最后一个统计周期内的平均值，统计周期为5分钟。
   * minimum: 0
   * maximum: 9223372036854775807
   * Param upwardSpeed
  **/
  public void setUpwardSpeed(Long upwardSpeed) {
    this.upwardSpeed = upwardSpeed;
  }

  public StationInfo vlan(Integer vlan) {
    this.vlan = vlan;
    return this;
  }

   /**
   * 接入VLAN。
   * minimum: 0
   * maximum: 4096
   * return vlan
  **/
  @ApiModelProperty(value = "接入VLAN。")
  public Integer getVlan() {
    return vlan;
  }

   /**
   * 接入VLAN。
   * minimum: 0
   * maximum: 4096
   * Param vlan
  **/
  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StationInfo stationInfo = (StationInfo) o;
    return Objects.equals(this.accessTime, stationInfo.accessTime) &&
        Objects.equals(this.accessType, stationInfo.accessType) &&
        Objects.equals(this.account, stationInfo.account) &&
        Objects.equals(this.deviceName, stationInfo.deviceName) &&
        Objects.equals(this.authType, stationInfo.authType) &&
        Objects.equals(this.channel, stationInfo.channel) &&
        Objects.equals(this.cumulativeTraffic, stationInfo.cumulativeTraffic) &&
        Objects.equals(this.downwardSpeed, stationInfo.downwardSpeed) &&
        Objects.equals(this.dualFrequency, stationInfo.dualFrequency) &&
        Objects.equals(this.frequencyBand, stationInfo.frequencyBand) &&
        Objects.equals(this.hostName, stationInfo.hostName) &&
        Objects.equals(this.mode, stationInfo.mode) &&
        Objects.equals(this.onlineStatus, stationInfo.onlineStatus) &&
        Objects.equals(this.onlineTime, stationInfo.onlineTime) &&
        Objects.equals(this.packageLossRate, stationInfo.packageLossRate) &&
        Objects.equals(this.portIndex, stationInfo.portIndex) &&
        Objects.equals(this.retransRate, stationInfo.retransRate) &&
        Objects.equals(this.rssi, stationInfo.rssi) &&
        Objects.equals(this.sendPackageSpeed, stationInfo.sendPackageSpeed) &&
        Objects.equals(this.signalNoiseRatio, stationInfo.signalNoiseRatio) &&
        Objects.equals(this.ssid, stationInfo.ssid) &&
        Objects.equals(this.stickyTags, stationInfo.stickyTags) &&
        Objects.equals(this.terminalIP, stationInfo.terminalIP) &&
        Objects.equals(this.terminalMac, stationInfo.terminalMac) &&
        Objects.equals(this.upwardSpeed, stationInfo.upwardSpeed) &&
        Objects.equals(this.vlan, stationInfo.vlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTime, accessType, account, deviceName, authType, channel, cumulativeTraffic, downwardSpeed, dualFrequency, frequencyBand, hostName, mode, onlineStatus, onlineTime, packageLossRate, portIndex, retransRate, rssi, sendPackageSpeed, signalNoiseRatio, ssid, stickyTags, terminalIP, terminalMac, upwardSpeed, vlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StationInfo {\n");
    
    sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    cumulativeTraffic: ").append(toIndentedString(cumulativeTraffic)).append("\n");
    sb.append("    downwardSpeed: ").append(toIndentedString(downwardSpeed)).append("\n");
    sb.append("    dualFrequency: ").append(toIndentedString(dualFrequency)).append("\n");
    sb.append("    frequencyBand: ").append(toIndentedString(frequencyBand)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    packageLossRate: ").append(toIndentedString(packageLossRate)).append("\n");
    sb.append("    portIndex: ").append(toIndentedString(portIndex)).append("\n");
    sb.append("    retransRate: ").append(toIndentedString(retransRate)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    sendPackageSpeed: ").append(toIndentedString(sendPackageSpeed)).append("\n");
    sb.append("    signalNoiseRatio: ").append(toIndentedString(signalNoiseRatio)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    stickyTags: ").append(toIndentedString(stickyTags)).append("\n");
    sb.append("    terminalIP: ").append(toIndentedString(terminalIP)).append("\n");
    sb.append("    terminalMac: ").append(toIndentedString(terminalMac)).append("\n");
    sb.append("    upwardSpeed: ").append(toIndentedString(upwardSpeed)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

