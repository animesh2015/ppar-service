package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DGISResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DGISResponse   {
  @JsonProperty("anyIdNo")
  private String anyIdNo = null;

  @JsonProperty("referenceNo")
  private String referenceNo = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("bblRegistrationId")
  private String bblRegistrationId = null;

  @JsonProperty("itmxRegistrationId")
  private String itmxRegistrationId = null;

  @JsonProperty("itmxResponse")
  private String itmxResponse = null;

  public DGISResponse anyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
    return this;
  }

  /**
   * Get anyIdNo
   * @return anyIdNo
   **/
  @Schema(example = "0000500000000010", description = "")
      @NotNull

  @Size(max=19)   public String getAnyIdNo() {
    return anyIdNo;
  }

  public void setAnyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
  }

  public DGISResponse referenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
    return this;
  }

  /**
   * Get referenceNo
   * @return referenceNo
   **/
  @Schema(example = "009824003038", description = "")
      @NotNull

  @Size(max=14)   public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  public DGISResponse date(String date) {
    this.date = date;
    return this;
  }

  /**
   * YYYYMMDD
   * @return date
   **/
  @Schema(example = "20240515", description = "YYYYMMDD")
      @NotNull

  @Size(max=8)   public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DGISResponse time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 24HHMISS
   * @return time
   **/
  @Schema(example = "172624", description = "24HHMISS")
      @NotNull

  @Size(max=6)   public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public DGISResponse bblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
    return this;
  }

  /**
   * Get bblRegistrationId
   * @return bblRegistrationId
   **/
  @Schema(example = "000002101043", description = "")
      @NotNull

  @Size(max=12)   public String getBblRegistrationId() {
    return bblRegistrationId;
  }

  public void setBblRegistrationId(String bblRegistrationId) {
    this.bblRegistrationId = bblRegistrationId;
  }

  public DGISResponse itmxRegistrationId(String itmxRegistrationId) {
    this.itmxRegistrationId = itmxRegistrationId;
    return this;
  }

  /**
   * Get itmxRegistrationId
   * @return itmxRegistrationId
   **/
  @Schema(example = "100186621097", description = "")
      @NotNull

  @Size(max=12)   public String getItmxRegistrationId() {
    return itmxRegistrationId;
  }

  public void setItmxRegistrationId(String itmxRegistrationId) {
    this.itmxRegistrationId = itmxRegistrationId;
  }

  public DGISResponse itmxResponse(String itmxResponse) {
    this.itmxResponse = itmxResponse;
    return this;
  }

  /**
   * Code + Message
   * @return itmxResponse
   **/
  @Schema(example = "000", description = "Code + Message")
      @NotNull

  @Size(max=100)   public String getItmxResponse() {
    return itmxResponse;
  }

  public void setItmxResponse(String itmxResponse) {
    this.itmxResponse = itmxResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DGISResponse dgISResponse = (DGISResponse) o;
    return Objects.equals(this.anyIdNo, dgISResponse.anyIdNo) &&
        Objects.equals(this.referenceNo, dgISResponse.referenceNo) &&
        Objects.equals(this.date, dgISResponse.date) &&
        Objects.equals(this.time, dgISResponse.time) &&
        Objects.equals(this.bblRegistrationId, dgISResponse.bblRegistrationId) &&
        Objects.equals(this.itmxRegistrationId, dgISResponse.itmxRegistrationId) &&
        Objects.equals(this.itmxResponse, dgISResponse.itmxResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyIdNo, referenceNo, date, time, bblRegistrationId, itmxRegistrationId, itmxResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DGISResponse {\n");
    
    sb.append("    anyIdNo: ").append(toIndentedString(anyIdNo)).append("\n");
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    bblRegistrationId: ").append(toIndentedString(bblRegistrationId)).append("\n");
    sb.append("    itmxRegistrationId: ").append(toIndentedString(itmxRegistrationId)).append("\n");
    sb.append("    itmxResponse: ").append(toIndentedString(itmxResponse)).append("\n");
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
