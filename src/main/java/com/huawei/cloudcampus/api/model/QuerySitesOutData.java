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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询站点列表返回data结构。
 */
@ApiModel(description = "查询站点列表返回data结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:01.736+08:00")
public class QuerySitesOutData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("type")
  private List<String> type = null;

  public QuerySitesOutData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 站点ID。
   * return id
  **/
  @ApiModelProperty(value = "站点ID。")
  public String getId() {
    return id;
  }

   /**
   * 站点ID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public QuerySitesOutData tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID。
   * return tenantId
  **/
  @ApiModelProperty(value = "租户ID。")
  public String getTenantId() {
    return tenantId;
  }

   /**
   * 租户ID。
   * Param tenantId
  **/
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public QuerySitesOutData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 站点名称。
   * return name
  **/
  @ApiModelProperty(value = "站点名称。")
  public String getName() {
    return name;
  }

   /**
   * 站点名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public QuerySitesOutData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 站点描述。
   * return description
  **/
  @ApiModelProperty(value = "站点描述。")
  public String getDescription() {
    return description;
  }

   /**
   * 站点描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public QuerySitesOutData type(List<String> type) {
    this.type = type;
    return this;
  }

  public QuerySitesOutData addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<String>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * 站点类型。
   * return type
  **/
  @ApiModelProperty(value = "站点类型。")
  public List<String> getType() {
    return type;
  }

   /**
   * 站点类型。
   * Param type
  **/
  public void setType(List<String> type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySitesOutData querySitesOutData = (QuerySitesOutData) o;
    return Objects.equals(this.id, querySitesOutData.id) &&
        Objects.equals(this.tenantId, querySitesOutData.tenantId) &&
        Objects.equals(this.name, querySitesOutData.name) &&
        Objects.equals(this.description, querySitesOutData.description) &&
        Objects.equals(this.type, querySitesOutData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, name, description, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySitesOutData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

