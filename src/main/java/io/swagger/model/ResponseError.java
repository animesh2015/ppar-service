package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Error;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class ResponseError   {
  @JsonProperty("isError")
  private String isError = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  public ResponseError isError(String isError) {
    this.isError = isError;
    return this;
  }

  /**
   * Get isError
   * @return isError
   **/
  @Schema(description = "")
      @NotNull

    public String getIsError() {
    return isError;
  }

  public void setIsError(String isError) {
    this.isError = isError;
  }

  public ResponseError errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ResponseError addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(this.isError, responseError.isError) &&
        Objects.equals(this.errors, responseError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isError, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
