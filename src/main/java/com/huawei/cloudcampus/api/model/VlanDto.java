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
import com.huawei.cloudcampus.api.model.TagDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SSID的VLAN配置信息，指明SSID所属的VLAN ID。同一SSID所属VLAN支持按照标签进行差异化配置，例如SSID1在带有标签tag1的设备上属于vlan1，在带有标签tag2的设备上属于vlan2。一个SSID只能属于一个VLAN，多条配置按照优先级最高的生效。
 */
@ApiModel(description = "SSID的VLAN配置信息，指明SSID所属的VLAN ID。同一SSID所属VLAN支持按照标签进行差异化配置，例如SSID1在带有标签tag1的设备上属于vlan1，在带有标签tag2的设备上属于vlan2。一个SSID只能属于一个VLAN，多条配置按照优先级最高的生效。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class VlanDto {
  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("vlanId")
  private Integer vlanId = null;

  @SerializedName("tags")
  private List<TagDto> tags = null;

  public VlanDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 优先级。0的优先级最低；当取值大于0时，值越小优先级越高。
   * minimum: 0
   * maximum: 16
   * return priority
  **/
  @ApiModelProperty(value = "优先级。0的优先级最低；当取值大于0时，值越小优先级越高。")
  public Integer getPriority() {
    return priority;
  }

   /**
   * 优先级。0的优先级最低；当取值大于0时，值越小优先级越高。
   * minimum: 0
   * maximum: 16
   * Param priority
  **/
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public VlanDto vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * 所属VLAN ID。
   * minimum: 1
   * maximum: 4094
   * return vlanId
  **/
  @ApiModelProperty(value = "所属VLAN ID。")
  public Integer getVlanId() {
    return vlanId;
  }

   /**
   * 所属VLAN ID。
   * minimum: 1
   * maximum: 4094
   * Param vlanId
  **/
  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }

  public VlanDto tags(List<TagDto> tags) {
    this.tags = tags;
    return this;
  }

  public VlanDto addTagsItem(TagDto tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagDto>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 所属VLAN的设备标签配置列表。
   * return tags
  **/
  @ApiModelProperty(value = "所属VLAN的设备标签配置列表。")
  public List<TagDto> getTags() {
    return tags;
  }

   /**
   * 所属VLAN的设备标签配置列表。
   * Param tags
  **/
  public void setTags(List<TagDto> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlanDto vlanDto = (VlanDto) o;
    return Objects.equals(this.priority, vlanDto.priority) &&
        Objects.equals(this.vlanId, vlanDto.vlanId) &&
        Objects.equals(this.tags, vlanDto.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, vlanId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanDto {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
