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
import com.huawei.cloudcampus.api.model.EthTrunkDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LacpLagInfoResultDtoData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:19.739+08:00")
public class LacpLagInfoResultDtoData {
  @SerializedName("ethtrunk")
  private List<EthTrunkDto> ethtrunk = null;

  public LacpLagInfoResultDtoData ethtrunk(List<EthTrunkDto> ethtrunk) {
    this.ethtrunk = ethtrunk;
    return this;
  }

  public LacpLagInfoResultDtoData addEthtrunkItem(EthTrunkDto ethtrunkItem) {
    if (this.ethtrunk == null) {
      this.ethtrunk = new ArrayList<EthTrunkDto>();
    }
    this.ethtrunk.add(ethtrunkItem);
    return this;
  }

   /**
   * Eth-trunk数据。
   * return ethtrunk
  **/
  @ApiModelProperty(value = "Eth-trunk数据。")
  public List<EthTrunkDto> getEthtrunk() {
    return ethtrunk;
  }

   /**
   * Eth-trunk数据。
   * Param ethtrunk
  **/
  public void setEthtrunk(List<EthTrunkDto> ethtrunk) {
    this.ethtrunk = ethtrunk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LacpLagInfoResultDtoData lacpLagInfoResultDtoData = (LacpLagInfoResultDtoData) o;
    return Objects.equals(this.ethtrunk, lacpLagInfoResultDtoData.ethtrunk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethtrunk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LacpLagInfoResultDtoData {\n");
    
    sb.append("    ethtrunk: ").append(toIndentedString(ethtrunk)).append("\n");
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

