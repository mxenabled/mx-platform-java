/*
 * MX Platform API
 * The MX Platform API is a powerful, fully-featured API designed to make aggregating and enhancing financial data easy and reliable. It can seamlessly connect your app or website to tens of thousands of financial institutions.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mx.client.model.ChallengeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MemberStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberStatusResponse {
  public static final String SERIALIZED_NAME_AGGREGATED_AT = "aggregated_at";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_AT)
  private String aggregatedAt;

  public static final String SERIALIZED_NAME_CHALLENGES = "challenges";
  @SerializedName(SERIALIZED_NAME_CHALLENGES)
  private List<ChallengeResponse> challenges = null;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private String connectionStatus;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_HAS_PROCESSED_ACCOUNTS = "has_processed_accounts";
  @SerializedName(SERIALIZED_NAME_HAS_PROCESSED_ACCOUNTS)
  private Boolean hasProcessedAccounts;

  public static final String SERIALIZED_NAME_HAS_PROCESSED_TRANSACTIONS = "has_processed_transactions";
  @SerializedName(SERIALIZED_NAME_HAS_PROCESSED_TRANSACTIONS)
  private Boolean hasProcessedTransactions;

  public static final String SERIALIZED_NAME_IS_AUTHENTICATED = "is_authenticated";
  @SerializedName(SERIALIZED_NAME_IS_AUTHENTICATED)
  private Boolean isAuthenticated;

  public static final String SERIALIZED_NAME_IS_BEING_AGGREGATED = "is_being_aggregated";
  @SerializedName(SERIALIZED_NAME_IS_BEING_AGGREGATED)
  private Boolean isBeingAggregated;

  public static final String SERIALIZED_NAME_SUCCESSFULLY_AGGREGATED_AT = "successfully_aggregated_at";
  @SerializedName(SERIALIZED_NAME_SUCCESSFULLY_AGGREGATED_AT)
  private String successfullyAggregatedAt;

  public MemberStatusResponse() { 
  }

  public MemberStatusResponse aggregatedAt(String aggregatedAt) {
    
    this.aggregatedAt = aggregatedAt;
    return this;
  }

   /**
   * Get aggregatedAt
   * @return aggregatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T18:07:57.000Z", value = "")

  public String getAggregatedAt() {
    return aggregatedAt;
  }


  public void setAggregatedAt(String aggregatedAt) {
    this.aggregatedAt = aggregatedAt;
  }


  public MemberStatusResponse challenges(List<ChallengeResponse> challenges) {
    
    this.challenges = challenges;
    return this;
  }

  public MemberStatusResponse addChallengesItem(ChallengeResponse challengesItem) {
    if (this.challenges == null) {
      this.challenges = new ArrayList<ChallengeResponse>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * Get challenges
   * @return challenges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChallengeResponse> getChallenges() {
    return challenges;
  }


  public void setChallenges(List<ChallengeResponse> challenges) {
    this.challenges = challenges;
  }


  public MemberStatusResponse connectionStatus(String connectionStatus) {
    
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONNECTED", value = "")

  public String getConnectionStatus() {
    return connectionStatus;
  }


  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public MemberStatusResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public MemberStatusResponse hasProcessedAccounts(Boolean hasProcessedAccounts) {
    
    this.hasProcessedAccounts = hasProcessedAccounts;
    return this;
  }

   /**
   * Get hasProcessedAccounts
   * @return hasProcessedAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasProcessedAccounts() {
    return hasProcessedAccounts;
  }


  public void setHasProcessedAccounts(Boolean hasProcessedAccounts) {
    this.hasProcessedAccounts = hasProcessedAccounts;
  }


  public MemberStatusResponse hasProcessedTransactions(Boolean hasProcessedTransactions) {
    
    this.hasProcessedTransactions = hasProcessedTransactions;
    return this;
  }

   /**
   * Get hasProcessedTransactions
   * @return hasProcessedTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getHasProcessedTransactions() {
    return hasProcessedTransactions;
  }


  public void setHasProcessedTransactions(Boolean hasProcessedTransactions) {
    this.hasProcessedTransactions = hasProcessedTransactions;
  }


  public MemberStatusResponse isAuthenticated(Boolean isAuthenticated) {
    
    this.isAuthenticated = isAuthenticated;
    return this;
  }

   /**
   * Get isAuthenticated
   * @return isAuthenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }


  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }


  public MemberStatusResponse isBeingAggregated(Boolean isBeingAggregated) {
    
    this.isBeingAggregated = isBeingAggregated;
    return this;
  }

   /**
   * Get isBeingAggregated
   * @return isBeingAggregated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsBeingAggregated() {
    return isBeingAggregated;
  }


  public void setIsBeingAggregated(Boolean isBeingAggregated) {
    this.isBeingAggregated = isBeingAggregated;
  }


  public MemberStatusResponse successfullyAggregatedAt(String successfullyAggregatedAt) {
    
    this.successfullyAggregatedAt = successfullyAggregatedAt;
    return this;
  }

   /**
   * Get successfullyAggregatedAt
   * @return successfullyAggregatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T17:57:38.000Z", value = "")

  public String getSuccessfullyAggregatedAt() {
    return successfullyAggregatedAt;
  }


  public void setSuccessfullyAggregatedAt(String successfullyAggregatedAt) {
    this.successfullyAggregatedAt = successfullyAggregatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberStatusResponse memberStatusResponse = (MemberStatusResponse) o;
    return Objects.equals(this.aggregatedAt, memberStatusResponse.aggregatedAt) &&
        Objects.equals(this.challenges, memberStatusResponse.challenges) &&
        Objects.equals(this.connectionStatus, memberStatusResponse.connectionStatus) &&
        Objects.equals(this.guid, memberStatusResponse.guid) &&
        Objects.equals(this.hasProcessedAccounts, memberStatusResponse.hasProcessedAccounts) &&
        Objects.equals(this.hasProcessedTransactions, memberStatusResponse.hasProcessedTransactions) &&
        Objects.equals(this.isAuthenticated, memberStatusResponse.isAuthenticated) &&
        Objects.equals(this.isBeingAggregated, memberStatusResponse.isBeingAggregated) &&
        Objects.equals(this.successfullyAggregatedAt, memberStatusResponse.successfullyAggregatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedAt, challenges, connectionStatus, guid, hasProcessedAccounts, hasProcessedTransactions, isAuthenticated, isBeingAggregated, successfullyAggregatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberStatusResponse {\n");
    sb.append("    aggregatedAt: ").append(toIndentedString(aggregatedAt)).append("\n");
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hasProcessedAccounts: ").append(toIndentedString(hasProcessedAccounts)).append("\n");
    sb.append("    hasProcessedTransactions: ").append(toIndentedString(hasProcessedTransactions)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
    sb.append("    isBeingAggregated: ").append(toIndentedString(isBeingAggregated)).append("\n");
    sb.append("    successfullyAggregatedAt: ").append(toIndentedString(successfullyAggregatedAt)).append("\n");
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

