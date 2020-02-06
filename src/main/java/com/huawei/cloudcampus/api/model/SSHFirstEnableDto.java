/*
 * SSH客户端首次认证免公钥配置
 * SSH客户端首次认证免公钥配置北向接口，主要特性： · 查询SSH客户端首次认证免公钥配置 · 修改SSH客户端首次认证免公钥配置 
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
 * SSH客户端首次认证免公钥开关结构体。
 */
@ApiModel(description = "SSH客户端首次认证免公钥开关结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:10.646+08:00")
public class SSHFirstEnableDto {
  @SerializedName("sshFirstTimeEnable")
  private Boolean sshFirstTimeEnable = null;

  public SSHFirstEnableDto sshFirstTimeEnable(Boolean sshFirstTimeEnable) {
    this.sshFirstTimeEnable = sshFirstTimeEnable;
    return this;
  }

   /**
   * 用于标识SSH客户端首次认证免公钥开关是否打开。
   * return sshFirstTimeEnable
  **/
  @ApiModelProperty(required = true, value = "用于标识SSH客户端首次认证免公钥开关是否打开。")
  public Boolean getSshFirstTimeEnable() {
    return sshFirstTimeEnable;
  }

   /**
   * 用于标识SSH客户端首次认证免公钥开关是否打开。
   * Param sshFirstTimeEnable
  **/
  public void setSshFirstTimeEnable(Boolean sshFirstTimeEnable) {
    this.sshFirstTimeEnable = sshFirstTimeEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSHFirstEnableDto ssHFirstEnableDto = (SSHFirstEnableDto) o;
    return Objects.equals(this.sshFirstTimeEnable, ssHFirstEnableDto.sshFirstTimeEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshFirstTimeEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHFirstEnableDto {\n");
    
    sb.append("    sshFirstTimeEnable: ").append(toIndentedString(sshFirstTimeEnable)).append("\n");
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

