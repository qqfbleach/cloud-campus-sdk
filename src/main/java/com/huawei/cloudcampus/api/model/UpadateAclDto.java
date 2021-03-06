/*
 * ACL模板管理
 * ACL模板第三方管理接口说明。 
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
import com.huawei.cloudcampus.api.model.RuleList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpadateAclDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:09.348+08:00")
public class UpadateAclDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("ruleList")
  private List<RuleList> ruleList = null;

  public UpadateAclDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * ACL模板名称，包括汉字、字母、数字、下划线、.、@、-不能与已有的名称重复。
   * return name
  **/
  @ApiModelProperty(value = "ACL模板名称，包括汉字、字母、数字、下划线、.、@、-不能与已有的名称重复。")
  public String getName() {
    return name;
  }

   /**
   * ACL模板名称，包括汉字、字母、数字、下划线、.、@、-不能与已有的名称重复。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public UpadateAclDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * ACL模板描述。
   * return description
  **/
  @ApiModelProperty(value = "ACL模板描述。")
  public String getDescription() {
    return description;
  }

   /**
   * ACL模板描述。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public UpadateAclDto ruleList(List<RuleList> ruleList) {
    this.ruleList = ruleList;
    return this;
  }

  public UpadateAclDto addRuleListItem(RuleList ruleListItem) {
    if (this.ruleList == null) {
      this.ruleList = new ArrayList<RuleList>();
    }
    this.ruleList.add(ruleListItem);
    return this;
  }

   /**
   * 规则列表。
   * return ruleList
  **/
  @ApiModelProperty(value = "规则列表。")
  public List<RuleList> getRuleList() {
    return ruleList;
  }

   /**
   * 规则列表。
   * Param ruleList
  **/
  public void setRuleList(List<RuleList> ruleList) {
    this.ruleList = ruleList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpadateAclDto upadateAclDto = (UpadateAclDto) o;
    return Objects.equals(this.name, upadateAclDto.name) &&
        Objects.equals(this.description, upadateAclDto.description) &&
        Objects.equals(this.ruleList, upadateAclDto.ruleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, ruleList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpadateAclDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
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

