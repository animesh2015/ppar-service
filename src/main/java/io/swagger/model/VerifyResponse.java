package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.WarningMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VerifyResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class VerifyResponse   {
  @JsonProperty("otpReferenceId")
  private String otpReferenceId = null;

  @JsonProperty("anyIdNo")
  private String anyIdNo = null;

  @JsonProperty("rMNo")
  private String rMNo = null;

  @JsonProperty("idType")
  private String idType = null;

  @JsonProperty("idNo")
  private String idNo = null;

  @JsonProperty("pCOfCustomer")
  private String pCOfCustomer = null;

  @JsonProperty("customerPrefix")
  private String customerPrefix = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("accountNameFromPersonal")
  private String accountNameFromPersonal = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountNameFromCommercial")
  private String accountNameFromCommercial = null;

  @JsonProperty("accountNameFromGrovernment")
  private String accountNameFromGrovernment = null;

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

  @JsonProperty("authorizeToProcessCode")
  private String authorizeToProcessCode = null;

  @JsonProperty("noOfWarningMessage")
  private Integer noOfWarningMessage = null;

  @JsonProperty("warningMessage")
  @Valid
  private List<WarningMessage> warningMessage = null;

  public VerifyResponse otpReferenceId(String otpReferenceId) {
    this.otpReferenceId = otpReferenceId;
    return this;
  }

  /**
   * Get otpReferenceId
   * @return otpReferenceId
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=11)   public String getOtpReferenceId() {
    return otpReferenceId;
  }

  public void setOtpReferenceId(String otpReferenceId) {
    this.otpReferenceId = otpReferenceId;
  }

  public VerifyResponse anyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
    return this;
  }

  /**
   * Get anyIdNo
   * @return anyIdNo
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=19)   public String getAnyIdNo() {
    return anyIdNo;
  }

  public void setAnyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
  }

  public VerifyResponse rMNo(String rMNo) {
    this.rMNo = rMNo;
    return this;
  }

  /**
   * Get rMNo
   * @return rMNo
   **/
  @Schema(example = "0000202306150001", description = "")
      @NotNull

  @Size(max=14)   public String getRMNo() {
    return rMNo;
  }

  public void setRMNo(String rMNo) {
    this.rMNo = rMNo;
  }

  public VerifyResponse idType(String idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   **/
  @Schema(example = "CI", description = "")
      @NotNull

  @Size(max=2)   public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public VerifyResponse idNo(String idNo) {
    this.idNo = idNo;
    return this;
  }

  /**
   * Get idNo
   * @return idNo
   **/
  @Schema(example = "1521100115555", description = "")
      @NotNull

  @Size(max=25)   public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public VerifyResponse pCOfCustomer(String pCOfCustomer) {
    this.pCOfCustomer = pCOfCustomer;
    return this;
  }

  /**
   * possible values = C, P
   * @return pCOfCustomer
   **/
  @Schema(example = "P", description = "possible values = C, P")
      @NotNull

  @Size(max=1)   public String getPCOfCustomer() {
    return pCOfCustomer;
  }

  public void setPCOfCustomer(String pCOfCustomer) {
    this.pCOfCustomer = pCOfCustomer;
  }

  public VerifyResponse customerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
    return this;
  }

  /**
   * Get customerPrefix
   * @return customerPrefix
   **/
  @Schema(example = "นาย", description = "")
      @NotNull

  @Size(max=25)   public String getCustomerPrefix() {
    return customerPrefix;
  }

  public void setCustomerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
  }

  public VerifyResponse customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
   **/
  @Schema(example = "ตั้งตรง มีนา", description = "")
      @NotNull

  @Size(max=80)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public VerifyResponse accountNameFromPersonal(String accountNameFromPersonal) {
    this.accountNameFromPersonal = accountNameFromPersonal;
    return this;
  }

  /**
   * Get accountNameFromPersonal
   * @return accountNameFromPersonal
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=80)   public String getAccountNameFromPersonal() {
    return accountNameFromPersonal;
  }

  public void setAccountNameFromPersonal(String accountNameFromPersonal) {
    this.accountNameFromPersonal = accountNameFromPersonal;
  }

  public VerifyResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   **/
  @Schema(example = "ตั้งตรง มีนา", description = "")
      @NotNull

  @Size(max=80)   public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public VerifyResponse accountNameFromCommercial(String accountNameFromCommercial) {
    this.accountNameFromCommercial = accountNameFromCommercial;
    return this;
  }

  /**
   * Get accountNameFromCommercial
   * @return accountNameFromCommercial
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=80)   public String getAccountNameFromCommercial() {
    return accountNameFromCommercial;
  }

  public void setAccountNameFromCommercial(String accountNameFromCommercial) {
    this.accountNameFromCommercial = accountNameFromCommercial;
  }

  public VerifyResponse accountNameFromGrovernment(String accountNameFromGrovernment) {
    this.accountNameFromGrovernment = accountNameFromGrovernment;
    return this;
  }

  /**
   * Get accountNameFromGrovernment
   * @return accountNameFromGrovernment
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=80)   public String getAccountNameFromGrovernment() {
    return accountNameFromGrovernment;
  }

  public void setAccountNameFromGrovernment(String accountNameFromGrovernment) {
    this.accountNameFromGrovernment = accountNameFromGrovernment;
  }

  public VerifyResponse needOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride1
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Size(max=1)   public String getNeedOverride1() {
    return needOverride1;
  }

  public void setNeedOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
  }

  public VerifyResponse needOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride2
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Size(max=1)   public String getNeedOverride2() {
    return needOverride2;
  }

  public void setNeedOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
  }

  public VerifyResponse needOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride3
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Size(max=1)   public String getNeedOverride3() {
    return needOverride3;
  }

  public void setNeedOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
  }

  public VerifyResponse needOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride4
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Size(max=1)   public String getNeedOverride4() {
    return needOverride4;
  }

  public void setNeedOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
  }

  public VerifyResponse needOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return needOverride5
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Size(max=1)   public String getNeedOverride5() {
    return needOverride5;
  }

  public void setNeedOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
  }

  public VerifyResponse authorizeToProcessCode(String authorizeToProcessCode) {
    this.authorizeToProcessCode = authorizeToProcessCode;
    return this;
  }

  /**
   * Get authorizeToProcessCode
   * @return authorizeToProcessCode
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=1)   public String getAuthorizeToProcessCode() {
    return authorizeToProcessCode;
  }

  public void setAuthorizeToProcessCode(String authorizeToProcessCode) {
    this.authorizeToProcessCode = authorizeToProcessCode;
  }

  public VerifyResponse noOfWarningMessage(Integer noOfWarningMessage) {
    this.noOfWarningMessage = noOfWarningMessage;
    return this;
  }

  /**
   * Get noOfWarningMessage
   * @return noOfWarningMessage
   **/
  @Schema(example = "1", description = "")
      @NotNull

    public Integer getNoOfWarningMessage() {
    return noOfWarningMessage;
  }

  public void setNoOfWarningMessage(Integer noOfWarningMessage) {
    this.noOfWarningMessage = noOfWarningMessage;
  }

  public VerifyResponse warningMessage(List<WarningMessage> warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  public VerifyResponse addWarningMessageItem(WarningMessage warningMessageItem) {
    if (this.warningMessage == null) {
      this.warningMessage = new ArrayList<WarningMessage>();
    }
    this.warningMessage.add(warningMessageItem);
    return this;
  }

  /**
   * Get warningMessage
   * @return warningMessage
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<WarningMessage> getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(List<WarningMessage> warningMessage) {
    this.warningMessage = warningMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyResponse verifyResponse = (VerifyResponse) o;
    return Objects.equals(this.otpReferenceId, verifyResponse.otpReferenceId) &&
        Objects.equals(this.anyIdNo, verifyResponse.anyIdNo) &&
        Objects.equals(this.rMNo, verifyResponse.rMNo) &&
        Objects.equals(this.idType, verifyResponse.idType) &&
        Objects.equals(this.idNo, verifyResponse.idNo) &&
        Objects.equals(this.pCOfCustomer, verifyResponse.pCOfCustomer) &&
        Objects.equals(this.customerPrefix, verifyResponse.customerPrefix) &&
        Objects.equals(this.customerName, verifyResponse.customerName) &&
        Objects.equals(this.accountNameFromPersonal, verifyResponse.accountNameFromPersonal) &&
        Objects.equals(this.accountName, verifyResponse.accountName) &&
        Objects.equals(this.accountNameFromCommercial, verifyResponse.accountNameFromCommercial) &&
        Objects.equals(this.accountNameFromGrovernment, verifyResponse.accountNameFromGrovernment) &&
        Objects.equals(this.needOverride1, verifyResponse.needOverride1) &&
        Objects.equals(this.needOverride2, verifyResponse.needOverride2) &&
        Objects.equals(this.needOverride3, verifyResponse.needOverride3) &&
        Objects.equals(this.needOverride4, verifyResponse.needOverride4) &&
        Objects.equals(this.needOverride5, verifyResponse.needOverride5) &&
        Objects.equals(this.authorizeToProcessCode, verifyResponse.authorizeToProcessCode) &&
        Objects.equals(this.noOfWarningMessage, verifyResponse.noOfWarningMessage) &&
        Objects.equals(this.warningMessage, verifyResponse.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpReferenceId, anyIdNo, rMNo, idType, idNo, pCOfCustomer, customerPrefix, customerName, accountNameFromPersonal, accountName, accountNameFromCommercial, accountNameFromGrovernment, needOverride1, needOverride2, needOverride3, needOverride4, needOverride5, authorizeToProcessCode, noOfWarningMessage, warningMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyResponse {\n");
    
    sb.append("    otpReferenceId: ").append(toIndentedString(otpReferenceId)).append("\n");
    sb.append("    anyIdNo: ").append(toIndentedString(anyIdNo)).append("\n");
    sb.append("    rMNo: ").append(toIndentedString(rMNo)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idNo: ").append(toIndentedString(idNo)).append("\n");
    sb.append("    pCOfCustomer: ").append(toIndentedString(pCOfCustomer)).append("\n");
    sb.append("    customerPrefix: ").append(toIndentedString(customerPrefix)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    accountNameFromPersonal: ").append(toIndentedString(accountNameFromPersonal)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNameFromCommercial: ").append(toIndentedString(accountNameFromCommercial)).append("\n");
    sb.append("    accountNameFromGrovernment: ").append(toIndentedString(accountNameFromGrovernment)).append("\n");
    sb.append("    needOverride1: ").append(toIndentedString(needOverride1)).append("\n");
    sb.append("    needOverride2: ").append(toIndentedString(needOverride2)).append("\n");
    sb.append("    needOverride3: ").append(toIndentedString(needOverride3)).append("\n");
    sb.append("    needOverride4: ").append(toIndentedString(needOverride4)).append("\n");
    sb.append("    needOverride5: ").append(toIndentedString(needOverride5)).append("\n");
    sb.append("    authorizeToProcessCode: ").append(toIndentedString(authorizeToProcessCode)).append("\n");
    sb.append("    noOfWarningMessage: ").append(toIndentedString(noOfWarningMessage)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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
