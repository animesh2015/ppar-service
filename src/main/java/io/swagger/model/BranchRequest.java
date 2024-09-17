package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class BranchRequest   {
  @JsonProperty("branchNo")
  private String branchNo = null;

  @JsonProperty("dateOfTransaction")
  private String dateOfTransaction = null;

  @JsonProperty("teller")
  private String teller = null;

  public BranchRequest branchNo(String branchNo) {
    this.branchNo = branchNo;
    return this;
  }

  /**
   * Get branchNo
   * @return branchNo
   **/
  @Schema(example = "000098", required = true, description = "")
      @NotNull

  @Size(min=6,max=6)   public String getBranchNo() {
    return branchNo;
  }

  public void setBranchNo(String branchNo) {
    this.branchNo = branchNo;
  }

  public BranchRequest dateOfTransaction(String dateOfTransaction) {
    this.dateOfTransaction = dateOfTransaction;
    return this;
  }

  /**
   * Get dateOfTransaction
   * @return dateOfTransaction
   **/
  @Schema(example = "20240401", required = true, description = "")
      @NotNull

  @Pattern(regexp="\\d{4}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])")   public String getDateOfTransaction() {
    return dateOfTransaction;
  }

  public void setDateOfTransaction(String dateOfTransaction) {
    this.dateOfTransaction = dateOfTransaction;
  }

  public BranchRequest teller(String teller) {
    this.teller = teller;
    return this;
  }

  /**
   * Get teller
   * @return teller
   **/
  @Schema(example = "0000000002", description = "")
      @NotNull

  @Size(max=10)   public String getTeller() {
    return teller;
  }

  public void setTeller(String teller) {
    this.teller = teller;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchRequest branchRequest = (BranchRequest) o;
    return Objects.equals(this.branchNo, branchRequest.branchNo) &&
        Objects.equals(this.dateOfTransaction, branchRequest.dateOfTransaction) &&
        Objects.equals(this.teller, branchRequest.teller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchNo, dateOfTransaction, teller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchRequest {\n");
    
    sb.append("    branchNo: ").append(toIndentedString(branchNo)).append("\n");
    sb.append("    dateOfTransaction: ").append(toIndentedString(dateOfTransaction)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
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
