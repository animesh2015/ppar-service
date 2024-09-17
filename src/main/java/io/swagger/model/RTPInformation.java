package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class RTPInformation   {
  @JsonProperty("rtpServiceFlag")
  private String rtpServiceFlag = null;

  @JsonProperty("rtpNotificationLanguage")
  private String rtpNotificationLanguage = null;

  @JsonProperty("rtpNotificationBan")
  private String rtpNotificationBan = null;

  @JsonProperty("rtpNotificationPhoneNo")
  private String rtpNotificationPhoneNo = null;

  @JsonProperty("rtpNotificationEmail")
  private String rtpNotificationEmail = null;

  @JsonProperty("addDate")
  private String addDate = null;

  @JsonProperty("addTime")
  private String addTime = null;

  @JsonProperty("addTerm")
  private String addTerm = null;

  @JsonProperty("addTell")
  private String addTell = null;

  @JsonProperty("addBranch")
  private String addBranch = null;

  @JsonProperty("addChannel")
  private String addChannel = null;

  public RTPInformation rtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
    return this;
  }

  /**
   * Get rtpServiceFlag
   * @return rtpServiceFlag
   **/
  @Schema(example = "Y", description = "")
      @NotNull

    public String getRtpServiceFlag() {
    return rtpServiceFlag;
  }

  public void setRtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
  }

  public RTPInformation rtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
    return this;
  }

  /**
   * Get rtpNotificationLanguage
   * @return rtpNotificationLanguage
   **/
  @Schema(example = "TH", description = "")
      @NotNull

    public String getRtpNotificationLanguage() {
    return rtpNotificationLanguage;
  }

  public void setRtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
  }

  public RTPInformation rtpNotificationBan(String rtpNotificationBan) {
    this.rtpNotificationBan = rtpNotificationBan;
    return this;
  }

  /**
   * Get rtpNotificationBan
   * @return rtpNotificationBan
   **/
  @Schema(example = "0000202306150001", description = "")
      @NotNull

    public String getRtpNotificationBan() {
    return rtpNotificationBan;
  }

  public void setRtpNotificationBan(String rtpNotificationBan) {
    this.rtpNotificationBan = rtpNotificationBan;
  }

  public RTPInformation rtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
    return this;
  }

  /**
   * Get rtpNotificationPhoneNo
   * @return rtpNotificationPhoneNo
   **/
  @Schema(example = "0913334444", description = "")
      @NotNull

    public String getRtpNotificationPhoneNo() {
    return rtpNotificationPhoneNo;
  }

  public void setRtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
  }

  public RTPInformation rtpNotificationEmail(String rtpNotificationEmail) {
    this.rtpNotificationEmail = rtpNotificationEmail;
    return this;
  }

  /**
   * Get rtpNotificationEmail
   * @return rtpNotificationEmail
   **/
  @Schema(example = "Audom123@gmail.com", description = "")
      @NotNull

    public String getRtpNotificationEmail() {
    return rtpNotificationEmail;
  }

  public void setRtpNotificationEmail(String rtpNotificationEmail) {
    this.rtpNotificationEmail = rtpNotificationEmail;
  }

  public RTPInformation addDate(String addDate) {
    this.addDate = addDate;
    return this;
  }

  /**
   * Get addDate
   * @return addDate
   **/
  @Schema(example = "04062024", description = "")
      @NotNull

    public String getAddDate() {
    return addDate;
  }

  public void setAddDate(String addDate) {
    this.addDate = addDate;
  }

  public RTPInformation addTime(String addTime) {
    this.addTime = addTime;
    return this;
  }

  /**
   * Get addTime
   * @return addTime
   **/
  @Schema(example = "103044", description = "")
      @NotNull

    public String getAddTime() {
    return addTime;
  }

  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }

  public RTPInformation addTerm(String addTerm) {
    this.addTerm = addTerm;
    return this;
  }

  /**
   * Get addTerm
   * @return addTerm
   **/
  @Schema(example = "0098PF", description = "")
      @NotNull

    public String getAddTerm() {
    return addTerm;
  }

  public void setAddTerm(String addTerm) {
    this.addTerm = addTerm;
  }

  public RTPInformation addTell(String addTell) {
    this.addTell = addTell;
    return this;
  }

  /**
   * Get addTell
   * @return addTell
   **/
  @Schema(example = "9098030", description = "")
      @NotNull

    public String getAddTell() {
    return addTell;
  }

  public void setAddTell(String addTell) {
    this.addTell = addTell;
  }

  public RTPInformation addBranch(String addBranch) {
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

  public RTPInformation addChannel(String addChannel) {
    this.addChannel = addChannel;
    return this;
  }

  /**
   * Get addChannel
   * @return addChannel
   **/
  @Schema(example = "M", description = "")
      @NotNull

    public String getAddChannel() {
    return addChannel;
  }

  public void setAddChannel(String addChannel) {
    this.addChannel = addChannel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPInformation rtPInformation = (RTPInformation) o;
    return Objects.equals(this.rtpServiceFlag, rtPInformation.rtpServiceFlag) &&
        Objects.equals(this.rtpNotificationLanguage, rtPInformation.rtpNotificationLanguage) &&
        Objects.equals(this.rtpNotificationBan, rtPInformation.rtpNotificationBan) &&
        Objects.equals(this.rtpNotificationPhoneNo, rtPInformation.rtpNotificationPhoneNo) &&
        Objects.equals(this.rtpNotificationEmail, rtPInformation.rtpNotificationEmail) &&
        Objects.equals(this.addDate, rtPInformation.addDate) &&
        Objects.equals(this.addTime, rtPInformation.addTime) &&
        Objects.equals(this.addTerm, rtPInformation.addTerm) &&
        Objects.equals(this.addTell, rtPInformation.addTell) &&
        Objects.equals(this.addBranch, rtPInformation.addBranch) &&
        Objects.equals(this.addChannel, rtPInformation.addChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtpServiceFlag, rtpNotificationLanguage, rtpNotificationBan, rtpNotificationPhoneNo, rtpNotificationEmail, addDate, addTime, addTerm, addTell, addBranch, addChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPInformation {\n");
    
    sb.append("    rtpServiceFlag: ").append(toIndentedString(rtpServiceFlag)).append("\n");
    sb.append("    rtpNotificationLanguage: ").append(toIndentedString(rtpNotificationLanguage)).append("\n");
    sb.append("    rtpNotificationBan: ").append(toIndentedString(rtpNotificationBan)).append("\n");
    sb.append("    rtpNotificationPhoneNo: ").append(toIndentedString(rtpNotificationPhoneNo)).append("\n");
    sb.append("    rtpNotificationEmail: ").append(toIndentedString(rtpNotificationEmail)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    addTerm: ").append(toIndentedString(addTerm)).append("\n");
    sb.append("    addTell: ").append(toIndentedString(addTell)).append("\n");
    sb.append("    addBranch: ").append(toIndentedString(addBranch)).append("\n");
    sb.append("    addChannel: ").append(toIndentedString(addChannel)).append("\n");
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
