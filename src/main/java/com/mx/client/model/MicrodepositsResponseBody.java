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
import com.mx.client.model.MicrodepositResponse;
import com.mx.client.model.PaginationResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * MicrodepositsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MicrodepositsResponseBody {
  public static final String SERIALIZED_NAME_MICRO_DEPOSITS = "micro_deposits";
  @SerializedName(SERIALIZED_NAME_MICRO_DEPOSITS)
  private List<MicrodepositResponse> microDeposits;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public MicrodepositsResponseBody() {
  }

  public MicrodepositsResponseBody microDeposits(List<MicrodepositResponse> microDeposits) {
    
    this.microDeposits = microDeposits;
    return this;
  }

  public MicrodepositsResponseBody addMicroDepositsItem(MicrodepositResponse microDepositsItem) {
    if (this.microDeposits == null) {
      this.microDeposits = new ArrayList<>();
    }
    this.microDeposits.add(microDepositsItem);
    return this;
  }

   /**
   * Get microDeposits
   * @return microDeposits
  **/
  @javax.annotation.Nullable
  public List<MicrodepositResponse> getMicroDeposits() {
    return microDeposits;
  }


  public void setMicroDeposits(List<MicrodepositResponse> microDeposits) {
    this.microDeposits = microDeposits;
  }


  public MicrodepositsResponseBody pagination(PaginationResponse pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  public PaginationResponse getPagination() {
    return pagination;
  }


  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrodepositsResponseBody microdepositsResponseBody = (MicrodepositsResponseBody) o;
    return Objects.equals(this.microDeposits, microdepositsResponseBody.microDeposits) &&
        Objects.equals(this.pagination, microdepositsResponseBody.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(microDeposits, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrodepositsResponseBody {\n");
    sb.append("    microDeposits: ").append(toIndentedString(microDeposits)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
    openapiFields.add("micro_deposits");
    openapiFields.add("pagination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MicrodepositsResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MicrodepositsResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MicrodepositsResponseBody is not found in the empty JSON string", MicrodepositsResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MicrodepositsResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MicrodepositsResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("micro_deposits") != null && !jsonObj.get("micro_deposits").isJsonNull()) {
        JsonArray jsonArraymicroDeposits = jsonObj.getAsJsonArray("micro_deposits");
        if (jsonArraymicroDeposits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("micro_deposits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `micro_deposits` to be an array in the JSON string but got `%s`", jsonObj.get("micro_deposits").toString()));
          }

          // validate the optional field `micro_deposits` (array)
          for (int i = 0; i < jsonArraymicroDeposits.size(); i++) {
            MicrodepositResponse.validateJsonElement(jsonArraymicroDeposits.get(i));
          };
        }
      }
      // validate the optional field `pagination`
      if (jsonObj.get("pagination") != null && !jsonObj.get("pagination").isJsonNull()) {
        PaginationResponse.validateJsonElement(jsonObj.get("pagination"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MicrodepositsResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MicrodepositsResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MicrodepositsResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MicrodepositsResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<MicrodepositsResponseBody>() {
           @Override
           public void write(JsonWriter out, MicrodepositsResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MicrodepositsResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MicrodepositsResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MicrodepositsResponseBody
  * @throws IOException if the JSON string is invalid with respect to MicrodepositsResponseBody
  */
  public static MicrodepositsResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MicrodepositsResponseBody.class);
  }

 /**
  * Convert an instance of MicrodepositsResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

