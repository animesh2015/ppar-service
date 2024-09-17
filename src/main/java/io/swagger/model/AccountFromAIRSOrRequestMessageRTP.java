package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountFromAIRSOrRequestMessageRTP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class AccountFromAIRSOrRequestMessageRTP   {
  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("adNumber")
  private String adNumber = null;

  public AccountFromAIRSOrRequestMessageRTP accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(example = "BANKAC", description = "")
      @NotNull

    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountFromAIRSOrRequestMessageRTP accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(example = "0000012222", description = "")
      @NotNull

    public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public AccountFromAIRSOrRequestMessageRTP adNumber(String adNumber) {
    this.adNumber = adNumber;
    return this;
  }

  /**
   * Get adNumber
   * @return adNumber
   **/
  @Schema(example = "0000500000001010", description = "")
      @NotNull

    public String getAdNumber() {
    return adNumber;
  }

  public void setAdNumber(String adNumber) {
    this.adNumber = adNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFromAIRSOrRequestMessageRTP accountFromAIRSOrRequestMessageRTP = (AccountFromAIRSOrRequestMessageRTP) o;
    return Objects.equals(this.accountType, accountFromAIRSOrRequestMessageRTP.accountType) &&
        Objects.equals(this.accountValue, accountFromAIRSOrRequestMessageRTP.accountValue) &&
        Objects.equals(this.adNumber, accountFromAIRSOrRequestMessageRTP.adNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountValue, adNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFromAIRSOrRequestMessageRTP {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    adNumber: ").append(toIndentedString(adNumber)).append("\n");
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
