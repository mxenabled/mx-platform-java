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
 * MemberResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberResponse {
  public static final String SERIALIZED_NAME_AGGREGATED_AT = "aggregated_at";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_AT)
  private String aggregatedAt;

  public static final String SERIALIZED_NAME_BACKGROUND_AGGREGATION_IS_DISABLED = "background_aggregation_is_disabled";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_AGGREGATION_IS_DISABLED)
  private Boolean backgroundAggregationIsDisabled;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private String connectionStatus;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTITUTION_CODE = "institution_code";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_CODE)
  private String institutionCode;

  public static final String SERIALIZED_NAME_IS_BEING_AGGREGATED = "is_being_aggregated";
  @SerializedName(SERIALIZED_NAME_IS_BEING_AGGREGATED)
  private Boolean isBeingAggregated;

  public static final String SERIALIZED_NAME_IS_MANAGED_BY_USER = "is_managed_by_user";
  @SerializedName(SERIALIZED_NAME_IS_MANAGED_BY_USER)
  private Boolean isManagedByUser;

  public static final String SERIALIZED_NAME_IS_MANUAL = "is_manual";
  @SerializedName(SERIALIZED_NAME_IS_MANUAL)
  private Boolean isManual;

  public static final String SERIALIZED_NAME_IS_OAUTH = "is_oauth";
  @SerializedName(SERIALIZED_NAME_IS_OAUTH)
  private Boolean isOauth;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_MOST_RECENT_JOB_DETAIL_CODE = "most_recent_job_detail_code";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_JOB_DETAIL_CODE)
  private String mostRecentJobDetailCode;

  public static final String SERIALIZED_NAME_MOST_RECENT_JOB_DETAIL_TEXT = "most_recent_job_detail_text";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_JOB_DETAIL_TEXT)
  private String mostRecentJobDetailText;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OAUTH_WINDOW_URI = "oauth_window_uri";
  @SerializedName(SERIALIZED_NAME_OAUTH_WINDOW_URI)
  private String oauthWindowUri;

  public static final String SERIALIZED_NAME_SUCCESSFULLY_AGGREGATED_AT = "successfully_aggregated_at";
  @SerializedName(SERIALIZED_NAME_SUCCESSFULLY_AGGREGATED_AT)
  private String successfullyAggregatedAt;

  public static final String SERIALIZED_NAME_USE_CASES = "use_cases";
  @SerializedName(SERIALIZED_NAME_USE_CASES)
  private List<String> useCases;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public MemberResponse() {
  }

  public MemberResponse aggregatedAt(String aggregatedAt) {
    
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


  public MemberResponse backgroundAggregationIsDisabled(Boolean backgroundAggregationIsDisabled) {
    
    this.backgroundAggregationIsDisabled = backgroundAggregationIsDisabled;
    return this;
  }

   /**
   * Get backgroundAggregationIsDisabled
   * @return backgroundAggregationIsDisabled
  **/
  @javax.annotation.Nullable
  public Boolean getBackgroundAggregationIsDisabled() {
    return backgroundAggregationIsDisabled;
  }


  public void setBackgroundAggregationIsDisabled(Boolean backgroundAggregationIsDisabled) {
    this.backgroundAggregationIsDisabled = backgroundAggregationIsDisabled;
  }


  public MemberResponse connectionStatus(String connectionStatus) {
    
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


  public MemberResponse guid(String guid) {
    
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


  public MemberResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MemberResponse institutionCode(String institutionCode) {
    
    this.institutionCode = institutionCode;
    return this;
  }

   /**
   * Get institutionCode
   * @return institutionCode
  **/
  @javax.annotation.Nullable
  public String getInstitutionCode() {
    return institutionCode;
  }


  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }


  public MemberResponse isBeingAggregated(Boolean isBeingAggregated) {
    
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


  public MemberResponse isManagedByUser(Boolean isManagedByUser) {
    
    this.isManagedByUser = isManagedByUser;
    return this;
  }

   /**
   * Get isManagedByUser
   * @return isManagedByUser
  **/
  @javax.annotation.Nullable
  public Boolean getIsManagedByUser() {
    return isManagedByUser;
  }


  public void setIsManagedByUser(Boolean isManagedByUser) {
    this.isManagedByUser = isManagedByUser;
  }


  public MemberResponse isManual(Boolean isManual) {
    
    this.isManual = isManual;
    return this;
  }

   /**
   * Get isManual
   * @return isManual
  **/
  @javax.annotation.Nullable
  public Boolean getIsManual() {
    return isManual;
  }


  public void setIsManual(Boolean isManual) {
    this.isManual = isManual;
  }


  public MemberResponse isOauth(Boolean isOauth) {
    
    this.isOauth = isOauth;
    return this;
  }

   /**
   * Get isOauth
   * @return isOauth
  **/
  @javax.annotation.Nullable
  public Boolean getIsOauth() {
    return isOauth;
  }


  public void setIsOauth(Boolean isOauth) {
    this.isOauth = isOauth;
  }


  public MemberResponse metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public MemberResponse mostRecentJobDetailCode(String mostRecentJobDetailCode) {
    
    this.mostRecentJobDetailCode = mostRecentJobDetailCode;
    return this;
  }

   /**
   * Get mostRecentJobDetailCode
   * @return mostRecentJobDetailCode
  **/
  @javax.annotation.Nullable
  public String getMostRecentJobDetailCode() {
    return mostRecentJobDetailCode;
  }


  public void setMostRecentJobDetailCode(String mostRecentJobDetailCode) {
    this.mostRecentJobDetailCode = mostRecentJobDetailCode;
  }


  public MemberResponse mostRecentJobDetailText(String mostRecentJobDetailText) {
    
    this.mostRecentJobDetailText = mostRecentJobDetailText;
    return this;
  }

   /**
   * Get mostRecentJobDetailText
   * @return mostRecentJobDetailText
  **/
  @javax.annotation.Nullable
  public String getMostRecentJobDetailText() {
    return mostRecentJobDetailText;
  }


  public void setMostRecentJobDetailText(String mostRecentJobDetailText) {
    this.mostRecentJobDetailText = mostRecentJobDetailText;
  }


  public MemberResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MemberResponse oauthWindowUri(String oauthWindowUri) {
    
    this.oauthWindowUri = oauthWindowUri;
    return this;
  }

   /**
   * Get oauthWindowUri
   * @return oauthWindowUri
  **/
  @javax.annotation.Nullable
  public String getOauthWindowUri() {
    return oauthWindowUri;
  }


  public void setOauthWindowUri(String oauthWindowUri) {
    this.oauthWindowUri = oauthWindowUri;
  }


  public MemberResponse successfullyAggregatedAt(String successfullyAggregatedAt) {
    
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


  public MemberResponse useCases(List<String> useCases) {
    
    this.useCases = useCases;
    return this;
  }

  public MemberResponse addUseCasesItem(String useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @javax.annotation.Nullable
  public List<String> getUseCases() {
    return useCases;
  }


  public void setUseCases(List<String> useCases) {
    this.useCases = useCases;
  }


  public MemberResponse userGuid(String userGuid) {
    
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @javax.annotation.Nullable
  public String getUserGuid() {
    return userGuid;
  }


  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }


  public MemberResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberResponse memberResponse = (MemberResponse) o;
    return Objects.equals(this.aggregatedAt, memberResponse.aggregatedAt) &&
        Objects.equals(this.backgroundAggregationIsDisabled, memberResponse.backgroundAggregationIsDisabled) &&
        Objects.equals(this.connectionStatus, memberResponse.connectionStatus) &&
        Objects.equals(this.guid, memberResponse.guid) &&
        Objects.equals(this.id, memberResponse.id) &&
        Objects.equals(this.institutionCode, memberResponse.institutionCode) &&
        Objects.equals(this.isBeingAggregated, memberResponse.isBeingAggregated) &&
        Objects.equals(this.isManagedByUser, memberResponse.isManagedByUser) &&
        Objects.equals(this.isManual, memberResponse.isManual) &&
        Objects.equals(this.isOauth, memberResponse.isOauth) &&
        Objects.equals(this.metadata, memberResponse.metadata) &&
        Objects.equals(this.mostRecentJobDetailCode, memberResponse.mostRecentJobDetailCode) &&
        Objects.equals(this.mostRecentJobDetailText, memberResponse.mostRecentJobDetailText) &&
        Objects.equals(this.name, memberResponse.name) &&
        Objects.equals(this.oauthWindowUri, memberResponse.oauthWindowUri) &&
        Objects.equals(this.successfullyAggregatedAt, memberResponse.successfullyAggregatedAt) &&
        Objects.equals(this.useCases, memberResponse.useCases) &&
        Objects.equals(this.userGuid, memberResponse.userGuid) &&
        Objects.equals(this.userId, memberResponse.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedAt, backgroundAggregationIsDisabled, connectionStatus, guid, id, institutionCode, isBeingAggregated, isManagedByUser, isManual, isOauth, metadata, mostRecentJobDetailCode, mostRecentJobDetailText, name, oauthWindowUri, successfullyAggregatedAt, useCases, userGuid, userId);
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
    sb.append("class MemberResponse {\n");
    sb.append("    aggregatedAt: ").append(toIndentedString(aggregatedAt)).append("\n");
    sb.append("    backgroundAggregationIsDisabled: ").append(toIndentedString(backgroundAggregationIsDisabled)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    isBeingAggregated: ").append(toIndentedString(isBeingAggregated)).append("\n");
    sb.append("    isManagedByUser: ").append(toIndentedString(isManagedByUser)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    isOauth: ").append(toIndentedString(isOauth)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mostRecentJobDetailCode: ").append(toIndentedString(mostRecentJobDetailCode)).append("\n");
    sb.append("    mostRecentJobDetailText: ").append(toIndentedString(mostRecentJobDetailText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oauthWindowUri: ").append(toIndentedString(oauthWindowUri)).append("\n");
    sb.append("    successfullyAggregatedAt: ").append(toIndentedString(successfullyAggregatedAt)).append("\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("background_aggregation_is_disabled");
    openapiFields.add("connection_status");
    openapiFields.add("guid");
    openapiFields.add("id");
    openapiFields.add("institution_code");
    openapiFields.add("is_being_aggregated");
    openapiFields.add("is_managed_by_user");
    openapiFields.add("is_manual");
    openapiFields.add("is_oauth");
    openapiFields.add("metadata");
    openapiFields.add("most_recent_job_detail_code");
    openapiFields.add("most_recent_job_detail_text");
    openapiFields.add("name");
    openapiFields.add("oauth_window_uri");
    openapiFields.add("successfully_aggregated_at");
    openapiFields.add("use_cases");
    openapiFields.add("user_guid");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MemberResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MemberResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MemberResponse is not found in the empty JSON string", MemberResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MemberResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MemberResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aggregated_at") != null && !jsonObj.get("aggregated_at").isJsonNull()) && !jsonObj.get("aggregated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregated_at").toString()));
      }
      if ((jsonObj.get("connection_status") != null && !jsonObj.get("connection_status").isJsonNull()) && !jsonObj.get("connection_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_status").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("institution_code") != null && !jsonObj.get("institution_code").isJsonNull()) && !jsonObj.get("institution_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_code").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("most_recent_job_detail_code") != null && !jsonObj.get("most_recent_job_detail_code").isJsonNull()) && !jsonObj.get("most_recent_job_detail_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `most_recent_job_detail_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("most_recent_job_detail_code").toString()));
      }
      if ((jsonObj.get("most_recent_job_detail_text") != null && !jsonObj.get("most_recent_job_detail_text").isJsonNull()) && !jsonObj.get("most_recent_job_detail_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `most_recent_job_detail_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("most_recent_job_detail_text").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("oauth_window_uri") != null && !jsonObj.get("oauth_window_uri").isJsonNull()) && !jsonObj.get("oauth_window_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oauth_window_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oauth_window_uri").toString()));
      }
      if ((jsonObj.get("successfully_aggregated_at") != null && !jsonObj.get("successfully_aggregated_at").isJsonNull()) && !jsonObj.get("successfully_aggregated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successfully_aggregated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successfully_aggregated_at").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("use_cases") != null && !jsonObj.get("use_cases").isJsonNull() && !jsonObj.get("use_cases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_cases` to be an array in the JSON string but got `%s`", jsonObj.get("use_cases").toString()));
      }
      if ((jsonObj.get("user_guid") != null && !jsonObj.get("user_guid").isJsonNull()) && !jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MemberResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MemberResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MemberResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MemberResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MemberResponse>() {
           @Override
           public void write(JsonWriter out, MemberResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MemberResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MemberResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MemberResponse
  * @throws IOException if the JSON string is invalid with respect to MemberResponse
  */
  public static MemberResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MemberResponse.class);
  }

 /**
  * Convert an instance of MemberResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

