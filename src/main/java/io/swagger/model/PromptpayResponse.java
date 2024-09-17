package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AnyIDList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromptpayResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class PromptpayResponse   {
  @JsonProperty("searchKey")
  private String searchKey = null;

  @JsonProperty("numberOfReturn")
  private Integer numberOfReturn = null;

  @JsonProperty("anyIDLists")
  @Valid
  private List<AnyIDList> anyIDLists = null;

  public PromptpayResponse searchKey(String searchKey) {
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

  public PromptpayResponse numberOfReturn(Integer numberOfReturn) {
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

  public PromptpayResponse anyIDLists(List<AnyIDList> anyIDLists) {
    this.anyIDLists = anyIDLists;
    return this;
  }

  public PromptpayResponse addAnyIDListsItem(AnyIDList anyIDListsItem) {
    if (this.anyIDLists == null) {
      this.anyIDLists = new ArrayList<AnyIDList>();
    }
    this.anyIDLists.add(anyIDListsItem);
    return this;
  }

  /**
   * Get anyIDLists
   * @return anyIDLists
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<AnyIDList> getAnyIDLists() {
    return anyIDLists;
  }

  public void setAnyIDLists(List<AnyIDList> anyIDLists) {
    this.anyIDLists = anyIDLists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptpayResponse promptpayResponse = (PromptpayResponse) o;
    return Objects.equals(this.searchKey, promptpayResponse.searchKey) &&
        Objects.equals(this.numberOfReturn, promptpayResponse.numberOfReturn) &&
        Objects.equals(this.anyIDLists, promptpayResponse.anyIDLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKey, numberOfReturn, anyIDLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptpayResponse {\n");
    
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    numberOfReturn: ").append(toIndentedString(numberOfReturn)).append("\n");
    sb.append("    anyIDLists: ").append(toIndentedString(anyIDLists)).append("\n");
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
