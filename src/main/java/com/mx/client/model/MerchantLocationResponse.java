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
 * MerchantLocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantLocationResponse {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_MERCHANT_GUID = "merchant_guid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_GUID)
  private String merchantGuid;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "street_address";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public MerchantLocationResponse() {
  }

  public MerchantLocationResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public MerchantLocationResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public MerchantLocationResponse createdAt(String createdAt) {
    
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


  public MerchantLocationResponse guid(String guid) {
    
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


  public MerchantLocationResponse latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public MerchantLocationResponse longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public MerchantLocationResponse merchantGuid(String merchantGuid) {
    
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


  public MerchantLocationResponse phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public MerchantLocationResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public MerchantLocationResponse state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public MerchantLocationResponse streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public MerchantLocationResponse updatedAt(String updatedAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLocationResponse merchantLocationResponse = (MerchantLocationResponse) o;
    return Objects.equals(this.city, merchantLocationResponse.city) &&
        Objects.equals(this.country, merchantLocationResponse.country) &&
        Objects.equals(this.createdAt, merchantLocationResponse.createdAt) &&
        Objects.equals(this.guid, merchantLocationResponse.guid) &&
        Objects.equals(this.latitude, merchantLocationResponse.latitude) &&
        Objects.equals(this.longitude, merchantLocationResponse.longitude) &&
        Objects.equals(this.merchantGuid, merchantLocationResponse.merchantGuid) &&
        Objects.equals(this.phoneNumber, merchantLocationResponse.phoneNumber) &&
        Objects.equals(this.postalCode, merchantLocationResponse.postalCode) &&
        Objects.equals(this.state, merchantLocationResponse.state) &&
        Objects.equals(this.streetAddress, merchantLocationResponse.streetAddress) &&
        Objects.equals(this.updatedAt, merchantLocationResponse.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, createdAt, guid, latitude, longitude, merchantGuid, phoneNumber, postalCode, state, streetAddress, updatedAt);
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
    sb.append("class MerchantLocationResponse {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("created_at");
    openapiFields.add("guid");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("merchant_guid");
    openapiFields.add("phone_number");
    openapiFields.add("postal_code");
    openapiFields.add("state");
    openapiFields.add("street_address");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MerchantLocationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MerchantLocationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantLocationResponse is not found in the empty JSON string", MerchantLocationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MerchantLocationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantLocationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("merchant_guid") != null && !jsonObj.get("merchant_guid").isJsonNull()) && !jsonObj.get("merchant_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_guid").toString()));
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("street_address") != null && !jsonObj.get("street_address").isJsonNull()) && !jsonObj.get("street_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_address").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantLocationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantLocationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantLocationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantLocationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantLocationResponse>() {
           @Override
           public void write(JsonWriter out, MerchantLocationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantLocationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantLocationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantLocationResponse
  * @throws IOException if the JSON string is invalid with respect to MerchantLocationResponse
  */
  public static MerchantLocationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantLocationResponse.class);
  }

 /**
  * Convert an instance of MerchantLocationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

