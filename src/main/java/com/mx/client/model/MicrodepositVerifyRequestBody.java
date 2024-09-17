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
import com.mx.client.model.MicrodepositVerifyRequest;
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
 * MicrodepositVerifyRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MicrodepositVerifyRequestBody {
  public static final String SERIALIZED_NAME_MICRO_DEPOSIT = "micro_deposit";
  @SerializedName(SERIALIZED_NAME_MICRO_DEPOSIT)
  private MicrodepositVerifyRequest microDeposit;

  public MicrodepositVerifyRequestBody() {
  }

  public MicrodepositVerifyRequestBody microDeposit(MicrodepositVerifyRequest microDeposit) {
    
    this.microDeposit = microDeposit;
    return this;
  }

   /**
   * Get microDeposit
   * @return microDeposit
  **/
  @javax.annotation.Nullable
  public MicrodepositVerifyRequest getMicroDeposit() {
    return microDeposit;
  }


  public void setMicroDeposit(MicrodepositVerifyRequest microDeposit) {
    this.microDeposit = microDeposit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrodepositVerifyRequestBody microdepositVerifyRequestBody = (MicrodepositVerifyRequestBody) o;
    return Objects.equals(this.microDeposit, microdepositVerifyRequestBody.microDeposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(microDeposit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrodepositVerifyRequestBody {\n");
    sb.append("    microDeposit: ").append(toIndentedString(microDeposit)).append("\n");
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
    openapiFields.add("micro_deposit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MicrodepositVerifyRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MicrodepositVerifyRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MicrodepositVerifyRequestBody is not found in the empty JSON string", MicrodepositVerifyRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MicrodepositVerifyRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MicrodepositVerifyRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `micro_deposit`
      if (jsonObj.get("micro_deposit") != null && !jsonObj.get("micro_deposit").isJsonNull()) {
        MicrodepositVerifyRequest.validateJsonElement(jsonObj.get("micro_deposit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MicrodepositVerifyRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MicrodepositVerifyRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MicrodepositVerifyRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MicrodepositVerifyRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<MicrodepositVerifyRequestBody>() {
           @Override
           public void write(JsonWriter out, MicrodepositVerifyRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MicrodepositVerifyRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MicrodepositVerifyRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MicrodepositVerifyRequestBody
  * @throws IOException if the JSON string is invalid with respect to MicrodepositVerifyRequestBody
  */
  public static MicrodepositVerifyRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MicrodepositVerifyRequestBody.class);
  }

 /**
  * Convert an instance of MicrodepositVerifyRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

