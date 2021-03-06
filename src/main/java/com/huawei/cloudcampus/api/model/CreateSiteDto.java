/*
 * 站点管理
 * 站点管理第三方接口。 场景：对站点增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.3.1
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
import com.huawei.cloudcampus.api.model.CreateSiteDtoData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建站点入参模型。
 */
@ApiModel(description = "创建站点入参模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:01.736+08:00")
public class CreateSiteDto {
  @SerializedName("sites")
  private List<CreateSiteDtoData> sites = new ArrayList<CreateSiteDtoData>();

  public CreateSiteDto sites(List<CreateSiteDtoData> sites) {
    this.sites = sites;
    return this;
  }

  public CreateSiteDto addSitesItem(CreateSiteDtoData sitesItem) {
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * 站点信息。
   * return sites
  **/
  @ApiModelProperty(required = true, value = "站点信息。")
  public List<CreateSiteDtoData> getSites() {
    return sites;
  }

   /**
   * 站点信息。
   * Param sites
  **/
  public void setSites(List<CreateSiteDtoData> sites) {
    this.sites = sites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSiteDto createSiteDto = (CreateSiteDto) o;
    return Objects.equals(this.sites, createSiteDto.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSiteDto {\n");
    
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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

