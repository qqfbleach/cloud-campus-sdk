/*
 * 终端用户管理
 * 终端用户管理开放API。 
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
import com.huawei.cloudcampus.api.model.ThirdUserInfoData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CutUserInputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:26.055+08:00")
public class CutUserInputDto {
  @SerializedName("thirdUserInfos")
  private List<ThirdUserInfoData> thirdUserInfos = null;

  public CutUserInputDto thirdUserInfos(List<ThirdUserInfoData> thirdUserInfos) {
    this.thirdUserInfos = thirdUserInfos;
    return this;
  }

  public CutUserInputDto addThirdUserInfosItem(ThirdUserInfoData thirdUserInfosItem) {
    if (this.thirdUserInfos == null) {
      this.thirdUserInfos = new ArrayList<ThirdUserInfoData>();
    }
    this.thirdUserInfos.add(thirdUserInfosItem);
    return this;
  }

   /**
   * Get thirdUserInfos
   * return thirdUserInfos
  **/
  @ApiModelProperty(value = "")
  public List<ThirdUserInfoData> getThirdUserInfos() {
    return thirdUserInfos;
  }

   /**
   * Set thirdUserInfos
   * Param thirdUserInfos
  **/
  public void setThirdUserInfos(List<ThirdUserInfoData> thirdUserInfos) {
    this.thirdUserInfos = thirdUserInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CutUserInputDto cutUserInputDto = (CutUserInputDto) o;
    return Objects.equals(this.thirdUserInfos, cutUserInputDto.thirdUserInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdUserInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutUserInputDto {\n");
    
    sb.append("    thirdUserInfos: ").append(toIndentedString(thirdUserInfos)).append("\n");
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
