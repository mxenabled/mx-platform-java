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
 * TaxDocumentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaxDocumentResponse {
  public static final String SERIALIZED_NAME_CONTENT_HASH = "content_hash";
  @SerializedName(SERIALIZED_NAME_CONTENT_HASH)
  private String contentHash;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_ISSUED_ON = "issued_on";
  @SerializedName(SERIALIZED_NAME_ISSUED_ON)
  private String issuedOn;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_TAX_YEAR = "tax_year";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private String taxYear;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public TaxDocumentResponse() {
  }

  public TaxDocumentResponse contentHash(String contentHash) {
    
    this.contentHash = contentHash;
    return this;
  }

   /**
   * Get contentHash
   * @return contentHash
  **/
  @javax.annotation.Nullable
  public String getContentHash() {
    return contentHash;
  }


  public void setContentHash(String contentHash) {
    this.contentHash = contentHash;
  }


  public TaxDocumentResponse createdAt(String createdAt) {
    
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


  public TaxDocumentResponse documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public TaxDocumentResponse guid(String guid) {
    
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


  public TaxDocumentResponse issuedOn(String issuedOn) {
    
    this.issuedOn = issuedOn;
    return this;
  }

   /**
   * Get issuedOn
   * @return issuedOn
  **/
  @javax.annotation.Nullable
  public String getIssuedOn() {
    return issuedOn;
  }


  public void setIssuedOn(String issuedOn) {
    this.issuedOn = issuedOn;
  }


  public TaxDocumentResponse memberGuid(String memberGuid) {
    
    this.memberGuid = memberGuid;
    return this;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @javax.annotation.Nullable
  public String getMemberGuid() {
    return memberGuid;
  }


  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
  }


  public TaxDocumentResponse taxYear(String taxYear) {
    
    this.taxYear = taxYear;
    return this;
  }

   /**
   * Get taxYear
   * @return taxYear
  **/
  @javax.annotation.Nullable
  public String getTaxYear() {
    return taxYear;
  }


  public void setTaxYear(String taxYear) {
    this.taxYear = taxYear;
  }


  public TaxDocumentResponse updatedAt(String updatedAt) {
    
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


  public TaxDocumentResponse uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public TaxDocumentResponse userGuid(String userGuid) {
    
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
    TaxDocumentResponse taxDocumentResponse = (TaxDocumentResponse) o;
    return Objects.equals(this.contentHash, taxDocumentResponse.contentHash) &&
        Objects.equals(this.createdAt, taxDocumentResponse.createdAt) &&
        Objects.equals(this.documentType, taxDocumentResponse.documentType) &&
        Objects.equals(this.guid, taxDocumentResponse.guid) &&
        Objects.equals(this.issuedOn, taxDocumentResponse.issuedOn) &&
        Objects.equals(this.memberGuid, taxDocumentResponse.memberGuid) &&
        Objects.equals(this.taxYear, taxDocumentResponse.taxYear) &&
        Objects.equals(this.updatedAt, taxDocumentResponse.updatedAt) &&
        Objects.equals(this.uri, taxDocumentResponse.uri) &&
        Objects.equals(this.userGuid, taxDocumentResponse.userGuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentHash, createdAt, documentType, guid, issuedOn, memberGuid, taxYear, updatedAt, uri, userGuid);
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
    sb.append("class TaxDocumentResponse {\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("content_hash");
    openapiFields.add("created_at");
    openapiFields.add("document_type");
    openapiFields.add("guid");
    openapiFields.add("issued_on");
    openapiFields.add("member_guid");
    openapiFields.add("tax_year");
    openapiFields.add("updated_at");
    openapiFields.add("uri");
    openapiFields.add("user_guid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaxDocumentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxDocumentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxDocumentResponse is not found in the empty JSON string", TaxDocumentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxDocumentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxDocumentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content_hash") != null && !jsonObj.get("content_hash").isJsonNull()) && !jsonObj.get("content_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_hash").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) && !jsonObj.get("document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_type").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("issued_on") != null && !jsonObj.get("issued_on").isJsonNull()) && !jsonObj.get("issued_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_on").toString()));
      }
      if ((jsonObj.get("member_guid") != null && !jsonObj.get("member_guid").isJsonNull()) && !jsonObj.get("member_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_guid").toString()));
      }
      if ((jsonObj.get("tax_year") != null && !jsonObj.get("tax_year").isJsonNull()) && !jsonObj.get("tax_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_year").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("user_guid") != null && !jsonObj.get("user_guid").isJsonNull()) && !jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxDocumentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxDocumentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxDocumentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxDocumentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxDocumentResponse>() {
           @Override
           public void write(JsonWriter out, TaxDocumentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxDocumentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxDocumentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxDocumentResponse
  * @throws IOException if the JSON string is invalid with respect to TaxDocumentResponse
  */
  public static TaxDocumentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxDocumentResponse.class);
  }

 /**
  * Convert an instance of TaxDocumentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

