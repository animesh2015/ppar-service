package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPSetupRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class RTPSetupRequest   {
  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("bblRegistrationId")
  private String bblRegistrationId = null;

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

  public RTPSetupRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @Schema(example = "MSISDN", required = true, description = "")
      @NotNull

  @Pattern(regexp="NATID|MSISDN") @Size(max=12)   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public RTPSetupRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "0913334444", required = true, description = "")
      @NotNull

  @Pattern(regexp="^[0-9]*$") @Size(min=1,max=100)   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public RTPSetupRequest bblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
    return this;
  }

  /**
   * Get bblRegistrationId
   * @return bblRegistrationId
   **/
  @Schema(example = "000000900238", required = true, description = "")
      @NotNull

  @Pattern(regexp="^[0-9]*$") @Size(min=12,max=12)   public String getBblRegistrationId() {
    return bblRegistrationId;
  }

  public void setBblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
  }

  public RTPSetupRequest rtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
    return this;
  }

  /**
   * Get rtpServiceFlag
   * @return rtpServiceFlag
   **/
  @Schema(example = "Y", required = true, description = "")
      @NotNull

  @Pattern(regexp="^(Y|N)$") @Size(min=1,max=1)   public String getRtpServiceFlag() {
    return rtpServiceFlag;
  }

  public void setRtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
  }

  public RTPSetupRequest rtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
    return this;
  }

  /**
   * Get rtpNotificationLanguage
   * @return rtpNotificationLanguage
   **/
  @Schema(example = "EN", required = true, description = "")
      @NotNull

  @Size(min=2,max=2)   public String getRtpNotificationLanguage() {
    return rtpNotificationLanguage;
  }

  public void setRtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
  }

  public RTPSetupRequest rtpNotificationBan(String rtpNotificationBan) {
    this.rtpNotificationBan = rtpNotificationBan;
    return this;
  }

  /**
   * Get rtpNotificationBan
   * @return rtpNotificationBan
   **/
  @Schema(example = "0000202306150001", required = true, description = "")
      @NotNull

  @Size(max=19)   public String getRtpNotificationBan() {
    return rtpNotificationBan;
  }

  public void setRtpNotificationBan(String rtpNotificationBan) {
    this.rtpNotificationBan = rtpNotificationBan;
  }

  public RTPSetupRequest rtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
    return this;
  }

  /**
   * Get rtpNotificationPhoneNo
   * @return rtpNotificationPhoneNo
   **/
  @Schema(example = "0913334444", description = "")
      @NotNull

  @Pattern(regexp="|^(0[689]{1})+([0-9]{8})+$")   public String getRtpNotificationPhoneNo() {
    return rtpNotificationPhoneNo;
  }

  public void setRtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
  }

  public RTPSetupRequest rtpNotificationEmail(String rtpNotificationEmail) {
    this.rtpNotificationEmail = rtpNotificationEmail;
    return this;
  }

  /**
   * Get rtpNotificationEmail
   * @return rtpNotificationEmail
   **/
  @Schema(example = "abctest@gmail.com", description = "")
      @NotNull

  @Pattern(regexp="|^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") @Size(max=70)   public String getRtpNotificationEmail() {
    return rtpNotificationEmail;
  }

  public void setRtpNotificationEmail(String rtpNotificationEmail) {
    this.rtpNotificationEmail = rtpNotificationEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPSetupRequest rtPSetupRequest = (RTPSetupRequest) o;
    return Objects.equals(this.proxyType, rtPSetupRequest.proxyType) &&
        Objects.equals(this.proxyValue, rtPSetupRequest.proxyValue) &&
        Objects.equals(this.bblRegistrationId, rtPSetupRequest.bblRegistrationId) &&
        Objects.equals(this.rtpServiceFlag, rtPSetupRequest.rtpServiceFlag) &&
        Objects.equals(this.rtpNotificationLanguage, rtPSetupRequest.rtpNotificationLanguage) &&
        Objects.equals(this.rtpNotificationBan, rtPSetupRequest.rtpNotificationBan) &&
        Objects.equals(this.rtpNotificationPhoneNo, rtPSetupRequest.rtpNotificationPhoneNo) &&
        Objects.equals(this.rtpNotificationEmail, rtPSetupRequest.rtpNotificationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyType, proxyValue, bblRegistrationId, rtpServiceFlag, rtpNotificationLanguage, rtpNotificationBan, rtpNotificationPhoneNo, rtpNotificationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPSetupRequest {\n");
    
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    bblRegistrationId: ").append(toIndentedString(bblRegistrationId)).append("\n");
    sb.append("    rtpServiceFlag: ").append(toIndentedString(rtpServiceFlag)).append("\n");
    sb.append("    rtpNotificationLanguage: ").append(toIndentedString(rtpNotificationLanguage)).append("\n");
    sb.append("    rtpNotificationBan: ").append(toIndentedString(rtpNotificationBan)).append("\n");
    sb.append("    rtpNotificationPhoneNo: ").append(toIndentedString(rtpNotificationPhoneNo)).append("\n");
    sb.append("    rtpNotificationEmail: ").append(toIndentedString(rtpNotificationEmail)).append("\n");
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
