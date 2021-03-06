/*
 * 交换机STP配置
 * LSW STP配置北向接口，主要特性： · 查询交换STP配置信息 · 修改交换机STP配置 · 删除交换机STP配置 
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
import com.huawei.cloudcampus.api.model.RegionInstanceDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成树实例。
 */
@ApiModel(description = "生成树实例。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:29.471+08:00")
public class MstpRegionInstance {
  @SerializedName("instanceId")
  private Integer instanceId = null;

  @SerializedName("mapVlan")
  private String mapVlan = null;

  @SerializedName("regionInstanceDevices")
  private List<RegionInstanceDevice> regionInstanceDevices = new ArrayList<RegionInstanceDevice>();

  public MstpRegionInstance instanceId(Integer instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 生成树实例ID。
   * minimum: 0
   * maximum: 4094
   * return instanceId
  **/
  @ApiModelProperty(required = true, value = "生成树实例ID。")
  public Integer getInstanceId() {
    return instanceId;
  }

   /**
   * 生成树实例ID。
   * minimum: 0
   * maximum: 4094
   * Param instanceId
  **/
  public void setInstanceId(Integer instanceId) {
    this.instanceId = instanceId;
  }

  public MstpRegionInstance mapVlan(String mapVlan) {
    this.mapVlan = mapVlan;
    return this;
  }

   /**
   * 映射VLAN，instancdId不为0的生成树才生效。
   * return mapVlan
  **/
  @ApiModelProperty(value = "映射VLAN，instancdId不为0的生成树才生效。")
  public String getMapVlan() {
    return mapVlan;
  }

   /**
   * 映射VLAN，instancdId不为0的生成树才生效。
   * Param mapVlan
  **/
  public void setMapVlan(String mapVlan) {
    this.mapVlan = mapVlan;
  }

  public MstpRegionInstance regionInstanceDevices(List<RegionInstanceDevice> regionInstanceDevices) {
    this.regionInstanceDevices = regionInstanceDevices;
    return this;
  }

  public MstpRegionInstance addRegionInstanceDevicesItem(RegionInstanceDevice regionInstanceDevicesItem) {
    this.regionInstanceDevices.add(regionInstanceDevicesItem);
    return this;
  }

   /**
   * 生成树实例下设备集合。
   * return regionInstanceDevices
  **/
  @ApiModelProperty(required = true, value = "生成树实例下设备集合。")
  public List<RegionInstanceDevice> getRegionInstanceDevices() {
    return regionInstanceDevices;
  }

   /**
   * 生成树实例下设备集合。
   * Param regionInstanceDevices
  **/
  public void setRegionInstanceDevices(List<RegionInstanceDevice> regionInstanceDevices) {
    this.regionInstanceDevices = regionInstanceDevices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MstpRegionInstance mstpRegionInstance = (MstpRegionInstance) o;
    return Objects.equals(this.instanceId, mstpRegionInstance.instanceId) &&
        Objects.equals(this.mapVlan, mstpRegionInstance.mapVlan) &&
        Objects.equals(this.regionInstanceDevices, mstpRegionInstance.regionInstanceDevices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, mapVlan, regionInstanceDevices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MstpRegionInstance {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    mapVlan: ").append(toIndentedString(mapVlan)).append("\n");
    sb.append("    regionInstanceDevices: ").append(toIndentedString(regionInstanceDevices)).append("\n");
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

