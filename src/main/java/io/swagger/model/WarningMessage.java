package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WarningMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class WarningMessage   {
  @JsonProperty("warningValue")
  private String warningValue = null;

  public WarningMessage warningValue(String warningValue) {
    this.warningValue = warningValue;
    return this;
  }

  /**
   * Get warningValue
   * @return warningValue
   **/
  @Schema(example = "หมายเลขโทรศัพท์มือถือไม่ตรงกับหมายเลขที่ให้ไว้กับธนาคาร", description = "")
      @NotNull

  @Size(max=100)   public String getWarningValue() {
    return warningValue;
  }

  public void setWarningValue(String warningValue) {
    this.warningValue = warningValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarningMessage warningMessage = (WarningMessage) o;
    return Objects.equals(this.warningValue, warningMessage.warningValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningMessage {\n");
    
    sb.append("    warningValue: ").append(toIndentedString(warningValue)).append("\n");
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
