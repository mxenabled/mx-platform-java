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
 * InsightUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InsightUpdateRequest {
  public static final String SERIALIZED_NAME_HAS_BEEN_DISPLAYED = "has_been_displayed";
  @SerializedName(SERIALIZED_NAME_HAS_BEEN_DISPLAYED)
  private Boolean hasBeenDisplayed;

  public static final String SERIALIZED_NAME_IS_DISMISSED = "is_dismissed";
  @SerializedName(SERIALIZED_NAME_IS_DISMISSED)
  private Boolean isDismissed;

  public InsightUpdateRequest() {
  }

  public InsightUpdateRequest hasBeenDisplayed(Boolean hasBeenDisplayed) {
    
    this.hasBeenDisplayed = hasBeenDisplayed;
    return this;
  }

   /**
   * Get hasBeenDisplayed
   * @return hasBeenDisplayed
  **/
  @javax.annotation.Nullable
  public Boolean getHasBeenDisplayed() {
    return hasBeenDisplayed;
  }


  public void setHasBeenDisplayed(Boolean hasBeenDisplayed) {
    this.hasBeenDisplayed = hasBeenDisplayed;
  }


  public InsightUpdateRequest isDismissed(Boolean isDismissed) {
    
    this.isDismissed = isDismissed;
    return this;
  }

   /**
   * Get isDismissed
   * @return isDismissed
  **/
  @javax.annotation.Nullable
  public Boolean getIsDismissed() {
    return isDismissed;
  }


  public void setIsDismissed(Boolean isDismissed) {
    this.isDismissed = isDismissed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightUpdateRequest insightUpdateRequest = (InsightUpdateRequest) o;
    return Objects.equals(this.hasBeenDisplayed, insightUpdateRequest.hasBeenDisplayed) &&
        Objects.equals(this.isDismissed, insightUpdateRequest.isDismissed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasBeenDisplayed, isDismissed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightUpdateRequest {\n");
    sb.append("    hasBeenDisplayed: ").append(toIndentedString(hasBeenDisplayed)).append("\n");
    sb.append("    isDismissed: ").append(toIndentedString(isDismissed)).append("\n");
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
    openapiFields.add("has_been_displayed");
    openapiFields.add("is_dismissed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InsightUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InsightUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightUpdateRequest is not found in the empty JSON string", InsightUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InsightUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InsightUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightUpdateRequest>() {
           @Override
           public void write(JsonWriter out, InsightUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InsightUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InsightUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to InsightUpdateRequest
  */
  public static InsightUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightUpdateRequest.class);
  }

 /**
  * Convert an instance of InsightUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
