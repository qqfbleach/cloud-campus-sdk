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
import com.huawei.cloudcampus.api.model.MstpRegionInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MSTP域。
 */
@ApiModel(description = "MSTP域。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:29.471+08:00")
public class MstpRegion {
  @SerializedName("regionId")
  private String regionId = null;

  @SerializedName("regionName")
  private String regionName = null;

  @SerializedName("revisionLevel")
  private Long revisionLevel = null;

  @SerializedName("mstpRegionInstances")
  private List<MstpRegionInstance> mstpRegionInstances = new ArrayList<MstpRegionInstance>();

  public MstpRegion regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 域ID，UUID格式。创建时自动生成。
   * return regionId
  **/
  @ApiModelProperty(value = "域ID，UUID格式。创建时自动生成。")
  public String getRegionId() {
    return regionId;
  }

   /**
   * 域ID，UUID格式。创建时自动生成。
   * Param regionId
  **/
  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public MstpRegion regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * 域名。
   * return regionName
  **/
  @ApiModelProperty(required = true, value = "域名。")
  public String getRegionName() {
    return regionName;
  }

   /**
   * 域名。
   * Param regionName
  **/
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public MstpRegion revisionLevel(Long revisionLevel) {
    this.revisionLevel = revisionLevel;
    return this;
  }

   /**
   * 修订级别。
   * minimum: 0
   * maximum: 65535
   * return revisionLevel
  **/
  @ApiModelProperty(required = true, value = "修订级别。")
  public Long getRevisionLevel() {
    return revisionLevel;
  }

   /**
   * 修订级别。
   * minimum: 0
   * maximum: 65535
   * Param revisionLevel
  **/
  public void setRevisionLevel(Long revisionLevel) {
    this.revisionLevel = revisionLevel;
  }

  public MstpRegion mstpRegionInstances(List<MstpRegionInstance> mstpRegionInstances) {
    this.mstpRegionInstances = mstpRegionInstances;
    return this;
  }

  public MstpRegion addMstpRegionInstancesItem(MstpRegionInstance mstpRegionInstancesItem) {
    this.mstpRegionInstances.add(mstpRegionInstancesItem);
    return this;
  }

   /**
   * 生成树实例集合。
   * return mstpRegionInstances
  **/
  @ApiModelProperty(required = true, value = "生成树实例集合。")
  public List<MstpRegionInstance> getMstpRegionInstances() {
    return mstpRegionInstances;
  }

   /**
   * 生成树实例集合。
   * Param mstpRegionInstances
  **/
  public void setMstpRegionInstances(List<MstpRegionInstance> mstpRegionInstances) {
    this.mstpRegionInstances = mstpRegionInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MstpRegion mstpRegion = (MstpRegion) o;
    return Objects.equals(this.regionId, mstpRegion.regionId) &&
        Objects.equals(this.regionName, mstpRegion.regionName) &&
        Objects.equals(this.revisionLevel, mstpRegion.revisionLevel) &&
        Objects.equals(this.mstpRegionInstances, mstpRegion.mstpRegionInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, regionName, revisionLevel, mstpRegionInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MstpRegion {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    revisionLevel: ").append(toIndentedString(revisionLevel)).append("\n");
    sb.append("    mstpRegionInstances: ").append(toIndentedString(mstpRegionInstances)).append("\n");
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

