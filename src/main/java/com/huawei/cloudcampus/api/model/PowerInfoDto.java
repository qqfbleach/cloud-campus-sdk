/*
 * 框式交换机板卡信息操作
 * 框式上云相关操作接口： 场景：对框式交换机信息查询操作的第三方接口。
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

/**
 * 电源信息结果。
 */
@ApiModel(description = "电源信息结果。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:14.794+08:00")
public class PowerInfoDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("ratedPower")
  private Integer ratedPower = null;

  @SerializedName("current")
  private Integer current = null;

  @SerializedName("voltage")
  private Integer voltage = null;

  @SerializedName("realtimePower")
  private Integer realtimePower = null;

  @SerializedName("role")
  private String role = null;

  public PowerInfoDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 电源模块编号。
   * return id
  **/
  @ApiModelProperty(value = "电源模块编号。")
  public String getId() {
    return id;
  }

   /**
   * 电源模块编号。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public PowerInfoDto mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * 电源模式。取值范围：0（AC：交流电源）；1（DC：直流电源）；2（hvdc高压直流电源）；3（NA：表示电源在位但是无法获取模式信息）。
   * return mode
  **/
  @ApiModelProperty(value = "电源模式。取值范围：0（AC：交流电源）；1（DC：直流电源）；2（hvdc高压直流电源）；3（NA：表示电源在位但是无法获取模式信息）。")
  public String getMode() {
    return mode;
  }

   /**
   * 电源模式。取值范围：0（AC：交流电源）；1（DC：直流电源）；2（hvdc高压直流电源）；3（NA：表示电源在位但是无法获取模式信息）。
   * Param mode
  **/
  public void setMode(String mode) {
    this.mode = mode;
  }

  public PowerInfoDto state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 电源注册状态。取值范围：1（表示NotSupply无电流输出）；0（表示Supply有电流输出）。
   * return state
  **/
  @ApiModelProperty(value = "电源注册状态。取值范围：1（表示NotSupply无电流输出）；0（表示Supply有电流输出）。")
  public String getState() {
    return state;
  }

   /**
   * 电源注册状态。取值范围：1（表示NotSupply无电流输出）；0（表示Supply有电流输出）。
   * Param state
  **/
  public void setState(String state) {
    this.state = state;
  }

  public PowerInfoDto ratedPower(Integer ratedPower) {
    this.ratedPower = ratedPower;
    return this;
  }

   /**
   * 单板额定功率，单位是W。
   * return ratedPower
  **/
  @ApiModelProperty(value = "单板额定功率，单位是W。")
  public Integer getRatedPower() {
    return ratedPower;
  }

   /**
   * 单板额定功率，单位是W。
   * Param ratedPower
  **/
  public void setRatedPower(Integer ratedPower) {
    this.ratedPower = ratedPower;
  }

  public PowerInfoDto current(Integer current) {
    this.current = current;
    return this;
  }

   /**
   * 电源供电电流，单位是A。
   * return current
  **/
  @ApiModelProperty(value = "电源供电电流，单位是A。")
  public Integer getCurrent() {
    return current;
  }

   /**
   * 电源供电电流，单位是A。
   * Param current
  **/
  public void setCurrent(Integer current) {
    this.current = current;
  }

  public PowerInfoDto voltage(Integer voltage) {
    this.voltage = voltage;
    return this;
  }

   /**
   * 电源供电电压，单位是V。
   * return voltage
  **/
  @ApiModelProperty(value = "电源供电电压，单位是V。")
  public Integer getVoltage() {
    return voltage;
  }

   /**
   * 电源供电电压，单位是V。
   * Param voltage
  **/
  public void setVoltage(Integer voltage) {
    this.voltage = voltage;
  }

  public PowerInfoDto realtimePower(Integer realtimePower) {
    this.realtimePower = realtimePower;
    return this;
  }

   /**
   * 实时功率，单位是W。
   * return realtimePower
  **/
  @ApiModelProperty(value = "实时功率，单位是W。")
  public Integer getRealtimePower() {
    return realtimePower;
  }

   /**
   * 实时功率，单位是W。
   * Param realtimePower
  **/
  public void setRealtimePower(Integer realtimePower) {
    this.realtimePower = realtimePower;
  }

  public PowerInfoDto role(String role) {
    this.role = role;
    return this;
  }

   /**
   * 电源模块的角色。取值范围：1（M主用电源）；2（S备用电源）；3（A始终供电电源）；0（-表示电源不在位或未注册）。
   * return role
  **/
  @ApiModelProperty(value = "电源模块的角色。取值范围：1（M主用电源）；2（S备用电源）；3（A始终供电电源）；0（-表示电源不在位或未注册）。")
  public String getRole() {
    return role;
  }

   /**
   * 电源模块的角色。取值范围：1（M主用电源）；2（S备用电源）；3（A始终供电电源）；0（-表示电源不在位或未注册）。
   * Param role
  **/
  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerInfoDto powerInfoDto = (PowerInfoDto) o;
    return Objects.equals(this.id, powerInfoDto.id) &&
        Objects.equals(this.mode, powerInfoDto.mode) &&
        Objects.equals(this.state, powerInfoDto.state) &&
        Objects.equals(this.ratedPower, powerInfoDto.ratedPower) &&
        Objects.equals(this.current, powerInfoDto.current) &&
        Objects.equals(this.voltage, powerInfoDto.voltage) &&
        Objects.equals(this.realtimePower, powerInfoDto.realtimePower) &&
        Objects.equals(this.role, powerInfoDto.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mode, state, ratedPower, current, voltage, realtimePower, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerInfoDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ratedPower: ").append(toIndentedString(ratedPower)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
    sb.append("    realtimePower: ").append(toIndentedString(realtimePower)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

