package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class CustomerInformation   {
  @JsonProperty("rmNo")
  private String rmNo = null;

  @JsonProperty("idType")
  private String idType = null;

  @JsonProperty("idNo")
  private String idNo = null;

  @JsonProperty("pC")
  private String pC = null;

  @JsonProperty("customerPrefix")
  private String customerPrefix = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("concatenationName")
  private String concatenationName = null;

  @JsonProperty("cT")
  private String cT = null;

  @JsonProperty("riskLevel")
  private String riskLevel = null;

  @JsonProperty("riskReasonCode")
  private String riskReasonCode = null;

  @JsonProperty("goodGuyFlag")
  private String goodGuyFlag = null;

  @JsonProperty("correctAllocationCodeFlag")
  private String correctAllocationCodeFlag = null;

  @JsonProperty("accountRelateWithCustomerFlag")
  private String accountRelateWithCustomerFlag = null;

  public CustomerInformation rmNo(String rmNo) {
    this.rmNo = rmNo;
    return this;
  }

  /**
   * Get rmNo
   * @return rmNo
   **/
  @Schema(example = "00000012459874", description = "")
      @NotNull

  @Pattern(regexp="|\\d{14}")   public String getRmNo() {
    return rmNo;
  }

  public void setRmNo(String rmNo) {
    this.rmNo = rmNo;
  }

  public CustomerInformation idType(String idType) {
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

  public CustomerInformation idNo(String idNo) {
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

  public CustomerInformation pC(String pC) {
    this.pC = pC;
    return this;
  }

  /**
   * possible values = P, C
   * @return pC
   **/
  @Schema(example = "P", description = "possible values = P, C")
      @NotNull

  @Pattern(regexp="P|C")   public String getPC() {
    return pC;
  }

  public void setPC(String pC) {
    this.pC = pC;
  }

  public CustomerInformation customerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
    return this;
  }

  /**
   * Get customerPrefix
   * @return customerPrefix
   **/
  @Schema(example = "นาย", required = true, description = "")
      @NotNull

  @Size(min=1,max=25)   public String getCustomerPrefix() {
    return customerPrefix;
  }

  public void setCustomerPrefix(String customerPrefix) {
    this.customerPrefix = customerPrefix;
  }

  public CustomerInformation customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
   **/
  @Schema(example = "ตั้งตรง มีนา", required = true, description = "")
      @NotNull

  @Size(min=1,max=80)   public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CustomerInformation concatenationName(String concatenationName) {
    this.concatenationName = concatenationName;
    return this;
  }

  /**
   * Get concatenationName
   * @return concatenationName
   **/
  @Schema(example = "นายตั้งตรง มีนา", description = "")
      @NotNull

  @Size(min=1,max=80)   public String getConcatenationName() {
    return concatenationName;
  }

  public void setConcatenationName(String concatenationName) {
    this.concatenationName = concatenationName;
  }

  public CustomerInformation cT(String cT) {
    this.cT = cT;
    return this;
  }

  /**
   * Get cT
   * @return cT
   **/
  @Schema(example = "09", description = "")
      @NotNull

  @Pattern(regexp="|[0-9]{1,2}")   public String getCT() {
    return cT;
  }

  public void setCT(String cT) {
    this.cT = cT;
  }

  public CustomerInformation riskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * Get riskLevel
   * @return riskLevel
   **/
  @Schema(example = "1", description = "")
      @NotNull

  @Pattern(regexp="|1|2|3")   public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

  public CustomerInformation riskReasonCode(String riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
    return this;
  }

  /**
   * Get riskReasonCode
   * @return riskReasonCode
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{1}")   public String getRiskReasonCode() {
    return riskReasonCode;
  }

  public void setRiskReasonCode(String riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  public CustomerInformation goodGuyFlag(String goodGuyFlag) {
    this.goodGuyFlag = goodGuyFlag;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return goodGuyFlag
   **/
  @Schema(description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getGoodGuyFlag() {
    return goodGuyFlag;
  }

  public void setGoodGuyFlag(String goodGuyFlag) {
    this.goodGuyFlag = goodGuyFlag;
  }

  public CustomerInformation correctAllocationCodeFlag(String correctAllocationCodeFlag) {
    this.correctAllocationCodeFlag = correctAllocationCodeFlag;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return correctAllocationCodeFlag
   **/
  @Schema(example = "Y", description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getCorrectAllocationCodeFlag() {
    return correctAllocationCodeFlag;
  }

  public void setCorrectAllocationCodeFlag(String correctAllocationCodeFlag) {
    this.correctAllocationCodeFlag = correctAllocationCodeFlag;
  }

  public CustomerInformation accountRelateWithCustomerFlag(String accountRelateWithCustomerFlag) {
    this.accountRelateWithCustomerFlag = accountRelateWithCustomerFlag;
    return this;
  }

  /**
   * possible values = '', ' ',Y, N
   * @return accountRelateWithCustomerFlag
   **/
  @Schema(example = "Y", description = "possible values = '', ' ',Y, N")
      @NotNull

  @Pattern(regexp="| |Y|N")   public String getAccountRelateWithCustomerFlag() {
    return accountRelateWithCustomerFlag;
  }

  public void setAccountRelateWithCustomerFlag(String accountRelateWithCustomerFlag) {
    this.accountRelateWithCustomerFlag = accountRelateWithCustomerFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInformation customerInformation = (CustomerInformation) o;
    return Objects.equals(this.rmNo, customerInformation.rmNo) &&
        Objects.equals(this.idType, customerInformation.idType) &&
        Objects.equals(this.idNo, customerInformation.idNo) &&
        Objects.equals(this.pC, customerInformation.pC) &&
        Objects.equals(this.customerPrefix, customerInformation.customerPrefix) &&
        Objects.equals(this.customerName, customerInformation.customerName) &&
        Objects.equals(this.concatenationName, customerInformation.concatenationName) &&
        Objects.equals(this.cT, customerInformation.cT) &&
        Objects.equals(this.riskLevel, customerInformation.riskLevel) &&
        Objects.equals(this.riskReasonCode, customerInformation.riskReasonCode) &&
        Objects.equals(this.goodGuyFlag, customerInformation.goodGuyFlag) &&
        Objects.equals(this.correctAllocationCodeFlag, customerInformation.correctAllocationCodeFlag) &&
        Objects.equals(this.accountRelateWithCustomerFlag, customerInformation.accountRelateWithCustomerFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rmNo, idType, idNo, pC, customerPrefix, customerName, concatenationName, cT, riskLevel, riskReasonCode, goodGuyFlag, correctAllocationCodeFlag, accountRelateWithCustomerFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInformation {\n");
    
    sb.append("    rmNo: ").append(toIndentedString(rmNo)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idNo: ").append(toIndentedString(idNo)).append("\n");
    sb.append("    pC: ").append(toIndentedString(pC)).append("\n");
    sb.append("    customerPrefix: ").append(toIndentedString(customerPrefix)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    concatenationName: ").append(toIndentedString(concatenationName)).append("\n");
    sb.append("    cT: ").append(toIndentedString(cT)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    riskReasonCode: ").append(toIndentedString(riskReasonCode)).append("\n");
    sb.append("    goodGuyFlag: ").append(toIndentedString(goodGuyFlag)).append("\n");
    sb.append("    correctAllocationCodeFlag: ").append(toIndentedString(correctAllocationCodeFlag)).append("\n");
    sb.append("    accountRelateWithCustomerFlag: ").append(toIndentedString(accountRelateWithCustomerFlag)).append("\n");
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
