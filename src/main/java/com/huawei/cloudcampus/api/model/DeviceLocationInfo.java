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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 设备位置信息
 */
@ApiModel(description = "设备位置信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:40.522+08:00")
public class DeviceLocationInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("buildingId")
  private String buildingId = null;

  @SerializedName("buildingName")
  private String buildingName = null;

  @SerializedName("floorId")
  private String floorId = null;

  @SerializedName("floorNumber")
  private String floorNumber = null;

  @SerializedName("floorName")
  private String floorName = null;

  @SerializedName("positionX")
  private Integer positionX = null;

  @SerializedName("positionY")
  private Integer positionY = null;

  @SerializedName("planPositionX")
  private Integer planPositionX = null;

  @SerializedName("planPositionY")
  private Integer planPositionY = null;

  public DeviceLocationInfo id(String id) {
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

  public DeviceLocationInfo buildingId(String buildingId) {
    this.buildingId = buildingId;
    return this;
  }

   /**
   * 楼栋ID，格式UUID。
   * return buildingId
  **/
  @ApiModelProperty(value = "楼栋ID，格式UUID。")
  public String getBuildingId() {
    return buildingId;
  }

   /**
   * 楼栋ID，格式UUID。
   * Param buildingId
  **/
  public void setBuildingId(String buildingId) {
    this.buildingId = buildingId;
  }

  public DeviceLocationInfo buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * 楼栋名称。
   * return buildingName
  **/
  @ApiModelProperty(value = "楼栋名称。")
  public String getBuildingName() {
    return buildingName;
  }

   /**
   * 楼栋名称。
   * Param buildingName
  **/
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public DeviceLocationInfo floorId(String floorId) {
    this.floorId = floorId;
    return this;
  }

   /**
   * 楼层ID，格式UUID。
   * return floorId
  **/
  @ApiModelProperty(value = "楼层ID，格式UUID。")
  public String getFloorId() {
    return floorId;
  }

   /**
   * 楼层ID，格式UUID。
   * Param floorId
  **/
  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  public DeviceLocationInfo floorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
    return this;
  }

   /**
   * 楼层号。
   * return floorNumber
  **/
  @ApiModelProperty(value = "楼层号。")
  public String getFloorNumber() {
    return floorNumber;
  }

   /**
   * 楼层号。
   * Param floorNumber
  **/
  public void setFloorNumber(String floorNumber) {
    this.floorNumber = floorNumber;
  }

  public DeviceLocationInfo floorName(String floorName) {
    this.floorName = floorName;
    return this;
  }

   /**
   * 楼层名称。
   * return floorName
  **/
  @ApiModelProperty(value = "楼层名称。")
  public String getFloorName() {
    return floorName;
  }

   /**
   * 楼层名称。
   * Param floorName
  **/
  public void setFloorName(String floorName) {
    this.floorName = floorName;
  }

  public DeviceLocationInfo positionX(Integer positionX) {
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

  public DeviceLocationInfo positionY(Integer positionY) {
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

  public DeviceLocationInfo planPositionX(Integer planPositionX) {
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

  public DeviceLocationInfo planPositionY(Integer planPositionY) {
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
    DeviceLocationInfo deviceLocationInfo = (DeviceLocationInfo) o;
    return Objects.equals(this.id, deviceLocationInfo.id) &&
        Objects.equals(this.buildingId, deviceLocationInfo.buildingId) &&
        Objects.equals(this.buildingName, deviceLocationInfo.buildingName) &&
        Objects.equals(this.floorId, deviceLocationInfo.floorId) &&
        Objects.equals(this.floorNumber, deviceLocationInfo.floorNumber) &&
        Objects.equals(this.floorName, deviceLocationInfo.floorName) &&
        Objects.equals(this.positionX, deviceLocationInfo.positionX) &&
        Objects.equals(this.positionY, deviceLocationInfo.positionY) &&
        Objects.equals(this.planPositionX, deviceLocationInfo.planPositionX) &&
        Objects.equals(this.planPositionY, deviceLocationInfo.planPositionY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buildingId, buildingName, floorId, floorNumber, floorName, positionX, positionY, planPositionX, planPositionY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceLocationInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    floorNumber: ").append(toIndentedString(floorNumber)).append("\n");
    sb.append("    floorName: ").append(toIndentedString(floorName)).append("\n");
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
