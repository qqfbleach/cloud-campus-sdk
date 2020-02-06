/*
 * 室内地图信息查询
 * 室内地图第三方北向接口。 · 查询站点中所有楼栋基本信息 · 查询楼栋中所有楼层基本信息 · 查询楼栋中所有楼层详细信息 · 查询楼栋中楼层和设备布放信息 · 查询楼栋中楼层已布放设备详细信息 · 查询楼层已布放设备位置信息 
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
import com.huawei.cloudcampus.api.model.DeviceInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 已布放设备信息。
 */
@ApiModel(description = "已布放设备信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:40.522+08:00")
public class LocatedDeviceInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    _0("0"),
    
    _1("1"),
    
    _3("3"),
    
    _4("4");

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

  /**
   * 设备类型。
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    AP("AP"),
    
    AR("AR"),
    
    FW("FW"),
    
    LSW("LSW"),
    
    AC("AC"),
    
    OLT("OLT"),
    
    ONT("ONT");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deviceType")
  private DeviceTypeEnum deviceType = null;

  @SerializedName("positionX")
  private Integer positionX = null;

  @SerializedName("positionY")
  private Integer positionY = null;

  @SerializedName("planPositionX")
  private Integer planPositionX = null;

  @SerializedName("planPositionY")
  private Integer planPositionY = null;

  public LocatedDeviceInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 设备ID，格式UUID。
   * return id
  **/
  @ApiModelProperty(required = true, value = "设备ID，格式UUID。")
  public String getId() {
    return id;
  }

   /**
   * 设备ID，格式UUID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public LocatedDeviceInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 设备名称。
   * return name
  **/
  @ApiModelProperty(required = true, value = "设备名称。")
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

  public LocatedDeviceInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   * return status
  **/
  @ApiModelProperty(required = true, value = "设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 ")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   * Param status
  **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LocatedDeviceInfo deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * 设备类型。
   * return deviceType
  **/
  @ApiModelProperty(value = "设备类型。")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

   /**
   * 设备类型。
   * Param deviceType
  **/
  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public LocatedDeviceInfo positionX(Integer positionX) {
    this.positionX = positionX;
    return this;
  }

   /**
   * 设备布放坐标X，单位：像素。
   * return positionX
  **/
  @ApiModelProperty(value = "设备布放坐标X，单位：像素。")
  public Integer getPositionX() {
    return positionX;
  }

   /**
   * 设备布放坐标X，单位：像素。
   * Param positionX
  **/
  public void setPositionX(Integer positionX) {
    this.positionX = positionX;
  }

  public LocatedDeviceInfo positionY(Integer positionY) {
    this.positionY = positionY;
    return this;
  }

   /**
   * 设备布放坐标Y，单位：像素。
   * return positionY
  **/
  @ApiModelProperty(value = "设备布放坐标Y，单位：像素。")
  public Integer getPositionY() {
    return positionY;
  }

   /**
   * 设备布放坐标Y，单位：像素。
   * Param positionY
  **/
  public void setPositionY(Integer positionY) {
    this.positionY = positionY;
  }

  public LocatedDeviceInfo planPositionX(Integer planPositionX) {
    this.planPositionX = planPositionX;
    return this;
  }

   /**
   * 设备规划坐标X，单位：像素。
   * return planPositionX
  **/
  @ApiModelProperty(value = "设备规划坐标X，单位：像素。")
  public Integer getPlanPositionX() {
    return planPositionX;
  }

   /**
   * 设备规划坐标X，单位：像素。
   * Param planPositionX
  **/
  public void setPlanPositionX(Integer planPositionX) {
    this.planPositionX = planPositionX;
  }

  public LocatedDeviceInfo planPositionY(Integer planPositionY) {
    this.planPositionY = planPositionY;
    return this;
  }

   /**
   * 设备规划坐标Y，单位：像素。
   * return planPositionY
  **/
  @ApiModelProperty(value = "设备规划坐标Y，单位：像素。")
  public Integer getPlanPositionY() {
    return planPositionY;
  }

   /**
   * 设备规划坐标Y，单位：像素。
   * Param planPositionY
  **/
  public void setPlanPositionY(Integer planPositionY) {
    this.planPositionY = planPositionY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatedDeviceInfo locatedDeviceInfo = (LocatedDeviceInfo) o;
    return Objects.equals(this.id, locatedDeviceInfo.id) &&
        Objects.equals(this.name, locatedDeviceInfo.name) &&
        Objects.equals(this.status, locatedDeviceInfo.status) &&
        Objects.equals(this.deviceType, locatedDeviceInfo.deviceType) &&
        Objects.equals(this.positionX, locatedDeviceInfo.positionX) &&
        Objects.equals(this.positionY, locatedDeviceInfo.positionY) &&
        Objects.equals(this.planPositionX, locatedDeviceInfo.planPositionX) &&
        Objects.equals(this.planPositionY, locatedDeviceInfo.planPositionY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, deviceType, positionX, positionY, planPositionX, planPositionY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatedDeviceInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
    sb.append("    planPositionX: ").append(toIndentedString(planPositionX)).append("\n");
    sb.append("    planPositionY: ").append(toIndentedString(planPositionY)).append("\n");
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

