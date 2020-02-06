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
import com.huawei.cloudcampus.api.model.FileInfoModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 软件包和补丁的信息。
 */
@ApiModel(description = "软件包和补丁的信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:28.844+08:00")
public class Pkg {
  @SerializedName("pkgList")
  private List<FileInfoModel> pkgList = null;

  @SerializedName("pkgPatchMap")
  private Map<String, List<FileInfoModel>> pkgPatchMap = null;

  public Pkg pkgList(List<FileInfoModel> pkgList) {
    this.pkgList = pkgList;
    return this;
  }

  public Pkg addPkgListItem(FileInfoModel pkgListItem) {
    if (this.pkgList == null) {
      this.pkgList = new ArrayList<FileInfoModel>();
    }
    this.pkgList.add(pkgListItem);
    return this;
  }

   /**
   * 查询到的软件包列表信息。
   * return pkgList
  **/
  @ApiModelProperty(value = "查询到的软件包列表信息。")
  public List<FileInfoModel> getPkgList() {
    return pkgList;
  }

   /**
   * 查询到的软件包列表信息。
   * Param pkgList
  **/
  public void setPkgList(List<FileInfoModel> pkgList) {
    this.pkgList = pkgList;
  }

  public Pkg pkgPatchMap(Map<String, List<FileInfoModel>> pkgPatchMap) {
    this.pkgPatchMap = pkgPatchMap;
    return this;
  }

  public Pkg putPkgPatchMapItem(String key, List<FileInfoModel> pkgPatchMapItem) {
    if (this.pkgPatchMap == null) {
      this.pkgPatchMap = new HashMap<String, List<FileInfoModel>>();
    }
    this.pkgPatchMap.put(key, pkgPatchMapItem);
    return this;
  }

   /**
   * 软件包对应的补丁包。
   * return pkgPatchMap
  **/
  @ApiModelProperty(value = "软件包对应的补丁包。")
  public Map<String, List<FileInfoModel>> getPkgPatchMap() {
    return pkgPatchMap;
  }

   /**
   * 软件包对应的补丁包。
   * Param pkgPatchMap
  **/
  public void setPkgPatchMap(Map<String, List<FileInfoModel>> pkgPatchMap) {
    this.pkgPatchMap = pkgPatchMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pkg pkg = (Pkg) o;
    return Objects.equals(this.pkgList, pkg.pkgList) &&
        Objects.equals(this.pkgPatchMap, pkg.pkgPatchMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkgList, pkgPatchMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pkg {\n");
    
    sb.append("    pkgList: ").append(toIndentedString(pkgList)).append("\n");
    sb.append("    pkgPatchMap: ").append(toIndentedString(pkgPatchMap)).append("\n");
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

