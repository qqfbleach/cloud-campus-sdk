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
import com.huawei.cloudcampus.api.model.DeviceBaseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 已布放设备详细信息。
 */
@ApiModel(description = "已布放设备详细信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:40.522+08:00")
public class LocatedDeviceDetails {
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

  @SerializedName("esn")
  private String esn = null;

  @SerializedName("mac")
  private String mac = null;

  @SerializedName("description")
  private String description = null;

  /**
   * AP分类 cloud AP：云AP distributed AP：云分布式AP cloud central AP：云中心AP 
   */
  @JsonAdapter(ApTypeEnum.Adapter.class)
  public enum ApTypeEnum {
    CLOUD_AP("cloud AP"),
    
    DISTRIBUTED_AP("distributed AP"),
    
    CLOUD_CENTRAL_AP("cloud central AP");

    private String value;

    ApTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApTypeEnum fromValue(String text) {
      for (ApTypeEnum b : ApTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("apType")
  private ApTypeEnum apType = null;

  @SerializedName("positionX")
  private Integer positionX = null;

  @SerializedName("positionY")
  private Integer positionY = null;

  @SerializedName("planPositionX")
  private Integer planPositionX = null;

  @SerializedName("planPositionY")
  private Integer planPositionY = null;

  @SerializedName("planPointId")
  private String planPointId = null;

  public LocatedDeviceDetails id(String id) {
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

  public LocatedDeviceDetails name(String name) {
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

  public LocatedDeviceDetails status(StatusEnum status) {
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

  public LocatedDeviceDetails esn(String esn) {
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

  public LocatedDeviceDetails mac(String mac) {
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

  public LocatedDeviceDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 设备备注信息。
   * return description
  **/
  @ApiModelProperty(value = "设备备注信息。")
  public String getDescription() {
    return description;
  }

   /**
   * 设备备注信息。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public LocatedDeviceDetails apType(ApTypeEnum apType) {
    this.apType = apType;
    return this;
  }

   /**
   * AP分类 cloud AP：云AP distributed AP：云分布式AP cloud central AP：云中心AP 
   * return apType
  **/
  @ApiModelProperty(value = "AP分类 cloud AP：云AP distributed AP：云分布式AP cloud central AP：云中心AP ")
  public ApTypeEnum getApType() {
    return apType;
  }

   /**
   * AP分类 cloud AP：云AP distributed AP：云分布式AP cloud central AP：云中心AP 
   * Param apType
  **/
  public void setApType(ApTypeEnum apType) {
    this.apType = apType;
  }

  public LocatedDeviceDetails positionX(Integer positionX) {
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

  public LocatedDeviceDetails positionY(Integer positionY) {
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

  public LocatedDeviceDetails planPositionX(Integer planPositionX) {
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

  public LocatedDeviceDetails planPositionY(Integer planPositionY) {
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

  public LocatedDeviceDetails planPointId(String planPointId) {
    this.planPointId = planPointId;
    return this;
  }

   /**
   * 网规规划点ID，格式UUID。
   * return planPointId
  **/
  @ApiModelProperty(value = "网规规划点ID，格式UUID。")
  public String getPlanPointId() {
    return planPointId;
  }

   /**
   * 网规规划点ID，格式UUID。
   * Param planPointId
  **/
  public void setPlanPointId(String planPointId) {
    this.planPointId = planPointId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatedDeviceDetails locatedDeviceDetails = (LocatedDeviceDetails) o;
    return Objects.equals(this.id, locatedDeviceDetails.id) &&
        Objects.equals(this.name, locatedDeviceDetails.name) &&
        Objects.equals(this.status, locatedDeviceDetails.status) &&
        Objects.equals(this.esn, locatedDeviceDetails.esn) &&
        Objects.equals(this.mac, locatedDeviceDetails.mac) &&
        Objects.equals(this.description, locatedDeviceDetails.description) &&
        Objects.equals(this.apType, locatedDeviceDetails.apType) &&
        Objects.equals(this.positionX, locatedDeviceDetails.positionX) &&
        Objects.equals(this.positionY, locatedDeviceDetails.positionY) &&
        Objects.equals(this.planPositionX, locatedDeviceDetails.planPositionX) &&
        Objects.equals(this.planPositionY, locatedDeviceDetails.planPositionY) &&
        Objects.equals(this.planPointId, locatedDeviceDetails.planPointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, esn, mac, description, apType, positionX, positionY, planPositionX, planPositionY, planPointId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatedDeviceDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    apType: ").append(toIndentedString(apType)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
    sb.append("    planPositionX: ").append(toIndentedString(planPositionX)).append("\n");
    sb.append("    planPositionY: ").append(toIndentedString(planPositionY)).append("\n");
    sb.append("    planPointId: ").append(toIndentedString(planPointId)).append("\n");
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

