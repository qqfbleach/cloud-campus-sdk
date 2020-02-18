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
import com.huawei.cloudcampus.api.model.DataObjectJson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IT设备链路变更通知的数据结构
 */
@ApiModel(description = "IT设备链路变更通知的数据结构")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:41.151+08:00")
public class ItChangeMessage {
  @SerializedName("msgType")
  private Integer msgType = null;

  @SerializedName("resourceURI")
  private String resourceURI = "/rest/openapi/notification/it/link";

  @SerializedName("moduleID")
  private String moduleID = "com.huawei.it.link.notification";

  @SerializedName("dataObjectJson")
  private List<DataObjectJson> dataObjectJson = null;

  @SerializedName("utcTimestamp")
  private Integer utcTimestamp = null;

  public ItChangeMessage msgType(Integer msgType) {
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型： 1：创建 2：删除 
   * return msgType
  **/
  @ApiModelProperty(value = "消息类型： 1：创建 2：删除 ")
  public Integer getMsgType() {
    return msgType;
  }

   /**
   * 消息类型： 1：创建 2：删除 
   * Param msgType
  **/
  public void setMsgType(Integer msgType) {
    this.msgType = msgType;
  }

  public ItChangeMessage resourceURI(String resourceURI) {
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

  public ItChangeMessage moduleID(String moduleID) {
    this.moduleID = moduleID;
    return this;
  }

   /**
   * 模块ID
   * return moduleID
  **/
  @ApiModelProperty(value = "模块ID")
  public String getModuleID() {
    return moduleID;
  }

   /**
   * 模块ID
   * Param moduleID
  **/
  public void setModuleID(String moduleID) {
    this.moduleID = moduleID;
  }

  public ItChangeMessage dataObjectJson(List<DataObjectJson> dataObjectJson) {
    this.dataObjectJson = dataObjectJson;
    return this;
  }

  public ItChangeMessage addDataObjectJsonItem(DataObjectJson dataObjectJsonItem) {
    if (this.dataObjectJson == null) {
      this.dataObjectJson = new ArrayList<DataObjectJson>();
    }
    this.dataObjectJson.add(dataObjectJsonItem);
    return this;
  }

   /**
   * 数据内容，为一个JSON 化的对象，此处应当link信息。
   * return dataObjectJson
  **/
  @ApiModelProperty(value = "数据内容，为一个JSON 化的对象，此处应当link信息。")
  public List<DataObjectJson> getDataObjectJson() {
    return dataObjectJson;
  }

   /**
   * 数据内容，为一个JSON 化的对象，此处应当link信息。
   * Param dataObjectJson
  **/
  public void setDataObjectJson(List<DataObjectJson> dataObjectJson) {
    this.dataObjectJson = dataObjectJson;
  }

  public ItChangeMessage utcTimestamp(Integer utcTimestamp) {
    this.utcTimestamp = utcTimestamp;
    return this;
  }

   /**
   * 该事件对象产生的UTC时刻
   * return utcTimestamp
  **/
  @ApiModelProperty(value = "该事件对象产生的UTC时刻")
  public Integer getUtcTimestamp() {
    return utcTimestamp;
  }

   /**
   * 该事件对象产生的UTC时刻
   * Param utcTimestamp
  **/
  public void setUtcTimestamp(Integer utcTimestamp) {
    this.utcTimestamp = utcTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItChangeMessage itChangeMessage = (ItChangeMessage) o;
    return Objects.equals(this.msgType, itChangeMessage.msgType) &&
        Objects.equals(this.resourceURI, itChangeMessage.resourceURI) &&
        Objects.equals(this.moduleID, itChangeMessage.moduleID) &&
        Objects.equals(this.dataObjectJson, itChangeMessage.dataObjectJson) &&
        Objects.equals(this.utcTimestamp, itChangeMessage.utcTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgType, resourceURI, moduleID, dataObjectJson, utcTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItChangeMessage {\n");
    
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    moduleID: ").append(toIndentedString(moduleID)).append("\n");
    sb.append("    dataObjectJson: ").append(toIndentedString(dataObjectJson)).append("\n");
    sb.append("    utcTimestamp: ").append(toIndentedString(utcTimestamp)).append("\n");
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
