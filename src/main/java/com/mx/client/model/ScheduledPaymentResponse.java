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
import java.math.BigDecimal;
import java.util.Arrays;

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
 * ScheduledPaymentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScheduledPaymentResponse {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_IS_COMPLETED = "is_completed";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETED)
  private Boolean isCompleted;

  public static final String SERIALIZED_NAME_IS_RECURRING = "is_recurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_MERCHANT_GUID = "merchant_guid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_GUID)
  private String merchantGuid;

  public static final String SERIALIZED_NAME_OCCURS_ON = "occurs_on";
  @SerializedName(SERIALIZED_NAME_OCCURS_ON)
  private String occursOn;

  public static final String SERIALIZED_NAME_RECURRENCE_DAY = "recurrence_day";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_DAY)
  private Integer recurrenceDay;

  public static final String SERIALIZED_NAME_RECURRENCE_TYPE = "recurrence_type";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_TYPE)
  private String recurrenceType;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public ScheduledPaymentResponse() {
  }

  public ScheduledPaymentResponse amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public ScheduledPaymentResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ScheduledPaymentResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ScheduledPaymentResponse guid(String guid) {
    
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


  public ScheduledPaymentResponse isCompleted(Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

   /**
   * Get isCompleted
   * @return isCompleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsCompleted() {
    return isCompleted;
  }


  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }


  public ScheduledPaymentResponse isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * Get isRecurring
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public ScheduledPaymentResponse merchantGuid(String merchantGuid) {
    
    this.merchantGuid = merchantGuid;
    return this;
  }

   /**
   * Get merchantGuid
   * @return merchantGuid
  **/
  @javax.annotation.Nullable
  public String getMerchantGuid() {
    return merchantGuid;
  }


  public void setMerchantGuid(String merchantGuid) {
    this.merchantGuid = merchantGuid;
  }


  public ScheduledPaymentResponse occursOn(String occursOn) {
    
    this.occursOn = occursOn;
    return this;
  }

   /**
   * Get occursOn
   * @return occursOn
  **/
  @javax.annotation.Nullable
  public String getOccursOn() {
    return occursOn;
  }


  public void setOccursOn(String occursOn) {
    this.occursOn = occursOn;
  }


  public ScheduledPaymentResponse recurrenceDay(Integer recurrenceDay) {
    
    this.recurrenceDay = recurrenceDay;
    return this;
  }

   /**
   * Get recurrenceDay
   * @return recurrenceDay
  **/
  @javax.annotation.Nullable
  public Integer getRecurrenceDay() {
    return recurrenceDay;
  }


  public void setRecurrenceDay(Integer recurrenceDay) {
    this.recurrenceDay = recurrenceDay;
  }


  public ScheduledPaymentResponse recurrenceType(String recurrenceType) {
    
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @javax.annotation.Nullable
  public String getRecurrenceType() {
    return recurrenceType;
  }


  public void setRecurrenceType(String recurrenceType) {
    this.recurrenceType = recurrenceType;
  }


  public ScheduledPaymentResponse transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public ScheduledPaymentResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ScheduledPaymentResponse userGuid(String userGuid) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledPaymentResponse scheduledPaymentResponse = (ScheduledPaymentResponse) o;
    return Objects.equals(this.amount, scheduledPaymentResponse.amount) &&
        Objects.equals(this.createdAt, scheduledPaymentResponse.createdAt) &&
        Objects.equals(this.description, scheduledPaymentResponse.description) &&
        Objects.equals(this.guid, scheduledPaymentResponse.guid) &&
        Objects.equals(this.isCompleted, scheduledPaymentResponse.isCompleted) &&
        Objects.equals(this.isRecurring, scheduledPaymentResponse.isRecurring) &&
        Objects.equals(this.merchantGuid, scheduledPaymentResponse.merchantGuid) &&
        Objects.equals(this.occursOn, scheduledPaymentResponse.occursOn) &&
        Objects.equals(this.recurrenceDay, scheduledPaymentResponse.recurrenceDay) &&
        Objects.equals(this.recurrenceType, scheduledPaymentResponse.recurrenceType) &&
        Objects.equals(this.transactionType, scheduledPaymentResponse.transactionType) &&
        Objects.equals(this.updatedAt, scheduledPaymentResponse.updatedAt) &&
        Objects.equals(this.userGuid, scheduledPaymentResponse.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, description, guid, isCompleted, isRecurring, merchantGuid, occursOn, recurrenceDay, recurrenceType, transactionType, updatedAt, userGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPaymentResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    occursOn: ").append(toIndentedString(occursOn)).append("\n");
    sb.append("    recurrenceDay: ").append(toIndentedString(recurrenceDay)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("guid");
    openapiFields.add("is_completed");
    openapiFields.add("is_recurring");
    openapiFields.add("merchant_guid");
    openapiFields.add("occurs_on");
    openapiFields.add("recurrence_day");
    openapiFields.add("recurrence_type");
    openapiFields.add("transaction_type");
    openapiFields.add("updated_at");
    openapiFields.add("user_guid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScheduledPaymentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScheduledPaymentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduledPaymentResponse is not found in the empty JSON string", ScheduledPaymentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScheduledPaymentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScheduledPaymentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("merchant_guid") != null && !jsonObj.get("merchant_guid").isJsonNull()) && !jsonObj.get("merchant_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_guid").toString()));
      }
      if ((jsonObj.get("occurs_on") != null && !jsonObj.get("occurs_on").isJsonNull()) && !jsonObj.get("occurs_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occurs_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occurs_on").toString()));
      }
      if ((jsonObj.get("recurrence_type") != null && !jsonObj.get("recurrence_type").isJsonNull()) && !jsonObj.get("recurrence_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurrence_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurrence_type").toString()));
      }
      if ((jsonObj.get("transaction_type") != null && !jsonObj.get("transaction_type").isJsonNull()) && !jsonObj.get("transaction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_type").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("user_guid") != null && !jsonObj.get("user_guid").isJsonNull()) && !jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduledPaymentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduledPaymentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduledPaymentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduledPaymentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduledPaymentResponse>() {
           @Override
           public void write(JsonWriter out, ScheduledPaymentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScheduledPaymentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScheduledPaymentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduledPaymentResponse
  * @throws IOException if the JSON string is invalid with respect to ScheduledPaymentResponse
  */
  public static ScheduledPaymentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduledPaymentResponse.class);
  }

 /**
  * Convert an instance of ScheduledPaymentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

