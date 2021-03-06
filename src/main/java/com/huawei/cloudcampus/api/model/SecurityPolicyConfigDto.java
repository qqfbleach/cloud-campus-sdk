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
import com.huawei.cloudcampus.api.model.SecurityUrlFilterDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 安全策略。
 */
@ApiModel(description = "安全策略。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class SecurityPolicyConfigDto {
  @SerializedName("securityAclTmplId")
  private String securityAclTmplId = null;

  @SerializedName("securityAclTmplName")
  private String securityAclTmplName = null;

  @SerializedName("ipsecAclTmplId")
  private String ipsecAclTmplId = null;

  @SerializedName("ipsecAclTmplName")
  private String ipsecAclTmplName = null;

  @SerializedName("urlFilter")
  private SecurityUrlFilterDto urlFilter = null;

  public SecurityPolicyConfigDto securityAclTmplId(String securityAclTmplId) {
    this.securityAclTmplId = securityAclTmplId;
    return this;
  }

   /**
   * 安全ACL模板ID。安全ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * return securityAclTmplId
  **/
  @ApiModelProperty(value = "安全ACL模板ID。安全ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。")
  public String getSecurityAclTmplId() {
    return securityAclTmplId;
  }

   /**
   * 安全ACL模板ID。安全ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * Param securityAclTmplId
  **/
  public void setSecurityAclTmplId(String securityAclTmplId) {
    this.securityAclTmplId = securityAclTmplId;
  }

  public SecurityPolicyConfigDto securityAclTmplName(String securityAclTmplName) {
    this.securityAclTmplName = securityAclTmplName;
    return this;
  }

   /**
   * ACL模板名称。POST与PUT操作时，该字段无效。
   * return securityAclTmplName
  **/
  @ApiModelProperty(value = "ACL模板名称。POST与PUT操作时，该字段无效。")
  public String getSecurityAclTmplName() {
    return securityAclTmplName;
  }

   /**
   * ACL模板名称。POST与PUT操作时，该字段无效。
   * Param securityAclTmplName
  **/
  public void setSecurityAclTmplName(String securityAclTmplName) {
    this.securityAclTmplName = securityAclTmplName;
  }

  public SecurityPolicyConfigDto ipsecAclTmplId(String ipsecAclTmplId) {
    this.ipsecAclTmplId = ipsecAclTmplId;
    return this;
  }

   /**
   * IPSEC ACL模板ID。IPSEC ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * return ipsecAclTmplId
  **/
  @ApiModelProperty(value = "IPSEC ACL模板ID。IPSEC ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。")
  public String getIpsecAclTmplId() {
    return ipsecAclTmplId;
  }

   /**
   * IPSEC ACL模板ID。IPSEC ACL模板可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * Param ipsecAclTmplId
  **/
  public void setIpsecAclTmplId(String ipsecAclTmplId) {
    this.ipsecAclTmplId = ipsecAclTmplId;
  }

  public SecurityPolicyConfigDto ipsecAclTmplName(String ipsecAclTmplName) {
    this.ipsecAclTmplName = ipsecAclTmplName;
    return this;
  }

   /**
   * IPSEC ACL模板名称。POST与PUT操作时，该字段无效。
   * return ipsecAclTmplName
  **/
  @ApiModelProperty(value = "IPSEC ACL模板名称。POST与PUT操作时，该字段无效。")
  public String getIpsecAclTmplName() {
    return ipsecAclTmplName;
  }

   /**
   * IPSEC ACL模板名称。POST与PUT操作时，该字段无效。
   * Param ipsecAclTmplName
  **/
  public void setIpsecAclTmplName(String ipsecAclTmplName) {
    this.ipsecAclTmplName = ipsecAclTmplName;
  }

  public SecurityPolicyConfigDto urlFilter(SecurityUrlFilterDto urlFilter) {
    this.urlFilter = urlFilter;
    return this;
  }

   /**
   * Get urlFilter
   * return urlFilter
  **/
  @ApiModelProperty(required = true, value = "")
  public SecurityUrlFilterDto getUrlFilter() {
    return urlFilter;
  }

   /**
   * Set urlFilter
   * Param urlFilter
  **/
  public void setUrlFilter(SecurityUrlFilterDto urlFilter) {
    this.urlFilter = urlFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicyConfigDto securityPolicyConfigDto = (SecurityPolicyConfigDto) o;
    return Objects.equals(this.securityAclTmplId, securityPolicyConfigDto.securityAclTmplId) &&
        Objects.equals(this.securityAclTmplName, securityPolicyConfigDto.securityAclTmplName) &&
        Objects.equals(this.ipsecAclTmplId, securityPolicyConfigDto.ipsecAclTmplId) &&
        Objects.equals(this.ipsecAclTmplName, securityPolicyConfigDto.ipsecAclTmplName) &&
        Objects.equals(this.urlFilter, securityPolicyConfigDto.urlFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityAclTmplId, securityAclTmplName, ipsecAclTmplId, ipsecAclTmplName, urlFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicyConfigDto {\n");
    
    sb.append("    securityAclTmplId: ").append(toIndentedString(securityAclTmplId)).append("\n");
    sb.append("    securityAclTmplName: ").append(toIndentedString(securityAclTmplName)).append("\n");
    sb.append("    ipsecAclTmplId: ").append(toIndentedString(ipsecAclTmplId)).append("\n");
    sb.append("    ipsecAclTmplName: ").append(toIndentedString(ipsecAclTmplName)).append("\n");
    sb.append("    urlFilter: ").append(toIndentedString(urlFilter)).append("\n");
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

