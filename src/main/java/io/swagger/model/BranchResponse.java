package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class BranchResponse   {
  @JsonProperty("branchNo")
  private String branchNo = null;

  @JsonProperty("dateOfTransaction")
  private String dateOfTransaction = null;

  @JsonProperty("teller")
  private String teller = null;

  @JsonProperty("registerTotal")
  private Long registerTotal = null;

  @JsonProperty("deregisterTotal")
  private Long deregisterTotal = null;

  @JsonProperty("registerByID")
  private Long registerByID = null;

  @JsonProperty("deregisterByID")
  private Long deregisterByID = null;

  @JsonProperty("registerByMobile")
  private Long registerByMobile = null;

  @JsonProperty("deregisterByMobile")
  private Long deregisterByMobile = null;

  @JsonProperty("registerByTAX")
  private Long registerByTAX = null;

  @JsonProperty("deregisterByTAX")
  private Long deregisterByTAX = null;

  @JsonProperty("updateACTotal")
  private Long updateACTotal = null;

  public BranchResponse branchNo(String branchNo) {
    this.branchNo = branchNo;
    return this;
  }

  /**
   * Get branchNo
   * @return branchNo
   **/
  @Schema(example = "000098", description = "")
      @NotNull

    public String getBranchNo() {
    return branchNo;
  }

  public void setBranchNo(String branchNo) {
    this.branchNo = branchNo;
  }

  public BranchResponse dateOfTransaction(String dateOfTransaction) {
    this.dateOfTransaction = dateOfTransaction;
    return this;
  }

  /**
   * Get dateOfTransaction
   * @return dateOfTransaction
   **/
  @Schema(example = "20240401", description = "")
      @NotNull

    public String getDateOfTransaction() {
    return dateOfTransaction;
  }

  public void setDateOfTransaction(String dateOfTransaction) {
    this.dateOfTransaction = dateOfTransaction;
  }

  public BranchResponse teller(String teller) {
    this.teller = teller;
    return this;
  }

  /**
   * Get teller
   * @return teller
   **/
  @Schema(example = "0000000002", description = "")
      @NotNull

    public String getTeller() {
    return teller;
  }

  public void setTeller(String teller) {
    this.teller = teller;
  }

  public BranchResponse registerTotal(Long registerTotal) {
    this.registerTotal = registerTotal;
    return this;
  }

  /**
   * Get registerTotal
   * @return registerTotal
   **/
  @Schema(description = "")
      @NotNull

    public Long getRegisterTotal() {
    return registerTotal;
  }

  public void setRegisterTotal(Long registerTotal) {
    this.registerTotal = registerTotal;
  }

  public BranchResponse deregisterTotal(Long deregisterTotal) {
    this.deregisterTotal = deregisterTotal;
    return this;
  }

  /**
   * Get deregisterTotal
   * @return deregisterTotal
   **/
  @Schema(description = "")
      @NotNull

    public Long getDeregisterTotal() {
    return deregisterTotal;
  }

  public void setDeregisterTotal(Long deregisterTotal) {
    this.deregisterTotal = deregisterTotal;
  }

  public BranchResponse registerByID(Long registerByID) {
    this.registerByID = registerByID;
    return this;
  }

  /**
   * Get registerByID
   * @return registerByID
   **/
  @Schema(description = "")
      @NotNull

    public Long getRegisterByID() {
    return registerByID;
  }

  public void setRegisterByID(Long registerByID) {
    this.registerByID = registerByID;
  }

  public BranchResponse deregisterByID(Long deregisterByID) {
    this.deregisterByID = deregisterByID;
    return this;
  }

  /**
   * Get deregisterByID
   * @return deregisterByID
   **/
  @Schema(description = "")
      @NotNull

    public Long getDeregisterByID() {
    return deregisterByID;
  }

  public void setDeregisterByID(Long deregisterByID) {
    this.deregisterByID = deregisterByID;
  }

  public BranchResponse registerByMobile(Long registerByMobile) {
    this.registerByMobile = registerByMobile;
    return this;
  }

  /**
   * Get registerByMobile
   * @return registerByMobile
   **/
  @Schema(description = "")
      @NotNull

    public Long getRegisterByMobile() {
    return registerByMobile;
  }

  public void setRegisterByMobile(Long registerByMobile) {
    this.registerByMobile = registerByMobile;
  }

  public BranchResponse deregisterByMobile(Long deregisterByMobile) {
    this.deregisterByMobile = deregisterByMobile;
    return this;
  }

  /**
   * Get deregisterByMobile
   * @return deregisterByMobile
   **/
  @Schema(description = "")
      @NotNull

    public Long getDeregisterByMobile() {
    return deregisterByMobile;
  }

  public void setDeregisterByMobile(Long deregisterByMobile) {
    this.deregisterByMobile = deregisterByMobile;
  }

  public BranchResponse registerByTAX(Long registerByTAX) {
    this.registerByTAX = registerByTAX;
    return this;
  }

  /**
   * Get registerByTAX
   * @return registerByTAX
   **/
  @Schema(description = "")
      @NotNull

    public Long getRegisterByTAX() {
    return registerByTAX;
  }

  public void setRegisterByTAX(Long registerByTAX) {
    this.registerByTAX = registerByTAX;
  }

  public BranchResponse deregisterByTAX(Long deregisterByTAX) {
    this.deregisterByTAX = deregisterByTAX;
    return this;
  }

  /**
   * Get deregisterByTAX
   * @return deregisterByTAX
   **/
  @Schema(description = "")
      @NotNull

    public Long getDeregisterByTAX() {
    return deregisterByTAX;
  }

  public void setDeregisterByTAX(Long deregisterByTAX) {
    this.deregisterByTAX = deregisterByTAX;
  }

  public BranchResponse updateACTotal(Long updateACTotal) {
    this.updateACTotal = updateACTotal;
    return this;
  }

  /**
   * Get updateACTotal
   * @return updateACTotal
   **/
  @Schema(description = "")
      @NotNull

    public Long getUpdateACTotal() {
    return updateACTotal;
  }

  public void setUpdateACTotal(Long updateACTotal) {
    this.updateACTotal = updateACTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchResponse branchResponse = (BranchResponse) o;
    return Objects.equals(this.branchNo, branchResponse.branchNo) &&
        Objects.equals(this.dateOfTransaction, branchResponse.dateOfTransaction) &&
        Objects.equals(this.teller, branchResponse.teller) &&
        Objects.equals(this.registerTotal, branchResponse.registerTotal) &&
        Objects.equals(this.deregisterTotal, branchResponse.deregisterTotal) &&
        Objects.equals(this.registerByID, branchResponse.registerByID) &&
        Objects.equals(this.deregisterByID, branchResponse.deregisterByID) &&
        Objects.equals(this.registerByMobile, branchResponse.registerByMobile) &&
        Objects.equals(this.deregisterByMobile, branchResponse.deregisterByMobile) &&
        Objects.equals(this.registerByTAX, branchResponse.registerByTAX) &&
        Objects.equals(this.deregisterByTAX, branchResponse.deregisterByTAX) &&
        Objects.equals(this.updateACTotal, branchResponse.updateACTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchNo, dateOfTransaction, teller, registerTotal, deregisterTotal, registerByID, deregisterByID, registerByMobile, deregisterByMobile, registerByTAX, deregisterByTAX, updateACTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponse {\n");
    
    sb.append("    branchNo: ").append(toIndentedString(branchNo)).append("\n");
    sb.append("    dateOfTransaction: ").append(toIndentedString(dateOfTransaction)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
    sb.append("    registerTotal: ").append(toIndentedString(registerTotal)).append("\n");
    sb.append("    deregisterTotal: ").append(toIndentedString(deregisterTotal)).append("\n");
    sb.append("    registerByID: ").append(toIndentedString(registerByID)).append("\n");
    sb.append("    deregisterByID: ").append(toIndentedString(deregisterByID)).append("\n");
    sb.append("    registerByMobile: ").append(toIndentedString(registerByMobile)).append("\n");
    sb.append("    deregisterByMobile: ").append(toIndentedString(deregisterByMobile)).append("\n");
    sb.append("    registerByTAX: ").append(toIndentedString(registerByTAX)).append("\n");
    sb.append("    deregisterByTAX: ").append(toIndentedString(deregisterByTAX)).append("\n");
    sb.append("    updateACTotal: ").append(toIndentedString(updateACTotal)).append("\n");
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
