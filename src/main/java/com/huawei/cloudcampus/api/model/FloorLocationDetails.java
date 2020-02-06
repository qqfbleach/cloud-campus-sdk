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
import com.huawei.cloudcampus.api.model.LocatedDeviceInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FloorLocationDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:40.522+08:00")
public class FloorLocationDetails {
  @SerializedName("name")
  private String name = null;

  @SerializedName("buildingName")
  private String buildingName = null;

  @SerializedName("image")
  private byte[] image = null;

  @SerializedName("scale")
  private Double scale = null;

  @SerializedName("locatedDeviceList")
  private List<LocatedDeviceInfo> locatedDeviceList = new ArrayList<LocatedDeviceInfo>();

  @SerializedName("unLocatedDeviceList")
  private List<DeviceInfo> unLocatedDeviceList = new ArrayList<DeviceInfo>();

  public FloorLocationDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 楼层名称。
   * return name
  **/
  @ApiModelProperty(required = true, value = "楼层名称。")
  public String getName() {
    return name;
  }

   /**
   * 楼层名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public FloorLocationDetails buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * 楼层所属楼栋名称。
   * return buildingName
  **/
  @ApiModelProperty(required = true, value = "楼层所属楼栋名称。")
  public String getBuildingName() {
    return buildingName;
  }

   /**
   * 楼层所属楼栋名称。
   * Param buildingName
  **/
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public FloorLocationDetails image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * 楼层图纸。
   * return image
  **/
  @ApiModelProperty(required = true, value = "楼层图纸。")
  public byte[] getImage() {
    return image;
  }

   /**
   * 楼层图纸。
   * Param image
  **/
  public void setImage(byte[] image) {
    this.image = image;
  }

  public FloorLocationDetails scale(Double scale) {
    this.scale = scale;
    return this;
  }

   /**
   * 比例尺，表示图上距离与实际距离的比，例如：图上0.01米代表实际1米，则比例尺为0.01。
   * return scale
  **/
  @ApiModelProperty(value = "比例尺，表示图上距离与实际距离的比，例如：图上0.01米代表实际1米，则比例尺为0.01。")
  public Double getScale() {
    return scale;
  }

   /**
   * 比例尺，表示图上距离与实际距离的比，例如：图上0.01米代表实际1米，则比例尺为0.01。
   * Param scale
  **/
  public void setScale(Double scale) {
    this.scale = scale;
  }

  public FloorLocationDetails locatedDeviceList(List<LocatedDeviceInfo> locatedDeviceList) {
    this.locatedDeviceList = locatedDeviceList;
    return this;
  }

  public FloorLocationDetails addLocatedDeviceListItem(LocatedDeviceInfo locatedDeviceListItem) {
    this.locatedDeviceList.add(locatedDeviceListItem);
    return this;
  }

   /**
   * 已布放设备列表。
   * return locatedDeviceList
  **/
  @ApiModelProperty(required = true, value = "已布放设备列表。")
  public List<LocatedDeviceInfo> getLocatedDeviceList() {
    return locatedDeviceList;
  }

   /**
   * 已布放设备列表。
   * Param locatedDeviceList
  **/
  public void setLocatedDeviceList(List<LocatedDeviceInfo> locatedDeviceList) {
    this.locatedDeviceList = locatedDeviceList;
  }

  public FloorLocationDetails unLocatedDeviceList(List<DeviceInfo> unLocatedDeviceList) {
    this.unLocatedDeviceList = unLocatedDeviceList;
    return this;
  }

  public FloorLocationDetails addUnLocatedDeviceListItem(DeviceInfo unLocatedDeviceListItem) {
    this.unLocatedDeviceList.add(unLocatedDeviceListItem);
    return this;
  }

   /**
   * 未布放设备列表。
   * return unLocatedDeviceList
  **/
  @ApiModelProperty(required = true, value = "未布放设备列表。")
  public List<DeviceInfo> getUnLocatedDeviceList() {
    return unLocatedDeviceList;
  }

   /**
   * 未布放设备列表。
   * Param unLocatedDeviceList
  **/
  public void setUnLocatedDeviceList(List<DeviceInfo> unLocatedDeviceList) {
    this.unLocatedDeviceList = unLocatedDeviceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloorLocationDetails floorLocationDetails = (FloorLocationDetails) o;
    return Objects.equals(this.name, floorLocationDetails.name) &&
        Objects.equals(this.buildingName, floorLocationDetails.buildingName) &&
        Objects.equals(this.image, floorLocationDetails.image) &&
        Objects.equals(this.scale, floorLocationDetails.scale) &&
        Objects.equals(this.locatedDeviceList, floorLocationDetails.locatedDeviceList) &&
        Objects.equals(this.unLocatedDeviceList, floorLocationDetails.unLocatedDeviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, buildingName, image, scale, locatedDeviceList, unLocatedDeviceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloorLocationDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    locatedDeviceList: ").append(toIndentedString(locatedDeviceList)).append("\n");
    sb.append("    unLocatedDeviceList: ").append(toIndentedString(unLocatedDeviceList)).append("\n");
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

