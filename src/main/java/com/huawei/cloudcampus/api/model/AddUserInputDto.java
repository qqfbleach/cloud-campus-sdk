/*
 * 用户管理
 * 用户管理第三方北向接口。 
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
import com.huawei.cloudcampus.api.model.UserCommonInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddUserInputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:07.935+08:00")
public class AddUserInputDto {
  @SerializedName("userName")
  private String userName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("telephone")
  private String telephone = null;

  @SerializedName("vaildPeriod")
  private String vaildPeriod = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nextUpdateUserpass")
  private Boolean nextUpdateUserpass = null;

  @SerializedName("userGroupId")
  private String userGroupId = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("passwordConfirm")
  private String passwordConfirm = null;

  public AddUserInputDto userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 用户名。
   * return userName
  **/
  @ApiModelProperty(required = true, value = "用户名。")
  public String getUserName() {
    return userName;
  }

   /**
   * 用户名。
   * Param userName
  **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AddUserInputDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 邮箱。
   * return email
  **/
  @ApiModelProperty(value = "邮箱。")
  public String getEmail() {
    return email;
  }

   /**
   * 邮箱。
   * Param email
  **/
  public void setEmail(String email) {
    this.email = email;
  }

  public AddUserInputDto telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * 联系电话。
   * return telephone
  **/
  @ApiModelProperty(value = "联系电话。")
  public String getTelephone() {
    return telephone;
  }

   /**
   * 联系电话。
   * Param telephone
  **/
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public AddUserInputDto vaildPeriod(String vaildPeriod) {
    this.vaildPeriod = vaildPeriod;
    return this;
  }

   /**
   * 用户到期时间。
   * return vaildPeriod
  **/
  @ApiModelProperty(value = "用户到期时间。")
  public String getVaildPeriod() {
    return vaildPeriod;
  }

   /**
   * 用户到期时间。
   * Param vaildPeriod
  **/
  public void setVaildPeriod(String vaildPeriod) {
    this.vaildPeriod = vaildPeriod;
  }

  public AddUserInputDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 用户描述信息。
   * return description
  **/
  @ApiModelProperty(value = "用户描述信息。")
  public String getDescription() {
    return description;
  }

   /**
   * 用户描述信息。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public AddUserInputDto nextUpdateUserpass(Boolean nextUpdateUserpass) {
    this.nextUpdateUserpass = nextUpdateUserpass;
    return this;
  }

   /**
   * 下次登录修改密码。
   * return nextUpdateUserpass
  **/
  @ApiModelProperty(value = "下次登录修改密码。")
  public Boolean getNextUpdateUserpass() {
    return nextUpdateUserpass;
  }

   /**
   * 下次登录修改密码。
   * Param nextUpdateUserpass
  **/
  public void setNextUpdateUserpass(Boolean nextUpdateUserpass) {
    this.nextUpdateUserpass = nextUpdateUserpass;
  }

  public AddUserInputDto userGroupId(String userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

   /**
   * 用户组ID。
   * return userGroupId
  **/
  @ApiModelProperty(required = true, value = "用户组ID。")
  public String getUserGroupId() {
    return userGroupId;
  }

   /**
   * 用户组ID。
   * Param userGroupId
  **/
  public void setUserGroupId(String userGroupId) {
    this.userGroupId = userGroupId;
  }

  public AddUserInputDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 密码。
   * return password
  **/
  @ApiModelProperty(required = true, value = "密码。")
  public String getPassword() {
    return password;
  }

   /**
   * 密码。
   * Param password
  **/
  public void setPassword(String password) {
    this.password = password;
  }

  public AddUserInputDto passwordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
    return this;
  }

   /**
   * 确认密码。
   * return passwordConfirm
  **/
  @ApiModelProperty(required = true, value = "确认密码。")
  public String getPasswordConfirm() {
    return passwordConfirm;
  }

   /**
   * 确认密码。
   * Param passwordConfirm
  **/
  public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUserInputDto addUserInputDto = (AddUserInputDto) o;
    return Objects.equals(this.userName, addUserInputDto.userName) &&
        Objects.equals(this.email, addUserInputDto.email) &&
        Objects.equals(this.telephone, addUserInputDto.telephone) &&
        Objects.equals(this.vaildPeriod, addUserInputDto.vaildPeriod) &&
        Objects.equals(this.description, addUserInputDto.description) &&
        Objects.equals(this.nextUpdateUserpass, addUserInputDto.nextUpdateUserpass) &&
        Objects.equals(this.userGroupId, addUserInputDto.userGroupId) &&
        Objects.equals(this.password, addUserInputDto.password) &&
        Objects.equals(this.passwordConfirm, addUserInputDto.passwordConfirm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, email, telephone, vaildPeriod, description, nextUpdateUserpass, userGroupId, password, passwordConfirm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserInputDto {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    vaildPeriod: ").append(toIndentedString(vaildPeriod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nextUpdateUserpass: ").append(toIndentedString(nextUpdateUserpass)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirm: ").append(toIndentedString(passwordConfirm)).append("\n");
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

