package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RGISRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class RGISRequest   {
  @JsonProperty("requiredVerifyOTP")
  private String requiredVerifyOTP = null;

  @JsonProperty("otpReferenceId")
  private String otpReferenceId = null;

  @JsonProperty("otpValue")
  private String otpValue = null;

  @JsonProperty("anyIdNo")
  private String anyIdNo = null;

  @JsonProperty("rmNo")
  private String rmNo = null;

  @JsonProperty("idType")
  private String idType = null;

  @JsonProperty("idNo")
  private String idNo = null;

  @JsonProperty("customerType")
  private String customerType = null;

  @JsonProperty("customerPrefix")
  private String customerPrefix = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("registartionCustomerId")
  private String registartionCustomerId = null;

  @JsonProperty("authorizeId")
  private String authorizeId = null;

  @JsonProperty("needOverride1")
  private String needOverride1 = null;

  @JsonProperty("needOverride2")
  private String needOverride2 = null;

  @JsonProperty("needOverride3")
  private String needOverride3 = null;

  @JsonProperty("needOverride4")
  private String needOverride4 = null;

  @JsonProperty("needOverride5")
  private String needOverride5 = null;

  @JsonProperty("mobileAcceptType")
  private String mobileAcceptType = null;

  @JsonProperty("allocationCode")
  private String allocationCode = null;

  @JsonProperty("rtpServiceFlag")
  private String rtpServiceFlag = null;

  @JsonProperty("rtpNotificationLanguage")
  private String rtpNotificationLanguage = null;

  @JsonProperty("rtpNotificationBAN")
  private String rtpNotificationBAN = null;

  @JsonProperty("rtpNotificationPhoneNo")
  private String rtpNotificationPhoneNo = null;

  @JsonProperty("rtpNotificationEmail")
  private String rtpNotificationEmail = null;

  public RGISRequest requiredVerifyOTP(String requiredVerifyOTP) {
    this.requiredVerifyOTP = requiredVerifyOTP;
    return this;
  }

  /**
   * possible values = Y, N
   * @return requiredVerifyOTP
   **/
  @Schema(example = "N", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getRequiredVerifyOTP() {
    return requiredVerifyOTP;
  }

  public void setRequiredVerifyOTP(String requiredVerifyOTP) {
    this.requiredVerifyOTP = requiredVerifyOTP;
  }

  public RGISRequest otpReferenceId(String otpReferenceId) {
    this.otpReferenceId = otpReferenceId;
    return this;
  }

  /**
   * Get otpReferenceId
   * @return otpReferenceId
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|[0-9a-zA-Z]{11}")   public String getOtpReferenceId() {
    return otpReferenceId;
  }

  public void setOtpReferenceId(String otpReferenceId) {
    this.otpReferenceId = otpReferenceId;
  }

  public RGISRequest otpValue(String otpValue) {
    this.otpValue = otpValue;
    return this;
  }

  /**
   * Get otpValue
   * @return otpValue
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|[0-9a-zA-Z]{9}")   public String getOtpValue() {
    return otpValue;
  }

  public void setOtpValue(String otpValue) {
    this.otpValue = otpValue;
  }

  public RGISRequest anyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
    return this;
  }

  /**
   * Get anyIdNo
   * @return anyIdNo
   **/
  @Schema(example = "0000102211221234", description = "")
      @NotNull

  @Pattern(regexp="|[0-9]{16}")   public String getAnyIdNo() {
    return anyIdNo;
  }

  public void setAnyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
  }

  public RGISRequest rmNo(String rmNo) {
    this.rmNo = rmNo;
    return this;
  }

  /**
   * Get rmNo
   * @return rmNo
   **/
  @Schema(example = "00000001234567", required = true, description = "")
      @NotNull

  @Pattern(regexp="[0-9]{14}")   public String getRmNo() {
    return rmNo;
  }

  public void setRmNo(String rmNo) {
    this.rmNo = rmNo;
  }

  public RGISRequest idType(String idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   **/
  @Schema(example = "CI", required = true, description = "")
      @NotNull

  @Pattern(regexp="[a-zA-Z]{2}")   public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public RGISRequest idNo(String idNo) {
    this.idNo = idNo;
    return this;
  }

  /**
   * Get idNo
   * @return idNo
   **/
  @Schema(example = "3458994699709", required = true, description = "")
      @NotNull

  @Pattern(regexp="[0-9]{10,25}")   public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public RGISRequest customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * P: Personal, C: Commercial
   * @return customerType
   **/
  @Schema(example = "P", required = true, description = "P: Personal, C: Commercial")
      @NotNull

  @Pattern(regexp="P|C")   public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public RGISRequest customerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
    return this;
  }

  /**
   * Get customerPrefix
   * @return customerPrefix
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1,max=25)   public String getCustomerPrefix() {
    return customerPrefix;
  }

  public void setCustomerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
  }

  public RGISRequest customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
   **/
  @Schema(example = "นาย", required = true, description = "")
      @NotNull

  @Size(min=1,max=80)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public RGISRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * possible values = NATID, MSISDN
   * @return proxyType
   **/
  @Schema(example = "MSISDN", required = true, description = "possible values = NATID, MSISDN")
      @NotNull

  @Pattern(regexp="NATID|MSISDN")   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public RGISRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "+66813322551", required = true, description = "")
      @NotNull

  @Pattern(regexp="\\d{10,20}")   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public RGISRequest accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * possible values = SA, SS, CA
   * @return accountType
   **/
  @Schema(example = "SA", required = true, description = "possible values = SA, SS, CA")
      @NotNull

  @Pattern(regexp="SA|SS|CA")   public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public RGISRequest accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(example = "1114000015", required = true, description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public RGISRequest registartionCustomerId(String registartionCustomerId) {
    this.registartionCustomerId = registartionCustomerId;
    return this;
  }

  /**
   * Get registartionCustomerId
   * @return registartionCustomerId
   **/
  @Schema(example = "00001122545845", required = true, description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getRegistartionCustomerId() {
    return registartionCustomerId;
  }

  public void setRegistartionCustomerId(String registartionCustomerId) {
    this.registartionCustomerId = registartionCustomerId;
  }

  public RGISRequest authorizeId(String authorizeId) {
    this.authorizeId = authorizeId;
    return this;
  }

  /**
   * Get authorizeId
   * @return authorizeId
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|[0-9a-zA-Z]{1,20}")   public String getAuthorizeId() {
    return authorizeId;
  }

  public void setAuthorizeId(String authorizeId) {
    this.authorizeId = authorizeId;
  }

  public RGISRequest needOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride1
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getNeedOverride1() {
    return needOverride1;
  }

  public void setNeedOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
  }

  public RGISRequest needOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride2
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getNeedOverride2() {
    return needOverride2;
  }

  public void setNeedOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
  }

  public RGISRequest needOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride3
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getNeedOverride3() {
    return needOverride3;
  }

  public void setNeedOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
  }

  public RGISRequest needOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride4
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getNeedOverride4() {
    return needOverride4;
  }

  public void setNeedOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
  }

  public RGISRequest needOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride5
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getNeedOverride5() {
    return needOverride5;
  }

  public void setNeedOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
  }

  public RGISRequest mobileAcceptType(String mobileAcceptType) {
    this.mobileAcceptType = mobileAcceptType;
    return this;
  }

  /**
   * possible values = 1, 2, 3
   * @return mobileAcceptType
   **/
  @Schema(description = "possible values = 1, 2, 3")
      @NotNull

  @Pattern(regexp="|1|2|3")   public String getMobileAcceptType() {
    return mobileAcceptType;
  }

  public void setMobileAcceptType(String mobileAcceptType) {
    this.mobileAcceptType = mobileAcceptType;
  }

  public RGISRequest allocationCode(String allocationCode) {
    this.allocationCode = allocationCode;
    return this;
  }

  /**
   * Get allocationCode
   * @return allocationCode
   **/
  @Schema(example = "B010102145142", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{1}+\\d{12}")   public String getAllocationCode() {
    return allocationCode;
  }

  public void setAllocationCode(String allocationCode) {
    this.allocationCode = allocationCode;
  }

  public RGISRequest rtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
    return this;
  }

  /**
   * possible values = Y, N
   * @return rtpServiceFlag
   **/
  @Schema(example = "Y", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getRtpServiceFlag() {
    return rtpServiceFlag;
  }

  public void setRtpServiceFlag(String rtpServiceFlag) {
    this.rtpServiceFlag = rtpServiceFlag;
  }

  public RGISRequest rtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
    return this;
  }

  /**
   * Get rtpNotificationLanguage
   * @return rtpNotificationLanguage
   **/
  @Schema(example = "TH", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{2}")   public String getRtpNotificationLanguage() {
    return rtpNotificationLanguage;
  }

  public void setRtpNotificationLanguage(String rtpNotificationLanguage) {
    this.rtpNotificationLanguage = rtpNotificationLanguage;
  }

  public RGISRequest rtpNotificationBAN(String rtpNotificationBAN) {
    this.rtpNotificationBAN = rtpNotificationBAN;
    return this;
  }

  /**
   * Get rtpNotificationBAN
   * @return rtpNotificationBAN
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|\\d{16}")   public String getRtpNotificationBAN() {
    return rtpNotificationBAN;
  }

  public void setRtpNotificationBAN(String rtpNotificationBAN) {
    this.rtpNotificationBAN = rtpNotificationBAN;
  }

  public RGISRequest rtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
    return this;
  }

  /**
   * Get rtpNotificationPhoneNo
   * @return rtpNotificationPhoneNo
   **/
  @Schema(example = "0000202306150001", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10}")   public String getRtpNotificationPhoneNo() {
    return rtpNotificationPhoneNo;
  }

  public void setRtpNotificationPhoneNo(String rtpNotificationPhoneNo) {
    this.rtpNotificationPhoneNo = rtpNotificationPhoneNo;
  }

  public RGISRequest rtpNotificationEmail(String rtpNotificationEmail) {
    this.rtpNotificationEmail = rtpNotificationEmail;
    return this;
  }

  /**
   * Get rtpNotificationEmail
   * @return rtpNotificationEmail
   **/
  @Schema(description = "")
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
    RGISRequest rgISRequest = (RGISRequest) o;
    return Objects.equals(this.requiredVerifyOTP, rgISRequest.requiredVerifyOTP) &&
        Objects.equals(this.otpReferenceId, rgISRequest.otpReferenceId) &&
        Objects.equals(this.otpValue, rgISRequest.otpValue) &&
        Objects.equals(this.anyIdNo, rgISRequest.anyIdNo) &&
        Objects.equals(this.rmNo, rgISRequest.rmNo) &&
        Objects.equals(this.idType, rgISRequest.idType) &&
        Objects.equals(this.idNo, rgISRequest.idNo) &&
        Objects.equals(this.customerType, rgISRequest.customerType) &&
        Objects.equals(this.customerPrefix, rgISRequest.customerPrefix) &&
        Objects.equals(this.customerName, rgISRequest.customerName) &&
        Objects.equals(this.proxyType, rgISRequest.proxyType) &&
        Objects.equals(this.proxyValue, rgISRequest.proxyValue) &&
        Objects.equals(this.accountType, rgISRequest.accountType) &&
        Objects.equals(this.accountValue, rgISRequest.accountValue) &&
        Objects.equals(this.registartionCustomerId, rgISRequest.registartionCustomerId) &&
        Objects.equals(this.authorizeId, rgISRequest.authorizeId) &&
        Objects.equals(this.needOverride1, rgISRequest.needOverride1) &&
        Objects.equals(this.needOverride2, rgISRequest.needOverride2) &&
        Objects.equals(this.needOverride3, rgISRequest.needOverride3) &&
        Objects.equals(this.needOverride4, rgISRequest.needOverride4) &&
        Objects.equals(this.needOverride5, rgISRequest.needOverride5) &&
        Objects.equals(this.mobileAcceptType, rgISRequest.mobileAcceptType) &&
        Objects.equals(this.allocationCode, rgISRequest.allocationCode) &&
        Objects.equals(this.rtpServiceFlag, rgISRequest.rtpServiceFlag) &&
        Objects.equals(this.rtpNotificationLanguage, rgISRequest.rtpNotificationLanguage) &&
        Objects.equals(this.rtpNotificationBAN, rgISRequest.rtpNotificationBAN) &&
        Objects.equals(this.rtpNotificationPhoneNo, rgISRequest.rtpNotificationPhoneNo) &&
        Objects.equals(this.rtpNotificationEmail, rgISRequest.rtpNotificationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredVerifyOTP, otpReferenceId, otpValue, anyIdNo, rmNo, idType, idNo, customerType, customerPrefix, customerName, proxyType, proxyValue, accountType, accountValue, registartionCustomerId, authorizeId, needOverride1, needOverride2, needOverride3, needOverride4, needOverride5, mobileAcceptType, allocationCode, rtpServiceFlag, rtpNotificationLanguage, rtpNotificationBAN, rtpNotificationPhoneNo, rtpNotificationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RGISRequest {\n");
    
    sb.append("    requiredVerifyOTP: ").append(toIndentedString(requiredVerifyOTP)).append("\n");
    sb.append("    otpReferenceId: ").append(toIndentedString(otpReferenceId)).append("\n");
    sb.append("    otpValue: ").append(toIndentedString(otpValue)).append("\n");
    sb.append("    anyIdNo: ").append(toIndentedString(anyIdNo)).append("\n");
    sb.append("    rmNo: ").append(toIndentedString(rmNo)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idNo: ").append(toIndentedString(idNo)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    customerPrefix: ").append(toIndentedString(customerPrefix)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    registartionCustomerId: ").append(toIndentedString(registartionCustomerId)).append("\n");
    sb.append("    authorizeId: ").append(toIndentedString(authorizeId)).append("\n");
    sb.append("    needOverride1: ").append(toIndentedString(needOverride1)).append("\n");
    sb.append("    needOverride2: ").append(toIndentedString(needOverride2)).append("\n");
    sb.append("    needOverride3: ").append(toIndentedString(needOverride3)).append("\n");
    sb.append("    needOverride4: ").append(toIndentedString(needOverride4)).append("\n");
    sb.append("    needOverride5: ").append(toIndentedString(needOverride5)).append("\n");
    sb.append("    mobileAcceptType: ").append(toIndentedString(mobileAcceptType)).append("\n");
    sb.append("    allocationCode: ").append(toIndentedString(allocationCode)).append("\n");
    sb.append("    rtpServiceFlag: ").append(toIndentedString(rtpServiceFlag)).append("\n");
    sb.append("    rtpNotificationLanguage: ").append(toIndentedString(rtpNotificationLanguage)).append("\n");
    sb.append("    rtpNotificationBAN: ").append(toIndentedString(rtpNotificationBAN)).append("\n");
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
