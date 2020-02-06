/*
 * 室内地图信息查询
 * 室内地图第三方北向接口。 · 查询站点中所有楼栋基本信息 · 查询楼栋中所有楼层基本信息 · 查询楼栋中所有楼层详细信息 · 查询楼栋中楼层和设备布放信息 · 查询楼栋中楼层已布放设备详细信息 · 查询楼层已布放设备位置信息 
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
 * 设备基本信息。
 */
@ApiModel(description = "设备基本信息。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:40.522+08:00")
public class DeviceBaseInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    _0("0"),
    
    _1("1"),
    
    _3("3"),
    
    _4("4");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public DeviceBaseInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 设备ID，格式UUID。
   * return id
  **/
  @ApiModelProperty(required = true, value = "设备ID，格式UUID。")
  public String getId() {
    return id;
  }

   /**
   * 设备ID，格式UUID。
   * Param id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public DeviceBaseInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 设备名称。
   * return name
  **/
  @ApiModelProperty(required = true, value = "设备名称。")
  public String getName() {
    return name;
  }

   /**
   * 设备名称。
   * Param name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public DeviceBaseInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   * return status
  **/
  @ApiModelProperty(required = true, value = "设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 ")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * 设备状态 0: 正常 1: 告警  3: 离线 4: 未注册 
   * Param status
  **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceBaseInfo deviceBaseInfo = (DeviceBaseInfo) o;
    return Objects.equals(this.id, deviceBaseInfo.id) &&
        Objects.equals(this.name, deviceBaseInfo.name) &&
        Objects.equals(this.status, deviceBaseInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceBaseInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

