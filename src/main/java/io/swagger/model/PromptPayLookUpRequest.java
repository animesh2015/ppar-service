package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromptPayLookUpRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class PromptPayLookUpRequest   {
  @JsonProperty("toProxyType")
  private String toProxyType = null;

  @JsonProperty("toProxyValue")
  private String toProxyValue = null;

  @JsonProperty("toAccountNo")
  private String toAccountNo = null;

  @JsonProperty("fromAccountNo")
  private String fromAccountNo = null;

  @JsonProperty("fromBankCode")
  private String fromBankCode = null;

  @JsonProperty("transactionAmount")
  private Double transactionAmount = null;

  @JsonProperty("istTermOwner")
  private String istTermOwner = null;

  public PromptPayLookUpRequest toProxyType(String toProxyType) {
    this.toProxyType = toProxyType;
    return this;
  }

  /**
   * Get toProxyType
   * @return toProxyType
   **/
  @Schema(example = "NATID", description = "")
      @NotNull

  @Pattern(regexp="|MSISDN|NATID|EWALLETID")   public String getToProxyType() {
    return toProxyType;
  }

  public void setToProxyType(String toProxyType) {
    this.toProxyType = toProxyType;
  }

  public PromptPayLookUpRequest toProxyValue(String toProxyValue) {
    this.toProxyValue = toProxyValue;
    return this;
  }

  /**
   * Get toProxyValue
   * @return toProxyValue
   **/
  @Schema(example = "1521100116666", description = "")
      @NotNull

  @Pattern(regexp="[0-9]*")   public String getToProxyValue() {
    return toProxyValue;
  }

  public void setToProxyValue(String toProxyValue) {
    this.toProxyValue = toProxyValue;
  }

  public PromptPayLookUpRequest toAccountNo(String toAccountNo) {
    this.toAccountNo = toAccountNo;
    return this;
  }

  /**
   * Get toAccountNo
   * @return toAccountNo
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|\\d{10}")   public String getToAccountNo() {
    return toAccountNo;
  }

  public void setToAccountNo(String toAccountNo) {
    this.toAccountNo = toAccountNo;
  }

  public PromptPayLookUpRequest fromAccountNo(String fromAccountNo) {
    this.fromAccountNo = fromAccountNo;
    return this;
  }

  /**
   * Get fromAccountNo
   * @return fromAccountNo
   **/
  @Schema(example = "1234567890", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10}")   public String getFromAccountNo() {
    return fromAccountNo;
  }

  public void setFromAccountNo(String fromAccountNo) {
    this.fromAccountNo = fromAccountNo;
  }

  public PromptPayLookUpRequest fromBankCode(String fromBankCode) {
    this.fromBankCode = fromBankCode;
    return this;
  }

  /**
   * Get fromBankCode
   * @return fromBankCode
   **/
  @Schema(example = "004", description = "")
      @NotNull

  @Pattern(regexp="|\\d{3}")   public String getFromBankCode() {
    return fromBankCode;
  }

  public void setFromBankCode(String fromBankCode) {
    this.fromBankCode = fromBankCode;
  }

  public PromptPayLookUpRequest transactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
   **/
  @Schema(example = "10333333300.5", required = true, description = "")
      @NotNull

    public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public PromptPayLookUpRequest istTermOwner(String istTermOwner) {
    this.istTermOwner = istTermOwner;
    return this;
  }

  /**
   * Get istTermOwner
   * @return istTermOwner
   **/
  @Schema(example = "TRXC", required = true, description = "")
      @NotNull

    public String getIstTermOwner() {
    return istTermOwner;
  }

  public void setIstTermOwner(String istTermOwner) {
    this.istTermOwner = istTermOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptPayLookUpRequest promptPayLookUpRequest = (PromptPayLookUpRequest) o;
    return Objects.equals(this.toProxyType, promptPayLookUpRequest.toProxyType) &&
        Objects.equals(this.toProxyValue, promptPayLookUpRequest.toProxyValue) &&
        Objects.equals(this.toAccountNo, promptPayLookUpRequest.toAccountNo) &&
        Objects.equals(this.fromAccountNo, promptPayLookUpRequest.fromAccountNo) &&
        Objects.equals(this.fromBankCode, promptPayLookUpRequest.fromBankCode) &&
        Objects.equals(this.transactionAmount, promptPayLookUpRequest.transactionAmount) &&
        Objects.equals(this.istTermOwner, promptPayLookUpRequest.istTermOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toProxyType, toProxyValue, toAccountNo, fromAccountNo, fromBankCode, transactionAmount, istTermOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptPayLookUpRequest {\n");
    
    sb.append("    toProxyType: ").append(toIndentedString(toProxyType)).append("\n");
    sb.append("    toProxyValue: ").append(toIndentedString(toProxyValue)).append("\n");
    sb.append("    toAccountNo: ").append(toIndentedString(toAccountNo)).append("\n");
    sb.append("    fromAccountNo: ").append(toIndentedString(fromAccountNo)).append("\n");
    sb.append("    fromBankCode: ").append(toIndentedString(fromBankCode)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    istTermOwner: ").append(toIndentedString(istTermOwner)).append("\n");
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
