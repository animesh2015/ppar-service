package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class AccountInformation   {
  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("errorIndicator")
  private String errorIndicator = null;

  @JsonProperty("accountID")
  private String accountID = null;

  @JsonProperty("accountControls")
  private String accountControls = null;

  @JsonProperty("accountNo")
  private String accountNo = null;

  @JsonProperty("accountThaiName")
  private String accountThaiName = null;

  @JsonProperty("accountEngName")
  private String accountEngName = null;

  @JsonProperty("accountIDType")
  private String accountIDType = null;

  @JsonProperty("accountIDNumber")
  private String accountIDNumber = null;

  @JsonProperty("accountStatusCode")
  private String accountStatusCode = null;

  @JsonProperty("accountStatusDescription")
  private String accountStatusDescription = null;

  @JsonProperty("accountPC")
  private String accountPC = null;

  @JsonProperty("filler1")
  private String filler1 = null;

  @JsonProperty("customerThaiName")
  private String customerThaiName = null;

  @JsonProperty("customerEngName")
  private String customerEngName = null;

  @JsonProperty("filler")
  private String filler = null;

  @JsonProperty("itmxFlag")
  private String itmxFlag = null;

  public AccountInformation bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Get bankCode
   * @return bankCode
   **/
  @Schema(example = "002", description = "")
      @NotNull

    public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public AccountInformation errorIndicator(String errorIndicator) {
    this.errorIndicator = errorIndicator;
    return this;
  }

  /**
   * Get errorIndicator
   * @return errorIndicator
   **/
  @Schema(description = "")
      @NotNull

    public String getErrorIndicator() {
    return errorIndicator;
  }

  public void setErrorIndicator(String errorIndicator) {
    this.errorIndicator = errorIndicator;
  }

  public AccountInformation accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

  /**
   * Get accountID
   * @return accountID
   **/
  @Schema(example = "IM", description = "")
      @NotNull

    public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public AccountInformation accountControls(String accountControls) {
    this.accountControls = accountControls;
    return this;
  }

  /**
   * Get accountControls
   * @return accountControls
   **/
  @Schema(example = "21112220000", description = "")
      @NotNull

    public String getAccountControls() {
    return accountControls;
  }

  public void setAccountControls(String accountControls) {
    this.accountControls = accountControls;
  }

  public AccountInformation accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
   **/
  @Schema(example = "021112220005", description = "")
      @NotNull

    public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public AccountInformation accountThaiName(String accountThaiName) {
    this.accountThaiName = accountThaiName;
    return this;
  }

  /**
   * Get accountThaiName
   * @return accountThaiName
   **/
  @Schema(example = "นาย อุดม น้ำ", description = "")
      @NotNull

    public String getAccountThaiName() {
    return accountThaiName;
  }

  public void setAccountThaiName(String accountThaiName) {
    this.accountThaiName = accountThaiName;
  }

  public AccountInformation accountEngName(String accountEngName) {
    this.accountEngName = accountEngName;
    return this;
  }

  /**
   * Get accountEngName
   * @return accountEngName
   **/
  @Schema(example = "Mrs. Audom Namjai", description = "")
      @NotNull

    public String getAccountEngName() {
    return accountEngName;
  }

  public void setAccountEngName(String accountEngName) {
    this.accountEngName = accountEngName;
  }

  public AccountInformation accountIDType(String accountIDType) {
    this.accountIDType = accountIDType;
    return this;
  }

  /**
   * Get accountIDType
   * @return accountIDType
   **/
  @Schema(example = "CA", description = "")
      @NotNull

    public String getAccountIDType() {
    return accountIDType;
  }

  public void setAccountIDType(String accountIDType) {
    this.accountIDType = accountIDType;
  }

  public AccountInformation accountIDNumber(String accountIDNumber) {
    this.accountIDNumber = accountIDNumber;
    return this;
  }

  /**
   * Get accountIDNumber
   * @return accountIDNumber
   **/
  @Schema(example = "6891024746820", description = "")
      @NotNull

    public String getAccountIDNumber() {
    return accountIDNumber;
  }

  public void setAccountIDNumber(String accountIDNumber) {
    this.accountIDNumber = accountIDNumber;
  }

  public AccountInformation accountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
    return this;
  }

  /**
   * Get accountStatusCode
   * @return accountStatusCode
   **/
  @Schema(example = "00", description = "")
      @NotNull

    public String getAccountStatusCode() {
    return accountStatusCode;
  }

  public void setAccountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
  }

  public AccountInformation accountStatusDescription(String accountStatusDescription) {
    this.accountStatusDescription = accountStatusDescription;
    return this;
  }

  /**
   * Get accountStatusDescription
   * @return accountStatusDescription
   **/
  @Schema(example = "Active", description = "")
      @NotNull

    public String getAccountStatusDescription() {
    return accountStatusDescription;
  }

  public void setAccountStatusDescription(String accountStatusDescription) {
    this.accountStatusDescription = accountStatusDescription;
  }

  public AccountInformation accountPC(String accountPC) {
    this.accountPC = accountPC;
    return this;
  }

  /**
   * Get accountPC
   * @return accountPC
   **/
  @Schema(example = "P", description = "")
      @NotNull

    public String getAccountPC() {
    return accountPC;
  }

  public void setAccountPC(String accountPC) {
    this.accountPC = accountPC;
  }

  public AccountInformation filler1(String filler1) {
    this.filler1 = filler1;
    return this;
  }

  /**
   * Get filler1
   * @return filler1
   **/
  @Schema(description = "")
      @NotNull

    public String getFiller1() {
    return filler1;
  }

  public void setFiller1(String filler1) {
    this.filler1 = filler1;
  }

  public AccountInformation customerThaiName(String customerThaiName) {
    this.customerThaiName = customerThaiName;
    return this;
  }

  /**
   * Get customerThaiName
   * @return customerThaiName
   **/
  @Schema(example = "นาย อุดม น้ำใจ", description = "")
      @NotNull

    public String getCustomerThaiName() {
    return customerThaiName;
  }

  public void setCustomerThaiName(String customerThaiName) {
    this.customerThaiName = customerThaiName;
  }

  public AccountInformation customerEngName(String customerEngName) {
    this.customerEngName = customerEngName;
    return this;
  }

  /**
   * Get customerEngName
   * @return customerEngName
   **/
  @Schema(example = "Mrs. Audom Namjai", description = "")
      @NotNull

    public String getCustomerEngName() {
    return customerEngName;
  }

  public void setCustomerEngName(String customerEngName) {
    this.customerEngName = customerEngName;
  }

  public AccountInformation filler(String filler) {
    this.filler = filler;
    return this;
  }

  /**
   * Get filler
   * @return filler
   **/
  @Schema(description = "")
      @NotNull

    public String getFiller() {
    return filler;
  }

  public void setFiller(String filler) {
    this.filler = filler;
  }

  public AccountInformation itmxFlag(String itmxFlag) {
    this.itmxFlag = itmxFlag;
    return this;
  }

  /**
   * Get itmxFlag
   * @return itmxFlag
   **/
  @Schema(example = " ", description = "")
      @NotNull

    public String getItmxFlag() {
    return itmxFlag;
  }

  public void setItmxFlag(String itmxFlag) {
    this.itmxFlag = itmxFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInformation accountInformation = (AccountInformation) o;
    return Objects.equals(this.bankCode, accountInformation.bankCode) &&
        Objects.equals(this.errorIndicator, accountInformation.errorIndicator) &&
        Objects.equals(this.accountID, accountInformation.accountID) &&
        Objects.equals(this.accountControls, accountInformation.accountControls) &&
        Objects.equals(this.accountNo, accountInformation.accountNo) &&
        Objects.equals(this.accountThaiName, accountInformation.accountThaiName) &&
        Objects.equals(this.accountEngName, accountInformation.accountEngName) &&
        Objects.equals(this.accountIDType, accountInformation.accountIDType) &&
        Objects.equals(this.accountIDNumber, accountInformation.accountIDNumber) &&
        Objects.equals(this.accountStatusCode, accountInformation.accountStatusCode) &&
        Objects.equals(this.accountStatusDescription, accountInformation.accountStatusDescription) &&
        Objects.equals(this.accountPC, accountInformation.accountPC) &&
        Objects.equals(this.filler1, accountInformation.filler1) &&
        Objects.equals(this.customerThaiName, accountInformation.customerThaiName) &&
        Objects.equals(this.customerEngName, accountInformation.customerEngName) &&
        Objects.equals(this.filler, accountInformation.filler) &&
        Objects.equals(this.itmxFlag, accountInformation.itmxFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, errorIndicator, accountID, accountControls, accountNo, accountThaiName, accountEngName, accountIDType, accountIDNumber, accountStatusCode, accountStatusDescription, accountPC, filler1, customerThaiName, customerEngName, filler, itmxFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformation {\n");
    
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    errorIndicator: ").append(toIndentedString(errorIndicator)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountControls: ").append(toIndentedString(accountControls)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountThaiName: ").append(toIndentedString(accountThaiName)).append("\n");
    sb.append("    accountEngName: ").append(toIndentedString(accountEngName)).append("\n");
    sb.append("    accountIDType: ").append(toIndentedString(accountIDType)).append("\n");
    sb.append("    accountIDNumber: ").append(toIndentedString(accountIDNumber)).append("\n");
    sb.append("    accountStatusCode: ").append(toIndentedString(accountStatusCode)).append("\n");
    sb.append("    accountStatusDescription: ").append(toIndentedString(accountStatusDescription)).append("\n");
    sb.append("    accountPC: ").append(toIndentedString(accountPC)).append("\n");
    sb.append("    filler1: ").append(toIndentedString(filler1)).append("\n");
    sb.append("    customerThaiName: ").append(toIndentedString(customerThaiName)).append("\n");
    sb.append("    customerEngName: ").append(toIndentedString(customerEngName)).append("\n");
    sb.append("    filler: ").append(toIndentedString(filler)).append("\n");
    sb.append("    itmxFlag: ").append(toIndentedString(itmxFlag)).append("\n");
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
