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
 * 删除站点入参模型。
 */
@ApiModel(description = "删除站点入参模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:01.736+08:00")
public class DeleteSiteDto {
  @SerializedName("ids")
  private List<String> ids = new ArrayList<String>();

  public DeleteSiteDto ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DeleteSiteDto addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 删除站点UUID列表。
   * return ids
  **/
  @ApiModelProperty(required = true, value = "删除站点UUID列表。")
  public List<String> getIds() {
    return ids;
  }

   /**
   * 删除站点UUID列表。
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
    DeleteSiteDto deleteSiteDto = (DeleteSiteDto) o;
    return Objects.equals(this.ids, deleteSiteDto.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSiteDto {\n");
    
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
