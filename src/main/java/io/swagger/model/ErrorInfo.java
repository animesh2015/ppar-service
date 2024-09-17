package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class ErrorInfo   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  public ErrorInfo errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   **/
  @Schema(description = "")
      @NotNull

    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorInfo errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @Schema(example = "350000E888Invalid data", description = "")
      @NotNull

    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorInfo errorInfo = (ErrorInfo) o;
    return Objects.equals(this.errorCode, errorInfo.errorCode) &&
        Objects.equals(this.errorMessage, errorInfo.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
