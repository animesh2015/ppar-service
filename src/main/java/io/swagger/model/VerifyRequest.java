package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VerifyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class VerifyRequest   {
  @JsonProperty("requiredRequestOTP")
  private String requiredRequestOTP = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("searchBy")
  private String searchBy = null;

  @JsonProperty("rMNo")
  private String rMNo = null;

  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("applicationNo")
  private String applicationNo = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("idType")
  private String idType = null;

  @JsonProperty("byPassCheckProxy")
  private String byPassCheckProxy = null;

  @JsonProperty("accountForTransferFromPersonal")
  private String accountForTransferFromPersonal = null;

  @JsonProperty("accountForTransferFromCommercial")
  private String accountForTransferFromCommercial = null;

  @JsonProperty("accountForTransferFromGovermment")
  private String accountForTransferFromGovermment = null;

  @JsonProperty("allocationCode")
  private String allocationCode = null;

  public VerifyRequest requiredRequestOTP(String requiredRequestOTP) {
    this.requiredRequestOTP = requiredRequestOTP;
    return this;
  }

  /**
   * possible values = Y, N
   * @return requiredRequestOTP
   **/
  @Schema(example = "N", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getRequiredRequestOTP() {
    return requiredRequestOTP;
  }

  public void setRequiredRequestOTP(String requiredRequestOTP) {
    this.requiredRequestOTP = requiredRequestOTP;
  }

  public VerifyRequest language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(example = "TH", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{2}")   public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public VerifyRequest mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
   **/
  @Schema(example = "0888888888", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10}")   public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public VerifyRequest searchBy(String searchBy) {
    this.searchBy = searchBy;
    return this;
  }

  /**
   * possible values = 1, 2
   * @return searchBy
   **/
  @Schema(example = "1", required = true, description = "possible values = 1, 2")
      @NotNull

  @Pattern(regexp="1|2")   public String getSearchBy() {
    return searchBy;
  }

  public void setSearchBy(String searchBy) {
    this.searchBy = searchBy;
  }

  public VerifyRequest rMNo(String rMNo) {
    this.rMNo = rMNo;
    return this;
  }

  /**
   * Get rMNo
   * @return rMNo
   **/
  @Schema(example = "42255233225", description = "")
      @NotNull

  @Pattern(regexp="|\\d{14}")   public String getRMNo() {
    return rMNo;
  }

  public void setRMNo(String rMNo) {
    this.rMNo = rMNo;
  }

  public VerifyRequest applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * possible values = IB, CC, DB, ST, IM, AD
   * @return applicationId
   **/
  @Schema(example = "IB", description = "possible values = IB, CC, DB, ST, IM, AD")
      @NotNull

  @Pattern(regexp="IB|CC|DB|ST|IM|AD")   public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public VerifyRequest applicationNo(String applicationNo) {
    this.applicationNo = applicationNo;
    return this;
  }

  /**
   * Get applicationNo
   * @return applicationNo
   **/
  @Schema(example = "0000202306150001", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,27}")   public String getApplicationNo() {
    return applicationNo;
  }

  public void setApplicationNo(String applicationNo) {
    this.applicationNo = applicationNo;
  }

  public VerifyRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * possible values = NATID, MSISDN
   * @return proxyType
   **/
  @Schema(example = "NATID", required = true, description = "possible values = NATID, MSISDN")
      @NotNull

  @Pattern(regexp="NATID|MSISDN")   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public VerifyRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * ID No ,Mobile No.
   * @return proxyValue
   **/
  @Schema(example = "1521100115555", required = true, description = "ID No ,Mobile No.")
      @NotNull

  @Pattern(regexp="\\d{10,20}")   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public VerifyRequest accountType(String accountType) {
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

  public VerifyRequest accountValue(String accountValue) {
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

  public VerifyRequest idType(String idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   **/
  @Schema(example = "CI", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{2}")   public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public VerifyRequest byPassCheckProxy(String byPassCheckProxy) {
    this.byPassCheckProxy = byPassCheckProxy;
    return this;
  }

  /**
   * possible values = Y, N
   * @return byPassCheckProxy
   **/
  @Schema(example = "Y", description = "possible values = Y, N")
      @NotNull

  @Pattern(regexp="|Y|N")   public String getByPassCheckProxy() {
    return byPassCheckProxy;
  }

  public void setByPassCheckProxy(String byPassCheckProxy) {
    this.byPassCheckProxy = byPassCheckProxy;
  }

  public VerifyRequest accountForTransferFromPersonal(String accountForTransferFromPersonal) {
    this.accountForTransferFromPersonal = accountForTransferFromPersonal;
    return this;
  }

  /**
   * Get accountForTransferFromPersonal
   * @return accountForTransferFromPersonal
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getAccountForTransferFromPersonal() {
    return accountForTransferFromPersonal;
  }

  public void setAccountForTransferFromPersonal(String accountForTransferFromPersonal) {
    this.accountForTransferFromPersonal = accountForTransferFromPersonal;
  }

  public VerifyRequest accountForTransferFromCommercial(String accountForTransferFromCommercial) {
    this.accountForTransferFromCommercial = accountForTransferFromCommercial;
    return this;
  }

  /**
   * Get accountForTransferFromCommercial
   * @return accountForTransferFromCommercial
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getAccountForTransferFromCommercial() {
    return accountForTransferFromCommercial;
  }

  public void setAccountForTransferFromCommercial(String accountForTransferFromCommercial) {
    this.accountForTransferFromCommercial = accountForTransferFromCommercial;
  }

  public VerifyRequest accountForTransferFromGovermment(String accountForTransferFromGovermment) {
    this.accountForTransferFromGovermment = accountForTransferFromGovermment;
    return this;
  }

  /**
   * Get accountForTransferFromGovermment
   * @return accountForTransferFromGovermment
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getAccountForTransferFromGovermment() {
    return accountForTransferFromGovermment;
  }

  public void setAccountForTransferFromGovermment(String accountForTransferFromGovermment) {
    this.accountForTransferFromGovermment = accountForTransferFromGovermment;
  }

  public VerifyRequest allocationCode(String allocationCode) {
    this.allocationCode = allocationCode;
    return this;
  }

  /**
   * Get allocationCode
   * @return allocationCode
   **/
  @Schema(example = "B010101245789", description = "")
      @NotNull

  @Pattern(regexp="|[a-zA-Z]{1}+\\d{12}")   public String getAllocationCode() {
    return allocationCode;
  }

  public void setAllocationCode(String allocationCode) {
    this.allocationCode = allocationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyRequest verifyRequest = (VerifyRequest) o;
    return Objects.equals(this.requiredRequestOTP, verifyRequest.requiredRequestOTP) &&
        Objects.equals(this.language, verifyRequest.language) &&
        Objects.equals(this.mobileNo, verifyRequest.mobileNo) &&
        Objects.equals(this.searchBy, verifyRequest.searchBy) &&
        Objects.equals(this.rMNo, verifyRequest.rMNo) &&
        Objects.equals(this.applicationId, verifyRequest.applicationId) &&
        Objects.equals(this.applicationNo, verifyRequest.applicationNo) &&
        Objects.equals(this.proxyType, verifyRequest.proxyType) &&
        Objects.equals(this.proxyValue, verifyRequest.proxyValue) &&
        Objects.equals(this.accountType, verifyRequest.accountType) &&
        Objects.equals(this.accountValue, verifyRequest.accountValue) &&
        Objects.equals(this.idType, verifyRequest.idType) &&
        Objects.equals(this.byPassCheckProxy, verifyRequest.byPassCheckProxy) &&
        Objects.equals(this.accountForTransferFromPersonal, verifyRequest.accountForTransferFromPersonal) &&
        Objects.equals(this.accountForTransferFromCommercial, verifyRequest.accountForTransferFromCommercial) &&
        Objects.equals(this.accountForTransferFromGovermment, verifyRequest.accountForTransferFromGovermment) &&
        Objects.equals(this.allocationCode, verifyRequest.allocationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredRequestOTP, language, mobileNo, searchBy, rMNo, applicationId, applicationNo, proxyType, proxyValue, accountType, accountValue, idType, byPassCheckProxy, accountForTransferFromPersonal, accountForTransferFromCommercial, accountForTransferFromGovermment, allocationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyRequest {\n");
    
    sb.append("    requiredRequestOTP: ").append(toIndentedString(requiredRequestOTP)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    searchBy: ").append(toIndentedString(searchBy)).append("\n");
    sb.append("    rMNo: ").append(toIndentedString(rMNo)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationNo: ").append(toIndentedString(applicationNo)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    byPassCheckProxy: ").append(toIndentedString(byPassCheckProxy)).append("\n");
    sb.append("    accountForTransferFromPersonal: ").append(toIndentedString(accountForTransferFromPersonal)).append("\n");
    sb.append("    accountForTransferFromCommercial: ").append(toIndentedString(accountForTransferFromCommercial)).append("\n");
    sb.append("    accountForTransferFromGovermment: ").append(toIndentedString(accountForTransferFromGovermment)).append("\n");
    sb.append("    allocationCode: ").append(toIndentedString(allocationCode)).append("\n");
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
