/*
 * 框式交换机板卡信息操作
 * 框式上云相关操作接口： 场景：对框式交换机信息查询操作的第三方接口。
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 单板上下电输入模型。
 */
@ApiModel(description = "单板上下电输入模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:14.794+08:00")
public class PowerSupplyDto {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("frameNo")
  private Integer frameNo = null;

  @SerializedName("boardName")
  private String boardName = null;

  @SerializedName("operation")
  private String operation = null;

  public PowerSupplyDto deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID，UUID格式。
   * return deviceId
  **/
  @ApiModelProperty(required = true, value = "设备ID，UUID格式。")
  public String getDeviceId() {
    return deviceId;
  }

   /**
   * 设备ID，UUID格式。
   * Param deviceId
  **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public PowerSupplyDto frameNo(Integer frameNo) {
    this.frameNo = frameNo;
    return this;
  }

   /**
   * 机框号。
   * return frameNo
  **/
  @ApiModelProperty(required = true, value = "机框号。")
  public Integer getFrameNo() {
    return frameNo;
  }

   /**
   * 机框号。
   * Param frameNo
  **/
  public void setFrameNo(Integer frameNo) {
    this.frameNo = frameNo;
  }

  public PowerSupplyDto boardName(String boardName) {
    this.boardName = boardName;
    return this;
  }

   /**
   * 单板名称。
   * return boardName
  **/
  @ApiModelProperty(required = true, value = "单板名称。")
  public String getBoardName() {
    return boardName;
  }

   /**
   * 单板名称。
   * Param boardName
  **/
  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public PowerSupplyDto operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * 上下电操作。取值范围：on---代表上电，off---代表下电。
   * return operation
  **/
  @ApiModelProperty(required = true, value = "上下电操作。取值范围：on---代表上电，off---代表下电。")
  public String getOperation() {
    return operation;
  }

   /**
   * 上下电操作。取值范围：on---代表上电，off---代表下电。
   * Param operation
  **/
  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerSupplyDto powerSupplyDto = (PowerSupplyDto) o;
    return Objects.equals(this.deviceId, powerSupplyDto.deviceId) &&
        Objects.equals(this.frameNo, powerSupplyDto.frameNo) &&
        Objects.equals(this.boardName, powerSupplyDto.boardName) &&
        Objects.equals(this.operation, powerSupplyDto.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, frameNo, boardName, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerSupplyDto {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    frameNo: ").append(toIndentedString(frameNo)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

