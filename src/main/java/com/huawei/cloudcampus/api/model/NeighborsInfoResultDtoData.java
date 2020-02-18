/*
 * 拓扑管理
 * 拓扑管理第三方北向接口。 1、查询LACP LAG信息 2、查询LLDP信息 
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
import com.huawei.cloudcampus.api.model.NeighborsInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NeighborsInfoResultDtoData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:19.739+08:00")
public class NeighborsInfoResultDtoData {
  @SerializedName("lldp")
  private List<NeighborsInfoDto> lldp = null;

  public NeighborsInfoResultDtoData lldp(List<NeighborsInfoDto> lldp) {
    this.lldp = lldp;
    return this;
  }

  public NeighborsInfoResultDtoData addLldpItem(NeighborsInfoDto lldpItem) {
    if (this.lldp == null) {
      this.lldp = new ArrayList<NeighborsInfoDto>();
    }
    this.lldp.add(lldpItem);
    return this;
  }

   /**
   * LLDP数据。
   * return lldp
  **/
  @ApiModelProperty(value = "LLDP数据。")
  public List<NeighborsInfoDto> getLldp() {
    return lldp;
  }

   /**
   * LLDP数据。
   * Param lldp
  **/
  public void setLldp(List<NeighborsInfoDto> lldp) {
    this.lldp = lldp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NeighborsInfoResultDtoData neighborsInfoResultDtoData = (NeighborsInfoResultDtoData) o;
    return Objects.equals(this.lldp, neighborsInfoResultDtoData.lldp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lldp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NeighborsInfoResultDtoData {\n");
    
    sb.append("    lldp: ").append(toIndentedString(lldp)).append("\n");
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
