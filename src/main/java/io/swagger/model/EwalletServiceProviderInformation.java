package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EwalletServiceProviderInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class EwalletServiceProviderInformation   {
  @JsonProperty("ewalletID")
  private String ewalletID = null;

  @JsonProperty("ewalletOperatorCode")
  private String ewalletOperatorCode = null;

  @JsonProperty("ewalletCompanyName")
  private String ewalletCompanyName = null;

  @JsonProperty("ewalletCompanyIDType")
  private String ewalletCompanyIDType = null;

  @JsonProperty("ewalletCompanyIDNo")
  private String ewalletCompanyIDNo = null;

  @JsonProperty("ewalletFloatAccountNo")
  private String ewalletFloatAccountNo = null;

  @JsonProperty("ewalletServiceProviderNameThai")
  private String ewalletServiceProviderNameThai = null;

  @JsonProperty("ewalletServiceProviderNameEnglish")
  private String ewalletServiceProviderNameEnglish = null;

  @JsonProperty("ewalletITMXCustomerType")
  private String ewalletITMXCustomerType = null;

  public EwalletServiceProviderInformation ewalletID(String ewalletID) {
    this.ewalletID = ewalletID;
    return this;
  }

  /**
   * Get ewalletID
   * @return ewalletID
   **/
  @Schema(example = "87952678673678657098", description = "")
      @NotNull

    public String getEwalletID() {
    return ewalletID;
  }

  public void setEwalletID(String ewalletID) {
    this.ewalletID = ewalletID;
  }

  public EwalletServiceProviderInformation ewalletOperatorCode(String ewalletOperatorCode) {
    this.ewalletOperatorCode = ewalletOperatorCode;
    return this;
  }

  /**
   * Get ewalletOperatorCode
   * @return ewalletOperatorCode
   **/
  @Schema(example = "123", description = "")
      @NotNull

    public String getEwalletOperatorCode() {
    return ewalletOperatorCode;
  }

  public void setEwalletOperatorCode(String ewalletOperatorCode) {
    this.ewalletOperatorCode = ewalletOperatorCode;
  }

  public EwalletServiceProviderInformation ewalletCompanyName(String ewalletCompanyName) {
    this.ewalletCompanyName = ewalletCompanyName;
    return this;
  }

  /**
   * Get ewalletCompanyName
   * @return ewalletCompanyName
   **/
  @Schema(example = "BANGKOK BANK", description = "")
      @NotNull

    public String getEwalletCompanyName() {
    return ewalletCompanyName;
  }

  public void setEwalletCompanyName(String ewalletCompanyName) {
    this.ewalletCompanyName = ewalletCompanyName;
  }

  public EwalletServiceProviderInformation ewalletCompanyIDType(String ewalletCompanyIDType) {
    this.ewalletCompanyIDType = ewalletCompanyIDType;
    return this;
  }

  /**
   * Get ewalletCompanyIDType
   * @return ewalletCompanyIDType
   **/
  @Schema(example = "02", description = "")
      @NotNull

    public String getEwalletCompanyIDType() {
    return ewalletCompanyIDType;
  }

  public void setEwalletCompanyIDType(String ewalletCompanyIDType) {
    this.ewalletCompanyIDType = ewalletCompanyIDType;
  }

  public EwalletServiceProviderInformation ewalletCompanyIDNo(String ewalletCompanyIDNo) {
    this.ewalletCompanyIDNo = ewalletCompanyIDNo;
    return this;
  }

  /**
   * Get ewalletCompanyIDNo
   * @return ewalletCompanyIDNo
   **/
  @Schema(example = "1234567890", description = "")
      @NotNull

    public String getEwalletCompanyIDNo() {
    return ewalletCompanyIDNo;
  }

  public void setEwalletCompanyIDNo(String ewalletCompanyIDNo) {
    this.ewalletCompanyIDNo = ewalletCompanyIDNo;
  }

  public EwalletServiceProviderInformation ewalletFloatAccountNo(String ewalletFloatAccountNo) {
    this.ewalletFloatAccountNo = ewalletFloatAccountNo;
    return this;
  }

  /**
   * Get ewalletFloatAccountNo
   * @return ewalletFloatAccountNo
   **/
  @Schema(example = "12345", description = "")
      @NotNull

    public String getEwalletFloatAccountNo() {
    return ewalletFloatAccountNo;
  }

  public void setEwalletFloatAccountNo(String ewalletFloatAccountNo) {
    this.ewalletFloatAccountNo = ewalletFloatAccountNo;
  }

  public EwalletServiceProviderInformation ewalletServiceProviderNameThai(String ewalletServiceProviderNameThai) {
    this.ewalletServiceProviderNameThai = ewalletServiceProviderNameThai;
    return this;
  }

  /**
   * Get ewalletServiceProviderNameThai
   * @return ewalletServiceProviderNameThai
   **/
  @Schema(example = "ธนาคารกรุงเทพ", description = "")
      @NotNull

    public String getEwalletServiceProviderNameThai() {
    return ewalletServiceProviderNameThai;
  }

  public void setEwalletServiceProviderNameThai(String ewalletServiceProviderNameThai) {
    this.ewalletServiceProviderNameThai = ewalletServiceProviderNameThai;
  }

  public EwalletServiceProviderInformation ewalletServiceProviderNameEnglish(String ewalletServiceProviderNameEnglish) {
    this.ewalletServiceProviderNameEnglish = ewalletServiceProviderNameEnglish;
    return this;
  }

  /**
   * Get ewalletServiceProviderNameEnglish
   * @return ewalletServiceProviderNameEnglish
   **/
  @Schema(example = "BANGKOK BANK", description = "")
      @NotNull

    public String getEwalletServiceProviderNameEnglish() {
    return ewalletServiceProviderNameEnglish;
  }

  public void setEwalletServiceProviderNameEnglish(String ewalletServiceProviderNameEnglish) {
    this.ewalletServiceProviderNameEnglish = ewalletServiceProviderNameEnglish;
  }

  public EwalletServiceProviderInformation ewalletITMXCustomerType(String ewalletITMXCustomerType) {
    this.ewalletITMXCustomerType = ewalletITMXCustomerType;
    return this;
  }

  /**
   * Get ewalletITMXCustomerType
   * @return ewalletITMXCustomerType
   **/
  @Schema(example = "Y", description = "")
      @NotNull

    public String getEwalletITMXCustomerType() {
    return ewalletITMXCustomerType;
  }

  public void setEwalletITMXCustomerType(String ewalletITMXCustomerType) {
    this.ewalletITMXCustomerType = ewalletITMXCustomerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EwalletServiceProviderInformation ewalletServiceProviderInformation = (EwalletServiceProviderInformation) o;
    return Objects.equals(this.ewalletID, ewalletServiceProviderInformation.ewalletID) &&
        Objects.equals(this.ewalletOperatorCode, ewalletServiceProviderInformation.ewalletOperatorCode) &&
        Objects.equals(this.ewalletCompanyName, ewalletServiceProviderInformation.ewalletCompanyName) &&
        Objects.equals(this.ewalletCompanyIDType, ewalletServiceProviderInformation.ewalletCompanyIDType) &&
        Objects.equals(this.ewalletCompanyIDNo, ewalletServiceProviderInformation.ewalletCompanyIDNo) &&
        Objects.equals(this.ewalletFloatAccountNo, ewalletServiceProviderInformation.ewalletFloatAccountNo) &&
        Objects.equals(this.ewalletServiceProviderNameThai, ewalletServiceProviderInformation.ewalletServiceProviderNameThai) &&
        Objects.equals(this.ewalletServiceProviderNameEnglish, ewalletServiceProviderInformation.ewalletServiceProviderNameEnglish) &&
        Objects.equals(this.ewalletITMXCustomerType, ewalletServiceProviderInformation.ewalletITMXCustomerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ewalletID, ewalletOperatorCode, ewalletCompanyName, ewalletCompanyIDType, ewalletCompanyIDNo, ewalletFloatAccountNo, ewalletServiceProviderNameThai, ewalletServiceProviderNameEnglish, ewalletITMXCustomerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EwalletServiceProviderInformation {\n");
    
    sb.append("    ewalletID: ").append(toIndentedString(ewalletID)).append("\n");
    sb.append("    ewalletOperatorCode: ").append(toIndentedString(ewalletOperatorCode)).append("\n");
    sb.append("    ewalletCompanyName: ").append(toIndentedString(ewalletCompanyName)).append("\n");
    sb.append("    ewalletCompanyIDType: ").append(toIndentedString(ewalletCompanyIDType)).append("\n");
    sb.append("    ewalletCompanyIDNo: ").append(toIndentedString(ewalletCompanyIDNo)).append("\n");
    sb.append("    ewalletFloatAccountNo: ").append(toIndentedString(ewalletFloatAccountNo)).append("\n");
    sb.append("    ewalletServiceProviderNameThai: ").append(toIndentedString(ewalletServiceProviderNameThai)).append("\n");
    sb.append("    ewalletServiceProviderNameEnglish: ").append(toIndentedString(ewalletServiceProviderNameEnglish)).append("\n");
    sb.append("    ewalletITMXCustomerType: ").append(toIndentedString(ewalletITMXCustomerType)).append("\n");
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
