/*
 * 实体资源北向接口
 * 实体资源条件查询。 
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
 * 机框资源模型。
 */
@ApiModel(description = "机框资源模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:39.630+08:00")
public class FrameResData {
  @SerializedName("neDN")
  private String neDN = null;

  @SerializedName("neName")
  private String neName = null;

  @SerializedName("frameDN")
  private String frameDN = null;

  @SerializedName("shelfIndex")
  private Integer shelfIndex = null;

  @SerializedName("frameIndex")
  private Integer frameIndex = null;

  @SerializedName("frameNo")
  private Integer frameNo = null;

  @SerializedName("vendorType")
  private String vendorType = null;

  @SerializedName("mfgName")
  private String mfgName = null;

  @SerializedName("serialNum")
  private String serialNum = null;

  @SerializedName("physicalClass")
  private Integer physicalClass = null;

  @SerializedName("descr")
  private String descr = null;

  @SerializedName("frameName")
  private String frameName = null;

  @SerializedName("adminStatus")
  private Integer adminStatus = null;

  @SerializedName("operStatus")
  private Integer operStatus = null;

  @SerializedName("standBystatus")
  private Integer standBystatus = null;

  @SerializedName("softVersion")
  private String softVersion = null;

  public FrameResData neDN(String neDN) {
    this.neDN = neDN;
    return this;
  }

   /**
   * 设备dn。
   * return neDN
  **/
  @ApiModelProperty(value = "设备dn。")
  public String getNeDN() {
    return neDN;
  }

   /**
   * 设备dn。
   * Param neDN
  **/
  public void setNeDN(String neDN) {
    this.neDN = neDN;
  }

  public FrameResData neName(String neName) {
    this.neName = neName;
    return this;
  }

   /**
   * 网元名称。
   * return neName
  **/
  @ApiModelProperty(value = "网元名称。")
  public String getNeName() {
    return neName;
  }

   /**
   * 网元名称。
   * Param neName
  **/
  public void setNeName(String neName) {
    this.neName = neName;
  }

  public FrameResData frameDN(String frameDN) {
    this.frameDN = frameDN;
    return this;
  }

   /**
   * 机框dn。
   * return frameDN
  **/
  @ApiModelProperty(value = "机框dn。")
  public String getFrameDN() {
    return frameDN;
  }

   /**
   * 机框dn。
   * Param frameDN
  **/
  public void setFrameDN(String frameDN) {
    this.frameDN = frameDN;
  }

  public FrameResData shelfIndex(Integer shelfIndex) {
    this.shelfIndex = shelfIndex;
    return this;
  }

   /**
   * 机架索引设备上有的，所有资源的根索引。
   * return shelfIndex
  **/
  @ApiModelProperty(value = "机架索引设备上有的，所有资源的根索引。")
  public Integer getShelfIndex() {
    return shelfIndex;
  }

   /**
   * 机架索引设备上有的，所有资源的根索引。
   * Param shelfIndex
  **/
  public void setShelfIndex(Integer shelfIndex) {
    this.shelfIndex = shelfIndex;
  }

  public FrameResData frameIndex(Integer frameIndex) {
    this.frameIndex = frameIndex;
    return this;
  }

   /**
   * 机框索引。
   * return frameIndex
  **/
  @ApiModelProperty(value = "机框索引。")
  public Integer getFrameIndex() {
    return frameIndex;
  }

   /**
   * 机框索引。
   * Param frameIndex
  **/
  public void setFrameIndex(Integer frameIndex) {
    this.frameIndex = frameIndex;
  }

  public FrameResData frameNo(Integer frameNo) {
    this.frameNo = frameNo;
    return this;
  }

   /**
   * 机框序号。
   * return frameNo
  **/
  @ApiModelProperty(value = "机框序号。")
  public Integer getFrameNo() {
    return frameNo;
  }

   /**
   * 机框序号。
   * Param frameNo
  **/
  public void setFrameNo(Integer frameNo) {
    this.frameNo = frameNo;
  }

  public FrameResData vendorType(String vendorType) {
    this.vendorType = vendorType;
    return this;
  }

   /**
   * 厂商类型。
   * return vendorType
  **/
  @ApiModelProperty(value = "厂商类型。")
  public String getVendorType() {
    return vendorType;
  }

   /**
   * 厂商类型。
   * Param vendorType
  **/
  public void setVendorType(String vendorType) {
    this.vendorType = vendorType;
  }

  public FrameResData mfgName(String mfgName) {
    this.mfgName = mfgName;
    return this;
  }

   /**
   * 物理固件的制造厂商。
   * return mfgName
  **/
  @ApiModelProperty(value = "物理固件的制造厂商。")
  public String getMfgName() {
    return mfgName;
  }

   /**
   * 物理固件的制造厂商。
   * Param mfgName
  **/
  public void setMfgName(String mfgName) {
    this.mfgName = mfgName;
  }

  public FrameResData serialNum(String serialNum) {
    this.serialNum = serialNum;
    return this;
  }

   /**
   * 序列号。
   * return serialNum
  **/
  @ApiModelProperty(value = "序列号。")
  public String getSerialNum() {
    return serialNum;
  }

   /**
   * 序列号。
   * Param serialNum
  **/
  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }

  public FrameResData physicalClass(Integer physicalClass) {
    this.physicalClass = physicalClass;
    return this;
  }

   /**
   * 设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 
   * return physicalClass
  **/
  @ApiModelProperty(value = "设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 ")
  public Integer getPhysicalClass() {
    return physicalClass;
  }

   /**
   * 设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 
   * Param physicalClass
  **/
  public void setPhysicalClass(Integer physicalClass) {
    this.physicalClass = physicalClass;
  }

  public FrameResData descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * 机框描述。
   * return descr
  **/
  @ApiModelProperty(value = "机框描述。")
  public String getDescr() {
    return descr;
  }

   /**
   * 机框描述。
   * Param descr
  **/
  public void setDescr(String descr) {
    this.descr = descr;
  }

  public FrameResData frameName(String frameName) {
    this.frameName = frameName;
    return this;
  }

   /**
   * 机框名称。
   * return frameName
  **/
  @ApiModelProperty(value = "机框名称。")
  public String getFrameName() {
    return frameName;
  }

   /**
   * 机框名称。
   * Param frameName
  **/
  public void setFrameName(String frameName) {
    this.frameName = frameName;
  }

  public FrameResData adminStatus(Integer adminStatus) {
    this.adminStatus = adminStatus;
    return this;
  }

   /**
   * 管理状态，可以是如下值之一： 4、11：正常 2、3、12：错误 13：LoopBack 其他：未知 
   * return adminStatus
  **/
  @ApiModelProperty(value = "管理状态，可以是如下值之一： 4、11：正常 2、3、12：错误 13：LoopBack 其他：未知 ")
  public Integer getAdminStatus() {
    return adminStatus;
  }

   /**
   * 管理状态，可以是如下值之一： 4、11：正常 2、3、12：错误 13：LoopBack 其他：未知 
   * Param adminStatus
  **/
  public void setAdminStatus(Integer adminStatus) {
    this.adminStatus = adminStatus;
  }

  public FrameResData operStatus(Integer operStatus) {
    this.operStatus = operStatus;
    return this;
  }

   /**
   * 操作状态，可以是如下值之一： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 
   * return operStatus
  **/
  @ApiModelProperty(value = "操作状态，可以是如下值之一： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 ")
  public Integer getOperStatus() {
    return operStatus;
  }

   /**
   * 操作状态，可以是如下值之一： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 
   * Param operStatus
  **/
  public void setOperStatus(Integer operStatus) {
    this.operStatus = operStatus;
  }

  public FrameResData standBystatus(Integer standBystatus) {
    this.standBystatus = standBystatus;
    return this;
  }

   /**
   * 主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService 
   * return standBystatus
  **/
  @ApiModelProperty(value = "主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService ")
  public Integer getStandBystatus() {
    return standBystatus;
  }

   /**
   * 主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService 
   * Param standBystatus
  **/
  public void setStandBystatus(Integer standBystatus) {
    this.standBystatus = standBystatus;
  }

  public FrameResData softVersion(String softVersion) {
    this.softVersion = softVersion;
    return this;
  }

   /**
   * 软件版本。
   * return softVersion
  **/
  @ApiModelProperty(value = "软件版本。")
  public String getSoftVersion() {
    return softVersion;
  }

   /**
   * 软件版本。
   * Param softVersion
  **/
  public void setSoftVersion(String softVersion) {
    this.softVersion = softVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameResData frameResData = (FrameResData) o;
    return Objects.equals(this.neDN, frameResData.neDN) &&
        Objects.equals(this.neName, frameResData.neName) &&
        Objects.equals(this.frameDN, frameResData.frameDN) &&
        Objects.equals(this.shelfIndex, frameResData.shelfIndex) &&
        Objects.equals(this.frameIndex, frameResData.frameIndex) &&
        Objects.equals(this.frameNo, frameResData.frameNo) &&
        Objects.equals(this.vendorType, frameResData.vendorType) &&
        Objects.equals(this.mfgName, frameResData.mfgName) &&
        Objects.equals(this.serialNum, frameResData.serialNum) &&
        Objects.equals(this.physicalClass, frameResData.physicalClass) &&
        Objects.equals(this.descr, frameResData.descr) &&
        Objects.equals(this.frameName, frameResData.frameName) &&
        Objects.equals(this.adminStatus, frameResData.adminStatus) &&
        Objects.equals(this.operStatus, frameResData.operStatus) &&
        Objects.equals(this.standBystatus, frameResData.standBystatus) &&
        Objects.equals(this.softVersion, frameResData.softVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neDN, neName, frameDN, shelfIndex, frameIndex, frameNo, vendorType, mfgName, serialNum, physicalClass, descr, frameName, adminStatus, operStatus, standBystatus, softVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameResData {\n");
    
    sb.append("    neDN: ").append(toIndentedString(neDN)).append("\n");
    sb.append("    neName: ").append(toIndentedString(neName)).append("\n");
    sb.append("    frameDN: ").append(toIndentedString(frameDN)).append("\n");
    sb.append("    shelfIndex: ").append(toIndentedString(shelfIndex)).append("\n");
    sb.append("    frameIndex: ").append(toIndentedString(frameIndex)).append("\n");
    sb.append("    frameNo: ").append(toIndentedString(frameNo)).append("\n");
    sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
    sb.append("    mfgName: ").append(toIndentedString(mfgName)).append("\n");
    sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
    sb.append("    physicalClass: ").append(toIndentedString(physicalClass)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    frameName: ").append(toIndentedString(frameName)).append("\n");
    sb.append("    adminStatus: ").append(toIndentedString(adminStatus)).append("\n");
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    standBystatus: ").append(toIndentedString(standBystatus)).append("\n");
    sb.append("    softVersion: ").append(toIndentedString(softVersion)).append("\n");
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

