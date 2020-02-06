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
import com.huawei.cloudcampus.api.model.IotServer1Dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoT配置结构体。
 */
@ApiModel(description = "IoT配置结构体。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:18:01.159+08:00")
public class IotCardConfigDto {
  @SerializedName("cardName")
  private String cardName = null;

  @SerializedName("cardConfigured")
  private Boolean cardConfigured = null;

  /**
   * 端口类型。ethernet---以太网口，serial---串口。
   */
  @JsonAdapter(PortTypeEnum.Adapter.class)
  public enum PortTypeEnum {
    ETHERNET("ethernet"),
    
    SERIAL("serial");

    private String value;

    PortTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PortTypeEnum fromValue(String text) {
      for (PortTypeEnum b : PortTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PortTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PortTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PortTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PortTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("portType")
  private PortTypeEnum portType = null;

  @SerializedName("communicationPort")
  private Integer communicationPort = null;

  /**
   * 通信协议。
   */
  @JsonAdapter(CommunicationProtocolEnum.Adapter.class)
  public enum CommunicationProtocolEnum {
    TCP("tcp"),
    
    UDP("udp");

    private String value;

    CommunicationProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommunicationProtocolEnum fromValue(String text) {
      for (CommunicationProtocolEnum b : CommunicationProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommunicationProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommunicationProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommunicationProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommunicationProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("communicationProtocol")
  private CommunicationProtocolEnum communicationProtocol = null;

  @SerializedName("shareKey")
  private String shareKey = null;

  @SerializedName("trustedHostAddress")
  private String trustedHostAddress = null;

  @SerializedName("iotServer2")
  private String iotServer2 = null;

  @SerializedName("port2")
  private Integer port2 = null;

  @SerializedName("administrativeStatus")
  private Boolean administrativeStatus = null;

  @SerializedName("defaultVlan")
  private Integer defaultVlan = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("iotServer1Config")
  private List<IotServer1Dto> iotServer1Config = null;

  public IotCardConfigDto cardName(String cardName) {
    this.cardName = cardName;
    return this;
  }

   /**
   * 插卡名称
   * return cardName
  **/
  @ApiModelProperty(value = "插卡名称")
  public String getCardName() {
    return cardName;
  }

   /**
   * 插卡名称
   * Param cardName
  **/
  public void setCardName(String cardName) {
    this.cardName = cardName;
  }

  public IotCardConfigDto cardConfigured(Boolean cardConfigured) {
    this.cardConfigured = cardConfigured;
    return this;
  }

   /**
   * 该卡槽是否配置，true代表已经配置，false代表没配置。
   * return cardConfigured
  **/
  @ApiModelProperty(value = "该卡槽是否配置，true代表已经配置，false代表没配置。")
  public Boolean getCardConfigured() {
    return cardConfigured;
  }

   /**
   * 该卡槽是否配置，true代表已经配置，false代表没配置。
   * Param cardConfigured
  **/
  public void setCardConfigured(Boolean cardConfigured) {
    this.cardConfigured = cardConfigured;
  }

  public IotCardConfigDto portType(PortTypeEnum portType) {
    this.portType = portType;
    return this;
  }

   /**
   * 端口类型。ethernet---以太网口，serial---串口。
   * return portType
  **/
  @ApiModelProperty(required = true, value = "端口类型。ethernet---以太网口，serial---串口。")
  public PortTypeEnum getPortType() {
    return portType;
  }

   /**
   * 端口类型。ethernet---以太网口，serial---串口。
   * Param portType
  **/
  public void setPortType(PortTypeEnum portType) {
    this.portType = portType;
  }

  public IotCardConfigDto communicationPort(Integer communicationPort) {
    this.communicationPort = communicationPort;
    return this;
  }

   /**
   * 通信端口。
   * minimum: 1025
   * maximum: 55535
   * return communicationPort
  **/
  @ApiModelProperty(value = "通信端口。")
  public Integer getCommunicationPort() {
    return communicationPort;
  }

   /**
   * 通信端口。
   * minimum: 1025
   * maximum: 55535
   * Param communicationPort
  **/
  public void setCommunicationPort(Integer communicationPort) {
    this.communicationPort = communicationPort;
  }

  public IotCardConfigDto communicationProtocol(CommunicationProtocolEnum communicationProtocol) {
    this.communicationProtocol = communicationProtocol;
    return this;
  }

   /**
   * 通信协议。
   * return communicationProtocol
  **/
  @ApiModelProperty(value = "通信协议。")
  public CommunicationProtocolEnum getCommunicationProtocol() {
    return communicationProtocol;
  }

   /**
   * 通信协议。
   * Param communicationProtocol
  **/
  public void setCommunicationProtocol(CommunicationProtocolEnum communicationProtocol) {
    this.communicationProtocol = communicationProtocol;
  }

  public IotCardConfigDto shareKey(String shareKey) {
    this.shareKey = shareKey;
    return this;
  }

   /**
   * 共享秘钥，至少包含小写字母、大写字母、数字、特殊符号（除问号和空格）中的两种，不能包含全角字符。
   * return shareKey
  **/
  @ApiModelProperty(value = "共享秘钥，至少包含小写字母、大写字母、数字、特殊符号（除问号和空格）中的两种，不能包含全角字符。")
  public String getShareKey() {
    return shareKey;
  }

   /**
   * 共享秘钥，至少包含小写字母、大写字母、数字、特殊符号（除问号和空格）中的两种，不能包含全角字符。
   * Param shareKey
  **/
  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }

  public IotCardConfigDto trustedHostAddress(String trustedHostAddress) {
    this.trustedHostAddress = trustedHostAddress;
    return this;
  }

   /**
   * 信任主机地址，格式为IP/掩码。
   * return trustedHostAddress
  **/
  @ApiModelProperty(value = "信任主机地址，格式为IP/掩码。")
  public String getTrustedHostAddress() {
    return trustedHostAddress;
  }

   /**
   * 信任主机地址，格式为IP/掩码。
   * Param trustedHostAddress
  **/
  public void setTrustedHostAddress(String trustedHostAddress) {
    this.trustedHostAddress = trustedHostAddress;
  }

  public IotCardConfigDto iotServer2(String iotServer2) {
    this.iotServer2 = iotServer2;
    return this;
  }

   /**
   * 第二通道IoT服务器，支持域名和IP地址。
   * return iotServer2
  **/
  @ApiModelProperty(value = "第二通道IoT服务器，支持域名和IP地址。")
  public String getIotServer2() {
    return iotServer2;
  }

   /**
   * 第二通道IoT服务器，支持域名和IP地址。
   * Param iotServer2
  **/
  public void setIotServer2(String iotServer2) {
    this.iotServer2 = iotServer2;
  }

  public IotCardConfigDto port2(Integer port2) {
    this.port2 = port2;
    return this;
  }

   /**
   * 第二通道IoT端口。
   * minimum: 1
   * maximum: 65535
   * return port2
  **/
  @ApiModelProperty(value = "第二通道IoT端口。")
  public Integer getPort2() {
    return port2;
  }

   /**
   * 第二通道IoT端口。
   * minimum: 1
   * maximum: 65535
   * Param port2
  **/
  public void setPort2(Integer port2) {
    this.port2 = port2;
  }

  public IotCardConfigDto administrativeStatus(Boolean administrativeStatus) {
    this.administrativeStatus = administrativeStatus;
    return this;
  }

   /**
   * 使能管理状态。
   * return administrativeStatus
  **/
  @ApiModelProperty(value = "使能管理状态。")
  public Boolean getAdministrativeStatus() {
    return administrativeStatus;
  }

   /**
   * 使能管理状态。
   * Param administrativeStatus
  **/
  public void setAdministrativeStatus(Boolean administrativeStatus) {
    this.administrativeStatus = administrativeStatus;
  }

  public IotCardConfigDto defaultVlan(Integer defaultVlan) {
    this.defaultVlan = defaultVlan;
    return this;
  }

   /**
   * 默认放通VLAN。
   * minimum: 1
   * maximum: 4094
   * return defaultVlan
  **/
  @ApiModelProperty(value = "默认放通VLAN。")
  public Integer getDefaultVlan() {
    return defaultVlan;
  }

   /**
   * 默认放通VLAN。
   * minimum: 1
   * maximum: 4094
   * Param defaultVlan
  **/
  public void setDefaultVlan(Integer defaultVlan) {
    this.defaultVlan = defaultVlan;
  }

  public IotCardConfigDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 描述，不能输入中文和特殊字符。
   * return description
  **/
  @ApiModelProperty(value = "描述，不能输入中文和特殊字符。")
  public String getDescription() {
    return description;
  }

   /**
   * 描述，不能输入中文和特殊字符。
   * Param description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public IotCardConfigDto iotServer1Config(List<IotServer1Dto> iotServer1Config) {
    this.iotServer1Config = iotServer1Config;
    return this;
  }

  public IotCardConfigDto addIotServer1ConfigItem(IotServer1Dto iotServer1ConfigItem) {
    if (this.iotServer1Config == null) {
      this.iotServer1Config = new ArrayList<IotServer1Dto>();
    }
    this.iotServer1Config.add(iotServer1ConfigItem);
    return this;
  }

   /**
   * Get iotServer1Config
   * return iotServer1Config
  **/
  @ApiModelProperty(value = "")
  public List<IotServer1Dto> getIotServer1Config() {
    return iotServer1Config;
  }

   /**
   * Set iotServer1Config
   * Param iotServer1Config
  **/
  public void setIotServer1Config(List<IotServer1Dto> iotServer1Config) {
    this.iotServer1Config = iotServer1Config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IotCardConfigDto iotCardConfigDto = (IotCardConfigDto) o;
    return Objects.equals(this.cardName, iotCardConfigDto.cardName) &&
        Objects.equals(this.cardConfigured, iotCardConfigDto.cardConfigured) &&
        Objects.equals(this.portType, iotCardConfigDto.portType) &&
        Objects.equals(this.communicationPort, iotCardConfigDto.communicationPort) &&
        Objects.equals(this.communicationProtocol, iotCardConfigDto.communicationProtocol) &&
        Objects.equals(this.shareKey, iotCardConfigDto.shareKey) &&
        Objects.equals(this.trustedHostAddress, iotCardConfigDto.trustedHostAddress) &&
        Objects.equals(this.iotServer2, iotCardConfigDto.iotServer2) &&
        Objects.equals(this.port2, iotCardConfigDto.port2) &&
        Objects.equals(this.administrativeStatus, iotCardConfigDto.administrativeStatus) &&
        Objects.equals(this.defaultVlan, iotCardConfigDto.defaultVlan) &&
        Objects.equals(this.description, iotCardConfigDto.description) &&
        Objects.equals(this.iotServer1Config, iotCardConfigDto.iotServer1Config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardName, cardConfigured, portType, communicationPort, communicationProtocol, shareKey, trustedHostAddress, iotServer2, port2, administrativeStatus, defaultVlan, description, iotServer1Config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IotCardConfigDto {\n");
    
    sb.append("    cardName: ").append(toIndentedString(cardName)).append("\n");
    sb.append("    cardConfigured: ").append(toIndentedString(cardConfigured)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    communicationPort: ").append(toIndentedString(communicationPort)).append("\n");
    sb.append("    communicationProtocol: ").append(toIndentedString(communicationProtocol)).append("\n");
    sb.append("    shareKey: ").append(toIndentedString(shareKey)).append("\n");
    sb.append("    trustedHostAddress: ").append(toIndentedString(trustedHostAddress)).append("\n");
    sb.append("    iotServer2: ").append(toIndentedString(iotServer2)).append("\n");
    sb.append("    port2: ").append(toIndentedString(port2)).append("\n");
    sb.append("    administrativeStatus: ").append(toIndentedString(administrativeStatus)).append("\n");
    sb.append("    defaultVlan: ").append(toIndentedString(defaultVlan)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iotServer1Config: ").append(toIndentedString(iotServer1Config)).append("\n");
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

