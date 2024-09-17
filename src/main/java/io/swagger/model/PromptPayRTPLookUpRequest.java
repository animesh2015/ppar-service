package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromptPayRTPLookUpRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class PromptPayRTPLookUpRequest   {
  @JsonProperty("fromProxyType")
  private String fromProxyType = null;

  @JsonProperty("fromProxyValue")
  private String fromProxyValue = null;

  @JsonProperty("fromAccountNo")
  private String fromAccountNo = null;

  @JsonProperty("toProxyType")
  private String toProxyType = null;

  @JsonProperty("toProxyValue")
  private String toProxyValue = null;

  @JsonProperty("toAccountNo")
  private String toAccountNo = null;

  public PromptPayRTPLookUpRequest fromProxyType(String fromProxyType) {
    this.fromProxyType = fromProxyType;
    return this;
  }

  /**
   * Get fromProxyType
   * @return fromProxyType
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="|MSISDN|NATID|EWALLETID")   public String getFromProxyType() {
    return fromProxyType;
  }

  public void setFromProxyType(String fromProxyType) {
    this.fromProxyType = fromProxyType;
  }

  public PromptPayRTPLookUpRequest fromProxyValue(String fromProxyValue) {
    this.fromProxyValue = fromProxyValue;
    return this;
  }

  /**
   * Get fromProxyValue
   * @return fromProxyValue
   **/
  @Schema(description = "")
      @NotNull

  @Pattern(regexp="[0-9]*")   public String getFromProxyValue() {
    return fromProxyValue;
  }

  public void setFromProxyValue(String fromProxyValue) {
    this.fromProxyValue = fromProxyValue;
  }

  public PromptPayRTPLookUpRequest fromAccountNo(String fromAccountNo) {
    this.fromAccountNo = fromAccountNo;
    return this;
  }

  /**
   * Get fromAccountNo
   * @return fromAccountNo
   **/
  @Schema(example = "5974574392", description = "")
      @NotNull

  @Pattern(regexp="|\\d{10}")   public String getFromAccountNo() {
    return fromAccountNo;
  }

  public void setFromAccountNo(String fromAccountNo) {
    this.fromAccountNo = fromAccountNo;
  }

  public PromptPayRTPLookUpRequest toProxyType(String toProxyType) {
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

  public PromptPayRTPLookUpRequest toProxyValue(String toProxyValue) {
    this.toProxyValue = toProxyValue;
    return this;
  }

  /**
   * Get toProxyValue
   * @return toProxyValue
   **/
  @Schema(example = "1209701937588", description = "")
      @NotNull

  @Pattern(regexp="[0-9]*")   public String getToProxyValue() {
    return toProxyValue;
  }

  public void setToProxyValue(String toProxyValue) {
    this.toProxyValue = toProxyValue;
  }

  public PromptPayRTPLookUpRequest toAccountNo(String toAccountNo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptPayRTPLookUpRequest promptPayRTPLookUpRequest = (PromptPayRTPLookUpRequest) o;
    return Objects.equals(this.fromProxyType, promptPayRTPLookUpRequest.fromProxyType) &&
        Objects.equals(this.fromProxyValue, promptPayRTPLookUpRequest.fromProxyValue) &&
        Objects.equals(this.fromAccountNo, promptPayRTPLookUpRequest.fromAccountNo) &&
        Objects.equals(this.toProxyType, promptPayRTPLookUpRequest.toProxyType) &&
        Objects.equals(this.toProxyValue, promptPayRTPLookUpRequest.toProxyValue) &&
        Objects.equals(this.toAccountNo, promptPayRTPLookUpRequest.toAccountNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromProxyType, fromProxyValue, fromAccountNo, toProxyType, toProxyValue, toAccountNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptPayRTPLookUpRequest {\n");
    
    sb.append("    fromProxyType: ").append(toIndentedString(fromProxyType)).append("\n");
    sb.append("    fromProxyValue: ").append(toIndentedString(fromProxyValue)).append("\n");
    sb.append("    fromAccountNo: ").append(toIndentedString(fromAccountNo)).append("\n");
    sb.append("    toProxyType: ").append(toIndentedString(toProxyType)).append("\n");
    sb.append("    toProxyValue: ").append(toIndentedString(toProxyValue)).append("\n");
    sb.append("    toAccountNo: ").append(toIndentedString(toAccountNo)).append("\n");
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
