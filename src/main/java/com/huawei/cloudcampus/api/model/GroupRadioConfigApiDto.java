/*
 * AP站点射频配置
 * AP站点射频配置第三方接口说明。 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 站点射频配置信息。
 */
@ApiModel(description = "站点射频配置信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:38.690+08:00")
public class GroupRadioConfigApiDto {
  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("scanDuration")
  private String scanDuration = null;

  @SerializedName("scanInterval")
  private String scanInterval = null;

  @SerializedName("scanChannel")
  private String scanChannel = null;

  @SerializedName("dca2gChannelSet")
  private String dca2gChannelSet = null;

  @SerializedName("dcaBandwidth")
  private String dcaBandwidth = null;

  @SerializedName("dca5gChannelSet")
  private String dca5gChannelSet = null;

  @SerializedName("calibrate")
  private String calibrate = null;

  @SerializedName("dcaStartTime")
  private String dcaStartTime = null;

  @SerializedName("dcaInterval")
  private Integer dcaInterval = null;

  @SerializedName("dcaScheduleTime")
  private String dcaScheduleTime = null;

  @SerializedName("tpcMaxTxPwr")
  private Integer tpcMaxTxPwr = null;

  @SerializedName("tpcMinTxPwr")
  private Integer tpcMinTxPwr = null;

  @SerializedName("tpcCoverageThreshold")
  private Integer tpcCoverageThreshold = null;

  @SerializedName("radio2Dot4GuardIntervalMode")
  private String radio2Dot4GuardIntervalMode = null;

  @SerializedName("radio5GuardIntervalMode")
  private String radio5GuardIntervalMode = null;

  @SerializedName("referenceDataAnalysis")
  private Boolean referenceDataAnalysis = null;

  public GroupRadioConfigApiDto countryCode(String countryCode) {
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

  public GroupRadioConfigApiDto scanDuration(String scanDuration) {
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

  public GroupRadioConfigApiDto scanInterval(String scanInterval) {
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

  public GroupRadioConfigApiDto scanChannel(String scanChannel) {
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

  public GroupRadioConfigApiDto dca2gChannelSet(String dca2gChannelSet) {
    this.dca2gChannelSet = dca2gChannelSet;
    return this;
  }

   /**
   * 2.4G调优信道集。可选\&quot;1，6，11\&quot;和\&quot;1，5，9，13\&quot;两种信道集。
   * return dca2gChannelSet
  **/
  @ApiModelProperty(value = "2.4G调优信道集。可选\"1，6，11\"和\"1，5，9，13\"两种信道集。")
  public String getDca2gChannelSet() {
    return dca2gChannelSet;
  }

   /**
   * 2.4G调优信道集。可选\&quot;1，6，11\&quot;和\&quot;1，5，9，13\&quot;两种信道集。
   * Param dca2gChannelSet
  **/
  public void setDca2gChannelSet(String dca2gChannelSet) {
    this.dca2gChannelSet = dca2gChannelSet;
  }

  public GroupRadioConfigApiDto dcaBandwidth(String dcaBandwidth) {
    this.dcaBandwidth = dcaBandwidth;
    return this;
  }

   /**
   * 5G调优频宽，只能为20mhz，40mhz，80mhz其中一种。
   * return dcaBandwidth
  **/
  @ApiModelProperty(value = "5G调优频宽，只能为20mhz，40mhz，80mhz其中一种。")
  public String getDcaBandwidth() {
    return dcaBandwidth;
  }

   /**
   * 5G调优频宽，只能为20mhz，40mhz，80mhz其中一种。
   * Param dcaBandwidth
  **/
  public void setDcaBandwidth(String dcaBandwidth) {
    this.dcaBandwidth = dcaBandwidth;
  }

  public GroupRadioConfigApiDto dca5gChannelSet(String dca5gChannelSet) {
    this.dca5gChannelSet = dca5gChannelSet;
    return this;
  }

   /**
   * 5G调优信道集。当5G调优频宽为20MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161，165； 当5G调优信道为40MHz或80MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161。 为了确保校准结果，请选择至少三个选项。若可选信道少于三个，则此国家不支持配置此调优频宽。
   * return dca5gChannelSet
  **/
  @ApiModelProperty(value = "5G调优信道集。当5G调优频宽为20MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161，165； 当5G调优信道为40MHz或80MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161。 为了确保校准结果，请选择至少三个选项。若可选信道少于三个，则此国家不支持配置此调优频宽。")
  public String getDca5gChannelSet() {
    return dca5gChannelSet;
  }

   /**
   * 5G调优信道集。当5G调优频宽为20MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161，165； 当5G调优信道为40MHz或80MHz时，支持的信道有36，40，44，48，52，56，60，64，149，153，157，161。 为了确保校准结果，请选择至少三个选项。若可选信道少于三个，则此国家不支持配置此调优频宽。
   * Param dca5gChannelSet
  **/
  public void setDca5gChannelSet(String dca5gChannelSet) {
    this.dca5gChannelSet = dca5gChannelSet;
  }

  public GroupRadioConfigApiDto calibrate(String calibrate) {
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

  public GroupRadioConfigApiDto dcaStartTime(String dcaStartTime) {
    this.dcaStartTime = dcaStartTime;
    return this;
  }

   /**
   * 自动调优模式下开始时间。
   * return dcaStartTime
  **/
  @ApiModelProperty(value = "自动调优模式下开始时间。")
  public String getDcaStartTime() {
    return dcaStartTime;
  }

   /**
   * 自动调优模式下开始时间。
   * Param dcaStartTime
  **/
  public void setDcaStartTime(String dcaStartTime) {
    this.dcaStartTime = dcaStartTime;
  }

  public GroupRadioConfigApiDto dcaInterval(Integer dcaInterval) {
    this.dcaInterval = dcaInterval;
    return this;
  }

   /**
   * 自动调优模式下周期，单位（min）。
   * minimum: 30
   * maximum: 1440
   * return dcaInterval
  **/
  @ApiModelProperty(value = "自动调优模式下周期，单位（min）。")
  public Integer getDcaInterval() {
    return dcaInterval;
  }

   /**
   * 自动调优模式下周期，单位（min）。
   * minimum: 30
   * maximum: 1440
   * Param dcaInterval
  **/
  public void setDcaInterval(Integer dcaInterval) {
    this.dcaInterval = dcaInterval;
  }

  public GroupRadioConfigApiDto dcaScheduleTime(String dcaScheduleTime) {
    this.dcaScheduleTime = dcaScheduleTime;
    return this;
  }

   /**
   * 定时调优模式下调优时间。
   * return dcaScheduleTime
  **/
  @ApiModelProperty(value = "定时调优模式下调优时间。")
  public String getDcaScheduleTime() {
    return dcaScheduleTime;
  }

   /**
   * 定时调优模式下调优时间。
   * Param dcaScheduleTime
  **/
  public void setDcaScheduleTime(String dcaScheduleTime) {
    this.dcaScheduleTime = dcaScheduleTime;
  }

  public GroupRadioConfigApiDto tpcMaxTxPwr(Integer tpcMaxTxPwr) {
    this.tpcMaxTxPwr = tpcMaxTxPwr;
    return this;
  }

   /**
   * TPC上限。
   * minimum: 1
   * maximum: 127
   * return tpcMaxTxPwr
  **/
  @ApiModelProperty(value = "TPC上限。")
  public Integer getTpcMaxTxPwr() {
    return tpcMaxTxPwr;
  }

   /**
   * TPC上限。
   * minimum: 1
   * maximum: 127
   * Param tpcMaxTxPwr
  **/
  public void setTpcMaxTxPwr(Integer tpcMaxTxPwr) {
    this.tpcMaxTxPwr = tpcMaxTxPwr;
  }

  public GroupRadioConfigApiDto tpcMinTxPwr(Integer tpcMinTxPwr) {
    this.tpcMinTxPwr = tpcMinTxPwr;
    return this;
  }

   /**
   * TPC下限。
   * minimum: 1
   * maximum: 127
   * return tpcMinTxPwr
  **/
  @ApiModelProperty(value = "TPC下限。")
  public Integer getTpcMinTxPwr() {
    return tpcMinTxPwr;
  }

   /**
   * TPC下限。
   * minimum: 1
   * maximum: 127
   * Param tpcMinTxPwr
  **/
  public void setTpcMinTxPwr(Integer tpcMinTxPwr) {
    this.tpcMinTxPwr = tpcMinTxPwr;
  }

  public GroupRadioConfigApiDto tpcCoverageThreshold(Integer tpcCoverageThreshold) {
    this.tpcCoverageThreshold = tpcCoverageThreshold;
    return this;
  }

   /**
   * TPC阈值。
   * minimum: -85
   * maximum: -35
   * return tpcCoverageThreshold
  **/
  @ApiModelProperty(value = "TPC阈值。")
  public Integer getTpcCoverageThreshold() {
    return tpcCoverageThreshold;
  }

   /**
   * TPC阈值。
   * minimum: -85
   * maximum: -35
   * Param tpcCoverageThreshold
  **/
  public void setTpcCoverageThreshold(Integer tpcCoverageThreshold) {
    this.tpcCoverageThreshold = tpcCoverageThreshold;
  }

  public GroupRadioConfigApiDto radio2Dot4GuardIntervalMode(String radio2Dot4GuardIntervalMode) {
    this.radio2Dot4GuardIntervalMode = radio2Dot4GuardIntervalMode;
    return this;
  }

   /**
   * 2.4G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。
   * return radio2Dot4GuardIntervalMode
  **/
  @ApiModelProperty(value = "2.4G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。")
  public String getRadio2Dot4GuardIntervalMode() {
    return radio2Dot4GuardIntervalMode;
  }

   /**
   * 2.4G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。
   * Param radio2Dot4GuardIntervalMode
  **/
  public void setRadio2Dot4GuardIntervalMode(String radio2Dot4GuardIntervalMode) {
    this.radio2Dot4GuardIntervalMode = radio2Dot4GuardIntervalMode;
  }

  public GroupRadioConfigApiDto radio5GuardIntervalMode(String radio5GuardIntervalMode) {
    this.radio5GuardIntervalMode = radio5GuardIntervalMode;
    return this;
  }

   /**
   * 5G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。
   * return radio5GuardIntervalMode
  **/
  @ApiModelProperty(value = "5G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。")
  public String getRadio5GuardIntervalMode() {
    return radio5GuardIntervalMode;
  }

   /**
   * 5G射频间隔(GI)模式，可填default(默认)、short(短间隔)或normal(普通间隔)。普通间隔的时间为800ns，在802.11n和802.11ac标准中允许使用短间隔，为400ns，可以提高802.11n和802.11ac的传输率。
   * Param radio5GuardIntervalMode
  **/
  public void setRadio5GuardIntervalMode(String radio5GuardIntervalMode) {
    this.radio5GuardIntervalMode = radio5GuardIntervalMode;
  }

  public GroupRadioConfigApiDto referenceDataAnalysis(Boolean referenceDataAnalysis) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRadioConfigApiDto groupRadioConfigApiDto = (GroupRadioConfigApiDto) o;
    return Objects.equals(this.countryCode, groupRadioConfigApiDto.countryCode) &&
        Objects.equals(this.scanDuration, groupRadioConfigApiDto.scanDuration) &&
        Objects.equals(this.scanInterval, groupRadioConfigApiDto.scanInterval) &&
        Objects.equals(this.scanChannel, groupRadioConfigApiDto.scanChannel) &&
        Objects.equals(this.dca2gChannelSet, groupRadioConfigApiDto.dca2gChannelSet) &&
        Objects.equals(this.dcaBandwidth, groupRadioConfigApiDto.dcaBandwidth) &&
        Objects.equals(this.dca5gChannelSet, groupRadioConfigApiDto.dca5gChannelSet) &&
        Objects.equals(this.calibrate, groupRadioConfigApiDto.calibrate) &&
        Objects.equals(this.dcaStartTime, groupRadioConfigApiDto.dcaStartTime) &&
        Objects.equals(this.dcaInterval, groupRadioConfigApiDto.dcaInterval) &&
        Objects.equals(this.dcaScheduleTime, groupRadioConfigApiDto.dcaScheduleTime) &&
        Objects.equals(this.tpcMaxTxPwr, groupRadioConfigApiDto.tpcMaxTxPwr) &&
        Objects.equals(this.tpcMinTxPwr, groupRadioConfigApiDto.tpcMinTxPwr) &&
        Objects.equals(this.tpcCoverageThreshold, groupRadioConfigApiDto.tpcCoverageThreshold) &&
        Objects.equals(this.radio2Dot4GuardIntervalMode, groupRadioConfigApiDto.radio2Dot4GuardIntervalMode) &&
        Objects.equals(this.radio5GuardIntervalMode, groupRadioConfigApiDto.radio5GuardIntervalMode) &&
        Objects.equals(this.referenceDataAnalysis, groupRadioConfigApiDto.referenceDataAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, scanDuration, scanInterval, scanChannel, dca2gChannelSet, dcaBandwidth, dca5gChannelSet, calibrate, dcaStartTime, dcaInterval, dcaScheduleTime, tpcMaxTxPwr, tpcMinTxPwr, tpcCoverageThreshold, radio2Dot4GuardIntervalMode, radio5GuardIntervalMode, referenceDataAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRadioConfigApiDto {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    scanDuration: ").append(toIndentedString(scanDuration)).append("\n");
    sb.append("    scanInterval: ").append(toIndentedString(scanInterval)).append("\n");
    sb.append("    scanChannel: ").append(toIndentedString(scanChannel)).append("\n");
    sb.append("    dca2gChannelSet: ").append(toIndentedString(dca2gChannelSet)).append("\n");
    sb.append("    dcaBandwidth: ").append(toIndentedString(dcaBandwidth)).append("\n");
    sb.append("    dca5gChannelSet: ").append(toIndentedString(dca5gChannelSet)).append("\n");
    sb.append("    calibrate: ").append(toIndentedString(calibrate)).append("\n");
    sb.append("    dcaStartTime: ").append(toIndentedString(dcaStartTime)).append("\n");
    sb.append("    dcaInterval: ").append(toIndentedString(dcaInterval)).append("\n");
    sb.append("    dcaScheduleTime: ").append(toIndentedString(dcaScheduleTime)).append("\n");
    sb.append("    tpcMaxTxPwr: ").append(toIndentedString(tpcMaxTxPwr)).append("\n");
    sb.append("    tpcMinTxPwr: ").append(toIndentedString(tpcMinTxPwr)).append("\n");
    sb.append("    tpcCoverageThreshold: ").append(toIndentedString(tpcCoverageThreshold)).append("\n");
    sb.append("    radio2Dot4GuardIntervalMode: ").append(toIndentedString(radio2Dot4GuardIntervalMode)).append("\n");
    sb.append("    radio5GuardIntervalMode: ").append(toIndentedString(radio5GuardIntervalMode)).append("\n");
    sb.append("    referenceDataAnalysis: ").append(toIndentedString(referenceDataAnalysis)).append("\n");
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

