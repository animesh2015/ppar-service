package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AnyIDRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DailyResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class DailyResponse   {
  @JsonProperty("searchKey")
  private String searchKey = null;

  @JsonProperty("numberOfReturn")
  private Integer numberOfReturn = null;

  @JsonProperty("anyIDRecords")
  @Valid
  private List<AnyIDRecord> anyIDRecords = null;

  public DailyResponse searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  /**
   * Get searchKey
   * @return searchKey
   **/
  @Schema(example = "010124000050", description = "")
      @NotNull

    public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  public DailyResponse numberOfReturn(Integer numberOfReturn) {
    this.numberOfReturn = numberOfReturn;
    return this;
  }

  /**
   * Get numberOfReturn
   * @return numberOfReturn
   **/
  @Schema(example = "1", description = "")
      @NotNull

    public Integer getNumberOfReturn() {
    return numberOfReturn;
  }

  public void setNumberOfReturn(Integer numberOfReturn) {
    this.numberOfReturn = numberOfReturn;
  }

  public DailyResponse anyIDRecords(List<AnyIDRecord> anyIDRecords) {
    this.anyIDRecords = anyIDRecords;
    return this;
  }

  public DailyResponse addAnyIDRecordsItem(AnyIDRecord anyIDRecordsItem) {
    if (this.anyIDRecords == null) {
      this.anyIDRecords = new ArrayList<AnyIDRecord>();
    }
    this.anyIDRecords.add(anyIDRecordsItem);
    return this;
  }

  /**
   * Get anyIDRecords
   * @return anyIDRecords
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<AnyIDRecord> getAnyIDRecords() {
    return anyIDRecords;
  }

  public void setAnyIDRecords(List<AnyIDRecord> anyIDRecords) {
    this.anyIDRecords = anyIDRecords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyResponse dailyResponse = (DailyResponse) o;
    return Objects.equals(this.searchKey, dailyResponse.searchKey) &&
        Objects.equals(this.numberOfReturn, dailyResponse.numberOfReturn) &&
        Objects.equals(this.anyIDRecords, dailyResponse.anyIDRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKey, numberOfReturn, anyIDRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyResponse {\n");
    
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    numberOfReturn: ").append(toIndentedString(numberOfReturn)).append("\n");
    sb.append("    anyIDRecords: ").append(toIndentedString(anyIDRecords)).append("\n");
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
