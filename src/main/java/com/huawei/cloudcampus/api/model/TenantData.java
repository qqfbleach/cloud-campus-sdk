/*
 * 租户管理
 * 租户管理第三方北向接口。 · 提供租户创建接口 · 提供租户删除接口 · 提供租户查询接口 
 *
 * OpenAPI spec version: 1.0.2
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
import com.huawei.cloudcampus.api.model.TenantCommonDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 租户公共结构体。
 */
@ApiModel(description = "租户公共结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:16.197+08:00")
public class TenantData {
  @SerializedName("tenantName")
  private String tenantName = null;

  @SerializedName("tenantEmail")
  private String tenantEmail = null;

  @SerializedName("tenantPhone")
  private String tenantPhone = null;

  @SerializedName("tenantDescription")
  private String tenantDescription = null;

  @SerializedName("tenantAddress")
  private String tenantAddress = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  public TenantData tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * 租户名称。
   * return tenantName
  **/
  @ApiModelProperty(value = "租户名称。")
  public String getTenantName() {
    return tenantName;
  }

   /**
   * 租户名称。
   * Param tenantName
  **/
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public TenantData tenantEmail(String tenantEmail) {
    this.tenantEmail = tenantEmail;
    return this;
  }

   /**
   * 租户服务邮箱。
   * return tenantEmail
  **/
  @ApiModelProperty(value = "租户服务邮箱。")
  public String getTenantEmail() {
    return tenantEmail;
  }

   /**
   * 租户服务邮箱。
   * Param tenantEmail
  **/
  public void setTenantEmail(String tenantEmail) {
    this.tenantEmail = tenantEmail;
  }

  public TenantData tenantPhone(String tenantPhone) {
    this.tenantPhone = tenantPhone;
    return this;
  }

   /**
   * 租户服务电话。
   * return tenantPhone
  **/
  @ApiModelProperty(value = "租户服务电话。")
  public String getTenantPhone() {
    return tenantPhone;
  }

   /**
   * 租户服务电话。
   * Param tenantPhone
  **/
  public void setTenantPhone(String tenantPhone) {
    this.tenantPhone = tenantPhone;
  }

  public TenantData tenantDescription(String tenantDescription) {
    this.tenantDescription = tenantDescription;
    return this;
  }

   /**
   * 租户描述。
   * return tenantDescription
  **/
  @ApiModelProperty(value = "租户描述。")
  public String getTenantDescription() {
    return tenantDescription;
  }

   /**
   * 租户描述。
   * Param tenantDescription
  **/
  public void setTenantDescription(String tenantDescription) {
    this.tenantDescription = tenantDescription;
  }

  public TenantData tenantAddress(String tenantAddress) {
    this.tenantAddress = tenantAddress;
    return this;
  }

   /**
   * 租户地址。
   * return tenantAddress
  **/
  @ApiModelProperty(value = "租户地址。")
  public String getTenantAddress() {
    return tenantAddress;
  }

   /**
   * 租户地址。
   * Param tenantAddress
  **/
  public void setTenantAddress(String tenantAddress) {
    this.tenantAddress = tenantAddress;
  }

  public TenantData tenantId(String tenantId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantData tenantData = (TenantData) o;
    return Objects.equals(this.tenantName, tenantData.tenantName) &&
        Objects.equals(this.tenantEmail, tenantData.tenantEmail) &&
        Objects.equals(this.tenantPhone, tenantData.tenantPhone) &&
        Objects.equals(this.tenantDescription, tenantData.tenantDescription) &&
        Objects.equals(this.tenantAddress, tenantData.tenantAddress) &&
        Objects.equals(this.tenantId, tenantData.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantName, tenantEmail, tenantPhone, tenantDescription, tenantAddress, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantData {\n");
    
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    tenantEmail: ").append(toIndentedString(tenantEmail)).append("\n");
    sb.append("    tenantPhone: ").append(toIndentedString(tenantPhone)).append("\n");
    sb.append("    tenantDescription: ").append(toIndentedString(tenantDescription)).append("\n");
    sb.append("    tenantAddress: ").append(toIndentedString(tenantAddress)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
