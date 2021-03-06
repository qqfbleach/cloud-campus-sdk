/*
 * 框式交换机板卡信息操作
 * 框式上云相关操作接口： 场景：对框式交换机信息查询操作的第三方接口。
 *
 * OpenAPI spec version: 1.0.0
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
import com.huawei.cloudcampus.api.model.InterfaceInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 接口返回信息。
 */
@ApiModel(description = "接口返回信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:14.794+08:00")
public class InterfacesInfoOutputDto {
  @SerializedName("interfaceInfoList")
  private List<InterfaceInfoDto> interfaceInfoList = null;

  public InterfacesInfoOutputDto interfaceInfoList(List<InterfaceInfoDto> interfaceInfoList) {
    this.interfaceInfoList = interfaceInfoList;
    return this;
  }

  public InterfacesInfoOutputDto addInterfaceInfoListItem(InterfaceInfoDto interfaceInfoListItem) {
    if (this.interfaceInfoList == null) {
      this.interfaceInfoList = new ArrayList<InterfaceInfoDto>();
    }
    this.interfaceInfoList.add(interfaceInfoListItem);
    return this;
  }

   /**
   * 接口信息列表。
   * return interfaceInfoList
  **/
  @ApiModelProperty(value = "接口信息列表。")
  public List<InterfaceInfoDto> getInterfaceInfoList() {
    return interfaceInfoList;
  }

   /**
   * 接口信息列表。
   * Param interfaceInfoList
  **/
  public void setInterfaceInfoList(List<InterfaceInfoDto> interfaceInfoList) {
    this.interfaceInfoList = interfaceInfoList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfacesInfoOutputDto interfacesInfoOutputDto = (InterfacesInfoOutputDto) o;
    return Objects.equals(this.interfaceInfoList, interfacesInfoOutputDto.interfaceInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceInfoList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfacesInfoOutputDto {\n");
    
    sb.append("    interfaceInfoList: ").append(toIndentedString(interfaceInfoList)).append("\n");
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

