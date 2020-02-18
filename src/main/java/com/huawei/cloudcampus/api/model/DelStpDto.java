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
import com.huawei.cloudcampus.api.model.DelMstpRegion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 交换机STP配置结构体。
 */
@ApiModel(description = "交换机STP配置结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:29.471+08:00")
public class DelStpDto {
  @SerializedName("mstpRegions")
  private List<DelMstpRegion> mstpRegions = null;

  public DelStpDto mstpRegions(List<DelMstpRegion> mstpRegions) {
    this.mstpRegions = mstpRegions;
    return this;
  }

  public DelStpDto addMstpRegionsItem(DelMstpRegion mstpRegionsItem) {
    if (this.mstpRegions == null) {
      this.mstpRegions = new ArrayList<DelMstpRegion>();
    }
    this.mstpRegions.add(mstpRegionsItem);
    return this;
  }

   /**
   * MST域集合。MSTP模式下需要配置，当stpMode为2时，mstpRegions不生效。
   * return mstpRegions
  **/
  @ApiModelProperty(value = "MST域集合。MSTP模式下需要配置，当stpMode为2时，mstpRegions不生效。")
  public List<DelMstpRegion> getMstpRegions() {
    return mstpRegions;
  }

   /**
   * MST域集合。MSTP模式下需要配置，当stpMode为2时，mstpRegions不生效。
   * Param mstpRegions
  **/
  public void setMstpRegions(List<DelMstpRegion> mstpRegions) {
    this.mstpRegions = mstpRegions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelStpDto delStpDto = (DelStpDto) o;
    return Objects.equals(this.mstpRegions, delStpDto.mstpRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mstpRegions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelStpDto {\n");
    
    sb.append("    mstpRegions: ").append(toIndentedString(mstpRegions)).append("\n");
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
