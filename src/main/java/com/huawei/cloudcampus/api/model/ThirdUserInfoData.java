/*
 * 终端用户管理
 * 终端用户管理开放API。 
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
 * ThirdUserInfoData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:26.055+08:00")
public class ThirdUserInfoData {
  @SerializedName("deviceMac")
  private String deviceMac = null;

  @SerializedName("deviceEsn")
  private String deviceEsn = null;

  @SerializedName("terminalIpV4")
  private String terminalIpV4 = null;

  @SerializedName("terminalIpV6")
  private String terminalIpV6 = null;

  @SerializedName("terminalMac")
  private String terminalMac = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("psessionid")
  private String psessionid = null;

  @SerializedName("nodeIp")
  private String nodeIp = null;

  public ThirdUserInfoData deviceMac(String deviceMac) {
    this.deviceMac = deviceMac;
    return this;
  }

   /**
   * 设备MAC地址，MAC和ESN至少有一个必填。
   * return deviceMac
  **/
  @ApiModelProperty(value = "设备MAC地址，MAC和ESN至少有一个必填。")
  public String getDeviceMac() {
    return deviceMac;
  }

   /**
   * 设备MAC地址，MAC和ESN至少有一个必填。
   * Param deviceMac
  **/
  public void setDeviceMac(String deviceMac) {
    this.deviceMac = deviceMac;
  }

  public ThirdUserInfoData deviceEsn(String deviceEsn) {
    this.deviceEsn = deviceEsn;
    return this;
  }

   /**
   * 设备ESN地址，MAC和ESN至少有一个必填。
   * return deviceEsn
  **/
  @ApiModelProperty(value = "设备ESN地址，MAC和ESN至少有一个必填。")
  public String getDeviceEsn() {
    return deviceEsn;
  }

   /**
   * 设备ESN地址，MAC和ESN至少有一个必填。
   * Param deviceEsn
  **/
  public void setDeviceEsn(String deviceEsn) {
    this.deviceEsn = deviceEsn;
  }

  public ThirdUserInfoData terminalIpV4(String terminalIpV4) {
    this.terminalIpV4 = terminalIpV4;
    return this;
  }

   /**
   * 终端IPV4地址，terminalIpV4和terminalIpV6有且只有一个。
   * return terminalIpV4
  **/
  @ApiModelProperty(value = "终端IPV4地址，terminalIpV4和terminalIpV6有且只有一个。")
  public String getTerminalIpV4() {
    return terminalIpV4;
  }

   /**
   * 终端IPV4地址，terminalIpV4和terminalIpV6有且只有一个。
   * Param terminalIpV4
  **/
  public void setTerminalIpV4(String terminalIpV4) {
    this.terminalIpV4 = terminalIpV4;
  }

  public ThirdUserInfoData terminalIpV6(String terminalIpV6) {
    this.terminalIpV6 = terminalIpV6;
    return this;
  }

   /**
   * 终端IPV6地址，terminalIpV4和terminalIpV6有且只有一个。
   * return terminalIpV6
  **/
  @ApiModelProperty(value = "终端IPV6地址，terminalIpV4和terminalIpV6有且只有一个。")
  public String getTerminalIpV6() {
    return terminalIpV6;
  }

   /**
   * 终端IPV6地址，terminalIpV4和terminalIpV6有且只有一个。
   * Param terminalIpV6
  **/
  public void setTerminalIpV6(String terminalIpV6) {
    this.terminalIpV6 = terminalIpV6;
  }

  public ThirdUserInfoData terminalMac(String terminalMac) {
    this.terminalMac = terminalMac;
    return this;
  }

   /**
   * 终端MAC。
   * return terminalMac
  **/
  @ApiModelProperty(required = true, value = "终端MAC。")
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

  public ThirdUserInfoData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 用户名。
   * return userName
  **/
  @ApiModelProperty(required = true, value = "用户名。")
  public String getUserName() {
    return userName;
  }

   /**
   * 用户名。
   * Param userName
  **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ThirdUserInfoData psessionid(String psessionid) {
    this.psessionid = psessionid;
    return this;
  }

   /**
   * 会话ID。
   * return psessionid
  **/
  @ApiModelProperty(required = true, value = "会话ID。")
  public String getPsessionid() {
    return psessionid;
  }

   /**
   * 会话ID。
   * Param psessionid
  **/
  public void setPsessionid(String psessionid) {
    this.psessionid = psessionid;
  }

  public ThirdUserInfoData nodeIp(String nodeIp) {
    this.nodeIp = nodeIp;
    return this;
  }

   /**
   * 授权节点地址。
   * return nodeIp
  **/
  @ApiModelProperty(required = true, value = "授权节点地址。")
  public String getNodeIp() {
    return nodeIp;
  }

   /**
   * 授权节点地址。
   * Param nodeIp
  **/
  public void setNodeIp(String nodeIp) {
    this.nodeIp = nodeIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdUserInfoData thirdUserInfoData = (ThirdUserInfoData) o;
    return Objects.equals(this.deviceMac, thirdUserInfoData.deviceMac) &&
        Objects.equals(this.deviceEsn, thirdUserInfoData.deviceEsn) &&
        Objects.equals(this.terminalIpV4, thirdUserInfoData.terminalIpV4) &&
        Objects.equals(this.terminalIpV6, thirdUserInfoData.terminalIpV6) &&
        Objects.equals(this.terminalMac, thirdUserInfoData.terminalMac) &&
        Objects.equals(this.userName, thirdUserInfoData.userName) &&
        Objects.equals(this.psessionid, thirdUserInfoData.psessionid) &&
        Objects.equals(this.nodeIp, thirdUserInfoData.nodeIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceMac, deviceEsn, terminalIpV4, terminalIpV6, terminalMac, userName, psessionid, nodeIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdUserInfoData {\n");
    
    sb.append("    deviceMac: ").append(toIndentedString(deviceMac)).append("\n");
    sb.append("    deviceEsn: ").append(toIndentedString(deviceEsn)).append("\n");
    sb.append("    terminalIpV4: ").append(toIndentedString(terminalIpV4)).append("\n");
    sb.append("    terminalIpV6: ").append(toIndentedString(terminalIpV6)).append("\n");
    sb.append("    terminalMac: ").append(toIndentedString(terminalMac)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    psessionid: ").append(toIndentedString(psessionid)).append("\n");
    sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
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
