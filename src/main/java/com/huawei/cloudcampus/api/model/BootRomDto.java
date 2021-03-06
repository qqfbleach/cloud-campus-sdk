/*
 * 设备BootROM密码配置
 * 设备BootROM密码配置第三方接口。
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
 * BootRomDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:24.761+08:00")
public class BootRomDto {
  @SerializedName("passwd")
  private String passwd = null;

  public BootRomDto passwd(String passwd) {
    this.passwd = passwd;
    return this;
  }

   /**
   * 1、密码长度必须在8-80位。 2、密码必须满足复杂度，即至少包含英文大写字母（A~Z）、英文小写字母（a~z）、数字（0~9）、特殊字符（如！、@、#、$、%）等中的三种，不允许包含&#39;、?和空格。 3、密码中不能包含两个以上连续的相同字符。 
   * return passwd
  **/
  @ApiModelProperty(value = "1、密码长度必须在8-80位。 2、密码必须满足复杂度，即至少包含英文大写字母（A~Z）、英文小写字母（a~z）、数字（0~9）、特殊字符（如！、@、#、$、%）等中的三种，不允许包含'、?和空格。 3、密码中不能包含两个以上连续的相同字符。 ")
  public String getPasswd() {
    return passwd;
  }

   /**
   * 1、密码长度必须在8-80位。 2、密码必须满足复杂度，即至少包含英文大写字母（A~Z）、英文小写字母（a~z）、数字（0~9）、特殊字符（如！、@、#、$、%）等中的三种，不允许包含&#39;、?和空格。 3、密码中不能包含两个以上连续的相同字符。 
   * Param passwd
  **/
  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BootRomDto bootRomDto = (BootRomDto) o;
    return Objects.equals(this.passwd, bootRomDto.passwd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BootRomDto {\n");
    
    sb.append("    passwd: ").append(toIndentedString(passwd)).append("\n");
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

