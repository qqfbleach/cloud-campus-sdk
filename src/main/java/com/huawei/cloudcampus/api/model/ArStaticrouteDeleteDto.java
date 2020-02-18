/*
 * 路由器设备静态路由配置
 * 路由器设备静态路由配置第三方接口。
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ArStaticrouteDeleteDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:18.730+08:00")
public class ArStaticrouteDeleteDto {
  @SerializedName("ids")
  private List<String> ids = null;

  public ArStaticrouteDeleteDto ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ArStaticrouteDeleteDto addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * return ids
  **/
  @ApiModelProperty(value = "")
  public List<String> getIds() {
    return ids;
  }

   /**
   * Set ids
   * Param ids
  **/
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArStaticrouteDeleteDto arStaticrouteDeleteDto = (ArStaticrouteDeleteDto) o;
    return Objects.equals(this.ids, arStaticrouteDeleteDto.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArStaticrouteDeleteDto {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
