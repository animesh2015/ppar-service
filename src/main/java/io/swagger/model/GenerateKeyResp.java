package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenerateKeyResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class GenerateKeyResp   {
  @JsonProperty("keyName")
  private String keyName = null;

  @JsonProperty("runningNo")
  private Integer runningNo = null;

  @JsonProperty("key")
  private String key = null;

  public GenerateKeyResp keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
   **/
  @Schema(description = "")
      @NotNull

    public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public GenerateKeyResp runningNo(Integer runningNo) {
    this.runningNo = runningNo;
    return this;
  }

  /**
   * Get runningNo
   * @return runningNo
   **/
  @Schema(description = "")
      @NotNull

    public Integer getRunningNo() {
    return runningNo;
  }

  public void setRunningNo(Integer runningNo) {
    this.runningNo = runningNo;
  }

  public GenerateKeyResp key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @Schema(description = "")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateKeyResp generateKeyResp = (GenerateKeyResp) o;
    return Objects.equals(this.keyName, generateKeyResp.keyName) &&
        Objects.equals(this.runningNo, generateKeyResp.runningNo) &&
        Objects.equals(this.key, generateKeyResp.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, runningNo, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateKeyResp {\n");
    
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    runningNo: ").append(toIndentedString(runningNo)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
