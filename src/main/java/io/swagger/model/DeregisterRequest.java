package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeregisterRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DeregisterRequest   {
  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyValue")
  private String proxyValue = null;

  @JsonProperty("appID")
  private String appID = null;

  @JsonProperty("deRegistrationCustID")
  private String deRegistrationCustID = null;

  public DeregisterRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @Schema(example = "MSISDN", required = true, description = "")
      @NotNull

  @Pattern(regexp="MSISDN|NATID")   public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public DeregisterRequest proxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
    return this;
  }

  /**
   * Get proxyValue
   * @return proxyValue
   **/
  @Schema(example = "0911234567", required = true, description = "")
      @NotNull

  @Pattern(regexp="^\\d+$") @Size(min=10,max=13)   public String getProxyValue() {
    return proxyValue;
  }

  public void setProxyValue(String proxyValue) {
    this.proxyValue = proxyValue;
  }

  public DeregisterRequest appID(String appID) {
    this.appID = appID;
    return this;
  }

  /**
   * Get appID
   * @return appID
   **/
  @Schema(example = "RM", required = true, description = "")
      @NotNull

  @Pattern(regexp="IB|CC|DB|RM|ST|IM|AD") @Size(max=2)   public String getAppID() {
    return appID;
  }

  public void setAppID(String appID) {
    this.appID = appID;
  }

  public DeregisterRequest deRegistrationCustID(String deRegistrationCustID) {
    this.deRegistrationCustID = deRegistrationCustID;
    return this;
  }

  /**
   * Get deRegistrationCustID
   * @return deRegistrationCustID
   **/
  @Schema(example = "00000012549876", required = true, description = "")
      @NotNull

  @Pattern(regexp="^\\d+$") @Size(max=20)   public String getDeRegistrationCustID() {
    return deRegistrationCustID;
  }

  public void setDeRegistrationCustID(String deRegistrationCustID) {
    this.deRegistrationCustID = deRegistrationCustID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeregisterRequest deregisterRequest = (DeregisterRequest) o;
    return Objects.equals(this.proxyType, deregisterRequest.proxyType) &&
        Objects.equals(this.proxyValue, deregisterRequest.proxyValue) &&
        Objects.equals(this.appID, deregisterRequest.appID) &&
        Objects.equals(this.deRegistrationCustID, deregisterRequest.deRegistrationCustID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyType, proxyValue, appID, deRegistrationCustID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeregisterRequest {\n");
    
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyValue: ").append(toIndentedString(proxyValue)).append("\n");
    sb.append("    appID: ").append(toIndentedString(appID)).append("\n");
    sb.append("    deRegistrationCustID: ").append(toIndentedString(deRegistrationCustID)).append("\n");
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
