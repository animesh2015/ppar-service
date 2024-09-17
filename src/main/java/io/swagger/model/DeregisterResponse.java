package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeregisterResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DeregisterResponse   {
  @JsonProperty("anyIDNo")
  private String anyIDNo = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("accountValue")
  private String accountValue = null;

  @JsonProperty("bblRegistrationID")
  private String bblRegistrationID = null;

  @JsonProperty("itmxRegistrationID")
  private String itmxRegistrationID = null;

  public DeregisterResponse anyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
    return this;
  }

  /**
   * Get anyIDNo
   * @return anyIDNo
   **/
  @Schema(example = "0000102211221234", description = "")
      @NotNull

    public String getAnyIDNo() {
    return anyIDNo;
  }

  public void setAnyIDNo(String anyIDNo) {
    this.anyIDNo = anyIDNo;
  }

  public DeregisterResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(example = "SA", description = "")
      @NotNull

    public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public DeregisterResponse accountValue(String accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
   **/
  @Schema(example = "1180000018", description = "")
      @NotNull

    public String getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(String accountValue) {
    this.accountValue = accountValue;
  }

  public DeregisterResponse bblRegistrationID(String bblRegistrationID) {
    this.bblRegistrationID = bblRegistrationID;
    return this;
  }

  /**
   * Get bblRegistrationID
   * @return bblRegistrationID
   **/
  @Schema(example = "000000476469", description = "")
      @NotNull

    public String getBblRegistrationID() {
    return bblRegistrationID;
  }

  public void setBblRegistrationID(String bblRegistrationID) {
    this.bblRegistrationID = bblRegistrationID;
  }

  public DeregisterResponse itmxRegistrationID(String itmxRegistrationID) {
    this.itmxRegistrationID = itmxRegistrationID;
    return this;
  }

  /**
   * Get itmxRegistrationID
   * @return itmxRegistrationID
   **/
  @Schema(description = "")
      @NotNull

    public String getItmxRegistrationID() {
    return itmxRegistrationID;
  }

  public void setItmxRegistrationID(String itmxRegistrationID) {
    this.itmxRegistrationID = itmxRegistrationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeregisterResponse deregisterResponse = (DeregisterResponse) o;
    return Objects.equals(this.anyIDNo, deregisterResponse.anyIDNo) &&
        Objects.equals(this.accountType, deregisterResponse.accountType) &&
        Objects.equals(this.accountValue, deregisterResponse.accountValue) &&
        Objects.equals(this.bblRegistrationID, deregisterResponse.bblRegistrationID) &&
        Objects.equals(this.itmxRegistrationID, deregisterResponse.itmxRegistrationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyIDNo, accountType, accountValue, bblRegistrationID, itmxRegistrationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeregisterResponse {\n");
    
    sb.append("    anyIDNo: ").append(toIndentedString(anyIDNo)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    bblRegistrationID: ").append(toIndentedString(bblRegistrationID)).append("\n");
    sb.append("    itmxRegistrationID: ").append(toIndentedString(itmxRegistrationID)).append("\n");
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
