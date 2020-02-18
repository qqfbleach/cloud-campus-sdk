/*
 * CIS服务接口
 * CIS操作接口说明： 1、创建CIS隔离 2、创建CIS阻断 3、撤销CIS阻断/隔离 4、阻断隔离应用状态查询 5、CIS策略命中率查询 
 *
 * OpenAPI spec version: v1
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
import com.huawei.cloudcampus.api.model.PolicyHitsListBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CIS策略命中率查询响应模型。
 */
@ApiModel(description = "CIS策略命中率查询响应模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:17:59.469+08:00")
public class QueryHitsResponseDTO {
  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("hitStatus")
  private List<PolicyHitsListBuilder> hitStatus = null;

  public QueryHitsResponseDTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * 开始日期，yyyy-MM-dd HH:mm:ss。
   * return startDate
  **/
  @ApiModelProperty(value = "开始日期，yyyy-MM-dd HH:mm:ss。")
  public String getStartDate() {
    return startDate;
  }

   /**
   * 开始日期，yyyy-MM-dd HH:mm:ss。
   * Param startDate
  **/
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public QueryHitsResponseDTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * 结束日期，yyyy-MM-dd HH:mm:ss。
   * return endDate
  **/
  @ApiModelProperty(value = "结束日期，yyyy-MM-dd HH:mm:ss。")
  public String getEndDate() {
    return endDate;
  }

   /**
   * 结束日期，yyyy-MM-dd HH:mm:ss。
   * Param endDate
  **/
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public QueryHitsResponseDTO hitStatus(List<PolicyHitsListBuilder> hitStatus) {
    this.hitStatus = hitStatus;
    return this;
  }

  public QueryHitsResponseDTO addHitStatusItem(PolicyHitsListBuilder hitStatusItem) {
    if (this.hitStatus == null) {
      this.hitStatus = new ArrayList<PolicyHitsListBuilder>();
    }
    this.hitStatus.add(hitStatusItem);
    return this;
  }

   /**
   * 命中状态。
   * return hitStatus
  **/
  @ApiModelProperty(value = "命中状态。")
  public List<PolicyHitsListBuilder> getHitStatus() {
    return hitStatus;
  }

   /**
   * 命中状态。
   * Param hitStatus
  **/
  public void setHitStatus(List<PolicyHitsListBuilder> hitStatus) {
    this.hitStatus = hitStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryHitsResponseDTO queryHitsResponseDTO = (QueryHitsResponseDTO) o;
    return Objects.equals(this.startDate, queryHitsResponseDTO.startDate) &&
        Objects.equals(this.endDate, queryHitsResponseDTO.endDate) &&
        Objects.equals(this.hitStatus, queryHitsResponseDTO.hitStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, hitStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryHitsResponseDTO {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hitStatus: ").append(toIndentedString(hitStatus)).append("\n");
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
