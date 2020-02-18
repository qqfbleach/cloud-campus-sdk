/*
 * AP IOT配置
 * AP IOT配置北向接口，主要特性： · 查询AP IOT配置信息 · 配置AP IOT信息 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoT配置结构体。
 */
@ApiModel(description = "IoT配置结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:01.159+08:00")
public class IotServer1Dto {
  @SerializedName("serverNum")
  private Integer serverNum = null;

  @SerializedName("iotServer")
  private String iotServer = null;

  @SerializedName("port")
  private Integer port = null;

  public IotServer1Dto serverNum(Integer serverNum) {
    this.serverNum = serverNum;
    return this;
  }

   /**
   * IoT服务器编号。
   * minimum: 1
   * maximum: 4
   * return serverNum
  **/
  @ApiModelProperty(value = "IoT服务器编号。")
  public Integer getServerNum() {
    return serverNum;
  }

   /**
   * IoT服务器编号。
   * minimum: 1
   * maximum: 4
   * Param serverNum
  **/
  public void setServerNum(Integer serverNum) {
    this.serverNum = serverNum;
  }

  public IotServer1Dto iotServer(String iotServer) {
    this.iotServer = iotServer;
    return this;
  }

   /**
   * 第一通道IoT服务器，支持域名和IP地址。
   * return iotServer
  **/
  @ApiModelProperty(value = "第一通道IoT服务器，支持域名和IP地址。")
  public String getIotServer() {
    return iotServer;
  }

   /**
   * 第一通道IoT服务器，支持域名和IP地址。
   * Param iotServer
  **/
  public void setIotServer(String iotServer) {
    this.iotServer = iotServer;
  }

  public IotServer1Dto port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * 第一通道IoT端口。
   * minimum: 1
   * maximum: 65535
   * return port
  **/
  @ApiModelProperty(value = "第一通道IoT端口。")
  public Integer getPort() {
    return port;
  }

   /**
   * 第一通道IoT端口。
   * minimum: 1
   * maximum: 65535
   * Param port
  **/
  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IotServer1Dto iotServer1Dto = (IotServer1Dto) o;
    return Objects.equals(this.serverNum, iotServer1Dto.serverNum) &&
        Objects.equals(this.iotServer, iotServer1Dto.iotServer) &&
        Objects.equals(this.port, iotServer1Dto.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverNum, iotServer, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IotServer1Dto {\n");
    
    sb.append("    serverNum: ").append(toIndentedString(serverNum)).append("\n");
    sb.append("    iotServer: ").append(toIndentedString(iotServer)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
