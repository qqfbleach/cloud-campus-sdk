/*
 * 设备升级
 * · 查询设备文件 · 创建站点升级 · 查询站点升级 · 查询设备升级 · 取消设备升级 · 删除站点升级 · 重新升级设备 
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
import com.huawei.cloudcampus.api.model.DownloadPolicyDto;
import com.huawei.cloudcampus.api.model.RestartPolicyDto;
import com.huawei.cloudcampus.api.model.UpPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 站点升级计划。
 */
@ApiModel(description = "站点升级计划。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:28.844+08:00")
public class UpgradePolicyDto {
  @SerializedName("siteId")
  private UUID siteId = null;

  @SerializedName("downloadPolicyDto")
  private DownloadPolicyDto downloadPolicyDto = null;

  @SerializedName("restartPolicyDto")
  private RestartPolicyDto restartPolicyDto = null;

  @SerializedName("upPath")
  private List<UpPath> upPath = new ArrayList<UpPath>();

  public UpgradePolicyDto siteId(UUID siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * 站点ID。
   * return siteId
  **/
  @ApiModelProperty(required = true, value = "站点ID。")
  public UUID getSiteId() {
    return siteId;
  }

   /**
   * 站点ID。
   * Param siteId
  **/
  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }

  public UpgradePolicyDto downloadPolicyDto(DownloadPolicyDto downloadPolicyDto) {
    this.downloadPolicyDto = downloadPolicyDto;
    return this;
  }

   /**
   * Get downloadPolicyDto
   * return downloadPolicyDto
  **/
  @ApiModelProperty(required = true, value = "")
  public DownloadPolicyDto getDownloadPolicyDto() {
    return downloadPolicyDto;
  }

   /**
   * Set downloadPolicyDto
   * Param downloadPolicyDto
  **/
  public void setDownloadPolicyDto(DownloadPolicyDto downloadPolicyDto) {
    this.downloadPolicyDto = downloadPolicyDto;
  }

  public UpgradePolicyDto restartPolicyDto(RestartPolicyDto restartPolicyDto) {
    this.restartPolicyDto = restartPolicyDto;
    return this;
  }

   /**
   * Get restartPolicyDto
   * return restartPolicyDto
  **/
  @ApiModelProperty(required = true, value = "")
  public RestartPolicyDto getRestartPolicyDto() {
    return restartPolicyDto;
  }

   /**
   * Set restartPolicyDto
   * Param restartPolicyDto
  **/
  public void setRestartPolicyDto(RestartPolicyDto restartPolicyDto) {
    this.restartPolicyDto = restartPolicyDto;
  }

  public UpgradePolicyDto upPath(List<UpPath> upPath) {
    this.upPath = upPath;
    return this;
  }

  public UpgradePolicyDto addUpPathItem(UpPath upPathItem) {
    this.upPath.add(upPathItem);
    return this;
  }

   /**
   * 升级路径。
   * return upPath
  **/
  @ApiModelProperty(required = true, value = "升级路径。")
  public List<UpPath> getUpPath() {
    return upPath;
  }

   /**
   * 升级路径。
   * Param upPath
  **/
  public void setUpPath(List<UpPath> upPath) {
    this.upPath = upPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradePolicyDto upgradePolicyDto = (UpgradePolicyDto) o;
    return Objects.equals(this.siteId, upgradePolicyDto.siteId) &&
        Objects.equals(this.downloadPolicyDto, upgradePolicyDto.downloadPolicyDto) &&
        Objects.equals(this.restartPolicyDto, upgradePolicyDto.restartPolicyDto) &&
        Objects.equals(this.upPath, upgradePolicyDto.upPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, downloadPolicyDto, restartPolicyDto, upPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradePolicyDto {\n");
    
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    downloadPolicyDto: ").append(toIndentedString(downloadPolicyDto)).append("\n");
    sb.append("    restartPolicyDto: ").append(toIndentedString(restartPolicyDto)).append("\n");
    sb.append("    upPath: ").append(toIndentedString(upPath)).append("\n");
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

