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
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityUrlFilterDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:17.238+08:00")
public class SecurityUrlFilterDto {
  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("urls")
  private List<String> urls = null;

  public SecurityUrlFilterDto enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * 是否使能URL过滤。创建SSID时，若未填写此字段，默认值为true。该黑白名单机制对使用代理服务器的浏览器不生效。
   * return enable
  **/
  @ApiModelProperty(value = "是否使能URL过滤。创建SSID时，若未填写此字段，默认值为true。该黑白名单机制对使用代理服务器的浏览器不生效。")
  public Boolean getEnable() {
    return enable;
  }

   /**
   * 是否使能URL过滤。创建SSID时，若未填写此字段，默认值为true。该黑白名单机制对使用代理服务器的浏览器不生效。
   * Param enable
  **/
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public SecurityUrlFilterDto mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * URL过滤类型，当enable为true时mode字段必填。 0---黑名单 1---白名单
   * return mode
  **/
  @ApiModelProperty(value = "URL过滤类型，当enable为true时mode字段必填。 0---黑名单 1---白名单")
  public Integer getMode() {
    return mode;
  }

   /**
   * URL过滤类型，当enable为true时mode字段必填。 0---黑名单 1---白名单
   * Param mode
  **/
  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public SecurityUrlFilterDto urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public SecurityUrlFilterDto addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URL列表。URL长度4-80个字符。当enable为true时有效。mode为0时，urls表示允许访问未匹配的url；mode为1时，urls表示禁止访问未匹配的url。每个URL限制要求：&#39;*&#39;只能出现在首尾，&#39;*&#39;不算做有效字符，前后空格忽略，前缀&#39;http://&#39;忽略，且不能含有全角字符。
   * return urls
  **/
  @ApiModelProperty(value = "URL列表。URL长度4-80个字符。当enable为true时有效。mode为0时，urls表示允许访问未匹配的url；mode为1时，urls表示禁止访问未匹配的url。每个URL限制要求：'*'只能出现在首尾，'*'不算做有效字符，前后空格忽略，前缀'http://'忽略，且不能含有全角字符。")
  public List<String> getUrls() {
    return urls;
  }

   /**
   * URL列表。URL长度4-80个字符。当enable为true时有效。mode为0时，urls表示允许访问未匹配的url；mode为1时，urls表示禁止访问未匹配的url。每个URL限制要求：&#39;*&#39;只能出现在首尾，&#39;*&#39;不算做有效字符，前后空格忽略，前缀&#39;http://&#39;忽略，且不能含有全角字符。
   * Param urls
  **/
  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityUrlFilterDto securityUrlFilterDto = (SecurityUrlFilterDto) o;
    return Objects.equals(this.enable, securityUrlFilterDto.enable) &&
        Objects.equals(this.mode, securityUrlFilterDto.mode) &&
        Objects.equals(this.urls, securityUrlFilterDto.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, mode, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityUrlFilterDto {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

