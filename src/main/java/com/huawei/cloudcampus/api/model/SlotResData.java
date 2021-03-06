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
 * 单板资源模型。
 */
@ApiModel(description = "单板资源模型。")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaSdnClientCodegen", date = "2019-12-17T15:19:39.630+08:00")
public class SlotResData {
  @SerializedName("nedn")
  private String nedn = null;

  @SerializedName("neName")
  private String neName = null;

  @SerializedName("framedn")
  private String framedn = null;

  @SerializedName("framename")
  private String framename = null;

  @SerializedName("frameno")
  private Integer frameno = null;

  @SerializedName("slotdn")
  private String slotdn = null;

  @SerializedName("slotindex")
  private Integer slotindex = null;

  @SerializedName("slotno")
  private Integer slotno = null;

  @SerializedName("vendortype")
  private String vendortype = null;

  @SerializedName("descr")
  private String descr = null;

  @SerializedName("slotname")
  private String slotname = null;

  @SerializedName("physicalclass")
  private Integer physicalclass = null;

  @SerializedName("adminstatus")
  private Integer adminstatus = null;

  @SerializedName("operstatus")
  private Integer operstatus = null;

  @SerializedName("standbystatus")
  private Integer standbystatus = null;

  @SerializedName("hardversion")
  private String hardversion = null;

  @SerializedName("firmversion")
  private String firmversion = null;

  @SerializedName("softversion")
  private String softversion = null;

  @SerializedName("serialnum")
  private String serialnum = null;

  @SerializedName("mfgname")
  private String mfgname = null;

  @SerializedName("modelname")
  private String modelname = null;

  @SerializedName("alarmlight")
  private String alarmlight = null;

  public SlotResData nedn(String nedn) {
    this.nedn = nedn;
    return this;
  }

   /**
   * 设备dn。
   * return nedn
  **/
  @ApiModelProperty(value = "设备dn。")
  public String getNedn() {
    return nedn;
  }

   /**
   * 设备dn。
   * Param nedn
  **/
  public void setNedn(String nedn) {
    this.nedn = nedn;
  }

  public SlotResData neName(String neName) {
    this.neName = neName;
    return this;
  }

   /**
   * 设备名称。
   * return neName
  **/
  @ApiModelProperty(value = "设备名称。")
  public String getNeName() {
    return neName;
  }

   /**
   * 设备名称。
   * Param neName
  **/
  public void setNeName(String neName) {
    this.neName = neName;
  }

  public SlotResData framedn(String framedn) {
    this.framedn = framedn;
    return this;
  }

   /**
   * 机框dn。
   * return framedn
  **/
  @ApiModelProperty(value = "机框dn。")
  public String getFramedn() {
    return framedn;
  }

   /**
   * 机框dn。
   * Param framedn
  **/
  public void setFramedn(String framedn) {
    this.framedn = framedn;
  }

  public SlotResData framename(String framename) {
    this.framename = framename;
    return this;
  }

   /**
   * 机框名称。
   * return framename
  **/
  @ApiModelProperty(value = "机框名称。")
  public String getFramename() {
    return framename;
  }

   /**
   * 机框名称。
   * Param framename
  **/
  public void setFramename(String framename) {
    this.framename = framename;
  }

  public SlotResData frameno(Integer frameno) {
    this.frameno = frameno;
    return this;
  }

   /**
   * 机框序号。
   * return frameno
  **/
  @ApiModelProperty(value = "机框序号。")
  public Integer getFrameno() {
    return frameno;
  }

   /**
   * 机框序号。
   * Param frameno
  **/
  public void setFrameno(Integer frameno) {
    this.frameno = frameno;
  }

  public SlotResData slotdn(String slotdn) {
    this.slotdn = slotdn;
    return this;
  }

   /**
   * 单板dn。
   * return slotdn
  **/
  @ApiModelProperty(value = "单板dn。")
  public String getSlotdn() {
    return slotdn;
  }

   /**
   * 单板dn。
   * Param slotdn
  **/
  public void setSlotdn(String slotdn) {
    this.slotdn = slotdn;
  }

  public SlotResData slotindex(Integer slotindex) {
    this.slotindex = slotindex;
    return this;
  }

   /**
   * 单板索引。
   * return slotindex
  **/
  @ApiModelProperty(value = "单板索引。")
  public Integer getSlotindex() {
    return slotindex;
  }

   /**
   * 单板索引。
   * Param slotindex
  **/
  public void setSlotindex(Integer slotindex) {
    this.slotindex = slotindex;
  }

  public SlotResData slotno(Integer slotno) {
    this.slotno = slotno;
    return this;
  }

   /**
   * 单板序号。
   * return slotno
  **/
  @ApiModelProperty(value = "单板序号。")
  public Integer getSlotno() {
    return slotno;
  }

   /**
   * 单板序号。
   * Param slotno
  **/
  public void setSlotno(Integer slotno) {
    this.slotno = slotno;
  }

  public SlotResData vendortype(String vendortype) {
    this.vendortype = vendortype;
    return this;
  }

   /**
   * 厂商类型。
   * return vendortype
  **/
  @ApiModelProperty(value = "厂商类型。")
  public String getVendortype() {
    return vendortype;
  }

   /**
   * 厂商类型。
   * Param vendortype
  **/
  public void setVendortype(String vendortype) {
    this.vendortype = vendortype;
  }

  public SlotResData descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * 单板描述。
   * return descr
  **/
  @ApiModelProperty(value = "单板描述。")
  public String getDescr() {
    return descr;
  }

   /**
   * 单板描述。
   * Param descr
  **/
  public void setDescr(String descr) {
    this.descr = descr;
  }

  public SlotResData slotname(String slotname) {
    this.slotname = slotname;
    return this;
  }

   /**
   * 单板名称。
   * return slotname
  **/
  @ApiModelProperty(value = "单板名称。")
  public String getSlotname() {
    return slotname;
  }

   /**
   * 单板名称。
   * Param slotname
  **/
  public void setSlotname(String slotname) {
    this.slotname = slotname;
  }

  public SlotResData physicalclass(Integer physicalclass) {
    this.physicalclass = physicalclass;
    return this;
  }

   /**
   * 设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 
   * return physicalclass
  **/
  @ApiModelProperty(value = "设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 ")
  public Integer getPhysicalclass() {
    return physicalclass;
  }

   /**
   * 设备上实体大类型： 3：框 4：背板 5：子槽 6：电源 7：风扇 9：板 10：端口 
   * Param physicalclass
  **/
  public void setPhysicalclass(Integer physicalclass) {
    this.physicalclass = physicalclass;
  }

  public SlotResData adminstatus(Integer adminstatus) {
    this.adminstatus = adminstatus;
    return this;
  }

   /**
   * 管理状态： 4、11：正常 2、3、12：错误 13：LoopBack 
   * return adminstatus
  **/
  @ApiModelProperty(value = "管理状态： 4、11：正常 2、3、12：错误 13：LoopBack ")
  public Integer getAdminstatus() {
    return adminstatus;
  }

   /**
   * 管理状态： 4、11：正常 2、3、12：错误 13：LoopBack 
   * Param adminstatus
  **/
  public void setAdminstatus(Integer adminstatus) {
    this.adminstatus = adminstatus;
  }

  public SlotResData operstatus(Integer operstatus) {
    this.operstatus = operstatus;
    return this;
  }

   /**
   * 操作状态： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 
   * return operstatus
  **/
  @ApiModelProperty(value = "操作状态： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 ")
  public Integer getOperstatus() {
    return operstatus;
  }

   /**
   * 操作状态： 3、11、13、15、16：正常 2、12、17：错误 4：离线 其他：未知 
   * Param operstatus
  **/
  public void setOperstatus(Integer operstatus) {
    this.operstatus = operstatus;
  }

  public SlotResData standbystatus(Integer standbystatus) {
    this.standbystatus = standbystatus;
    return this;
  }

   /**
   * 主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService 
   * return standbystatus
  **/
  @ApiModelProperty(value = "主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService ")
  public Integer getStandbystatus() {
    return standbystatus;
  }

   /**
   * 主备状态： 1：notSupported 2：hotStandby 3：coldStandby 4：providingService 
   * Param standbystatus
  **/
  public void setStandbystatus(Integer standbystatus) {
    this.standbystatus = standbystatus;
  }

  public SlotResData hardversion(String hardversion) {
    this.hardversion = hardversion;
    return this;
  }

   /**
   * 硬件版本。
   * return hardversion
  **/
  @ApiModelProperty(value = "硬件版本。")
  public String getHardversion() {
    return hardversion;
  }

   /**
   * 硬件版本。
   * Param hardversion
  **/
  public void setHardversion(String hardversion) {
    this.hardversion = hardversion;
  }

  public SlotResData firmversion(String firmversion) {
    this.firmversion = firmversion;
    return this;
  }

   /**
   * 固件版本。
   * return firmversion
  **/
  @ApiModelProperty(value = "固件版本。")
  public String getFirmversion() {
    return firmversion;
  }

   /**
   * 固件版本。
   * Param firmversion
  **/
  public void setFirmversion(String firmversion) {
    this.firmversion = firmversion;
  }

  public SlotResData softversion(String softversion) {
    this.softversion = softversion;
    return this;
  }

   /**
   * 软件版本。
   * return softversion
  **/
  @ApiModelProperty(value = "软件版本。")
  public String getSoftversion() {
    return softversion;
  }

   /**
   * 软件版本。
   * Param softversion
  **/
  public void setSoftversion(String softversion) {
    this.softversion = softversion;
  }

  public SlotResData serialnum(String serialnum) {
    this.serialnum = serialnum;
    return this;
  }

   /**
   * 序列号。
   * return serialnum
  **/
  @ApiModelProperty(value = "序列号。")
  public String getSerialnum() {
    return serialnum;
  }

   /**
   * 序列号。
   * Param serialnum
  **/
  public void setSerialnum(String serialnum) {
    this.serialnum = serialnum;
  }

  public SlotResData mfgname(String mfgname) {
    this.mfgname = mfgname;
    return this;
  }

   /**
   * 组件名称。
   * return mfgname
  **/
  @ApiModelProperty(value = "组件名称。")
  public String getMfgname() {
    return mfgname;
  }

   /**
   * 组件名称。
   * Param mfgname
  **/
  public void setMfgname(String mfgname) {
    this.mfgname = mfgname;
  }

  public SlotResData modelname(String modelname) {
    this.modelname = modelname;
    return this;
  }

   /**
   * 模块名称。
   * return modelname
  **/
  @ApiModelProperty(value = "模块名称。")
  public String getModelname() {
    return modelname;
  }

   /**
   * 模块名称。
   * Param modelname
  **/
  public void setModelname(String modelname) {
    this.modelname = modelname;
  }

  public SlotResData alarmlight(String alarmlight) {
    this.alarmlight = alarmlight;
    return this;
  }

   /**
   * 预留字段，当前无意义。
   * return alarmlight
  **/
  @ApiModelProperty(value = "预留字段，当前无意义。")
  public String getAlarmlight() {
    return alarmlight;
  }

   /**
   * 预留字段，当前无意义。
   * Param alarmlight
  **/
  public void setAlarmlight(String alarmlight) {
    this.alarmlight = alarmlight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotResData slotResData = (SlotResData) o;
    return Objects.equals(this.nedn, slotResData.nedn) &&
        Objects.equals(this.neName, slotResData.neName) &&
        Objects.equals(this.framedn, slotResData.framedn) &&
        Objects.equals(this.framename, slotResData.framename) &&
        Objects.equals(this.frameno, slotResData.frameno) &&
        Objects.equals(this.slotdn, slotResData.slotdn) &&
        Objects.equals(this.slotindex, slotResData.slotindex) &&
        Objects.equals(this.slotno, slotResData.slotno) &&
        Objects.equals(this.vendortype, slotResData.vendortype) &&
        Objects.equals(this.descr, slotResData.descr) &&
        Objects.equals(this.slotname, slotResData.slotname) &&
        Objects.equals(this.physicalclass, slotResData.physicalclass) &&
        Objects.equals(this.adminstatus, slotResData.adminstatus) &&
        Objects.equals(this.operstatus, slotResData.operstatus) &&
        Objects.equals(this.standbystatus, slotResData.standbystatus) &&
        Objects.equals(this.hardversion, slotResData.hardversion) &&
        Objects.equals(this.firmversion, slotResData.firmversion) &&
        Objects.equals(this.softversion, slotResData.softversion) &&
        Objects.equals(this.serialnum, slotResData.serialnum) &&
        Objects.equals(this.mfgname, slotResData.mfgname) &&
        Objects.equals(this.modelname, slotResData.modelname) &&
        Objects.equals(this.alarmlight, slotResData.alarmlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nedn, neName, framedn, framename, frameno, slotdn, slotindex, slotno, vendortype, descr, slotname, physicalclass, adminstatus, operstatus, standbystatus, hardversion, firmversion, softversion, serialnum, mfgname, modelname, alarmlight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotResData {\n");
    
    sb.append("    nedn: ").append(toIndentedString(nedn)).append("\n");
    sb.append("    neName: ").append(toIndentedString(neName)).append("\n");
    sb.append("    framedn: ").append(toIndentedString(framedn)).append("\n");
    sb.append("    framename: ").append(toIndentedString(framename)).append("\n");
    sb.append("    frameno: ").append(toIndentedString(frameno)).append("\n");
    sb.append("    slotdn: ").append(toIndentedString(slotdn)).append("\n");
    sb.append("    slotindex: ").append(toIndentedString(slotindex)).append("\n");
    sb.append("    slotno: ").append(toIndentedString(slotno)).append("\n");
    sb.append("    vendortype: ").append(toIndentedString(vendortype)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    slotname: ").append(toIndentedString(slotname)).append("\n");
    sb.append("    physicalclass: ").append(toIndentedString(physicalclass)).append("\n");
    sb.append("    adminstatus: ").append(toIndentedString(adminstatus)).append("\n");
    sb.append("    operstatus: ").append(toIndentedString(operstatus)).append("\n");
    sb.append("    standbystatus: ").append(toIndentedString(standbystatus)).append("\n");
    sb.append("    hardversion: ").append(toIndentedString(hardversion)).append("\n");
    sb.append("    firmversion: ").append(toIndentedString(firmversion)).append("\n");
    sb.append("    softversion: ").append(toIndentedString(softversion)).append("\n");
    sb.append("    serialnum: ").append(toIndentedString(serialnum)).append("\n");
    sb.append("    mfgname: ").append(toIndentedString(mfgname)).append("\n");
    sb.append("    modelname: ").append(toIndentedString(modelname)).append("\n");
    sb.append("    alarmlight: ").append(toIndentedString(alarmlight)).append("\n");
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

