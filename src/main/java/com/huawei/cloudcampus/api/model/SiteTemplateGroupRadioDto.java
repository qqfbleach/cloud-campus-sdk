/*
 * AP站点模板射频配置
 * AP站点模板射频配置第三方接口说明。 
 *
 * OpenAPI spec version: 1.1.1
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
import com.huawei.cloudcampus.api.model.GroupRadio2gConfigDto;
import com.huawei.cloudcampus.api.model.GroupRadio5gConfigDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 站点模板射频配置信息。
 */
@ApiModel(description = "站点模板射频配置信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:06.411+08:00")
public class SiteTemplateGroupRadioDto {
  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("calibrate")
  private String calibrate = null;

  @SerializedName("dcaStartTime")
  private String dcaStartTime = null;

  @SerializedName("dcaInterval")
  private Integer dcaInterval = null;

  @SerializedName("dcaScheduleTime")
  private String dcaScheduleTime = null;

  @SerializedName("scanDuration")
  private String scanDuration = null;

  @SerializedName("scanInterval")
  private String scanInterval = null;

  @SerializedName("scanChannel")
  private String scanChannel = null;

  @SerializedName("beaconCycle")
  private Integer beaconCycle = null;

  @SerializedName("dynamicSwitch")
  private Boolean dynamicSwitch = null;

  @SerializedName("referenceDataAnalysis")
  private Boolean referenceDataAnalysis = null;

  @SerializedName("groupRadio2g")
  private GroupRadio2gConfigDto groupRadio2g = null;

  @SerializedName("groupRadio5g")
  private GroupRadio5gConfigDto groupRadio5g = null;

  public SiteTemplateGroupRadioDto countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 国家码。
   * return countryCode
  **/
  @ApiModelProperty(value = "国家码。")
  public String getCountryCode() {
    return countryCode;
  }

   /**
   * 国家码。
   * Param countryCode
  **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SiteTemplateGroupRadioDto calibrate(String calibrate) {
    this.calibrate = calibrate;
    return this;
  }

   /**
   * 调优模式，只能为manual，auto，schedule其中一种。
   * return calibrate
  **/
  @ApiModelProperty(value = "调优模式，只能为manual，auto，schedule其中一种。")
  public String getCalibrate() {
    return calibrate;
  }

   /**
   * 调优模式，只能为manual，auto，schedule其中一种。
   * Param calibrate
  **/
  public void setCalibrate(String calibrate) {
    this.calibrate = calibrate;
  }

  public SiteTemplateGroupRadioDto dcaStartTime(String dcaStartTime) {
    this.dcaStartTime = dcaStartTime;
    return this;
  }

   /**
   * 自动调优模式下有效。自动调优开始时间，时间格式hh:mm:ss。
   * return dcaStartTime
  **/
  @ApiModelProperty(value = "自动调优模式下有效。自动调优开始时间，时间格式hh:mm:ss。")
  public String getDcaStartTime() {
    return dcaStartTime;
  }

   /**
   * 自动调优模式下有效。自动调优开始时间，时间格式hh:mm:ss。
   * Param dcaStartTime
  **/
  public void setDcaStartTime(String dcaStartTime) {
    this.dcaStartTime = dcaStartTime;
  }

  public SiteTemplateGroupRadioDto dcaInterval(Integer dcaInterval) {
    this.dcaInterval = dcaInterval;
    return this;
  }

   /**
   * 自动调优模式下有效。自动调优时间周期，取值范围为30到1440之间的整数，单位（min）。
   * minimum: 30
   * maximum: 1440
   * return dcaInterval
  **/
  @ApiModelProperty(value = "自动调优模式下有效。自动调优时间周期，取值范围为30到1440之间的整数，单位（min）。")
  public Integer getDcaInterval() {
    return dcaInterval;
  }

   /**
   * 自动调优模式下有效。自动调优时间周期，取值范围为30到1440之间的整数，单位（min）。
   * minimum: 30
   * maximum: 1440
   * Param dcaInterval
  **/
  public void setDcaInterval(Integer dcaInterval) {
    this.dcaInterval = dcaInterval;
  }

  public SiteTemplateGroupRadioDto dcaScheduleTime(String dcaScheduleTime) {
    this.dcaScheduleTime = dcaScheduleTime;
    return this;
  }

   /**
   * 定时调优模式下有效。定时调优开始时间，时间格式hh:mm:ss。
   * return dcaScheduleTime
  **/
  @ApiModelProperty(value = "定时调优模式下有效。定时调优开始时间，时间格式hh:mm:ss。")
  public String getDcaScheduleTime() {
    return dcaScheduleTime;
  }

   /**
   * 定时调优模式下有效。定时调优开始时间，时间格式hh:mm:ss。
   * Param dcaScheduleTime
  **/
  public void setDcaScheduleTime(String dcaScheduleTime) {
    this.dcaScheduleTime = dcaScheduleTime;
  }

  public SiteTemplateGroupRadioDto scanDuration(String scanDuration) {
    this.scanDuration = scanDuration;
    return this;
  }

   /**
   * 扫描时长，范围60~100，单位（ms）。
   * return scanDuration
  **/
  @ApiModelProperty(value = "扫描时长，范围60~100，单位（ms）。")
  public String getScanDuration() {
    return scanDuration;
  }

   /**
   * 扫描时长，范围60~100，单位（ms）。
   * Param scanDuration
  **/
  public void setScanDuration(String scanDuration) {
    this.scanDuration = scanDuration;
  }

  public SiteTemplateGroupRadioDto scanInterval(String scanInterval) {
    this.scanInterval = scanInterval;
    return this;
  }

   /**
   * 扫描间隔，范围300~600000，单位（ms）。
   * return scanInterval
  **/
  @ApiModelProperty(value = "扫描间隔，范围300~600000，单位（ms）。")
  public String getScanInterval() {
    return scanInterval;
  }

   /**
   * 扫描间隔，范围300~600000，单位（ms）。
   * Param scanInterval
  **/
  public void setScanInterval(String scanInterval) {
    this.scanInterval = scanInterval;
  }

  public SiteTemplateGroupRadioDto scanChannel(String scanChannel) {
    this.scanChannel = scanChannel;
    return this;
  }

   /**
   * 扫描信道，只能为country-channel，dca-channel，work-channel其中一种。
   * return scanChannel
  **/
  @ApiModelProperty(value = "扫描信道，只能为country-channel，dca-channel，work-channel其中一种。")
  public String getScanChannel() {
    return scanChannel;
  }

   /**
   * 扫描信道，只能为country-channel，dca-channel，work-channel其中一种。
   * Param scanChannel
  **/
  public void setScanChannel(String scanChannel) {
    this.scanChannel = scanChannel;
  }

  public SiteTemplateGroupRadioDto beaconCycle(Integer beaconCycle) {
    this.beaconCycle = beaconCycle;
    return this;
  }

   /**
   * beacon周期。取值范围为60到1000之间的整数。单位（TUs）。
   * minimum: 60
   * maximum: 1000
   * return beaconCycle
  **/
  @ApiModelProperty(value = "beacon周期。取值范围为60到1000之间的整数。单位（TUs）。")
  public Integer getBeaconCycle() {
    return beaconCycle;
  }

   /**
   * beacon周期。取值范围为60到1000之间的整数。单位（TUs）。
   * minimum: 60
   * maximum: 1000
   * Param beaconCycle
  **/
  public void setBeaconCycle(Integer beaconCycle) {
    this.beaconCycle = beaconCycle;
  }

  public SiteTemplateGroupRadioDto dynamicSwitch(Boolean dynamicSwitch) {
    this.dynamicSwitch = dynamicSwitch;
    return this;
  }

   /**
   * 负载均衡。
   * return dynamicSwitch
  **/
  @ApiModelProperty(value = "负载均衡。")
  public Boolean getDynamicSwitch() {
    return dynamicSwitch;
  }

   /**
   * 负载均衡。
   * Param dynamicSwitch
  **/
  public void setDynamicSwitch(Boolean dynamicSwitch) {
    this.dynamicSwitch = dynamicSwitch;
  }

  public SiteTemplateGroupRadioDto referenceDataAnalysis(Boolean referenceDataAnalysis) {
    this.referenceDataAnalysis = referenceDataAnalysis;
    return this;
  }

   /**
   * 是否基于历史数据进行射频调优，可选值: true(默认)，false。
   * return referenceDataAnalysis
  **/
  @ApiModelProperty(value = "是否基于历史数据进行射频调优，可选值: true(默认)，false。")
  public Boolean getReferenceDataAnalysis() {
    return referenceDataAnalysis;
  }

   /**
   * 是否基于历史数据进行射频调优，可选值: true(默认)，false。
   * Param referenceDataAnalysis
  **/
  public void setReferenceDataAnalysis(Boolean referenceDataAnalysis) {
    this.referenceDataAnalysis = referenceDataAnalysis;
  }

  public SiteTemplateGroupRadioDto groupRadio2g(GroupRadio2gConfigDto groupRadio2g) {
    this.groupRadio2g = groupRadio2g;
    return this;
  }

   /**
   * Get groupRadio2g
   * return groupRadio2g
  **/
  @ApiModelProperty(value = "")
  public GroupRadio2gConfigDto getGroupRadio2g() {
    return groupRadio2g;
  }

   /**
   * Set groupRadio2g
   * Param groupRadio2g
  **/
  public void setGroupRadio2g(GroupRadio2gConfigDto groupRadio2g) {
    this.groupRadio2g = groupRadio2g;
  }

  public SiteTemplateGroupRadioDto groupRadio5g(GroupRadio5gConfigDto groupRadio5g) {
    this.groupRadio5g = groupRadio5g;
    return this;
  }

   /**
   * Get groupRadio5g
   * return groupRadio5g
  **/
  @ApiModelProperty(value = "")
  public GroupRadio5gConfigDto getGroupRadio5g() {
    return groupRadio5g;
  }

   /**
   * Set groupRadio5g
   * Param groupRadio5g
  **/
  public void setGroupRadio5g(GroupRadio5gConfigDto groupRadio5g) {
    this.groupRadio5g = groupRadio5g;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteTemplateGroupRadioDto siteTemplateGroupRadioDto = (SiteTemplateGroupRadioDto) o;
    return Objects.equals(this.countryCode, siteTemplateGroupRadioDto.countryCode) &&
        Objects.equals(this.calibrate, siteTemplateGroupRadioDto.calibrate) &&
        Objects.equals(this.dcaStartTime, siteTemplateGroupRadioDto.dcaStartTime) &&
        Objects.equals(this.dcaInterval, siteTemplateGroupRadioDto.dcaInterval) &&
        Objects.equals(this.dcaScheduleTime, siteTemplateGroupRadioDto.dcaScheduleTime) &&
        Objects.equals(this.scanDuration, siteTemplateGroupRadioDto.scanDuration) &&
        Objects.equals(this.scanInterval, siteTemplateGroupRadioDto.scanInterval) &&
        Objects.equals(this.scanChannel, siteTemplateGroupRadioDto.scanChannel) &&
        Objects.equals(this.beaconCycle, siteTemplateGroupRadioDto.beaconCycle) &&
        Objects.equals(this.dynamicSwitch, siteTemplateGroupRadioDto.dynamicSwitch) &&
        Objects.equals(this.referenceDataAnalysis, siteTemplateGroupRadioDto.referenceDataAnalysis) &&
        Objects.equals(this.groupRadio2g, siteTemplateGroupRadioDto.groupRadio2g) &&
        Objects.equals(this.groupRadio5g, siteTemplateGroupRadioDto.groupRadio5g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, calibrate, dcaStartTime, dcaInterval, dcaScheduleTime, scanDuration, scanInterval, scanChannel, beaconCycle, dynamicSwitch, referenceDataAnalysis, groupRadio2g, groupRadio5g);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteTemplateGroupRadioDto {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    calibrate: ").append(toIndentedString(calibrate)).append("\n");
    sb.append("    dcaStartTime: ").append(toIndentedString(dcaStartTime)).append("\n");
    sb.append("    dcaInterval: ").append(toIndentedString(dcaInterval)).append("\n");
    sb.append("    dcaScheduleTime: ").append(toIndentedString(dcaScheduleTime)).append("\n");
    sb.append("    scanDuration: ").append(toIndentedString(scanDuration)).append("\n");
    sb.append("    scanInterval: ").append(toIndentedString(scanInterval)).append("\n");
    sb.append("    scanChannel: ").append(toIndentedString(scanChannel)).append("\n");
    sb.append("    beaconCycle: ").append(toIndentedString(beaconCycle)).append("\n");
    sb.append("    dynamicSwitch: ").append(toIndentedString(dynamicSwitch)).append("\n");
    sb.append("    referenceDataAnalysis: ").append(toIndentedString(referenceDataAnalysis)).append("\n");
    sb.append("    groupRadio2g: ").append(toIndentedString(groupRadio2g)).append("\n");
    sb.append("    groupRadio5g: ").append(toIndentedString(groupRadio5g)).append("\n");
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
