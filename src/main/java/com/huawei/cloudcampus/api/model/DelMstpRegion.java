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
import com.huawei.cloudcampus.api.model.DelMstpRegionInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MST域。
 */
@ApiModel(description = "MST域。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:29.471+08:00")
public class DelMstpRegion {
  @SerializedName("regionId")
  private String regionId = null;

  @SerializedName("mstpRegionInstances")
  private List<DelMstpRegionInstance> mstpRegionInstances = null;

  @SerializedName("regionDeviceList")
  private List<String> regionDeviceList = null;

  public DelMstpRegion regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 域ID。
   * return regionId
  **/
  @ApiModelProperty(required = true, value = "域ID。")
  public String getRegionId() {
    return regionId;
  }

   /**
   * 域ID。
   * Param regionId
  **/
  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public DelMstpRegion mstpRegionInstances(List<DelMstpRegionInstance> mstpRegionInstances) {
    this.mstpRegionInstances = mstpRegionInstances;
    return this;
  }

  public DelMstpRegion addMstpRegionInstancesItem(DelMstpRegionInstance mstpRegionInstancesItem) {
    if (this.mstpRegionInstances == null) {
      this.mstpRegionInstances = new ArrayList<DelMstpRegionInstance>();
    }
    this.mstpRegionInstances.add(mstpRegionInstancesItem);
    return this;
  }

   /**
   * 生成树实例集合。
   * return mstpRegionInstances
  **/
  @ApiModelProperty(value = "生成树实例集合。")
  public List<DelMstpRegionInstance> getMstpRegionInstances() {
    return mstpRegionInstances;
  }

   /**
   * 生成树实例集合。
   * Param mstpRegionInstances
  **/
  public void setMstpRegionInstances(List<DelMstpRegionInstance> mstpRegionInstances) {
    this.mstpRegionInstances = mstpRegionInstances;
  }

  public DelMstpRegion regionDeviceList(List<String> regionDeviceList) {
    this.regionDeviceList = regionDeviceList;
    return this;
  }

  public DelMstpRegion addRegionDeviceListItem(String regionDeviceListItem) {
    if (this.regionDeviceList == null) {
      this.regionDeviceList = new ArrayList<String>();
    }
    this.regionDeviceList.add(regionDeviceListItem);
    return this;
  }

   /**
   * 设备ID实例集合。
   * return regionDeviceList
  **/
  @ApiModelProperty(value = "设备ID实例集合。")
  public List<String> getRegionDeviceList() {
    return regionDeviceList;
  }

   /**
   * 设备ID实例集合。
   * Param regionDeviceList
  **/
  public void setRegionDeviceList(List<String> regionDeviceList) {
    this.regionDeviceList = regionDeviceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelMstpRegion delMstpRegion = (DelMstpRegion) o;
    return Objects.equals(this.regionId, delMstpRegion.regionId) &&
        Objects.equals(this.mstpRegionInstances, delMstpRegion.mstpRegionInstances) &&
        Objects.equals(this.regionDeviceList, delMstpRegion.regionDeviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, mstpRegionInstances, regionDeviceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelMstpRegion {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    mstpRegionInstances: ").append(toIndentedString(mstpRegionInstances)).append("\n");
    sb.append("    regionDeviceList: ").append(toIndentedString(regionDeviceList)).append("\n");
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

