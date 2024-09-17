package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InterSetupRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class InterSetupRequest   {
  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("bblRegistrationId")
  private String bblRegistrationId = null;

  @JsonProperty("flagName")
  private String flagName = null;

  @JsonProperty("flagValue")
  private String flagValue = null;

  public InterSetupRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @Schema(example = "MSISDN", required = true, description = "")
      @NotNull

  @Pattern(regexp="NATID|MSISDN")   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public InterSetupRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "0913334444", required = true, description = "")
      @NotNull

  @Pattern(regexp="^[0-9]*$") @Size(min=10,max=100)   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public InterSetupRequest bblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
    return this;
  }

  /**
   * Get bblRegistrationId
   * @return bblRegistrationId
   **/
  @Schema(example = "000000900238", required = true, description = "")
      @NotNull

  @Pattern(regexp="^[0-9]*$") @Size(min=12,max=12)   public String getBblRegistrationId() {
    return bblRegistrationId;
  }

  public void setBblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
  }

  public InterSetupRequest flagName(String flagName) {
    this.flagName = flagName;
    return this;
  }

  /**
   * Get flagName
   * @return flagName
   **/
  @Schema(example = "INT", required = true, description = "")
      @NotNull

  @Pattern(regexp="^(INT)$")   public String getFlagName() {
    return flagName;
  }

  public void setFlagName(String flagName) {
    this.flagName = flagName;
  }

  public InterSetupRequest flagValue(String flagValue) {
    this.flagValue = flagValue;
    return this;
  }

  /**
   * Get flagValue
   * @return flagValue
   **/
  @Schema(example = "Y", required = true, description = "")
      @NotNull

  @Pattern(regexp="^(Y|N)$")   public String getFlagValue() {
    return flagValue;
  }

  public void setFlagValue(String flagValue) {
    this.flagValue = flagValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterSetupRequest interSetupRequest = (InterSetupRequest) o;
    return Objects.equals(this.proxyType, interSetupRequest.proxyType) &&
        Objects.equals(this.proxyValue, interSetupRequest.proxyValue) &&
        Objects.equals(this.bblRegistrationId, interSetupRequest.bblRegistrationId) &&
        Objects.equals(this.flagName, interSetupRequest.flagName) &&
        Objects.equals(this.flagValue, interSetupRequest.flagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyType, proxyValue, bblRegistrationId, flagName, flagValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterSetupRequest {\n");
    
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    bblRegistrationId: ").append(toIndentedString(bblRegistrationId)).append("\n");
    sb.append("    flagName: ").append(toIndentedString(flagName)).append("\n");
    sb.append("    flagValue: ").append(toIndentedString(flagValue)).append("\n");
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
