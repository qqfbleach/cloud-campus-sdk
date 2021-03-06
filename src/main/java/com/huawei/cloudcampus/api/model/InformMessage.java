/*
 * 链路管理
 * 链路管理北向接口 
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
import com.huawei.cloudcampus.api.model.LinkModelForWebNotify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 网络链路变更通知的数据结构
 */
@ApiModel(description = "网络链路变更通知的数据结构")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:41.151+08:00")
public class InformMessage {
  @SerializedName("resourceURI")
  private String resourceURI = null;

  @SerializedName("msgType")
  private Integer msgType = null;

  @SerializedName("data")
  private List<LinkModelForWebNotify> data = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  public InformMessage resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * Get resourceURI
   * return resourceURI
  **/
  @ApiModelProperty(value = "")
  public String getResourceURI() {
    return resourceURI;
  }

   /**
   * Set resourceURI
   * Param resourceURI
  **/
  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public InformMessage msgType(Integer msgType) {
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型： 1：创建 2：删除 3：修改 
   * return msgType
  **/
  @ApiModelProperty(value = "消息类型： 1：创建 2：删除 3：修改 ")
  public Integer getMsgType() {
    return msgType;
  }

   /**
   * 消息类型： 1：创建 2：删除 3：修改 
   * Param msgType
  **/
  public void setMsgType(Integer msgType) {
    this.msgType = msgType;
  }

  public InformMessage data(List<LinkModelForWebNotify> data) {
    this.data = data;
    return this;
  }

  public InformMessage addDataItem(LinkModelForWebNotify dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LinkModelForWebNotify>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * return data
  **/
  @ApiModelProperty(value = "")
  public List<LinkModelForWebNotify> getData() {
    return data;
  }

   /**
   * Set data
   * Param data
  **/
  public void setData(List<LinkModelForWebNotify> data) {
    this.data = data;
  }

  public InformMessage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Set description
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public InformMessage timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * return timestamp
  **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }

   /**
   * Set timestamp
   * Param timestamp
  **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformMessage informMessage = (InformMessage) o;
    return Objects.equals(this.resourceURI, informMessage.resourceURI) &&
        Objects.equals(this.msgType, informMessage.msgType) &&
        Objects.equals(this.data, informMessage.data) &&
        Objects.equals(this.description, informMessage.description) &&
        Objects.equals(this.timestamp, informMessage.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceURI, msgType, data, description, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformMessage {\n");
    
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

