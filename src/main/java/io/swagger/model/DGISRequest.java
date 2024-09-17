package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DGISRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DGISRequest   {
  @JsonProperty("bblRegistrationId")
  private String bblRegistrationId = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("applicationIdOfDeRegistrationCustomerId")
  private String applicationIdOfDeRegistrationCustomerId = null;

  @JsonProperty("deRegistrationCustomerId")
  private String deRegistrationCustomerId = null;

  @JsonProperty("pC")
  private String pC = null;

  @JsonProperty("accountOwnerBranch")
  private String accountOwnerBranch = null;

  public DGISRequest bblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
    return this;
  }

  /**
   * Get bblRegistrationId
   * @return bblRegistrationId
   **/
  @Schema(example = "000002101043", description = "")
      @NotNull

  @Pattern(regexp="\\d{12}")   public String getBblRegistrationId() {
    return bblRegistrationId;
  }

  public void setBblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
  }

  public DGISRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * MSISDN : MOBILE, NATID :  NATIONAL ID (Personal) TAX (Commercial)
   * @return proxyType
   **/
  @Schema(example = "MSISDN", required = true, description = "MSISDN : MOBILE, NATID :  NATIONAL ID (Personal) TAX (Commercial)")
      @NotNull

  @Pattern(regexp="NATID|MSISDN")   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public DGISRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "+66813334444", required = true, description = "")
      @NotNull

  @Pattern(regexp="\\d{10,20}")   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public DGISRequest accountType(String accountType) {
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

  public DGISRequest accountValue(String accountValue) {
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

  public DGISRequest applicationIdOfDeRegistrationCustomerId(String applicationIdOfDeRegistrationCustomerId) {
    this.applicationIdOfDeRegistrationCustomerId = applicationIdOfDeRegistrationCustomerId;
    return this;
  }

  /**
   * possible values = RM, IB, DB, CC
   * @return applicationIdOfDeRegistrationCustomerId
   **/
  @Schema(example = "RM", description = "possible values = RM, IB, DB, CC")
      @NotNull

  @Pattern(regexp="|RM|IB|DB|CC")   public String getApplicationIdOfDeRegistrationCustomerId() {
    return applicationIdOfDeRegistrationCustomerId;
  }

  public void setApplicationIdOfDeRegistrationCustomerId(String applicationIdOfDeRegistrationCustomerId) {
    this.applicationIdOfDeRegistrationCustomerId = applicationIdOfDeRegistrationCustomerId;
  }

  public DGISRequest deRegistrationCustomerId(String deRegistrationCustomerId) {
    this.deRegistrationCustomerId = deRegistrationCustomerId;
    return this;
  }

  /**
   * Get deRegistrationCustomerId
   * @return deRegistrationCustomerId
   **/
  @Schema(example = "00000012549876", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10,20}")   public String getDeRegistrationCustomerId() {
    return deRegistrationCustomerId;
  }

  public void setDeRegistrationCustomerId(String deRegistrationCustomerId) {
    this.deRegistrationCustomerId = deRegistrationCustomerId;
  }

  public DGISRequest pC(String pC) {
    this.pC = pC;
    return this;
  }

  /**
   * C    : Commercial, ‘ ‘,P : Personal 
   * @return pC
   **/
  @Schema(example = "P", description = "C    : Commercial, ‘ ‘,P : Personal ")
      @NotNull

  @Pattern(regexp="|P|C")   public String getPC() {
    return pC;
  }

  public void setPC(String pC) {
    this.pC = pC;
  }

  public DGISRequest accountOwnerBranch(String accountOwnerBranch) {
    this.accountOwnerBranch = accountOwnerBranch;
    return this;
  }

  /**
   * Get accountOwnerBranch
   * @return accountOwnerBranch
   **/
  @Schema(example = "0101", description = "")
      @NotNull

  @Pattern(regexp="|\\d{4}")   public String getAccountOwnerBranch() {
    return accountOwnerBranch;
  }

  public void setAccountOwnerBranch(String accountOwnerBranch) {
    this.accountOwnerBranch = accountOwnerBranch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DGISRequest dgISRequest = (DGISRequest) o;
    return Objects.equals(this.bblRegistrationId, dgISRequest.bblRegistrationId) &&
        Objects.equals(this.proxyType, dgISRequest.proxyType) &&
        Objects.equals(this.proxyValue, dgISRequest.proxyValue) &&
        Objects.equals(this.accountType, dgISRequest.accountType) &&
        Objects.equals(this.accountValue, dgISRequest.accountValue) &&
        Objects.equals(this.applicationIdOfDeRegistrationCustomerId, dgISRequest.applicationIdOfDeRegistrationCustomerId) &&
        Objects.equals(this.deRegistrationCustomerId, dgISRequest.deRegistrationCustomerId) &&
        Objects.equals(this.pC, dgISRequest.pC) &&
        Objects.equals(this.accountOwnerBranch, dgISRequest.accountOwnerBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bblRegistrationId, proxyType, proxyValue, accountType, accountValue, applicationIdOfDeRegistrationCustomerId, deRegistrationCustomerId, pC, accountOwnerBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DGISRequest {\n");
    
    sb.append("    bblRegistrationId: ").append(toIndentedString(bblRegistrationId)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    applicationIdOfDeRegistrationCustomerId: ").append(toIndentedString(applicationIdOfDeRegistrationCustomerId)).append("\n");
    sb.append("    deRegistrationCustomerId: ").append(toIndentedString(deRegistrationCustomerId)).append("\n");
    sb.append("    pC: ").append(toIndentedString(pC)).append("\n");
    sb.append("    accountOwnerBranch: ").append(toIndentedString(accountOwnerBranch)).append("\n");
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
