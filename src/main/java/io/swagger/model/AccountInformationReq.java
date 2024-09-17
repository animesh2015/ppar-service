package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountInformationReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class AccountInformationReq   {
  @JsonProperty("jointFlag")
  private String jointFlag = null;

  @JsonProperty("pC")
  private String pC = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountStatusCode")
  private String accountStatusCode = null;

  @JsonProperty("accountStatusDesc")
  private String accountStatusDesc = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountIdType")
  private String accountIdType = null;

  @JsonProperty("accountIdNo")
  private String accountIdNo = null;

  @JsonProperty("cTOfAccount")
  private String cTOfAccount = null;

  @JsonProperty("holdAllFundFlag")
  private String holdAllFundFlag = null;

  public AccountInformationReq jointFlag(String jointFlag) {
    this.jointFlag = jointFlag;
    return this;
  }

  /**
   * possible values = Y, N
   * @return jointFlag
   **/
  @Schema(example = "N", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getJointFlag() {
    return jointFlag;
  }

  public void setJointFlag(String jointFlag) {
    this.jointFlag = jointFlag;
  }

  public AccountInformationReq pC(String pC) {
    this.pC = pC;
    return this;
  }

  /**
   * possible values = P, C
   * @return pC
   **/
  @Schema(example = "P", description = "possible values = P, C")
      @NotNull

  @Pattern(regexp="|P|C")   public String getPC() {
    return pC;
  }

  public void setPC(String pC) {
    this.pC = pC;
  }

  public AccountInformationReq currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   **/
  @Schema(example = "THB", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{3}")   public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AccountInformationReq accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * possible values = SA, SS, CA
   * @return accountType
   **/
  @Schema(example = "SA", description = "possible values = SA, SS, CA")
      @NotNull

    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountInformationReq accountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
    return this;
  }

  /**
   * Get accountStatusCode
   * @return accountStatusCode
   **/
  @Schema(example = "00", description = "")
      @NotNull

  @Pattern(regexp="|[0-9]{1,2}")   public String getAccountStatusCode() {
    return accountStatusCode;
  }

  public void setAccountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
  }

  public AccountInformationReq accountStatusDesc(String accountStatusDesc) {
    this.accountStatusDesc = accountStatusDesc;
    return this;
  }

  /**
   * Get accountStatusDesc
   * @return accountStatusDesc
   **/
  @Schema(example = "Active", description = "")
      @NotNull

  @Size(max=15)   public String getAccountStatusDesc() {
    return accountStatusDesc;
  }

  public void setAccountStatusDesc(String accountStatusDesc) {
    this.accountStatusDesc = accountStatusDesc;
  }

  public AccountInformationReq accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   **/
  @Schema(example = "นายตั้งตรง มีนา", description = "")
      @NotNull

  @Size(max=80)   public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountInformationReq accountIdType(String accountIdType) {
    this.accountIdType = accountIdType;
    return this;
  }

  /**
   * Get accountIdType
   * @return accountIdType
   **/
  @Schema(description = "")
      @NotNull

    public String getAccountIdType() {
    return accountIdType;
  }

  public void setAccountIdType(String accountIdType) {
    this.accountIdType = accountIdType;
  }

  public AccountInformationReq accountIdNo(String accountIdNo) {
    this.accountIdNo = accountIdNo;
    return this;
  }

  /**
   * Get accountIdNo
   * @return accountIdNo
   **/
  @Schema(example = "1180000018", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getAccountIdNo() {
    return accountIdNo;
  }

  public void setAccountIdNo(String accountIdNo) {
    this.accountIdNo = accountIdNo;
  }

  public AccountInformationReq cTOfAccount(String cTOfAccount) {
    this.cTOfAccount = cTOfAccount;
    return this;
  }

  /**
   * Get cTOfAccount
   * @return cTOfAccount
   **/
  @Schema(example = "09", description = "")
      @NotNull

  @Pattern(regexp="|[0-9]{1,2}")   public String getCTOfAccount() {
    return cTOfAccount;
  }

  public void setCTOfAccount(String cTOfAccount) {
    this.cTOfAccount = cTOfAccount;
  }

  public AccountInformationReq holdAllFundFlag(String holdAllFundFlag) {
    this.holdAllFundFlag = holdAllFundFlag;
    return this;
  }

  /**
   * possible values = Y, N
   * @return holdAllFundFlag
   **/
  @Schema(example = "Y", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getHoldAllFundFlag() {
    return holdAllFundFlag;
  }

  public void setHoldAllFundFlag(String holdAllFundFlag) {
    this.holdAllFundFlag = holdAllFundFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInformationReq accountInformationReq = (AccountInformationReq) o;
    return Objects.equals(this.jointFlag, accountInformationReq.jointFlag) &&
        Objects.equals(this.pC, accountInformationReq.pC) &&
        Objects.equals(this.currencyCode, accountInformationReq.currencyCode) &&
        Objects.equals(this.accountType, accountInformationReq.accountType) &&
        Objects.equals(this.accountStatusCode, accountInformationReq.accountStatusCode) &&
        Objects.equals(this.accountStatusDesc, accountInformationReq.accountStatusDesc) &&
        Objects.equals(this.accountName, accountInformationReq.accountName) &&
        Objects.equals(this.accountIdType, accountInformationReq.accountIdType) &&
        Objects.equals(this.accountIdNo, accountInformationReq.accountIdNo) &&
        Objects.equals(this.cTOfAccount, accountInformationReq.cTOfAccount) &&
        Objects.equals(this.holdAllFundFlag, accountInformationReq.holdAllFundFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jointFlag, pC, currencyCode, accountType, accountStatusCode, accountStatusDesc, accountName, accountIdType, accountIdNo, cTOfAccount, holdAllFundFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformationReq {\n");
    
    sb.append("    jointFlag: ").append(toIndentedString(jointFlag)).append("\n");
    sb.append("    pC: ").append(toIndentedString(pC)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatusCode: ").append(toIndentedString(accountStatusCode)).append("\n");
    sb.append("    accountStatusDesc: ").append(toIndentedString(accountStatusDesc)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountIdType: ").append(toIndentedString(accountIdType)).append("\n");
    sb.append("    accountIdNo: ").append(toIndentedString(accountIdNo)).append("\n");
    sb.append("    cTOfAccount: ").append(toIndentedString(cTOfAccount)).append("\n");
    sb.append("    holdAllFundFlag: ").append(toIndentedString(holdAllFundFlag)).append("\n");
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
