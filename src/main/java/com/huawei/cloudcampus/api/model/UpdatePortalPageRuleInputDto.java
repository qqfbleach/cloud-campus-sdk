/*
 * AP页面推送策略
 * AP页面推送策略开放API。 
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
import java.util.ArrayList;
import java.util.List;

/**
 * UpdatePortalPageRuleInputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:54.791+08:00")
public class UpdatePortalPageRuleInputDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("priority")
  private String priority = null;

  @SerializedName("ssIds")
  private List<String> ssIds = null;

  @SerializedName("pushMode")
  private Integer pushMode = null;

  @SerializedName("thirdPageUrl")
  private String thirdPageUrl = null;

  public UpdatePortalPageRuleInputDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 名称。
   * return name
  **/
  @ApiModelProperty(required = true, value = "名称。")
  public String getName() {
    return name;
  }

   /**
   * 名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public UpdatePortalPageRuleInputDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 描述。
   * return description
  **/
  @ApiModelProperty(value = "描述。")
  public String getDescription() {
    return description;
  }

   /**
   * 描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatePortalPageRuleInputDto priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 优先级。如果priority的值与修改前相同，那么修改操作只处理除priority以外的信息，否则修改操作只处理优先级。优先级数值越小，越优先匹配。
   * return priority
  **/
  @ApiModelProperty(value = "优先级。如果priority的值与修改前相同，那么修改操作只处理除priority以外的信息，否则修改操作只处理优先级。优先级数值越小，越优先匹配。")
  public String getPriority() {
    return priority;
  }

   /**
   * 优先级。如果priority的值与修改前相同，那么修改操作只处理除priority以外的信息，否则修改操作只处理优先级。优先级数值越小，越优先匹配。
   * Param priority
  **/
  public void setPriority(String priority) {
    this.priority = priority;
  }

  public UpdatePortalPageRuleInputDto ssIds(List<String> ssIds) {
    this.ssIds = ssIds;
    return this;
  }

  public UpdatePortalPageRuleInputDto addSsIdsItem(String ssIdsItem) {
    if (this.ssIds == null) {
      this.ssIds = new ArrayList<String>();
    }
    this.ssIds.add(ssIdsItem);
    return this;
  }

   /**
   * SSID列表，如果参数为空，则页面推送策略适用于站点下所有SSID，格式为UUID。
   * return ssIds
  **/
  @ApiModelProperty(value = "SSID列表，如果参数为空，则页面推送策略适用于站点下所有SSID，格式为UUID。")
  public List<String> getSsIds() {
    return ssIds;
  }

   /**
   * SSID列表，如果参数为空，则页面推送策略适用于站点下所有SSID，格式为UUID。
   * Param ssIds
  **/
  public void setSsIds(List<String> ssIds) {
    this.ssIds = ssIds;
  }

  public UpdatePortalPageRuleInputDto pushMode(Integer pushMode) {
    this.pushMode = pushMode;
    return this;
  }

   /**
   * 推送方式，当前只支持0：第三方认证。
   * return pushMode
  **/
  @ApiModelProperty(required = true, value = "推送方式，当前只支持0：第三方认证。")
  public Integer getPushMode() {
    return pushMode;
  }

   /**
   * 推送方式，当前只支持0：第三方认证。
   * Param pushMode
  **/
  public void setPushMode(Integer pushMode) {
    this.pushMode = pushMode;
  }

  public UpdatePortalPageRuleInputDto thirdPageUrl(String thirdPageUrl) {
    this.thirdPageUrl = thirdPageUrl;
    return this;
  }

   /**
   * 第三方推送URL，当pushMode为0时，必填。
   * return thirdPageUrl
  **/
  @ApiModelProperty(value = "第三方推送URL，当pushMode为0时，必填。")
  public String getThirdPageUrl() {
    return thirdPageUrl;
  }

   /**
   * 第三方推送URL，当pushMode为0时，必填。
   * Param thirdPageUrl
  **/
  public void setThirdPageUrl(String thirdPageUrl) {
    this.thirdPageUrl = thirdPageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePortalPageRuleInputDto updatePortalPageRuleInputDto = (UpdatePortalPageRuleInputDto) o;
    return Objects.equals(this.name, updatePortalPageRuleInputDto.name) &&
        Objects.equals(this.description, updatePortalPageRuleInputDto.description) &&
        Objects.equals(this.priority, updatePortalPageRuleInputDto.priority) &&
        Objects.equals(this.ssIds, updatePortalPageRuleInputDto.ssIds) &&
        Objects.equals(this.pushMode, updatePortalPageRuleInputDto.pushMode) &&
        Objects.equals(this.thirdPageUrl, updatePortalPageRuleInputDto.thirdPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, priority, ssIds, pushMode, thirdPageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePortalPageRuleInputDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ssIds: ").append(toIndentedString(ssIds)).append("\n");
    sb.append("    pushMode: ").append(toIndentedString(pushMode)).append("\n");
    sb.append("    thirdPageUrl: ").append(toIndentedString(thirdPageUrl)).append("\n");
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

