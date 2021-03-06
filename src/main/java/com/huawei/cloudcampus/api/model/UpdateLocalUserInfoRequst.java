/*
 * 本地用户配置管理
 * 本地用户配置北向接口，主要特性： · 查询本地用户配置 · 修改本地用户配置 · 创建本地用户配置 
 *
 * OpenAPI spec version: 1.2.1
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
 * 修改本地用户信息请求数据结构。
 */
@ApiModel(description = "修改本地用户信息请求数据结构。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:24.051+08:00")
public class UpdateLocalUserInfoRequst {
  @SerializedName("password")
  private String password = null;

  @SerializedName("role")
  private Integer role = null;

  /**
   * Gets or Sets serviceType
   */
  @JsonAdapter(ServiceTypeEnum.Adapter.class)
  public enum ServiceTypeEnum {
    HTTP("http"),
    
    SSH("ssh");

    private String value;

    ServiceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceTypeEnum fromValue(String text) {
      for (ServiceTypeEnum b : ServiceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serviceType")
  private List<ServiceTypeEnum> serviceType = null;

  public UpdateLocalUserInfoRequst password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 用户密码。
   * return password
  **/
  @ApiModelProperty(value = "用户密码。")
  public String getPassword() {
    return password;
  }

   /**
   * 用户密码。
   * Param password
  **/
  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateLocalUserInfoRequst role(Integer role) {
    this.role = role;
    return this;
  }

   /**
   * 用户角色（1---Monitor User，15---Manager User）。
   * return role
  **/
  @ApiModelProperty(value = "用户角色（1---Monitor User，15---Manager User）。")
  public Integer getRole() {
    return role;
  }

   /**
   * 用户角色（1---Monitor User，15---Manager User）。
   * Param role
  **/
  public void setRole(Integer role) {
    this.role = role;
  }

  public UpdateLocalUserInfoRequst serviceType(List<ServiceTypeEnum> serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  public UpdateLocalUserInfoRequst addServiceTypeItem(ServiceTypeEnum serviceTypeItem) {
    if (this.serviceType == null) {
      this.serviceType = new ArrayList<ServiceTypeEnum>();
    }
    this.serviceType.add(serviceTypeItem);
    return this;
  }

   /**
   * 登录类型（\&quot;http\&quot;，\&quot;ssh\&quot;）。
   * return serviceType
  **/
  @ApiModelProperty(value = "登录类型（\"http\"，\"ssh\"）。")
  public List<ServiceTypeEnum> getServiceType() {
    return serviceType;
  }

   /**
   * 登录类型（\&quot;http\&quot;，\&quot;ssh\&quot;）。
   * Param serviceType
  **/
  public void setServiceType(List<ServiceTypeEnum> serviceType) {
    this.serviceType = serviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLocalUserInfoRequst updateLocalUserInfoRequst = (UpdateLocalUserInfoRequst) o;
    return Objects.equals(this.password, updateLocalUserInfoRequst.password) &&
        Objects.equals(this.role, updateLocalUserInfoRequst.role) &&
        Objects.equals(this.serviceType, updateLocalUserInfoRequst.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, role, serviceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLocalUserInfoRequst {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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

