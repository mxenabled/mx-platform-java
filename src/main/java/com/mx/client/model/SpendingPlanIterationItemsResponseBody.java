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
import com.mx.client.model.PaginationResponse;
import com.mx.client.model.SpendingPlanIterationItemResponse;
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
 * SpendingPlanIterationItemsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpendingPlanIterationItemsResponseBody {
  public static final String SERIALIZED_NAME_ITERATION_ITEMS = "iteration_items";
  @SerializedName(SERIALIZED_NAME_ITERATION_ITEMS)
  private List<SpendingPlanIterationItemResponse> iterationItems;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public SpendingPlanIterationItemsResponseBody() {
  }

  public SpendingPlanIterationItemsResponseBody iterationItems(List<SpendingPlanIterationItemResponse> iterationItems) {
    
    this.iterationItems = iterationItems;
    return this;
  }

  public SpendingPlanIterationItemsResponseBody addIterationItemsItem(SpendingPlanIterationItemResponse iterationItemsItem) {
    if (this.iterationItems == null) {
      this.iterationItems = new ArrayList<>();
    }
    this.iterationItems.add(iterationItemsItem);
    return this;
  }

   /**
   * Get iterationItems
   * @return iterationItems
  **/
  @javax.annotation.Nullable
  public List<SpendingPlanIterationItemResponse> getIterationItems() {
    return iterationItems;
  }


  public void setIterationItems(List<SpendingPlanIterationItemResponse> iterationItems) {
    this.iterationItems = iterationItems;
  }


  public SpendingPlanIterationItemsResponseBody pagination(PaginationResponse pagination) {
    
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
    SpendingPlanIterationItemsResponseBody spendingPlanIterationItemsResponseBody = (SpendingPlanIterationItemsResponseBody) o;
    return Objects.equals(this.iterationItems, spendingPlanIterationItemsResponseBody.iterationItems) &&
        Objects.equals(this.pagination, spendingPlanIterationItemsResponseBody.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterationItems, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingPlanIterationItemsResponseBody {\n");
    sb.append("    iterationItems: ").append(toIndentedString(iterationItems)).append("\n");
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
    openapiFields.add("iteration_items");
    openapiFields.add("pagination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpendingPlanIterationItemsResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpendingPlanIterationItemsResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpendingPlanIterationItemsResponseBody is not found in the empty JSON string", SpendingPlanIterationItemsResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpendingPlanIterationItemsResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpendingPlanIterationItemsResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("iteration_items") != null && !jsonObj.get("iteration_items").isJsonNull()) {
        JsonArray jsonArrayiterationItems = jsonObj.getAsJsonArray("iteration_items");
        if (jsonArrayiterationItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("iteration_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `iteration_items` to be an array in the JSON string but got `%s`", jsonObj.get("iteration_items").toString()));
          }

          // validate the optional field `iteration_items` (array)
          for (int i = 0; i < jsonArrayiterationItems.size(); i++) {
            SpendingPlanIterationItemResponse.validateJsonElement(jsonArrayiterationItems.get(i));
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
       if (!SpendingPlanIterationItemsResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpendingPlanIterationItemsResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpendingPlanIterationItemsResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpendingPlanIterationItemsResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SpendingPlanIterationItemsResponseBody>() {
           @Override
           public void write(JsonWriter out, SpendingPlanIterationItemsResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpendingPlanIterationItemsResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpendingPlanIterationItemsResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpendingPlanIterationItemsResponseBody
  * @throws IOException if the JSON string is invalid with respect to SpendingPlanIterationItemsResponseBody
  */
  public static SpendingPlanIterationItemsResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpendingPlanIterationItemsResponseBody.class);
  }

 /**
  * Convert an instance of SpendingPlanIterationItemsResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

