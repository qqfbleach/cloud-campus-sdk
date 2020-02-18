/*
 * 终端客流量数据信息查询
 * 1、查询设备标签。 2、查询历史客户流量。 3、查询实时客户流量，返回最近5分钟内接入客户流量。 4、查询访客、路人、接入用户的历史趋势。 5、查询访客驻留时长的历史趋势。 6、查询回头客记录。 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 设备标签。
 */
@ApiModel(description = "设备标签。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:32.011+08:00")
public class DeviceGroupTag {
  @SerializedName("tagId")
  private String tagId = null;

  @SerializedName("tagName")
  private String tagName = null;

  public DeviceGroupTag tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * 标签ID。
   * return tagId
  **/
  @ApiModelProperty(value = "标签ID。")
  public String getTagId() {
    return tagId;
  }

   /**
   * 标签ID。
   * Param tagId
  **/
  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public DeviceGroupTag tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * 标签名。
   * return tagName
  **/
  @ApiModelProperty(value = "标签名。")
  public String getTagName() {
    return tagName;
  }

   /**
   * 标签名。
   * Param tagName
  **/
  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGroupTag deviceGroupTag = (DeviceGroupTag) o;
    return Objects.equals(this.tagId, deviceGroupTag.tagId) &&
        Objects.equals(this.tagName, deviceGroupTag.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, tagName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGroupTag {\n");
    
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
