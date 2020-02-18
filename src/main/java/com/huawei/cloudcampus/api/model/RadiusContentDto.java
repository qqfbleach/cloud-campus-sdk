/*
 * AP SSID配置管理
 * AP SSID第三方接口。
 *
 * OpenAPI spec version: 1.4.1
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
 * RADIUS认证内容，当mode为mac或dot1x时必选。
 */
@ApiModel(description = "RADIUS认证内容，当mode为mac或dot1x时必选。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class RadiusContentDto {
  @SerializedName("radiusTmplId")
  private String radiusTmplId = null;

  @SerializedName("radiusTmplName")
  private String radiusTmplName = null;

  @SerializedName("staticEnable")
  private Boolean staticEnable = null;

  public RadiusContentDto radiusTmplId(String radiusTmplId) {
    this.radiusTmplId = radiusTmplId;
    return this;
  }

   /**
   * RADIUS模板ID。
   * return radiusTmplId
  **/
  @ApiModelProperty(value = "RADIUS模板ID。")
  public String getRadiusTmplId() {
    return radiusTmplId;
  }

   /**
   * RADIUS模板ID。
   * Param radiusTmplId
  **/
  public void setRadiusTmplId(String radiusTmplId) {
    this.radiusTmplId = radiusTmplId;
  }

  public RadiusContentDto radiusTmplName(String radiusTmplName) {
    this.radiusTmplName = radiusTmplName;
    return this;
  }

   /**
   * RADIUS模板名称。POST与PUT操作时，该字段无效。
   * return radiusTmplName
  **/
  @ApiModelProperty(value = "RADIUS模板名称。POST与PUT操作时，该字段无效。")
  public String getRadiusTmplName() {
    return radiusTmplName;
  }

   /**
   * RADIUS模板名称。POST与PUT操作时，该字段无效。
   * Param radiusTmplName
  **/
  public void setRadiusTmplName(String radiusTmplName) {
    this.radiusTmplName = radiusTmplName;
  }

  public RadiusContentDto staticEnable(Boolean staticEnable) {
    this.staticEnable = staticEnable;
    return this;
  }

   /**
   * 用户流量统计使能开关。
   * return staticEnable
  **/
  @ApiModelProperty(value = "用户流量统计使能开关。")
  public Boolean getStaticEnable() {
    return staticEnable;
  }

   /**
   * 用户流量统计使能开关。
   * Param staticEnable
  **/
  public void setStaticEnable(Boolean staticEnable) {
    this.staticEnable = staticEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadiusContentDto radiusContentDto = (RadiusContentDto) o;
    return Objects.equals(this.radiusTmplId, radiusContentDto.radiusTmplId) &&
        Objects.equals(this.radiusTmplName, radiusContentDto.radiusTmplName) &&
        Objects.equals(this.staticEnable, radiusContentDto.staticEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radiusTmplId, radiusTmplName, staticEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadiusContentDto {\n");
    
    sb.append("    radiusTmplId: ").append(toIndentedString(radiusTmplId)).append("\n");
    sb.append("    radiusTmplName: ").append(toIndentedString(radiusTmplName)).append("\n");
    sb.append("    staticEnable: ").append(toIndentedString(staticEnable)).append("\n");
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
