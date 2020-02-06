/*
 * 防火墙设备静态路由配置
 * 防火墙设备静态路由配置第三方接口。
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

/**
 * DeleteFwStaticRouteInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:36.994+08:00")
public class DeleteFwStaticRouteInfoDto {
  @SerializedName("id")
  private String id = null;

  public DeleteFwStaticRouteInfoDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 静态路由ID。
   * return id
  **/
  @ApiModelProperty(value = "静态路由ID。")
  public String getId() {
    return id;
  }

   /**
   * 静态路由ID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFwStaticRouteInfoDto deleteFwStaticRouteInfoDto = (DeleteFwStaticRouteInfoDto) o;
    return Objects.equals(this.id, deleteFwStaticRouteInfoDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFwStaticRouteInfoDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

