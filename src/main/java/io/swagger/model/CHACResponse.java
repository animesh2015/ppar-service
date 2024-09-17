package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CHACResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class CHACResponse   {
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

  @JsonProperty("authorizeToProcessCode")
  private String authorizeToProcessCode = null;

  @JsonProperty("needOverride1")
  private String needOverride1 = null;

  @JsonProperty("needOverride2")
  private String needOverride2 = null;

  @JsonProperty("needOverride3")
  private String needOverride3 = null;

  @JsonProperty("needOverride4")
  private String needOverride4 = null;

  @JsonProperty("needOverride5")
  private String needOverride5 = null;

  public CHACResponse anyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
    return this;
  }

  /**
   * Get anyIdNo
   * @return anyIdNo
   **/
  @Schema(example = "0000102211221234", description = "")
      @NotNull

  @Size(max=19)   public String getAnyIdNo() {
    return anyIdNo;
  }

  public void setAnyIdNo(String anyIdNo) {
    this.anyIdNo = anyIdNo;
  }

  public CHACResponse referenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
    return this;
  }

  /**
   * Get referenceNo
   * @return referenceNo
   **/
  @Schema(example = "009824003028", description = "")
      @NotNull

  @Size(max=14)   public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  public CHACResponse date(String date) {
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

  public CHACResponse time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 24HHMISS
   * @return time
   **/
  @Schema(example = "132247", description = "24HHMISS")
      @NotNull

  @Size(max=6)   public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public CHACResponse bblRegistrationId(String bblRegistrationId) {
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

  public CHACResponse authorizeToProcessCode(String authorizeToProcessCode) {
    this.authorizeToProcessCode = authorizeToProcessCode;
    return this;
  }

  /**
   * Get authorizeToProcessCode
   * @return authorizeToProcessCode
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=1)   public String getAuthorizeToProcessCode() {
    return authorizeToProcessCode;
  }

  public void setAuthorizeToProcessCode(String authorizeToProcessCode) {
    this.authorizeToProcessCode = authorizeToProcessCode;
  }

  public CHACResponse needOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
    return this;
  }

  /**
   * possible values = Y, N
   * @return needOverride1
   **/
  @Schema(description = "possible values = Y, N")
      @NotNull

  @Size(max=19)   public String getNeedOverride1() {
    return needOverride1;
  }

  public void setNeedOverride1(String needOverride1) {
    this.needOverride1 = needOverride1;
  }

  public CHACResponse needOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
    return this;
  }

  /**
   * possible values = Y, N
   * @return needOverride2
   **/
  @Schema(description = "possible values = Y, N")
      @NotNull

  @Size(max=19)   public String getNeedOverride2() {
    return needOverride2;
  }

  public void setNeedOverride2(String needOverride2) {
    this.needOverride2 = needOverride2;
  }

  public CHACResponse needOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
    return this;
  }

  /**
   * possible values = Y, N
   * @return needOverride3
   **/
  @Schema(description = "possible values = Y, N")
      @NotNull

  @Size(max=19)   public String getNeedOverride3() {
    return needOverride3;
  }

  public void setNeedOverride3(String needOverride3) {
    this.needOverride3 = needOverride3;
  }

  public CHACResponse needOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
    return this;
  }

  /**
   * possible values = Y, N
   * @return needOverride4
   **/
  @Schema(description = "possible values = Y, N")
      @NotNull

  @Size(max=19)   public String getNeedOverride4() {
    return needOverride4;
  }

  public void setNeedOverride4(String needOverride4) {
    this.needOverride4 = needOverride4;
  }

  public CHACResponse needOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
    return this;
  }

  /**
   * possible values = Y, N
   * @return needOverride5
   **/
  @Schema(description = "possible values = Y, N")
      @NotNull

  @Size(max=19)   public String getNeedOverride5() {
    return needOverride5;
  }

  public void setNeedOverride5(String needOverride5) {
    this.needOverride5 = needOverride5;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CHACResponse chACResponse = (CHACResponse) o;
    return Objects.equals(this.anyIdNo, chACResponse.anyIdNo) &&
        Objects.equals(this.referenceNo, chACResponse.referenceNo) &&
        Objects.equals(this.date, chACResponse.date) &&
        Objects.equals(this.time, chACResponse.time) &&
        Objects.equals(this.bblRegistrationId, chACResponse.bblRegistrationId) &&
        Objects.equals(this.authorizeToProcessCode, chACResponse.authorizeToProcessCode) &&
        Objects.equals(this.needOverride1, chACResponse.needOverride1) &&
        Objects.equals(this.needOverride2, chACResponse.needOverride2) &&
        Objects.equals(this.needOverride3, chACResponse.needOverride3) &&
        Objects.equals(this.needOverride4, chACResponse.needOverride4) &&
        Objects.equals(this.needOverride5, chACResponse.needOverride5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyIdNo, referenceNo, date, time, bblRegistrationId, authorizeToProcessCode, needOverride1, needOverride2, needOverride3, needOverride4, needOverride5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CHACResponse {\n");
    
    sb.append("    anyIdNo: ").append(toIndentedString(anyIdNo)).append("\n");
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    bblRegistrationId: ").append(toIndentedString(bblRegistrationId)).append("\n");
    sb.append("    authorizeToProcessCode: ").append(toIndentedString(authorizeToProcessCode)).append("\n");
    sb.append("    needOverride1: ").append(toIndentedString(needOverride1)).append("\n");
    sb.append("    needOverride2: ").append(toIndentedString(needOverride2)).append("\n");
    sb.append("    needOverride3: ").append(toIndentedString(needOverride3)).append("\n");
    sb.append("    needOverride4: ").append(toIndentedString(needOverride4)).append("\n");
    sb.append("    needOverride5: ").append(toIndentedString(needOverride5)).append("\n");
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
