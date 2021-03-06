/*
 * 终端用户认证授权
 * 终端用户认证开放API 
 *
 * OpenAPI spec version: 1.0.0
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
 * UserLogoutInputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:51.931+08:00")
public class UserLogoutInputDto {
  @SerializedName("psessionid")
  private String psessionid = null;

  public UserLogoutInputDto psessionid(String psessionid) {
    this.psessionid = psessionid;
    return this;
  }

   /**
   * 会话ID。
   * return psessionid
  **/
  @ApiModelProperty(value = "会话ID。")
  public String getPsessionid() {
    return psessionid;
  }

   /**
   * 会话ID。
   * Param psessionid
  **/
  public void setPsessionid(String psessionid) {
    this.psessionid = psessionid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLogoutInputDto userLogoutInputDto = (UserLogoutInputDto) o;
    return Objects.equals(this.psessionid, userLogoutInputDto.psessionid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psessionid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLogoutInputDto {\n");
    
    sb.append("    psessionid: ").append(toIndentedString(psessionid)).append("\n");
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

