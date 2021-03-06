/*
 * 防火墙特征库升级
 * 防火墙特征库升级接口 
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
 * UpgradePolicydetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:03.141+08:00")
public class UpgradePolicydetail {
  @SerializedName("deviceId")
  private String deviceId = null;

  /**
   * 设备特征库升级类型。
   */
  @JsonAdapter(SignatureDatabaseTypeEnum.Adapter.class)
  public enum SignatureDatabaseTypeEnum {
    IP_REPUTATION("ip-reputation"),
    
    ANTIVIRUS("antivirus"),
    
    INTRUSION_PREVENTION("intrusion-prevention"),
    
    FILE_REPUTATION("file-reputation"),
    
    CNC("cnc"),
    
    APPLICATION("application");

    private String value;

    SignatureDatabaseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureDatabaseTypeEnum fromValue(String text) {
      for (SignatureDatabaseTypeEnum b : SignatureDatabaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureDatabaseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureDatabaseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureDatabaseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureDatabaseTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureDatabaseType")
  private SignatureDatabaseTypeEnum signatureDatabaseType = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("lastUpgradeTime")
  private Long lastUpgradeTime = null;

  @SerializedName("nextUpgradeTime")
  private Long nextUpgradeTime = null;

  public UpgradePolicydetail deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备标识，UUID格式。
   * return deviceId
  **/
  @ApiModelProperty(value = "设备标识，UUID格式。")
  public String getDeviceId() {
    return deviceId;
  }

   /**
   * 设备标识，UUID格式。
   * Param deviceId
  **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public UpgradePolicydetail signatureDatabaseType(SignatureDatabaseTypeEnum signatureDatabaseType) {
    this.signatureDatabaseType = signatureDatabaseType;
    return this;
  }

   /**
   * 设备特征库升级类型。
   * return signatureDatabaseType
  **/
  @ApiModelProperty(value = "设备特征库升级类型。")
  public SignatureDatabaseTypeEnum getSignatureDatabaseType() {
    return signatureDatabaseType;
  }

   /**
   * 设备特征库升级类型。
   * Param signatureDatabaseType
  **/
  public void setSignatureDatabaseType(SignatureDatabaseTypeEnum signatureDatabaseType) {
    this.signatureDatabaseType = signatureDatabaseType;
  }

  public UpgradePolicydetail version(String version) {
    this.version = version;
    return this;
  }

   /**
   * 设备特征库版本。
   * return version
  **/
  @ApiModelProperty(value = "设备特征库版本。")
  public String getVersion() {
    return version;
  }

   /**
   * 设备特征库版本。
   * Param version
  **/
  public void setVersion(String version) {
    this.version = version;
  }

  public UpgradePolicydetail status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 设备特征库升级状态。取值如下：-1---升级失败，0---未配置，1---初始化 ，10---升级完成，11---升级中。
   * return status
  **/
  @ApiModelProperty(value = "设备特征库升级状态。取值如下：-1---升级失败，0---未配置，1---初始化 ，10---升级完成，11---升级中。")
  public Integer getStatus() {
    return status;
  }

   /**
   * 设备特征库升级状态。取值如下：-1---升级失败，0---未配置，1---初始化 ，10---升级完成，11---升级中。
   * Param status
  **/
  public void setStatus(Integer status) {
    this.status = status;
  }

  public UpgradePolicydetail lastUpgradeTime(Long lastUpgradeTime) {
    this.lastUpgradeTime = lastUpgradeTime;
    return this;
  }

   /**
   * 上次特征库升级时间，UTC时间格式。
   * minimum: 0
   * maximum: 4102416000
   * return lastUpgradeTime
  **/
  @ApiModelProperty(value = "上次特征库升级时间，UTC时间格式。")
  public Long getLastUpgradeTime() {
    return lastUpgradeTime;
  }

   /**
   * 上次特征库升级时间，UTC时间格式。
   * minimum: 0
   * maximum: 4102416000
   * Param lastUpgradeTime
  **/
  public void setLastUpgradeTime(Long lastUpgradeTime) {
    this.lastUpgradeTime = lastUpgradeTime;
  }

  public UpgradePolicydetail nextUpgradeTime(Long nextUpgradeTime) {
    this.nextUpgradeTime = nextUpgradeTime;
    return this;
  }

   /**
   * 下次特征库升级时间，UTC时间格式。
   * minimum: 0
   * maximum: 4102416000
   * return nextUpgradeTime
  **/
  @ApiModelProperty(value = "下次特征库升级时间，UTC时间格式。")
  public Long getNextUpgradeTime() {
    return nextUpgradeTime;
  }

   /**
   * 下次特征库升级时间，UTC时间格式。
   * minimum: 0
   * maximum: 4102416000
   * Param nextUpgradeTime
  **/
  public void setNextUpgradeTime(Long nextUpgradeTime) {
    this.nextUpgradeTime = nextUpgradeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradePolicydetail upgradePolicydetail = (UpgradePolicydetail) o;
    return Objects.equals(this.deviceId, upgradePolicydetail.deviceId) &&
        Objects.equals(this.signatureDatabaseType, upgradePolicydetail.signatureDatabaseType) &&
        Objects.equals(this.version, upgradePolicydetail.version) &&
        Objects.equals(this.status, upgradePolicydetail.status) &&
        Objects.equals(this.lastUpgradeTime, upgradePolicydetail.lastUpgradeTime) &&
        Objects.equals(this.nextUpgradeTime, upgradePolicydetail.nextUpgradeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, signatureDatabaseType, version, status, lastUpgradeTime, nextUpgradeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradePolicydetail {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    signatureDatabaseType: ").append(toIndentedString(signatureDatabaseType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpgradeTime: ").append(toIndentedString(lastUpgradeTime)).append("\n");
    sb.append("    nextUpgradeTime: ").append(toIndentedString(nextUpgradeTime)).append("\n");
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

