package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnyIDList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class AnyIDList   {
  @JsonProperty("bblRegistrationID")
  private String bblRegistrationID = null;

  @JsonProperty("anyIDNo")
  private String anyIDNo = null;

  @JsonProperty("itmxRegistrationID")
  private String itmxRegistrationID = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("registrationStatus")
  private String registrationStatus = null;

  @JsonProperty("addFromChannel")
  private String addFromChannel = null;

  @JsonProperty("addDate")
  private String addDate = null;

  @JsonProperty("addTime")
  private String addTime = null;

  @JsonProperty("addTerminal")
  private String addTerminal = null;

  @JsonProperty("addTeller")
  private String addTeller = null;

  @JsonProperty("addBranch")
  private String addBranch = null;

  @JsonProperty("updateFromChannel")
  private String updateFromChannel = null;

  @JsonProperty("updateDate")
  private String updateDate = null;

  @JsonProperty("updateTime")
  private String updateTime = null;

  @JsonProperty("updateTerminal")
  private String updateTerminal = null;

  @JsonProperty("updateTeller")
  private String updateTeller = null;

  @JsonProperty("updateBranch")
  private String updateBranch = null;

  @JsonProperty("rtpFlag")
  private String rtpFlag = null;

  @JsonProperty("rtpNotiLang")
  private String rtpNotiLang = null;

  @JsonProperty("rtpNotiBan")
  private String rtpNotiBan = null;

  @JsonProperty("rtpNotiPhoneNo")
  private String rtpNotiPhoneNo = null;

  @JsonProperty("rtpNotiEmail")
  private String rtpNotiEmail = null;

  @JsonProperty("interFlag")
  private String interFlag = null;

  public AnyIDList bblRegistrationID(String bblRegistrationID) {
    this.bblRegistrationID = bblRegistrationID;
    return this;
  }

  /**
   * Get bblRegistrationID
   * @return bblRegistrationID
   **/
  @Schema(example = "11111111245", description = "")
      @NotNull

    public String getBblRegistrationID() {
    return bblRegistrationID;
  }

  public void setBblRegistrationID(String bblRegistrationID) {
    this.bblRegistrationID = bblRegistrationID;
  }

  public AnyIDList anyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
    return this;
  }

  /**
   * Get anyIDNo
   * @return anyIDNo
   **/
  @Schema(example = "341556758678", description = "")
      @NotNull

    public String getAnyIDNo() {
    return anyIDNo;
  }

  public void setAnyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
  }

  public AnyIDList itmxRegistrationID(String itmxRegistrationID) {
    this.itmxRegistrationID = itmxRegistrationID;
    return this;
  }

  /**
   * Get itmxRegistrationID
   * @return itmxRegistrationID
   **/
  @Schema(example = "34535346546576", description = "")
      @NotNull

    public String getItmxRegistrationID() {
    return itmxRegistrationID;
  }

  public void setItmxRegistrationID(String itmxRegistrationID) {
    this.itmxRegistrationID = itmxRegistrationID;
  }

  public AnyIDList proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @Schema(example = "MSISDN", description = "")
      @NotNull

    public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public AnyIDList proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "5131453523565689", description = "")
      @NotNull

    public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public AnyIDList accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(example = "SA", description = "")
      @NotNull

    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AnyIDList accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(example = "1180000018", description = "")
      @NotNull

    public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public AnyIDList registrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
    return this;
  }

  /**
   * Get registrationStatus
   * @return registrationStatus
   **/
  @Schema(description = "")
      @NotNull

    public String getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  public AnyIDList addFromChannel(String addFromChannel) {
    this.addFromChannel = addFromChannel;
    return this;
  }

  /**
   * Get addFromChannel
   * @return addFromChannel
   **/
  @Schema(example = "B", description = "")
      @NotNull

    public String getAddFromChannel() {
    return addFromChannel;
  }

  public void setAddFromChannel(String addFromChannel) {
    this.addFromChannel = addFromChannel;
  }

  public AnyIDList addDate(String addDate) {
    this.addDate = addDate;
    return this;
  }

  /**
   * Get addDate
   * @return addDate
   **/
  @Schema(example = "20230524", description = "")
      @NotNull

    public String getAddDate() {
    return addDate;
  }

  public void setAddDate(String addDate) {
    this.addDate = addDate;
  }

  public AnyIDList addTime(String addTime) {
    this.addTime = addTime;
    return this;
  }

  /**
   * Get addTime
   * @return addTime
   **/
  @Schema(example = "153047", description = "")
      @NotNull

    public String getAddTime() {
    return addTime;
  }

  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }

  public AnyIDList addTerminal(String addTerminal) {
    this.addTerminal = addTerminal;
    return this;
  }

  /**
   * Get addTerminal
   * @return addTerminal
   **/
  @Schema(description = "")
      @NotNull

    public String getAddTerminal() {
    return addTerminal;
  }

  public void setAddTerminal(String addTerminal) {
    this.addTerminal = addTerminal;
  }

  public AnyIDList addTeller(String addTeller) {
    this.addTeller = addTeller;
    return this;
  }

  /**
   * Get addTeller
   * @return addTeller
   **/
  @Schema(description = "")
      @NotNull

    public String getAddTeller() {
    return addTeller;
  }

  public void setAddTeller(String addTeller) {
    this.addTeller = addTeller;
  }

  public AnyIDList addBranch(String addBranch) {
    this.addBranch = addBranch;
    return this;
  }

  /**
   * Get addBranch
   * @return addBranch
   **/
  @Schema(example = "000098", description = "")
      @NotNull

    public String getAddBranch() {
    return addBranch;
  }

  public void setAddBranch(String addBranch) {
    this.addBranch = addBranch;
  }

  public AnyIDList updateFromChannel(String updateFromChannel) {
    this.updateFromChannel = updateFromChannel;
    return this;
  }

  /**
   * Get updateFromChannel
   * @return updateFromChannel
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateFromChannel() {
    return updateFromChannel;
  }

  public void setUpdateFromChannel(String updateFromChannel) {
    this.updateFromChannel = updateFromChannel;
  }

  public AnyIDList updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public AnyIDList updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public AnyIDList updateTerminal(String updateTerminal) {
    this.updateTerminal = updateTerminal;
    return this;
  }

  /**
   * Get updateTerminal
   * @return updateTerminal
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateTerminal() {
    return updateTerminal;
  }

  public void setUpdateTerminal(String updateTerminal) {
    this.updateTerminal = updateTerminal;
  }

  public AnyIDList updateTeller(String updateTeller) {
    this.updateTeller = updateTeller;
    return this;
  }

  /**
   * Get updateTeller
   * @return updateTeller
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateTeller() {
    return updateTeller;
  }

  public void setUpdateTeller(String updateTeller) {
    this.updateTeller = updateTeller;
  }

  public AnyIDList updateBranch(String updateBranch) {
    this.updateBranch = updateBranch;
    return this;
  }

  /**
   * Get updateBranch
   * @return updateBranch
   **/
  @Schema(description = "")
      @NotNull

    public String getUpdateBranch() {
    return updateBranch;
  }

  public void setUpdateBranch(String updateBranch) {
    this.updateBranch = updateBranch;
  }

  public AnyIDList rtpFlag(String rtpFlag) {
    this.rtpFlag = rtpFlag;
    return this;
  }

  /**
   * Get rtpFlag
   * @return rtpFlag
   **/
  @Schema(example = "Y", description = "")
      @NotNull

    public String getRtpFlag() {
    return rtpFlag;
  }

  public void setRtpFlag(String rtpFlag) {
    this.rtpFlag = rtpFlag;
  }

  public AnyIDList rtpNotiLang(String rtpNotiLang) {
    this.rtpNotiLang = rtpNotiLang;
    return this;
  }

  /**
   * Get rtpNotiLang
   * @return rtpNotiLang
   **/
  @Schema(example = "EN", description = "")
      @NotNull

    public String getRtpNotiLang() {
    return rtpNotiLang;
  }

  public void setRtpNotiLang(String rtpNotiLang) {
    this.rtpNotiLang = rtpNotiLang;
  }

  public AnyIDList rtpNotiBan(String rtpNotiBan) {
    this.rtpNotiBan = rtpNotiBan;
    return this;
  }

  /**
   * Get rtpNotiBan
   * @return rtpNotiBan
   **/
  @Schema(example = "0000202306150001", description = "")
      @NotNull

    public String getRtpNotiBan() {
    return rtpNotiBan;
  }

  public void setRtpNotiBan(String rtpNotiBan) {
    this.rtpNotiBan = rtpNotiBan;
  }

  public AnyIDList rtpNotiPhoneNo(String rtpNotiPhoneNo) {
    this.rtpNotiPhoneNo = rtpNotiPhoneNo;
    return this;
  }

  /**
   * Get rtpNotiPhoneNo
   * @return rtpNotiPhoneNo
   **/
  @Schema(example = "0913334444", description = "")
      @NotNull

    public String getRtpNotiPhoneNo() {
    return rtpNotiPhoneNo;
  }

  public void setRtpNotiPhoneNo(String rtpNotiPhoneNo) {
    this.rtpNotiPhoneNo = rtpNotiPhoneNo;
  }

  public AnyIDList rtpNotiEmail(String rtpNotiEmail) {
    this.rtpNotiEmail = rtpNotiEmail;
    return this;
  }

  /**
   * Get rtpNotiEmail
   * @return rtpNotiEmail
   **/
  @Schema(example = "Camila@gmail.com", description = "")
      @NotNull

    public String getRtpNotiEmail() {
    return rtpNotiEmail;
  }

  public void setRtpNotiEmail(String rtpNotiEmail) {
    this.rtpNotiEmail = rtpNotiEmail;
  }

  public AnyIDList interFlag(String interFlag) {
    this.interFlag = interFlag;
    return this;
  }

  /**
   * Get interFlag
   * @return interFlag
   **/
  @Schema(example = "Y", description = "")
      @NotNull

    public String getInterFlag() {
    return interFlag;
  }

  public void setInterFlag(String interFlag) {
    this.interFlag = interFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyIDList anyIDList = (AnyIDList) o;
    return Objects.equals(this.bblRegistrationID, anyIDList.bblRegistrationID) &&
        Objects.equals(this.anyIDNo, anyIDList.anyIDNo) &&
        Objects.equals(this.itmxRegistrationID, anyIDList.itmxRegistrationID) &&
        Objects.equals(this.proxyType, anyIDList.proxyType) &&
        Objects.equals(this.proxyValue, anyIDList.proxyValue) &&
        Objects.equals(this.accountType, anyIDList.accountType) &&
        Objects.equals(this.accountValue, anyIDList.accountValue) &&
        Objects.equals(this.registrationStatus, anyIDList.registrationStatus) &&
        Objects.equals(this.addFromChannel, anyIDList.addFromChannel) &&
        Objects.equals(this.addDate, anyIDList.addDate) &&
        Objects.equals(this.addTime, anyIDList.addTime) &&
        Objects.equals(this.addTerminal, anyIDList.addTerminal) &&
        Objects.equals(this.addTeller, anyIDList.addTeller) &&
        Objects.equals(this.addBranch, anyIDList.addBranch) &&
        Objects.equals(this.updateFromChannel, anyIDList.updateFromChannel) &&
        Objects.equals(this.updateDate, anyIDList.updateDate) &&
        Objects.equals(this.updateTime, anyIDList.updateTime) &&
        Objects.equals(this.updateTerminal, anyIDList.updateTerminal) &&
        Objects.equals(this.updateTeller, anyIDList.updateTeller) &&
        Objects.equals(this.updateBranch, anyIDList.updateBranch) &&
        Objects.equals(this.rtpFlag, anyIDList.rtpFlag) &&
        Objects.equals(this.rtpNotiLang, anyIDList.rtpNotiLang) &&
        Objects.equals(this.rtpNotiBan, anyIDList.rtpNotiBan) &&
        Objects.equals(this.rtpNotiPhoneNo, anyIDList.rtpNotiPhoneNo) &&
        Objects.equals(this.rtpNotiEmail, anyIDList.rtpNotiEmail) &&
        Objects.equals(this.interFlag, anyIDList.interFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bblRegistrationID, anyIDNo, itmxRegistrationID, proxyType, proxyValue, accountType, accountValue, registrationStatus, addFromChannel, addDate, addTime, addTerminal, addTeller, addBranch, updateFromChannel, updateDate, updateTime, updateTerminal, updateTeller, updateBranch, rtpFlag, rtpNotiLang, rtpNotiBan, rtpNotiPhoneNo, rtpNotiEmail, interFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyIDList {\n");
    
    sb.append("    bblRegistrationID: ").append(toIndentedString(bblRegistrationID)).append("\n");
    sb.append("    anyIDNo: ").append(toIndentedString(anyIDNo)).append("\n");
    sb.append("    itmxRegistrationID: ").append(toIndentedString(itmxRegistrationID)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("    addFromChannel: ").append(toIndentedString(addFromChannel)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    addTerminal: ").append(toIndentedString(addTerminal)).append("\n");
    sb.append("    addTeller: ").append(toIndentedString(addTeller)).append("\n");
    sb.append("    addBranch: ").append(toIndentedString(addBranch)).append("\n");
    sb.append("    updateFromChannel: ").append(toIndentedString(updateFromChannel)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updateTerminal: ").append(toIndentedString(updateTerminal)).append("\n");
    sb.append("    updateTeller: ").append(toIndentedString(updateTeller)).append("\n");
    sb.append("    updateBranch: ").append(toIndentedString(updateBranch)).append("\n");
    sb.append("    rtpFlag: ").append(toIndentedString(rtpFlag)).append("\n");
    sb.append("    rtpNotiLang: ").append(toIndentedString(rtpNotiLang)).append("\n");
    sb.append("    rtpNotiBan: ").append(toIndentedString(rtpNotiBan)).append("\n");
    sb.append("    rtpNotiPhoneNo: ").append(toIndentedString(rtpNotiPhoneNo)).append("\n");
    sb.append("    rtpNotiEmail: ").append(toIndentedString(rtpNotiEmail)).append("\n");
    sb.append("    interFlag: ").append(toIndentedString(interFlag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
