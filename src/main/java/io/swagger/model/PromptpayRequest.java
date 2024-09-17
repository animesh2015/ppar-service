package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromptpayRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class PromptpayRequest   {
  @JsonProperty("searchAnyIDBy")
  private String searchAnyIDBy = null;

  @JsonProperty("specificReturn")
  private String specificReturn = null;

  @JsonProperty("anyIDNo")
  private String anyIDNo = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("noOfRequest")
  private Integer noOfRequest = null;

  @JsonProperty("searchKey")
  private String searchKey = null;

  public PromptpayRequest searchAnyIDBy(String searchAnyIDBy) {
    this.searchAnyIDBy = searchAnyIDBy;
    return this;
  }

  /**
   * Get searchAnyIDBy
   * @return searchAnyIDBy
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

  @Pattern(regexp="1|2|3")   public String getSearchAnyIDBy() {
    return searchAnyIDBy;
  }

  public void setSearchAnyIDBy(String searchAnyIDBy) {
    this.searchAnyIDBy = searchAnyIDBy;
  }

  public PromptpayRequest specificReturn(String specificReturn) {
    this.specificReturn = specificReturn;
    return this;
  }

  /**
   * Get specificReturn
   * @return specificReturn
   **/
  @Schema(example = "Y", required = true, description = "")
      @NotNull

    public String getSpecificReturn() {
    return specificReturn;
  }

  public void setSpecificReturn(String specificReturn) {
    this.specificReturn = specificReturn;
  }

  public PromptpayRequest anyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
    return this;
  }

  /**
   * Get anyIDNo
   * @return anyIDNo
   **/
  @Schema(description = "")
      @NotNull

    public String getAnyIDNo() {
    return anyIDNo;
  }

  public void setAnyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
  }

  public PromptpayRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @Schema(example = "MSISDN", description = "")
      @NotNull

    public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public PromptpayRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "0911234567", description = "")
      @NotNull

    public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public PromptpayRequest accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(description = "")
      @NotNull

    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public PromptpayRequest accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(description = "")
      @NotNull

    public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public PromptpayRequest noOfRequest(Integer noOfRequest) {
    this.noOfRequest = noOfRequest;
    return this;
  }

  /**
   * Get noOfRequest
   * minimum: 1
   * @return noOfRequest
   **/
  @Schema(example = "4", required = true, description = "")
      @NotNull

  @Min(1)  public Integer getNoOfRequest() {
    return noOfRequest;
  }

  public void setNoOfRequest(Integer noOfRequest) {
    this.noOfRequest = noOfRequest;
  }

  public PromptpayRequest searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  /**
   * Get searchKey
   * @return searchKey
   **/
  @Schema(example = "000000000023", description = "")
      @NotNull

  @Size(max=50)   public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptpayRequest promptpayRequest = (PromptpayRequest) o;
    return Objects.equals(this.searchAnyIDBy, promptpayRequest.searchAnyIDBy) &&
        Objects.equals(this.specificReturn, promptpayRequest.specificReturn) &&
        Objects.equals(this.anyIDNo, promptpayRequest.anyIDNo) &&
        Objects.equals(this.proxyType, promptpayRequest.proxyType) &&
        Objects.equals(this.proxyValue, promptpayRequest.proxyValue) &&
        Objects.equals(this.accountType, promptpayRequest.accountType) &&
        Objects.equals(this.accountValue, promptpayRequest.accountValue) &&
        Objects.equals(this.noOfRequest, promptpayRequest.noOfRequest) &&
        Objects.equals(this.searchKey, promptpayRequest.searchKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchAnyIDBy, specificReturn, anyIDNo, proxyType, proxyValue, accountType, accountValue, noOfRequest, searchKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptpayRequest {\n");
    
    sb.append("    searchAnyIDBy: ").append(toIndentedString(searchAnyIDBy)).append("\n");
    sb.append("    specificReturn: ").append(toIndentedString(specificReturn)).append("\n");
    sb.append("    anyIDNo: ").append(toIndentedString(anyIDNo)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    noOfRequest: ").append(toIndentedString(noOfRequest)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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
