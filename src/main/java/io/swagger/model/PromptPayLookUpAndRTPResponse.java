package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AccountInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromptPayLookUpAndRTPResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class PromptPayLookUpAndRTPResponse   {
  @JsonProperty("toAccountType")
  private String toAccountType = null;

  @JsonProperty("toAccountValue")
  private String toAccountValue = null;

  @JsonProperty("fromAccountFromAIRSOrRequestMessageRTP")
  private AllOfPromptPayLookUpAndRTPResponseFromAccountFromAIRSOrRequestMessageRTP fromAccountFromAIRSOrRequestMessageRTP = null;

  @JsonProperty("fromAccountInformation")
  private AccountInformation fromAccountInformation = null;

  @JsonProperty("toAccountFromAIRSOrRequestMessageRTP")
  private AllOfPromptPayLookUpAndRTPResponseToAccountFromAIRSOrRequestMessageRTP toAccountFromAIRSOrRequestMessageRTP = null;

  @JsonProperty("toAccountInformation")
  private AccountInformation toAccountInformation = null;

  @JsonProperty("toEwalletServiceProviderInformation")
  private AllOfPromptPayLookUpAndRTPResponseToEwalletServiceProviderInformation toEwalletServiceProviderInformation = null;

  @JsonProperty("toRTPInformation")
  private AllOfPromptPayLookUpAndRTPResponseToRTPInformation toRTPInformation = null;

  @JsonProperty("interFlag")
  private String interFlag = null;

  public PromptPayLookUpAndRTPResponse toAccountType(String toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

  /**
   * return this field in promptpaylookup
   * @return toAccountType
   **/
  @Schema(example = "BANKAC", description = "return this field in promptpaylookup")
      @NotNull

    public String getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(String toAccountType) {
    this.toAccountType = toAccountType;
  }

  public PromptPayLookUpAndRTPResponse toAccountValue(String toAccountValue) {
    this.toAccountValue = toAccountValue;
    return this;
  }

  /**
   * return this field in promptpaylookup
   * @return toAccountValue
   **/
  @Schema(example = "0000000009", description = "return this field in promptpaylookup")
      @NotNull

    public String getToAccountValue() {
    return toAccountValue;
  }

  public void setToAccountValue(String toAccountValue) {
    this.toAccountValue = toAccountValue;
  }

  public PromptPayLookUpAndRTPResponse fromAccountFromAIRSOrRequestMessageRTP(AllOfPromptPayLookUpAndRTPResponseFromAccountFromAIRSOrRequestMessageRTP fromAccountFromAIRSOrRequestMessageRTP) {
    this.fromAccountFromAIRSOrRequestMessageRTP = fromAccountFromAIRSOrRequestMessageRTP;
    return this;
  }

  /**
   * return this field in promptpaylookup/rtp
   * @return fromAccountFromAIRSOrRequestMessageRTP
   **/
  @Schema(description = "return this field in promptpaylookup/rtp")
      @NotNull

    public AllOfPromptPayLookUpAndRTPResponseFromAccountFromAIRSOrRequestMessageRTP getFromAccountFromAIRSOrRequestMessageRTP() {
    return fromAccountFromAIRSOrRequestMessageRTP;
  }

  public void setFromAccountFromAIRSOrRequestMessageRTP(AllOfPromptPayLookUpAndRTPResponseFromAccountFromAIRSOrRequestMessageRTP fromAccountFromAIRSOrRequestMessageRTP) {
    this.fromAccountFromAIRSOrRequestMessageRTP = fromAccountFromAIRSOrRequestMessageRTP;
  }

  public PromptPayLookUpAndRTPResponse fromAccountInformation(AccountInformation fromAccountInformation) {
    this.fromAccountInformation = fromAccountInformation;
    return this;
  }

  /**
   * Get fromAccountInformation
   * @return fromAccountInformation
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public AccountInformation getFromAccountInformation() {
    return fromAccountInformation;
  }

  public void setFromAccountInformation(AccountInformation fromAccountInformation) {
    this.fromAccountInformation = fromAccountInformation;
  }

  public PromptPayLookUpAndRTPResponse toAccountFromAIRSOrRequestMessageRTP(AllOfPromptPayLookUpAndRTPResponseToAccountFromAIRSOrRequestMessageRTP toAccountFromAIRSOrRequestMessageRTP) {
    this.toAccountFromAIRSOrRequestMessageRTP = toAccountFromAIRSOrRequestMessageRTP;
    return this;
  }

  /**
   * return this field in promptpaylookup/rtp
   * @return toAccountFromAIRSOrRequestMessageRTP
   **/
  @Schema(description = "return this field in promptpaylookup/rtp")
      @NotNull

    public AllOfPromptPayLookUpAndRTPResponseToAccountFromAIRSOrRequestMessageRTP getToAccountFromAIRSOrRequestMessageRTP() {
    return toAccountFromAIRSOrRequestMessageRTP;
  }

  public void setToAccountFromAIRSOrRequestMessageRTP(AllOfPromptPayLookUpAndRTPResponseToAccountFromAIRSOrRequestMessageRTP toAccountFromAIRSOrRequestMessageRTP) {
    this.toAccountFromAIRSOrRequestMessageRTP = toAccountFromAIRSOrRequestMessageRTP;
  }

  public PromptPayLookUpAndRTPResponse toAccountInformation(AccountInformation toAccountInformation) {
    this.toAccountInformation = toAccountInformation;
    return this;
  }

  /**
   * Get toAccountInformation
   * @return toAccountInformation
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public AccountInformation getToAccountInformation() {
    return toAccountInformation;
  }

  public void setToAccountInformation(AccountInformation toAccountInformation) {
    this.toAccountInformation = toAccountInformation;
  }

  public PromptPayLookUpAndRTPResponse toEwalletServiceProviderInformation(AllOfPromptPayLookUpAndRTPResponseToEwalletServiceProviderInformation toEwalletServiceProviderInformation) {
    this.toEwalletServiceProviderInformation = toEwalletServiceProviderInformation;
    return this;
  }

  /**
   * return this field in promptpaylookup
   * @return toEwalletServiceProviderInformation
   **/
  @Schema(description = "return this field in promptpaylookup")
      @NotNull

    public AllOfPromptPayLookUpAndRTPResponseToEwalletServiceProviderInformation getToEwalletServiceProviderInformation() {
    return toEwalletServiceProviderInformation;
  }

  public void setToEwalletServiceProviderInformation(AllOfPromptPayLookUpAndRTPResponseToEwalletServiceProviderInformation toEwalletServiceProviderInformation) {
    this.toEwalletServiceProviderInformation = toEwalletServiceProviderInformation;
  }

  public PromptPayLookUpAndRTPResponse toRTPInformation(AllOfPromptPayLookUpAndRTPResponseToRTPInformation toRTPInformation) {
    this.toRTPInformation = toRTPInformation;
    return this;
  }

  /**
   * return this field in promptpaylookup/rtp
   * @return toRTPInformation
   **/
  @Schema(description = "return this field in promptpaylookup/rtp")
      @NotNull

    public AllOfPromptPayLookUpAndRTPResponseToRTPInformation getToRTPInformation() {
    return toRTPInformation;
  }

  public void setToRTPInformation(AllOfPromptPayLookUpAndRTPResponseToRTPInformation toRTPInformation) {
    this.toRTPInformation = toRTPInformation;
  }

  public PromptPayLookUpAndRTPResponse interFlag(String interFlag) {
    this.interFlag = interFlag;
    return this;
  }

  /**
   * return this field in promptpaylookup
   * @return interFlag
   **/
  @Schema(example = "Y", description = "return this field in promptpaylookup")
      @NotNull

    public String getInterFlag() {
    return interFlag;
  }

  public void setInterFlag(String interFlag) {
    this.interFlag = interFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptPayLookUpAndRTPResponse promptPayLookUpAndRTPResponse = (PromptPayLookUpAndRTPResponse) o;
    return Objects.equals(this.toAccountType, promptPayLookUpAndRTPResponse.toAccountType) &&
        Objects.equals(this.toAccountValue, promptPayLookUpAndRTPResponse.toAccountValue) &&
        Objects.equals(this.fromAccountFromAIRSOrRequestMessageRTP, promptPayLookUpAndRTPResponse.fromAccountFromAIRSOrRequestMessageRTP) &&
        Objects.equals(this.fromAccountInformation, promptPayLookUpAndRTPResponse.fromAccountInformation) &&
        Objects.equals(this.toAccountFromAIRSOrRequestMessageRTP, promptPayLookUpAndRTPResponse.toAccountFromAIRSOrRequestMessageRTP) &&
        Objects.equals(this.toAccountInformation, promptPayLookUpAndRTPResponse.toAccountInformation) &&
        Objects.equals(this.toEwalletServiceProviderInformation, promptPayLookUpAndRTPResponse.toEwalletServiceProviderInformation) &&
        Objects.equals(this.toRTPInformation, promptPayLookUpAndRTPResponse.toRTPInformation) &&
        Objects.equals(this.interFlag, promptPayLookUpAndRTPResponse.interFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccountType, toAccountValue, fromAccountFromAIRSOrRequestMessageRTP, fromAccountInformation, toAccountFromAIRSOrRequestMessageRTP, toAccountInformation, toEwalletServiceProviderInformation, toRTPInformation, interFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptPayLookUpAndRTPResponse {\n");
    
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccountValue: ").append(toIndentedString(toAccountValue)).append("\n");
    sb.append("    fromAccountFromAIRSOrRequestMessageRTP: ").append(toIndentedString(fromAccountFromAIRSOrRequestMessageRTP)).append("\n");
    sb.append("    fromAccountInformation: ").append(toIndentedString(fromAccountInformation)).append("\n");
    sb.append("    toAccountFromAIRSOrRequestMessageRTP: ").append(toIndentedString(toAccountFromAIRSOrRequestMessageRTP)).append("\n");
    sb.append("    toAccountInformation: ").append(toIndentedString(toAccountInformation)).append("\n");
    sb.append("    toEwalletServiceProviderInformation: ").append(toIndentedString(toEwalletServiceProviderInformation)).append("\n");
    sb.append("    toRTPInformation: ").append(toIndentedString(toRTPInformation)).append("\n");
    sb.append("    interFlag: ").append(toIndentedString(interFlag)).append("\n");
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
