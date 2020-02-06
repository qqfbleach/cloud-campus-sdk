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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * portal认证内容，当mode为open时必选。
 */
@ApiModel(description = "portal认证内容，当mode为open时必选。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class PortalContentDto {
  /**
   * 认证方式。 portalDisable---不启用Portal认证、portalThirdIndirect---云平台中继认证（对接方式：API）
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    PORTALDISABLE("portalDisable"),
    
    PORTALTHIRDINDIRECT("portalThirdIndirect");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("freeAuthEnable")
  private Boolean freeAuthEnable = null;

  @SerializedName("authExpireUnit")
  private String authExpireUnit = null;

  @SerializedName("authExpire")
  private Integer authExpire = null;

  @SerializedName("escapeStrategy")
  private Integer escapeStrategy = null;

  @SerializedName("freeAclTmplId")
  private String freeAclTmplId = null;

  @SerializedName("freeAclTmplName")
  private String freeAclTmplName = null;

  public PortalContentDto mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * 认证方式。 portalDisable---不启用Portal认证、portalThirdIndirect---云平台中继认证（对接方式：API）
   * return mode
  **/
  @ApiModelProperty(required = true, value = "认证方式。 portalDisable---不启用Portal认证、portalThirdIndirect---云平台中继认证（对接方式：API）")
  public ModeEnum getMode() {
    return mode;
  }

   /**
   * 认证方式。 portalDisable---不启用Portal认证、portalThirdIndirect---云平台中继认证（对接方式：API）
   * Param mode
  **/
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public PortalContentDto freeAuthEnable(Boolean freeAuthEnable) {
    this.freeAuthEnable = freeAuthEnable;
    return this;
  }

   /**
   * 有效期内免认证是否开启，当mode为portalThirdIndirect时必选。若值为true，则开启MAC优先的portal认证。
   * return freeAuthEnable
  **/
  @ApiModelProperty(value = "有效期内免认证是否开启，当mode为portalThirdIndirect时必选。若值为true，则开启MAC优先的portal认证。")
  public Boolean getFreeAuthEnable() {
    return freeAuthEnable;
  }

   /**
   * 有效期内免认证是否开启，当mode为portalThirdIndirect时必选。若值为true，则开启MAC优先的portal认证。
   * Param freeAuthEnable
  **/
  public void setFreeAuthEnable(Boolean freeAuthEnable) {
    this.freeAuthEnable = freeAuthEnable;
  }

  public PortalContentDto authExpireUnit(String authExpireUnit) {
    this.authExpireUnit = authExpireUnit;
    return this;
  }

   /**
   * Portal认证有效期单位，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为minute；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。
   * return authExpireUnit
  **/
  @ApiModelProperty(value = "Portal认证有效期单位，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为minute；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。")
  public String getAuthExpireUnit() {
    return authExpireUnit;
  }

   /**
   * Portal认证有效期单位，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为minute；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。只能为day、hour、minute中的一个，大小写不敏感，前后空格忽略，且不能含有全角字符。
   * Param authExpireUnit
  **/
  public void setAuthExpireUnit(String authExpireUnit) {
    this.authExpireUnit = authExpireUnit;
  }

  public PortalContentDto authExpire(Integer authExpire) {
    this.authExpire = authExpire;
    return this;
  }

   /**
   * Portal认证有效期，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为2；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。 authExpireUnit为minute时，范围为1~59。 authExpireUnit为hour时，范围为1~23。 authExpireUnit为day时，范围为1~365。
   * minimum: 1
   * maximum: 365
   * return authExpire
  **/
  @ApiModelProperty(value = "Portal认证有效期，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为2；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。 authExpireUnit为minute时，范围为1~59。 authExpireUnit为hour时，范围为1~23。 authExpireUnit为day时，范围为1~365。")
  public Integer getAuthExpire() {
    return authExpire;
  }

   /**
   * Portal认证有效期，ssid创建场景：freeAuthEnable为true时，此字段不传则默认值为2；ssid更新场景：freeAuthEnable为true时，此字段不传则使用更新前的值。 authExpireUnit为minute时，范围为1~59。 authExpireUnit为hour时，范围为1~23。 authExpireUnit为day时，范围为1~365。
   * minimum: 1
   * maximum: 365
   * Param authExpire
  **/
  public void setAuthExpire(Integer authExpire) {
    this.authExpire = authExpire;
  }

  public PortalContentDto escapeStrategy(Integer escapeStrategy) {
    this.escapeStrategy = escapeStrategy;
    return this;
  }

   /**
   * 逃生策略，当mode为portalThirdIndirect时有效。 1---允许已认证用户继续使用网络，新用户不允许接入，默认值 2---允许用户接入，不需要认证
   * return escapeStrategy
  **/
  @ApiModelProperty(value = "逃生策略，当mode为portalThirdIndirect时有效。 1---允许已认证用户继续使用网络，新用户不允许接入，默认值 2---允许用户接入，不需要认证")
  public Integer getEscapeStrategy() {
    return escapeStrategy;
  }

   /**
   * 逃生策略，当mode为portalThirdIndirect时有效。 1---允许已认证用户继续使用网络，新用户不允许接入，默认值 2---允许用户接入，不需要认证
   * Param escapeStrategy
  **/
  public void setEscapeStrategy(Integer escapeStrategy) {
    this.escapeStrategy = escapeStrategy;
  }

  public PortalContentDto freeAclTmplId(String freeAclTmplId) {
    this.freeAclTmplId = freeAclTmplId;
    return this;
  }

   /**
   * 免认证ACL，当mode为portalThirdIndirect时必填。免认证ACL可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * return freeAclTmplId
  **/
  @ApiModelProperty(value = "免认证ACL，当mode为portalThirdIndirect时必填。免认证ACL可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。")
  public String getFreeAclTmplId() {
    return freeAclTmplId;
  }

   /**
   * 免认证ACL，当mode为portalThirdIndirect时必填。免认证ACL可以通过第三方开放接口/controller/campus/v3/profile/acl得到。UUID格式。
   * Param freeAclTmplId
  **/
  public void setFreeAclTmplId(String freeAclTmplId) {
    this.freeAclTmplId = freeAclTmplId;
  }

  public PortalContentDto freeAclTmplName(String freeAclTmplName) {
    this.freeAclTmplName = freeAclTmplName;
    return this;
  }

   /**
   * 免认证ACL名称，当mode为portalThirdIndirect时有效。POST与PUT操作时，该字段无效。长度为1至32字节。
   * return freeAclTmplName
  **/
  @ApiModelProperty(value = "免认证ACL名称，当mode为portalThirdIndirect时有效。POST与PUT操作时，该字段无效。长度为1至32字节。")
  public String getFreeAclTmplName() {
    return freeAclTmplName;
  }

   /**
   * 免认证ACL名称，当mode为portalThirdIndirect时有效。POST与PUT操作时，该字段无效。长度为1至32字节。
   * Param freeAclTmplName
  **/
  public void setFreeAclTmplName(String freeAclTmplName) {
    this.freeAclTmplName = freeAclTmplName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalContentDto portalContentDto = (PortalContentDto) o;
    return Objects.equals(this.mode, portalContentDto.mode) &&
        Objects.equals(this.freeAuthEnable, portalContentDto.freeAuthEnable) &&
        Objects.equals(this.authExpireUnit, portalContentDto.authExpireUnit) &&
        Objects.equals(this.authExpire, portalContentDto.authExpire) &&
        Objects.equals(this.escapeStrategy, portalContentDto.escapeStrategy) &&
        Objects.equals(this.freeAclTmplId, portalContentDto.freeAclTmplId) &&
        Objects.equals(this.freeAclTmplName, portalContentDto.freeAclTmplName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, freeAuthEnable, authExpireUnit, authExpire, escapeStrategy, freeAclTmplId, freeAclTmplName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalContentDto {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    freeAuthEnable: ").append(toIndentedString(freeAuthEnable)).append("\n");
    sb.append("    authExpireUnit: ").append(toIndentedString(authExpireUnit)).append("\n");
    sb.append("    authExpire: ").append(toIndentedString(authExpire)).append("\n");
    sb.append("    escapeStrategy: ").append(toIndentedString(escapeStrategy)).append("\n");
    sb.append("    freeAclTmplId: ").append(toIndentedString(freeAclTmplId)).append("\n");
    sb.append("    freeAclTmplName: ").append(toIndentedString(freeAclTmplName)).append("\n");
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

