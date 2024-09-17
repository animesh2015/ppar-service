package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnyIDRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class AnyIDRecord   {
  @JsonProperty("referenceNo")
  private String referenceNo = null;

  @JsonProperty("anyIDNo")
  private String anyIDNo = null;

  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("transactionStatus")
  private String transactionStatus = null;

  @JsonProperty("approveTime")
  private String approveTime = null;

  @JsonProperty("approveTeller")
  private String approveTeller = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("proxyValueForDisplay")
  private String proxyValueForDisplay = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("accountCodeForPersonal")
  private String accountCodeForPersonal = null;

  @JsonProperty("accountForTransferFromPersonal")
  private String accountForTransferFromPersonal = null;

  @JsonProperty("accountCodeForCommercial")
  private String accountCodeForCommercial = null;

  @JsonProperty("accountForTransferFromCommercial")
  private String accountForTransferFromCommercial = null;

  @JsonProperty("accountCodeForGovernment")
  private String accountCodeForGovernment = null;

  @JsonProperty("accountForTransferFromGovernment")
  private String accountForTransferFromGovernment = null;

  public AnyIDRecord referenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
    return this;
  }

  /**
   * REGIS,DEREGIS
   * @return referenceNo
   **/
  @Schema(example = "010124000051", description = "REGIS,DEREGIS")
      @NotNull

  @Size(max=14)   public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  public AnyIDRecord anyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
    return this;
  }

  /**
   * REGIS,DEREGIS
   * @return anyIDNo
   **/
  @Schema(example = "341556758678", description = "REGIS,DEREGIS")
      @NotNull

  @Size(max=19)   public String getAnyIDNo() {
    return anyIDNo;
  }

  public void setAnyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
  }

  public AnyIDRecord transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * REGIS,DEREGIS
   * @return transactionType
   **/
  @Schema(example = "DEREGIS", description = "REGIS,DEREGIS")
      @NotNull

  @Size(max=10)   public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public AnyIDRecord transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
   **/
  @Schema(example = "AP", description = "")
      @NotNull

  @Size(max=2)   public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public AnyIDRecord approveTime(String approveTime) {
    this.approveTime = approveTime;
    return this;
  }

  /**
   * Get approveTime
   * @return approveTime
   **/
  @Schema(example = "123000", description = "")
      @NotNull

  @Size(max=6)   public String getApproveTime() {
    return approveTime;
  }

  public void setApproveTime(String approveTime) {
    this.approveTime = approveTime;
  }

  public AnyIDRecord approveTeller(String approveTeller) {
    this.approveTeller = approveTeller;
    return this;
  }

  /**
   * Get approveTeller
   * @return approveTeller
   **/
  @Schema(example = "0000000002", description = "")
      @NotNull

  @Size(max=10)   public String getApproveTeller() {
    return approveTeller;
  }

  public void setApproveTeller(String approveTeller) {
    this.approveTeller = approveTeller;
  }

  public AnyIDRecord proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * MSISDN,NATID
   * @return proxyType
   **/
  @Schema(example = "MSISDN", description = "MSISDN,NATID")
      @NotNull

  @Size(max=12)   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public AnyIDRecord proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "0911112222", description = "")
      @NotNull

  @Size(max=100)   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public AnyIDRecord proxyValueForDisplay(String proxyValueForDisplay) {
    this.proxyValueForDisplay = proxyValueForDisplay;
    return this;
  }

  /**
   * Get proxyValueForDisplay
   * @return proxyValueForDisplay
   **/
  @Schema(example = "0911112222", description = "")
      @NotNull

  @Size(max=25)   public String getProxyValueForDisplay() {
    return proxyValueForDisplay;
  }

  public void setProxyValueForDisplay(String proxyValueForDisplay) {
    this.proxyValueForDisplay = proxyValueForDisplay;
  }

  public AnyIDRecord accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(example = "SA", description = "")
      @NotNull

  @Size(max=12)   public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AnyIDRecord accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(example = "1180000018", description = "")
      @NotNull

  @Size(max=20)   public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public AnyIDRecord accountCodeForPersonal(String accountCodeForPersonal) {
    this.accountCodeForPersonal = accountCodeForPersonal;
    return this;
  }

  /**
   * Get accountCodeForPersonal
   * @return accountCodeForPersonal
   **/
  @Schema(example = "P", description = "")
      @NotNull

  @Size(max=1)   public String getAccountCodeForPersonal() {
    return accountCodeForPersonal;
  }

  public void setAccountCodeForPersonal(String accountCodeForPersonal) {
    this.accountCodeForPersonal = accountCodeForPersonal;
  }

  public AnyIDRecord accountForTransferFromPersonal(String accountForTransferFromPersonal) {
    this.accountForTransferFromPersonal = accountForTransferFromPersonal;
    return this;
  }

  /**
   * Get accountForTransferFromPersonal
   * @return accountForTransferFromPersonal
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=20)   public String getAccountForTransferFromPersonal() {
    return accountForTransferFromPersonal;
  }

  public void setAccountForTransferFromPersonal(String accountForTransferFromPersonal) {
    this.accountForTransferFromPersonal = accountForTransferFromPersonal;
  }

  public AnyIDRecord accountCodeForCommercial(String accountCodeForCommercial) {
    this.accountCodeForCommercial = accountCodeForCommercial;
    return this;
  }

  /**
   * Get accountCodeForCommercial
   * @return accountCodeForCommercial
   **/
  @Schema(example = "C", description = "")
      @NotNull

  @Size(max=1)   public String getAccountCodeForCommercial() {
    return accountCodeForCommercial;
  }

  public void setAccountCodeForCommercial(String accountCodeForCommercial) {
    this.accountCodeForCommercial = accountCodeForCommercial;
  }

  public AnyIDRecord accountForTransferFromCommercial(String accountForTransferFromCommercial) {
    this.accountForTransferFromCommercial = accountForTransferFromCommercial;
    return this;
  }

  /**
   * Get accountForTransferFromCommercial
   * @return accountForTransferFromCommercial
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=20)   public String getAccountForTransferFromCommercial() {
    return accountForTransferFromCommercial;
  }

  public void setAccountForTransferFromCommercial(String accountForTransferFromCommercial) {
    this.accountForTransferFromCommercial = accountForTransferFromCommercial;
  }

  public AnyIDRecord accountCodeForGovernment(String accountCodeForGovernment) {
    this.accountCodeForGovernment = accountCodeForGovernment;
    return this;
  }

  /**
   * Get accountCodeForGovernment
   * @return accountCodeForGovernment
   **/
  @Schema(example = "G", description = "")
      @NotNull

  @Size(max=1)   public String getAccountCodeForGovernment() {
    return accountCodeForGovernment;
  }

  public void setAccountCodeForGovernment(String accountCodeForGovernment) {
    this.accountCodeForGovernment = accountCodeForGovernment;
  }

  public AnyIDRecord accountForTransferFromGovernment(String accountForTransferFromGovernment) {
    this.accountForTransferFromGovernment = accountForTransferFromGovernment;
    return this;
  }

  /**
   * Get accountForTransferFromGovernment
   * @return accountForTransferFromGovernment
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=20)   public String getAccountForTransferFromGovernment() {
    return accountForTransferFromGovernment;
  }

  public void setAccountForTransferFromGovernment(String accountForTransferFromGovernment) {
    this.accountForTransferFromGovernment = accountForTransferFromGovernment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyIDRecord anyIDRecord = (AnyIDRecord) o;
    return Objects.equals(this.referenceNo, anyIDRecord.referenceNo) &&
        Objects.equals(this.anyIDNo, anyIDRecord.anyIDNo) &&
        Objects.equals(this.transactionType, anyIDRecord.transactionType) &&
        Objects.equals(this.transactionStatus, anyIDRecord.transactionStatus) &&
        Objects.equals(this.approveTime, anyIDRecord.approveTime) &&
        Objects.equals(this.approveTeller, anyIDRecord.approveTeller) &&
        Objects.equals(this.proxyType, anyIDRecord.proxyType) &&
        Objects.equals(this.proxyValue, anyIDRecord.proxyValue) &&
        Objects.equals(this.proxyValueForDisplay, anyIDRecord.proxyValueForDisplay) &&
        Objects.equals(this.accountType, anyIDRecord.accountType) &&
        Objects.equals(this.accountValue, anyIDRecord.accountValue) &&
        Objects.equals(this.accountCodeForPersonal, anyIDRecord.accountCodeForPersonal) &&
        Objects.equals(this.accountForTransferFromPersonal, anyIDRecord.accountForTransferFromPersonal) &&
        Objects.equals(this.accountCodeForCommercial, anyIDRecord.accountCodeForCommercial) &&
        Objects.equals(this.accountForTransferFromCommercial, anyIDRecord.accountForTransferFromCommercial) &&
        Objects.equals(this.accountCodeForGovernment, anyIDRecord.accountCodeForGovernment) &&
        Objects.equals(this.accountForTransferFromGovernment, anyIDRecord.accountForTransferFromGovernment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNo, anyIDNo, transactionType, transactionStatus, approveTime, approveTeller, proxyType, proxyValue, proxyValueForDisplay, accountType, accountValue, accountCodeForPersonal, accountForTransferFromPersonal, accountCodeForCommercial, accountForTransferFromCommercial, accountCodeForGovernment, accountForTransferFromGovernment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyIDRecord {\n");
    
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    anyIDNo: ").append(toIndentedString(anyIDNo)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    approveTime: ").append(toIndentedString(approveTime)).append("\n");
    sb.append("    approveTeller: ").append(toIndentedString(approveTeller)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    proxyValueForDisplay: ").append(toIndentedString(proxyValueForDisplay)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    accountCodeForPersonal: ").append(toIndentedString(accountCodeForPersonal)).append("\n");
    sb.append("    accountForTransferFromPersonal: ").append(toIndentedString(accountForTransferFromPersonal)).append("\n");
    sb.append("    accountCodeForCommercial: ").append(toIndentedString(accountCodeForCommercial)).append("\n");
    sb.append("    accountForTransferFromCommercial: ").append(toIndentedString(accountForTransferFromCommercial)).append("\n");
    sb.append("    accountCodeForGovernment: ").append(toIndentedString(accountCodeForGovernment)).append("\n");
    sb.append("    accountForTransferFromGovernment: ").append(toIndentedString(accountForTransferFromGovernment)).append("\n");
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
