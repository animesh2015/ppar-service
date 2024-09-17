package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChannelHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-02T05:00:53.253103048Z[GMT]")


public class ChannelHeader   {
  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("fromTerminalNo")
  private String fromTerminalNo = null;

  @JsonProperty("fromTellerId")
  private String fromTellerId = null;

  @JsonProperty("branchCode")
  private String branchCode = null;

  public ChannelHeader channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * ATM=ATM, IB=IB, MB=MB, BR=BRANCH
   * @return channel
   **/
  @Schema(required = true, description = "ATM=ATM, IB=IB, MB=MB, BR=BRANCH")
      @NotNull

  @Pattern(regexp="ATM|IB|MB|BR|PB|PWEB|SB")   public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public ChannelHeader fromTerminalNo(String fromTerminalNo) {
    this.fromTerminalNo = fromTerminalNo;
    return this;
  }

  /**
   * Get fromTerminalNo
   * @return fromTerminalNo
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Pattern(regexp="\\S") @Size(max=20)   public String getFromTerminalNo() {
    return fromTerminalNo;
  }

  public void setFromTerminalNo(String fromTerminalNo) {
    this.fromTerminalNo = fromTerminalNo;
  }

  public ChannelHeader fromTellerId(String fromTellerId) {
    this.fromTellerId = fromTellerId;
    return this;
  }

  /**
   * Get fromTellerId
   * @return fromTellerId
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=10)   public String getFromTellerId() {
    return fromTellerId;
  }

  public void setFromTellerId(String fromTellerId) {
    this.fromTellerId = fromTellerId;
  }

  public ChannelHeader branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  /**
   * Get branchCode
   * @return branchCode
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Pattern(regexp="\\S") @Size(max=6)   public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelHeader channelHeader = (ChannelHeader) o;
    return Objects.equals(this.channel, channelHeader.channel) &&
        Objects.equals(this.fromTerminalNo, channelHeader.fromTerminalNo) &&
        Objects.equals(this.fromTellerId, channelHeader.fromTellerId) &&
        Objects.equals(this.branchCode, channelHeader.branchCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, fromTerminalNo, fromTellerId, branchCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelHeader {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    fromTerminalNo: ").append(toIndentedString(fromTerminalNo)).append("\n");
    sb.append("    fromTellerId: ").append(toIndentedString(fromTellerId)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
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
