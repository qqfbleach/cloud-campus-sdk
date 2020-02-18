/*
 * AP网口IOT插卡管理
 * AP网口IOT插卡查询及操作接口。 场景：对AP网口IOT插卡查询及操作的第三方接口。
 *
 * OpenAPI spec version: 1.0.0
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
import java.util.UUID;

/**
 * IotCmdResultInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:14.620+08:00")
public class IotCmdResultInfo {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("deviceEsn")
  private String deviceEsn = null;

  @SerializedName("cardMac")
  private String cardMac = null;

  @SerializedName("iotSn")
  private String iotSn = null;

  @SerializedName("interface")
  private String _interface = null;

  @SerializedName("issueTime")
  private String issueTime = null;

  /**
   * 插卡命令执行的状态。WAITTING等待执行命令，EXECUTING表示正在执行命令，SUCCESS表示执行命令成功，FAILED表示执行命令失败。
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAITTING("WAITTING"),
    
    EXECUTING("EXECUTING"),
    
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("failReason")
  private String failReason = null;

  public IotCmdResultInfo id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 该条记录的唯一标识ID。
   * return id
  **/
  @ApiModelProperty(value = "该条记录的唯一标识ID。")
  public UUID getId() {
    return id;
  }

   /**
   * 该条记录的唯一标识ID。
   * Param id
  **/
  public void setId(UUID id) {
    this.id = id;
  }

  public IotCmdResultInfo deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * 设备名称。
   * return deviceName
  **/
  @ApiModelProperty(value = "设备名称。")
  public String getDeviceName() {
    return deviceName;
  }

   /**
   * 设备名称。
   * Param deviceName
  **/
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public IotCmdResultInfo deviceEsn(String deviceEsn) {
    this.deviceEsn = deviceEsn;
    return this;
  }

   /**
   * 设备ESN。
   * return deviceEsn
  **/
  @ApiModelProperty(value = "设备ESN。")
  public String getDeviceEsn() {
    return deviceEsn;
  }

   /**
   * 设备ESN。
   * Param deviceEsn
  **/
  public void setDeviceEsn(String deviceEsn) {
    this.deviceEsn = deviceEsn;
  }

  public IotCmdResultInfo cardMac(String cardMac) {
    this.cardMac = cardMac;
    return this;
  }

   /**
   * 插卡MAC。
   * return cardMac
  **/
  @ApiModelProperty(value = "插卡MAC。")
  public String getCardMac() {
    return cardMac;
  }

   /**
   * 插卡MAC。
   * Param cardMac
  **/
  public void setCardMac(String cardMac) {
    this.cardMac = cardMac;
  }

  public IotCmdResultInfo iotSn(String iotSn) {
    this.iotSn = iotSn;
    return this;
  }

   /**
   * IOT插卡SN号。
   * return iotSn
  **/
  @ApiModelProperty(value = "IOT插卡SN号。")
  public String getIotSn() {
    return iotSn;
  }

   /**
   * IOT插卡SN号。
   * Param iotSn
  **/
  public void setIotSn(String iotSn) {
    this.iotSn = iotSn;
  }

  public IotCmdResultInfo _interface(String _interface) {
    this._interface = _interface;
    return this;
  }

   /**
   * AP接口名称。
   * return _interface
  **/
  @ApiModelProperty(value = "AP接口名称。")
  public String getInterface() {
    return _interface;
  }

   /**
   * AP接口名称。
   * Param _interface
  **/
  public void setInterface(String _interface) {
    this._interface = _interface;
  }

  public IotCmdResultInfo issueTime(String issueTime) {
    this.issueTime = issueTime;
    return this;
  }

   /**
   * 命令下发时间。
   * return issueTime
  **/
  @ApiModelProperty(value = "命令下发时间。")
  public String getIssueTime() {
    return issueTime;
  }

   /**
   * 命令下发时间。
   * Param issueTime
  **/
  public void setIssueTime(String issueTime) {
    this.issueTime = issueTime;
  }

  public IotCmdResultInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * 插卡命令执行的状态。WAITTING等待执行命令，EXECUTING表示正在执行命令，SUCCESS表示执行命令成功，FAILED表示执行命令失败。
   * return status
  **/
  @ApiModelProperty(value = "插卡命令执行的状态。WAITTING等待执行命令，EXECUTING表示正在执行命令，SUCCESS表示执行命令成功，FAILED表示执行命令失败。")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * 插卡命令执行的状态。WAITTING等待执行命令，EXECUTING表示正在执行命令，SUCCESS表示执行命令成功，FAILED表示执行命令失败。
   * Param status
  **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public IotCmdResultInfo detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * 插卡命令执行返回详情。
   * return detail
  **/
  @ApiModelProperty(value = "插卡命令执行返回详情。")
  public String getDetail() {
    return detail;
  }

   /**
   * 插卡命令执行返回详情。
   * Param detail
  **/
  public void setDetail(String detail) {
    this.detail = detail;
  }

  public IotCmdResultInfo failReason(String failReason) {
    this.failReason = failReason;
    return this;
  }

   /**
   * 插卡命令执行失败的原因。
   * return failReason
  **/
  @ApiModelProperty(value = "插卡命令执行失败的原因。")
  public String getFailReason() {
    return failReason;
  }

   /**
   * 插卡命令执行失败的原因。
   * Param failReason
  **/
  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IotCmdResultInfo iotCmdResultInfo = (IotCmdResultInfo) o;
    return Objects.equals(this.id, iotCmdResultInfo.id) &&
        Objects.equals(this.deviceName, iotCmdResultInfo.deviceName) &&
        Objects.equals(this.deviceEsn, iotCmdResultInfo.deviceEsn) &&
        Objects.equals(this.cardMac, iotCmdResultInfo.cardMac) &&
        Objects.equals(this.iotSn, iotCmdResultInfo.iotSn) &&
        Objects.equals(this._interface, iotCmdResultInfo._interface) &&
        Objects.equals(this.issueTime, iotCmdResultInfo.issueTime) &&
        Objects.equals(this.status, iotCmdResultInfo.status) &&
        Objects.equals(this.detail, iotCmdResultInfo.detail) &&
        Objects.equals(this.failReason, iotCmdResultInfo.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deviceName, deviceEsn, cardMac, iotSn, _interface, issueTime, status, detail, failReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IotCmdResultInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceEsn: ").append(toIndentedString(deviceEsn)).append("\n");
    sb.append("    cardMac: ").append(toIndentedString(cardMac)).append("\n");
    sb.append("    iotSn: ").append(toIndentedString(iotSn)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
