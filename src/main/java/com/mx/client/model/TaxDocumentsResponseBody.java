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
import com.mx.client.model.TaxDocumentResponse;
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
 * TaxDocumentsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaxDocumentsResponseBody {
  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public static final String SERIALIZED_NAME_TAX_DOCUMENTS = "tax_documents";
  @SerializedName(SERIALIZED_NAME_TAX_DOCUMENTS)
  private List<TaxDocumentResponse> taxDocuments;

  public TaxDocumentsResponseBody() {
  }

  public TaxDocumentsResponseBody pagination(PaginationResponse pagination) {
    
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


  public TaxDocumentsResponseBody taxDocuments(List<TaxDocumentResponse> taxDocuments) {
    
    this.taxDocuments = taxDocuments;
    return this;
  }

  public TaxDocumentsResponseBody addTaxDocumentsItem(TaxDocumentResponse taxDocumentsItem) {
    if (this.taxDocuments == null) {
      this.taxDocuments = new ArrayList<>();
    }
    this.taxDocuments.add(taxDocumentsItem);
    return this;
  }

   /**
   * Get taxDocuments
   * @return taxDocuments
  **/
  @javax.annotation.Nullable
  public List<TaxDocumentResponse> getTaxDocuments() {
    return taxDocuments;
  }


  public void setTaxDocuments(List<TaxDocumentResponse> taxDocuments) {
    this.taxDocuments = taxDocuments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDocumentsResponseBody taxDocumentsResponseBody = (TaxDocumentsResponseBody) o;
    return Objects.equals(this.pagination, taxDocumentsResponseBody.pagination) &&
        Objects.equals(this.taxDocuments, taxDocumentsResponseBody.taxDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, taxDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDocumentsResponseBody {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    taxDocuments: ").append(toIndentedString(taxDocuments)).append("\n");
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
    openapiFields.add("pagination");
    openapiFields.add("tax_documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaxDocumentsResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxDocumentsResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxDocumentsResponseBody is not found in the empty JSON string", TaxDocumentsResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxDocumentsResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxDocumentsResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pagination`
      if (jsonObj.get("pagination") != null && !jsonObj.get("pagination").isJsonNull()) {
        PaginationResponse.validateJsonElement(jsonObj.get("pagination"));
      }
      if (jsonObj.get("tax_documents") != null && !jsonObj.get("tax_documents").isJsonNull()) {
        JsonArray jsonArraytaxDocuments = jsonObj.getAsJsonArray("tax_documents");
        if (jsonArraytaxDocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tax_documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tax_documents` to be an array in the JSON string but got `%s`", jsonObj.get("tax_documents").toString()));
          }

          // validate the optional field `tax_documents` (array)
          for (int i = 0; i < jsonArraytaxDocuments.size(); i++) {
            TaxDocumentResponse.validateJsonElement(jsonArraytaxDocuments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxDocumentsResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxDocumentsResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxDocumentsResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxDocumentsResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxDocumentsResponseBody>() {
           @Override
           public void write(JsonWriter out, TaxDocumentsResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxDocumentsResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxDocumentsResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxDocumentsResponseBody
  * @throws IOException if the JSON string is invalid with respect to TaxDocumentsResponseBody
  */
  public static TaxDocumentsResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxDocumentsResponseBody.class);
  }

 /**
  * Convert an instance of TaxDocumentsResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

