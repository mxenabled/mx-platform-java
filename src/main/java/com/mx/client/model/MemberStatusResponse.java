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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mx.client.model.ChallengeResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mx.client.JSON;

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
  private List<ChallengeResponse> challenges;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private String connectionStatus;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_HAS_PROCESSED_ACCOUNTS = "has_processed_accounts";
  @SerializedName(SERIALIZED_NAME_HAS_PROCESSED_ACCOUNTS)
  private Boolean hasProcessedAccounts;

  public static final String SERIALIZED_NAME_HAS_PROCESSED_ACCOUNT_NUMBERS = "has_processed_account_numbers";
  @SerializedName(SERIALIZED_NAME_HAS_PROCESSED_ACCOUNT_NUMBERS)
  private Boolean hasProcessedAccountNumbers;

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
      this.challenges = new ArrayList<>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * Get challenges
   * @return challenges
  **/
  @javax.annotation.Nullable
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
  public Boolean getHasProcessedAccounts() {
    return hasProcessedAccounts;
  }


  public void setHasProcessedAccounts(Boolean hasProcessedAccounts) {
    this.hasProcessedAccounts = hasProcessedAccounts;
  }


  public MemberStatusResponse hasProcessedAccountNumbers(Boolean hasProcessedAccountNumbers) {
    
    this.hasProcessedAccountNumbers = hasProcessedAccountNumbers;
    return this;
  }

   /**
   * Get hasProcessedAccountNumbers
   * @return hasProcessedAccountNumbers
  **/
  @javax.annotation.Nullable
  public Boolean getHasProcessedAccountNumbers() {
    return hasProcessedAccountNumbers;
  }


  public void setHasProcessedAccountNumbers(Boolean hasProcessedAccountNumbers) {
    this.hasProcessedAccountNumbers = hasProcessedAccountNumbers;
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
        Objects.equals(this.hasProcessedAccountNumbers, memberStatusResponse.hasProcessedAccountNumbers) &&
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
    return Objects.hash(aggregatedAt, challenges, connectionStatus, guid, hasProcessedAccounts, hasProcessedAccountNumbers, hasProcessedTransactions, isAuthenticated, isBeingAggregated, successfullyAggregatedAt);
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
    sb.append("    hasProcessedAccountNumbers: ").append(toIndentedString(hasProcessedAccountNumbers)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aggregated_at");
    openapiFields.add("challenges");
    openapiFields.add("connection_status");
    openapiFields.add("guid");
    openapiFields.add("has_processed_accounts");
    openapiFields.add("has_processed_account_numbers");
    openapiFields.add("has_processed_transactions");
    openapiFields.add("is_authenticated");
    openapiFields.add("is_being_aggregated");
    openapiFields.add("successfully_aggregated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MemberStatusResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MemberStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MemberStatusResponse is not found in the empty JSON string", MemberStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MemberStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MemberStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aggregated_at") != null && !jsonObj.get("aggregated_at").isJsonNull()) && !jsonObj.get("aggregated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregated_at").toString()));
      }
      if (jsonObj.get("challenges") != null && !jsonObj.get("challenges").isJsonNull()) {
        JsonArray jsonArraychallenges = jsonObj.getAsJsonArray("challenges");
        if (jsonArraychallenges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("challenges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `challenges` to be an array in the JSON string but got `%s`", jsonObj.get("challenges").toString()));
          }

          // validate the optional field `challenges` (array)
          for (int i = 0; i < jsonArraychallenges.size(); i++) {
            ChallengeResponse.validateJsonElement(jsonArraychallenges.get(i));
          };
        }
      }
      if ((jsonObj.get("connection_status") != null && !jsonObj.get("connection_status").isJsonNull()) && !jsonObj.get("connection_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_status").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("successfully_aggregated_at") != null && !jsonObj.get("successfully_aggregated_at").isJsonNull()) && !jsonObj.get("successfully_aggregated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successfully_aggregated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successfully_aggregated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MemberStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MemberStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MemberStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MemberStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MemberStatusResponse>() {
           @Override
           public void write(JsonWriter out, MemberStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MemberStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MemberStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MemberStatusResponse
  * @throws IOException if the JSON string is invalid with respect to MemberStatusResponse
  */
  public static MemberStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MemberStatusResponse.class);
  }

 /**
  * Convert an instance of MemberStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

