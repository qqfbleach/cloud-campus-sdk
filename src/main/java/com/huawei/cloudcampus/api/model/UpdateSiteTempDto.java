/*
 * 站点模板管理
 * 站点模板第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.4
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
 * 站点模板信息。
 */
@ApiModel(description = "站点模板信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:09.284+08:00")
public class UpdateSiteTempDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("types")
  private List<String> types = null;

  @SerializedName("custom")
  private Boolean custom = null;

  /**
   * \&quot;支持定制的特性枚举（所有站点模板类型都支持定制通用配置特性：   snmp -- SNMP、   clientdata -- 运维配置(O&amp;M Parameters)、   bootrom -- BootROM、   time -- NTP时间(NTP Time)、   initloginuser -- 本地用户(Local User)； AP站点模板类型单独支持定制特性：   apssid -- AP SSID、   groupradio -- 射频(Radio)； FW站点模板类型单独支持定制特性：   fwtrafficpolicy -- 流量策略(Traffic Policy)、   fwsecureauth -- 认证(Authentication)、   fwssid -- FW SSID、   fwsecuritypolicy -- 安全策略(Security Policy)； LSW站点模板类型无单独支持的定制特性）。\&quot; 
   */
  @JsonAdapter(ConfigIdentifiesEnum.Adapter.class)
  public enum ConfigIdentifiesEnum {
    SNMP("snmp"),
    
    CLIENTDATA("clientdata"),
    
    BOOTROM("bootrom"),
    
    TIME("time"),
    
    INITLOGINUSER("initloginuser"),
    
    APSSID("apssid"),
    
    GROUPRADIO("groupradio"),
    
    FWSECUREAUTH("fwsecureauth"),
    
    FWSSID("fwssid"),
    
    FWTRAFFICPOLICY("fwtrafficpolicy"),
    
    FWSECURITYPOLICY("fwsecuritypolicy");

    private String value;

    ConfigIdentifiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigIdentifiesEnum fromValue(String text) {
      for (ConfigIdentifiesEnum b : ConfigIdentifiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfigIdentifiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigIdentifiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigIdentifiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfigIdentifiesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("configIdentifies")
  private List<ConfigIdentifiesEnum> configIdentifies = null;

  public UpdateSiteTempDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 站点模板名称（不支持包括特殊字符&#39; , : \&quot;  ^ / &lt; &gt; &#x3D; &amp; % # ? + ! ）几项。
   * return name
  **/
  @ApiModelProperty(required = true, value = "站点模板名称（不支持包括特殊字符' , : \"  ^ / < > = & % # ? + ! ）几项。")
  public String getName() {
    return name;
  }

   /**
   * 站点模板名称（不支持包括特殊字符&#39; , : \&quot;  ^ / &lt; &gt; &#x3D; &amp; % # ? + ! ）几项。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public UpdateSiteTempDto types(List<String> types) {
    this.types = types;
    return this;
  }

  public UpdateSiteTempDto addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * 站点模板类型列表，可为AP，LSW，FW。
   * return types
  **/
  @ApiModelProperty(value = "站点模板类型列表，可为AP，LSW，FW。")
  public List<String> getTypes() {
    return types;
  }

   /**
   * 站点模板类型列表，可为AP，LSW，FW。
   * Param types
  **/
  public void setTypes(List<String> types) {
    this.types = types;
  }

  public UpdateSiteTempDto custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

   /**
   * 是否定制特性。
   * return custom
  **/
  @ApiModelProperty(value = "是否定制特性。")
  public Boolean getCustom() {
    return custom;
  }

   /**
   * 是否定制特性。
   * Param custom
  **/
  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public UpdateSiteTempDto configIdentifies(List<ConfigIdentifiesEnum> configIdentifies) {
    this.configIdentifies = configIdentifies;
    return this;
  }

  public UpdateSiteTempDto addConfigIdentifiesItem(ConfigIdentifiesEnum configIdentifiesItem) {
    if (this.configIdentifies == null) {
      this.configIdentifies = new ArrayList<ConfigIdentifiesEnum>();
    }
    this.configIdentifies.add(configIdentifiesItem);
    return this;
  }

   /**
   * \&quot;当custom为true时必填且不能为空，支持定制的特性，和站点模板类型有对应关系（所有站点模板类型都支持定制通用配置特性：   snmp -- SNMP、   clientdata -- 运维配置(O&amp;M Parameters)、   bootrom -- BootROM、   time -- NTP时间(NTP Time)、   initloginuser -- 本地用户(Local User)； AP站点模板类型单独支持定制特性：   apssid -- AP SSID、   groupradio -- 射频(Radio)； FW站点模板类型单独支持定制特性：   fwtrafficpolicy -- 流量策略(Traffic Policy)、   fwsecureauth -- 认证(Authentication)、   fwssid -- FW SSID、   fwsecuritypolicy -- 安全策略(Security Policy)； LSW站点模板类型无单独支持的定制特性）。\&quot; 
   * return configIdentifies
  **/
  @ApiModelProperty(value = "\"当custom为true时必填且不能为空，支持定制的特性，和站点模板类型有对应关系（所有站点模板类型都支持定制通用配置特性：   snmp -- SNMP、   clientdata -- 运维配置(O&M Parameters)、   bootrom -- BootROM、   time -- NTP时间(NTP Time)、   initloginuser -- 本地用户(Local User)； AP站点模板类型单独支持定制特性：   apssid -- AP SSID、   groupradio -- 射频(Radio)； FW站点模板类型单独支持定制特性：   fwtrafficpolicy -- 流量策略(Traffic Policy)、   fwsecureauth -- 认证(Authentication)、   fwssid -- FW SSID、   fwsecuritypolicy -- 安全策略(Security Policy)； LSW站点模板类型无单独支持的定制特性）。\" ")
  public List<ConfigIdentifiesEnum> getConfigIdentifies() {
    return configIdentifies;
  }

   /**
   * \&quot;当custom为true时必填且不能为空，支持定制的特性，和站点模板类型有对应关系（所有站点模板类型都支持定制通用配置特性：   snmp -- SNMP、   clientdata -- 运维配置(O&amp;M Parameters)、   bootrom -- BootROM、   time -- NTP时间(NTP Time)、   initloginuser -- 本地用户(Local User)； AP站点模板类型单独支持定制特性：   apssid -- AP SSID、   groupradio -- 射频(Radio)； FW站点模板类型单独支持定制特性：   fwtrafficpolicy -- 流量策略(Traffic Policy)、   fwsecureauth -- 认证(Authentication)、   fwssid -- FW SSID、   fwsecuritypolicy -- 安全策略(Security Policy)； LSW站点模板类型无单独支持的定制特性）。\&quot; 
   * Param configIdentifies
  **/
  public void setConfigIdentifies(List<ConfigIdentifiesEnum> configIdentifies) {
    this.configIdentifies = configIdentifies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSiteTempDto updateSiteTempDto = (UpdateSiteTempDto) o;
    return Objects.equals(this.name, updateSiteTempDto.name) &&
        Objects.equals(this.types, updateSiteTempDto.types) &&
        Objects.equals(this.custom, updateSiteTempDto.custom) &&
        Objects.equals(this.configIdentifies, updateSiteTempDto.configIdentifies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, types, custom, configIdentifies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSiteTempDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    configIdentifies: ").append(toIndentedString(configIdentifies)).append("\n");
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

