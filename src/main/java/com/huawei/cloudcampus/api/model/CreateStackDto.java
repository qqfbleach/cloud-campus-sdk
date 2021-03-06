/*
 * 堆叠管理
 * 堆叠管理第三方接口。 场景：创建堆叠操作的第三方接口。
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
import com.huawei.cloudcampus.api.model.CreateStackDtoData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建堆叠入参模型。
 */
@ApiModel(description = "创建堆叠入参模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:11.966+08:00")
public class CreateStackDto {
  @SerializedName("stacks")
  private List<CreateStackDtoData> stacks = new ArrayList<CreateStackDtoData>();

  public CreateStackDto stacks(List<CreateStackDtoData> stacks) {
    this.stacks = stacks;
    return this;
  }

  public CreateStackDto addStacksItem(CreateStackDtoData stacksItem) {
    this.stacks.add(stacksItem);
    return this;
  }

   /**
   * 堆叠信息。
   * return stacks
  **/
  @ApiModelProperty(required = true, value = "堆叠信息。")
  public List<CreateStackDtoData> getStacks() {
    return stacks;
  }

   /**
   * 堆叠信息。
   * Param stacks
  **/
  public void setStacks(List<CreateStackDtoData> stacks) {
    this.stacks = stacks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStackDto createStackDto = (CreateStackDto) o;
    return Objects.equals(this.stacks, createStackDto.stacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stacks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStackDto {\n");
    
    sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
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

