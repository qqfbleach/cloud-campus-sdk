/*
 * AP设备射频配置
 * AP设备射频配置第三方接口说明。 
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
 * 设备射频配置信息。
 */
@ApiModel(description = "设备射频配置信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:56.250+08:00")
public class ApDeviceRadioApiDto {
  @SerializedName("radio2dot4Enabled")
  private Boolean radio2dot4Enabled = null;

  @SerializedName("radio2dot4Power")
  private String radio2dot4Power = null;

  @SerializedName("radio2dot4Channel")
  private String radio2dot4Channel = null;

  /**
   * 2.4G调优频宽，调优带宽时选择auto，此时2.4G信道也应该为auto。
   */
  @JsonAdapter(Radio2dot4BandwidthEnum.Adapter.class)
  public enum Radio2dot4BandwidthEnum {
    AUTO("auto"),
    
    _20MHZ("20mhz"),
    
    _40MHZ_PLUS("40mhz-plus"),
    
    _40MHZ_MINUS("40mhz-minus");

    private String value;

    Radio2dot4BandwidthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Radio2dot4BandwidthEnum fromValue(String text) {
      for (Radio2dot4BandwidthEnum b : Radio2dot4BandwidthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Radio2dot4BandwidthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Radio2dot4BandwidthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Radio2dot4BandwidthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return Radio2dot4BandwidthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("radio2dot4Bandwidth")
  private Radio2dot4BandwidthEnum radio2dot4Bandwidth = null;

  @SerializedName("antenna2Dot4Gain")
  private String antenna2Dot4Gain = null;

  @SerializedName("radio5Enabled")
  private Boolean radio5Enabled = null;

  @SerializedName("radio5Power")
  private String radio5Power = null;

  @SerializedName("radio5Channel")
  private String radio5Channel = null;

  @SerializedName("antenna5Gain")
  private String antenna5Gain = null;

  /**
   * 5G射频频宽，调优带宽时选择auto，此时5G信道也应该为auto。
   */
  @JsonAdapter(Radio5BandwidthEnum.Adapter.class)
  public enum Radio5BandwidthEnum {
    AUTO("auto"),
    
    _20MHZ("20mhz"),
    
    _40MHZ_PLUS("40mhz-plus"),
    
    _40MHZ_MINUS("40mhz-minus"),
    
    _80MHZ("80mhz");

    private String value;

    Radio5BandwidthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Radio5BandwidthEnum fromValue(String text) {
      for (Radio5BandwidthEnum b : Radio5BandwidthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Radio5BandwidthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Radio5BandwidthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Radio5BandwidthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return Radio5BandwidthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("radio5Bandwidth")
  private Radio5BandwidthEnum radio5Bandwidth = null;

  public ApDeviceRadioApiDto radio2dot4Enabled(Boolean radio2dot4Enabled) {
    this.radio2dot4Enabled = radio2dot4Enabled;
    return this;
  }

   /**
   * 2.4G射频使能状态。
   * return radio2dot4Enabled
  **/
  @ApiModelProperty(required = true, value = "2.4G射频使能状态。")
  public Boolean getRadio2dot4Enabled() {
    return radio2dot4Enabled;
  }

   /**
   * 2.4G射频使能状态。
   * Param radio2dot4Enabled
  **/
  public void setRadio2dot4Enabled(Boolean radio2dot4Enabled) {
    this.radio2dot4Enabled = radio2dot4Enabled;
  }

  public ApDeviceRadioApiDto radio2dot4Power(String radio2dot4Power) {
    this.radio2dot4Power = radio2dot4Power;
    return this;
  }

   /**
   * 2.4G射频发射功率，auto，[1,127]。
   * return radio2dot4Power
  **/
  @ApiModelProperty(required = true, value = "2.4G射频发射功率，auto，[1,127]。")
  public String getRadio2dot4Power() {
    return radio2dot4Power;
  }

   /**
   * 2.4G射频发射功率，auto，[1,127]。
   * Param radio2dot4Power
  **/
  public void setRadio2dot4Power(String radio2dot4Power) {
    this.radio2dot4Power = radio2dot4Power;
  }

  public ApDeviceRadioApiDto radio2dot4Channel(String radio2dot4Channel) {
    this.radio2dot4Channel = radio2dot4Channel;
    return this;
  }

   /**
   * 2.4G射频信道，不同国家码，对应不同的射频信道范围。
   * return radio2dot4Channel
  **/
  @ApiModelProperty(required = true, value = "2.4G射频信道，不同国家码，对应不同的射频信道范围。")
  public String getRadio2dot4Channel() {
    return radio2dot4Channel;
  }

   /**
   * 2.4G射频信道，不同国家码，对应不同的射频信道范围。
   * Param radio2dot4Channel
  **/
  public void setRadio2dot4Channel(String radio2dot4Channel) {
    this.radio2dot4Channel = radio2dot4Channel;
  }

  public ApDeviceRadioApiDto radio2dot4Bandwidth(Radio2dot4BandwidthEnum radio2dot4Bandwidth) {
    this.radio2dot4Bandwidth = radio2dot4Bandwidth;
    return this;
  }

   /**
   * 2.4G调优频宽，调优带宽时选择auto，此时2.4G信道也应该为auto。
   * return radio2dot4Bandwidth
  **/
  @ApiModelProperty(required = true, value = "2.4G调优频宽，调优带宽时选择auto，此时2.4G信道也应该为auto。")
  public Radio2dot4BandwidthEnum getRadio2dot4Bandwidth() {
    return radio2dot4Bandwidth;
  }

   /**
   * 2.4G调优频宽，调优带宽时选择auto，此时2.4G信道也应该为auto。
   * Param radio2dot4Bandwidth
  **/
  public void setRadio2dot4Bandwidth(Radio2dot4BandwidthEnum radio2dot4Bandwidth) {
    this.radio2dot4Bandwidth = radio2dot4Bandwidth;
  }

  public ApDeviceRadioApiDto antenna2Dot4Gain(String antenna2Dot4Gain) {
    this.antenna2Dot4Gain = antenna2Dot4Gain;
    return this;
  }

   /**
   * 2.4G射频天线增益，0~30，室内AP天线增益不支持修改。
   * return antenna2Dot4Gain
  **/
  @ApiModelProperty(required = true, value = "2.4G射频天线增益，0~30，室内AP天线增益不支持修改。")
  public String getAntenna2Dot4Gain() {
    return antenna2Dot4Gain;
  }

   /**
   * 2.4G射频天线增益，0~30，室内AP天线增益不支持修改。
   * Param antenna2Dot4Gain
  **/
  public void setAntenna2Dot4Gain(String antenna2Dot4Gain) {
    this.antenna2Dot4Gain = antenna2Dot4Gain;
  }

  public ApDeviceRadioApiDto radio5Enabled(Boolean radio5Enabled) {
    this.radio5Enabled = radio5Enabled;
    return this;
  }

   /**
   * 5G射频使能状态。
   * return radio5Enabled
  **/
  @ApiModelProperty(required = true, value = "5G射频使能状态。")
  public Boolean getRadio5Enabled() {
    return radio5Enabled;
  }

   /**
   * 5G射频使能状态。
   * Param radio5Enabled
  **/
  public void setRadio5Enabled(Boolean radio5Enabled) {
    this.radio5Enabled = radio5Enabled;
  }

  public ApDeviceRadioApiDto radio5Power(String radio5Power) {
    this.radio5Power = radio5Power;
    return this;
  }

   /**
   * 5G射频发射功率，auto，[1,127]。
   * return radio5Power
  **/
  @ApiModelProperty(required = true, value = "5G射频发射功率，auto，[1,127]。")
  public String getRadio5Power() {
    return radio5Power;
  }

   /**
   * 5G射频发射功率，auto，[1,127]。
   * Param radio5Power
  **/
  public void setRadio5Power(String radio5Power) {
    this.radio5Power = radio5Power;
  }

  public ApDeviceRadioApiDto radio5Channel(String radio5Channel) {
    this.radio5Channel = radio5Channel;
    return this;
  }

   /**
   * 5G射频信道，不同国家码，对应不同的射频信道范围。
   * return radio5Channel
  **/
  @ApiModelProperty(required = true, value = "5G射频信道，不同国家码，对应不同的射频信道范围。")
  public String getRadio5Channel() {
    return radio5Channel;
  }

   /**
   * 5G射频信道，不同国家码，对应不同的射频信道范围。
   * Param radio5Channel
  **/
  public void setRadio5Channel(String radio5Channel) {
    this.radio5Channel = radio5Channel;
  }

  public ApDeviceRadioApiDto antenna5Gain(String antenna5Gain) {
    this.antenna5Gain = antenna5Gain;
    return this;
  }

   /**
   * 5G射频天线增益，0~30，室内AP天线增益不支持修改。
   * return antenna5Gain
  **/
  @ApiModelProperty(required = true, value = "5G射频天线增益，0~30，室内AP天线增益不支持修改。")
  public String getAntenna5Gain() {
    return antenna5Gain;
  }

   /**
   * 5G射频天线增益，0~30，室内AP天线增益不支持修改。
   * Param antenna5Gain
  **/
  public void setAntenna5Gain(String antenna5Gain) {
    this.antenna5Gain = antenna5Gain;
  }

  public ApDeviceRadioApiDto radio5Bandwidth(Radio5BandwidthEnum radio5Bandwidth) {
    this.radio5Bandwidth = radio5Bandwidth;
    return this;
  }

   /**
   * 5G射频频宽，调优带宽时选择auto，此时5G信道也应该为auto。
   * return radio5Bandwidth
  **/
  @ApiModelProperty(required = true, value = "5G射频频宽，调优带宽时选择auto，此时5G信道也应该为auto。")
  public Radio5BandwidthEnum getRadio5Bandwidth() {
    return radio5Bandwidth;
  }

   /**
   * 5G射频频宽，调优带宽时选择auto，此时5G信道也应该为auto。
   * Param radio5Bandwidth
  **/
  public void setRadio5Bandwidth(Radio5BandwidthEnum radio5Bandwidth) {
    this.radio5Bandwidth = radio5Bandwidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApDeviceRadioApiDto apDeviceRadioApiDto = (ApDeviceRadioApiDto) o;
    return Objects.equals(this.radio2dot4Enabled, apDeviceRadioApiDto.radio2dot4Enabled) &&
        Objects.equals(this.radio2dot4Power, apDeviceRadioApiDto.radio2dot4Power) &&
        Objects.equals(this.radio2dot4Channel, apDeviceRadioApiDto.radio2dot4Channel) &&
        Objects.equals(this.radio2dot4Bandwidth, apDeviceRadioApiDto.radio2dot4Bandwidth) &&
        Objects.equals(this.antenna2Dot4Gain, apDeviceRadioApiDto.antenna2Dot4Gain) &&
        Objects.equals(this.radio5Enabled, apDeviceRadioApiDto.radio5Enabled) &&
        Objects.equals(this.radio5Power, apDeviceRadioApiDto.radio5Power) &&
        Objects.equals(this.radio5Channel, apDeviceRadioApiDto.radio5Channel) &&
        Objects.equals(this.antenna5Gain, apDeviceRadioApiDto.antenna5Gain) &&
        Objects.equals(this.radio5Bandwidth, apDeviceRadioApiDto.radio5Bandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radio2dot4Enabled, radio2dot4Power, radio2dot4Channel, radio2dot4Bandwidth, antenna2Dot4Gain, radio5Enabled, radio5Power, radio5Channel, antenna5Gain, radio5Bandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApDeviceRadioApiDto {\n");
    
    sb.append("    radio2dot4Enabled: ").append(toIndentedString(radio2dot4Enabled)).append("\n");
    sb.append("    radio2dot4Power: ").append(toIndentedString(radio2dot4Power)).append("\n");
    sb.append("    radio2dot4Channel: ").append(toIndentedString(radio2dot4Channel)).append("\n");
    sb.append("    radio2dot4Bandwidth: ").append(toIndentedString(radio2dot4Bandwidth)).append("\n");
    sb.append("    antenna2Dot4Gain: ").append(toIndentedString(antenna2Dot4Gain)).append("\n");
    sb.append("    radio5Enabled: ").append(toIndentedString(radio5Enabled)).append("\n");
    sb.append("    radio5Power: ").append(toIndentedString(radio5Power)).append("\n");
    sb.append("    radio5Channel: ").append(toIndentedString(radio5Channel)).append("\n");
    sb.append("    antenna5Gain: ").append(toIndentedString(antenna5Gain)).append("\n");
    sb.append("    radio5Bandwidth: ").append(toIndentedString(radio5Bandwidth)).append("\n");
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

