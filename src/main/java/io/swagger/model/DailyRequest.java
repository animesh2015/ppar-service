package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DailyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DailyRequest   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("teller")
  private String teller = null;

  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("noOfRequest")
  private Integer noOfRequest = null;

  @JsonProperty("searchKey")
  private String searchKey = null;

  public DailyRequest date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "20240411", required = true, description = "")
      @NotNull

  @Pattern(regexp="\\d{4}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])")   public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DailyRequest branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   **/
  @Schema(example = "000098", required = true, description = "")
      @NotNull

  @Size(min=6,max=6)   public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public DailyRequest teller(String teller) {
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

  public DailyRequest transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
   **/
  @Schema(example = "3", required = true, description = "")
      @NotNull

  @Pattern(regexp="1|2|3")   public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public DailyRequest noOfRequest(Integer noOfRequest) {
    this.noOfRequest = noOfRequest;
    return this;
  }

  /**
   * Get noOfRequest
   * minimum: 1
   * @return noOfRequest
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

  @Min(1)  public Integer getNoOfRequest() {
    return noOfRequest;
  }

  public void setNoOfRequest(Integer noOfRequest) {
    this.noOfRequest = noOfRequest;
  }

  public DailyRequest searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  /**
   * Get searchKey
   * @return searchKey
   **/
  @Schema(example = "010124000050", description = "")
      @NotNull

  @Size(max=50)   public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyRequest dailyRequest = (DailyRequest) o;
    return Objects.equals(this.date, dailyRequest.date) &&
        Objects.equals(this.branch, dailyRequest.branch) &&
        Objects.equals(this.teller, dailyRequest.teller) &&
        Objects.equals(this.transactionType, dailyRequest.transactionType) &&
        Objects.equals(this.noOfRequest, dailyRequest.noOfRequest) &&
        Objects.equals(this.searchKey, dailyRequest.searchKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, branch, teller, transactionType, noOfRequest, searchKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    noOfRequest: ").append(toIndentedString(noOfRequest)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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
